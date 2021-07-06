package criarConta;

import java.io.IOException;

import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;

public class Steps {

	Metodos metodos = new Metodos();
	CriarConta account = new CriarConta();

	@Dado("que eu esteja na tela de cadastro de cliente")
	public void que_eu_esteja_na_tela_de_cadastro_de_cliente() {

		metodos.abrirNavegador("http://advantageonlineshopping.com/", "CHROME", "acessando site da loja");
	}

	@Quando("informar todos os dados obrigatorios")
	public void informar_todos_os_dados_obrigatorios() throws IOException {

		account.criarConta("e2e@e2e.com.br", "E@E1010a", "E@E1010a", "Lorenzo", "Barbosa", "11945197843", "Brazil",
				"São Paulo", "rua e2e", "SP", "06414000");

	}

	@Entao("cadastro realizado com sucesso")
	public void cadastro_realizado_com_sucesso() throws IOException {

		account.validaUsuario();

	}

	@Quando("informar um dado incorreto")
	public void informar_um_dado_incorreto() throws IOException {
		account.criarConta("e2e@e2", "E@E1010a", "E@E1010a", "Lucas", "Ribeiro", "11945197843", "Brazil", "São Paulo",
				"rua e2e", "SP", "06414000");
		account.screenShot("Cadastro com dado invalido");
	}

	@Entao("cadastro nao realizado")
	public void cadastro_nao_realizado() {

		System.out.println("Cadastro nao realizado");
	}

	@Quando("informar dados em branco")
	public void informar_dados_em_branco() throws IOException {
		account.criarConta("", "", "", "", "", "", "", "",
				"", "", "");
		account.screenShot("Cadastro com dados em branco");
	
	}
}
