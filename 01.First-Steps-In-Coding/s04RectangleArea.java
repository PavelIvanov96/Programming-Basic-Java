package com.company;

import java.util.Scanner;

public class s04RectangleArea {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Integer a = Integer.parseInt(scanner.nextLine());
        Integer b = Integer.parseInt(scanner.nextLine());

        System.out.print(a * b);
    }
}
