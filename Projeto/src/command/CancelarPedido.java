public class CancelarPedido implements Comando {
  private Pedido pedido;

  public CancelarPedido(Pedido pedido) {
      this.pedido = pedido;
  }

  @Override
  public void executar() {
      pedido.cancelar();
  }
}
