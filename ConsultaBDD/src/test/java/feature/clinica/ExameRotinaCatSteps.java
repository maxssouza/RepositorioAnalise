/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feature.clinica;

import classes.Boleto;
import classes.Cliente;
import classes.Gato;
import classes.Veterinario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import java.util.Date;

/**
 *
 * @author fernanda.vitorio
 */
public class ExameRotinaCatSteps {

    Cliente cliente;
    Veterinario veterinario;
    Boleto boleto;
    
    @Given("(.+) traz seus dois gatos, (.+) e (.+), para serem castrados")
    public void entrarClinica(final String nome, final String nome1, final String nome2) {
        cliente = new Cliente(nome, new Gato(nome1), new Gato(nome2));
    }
    @Then("Traci pega seus gatos naquela noite, mas deseja pagar o valor de '(\\d+)' pelo servico na data de (.+)")
    public void pagarBoleto(final Double valor, final String dataVencimento){
        boleto = new Boleto();
        boleto.setDataVencimento(new Date(dataVencimento));
    }
}
