public class Programa {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.setAgencia(1234);
        c.setConta(5678);
        c.setLimite(1000);
        c.setNomeTitular("Marina");
    
    System.out.println("Saldo da conta: " + c.getSaldo());
    System.out.println("Ag�ncia: " + c.getAgencia());
    System.out.println("N�mero da conta: " + c.getConta());
    System.out.println("Nome do t�tular: " + c.getNomeTitular());
    System.out.println("Limite da conta: " + c.getLimite());
    c.deposita(10);
    System.out.println("Valor do saldo ap�s o deposito: " + c.getSaldo());
    c.saca(500);
    System.out.println("Novo saldo: R$" + c.getSaldo());
    }
}
