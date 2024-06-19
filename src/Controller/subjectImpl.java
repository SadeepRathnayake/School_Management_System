/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import Model.subject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Util.databaseConnection;

/**
 *
 * @author Sadeep
 */
public class subjectImpl implements Isubject{

	public subjectImpl() {

	}

	public ArrayList<subject> getAllSubject() {

		ArrayList<subject> subjectList = new ArrayList<>();

		PreparedStatement pst;
		ResultSet rs;

		Connection con;
		try {
			con = databaseConnection.getDBConnection();
			try {
				pst = con.prepareStatement("select * from subjects");
				rs = pst.executeQuery();

				while(rs.next()) {

					subject subject = new subject();

					subject.setSubject_ID(rs.getString(1));
					subject.setSubject_Name(rs.getString(2));
					subject.setSubject_Description(rs.getString(3));
					subject.setCredit_Points(rs.getString(4));
					
					subjectList.add(subject);

				}

			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return subjectList;
	} 
}
