package locadora;

public class GeradorDeRecibo {

    public String gera(Cliente cliente) {
        double totalGeral = 0.0;
        String recibo = "Recibo para " + cliente.getNome() + ":\n";
        for (Locacao locacao : cliente.getLocacoes()) {
          int diasDeAluguel = locacao.getDiasDeAluguel();
          Filme filme = locacao.getFilme();
          double totalParcial = calculaValorLocacao(filme, 0.0, diasDeAluguel);
          recibo += filme.getTitulo() + "\t" + String.valueOf(totalParcial) + "\n";
            totalGeral += totalParcial;
        }
        recibo += "Total: " + String.valueOf(totalGeral) + "\n";
        return recibo;
    }

  private double calculaValorLocacao(Filme filme, double totalParcial, int diasDeAluguel) {
    switch (filme.getCategoria()) {
        case NORMAL:
            totalParcial += 2.0;
            if (diasDeAluguel > 2) {
                totalParcial += (diasDeAluguel - 2) * 1.5;
            }
            break;
        case LANCAMENTO:
            totalParcial += diasDeAluguel * 3;
            break;
        case INFANTIL:
            totalParcial += 1.0;
            if (diasDeAluguel > 3) {
                totalParcial += (diasDeAluguel - 3) * 1.5;
            }
            break;
    }
    return totalParcial;
  }

}
