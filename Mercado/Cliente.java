public abstract class Cliente {
    private String nome;
    private double valorDaCompra;

    public Cliente(String nome, double valorDaCompra){
        this.nome = nome;
        this.valorDaCompra = valorDaCompra;
    }

    public String getnome(){
        return nome;
    }

    public double getvalorDaCompra(){
        return valorDaCompra;
    }

    public abstract double calcularPagamento();

    public String toString(){
        return "Cliente: " + "\n" +
        "Nome: " + nome + "\n" +
        "Valor da compra: " + valorDaCompra + "\n" +
        ".";
    }

}


