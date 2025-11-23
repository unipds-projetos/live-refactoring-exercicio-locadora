package locadora.precos;

public class PrecoInfantil implements Preco {
  public double calculaPreco(int diasDeAluguel) {
    double totalParcialInfantil = 0.0;
    totalParcialInfantil += 1.0;
    if (diasDeAluguel > 3) {
      totalParcialInfantil += (diasDeAluguel - 3) * 1.5;
    }
    return totalParcialInfantil;
  }
}
