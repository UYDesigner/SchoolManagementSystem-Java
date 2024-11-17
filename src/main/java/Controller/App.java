package Controller;

import View.Welcome;
import dao.studentDAO;
import models.student;


import java.sql.SQLException;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Welcome w = new Welcome();
        do{
            w.Screen();
        }
        while (true);
    }
}
