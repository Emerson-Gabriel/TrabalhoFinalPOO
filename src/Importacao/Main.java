package Importacao;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import model.domain.Lote;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Emerson Gabriel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException, IllegalAccessException, ParseException {

        File arquivos[];
        String diretorio = System.getProperty("user.dir") + "/src/arquivos/";
        File documentos = new File(diretorio);
        arquivos = documentos.listFiles();

        Arrays.sort(arquivos);

        for (int i = 0; i < arquivos.length; i++) {

            LeituraArquivo leitura = new LeituraArquivo();
            List<String> lista = leitura.lerArquivo(diretorio + arquivos[i].getName());
            String nomeArquivo = leitura.getNomeArquivo();

            ProcessadoraArquivo processadora
                    = new ProcessadoraArquivo((ProcessadorLinha) Class.forName(nomeArquivo).newInstance());
            List<Lote> result = processadora.processaArquivo(lista);
            System.out.println(result);

        }
    }

}
