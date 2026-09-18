package padroesestruturais.bridge;

public abstract class Conta {

    protected PerfilCliente perfilCliente;

    protected float saldoBase;

    public Conta(float saldoBase) {
        this.saldoBase = saldoBase;
    }

    public void setPerfilCliente(PerfilCliente perfilCliente) {
        this.perfilCliente = perfilCliente;
    }

    public void setSaldoBase(float saldoBase) {
        this.saldoBase = saldoBase;
    }

    public abstract float calcularRendimento();
}
