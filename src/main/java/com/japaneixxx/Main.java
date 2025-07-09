package com.japaneixxx;

import com.japaneixxx.utils.CPFGen;
import com.japaneixxx.utils.CPFVerify;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String cpf = CPFGen.generateCPF();

        System.out.printf(cpf);
        System.out.println(" ");
        if (CPFVerify.verifyCPF(cpf)) {
            System.out.printf("True");
        } else {
            System.out.printf("False");
        }

    }
}