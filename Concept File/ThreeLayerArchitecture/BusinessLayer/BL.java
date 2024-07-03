package BusinessLayer;

import java.io.File;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DataAccessLayer.DAO;

public class BL {
	
	static DAO dao = new DAO();;	
	private static BL instance = new BL();
	private BL() {
	}
	
	public static BL getobject()
	{
		return instance;
	}
	

	public void createDatabase() throws SQLException {
		dao.createDatabase();
		}
	public void createTable() throws SQLException {
		dao.createTable(dao.dbConnection());
	}
	public void displayFiles(File file) throws SQLException {
		dao.readCsv(dao.dbConnection(),file);
		asalData(file);
	}
	
	public void asalData(File file) throws SQLException {
		dao.asalData(dao.dbConnection(), file);
	}
	
	public void addMeaning(String c1, String c2) throws SQLException {
		dao.addMeanings(dao.dbConnection(),c1, c2);
	}
	
	public void addUpdate(String c1,String c2) throws SQLException {
		dao.updateData(dao.dbConnection(),c1,c2);
	}
	
	public ResultSet Find_like_view(String text) throws SQLException 
	{
		DAO S = new DAO();
		ResultSet rs = null; 
		rs = S.find_like(dao.dbConnection(),text);
		return rs;
	}
	
	public ResultSet Find_search_root(String text) throws SQLException
	{
		DAO S = new DAO();
		ResultSet rs = null; 
		rs = S.find_Root(dao.dbConnection(),text);
		return rs;
	}

	public ResultSet Find_search_view(String text) throws SQLException
	{
		DAO S = new DAO();
		ResultSet rs = null; 
		rs = S.find(dao.dbConnection(),text);
		return rs;
	}



}
