package com.ROfjlaHbl;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        String str = "";

        System.out.print("\n");
        str = in.next();


    }

    public static String calculate(String num1, String operation, String num2) {
        String res2;
        String str = num1 ;
        int index = str.indexOf("/");
        if (index == -1) {
            int num = Integer.parseInt(num1);

            String c = operation;
            int num11 = Integer.parseInt(num2);
            int res1;

            int celoe = 0;
            switch (c) {
                case "*":
                    res1 = num * num11;
                    res2 = String.valueOf(res1);
                    return res2;
                case "+":
                    res1 = num + num11;
                    res2 = String.valueOf(res1);
                    return res2;
                case "-":
                    res1 = num - num11;
                    res2 = String.valueOf(res1);
                    return res2;
                case "/":
                    if (num11 == 0) {
                        res2="na 0   ne deli";
                        return res2;
                    }
                    if (num > num11) {
                        celoe = num / num11;
                        num = num - (num11 * celoe);
                    }
                    if (celoe != 0 && num != 0) {
                        res2= celoe + " " + num1 + "/" + num11;
                        return res2;
                    } else if (num == 0) {
                        res2=String.valueOf(celoe);
                        return res2;
                    }
            }
        } else {
            String[] parts = str.split("/");
            int chis_num = Integer.parseInt(parts[0]);
            int znam_num = Integer.parseInt(parts[1]);

            String s = operation;

            String str1 = num2;
            int index1 = str1.indexOf("/");
            int chis_num1;
            int znam_num1;
            if (index1 != -1) {
                String[] parts1 = str1.split("/");
                chis_num1 = Integer.parseInt(parts1[0]);

                znam_num1 = Integer.parseInt(parts1[1]);
            } else {
                chis_num1 = Integer.parseInt(str1);
                znam_num1 = 1;
            }
            int chis_result;
            int znam_resuzlt;
            switch (s) {
                case "*":

                    chis_result = chis_num1 * chis_num;
                    znam_resuzlt = znam_num * znam_num1;
                    res2 = chis_result + "/" + znam_resuzlt;
                    return res2;
                case "+":
                    chis_result = chis_num * znam_num1 + chis_num1 * znam_num;
                    znam_resuzlt = znam_num * znam_num1;
                    res2 = chis_result + "/" + znam_resuzlt;
                    return res2;
                case "-":
                    chis_result = chis_num * znam_num1 - chis_num1 * znam_num;
                    znam_resuzlt = znam_num * znam_num1;
                    res2 = chis_result + "/" + znam_resuzlt;
                    return res2;
                case "/":
                    if (chis_num1 == 0) {
                        System.out.println("na 0 ne deli");
                    }
                    chis_result = chis_num * znam_num1;
                    znam_resuzlt = znam_num * chis_num1;
                    res2 = chis_result + "/" + znam_resuzlt;
                    return res2;
            }
        }
        return null;
    }
}

