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

        System.out.println("frase da returnare in upper");
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

        myObj.nextLine();
        String lower = myObj.nextLine();
        out.println(lower);
        System.out.println(in.readLine());

    }

}