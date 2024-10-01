package com;

import java.io.BufferedReader;
import java.io.FileReader;

public class LeituraCSV {
    public void exemplo() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(
                    "C:\\Users\\DevNoite\\Documents\\DanielRomano\\Java4Semestre\\io_exemplo\\src\\main\\java\\com\\dados.csv"));
            String linha = br.readLine();
            if (linha != null) {
                String colunas[] = linha.split(",");
                System.out.println("Cabeçalho");
                for (String coluna : colunas) {
                    System.out.println(coluna + " ");
                }
            }
            System.out.println("-----Conteudo-----");
            while ((linha = br.readLine()) != null) {
                String colunas[] = linha.split(",");
                for (String coluna : colunas) {
                    System.out.println(coluna + " ");
                }
                System.out.println();
                System.out.println("----------------------------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
