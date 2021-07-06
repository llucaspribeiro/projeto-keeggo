package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import criarConta.Metodos;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;

public class Login {

	WebDriver driver;

	@Dado("que eu esteja na tela de login")
	public void que_eu_esteja_na_tela_de_login() {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://advantageonlineshopping.com");
	}

	@Quando("informar login e senha")
	public void informar_login_e_senha() throws InterruptedException {
		Thread.sleep(5000);
		WebElement user = driver.findElement(By.id("menuUser"));
		user.click();
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("gitgt");
		Thread.sleep(2000);
		WebElement senha = driver.findElement(By.name("password"));
		senha.sendKeys("E@E1010a");
		WebElement logar = driver.findElement(By.id("sign_in_btnundefined"));
		logar.click();

	}

	@Entao("login realizado com sucesso")
	public void login_realizado_com_sucesso() {

		System.out.println("Usuario Logado com sucesso.");

	}

	@Quando("nao informar login e senha")
	public void nao_informar_login_e_senha() throws InterruptedException {
		Thread.sleep(5000);
		WebElement user = driver.findElement(By.id("menuUser"));
		user.click();
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("");
		Thread.sleep(2000);
		WebElement senha = driver.findElement(By.name("password"));
		senha.sendKeys("");
		WebElement logar = driver.findElement(By.id("sign_in_btnundefined"));
		logar.click();
	}

	@Entao("login nao realizado com sucesso")
	public void login_nao_realizado_com_sucesso() {

		System.out.println("Usuario nao logado.");
	}

	
	@Quando("informar login invalido")
	public void informar_login_invalido() throws InterruptedException {
		Thread.sleep(5000);
		WebElement user = driver.findElement(By.id("menuUser"));
		user.click();
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("iabadabaduuu");
		Thread.sleep(2000);
		WebElement senha = driver.findElement(By.name("password"));
		senha.sendKeys("");
		WebElement logar = driver.findElement(By.id("sign_in_btnundefined"));
		logar.click();
	}

	@Entao("login nao realizado")
	public void login_nao_realizado() {
		System.out.println("Usuario nao logado.");
	}
}
