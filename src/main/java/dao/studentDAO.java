package dao;

import db.MyConnection;
import models.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class studentDAO {
    public static List<student> getAllUsers() throws SQLException {
        List<student> students = new ArrayList<>();
        Connection conn = MyConnection.getConnection();

        PreparedStatement ps = conn.prepareStatement("select * from student");
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            int id = rs.getInt(1);
            String name  =  rs.getString(2);
            String branch = rs.getString(3);
            String emailId = rs.getString(4);
            student std = new student(id, name, branch, emailId);
            students.add(std);
        }
        return students;
    }

    public static student getUserById(int id) throws SQLException {
        student std = null;
        Connection conn = MyConnection.getConnection();

        PreparedStatement ps = conn.prepareStatement("select * from student where id = ?");
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            int stdid = rs.getInt(1);
            String name  =  rs.getString(2);
            String branch = rs.getString(3);
            String emailId = rs.getString(4);
             std = new student(stdid, name, branch, emailId);

        }
        return std;
    }

    public static boolean checkUser(String email) throws SQLException{

        Connection conn = MyConnection.getConnection();

        PreparedStatement ps = conn.prepareStatement("select * from student where emailId = ?");
        ps.setString(1, email);
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
            if(rs.getString(2 ) != null)
                return true;


        }
        return false;
    }

}
