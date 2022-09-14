public class CriaConta {
    public static void main(String[] args) {
        //primeiraConta é um ponteiro para um objeto do tipo Conta

        Conta primeiraConta = new Conta(111,2222);

        Cliente primeiroCliente = new Cliente();

        primeiroCliente.setNome("Silvia");
        primeiroCliente.setCpf("111.111.111-11");
        primeiroCliente.setProfissao("Analista de sistemas");
        primeiraConta.setTitular(primeiroCliente);

        System.out.println(primeiraConta.getTitular().getNome());
        primeiraConta.deposita(50);
        System.out.println(primeiraConta.getSaldo());
        System.out.println(primeiraConta.saca(100));
        System.out.println(primeiraConta.getSaldo());

        Conta contaDaSilvia = new Conta(222,5555);
        primeiraConta.transfere(10, contaDaSilvia);
        System.out.println(contaDaSilvia.getSaldo());
        System.out.println("Total de contas criadas:"+Conta.getTotal());
    }
}
