public class ClienteRegular extends Cliente {
    public ClienteRegular(String nome, double valorDaCompra){
        super(nome, valorDaCompra);
    }

    public double calcularPagamento(){
        return getvalorDaCompra();
    }

    public String toString(){
        return "Cliente: " + "\n" +
        "Nome: " + getnome() + "\n" +
        "Valor da compra: " + getvalorDaCompra() + "\n" +
        ".";
    }
}
