public class ClienteOuroVip extends ClienteVip{
    private String endereco;

    public ClienteOuroVip(String nome, double valorDaCompra, String numeroDoCartao, String endereco){
        super(nome, valorDaCompra, numeroDoCartao);
        this.endereco = endereco;
    }

    public String getendereco(){
        return endereco;
    }

    public double calcularPagamento(){
        return getvalorDaCompra() * 0.85;
    }

    public String toString(){
        return "Cliente: " + "\n" +
        "Nome: " + getnome() + "\n" +
        "Valor da Compra: " + getvalorDaCompra() + "\n" +
        "Número do cartão: " + getnumeroDoCartao() + "\n" +
        "Endereço: " + endereco + "\n" +
        ".";
    }
}
