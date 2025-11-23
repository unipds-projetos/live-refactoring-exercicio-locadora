package locadora.precos;

public class PrecoNormal {
  public double calculaPreco(int diasDeAluguel) {
    double totalParcialNormal = 0.0;
    totalParcialNormal += 2.0;
    if (diasDeAluguel > 2) {
      totalParcialNormal += (diasDeAluguel - 2) * 1.5;
    }
    return totalParcialNormal;
  }
}
