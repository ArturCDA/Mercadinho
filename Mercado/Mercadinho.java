public class Mercadinho {
    private Cliente [] clientes;
    private int quantidade;

    public Mercadinho(){
        clientes = new Cliente[8];
        this.quantidade = 0;
    }

    public void adicionarCliente(Cliente cliente){
        if(quantidade < clientes.length){
            clientes[quantidade] = cliente;
            quantidade ++;
        }
    }

    public double calcularTotal(){
        double total = 0;
        for(int i = 0; i < quantidade; i++){
            if(clientes[i] != null){
            total += clientes[i].calcularPagamento();
            }
        }
        return total;
     } 
        
    

    public void imprimirClientes(){
       for(int i = 0; i < quantidade ; i ++){
            System.out.println(clientes[i]);
       }

    }
}
