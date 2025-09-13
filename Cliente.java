// Cliente.java
public class Cliente {
    private final String clienteId;
    private final String nome;

    public Cliente(String clienteId, String nome) {
        this.clienteId = clienteId;
        this.nome = nome;
    }

    public String getClienteId() {
        return clienteId;
    }

    public void realizarDeposito(double valor) {
        System.out.println("\n" + nome + " tentando depositar R$" + valor);
        AccountManager.getInstance().depositar(this.clienteId, valor);
    }

    public void realizarSaque(double valor) {
        System.out.println("\n" + nome + " tentando sacar R$" + valor);
        AccountManager.getInstance().sacar(this.clienteId, valor);
    }

    public void verificarSaldo() {
        double saldo = AccountManager.getInstance().verSaldo(this.clienteId);
        System.out.println("\n" + nome + ", seu saldo atual é: R$" + saldo);
    }
}