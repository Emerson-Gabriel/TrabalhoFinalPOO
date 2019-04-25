package Importacao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import model.domain.TransacaoImportacao;

/**
 *
 * @author Emerson Gabriel
 */
public class ProcessadoraTransacao implements ProcessadorLinha<TransacaoImportacao> {

    @Override
    public TransacaoImportacao getLinha(String linha, String cabecalho) throws ParseException {
        TransacaoImportacao transacao = new TransacaoImportacao();
        transacao.setDetalhe(linha.charAt(0));
        transacao.setNumeroconta(linha.substring(1, 8));
        transacao.setNumeroplastico(linha.substring(8, 15));
        double valor_transacao = Double.parseDouble(linha.substring(15, 27));
        transacao.setValortransacao(valor_transacao / 100d);

        String dia, mes, ano, data;
        dia = linha.substring(27, 29);
        mes = linha.substring(29, 31);
        ano = linha.substring(31, 35);
        data = dia + "/" + mes + "/" + ano;
        transacao.setDatatransacao(data);
        String hora = linha.substring(35, 37);
        String min = linha.substring(37, 39);
        String seg = linha.substring(39, 41);
        String horario = hora + ":" + min + ":" + seg + "";

        transacao.setHoratransacao(horario);
        transacao.setCodigoestabelecimento(linha.substring(41, 47));
        transacao.setNumeroLote(cabecalho.substring(1, 4));
        transacao.setTipoLote(transacao.getTipoLote());
        return transacao;
    }

}
