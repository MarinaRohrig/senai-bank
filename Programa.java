public class Programa {
    public static void main(String[] args) {
        Conta c = new Conta(1234,5678);
        Conta d = new Conta(12345, 5002, "Marina");
        c.setLimite(1000);
    System.out.println("Agencia da conta c : " + c.getAgencia());
    System.out.println("Numero da conta da conta c: " +  c.getConta());
    System.out.println("Limite da conta c: " + c.getLimite());
    System.out.println("Saldo inicial da conta c:" + c.getSaldo());

    System.out.println("Agencia da conta d:" + d.getAgencia());
    System.out.println("Numero da conta d:" + d.getConta());
    System.out.println("Nome do titular da conta d:" + d.getTitular());
/* 
    c.deposita(10);
    System.out.println("Valor do saldo após o deposito: " + c.getSaldo());
    c.saca(500);
    System.out.println("Novo saldo: R$" + c.getSaldo());
*/

    }
}
