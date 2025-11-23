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
          double totalParcialNormal = 0.0;
            totalParcialNormal += 2.0;
            if (diasDeAluguel > 2) {
                totalParcialNormal += (diasDeAluguel - 2) * 1.5;
            }
          return totalParcialNormal;
        case LANCAMENTO:
          double totalParcialLancamento = 0.0;
            totalParcialLancamento += diasDeAluguel * 3;
          return totalParcialLancamento;
        case INFANTIL:
          double totalParcialInfantil = 0.0;
            totalParcialInfantil += 1.0;
            if (diasDeAluguel > 3) {
                totalParcialInfantil += (diasDeAluguel - 3) * 1.5;
            }
            return totalParcialInfantil;
        default:
          throw new IllegalStateException("Categoria inválida");
    }
  }
}
