package it.polito.tdp.Libretto.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import it.polito.tdp.Libretto.model.Esame;

public class EsameDAO {

	public Esame find(String codice){
		String sql= "SELECT codice,titolo,docente,superato,voto,data_superamento " +
					"FROM esame "+
					"WHERE CODICE=?";
		String jdbcURL = "jdbc:mysql://localhost/libretto?user=root&password=chiaretta<3";
		Esame result=null;
		try{
			Connection conn= DriverManager.getConnection(jdbcURL);
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, codice);
			ResultSet res = pst.executeQuery();
			if(res.next()){
				Esame ex = new Esame(res.getString("codice"),res.getString("titolo"),res.getString("docente"));
				result= ex;
			} else
				result=null;
			conn.close();

		} catch(SQLException e){
			e.printStackTrace();
		}
		return result;
	}
	
	public boolean create(Esame e){
		String sql="INSERT INTO `libretto`.`esame` (`codice`, `titolo`, `docente`) VALUES (?, ?, ?)";
		String jdbcURL = "jdbc:mysql://localhost/libretto?user=root&password=chiaretta<3";
		try{
			Connection conn= DriverManager.getConnection(jdbcURL);
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, e.getCodice());
			pst.setString(2, e.getTitolo());
			pst.setString(3, e.getDocente());
			int result = pst.executeUpdate();
			conn.close();
			if(result==1)
				return true;
			else 
				return false;

		} catch(SQLException ex){
			ex.printStackTrace();
		}
		return false;
	}
}
