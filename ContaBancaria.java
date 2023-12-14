package ExPOO;

public class ContaBancaria {

    private double contaSaldo;
    private String numeroConta;

    public ContaBancaria(String numeroConta) {
        this.numeroConta = numeroConta;
        this.contaSaldo = 0;
    }

    public void depositar(double valor){
        if (valor > 0){
            contaSaldo += valor;
            System.out.println("Depósito de: " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Válor inválido.");
        }
    }

    public void sacar(double valor){
        if (valor > 0 && contaSaldo >= valor){
            contaSaldo -= valor;
            System.out.println("Saque de: " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void exibirSaldo(){
        System.out.println("Saldo atual: " + contaSaldo);
    }

    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("154000");

        contaBancaria.depositar(700);
        contaBancaria.exibirSaldo();

        contaBancaria.sacar(350);
        contaBancaria.exibirSaldo();

        contaBancaria.sacar(275);
        contaBancaria.exibirSaldo();
    }

}
