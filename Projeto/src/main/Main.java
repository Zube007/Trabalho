public class Main {
  public static void main(String[] args) {

      LojaConfiguracao config = LojaConfiguracao.getInstancia();
      System.out.println("Nome da Loja: " + config.getNomeLoja());
      System.out.println("Endereço: " + config.getEnderecoLoja());

      PayPal payPal = new PayPal(); 
      SistemaPagamento sistemaPagamento = new PayPalAdapter(payPal); 

      Pedido pedidoPagamento = new Pedido(sistemaPagamento);

      pedidoPagamento.realizarPagamento(150.75); 

      Pedido pedidoControle = new Pedido();
      ControladorPedido controlador = new ControladorPedido();

      Comando comandoFinalizar = new FinalizarPedido(pedidoControle); 
      Comando comandoCancelar = new CancelarPedido(pedidoControle);

      controlador.setComando(comandoFinalizar);
      controlador.executarComando(); 

      controlador.setComando(comandoCancelar);
      controlador.executarComando();
  }
}

