Feature: Clinica Veterinária
	
	Scenario: Exame
		Given Dave Atkins traz seu Doberman de estimacao chamado Fofo na clinica para exames de rotina. 
		Then O veterinario cobra dele a consulta de rotina e a vacina contra a raiva, custou '50'.
		Then Dave paga em dinheiro '50' antes de ele sair para o trabalho e lhe a fornecido um recibo de pagamento para os servicos.