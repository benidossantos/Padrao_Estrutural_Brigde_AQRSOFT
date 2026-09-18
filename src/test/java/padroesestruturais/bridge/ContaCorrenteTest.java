package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {

    @Test
    void deveRetornarRendimentoContaCorrenteComClienteBasico() {
        PerfilCliente perfilCliente = new ClienteBasico();
        ContaCorrente contaCorrente = new ContaCorrente(1000.0f);
        contaCorrente.setPerfilCliente(perfilCliente);
        assertEquals(1000.0f, contaCorrente.calcularRendimento(), 0.01f);
    }

    @Test
    void deveRetornarRendimentoContaCorrenteComClientePrata() {
        PerfilCliente perfilCliente = new ClientePrata();
        ContaCorrente contaCorrente = new ContaCorrente(1000.0f);
        contaCorrente.setPerfilCliente(perfilCliente);
        assertEquals(1000.0f, contaCorrente.calcularRendimento(), 0.01f);
    }

    @Test
    void deveRetornarRendimentoContaCorrenteComClienteOuro() {
        PerfilCliente perfilCliente = new ClienteOuro();
        ContaCorrente contaCorrente = new ContaCorrente(1000.0f);
        contaCorrente.setPerfilCliente(perfilCliente);
        assertEquals(1000.0f, contaCorrente.calcularRendimento(), 0.01f);
    }

    @Test
    void deveRetornarRendimentoContaCorrenteComClientePlatina() {
        PerfilCliente perfilCliente = new ClientePlatina();
        ContaCorrente contaCorrente = new ContaCorrente(1000.0f);
        contaCorrente.setPerfilCliente(perfilCliente);
        assertEquals(1000.0f, contaCorrente.calcularRendimento(), 0.01f);
    }

}
