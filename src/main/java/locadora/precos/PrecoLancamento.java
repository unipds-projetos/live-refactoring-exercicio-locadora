package locadora.precos;

public class PrecoLancamento {
  public double calculaPrecoLancamento(int diasDeAluguel) {
    double totalParcialLancamento = 0.0;
    totalParcialLancamento += diasDeAluguel * 3;
    return totalParcialLancamento;
  }
}
