package DataAccessLayer;


import java.io.BufferedReader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.ArrayList;

import com.github.msarhan.lucene.ArabicRootExtractorStemmer;

import BusinessLayer.BL;

public class DAO  {
	
	private String rakam,mashkool,sinf,asal,jinhs,adad,ghairMashkool,ghairAsal,root;
	private String ghairMashkool1,ghairAsal1;
	private String mafoulPath = "E:\\Mafoul.csv";
	private String faeelPath = "E:\\Faeel.csv";
	private String masdarPath = "E:\\Masdar.csv";

	public Connection Connection(String url) throws SQLException {
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url, user, password);
		return con;
	}
	
	public Connection db(String url, String dbName) throws SQLException {
		String user = "root";
		String password = "";
		Connection con = DriverManager.getConnection(url+dbName, user, password);
		return con;
		
	}
	
	public Connection dbConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/";
		String user = "root";
		String password = "";
		String dbName = "dictionary1";
		Connection con = DriverManager.getConnection(url+dbName, user, password);
		return con;
	}
	
	public boolean checkDbExistence(Connection con, String dbName) throws SQLException {
		ResultSet resultSet = con.getMetaData().getCatalogs();
		while(resultSet.next()) {
			String db = resultSet.getString(1);
			if(db.equals(dbName)) {
				return true;
			}
		}
		resultSet.close();
		return false;
	}
	
	public void createDatabase() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/";
		Connection con = Connection(url);
		String dbName = "dictionary1";
		if(checkDbExistence(con,dbName)) {
			System.out.println("Database Already Created\n");
		}
		else {
			String query = "CREATE DATABASE " +dbName;
			PreparedStatement st = con.prepareStatement(query);
			st.execute();
			System.out.print("Database Created Successfully\n");
			con = db(url,dbName);
		}	
	}
	public void createTable(Connection con) throws SQLException {
		String [] str  = {"arabicdata",asal};
		DatabaseMetaData db = con.getMetaData();
		for(int i=0;i<str.length;i++) {
			ResultSet table = db.getTables(null, null, str[i] , null);
			if(table.next()) {
				System.out.println("Table Already Exist\n");
			}
			else {
				System.out.println("Table Not Exit\nTable Creating.....\n");
				String query = "CREATE TABLE ArabicData"  +
		                "(id INTEGER not NULL AUTO_INCREMENT, " +
		                " رقم VARCHAR(50) NULL, " + 
		                " مشكول VARCHAR(50) NULL, " + 	
		                "  صنف VARCHAR(50) NULL, " +
		                " أصل  VARCHAR(50) NULL, " + 
		                " جنس VARCHAR(50) NULL, " + 
		                "  عدد VARCHAR(50) NULL, " +
		                " غیرمشكول VARCHAR(50) NULL, " + 
		                " غیرأصل  VARCHAR(50) NULL, " +
		                " معنی  VARCHAR(50) NULL, " + 
		                " جڑ VARCHAR(50) NULL, " + 
		                " PRIMARY KEY ( id ))"; 
				String query1 = "CREATE TABLE Asal"  +
		                "(id INTEGER not NULL AUTO_INCREMENT, " +
		                " Faeelأصل VARCHAR(50) NULL, " + 	
		                " Masdarأصل VARCHAR(50) NULL, " +
		                " Mafoulأصل VARCHAR(50) NULL, " + 
		                " PRIMARY KEY ( id ), " +
		                " FOREIGN KEY (id) REFERENCES ArabicData (id))";
				Statement st = con.createStatement();
				st.addBatch(query);;
				st.addBatch(query1);
				st.executeBatch();
				}
		}
		
	}

	
	public String stem(String root) {
		ArabicRootExtractorStemmer stemmer = new ArabicRootExtractorStemmer();
		String stem = String.join(",", stemmer.stem(root));
		return stem;
		
	}	
	


	public String normalize(String input){

		input = Normalizer.normalize(input, Form.NFKD).replaceAll("\\p{M}", "");
		return input;
	}


	public void readCsv(Connection con ,File file) throws SQLException {

		String line=" ", splitBy=",";
		String str = null;
		int count=0;
		
		try{
			Reader reader = new InputStreamReader(new FileInputStream(file), "utf-8");
			BufferedReader in = new BufferedReader(reader);
			try {
				while((line=in.readLine()) != null) {
					String[] s = line.split(splitBy);
					if(count != 0) {

						rakam = s[0];
						mashkool = s[1];
						sinf = s[2];
						asal = s[3];
						jinhs = s[4];
						adad = s[5];

						ghairMashkool1 = normalize(mashkool);
						ghairAsal1 = normalize(asal);
						
						ghairMashkool = ghairMashkool1;
						ghairAsal = ghairAsal1;
						
						root = stem(mashkool);
						str = "INSERT INTO ArabicData (رقم , مشكول , صنف , أصل , جنس , عدد , غیرمشكول , غیرأصل , معنی , جڑ) VALUES('"+rakam+"','"+mashkool+"','"+sinf+"','"+asal+"','"+jinhs+"','"+adad+"','"+ghairMashkool+"','"+ghairAsal+"','"+null+"','"+root+"')";
						PreparedStatement st = con.prepareStatement(str);
						st.execute();
					}
					
					count++;
				}
			}

			catch(SQLException e) {
				System.out.println(e);
			}

			in.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void updateData(Connection con, String c1, String c2) {
		try {
			String table = "temp";
			String str = "update ArabicData set جڑ = '"+c1+"' WHERE ( id = '"+c2+"')";
			PreparedStatement st = con.prepareStatement(str);
			st.execute(str);
			con.close();
			
		}	
		catch (Exception e) {System.out.println(e);}

	}

	
	public void addMeanings(Connection con, String c1, String c2) {
		try {
			String str = "UPDATE ArabicData SET معنی = '"+c2+"' WHERE ( غیرأصل = '"+c1+"') OR (  غیرمشكول = '"+c1+"' ) ";
			PreparedStatement st = con.prepareStatement(str);
			st.execute();
			con.close();
			
		}	
		catch (Exception e) {System.out.println(e);}

	}
	
	public ResultSet find(Connection con, String s)
	{
		String temp = s;
		String Query = "SELECT * FROM ArabicData  where غیرمشكول = '"+temp+"' OR معنی = '"+temp+"' OR مشكول = '"+temp+"'";
        ResultSet rs = null;
        try {
        	PreparedStatement ps = null;
        	ps = con.prepareStatement(Query);
            rs = ps.executeQuery();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return rs;
	}
	
	public ResultSet find_like(Connection con , String s)
	{
		String temp = s +"%";
		String query = "SELECT * FROM ArabicData where غیرمشكول LIKE '"+temp+"' OR معنی LIKE '"+temp+"'  OR مشكول LIKE '"+temp+"'";
        ResultSet rs = null;
        try {
        	PreparedStatement ps = null;
        	ps = con.prepareStatement(query);
            rs = ps.executeQuery();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return rs;
	}
	
	public ResultSet find_Root(Connection con, String s)
	{
		String temp = s;
		String Query = "SELECT * FROM ArabicData where جڑ = '"+temp+"'";
        ResultSet rs = null;
        try {
        	PreparedStatement ps = null;
        	ps = con.prepareStatement(Query);
            rs = ps.executeQuery();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return rs;
	}
	
	public void asalData(Connection con, File file) throws SQLException {
		  String line=" ", splitBy=",";
		  int count = 0;
		  String asal_data;
		  try{
				Reader reader = new InputStreamReader(new FileInputStream(file), "utf-8");
				BufferedReader in = new BufferedReader(reader);
				try {
					while((line=in.readLine()) != null) {
						String[] s = line.split(splitBy);
						if(count != 0) {
							asal_data = s[3];
							if(file.getPath().equals(mafoulPath)) {
								String query1 = "INSERT INTO asal(Mafoulأصل) VALUES('"+asal_data+"')";
								PreparedStatement st = con.prepareStatement(query1);
								st.execute();
							}
							else if(file.getPath().equals(faeelPath)) {
								String query2 = "INSERT INTO asal(Faeelأصل) VALUES('"+asal_data+"')";
								PreparedStatement st = con.prepareStatement(query2);
								st.execute();
							}
							else if(file.getPath().equals(masdarPath)) {
								String query3 = "INSERT INTO asal(Masdarأصل) VALUES('"+asal_data+"')";
								PreparedStatement st = con.prepareStatement(query3);
								st.execute();
							}
						}
						count++;
					}
				}

				catch(SQLException e) {
					System.out.println(e);
				}
				in.close();
			}
			catch(IOException e){
				e.printStackTrace();
			}
			
		}
}
