package com.proj_intermediario;

import java.util.List;

import com.opencsv.exceptions.CsvValidationException;
import com.proj_intermediario.models.Tecnologia;
import com.proj_intermediario.services.CsvService;

public class Main {
    public static void main(String[] args) throws CsvValidationException {
        CsvService csvService = new CsvService();

        // Ler dados do CSV
        List<Tecnologia> tecnologias = csvService.lerCsv();
        for (Tecnologia tec : tecnologias) {
            System.out.println("Origem: " + tec.getNomeTecOrigem() + ", Destino: " + tec.getNomeTecDestino());
        }

        // Adicionar nova tecnologia e escrever no CSV
        tecnologias.add(new Tecnologia("NovaOrigem", "NovaDestino"));
        csvService.escreverCsv(tecnologias); 
    }
}