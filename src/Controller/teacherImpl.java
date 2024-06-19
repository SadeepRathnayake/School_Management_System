/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import Model.teacher;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Util.databaseConnection;

/**
 *
 * @author Sadeep
 */

public class teacherImpl implements Iteacher{
    
    public teacherImpl() {

	}

	public ArrayList<teacher> getAllTeacher() {

		ArrayList<teacher> teacherList = new ArrayList<>();

		PreparedStatement pst;
		ResultSet rs;

		Connection con;
		try {
			con = databaseConnection.getDBConnection();
			try {
				pst = con.prepareStatement("select * from teachers");
				rs = pst.executeQuery();

				while(rs.next()) {

					teacher teacher = new teacher();

					teacher.setTeacher_ID(rs.getString(1));
					teacher.setFull_Name(rs.getString(2));
					teacher.setBirthday(rs.getString(3));
					teacher.setGender(rs.getString(4));
					teacher.setContact(rs.getString(5));
					teacher.setAddress(rs.getString(6));
					
					teacherList.add(teacher);

				}

			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return teacherList;
	}
}
