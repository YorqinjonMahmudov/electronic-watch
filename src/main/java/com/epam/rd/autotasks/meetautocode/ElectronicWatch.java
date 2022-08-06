package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        seconds %= 86400;
        int second = seconds%60;
        int minutes = seconds %3600 /60;
        int hours = seconds /3600;
        DecimalFormat df = new DecimalFormat("00");
        System.out.println(hours+":"+df.format(minutes)+":"+df.format(second));

    }
}
