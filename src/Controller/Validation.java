package Controller;

import java.util.Scanner;

public class Validation {
    Scanner sc = new Scanner(System.in);
    //Get Int
    public int getInt(String msg,String err,int min,int max){
        while (true){
            try{
                int num;
                System.out.print(msg);
                num = Integer.parseInt(sc.nextLine());
                if(num < min || num > max){
                    System.out.println(err);
                    continue;
                }
                return num;
            }catch (Exception e){
                System.out.println(err);
            }
        }
    }
    //Get Double
    public double getDouble(String msg,String err,double min,double max){
        while (true){
            try{
                double num;
                System.out.print(msg);
                num = Double.parseDouble(sc.nextLine());
                if(num < min || num > max){
                    System.out.println(err);
                    continue;
                }
                return num;
            }catch (Exception e){
                System.out.println(err);
            }
        }
    }
}
