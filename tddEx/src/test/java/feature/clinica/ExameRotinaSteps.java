package feature.clinica;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ExameRotinaSteps {

	@Given("Dave Atkins traz seu Doberman de estima��o chamado Fofo na cl�nica para exames de rotina")
	public void entrarClinica(){
		System.out.println("Entrou na Clinica Implementa");
	}
	
	@Then("O veterin�rio cobra dele a consulta de rotina e a vacina��o contra a raiva.")
	public void cobrarConsultaEVacina(){
		System.out.println("Cobrou a consulta Implementa");
	}
	
	@Then("Dave paga em dinheiro antes de ele sair para o trabalho e lhe � fornecido um recibo de pagamento para os servi�os.")
	public void pagaEmDinheiroERecebeRecibo(){
		System.out.println("Pagou e vazou Implenta");
	}
	
}
