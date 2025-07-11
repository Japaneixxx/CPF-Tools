package com.japaneixxx.utils;

public class CPFGen {
    public static String generateCPF(int Regiao) {
        int n1 = (int) (Math.random() * 10);
        int n2 = (int) (Math.random() * 10);
        int n3 = (int) (Math.random() * 10);
        int n4 = (int) (Math.random() * 10);
        int n5 = (int) (Math.random() * 10);
        int n6 = (int) (Math.random() * 10);
        int n7 = (int) (Math.random() * 10);
        int n8 = (int) (Math.random() * 10);

        int n9 = Regiao;
//          •1: Distrito Federal, Goiás, Mato Grosso, Mato Grosso do Sul e Tocantins
//          •2: Amazonas, Pará, Roraima, Amapá, Acre e Rondônia
//          •3: Ceará, Maranhão e Piauí
//          •4: Paraíba, Pernambuco, Alagoas e Rio Grande do Norte
//          •5: Bahia e Sergipe
//          •6: Minas Gerais
//          •7: Rio de Janeiro e Espírito Santo
//          •8: São Paulo
//          •9: Paraná e Santa Catarina
//          •0: Rio Grande do Sul


        int d1 = n9 * 2 + n8 * 3 + n7 * 4 + n6 * 5 + n5 * 6 + n4 * 7 + n3 * 8 + n2 * 9 + n1 * 10;
        d1 = 11 - (d1 % 11);
        if (d1 >= 10) d1 = 0;

        int d2 = d1 * 2 + n9 * 3 + n8 * 4 + n7 * 5 + n6 * 6 + n5 * 7 + n4 * 8 + n3 * 9 + n2 * 10 + n1 * 11;
        d2 = 11 - (d2 % 11);
        if (d2 >= 10) d2 = 0;

        return "" + n1 + n2 + n3 + "." + n4 + n5 + n6 + "." + n7 + n8 + n9 + "-" + d1 + d2;
    }
    public static String generateCPF() {
        return generateCPF((int) (Math.random() * 10));

    }

}
