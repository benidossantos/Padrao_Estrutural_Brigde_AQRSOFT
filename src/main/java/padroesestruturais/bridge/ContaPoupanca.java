package padroesestruturais.bridge;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(float saldoBase) {
        super(saldoBase);
    }

    public float calcularRendimento() {
        return this.saldoBase * (1 + this.perfilCliente.percentualRendimento());
    }

}
