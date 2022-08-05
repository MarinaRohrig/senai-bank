public class Programa {
    public static void main(String[] args) {
      //  Conta d = new Conta(1234,5678);
        Cliente marina = new Cliente("123.456.789-00");
        Conta c = new Conta(12345, 5002, marina);
        marina.setNome("Marina");
        marina.setProfissao("Técnico de atendimento");
      
   System.out.println("Agencia da conta : " + c.getAgencia());
    System.out.println("Numero da conta da conta : " +  c.getConta());
    System.out.println("Limite da conta : " + c.getLimite());
    System.out.println("Saldo inicial da conta : " + c.getSaldo()); 
    System.out.println("Titular da conta : " + c.getTitular().getNome());
/* 
    System.out.println("Agencia da conta d:" + d.getAgencia());
    System.out.println("Numero da conta d:" + d.getConta());
    System.out.println("Nome do titular da conta d:" + d.getTitular());
    c.deposita(10);
    System.out.println("Valor do saldo após o deposito: " + c.getSaldo());
    c.saca(500);
    System.out.println("Novo saldo: R$" + c.getSaldo());
*/

    }
}
