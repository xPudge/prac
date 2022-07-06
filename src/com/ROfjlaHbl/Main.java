package com.ROfjlaHbl;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code her

        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
        String str = "";
//        int num1 = Integer.parseInt(str);
//    System.out.print(num + num1);
        System.out.print("\n");
//
//        try{
//            str = "qqqqq";
//           int num = Integer.parseInt(str);
//        }
//        catch (NumberFormatException e){
//            System.out.println("ploho");
//        }
//        str = "MAMA HOCHY SPAT'";
//        String[] parts = str.split(" ");
//        System.out.println(parts.length);
//        System.out.println(parts[0]);
//        System.out.println(parts[1]);
//        System.out.println(parts[2]);
        System.out.println("Введите первое число");
        str = in.next();

        int index = str.indexOf("/");
        if(index == -1)
        {
            int num = Integer.parseInt(str);
            System.out.println("Введите действие число");
            String c = in.next();
            System.out.println("Введите второе число");
            int num1 = in.nextInt();
            int result;

            int celoe = 0;
            switch (c) {
                case "*":
                    result = num * num1;
                    System.out.println(result);
                    break;
                case "+":
                    result = num + num1;
                    System.out.println(result);
                    break;
                case "-":
                    result = num - num1;
                    System.out.println(result);
                    break;
                case "/":
                    if (num1 == 0) {
                        System.out.println("na 0   ne deli");
                        break;
                    }
                    if(num > num1) {
                        celoe = num / num1;
                        num = num - (num1 * celoe);
                    }
                    if(celoe !=0 && num !=0) {
                        System.out.println(celoe+ " "+ num + "/" + num1);
                    }
                    else if(num == 0)
                    {
                        System.out.println(celoe);
                    }
                    break;
            }
        }
        else
        {   String[] parts = str.split("/");
            int chis_num = Integer.parseInt(parts[0]);

            int znam_num =Integer.parseInt(parts[1]);
            System.out.println("Введите действие число");
            String s = in.next();
            System.out.println("Введите второе число gfdf");
            String str1 = in.next();
            int index1 = str1.indexOf("/");
            int chis_num1;
            int znam_num1;
            if(index1 != -1) {
                String[] parts1 = str1.split("/");
                chis_num1 = Integer.parseInt(parts1[0]);

                znam_num1 = Integer.parseInt(parts1[1]);
            }
            else
            {
                chis_num1 = Integer.parseInt(str1);
                znam_num1 = 1;
            }
            int chis_result;
            int znam_resuzlt;
            switch (s) {
                case "*":

                    chis_result = chis_num1  * chis_num;
                    znam_resuzlt = znam_num * znam_num1;
                    System.out.println(chis_result + "/" + znam_resuzlt);
                    break;
                case "+":
                    chis_result = chis_num * znam_num1 + chis_num1 * znam_num;
                    znam_resuzlt = znam_num * znam_num1;
                    System.out.println(chis_result + "/" + znam_resuzlt);
                    break;
                case "-":
                    chis_result = chis_num * znam_num1 - chis_num1 * znam_num;
                    znam_resuzlt = znam_num * znam_num1;
                    System.out.println(chis_result + "/" + znam_resuzlt);
                    break;
                case "/":
                    if (chis_num1 == 0) {
                        System.out.println("na 0 ne deli");
                        break;
                    }
                    chis_result = chis_num * znam_num1;
                    znam_resuzlt = znam_num * chis_num1;

                    System.out.println(chis_result + "/" + znam_resuzlt);
                    break;
            }
        }
    }
}