public class ContaCorrente {
    private double saldo;

    public ContaCorrente(){
        zeraSaldo();
    }

    private void zeraSaldo(){
        saldo = 0;
    }

    public double saque(double valor) {
        if (getSaldo() <= 0) {
            System.out.println("Saldo insulficiente");
        }else {
            setSaldo(getSaldo() - valor);
        }
        return getTotal();
    }

    public double depositar(double valor) {
        if (valor <= 10) {
            if (valor > 0) {
                setSaldo(getSaldo() + valor);
            }
        }
        return getTotal();
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTotal(){
        return saldo;
    }
}
