// Main.java
public class Main {
    public static void main(String[] args) {

        System.out.println("--- Demonstração do Padrão Singleton ---");

        Cliente joao = new Cliente("cliente123", "João Silva");
        Cliente maria = new Cliente("cliente456", "Maria Oliveira");
        Cliente carlos = new Cliente("cliente789", "Carlos Souza");

        joao.verificarSaldo();
        maria.verificarSaldo();
        carlos.verificarSaldo();

        joao.realizarDeposito(500.0);

        maria.realizarSaque(600.0); 

        carlos.realizarSaque(1000.0);

        AccountManager.getInstance().listarContasAtivas();
    }
}