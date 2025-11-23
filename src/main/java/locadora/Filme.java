package locadora;


public class Filme {

    private String titulo;
    private Categoria categoria;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

  double calculaValorLocacao(int diasDeAluguel) {
      switch (getCategoria()) {
        case NORMAL:
          return calculaPrecoNormal(diasDeAluguel);
        case LANCAMENTO:
          return calculaPrecoLancamento(diasDeAluguel);
        case INFANTIL:
          return calculaPrecoInfantil(diasDeAluguel);
        default:
          throw new IllegalStateException("Categoria inválida");
    }
  }

  private double calculaPrecoInfantil(int diasDeAluguel) {
    double totalParcialInfantil = 0.0;
    totalParcialInfantil += 1.0;
    if (diasDeAluguel > 3) {
        totalParcialInfantil += (diasDeAluguel - 3) * 1.5;
    }
    return totalParcialInfantil;
  }

  private double calculaPrecoLancamento(int diasDeAluguel) {
    double totalParcialLancamento = 0.0;
    totalParcialLancamento += diasDeAluguel * 3;
    return totalParcialLancamento;
  }

  private double calculaPrecoNormal(int diasDeAluguel) {
    double totalParcialNormal = 0.0;
    totalParcialNormal += 2.0;
    if (diasDeAluguel > 2) {
        totalParcialNormal += (diasDeAluguel - 2) * 1.5;
    }
    return totalParcialNormal;
  }
}
