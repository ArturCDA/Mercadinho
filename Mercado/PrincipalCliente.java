public class PrincipalCliente {
    public static void main(String[] args) {
        Mercadinho Subaru = new Mercadinho();

        Cliente cliente1 = new ClienteRegular("Nicolas", 450);
        Cliente cliente2 = new ClienteVip("José", 780, "1234567890");
        Cliente cliente3 = new ClienteOuroVip("Junior", 560, "5434553903", "Rua do Medo");

        Subaru.adicionarCliente(cliente1);
        Subaru.adicionarCliente(cliente2);
        Subaru.adicionarCliente(cliente3);

        Subaru.imprimirClientes();

        System.out.println(Subaru.calcularTotal());
}

}
