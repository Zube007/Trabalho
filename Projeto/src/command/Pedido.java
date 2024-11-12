public class Pedido {
  private String status;

  public Pedido() {
      this.status = "Novo";
  }

  public void finalizar() {
      status = "Finalizado";
      System.out.println("Pedido foi finalizado.");
  }

  public void cancelar() {
      status = "Cancelado";
      System.out.println("Pedido foi cancelado.");
  }

  public String getStatus() {
      return status;
  }
}
