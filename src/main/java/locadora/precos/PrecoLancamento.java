package locadora.precos;

public class PrecoLancamento {
  public double calculaPreco(int diasDeAluguel) {
    double totalParcialLancamento = 0.0;
    totalParcialLancamento += diasDeAluguel * 3;
    return totalParcialLancamento;
  }
}
