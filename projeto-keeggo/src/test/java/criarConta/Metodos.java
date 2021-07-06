package criarConta;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Metodos {

	public static WebDriver driver;

	public static WebDriver adriver() {

		return driver;
	}

	/**
	 * Metodo responsavel por abrir navegador
	 * 
	 * @author Lucas-Admin
	 * @param site
	 * @param navegador
	 * @param descricao
	 */

	public void abrirNavegador(String site, String navegador, String descricao) {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(site);

	}

	/**
	 * Clicar no elemento
	 * 
	 * @author Lucas-Admin
	 * @param elemento
	 * @param descricao
	 */
	public void clicar(By elemento, String descricao) {

		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println("***** Erro ***** no passo " + descricao + " " + e);
		}

	}

	/**
	 * Escrever no elemento
	 * 
	 * @author Lucas-Admin
	 * @param elemento
	 * @param texto
	 * @param descricao
	 */

	public void preencher(By elemento, String texto, String descricao) {

		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("***** Erro ***** no passo " + descricao + " " + e);

		}

	}

	/**
	 * Pausa o teste
	 * 
	 * @author Lucas-Admin
	 * @param tempo
	 * @param descricao
	 */
	public void pausarElemento(int tempo, String descricao) {

		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			System.out.println("***** Erro ***** no passo " + descricao + " " + e);

		}

	}

	/**
	 * Aguardar o elemento ficar disponível
	 * 
	 * @author Lucas-Admin
	 * @param elemento
	 * @param descricao
	 */
	public void esperarElemento(By elemento, String descricao) {

		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));
		} catch (Exception e) {
			System.out.println("***** Erro ***** no passo " + descricao + " " + e);

		}
	}

	public void fechar(String descricao) {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println("****** error ****** no passo " + descricao + " " + e);
		}
	}

	private static Random rand = new Random();
	private static char[] letras = "abcdefghijlmnopqrstuvxz".toCharArray();

	public String getNome() {

		StringBuffer generatedString = new StringBuffer();
		for (int i = 0; i < 5; i++) {
			int ch = rand.nextInt(letras.length);
			generatedString.append(letras[ch]);
		}
		return generatedString.toString();

	}

	public void screenShot(String nomeSrc) throws IOException {

		TakesScreenshot srcShot = ((TakesScreenshot) adriver());
		File scrFile = srcShot.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./Evidencias/" + nomeSrc + ".png");
		FileUtils.copyFile(scrFile, destFile);
	}
}
