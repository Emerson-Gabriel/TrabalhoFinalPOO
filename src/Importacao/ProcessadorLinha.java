package Importacao;

import java.text.ParseException;

import model.domain.Lote;

/**
 *
 * @author Emerson Gabriel
 */
public interface ProcessadorLinha<E extends Lote> {

    public E getLinha(String linha, String cabecalho) throws ParseException;

}
