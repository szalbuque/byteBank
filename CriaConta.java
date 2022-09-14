public class CriaConta {
    public static void main(String[] args) {
        //primeiraConta é um ponteiro para um objeto do tipo Conta

        Conta primeiraConta = new Conta();
        Cliente primeiroCliente = new Cliente();

        primeiroCliente.nome = "Silvia";
        primeiroCliente.cpf = "111.111.111-11";
        primeiroCliente.profissao = "Analista de sistemas";
        primeiraConta.titular = primeiroCliente;

        System.out.println(primeiraConta.titular.nome);
        primeiraConta.deposita(50);
        System.out.println(primeiraConta.saldo);
        System.out.println(primeiraConta.saca(100));
        System.out.println(primeiraConta.saldo);

        Conta contaDaSilvia = new Conta();
        primeiraConta.transfere(10, contaDaSilvia);
        System.out.println(contaDaSilvia.saldo);
    }
}
