/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import Model.student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Util.databaseConnection;

/**
 *
 * @author Sadeep
 */
public class studentImpl implements Istudent{

	public studentImpl() {

	}

	public ArrayList<student> getAllStudent() {

		ArrayList<student> studentList = new ArrayList<>();

		PreparedStatement pst;
		ResultSet rs;

		Connection con;
		try {
			con = databaseConnection.getDBConnection();
			try {
				pst = con.prepareStatement("select * from students");
				rs = pst.executeQuery();

				while(rs.next()) {

					student student = new student();

					student.setStudent_ID(rs.getString(1));
					student.setFull_Name(rs.getString(2));
					student.setBirthday(rs.getString(3));
					student.setGender(rs.getString(4));
					student.setContact(rs.getString(5));
					student.setAddress(rs.getString(6));
					
					studentList.add(student);

				}

			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return studentList;
	} 
}
