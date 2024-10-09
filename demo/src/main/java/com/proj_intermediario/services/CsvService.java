package com.proj_intermediario.services;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import com.proj_intermediario.models.Tecnologia;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvService {
    private static final String csv_flie_path = "../resorces/tecnologia.csv";

    public List<Tecnologia> lerCsv() throws CsvValidationException {
        List<Tecnologia> tecnologias = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(csv_flie_path))) {
            String[] line;
            while ((line = reader.readNext()) != null) {
                if (!line[0].equals("status")) { // Ignora o cabeçalho
                    tecnologias.add(new Tecnologia(line[0], line[1]));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return tecnologias;
    }

    public void escreverCsv(List<Tecnologia> tecnologias) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(csv_flie_path))) {
            writer.writeNext(new String[]{"status", "proxRRN", "nroTecnologias", "nroParesTecnologias"});
            for (Tecnologia tec : tecnologias) {
                writer.writeNext(new String[]{tec.getNomeTecOrigem(), tec.getNomeTecDestino()});
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
