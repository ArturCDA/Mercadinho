public class ClienteVip extends Cliente{
    private String numeroDoCartao;

    public ClienteVip(String nome, double valorDaCompra, String numeroDoCartao){
        super(nome, valorDaCompra);
        this.numeroDoCartao = numeroDoCartao;
    }

    public String getnumeroDoCartao(){
        return numeroDoCartao;
    }

    @Override
    public double calcularPagamento(){
        return getvalorDaCompra() * 0.9;
    }

    public String toString(){
        return "Cliente: " + "\n" +
        "Nome: " + getnome() + "\n" +
        "Valor da compra: " + getvalorDaCompra() + "\n" +
        "Numero do cartão: " + numeroDoCartao + "\n" +
        ".";
    }
}
