public class LojaConfiguracao {

  private static LojaConfiguracao instancia;

  private String enderecoLoja;
  private String nomeLoja;
  private boolean lojaAberta;

  private LojaConfiguracao() {
      enderecoLoja = "Rua Principal, 123";
      nomeLoja = "Loja Online";
      lojaAberta = true;
  }

  public static LojaConfiguracao getInstancia() {
      if (instancia == null) {
          instancia = new LojaConfiguracao();
      }
      return instancia;
  }

  public String getEnderecoLoja() {
      return enderecoLoja;
  }

  public String getNomeLoja() {
      return nomeLoja;
  }

  public boolean isLojaAberta() {
      return lojaAberta;
  }
}
