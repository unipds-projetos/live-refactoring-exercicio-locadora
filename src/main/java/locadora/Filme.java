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
      double totalParcial = 0.0;
      switch (getCategoria()) {
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
