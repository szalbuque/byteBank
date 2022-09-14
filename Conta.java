public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    // a variável total pertence ao escopo da classe; todos os objetos acessam a mesma variável
    private static int total;

    // construtor

    public Conta (int agencia, int numero) {
        Conta.total++;

        this.setAgencia(agencia);
        this.setNumero(numero);
    }
    // O método abaixo pertence à Classe Conta e não aos objetos do tipo conta
    public static int getTotal() {
        return Conta.total;
    }
    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo(){
        return this.saldo;
    }
    public void deposita(double valor){
        this.saldo += valor;
    }

    public boolean saca(double valor){
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere (double valor, Conta destino){
        if (this.saldo >= valor) {
            this.saca(valor);
            destino.deposita(valor);
            return true;
        } 
        return false;
    }
}
