package View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentView {

    public void screen()
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println();
            System.out.println("hello");
            do{
                
                int choice = 0;
                System.out.println("wlm pree 1");
                
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
                    case 1 -> check();
                    case 2 -> check2();
                    case 0 -> System.exit(0);
                }
            }
            while(true);

    }

    private void check2() {
    }

    private void check() {
        
    }
}
