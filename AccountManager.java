import java.util.HashMap;
import java.util.Map;

public class AccountManager {


    private static final AccountManager instance = new AccountManager();


    private final Map<String, Double> contas = new HashMap<>();

    private AccountManager() {
        contas.put("cliente123", 1000.0);
        contas.put("cliente456", 500.0);
        contas.put("cliente789", 2500.0);
        System.out.println("Uma única instância do AccountManager foi criada.");
    }

    public static AccountManager getInstance() {
        return instance;
    }


    public void depositar(String contaId, double valor) {
        if (contas.containsKey(contaId)) {
            double saldoAtual = contas.get(contaId);
            double novoSaldo = saldoAtual + valor;
            contas.put(contaId, novoSaldo);
            System.out.println("Depósito de R$" + valor + " realizado na conta " + contaId + ". Novo saldo: R$" + novoSaldo);
        } else {
            System.out.println("Erro: Conta " + contaId + " não encontrada.");
        }
    }

    public void sacar(String contaId, double valor) {
        if (contas.containsKey(contaId)) {
            double saldoAtual = contas.get(contaId);
            if (saldoAtual >= valor) {
                double novoSaldo = saldoAtual - valor;
                contas.put(contaId, novoSaldo);
                System.out.println("Saque de R$" + valor + " realizado na conta " + contaId + ". Novo saldo: R$" + novoSaldo);
            } else {
                System.out.println("Erro: Saldo insuficiente na conta " + contaId + ".");
            }
        } else {
            System.out.println("Erro: Conta " + contaId + " não encontrada.");
        }
    }

    public double verSaldo(String contaId) {
        return contas.getOrDefault(contaId, 0.0);
    }

    public void listarContasAtivas() {
        System.out.println("\n--- Contas Ativas ---");
        for (Map.Entry<String, Double> entry : contas.entrySet()) {
            System.out.println("Conta ID: " + entry.getKey() + ", Saldo: R$" + entry.getValue());
        }
    }
}