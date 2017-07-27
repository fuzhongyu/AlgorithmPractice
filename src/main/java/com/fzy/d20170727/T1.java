package com.fzy.d20170727;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by fuzhongyu on 2017/7/27.
 */
public class T1 {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String a=scanner.nextLine();
        String b=scanner.nextLine();

        BigDecimal d1=new BigDecimal(a);
        BigDecimal d2=new BigDecimal(b);
        System.out.println(d1.add(d2));

    }
}
