package feature.clinica;

import classes.Cachorro;
import classes.Cliente;
import classes.Recibo;
import classes.Veterinario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class ExameRotinaSteps {

    Cliente cliente;
    Veterinario veterinario;
    Recibo recibo;

    @Given("(.+) traz seu Doberman de estimacao chamado (.+) na clinica para exames de rotina")
    public void entrarClinica(final String nome, final String nomeA) {
        cliente = new Cliente(nome, new Cachorro(nomeA));

    }

    @Then("O veterinario cobra dele a consulta de rotina e a (.+) contra a raiva, custou '(\\d+)'")
    public void cobrarConsultaEVacina(final String nomeServico, final Double valorServ) {
        veterinario = new Veterinario("Jo�o Roberto");
        recibo = new Recibo(cliente, veterinario);
        recibo.AdicionaServico(nomeServico, valorServ);
    }

    @Then("Dave paga em dinheiro '(\\d+)' antes de ele sair para o trabalho e lhe a fornecido um recibo de pagamento para os servicos")
    public void pagaEmDinheiroERecebeRecibo(final Double valorPago) {
        Assert.assertTrue("O cliente n�o pagou esse valor", valorPago >= recibo.getTotal());
    }

}
