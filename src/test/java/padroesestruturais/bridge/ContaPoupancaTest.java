package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaPoupancaTest {

    @Test
    void deveRetornarRendimentoContaPoupancaComClienteBasico() {
        PerfilCliente perfilCliente = new ClienteBasico();
        ContaPoupanca contaPoupanca = new ContaPoupanca(2000.0f);
        contaPoupanca.setPerfilCliente(perfilCliente);
        assertEquals(2000.0f, contaPoupanca.calcularRendimento(), 0.01f);
    }

    @Test
    void deveRetornarRendimentoContaPoupancaComClientePrata() {
        PerfilCliente perfilCliente = new ClientePrata();
        ContaPoupanca contaPoupanca = new ContaPoupanca(2000.0f);
        contaPoupanca.setPerfilCliente(perfilCliente);
        assertEquals(2200.0f, contaPoupanca.calcularRendimento(), 0.01f);
    }

    @Test
    void deveRetornarRendimentoContaPoupancaComClienteOuro() {
        PerfilCliente perfilCliente = new ClienteOuro();
        ContaPoupanca contaPoupanca = new ContaPoupanca(2000.0f);
        contaPoupanca.setPerfilCliente(perfilCliente);
        assertEquals(2400.0f, contaPoupanca.calcularRendimento(), 0.01f);
    }

    @Test
    void deveRetornarRendimentoContaPoupancaComClientePlatina() {
        PerfilCliente perfilCliente = new ClientePlatina();
        ContaPoupanca contaPoupanca = new ContaPoupanca(2000.0f);
        contaPoupanca.setPerfilCliente(perfilCliente);
        assertEquals(2600.0f, contaPoupanca.calcularRendimento(), 0.01f);
    }

}
