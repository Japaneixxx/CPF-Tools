package com.japaneixxx.utils;

public class CPFVerify {
    public static boolean verifyCPF(String cpf) {
        // Deixa apenas numeros
        cpf = cpf.replaceAll("[^0-9]", "");

        // Confirma se o cpf tem 11 digitos
        if (cpf.length() != 11) {
            return false;
        }

        // Verifica se os digitos são iguais
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        try {
            long cpfLong = Long.parseLong(cpf);
        } catch (NumberFormatException e) {
            return false; // numero invalido
        }

        // Calcula o primeiro digito verificador
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
        }
        int d1 = 11 - (sum % 11);
        if (d1 >= 10) d1 = 0;

        // Calcula o segundo digito verificador
        sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
        }
        int d2 = 11 - (sum % 11);
        if (d2 >= 10) d2 = 0;

        // Compara os digitos verificadores com os outros digitos
        return Character.getNumericValue(cpf.charAt(9)) == d1 && Character.getNumericValue(cpf.charAt(10)) == d2;
    }

}
