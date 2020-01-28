package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Calc c = new Calc();
        Scanner s = new Scanner(System.in);
        while (true)
            c.compile(s.nextLine().toCharArray());
}

}
