package locadora;

public class GeradorDeRecibo {

    public String gera(Cliente cliente) {
        double totalGeral = 0.0;
        String recibo = "Recibo para " + cliente.getNome() + ":\n";
        for (Locacao locacao : cliente.getLocacoes()) {
          int diasDeAluguel = locacao.getDiasDeAluguel();
          Filme filme = locacao.getFilme();
          double totalParcial = filme.calculaValorLocacao(diasDeAluguel);
          recibo += filme.getTitulo() + "\t" + String.valueOf(totalParcial) + "\n";
            totalGeral += totalParcial;
        }
        recibo += "Total: " + String.valueOf(totalGeral) + "\n";
        return recibo;
    }

}
