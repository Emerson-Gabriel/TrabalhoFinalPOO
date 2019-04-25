package Importacao;

import model.domain.ClienteImportacao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 * @author Emerson Gabriel
 */
public class ProcessadoraCliente implements ProcessadorLinha<ClienteImportacao> {

    @Override
    public ClienteImportacao getLinha(String linha, String cabecalho) throws ParseException {
        ClienteImportacao cliente = new ClienteImportacao();
        //cliente.setTipoLote(cliente.getTipoLote());
        cliente.setTipo(linha.charAt(1));
        cliente.setCpf(linha.substring(2, 13));
        cliente.setNome(linha.substring(13, 43).trim());
        cliente.setEndereco(linha.substring(43, 73).trim());
        cliente.setBairro(linha.substring(73, 103).trim());
        cliente.setCidade(linha.substring(103, 133).trim());
        cliente.setEstado(linha.substring(133, 135));
        String dataCadastro = linha.substring(135, 143);
        String horaCadastro = linha.substring(143, 149);
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy hhmmss");
        cliente.setDataHoraCadastro(sdf.parse(dataCadastro + " " + horaCadastro));
        cliente.setTipoLote(cliente.getTipoLote());
        cliente.setNumeroLote(cabecalho.substring(1, 4));
        return cliente;
    }

}
