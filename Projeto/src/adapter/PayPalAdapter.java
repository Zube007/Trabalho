public class PayPalAdapter implements SistemaPagamento {
  private PayPal payPal;

  public PayPalAdapter(PayPal payPal) {
      this.payPal = payPal;
  }

  @Override
  public void processarPagamento(double valor) {
      payPal.efetuarPagamento(valor); 
  }
}
