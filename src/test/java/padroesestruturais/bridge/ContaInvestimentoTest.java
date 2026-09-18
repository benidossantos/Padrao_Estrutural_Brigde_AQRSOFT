package padroesestruturais.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaInvestimentoTest {

    @Test
    void deveRetornarRendimentoContaInvestimentoComClienteBasico() {
        PerfilCliente perfilCliente = new ClienteBasico();
        ContaInvestimento contaInvestimento = new ContaInvestimento(50.0f);
        contaInvestimento.setPerfilCliente(perfilCliente);
        contaInvestimento.setNumAportes(2);
        assertEquals(100.0f, contaInvestimento.calcularRendimento(), 0.01f);
    }

    @Test
    void deveRetornarRendimentoContaInvestimentoComClientePrata() {
        PerfilCliente perfilCliente = new ClientePrata();
        ContaInvestimento contaInvestimento = new ContaInvestimento(50.0f);
        contaInvestimento.setPerfilCliente(perfilCliente);
        contaInvestimento.setNumAportes(2);
        assertEquals(110.0f, contaInvestimento.calcularRendimento(), 0.01f);
    }

    @Test
    void deveRetornarRendimentoContaInvestimentoComClienteOuro() {
        PerfilCliente perfilCliente = new ClienteOuro();
        ContaInvestimento contaInvestimento = new ContaInvestimento(50.0f);
        contaInvestimento.setPerfilCliente(perfilCliente);
        contaInvestimento.setNumAportes(2);
        assertEquals(120.0f, contaInvestimento.calcularRendimento(), 0.01f);
    }

    @Test
    void deveRetornarRendimentoContaInvestimentoComClientePlatina() {
        PerfilCliente perfilCliente = new ClientePlatina();
        ContaInvestimento contaInvestimento = new ContaInvestimento(50.0f);
        contaInvestimento.setPerfilCliente(perfilCliente);
        contaInvestimento.setNumAportes(2);
        assertEquals(130.0f, contaInvestimento.calcularRendimento(), 0.01f);
    }

}
