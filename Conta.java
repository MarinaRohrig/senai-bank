public class Conta{
    private int agencia;
    private int conta;
    private double saldo;
    private double limite;
    private Cliente titular;

    public Conta(int agencia, int numeroConta) {
        this.agencia = agencia;
        this.conta = numeroConta;
    }

    public Conta (int agencia, int numeroConta, String titularDaConta ) {
        this.agencia = agencia;
        this.conta = numeroConta;
        this.titular.setNome(titularDaConta);
    }

    public void deposita(double valor) {
        this.saldo += valor;
        System.out.println("O valor R$" + valor +" foi depositado com sucesso! :D");
    }
    public boolean saca(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Saque de R$" + valor +" realizado com sucesso! :)");
            return true;
        }else{
            System.out.println("Saldo insuficiente para o saque. :( ");
            return false;
        }        
    }
    public int getAgencia() {
        return this.agencia;
    }
    public int getConta() {
        return this.conta;
    }
    public double getLimite() {
        return this.limite;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public Cliente getTitular(){
        return titular;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
}