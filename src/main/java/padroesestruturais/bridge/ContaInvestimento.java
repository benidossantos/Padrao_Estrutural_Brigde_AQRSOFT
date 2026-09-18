package padroesestruturais.bridge;

public class ContaInvestimento extends Conta {

    private int numAportes;

    public ContaInvestimento(float saldoBase) {
        super(saldoBase);
    }

    public void setNumAportes(int numAportes) {
        this.numAportes = numAportes;
    }

    public float calcularRendimento() {
        return this.saldoBase * this.numAportes * (1 + this.perfilCliente.percentualRendimento());
    }
}
