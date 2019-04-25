package Importacao;

import model.domain.Lote;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emerson Gabriel
 */
public class ProcessadoraArquivo<E extends Lote> {

    private ProcessadorLinha<E> processa;

    public ProcessadoraArquivo(ProcessadorLinha<E> processa) {
        this.processa = processa;
    }

    public List<E> processaArquivo(List<String> listaString)
            throws IOException, ParseException, FileNotFoundException {

        List<E> listaConta = new ArrayList<>();
        String cabecalho = listaString.get(0);

        listaString.remove(0);
        for (String linha : listaString) {
            listaConta.add(processa.getLinha(linha, cabecalho));

        }
        return listaConta;
    }

}
