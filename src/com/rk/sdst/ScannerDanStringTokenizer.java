package com.rk.sdst;

import java.io.IOException;
import java.util.Scanner;

public class ScannerDanStringTokenizer {
    public static void main(String[] args) throws IOException {
        Scanner inputUser = new Scanner(System.in);

        String input = inputUser.next();
        System.out.println(input);

        input = inputUser.next();
        System.out.println("Kata Kedua  : " + input);

    }
}
