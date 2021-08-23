package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner keyPad = new Scanner(System.in);
        int i, a = 0, b = 0, c = 0, d = 0, e = 0;

        String da, db, dc;
        for (i = 0; i < 50; ++i) {
            System.out.println("Você assina o Diário A? s para Sim, n para Não:");
            da = keyPad.next();
            System.out.println("Você assina o Diário B? s para Sim, n para Não:");
            db = keyPad.next();
            System.out.println("Você assina o Diário C? s para Sim, n para Não:");
            dc = keyPad.next();
            if (da.equals("s") && db.equals("s") && dc.equals("s")) {
                ++a;
            } else if (da.equals("s") && db.equals("n") && dc.equals("s")) {
                ++b;
            } else if (da.equals("s") && db.equals("s") && dc.equals("n")) {
                ++c;
            } else if (da.equals("n") && db.equals("s") && dc.equals("s")) {
                ++d;
            } else if (da.equals("s") && db.equals("n") && dc.equals("n")) {
                ++e;
            }
        }
        System.out.println("Total de Assinantes: " + a + "  Assinantes do Diário A e C: " + b + "  Assinantes do Diário A e B: " + c + "  Assinantes do Diário B e C: " + d + " Assinantes do Diário A: " + e);
    }
}


