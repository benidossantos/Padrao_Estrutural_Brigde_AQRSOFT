package padroesestruturais.bridge;

public class ContaCorrente extends Conta {

    public ContaCorrente(float saldoBase) {
        super(saldoBase);
    }

    public float calcularRendimento() {
        return this.saldoBase;
    }
}
