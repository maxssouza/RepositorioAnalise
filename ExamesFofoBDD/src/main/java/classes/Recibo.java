/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author fernanda.vitorio <- não foi ela, foi o max.neto
 */
public class Recibo {
    Cliente cliente;
    Veterinario veterinario;
    HashMap<String, Double> Servicos;
    
    
    public Recibo(Cliente cliente, Veterinario veterinario){
       Servicos = new HashMap<String, Double>();
       this.cliente = cliente;
       this.veterinario = veterinario;
             
    }
    
    public void AdicionaServico(String servico, Double valor){
        this.Servicos.put(servico, valor);
    }
    public String MostrarServico(){
        String sRetorno = "";
        for(Map.Entry<String, Double> entrada:Servicos.entrySet()){
            sRetorno += "Servico: "+entrada.getKey()+"\n Valor:"+entrada.getValue();
        }
        return sRetorno;
    }
    
    public Double getTotal(){
        Double dRetorno = 0.0;
        for(Map.Entry<String, Double> entrada:Servicos.entrySet()){
            dRetorno += entrada.getValue();
        }
        return dRetorno;
    }
}
