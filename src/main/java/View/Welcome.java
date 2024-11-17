package View;

import dao.studentDAO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Scanner;

public class Welcome {

    public void Screen()
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome all baccha log 🙏🙏");
        System.out.println("press 1 to signIn");
        System.out.println("press 2 to logout");
        System.out.println("press 0 to exist");
        int choice = 0;
        try
        {
            choice = Integer.parseInt(br.readLine());
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
        switch (choice)
        {
           case 1 -> signin();
           case 2 -> logout();
           case 0 -> System.exit(0);
        }
    }
    public void logout()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter email");
        String email = sc.nextLine();
        if(email.length() != 0)
        {

            try {
                Boolean ans = studentDAO.checkUser(email);
                System.out.println(ans? "student found" : " not found...");
                if(ans)
                {
                  new StudentView().screen();
                }
                else
                {
                    Welcome w = new Welcome();
                    w.Screen();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void signin()
    {

    }


}
