public class CriaConta {
    public static void main(String[] args) {
        //primeiraConta é um ponteiro para um objeto do tipo Conta

        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println(primeiraConta.saldo);
        primeiraConta.deposita(50);
        System.out.println(primeiraConta.saldo);
        System.out.println(primeiraConta.saca(100));
        System.out.println(primeiraConta.saldo);

        Conta contaDaSilvia = new Conta();
        primeiraConta.transfere(10, contaDaSilvia);
        System.out.println(contaDaSilvia.saldo);
    }
}
