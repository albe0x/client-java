package com.albe0x;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("ciao");
        Scanner myObj = new Scanner(System.in);

        System.out.println("ip server");
        String ip = myObj.nextLine();

        System.out.println("porta server");
        int porta = myObj.nextInt();

        Socket s = new Socket(ip, porta);

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

        while (true) { 
            System.out.println("frase da returnare in upper");
            myObj.nextLine();
            String lower = myObj.nextLine();
            if (lower.compareToIgnoreCase("exit") == 0){
                out.println("!");
                return;
            }
            out.println(lower);
            System.out.println(in.readLine());

        }

    }

}