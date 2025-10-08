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
        Scanner inputTastiera = new Scanner(System.in);

        System.out.println("ip server");
        String ip = inputTastiera.nextLine();

        System.out.println("porta server");
        int porta = inputTastiera.nextInt();
        inputTastiera.nextLine();

        Socket s = new Socket(ip, porta);

        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);

        in.readLine();
        out.println("BenveClient 1.0");

        while (true) {
            
        
        System.out.println("Numero 1");
        String n1 = inputTastiera.nextLine();
        if(n1.compareTo("exit") == 0){
            return;
        }
        out.println(n1);

        System.out.println("Numero 2");
        out.println(inputTastiera.nextLine());

        System.out.println("Operazione");
        String operazione = inputTastiera.nextLine();
        int opCode;
        switch (operazione) {
            case "+":
            opCode = 1;
                break;
            case "-":
            opCode = 2;
                break;
            case "/":
            opCode = 3;
                break;
            case "*":
            opCode = 4;
                break;
            default:
            opCode = 0;
                break;
        }
        out.println(opCode);

        System.out.println(in.readLine());
    }

 

    }

}