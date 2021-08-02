package br.ce.waquino.page;
import org.openqa.selenium.By;

import br.ce.waquino.core.BasePage;

public class CampoTreinamentoPage extends BasePage {
	
	public void setNome(String nome) {
		dsl.escrever("elementosForm:nome", nome);
	}
	
	public void setSobrenome(String sobrenome) {
		dsl.escrever("elementosForm:sobrenome", sobrenome);
	}
	
	public void setSexoFeminino() {
		dsl.clicarRadio("elementosForm:sexo:1");
	}
	
	public void setSexoMasculino() {
		dsl.clicarRadio("elementosForm:sexo:0");
	}
	
	public void setComidaCarne() {
		dsl.clicarRadio("elementosForm:comidaFavorita:0");
	}
	
	public void setComidaPizza() {
		dsl.clicarRadio("elementosForm:comidaFavorita:2");
	}
	
	public void setComidaVegetariana() {
		dsl.clicarRadio("elementosForm:comidaFavorita:3");
	}
	
	public void setEscolaridade(String valor) {
		dsl.selecionarCombo("elementosForm:escolaridade", valor);
	}
	
	public void setEsporte(String... valores) {
		for(String valor: valores)
			dsl.selecionarCombo("elementosForm:esportes", valor);
	}
	
	public void cadastrar() {
		dsl.clicarBotao("elementosForm:cadastrar");
	}
	
	public String obterResultadoCadastro() {
		//return dsl.obterTexto("resultado"); 
		return dsl.obterTexto(By.xpath("//*[@id='resultado']/span")); 
	}
	
	public String obterNomeCadastro() {
		//return dsl.obterTexto("descNome"); 
		return dsl.obterTexto(By.xpath("//*[@id='descNome']/span")); 
	}
	
	public String obterSobrenomeCadastro() {
		//return dsl.obterTexto("descSobrenome");
		return dsl.obterTexto(By.xpath("//*[@id='descSobrenome']/span")); 
	}
	
	public String obterSexoCadastro() {
		//return dsl.obterTexto("descSexo");
		return dsl.obterTexto(By.xpath("//*[@id='descSexo']/span")); 
	}
	
	public String obterComidaCadastro() {
		//return dsl.obterTexto("descComida");
		return dsl.obterTexto(By.xpath("//*[@id='descComida']/span")); 
	}
	
	public String obterEscolaridadeCadastro() {
		//return dsl.obterTexto("descEscolaridade"); 
		return dsl.obterTexto(By.xpath("//*[@id='descEscolaridade']/span")); 
	}
	
	public String obterEsporteCadastro() {
		//return dsl.obterTexto("descEsportes");
		return dsl.obterTexto(By.xpath("//*[@id='descEsportes']/span")); 
	}
		
	
}
