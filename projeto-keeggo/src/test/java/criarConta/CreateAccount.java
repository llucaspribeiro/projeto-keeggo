package criarConta;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;

public class CreateAccount extends Metodos {

	Metodos metodo = new Metodos();

	By user = By.id("menuUser");
	By createAccount = By.xpath("//a[contains(text(),\"CREATE NEW ACCOUNT\")]");
	By userName = By.name("usernameRegisterPage");
	By email = By.name("emailRegisterPage");
	By password = By.name("passwordRegisterPage");
	By confimrPassword = By.name("confirm_passwordRegisterPage");
	By firstName = By.name("first_nameRegisterPage");
	By lastName = By.name("last_nameRegisterPage");
	By phoneNumber = By.name("phone_numberRegisterPage");
	By country = By.name("countryListboxRegisterPage");
	By city = By.name("cityRegisterPage");
	By address = By.name("addressRegisterPage");
	By province = By.name("state_/_province_/_regionRegisterPage");
	By postalCode = By.name("postal_codeRegisterPage");
	By promocoes = By.name("allowOffersPromotion");
	By concordo = By.name("i_agree");
	By registro = By.id("register_btnundefined");

	String usuario;

	public void criarConta(String email, String password, String confirmPassword, String firstName, String lastName,
			String phoneNumber, String country, String city, String adress, String province, String postalCode) {

		this.usuario = metodo.getNome();

		// clicando no botão user
		metodo.esperarElemento(user, "esperando o botão user ficar acessível");
		metodo.clicar(user, "clicar em user para criar a nova conta");

		// clicando no menu para abrir conta
		metodo.pausa(3000, "");
		metodo.clicar(createAccount, "clicando no menu create a new account");

		// preencher o formulario de abertura de conta
		metodo.esperarElemento(this.userName, "esperando o botão user ficar acessível");
		metodo.escrever(this.userName, this.usuario, "preencher o campo nome");
		System.out.println(this.usuario);
		metodo.escrever(this.email, email, "");
		metodo.escrever(this.password, password, "");
		metodo.escrever(this.confimrPassword, confirmPassword, "");
		metodo.escrever(this.firstName, firstName, "");
		metodo.escrever(this.lastName, lastName, "");
		metodo.escrever(this.country, country, "");
		metodo.escrever(this.city, city, "");
		metodo.escrever(this.address, adress, "");
		metodo.escrever(this.province, province, "");
		metodo.escrever(this.postalCode, postalCode, "");
		metodo.clicar(concordo, "");
		metodo.clicar(registro, "");

	}

	public void validarUser() throws IOException {
		metodo.pausa(3000, "");
		String loginName = driver.findElement(By.cssSelector("#menuUserLink > span")).getText();
		System.out.println("O nome retornado é: " + loginName);
		assertEquals(this.usuario, loginName);
		metodo.screenShot("Cadastro em branco");
		metodo.fechar("*******************finalizando o teste com sucesso*********************");
	}

}
