package locadora;


import locadora.precos.PrecoInfantil;
import locadora.precos.PrecoLancamento;
import locadora.precos.PrecoNormal;

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
          PrecoNormal precoNormal = new PrecoNormal();
          return precoNormal.calculaPreco(diasDeAluguel);
        case LANCAMENTO:
          PrecoLancamento precoLancamento = new PrecoLancamento();
          return precoLancamento.calculaPreco(diasDeAluguel);
        case INFANTIL:
          PrecoInfantil precoInfantil = new PrecoInfantil();
          return precoInfantil.calculaPreco(diasDeAluguel);
        default:
          throw new IllegalStateException("Categoria inválida");
    }
  }
}
