public class FinalizarPedido implements Comando {
  private Pedido pedido;

  public FinalizarPedido(Pedido pedido) {
      this.pedido = pedido;
  }

  @Override
  public void executar() {
      pedido.finalizar();
  }
}
