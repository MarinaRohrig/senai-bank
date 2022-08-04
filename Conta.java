public class Conta{
    private int agencia;
    private int conta;
    private double saldo;
    private double limite;
    private String nomeTitular;

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
    public String getNomeTitular() {
        return this.nomeTitular;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
    public void setConta(int conta) {
        this.conta = conta;
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
}