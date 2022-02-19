package rp;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class RegistreProject {
	
	
	@Test
	public void registerProjectPadrao() {
		System.setProperty("webdriver.edge.driver", "C:\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		//fazer o login
		driver.get("http://www.lesse.com.br/tools/silverbullet/rp2");
		driver.findElement(By.id("email")).sendKeys("rafaelsdl2.aluno@unipampa.edu.br");
		driver.findElement(By.id("password")).sendKeys("xH$Qn=bKvS");
		driver.findElement(By.id("login-submit")).click();
		
		//adiocionar um projeto com o fluxo "padrão"
		driver.findElement(By.className("btn").className("btn-normal").className("btn-info").className("btn-create")).click();
		
		//CADASTRAR PROJETO
		driver.findElement(By.id("title")).sendKeys("Projeto 1");
		driver.findElement(By.id("description")).sendKeys("Descrição");
		driver.findElement(By.id("objectives")).sendKeys("Objetivo");
		driver.findElement(By.id("new_project-submit")).click();
		
		Assert.assertEquals("Project Projeto 1 has been successfully created!", driver.findElement(By.tagName("strong")).getText());
		
		driver.quit();
	}
	@Test
	public void registerProjectSemTitulo() {
		System.setProperty("webdriver.edge.driver", "C:\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		//fazer o login
		driver.get("http://www.lesse.com.br/tools/silverbullet/rp2");
		driver.findElement(By.id("email")).sendKeys("rafaelsdl2.aluno@unipampa.edu.br");
		driver.findElement(By.id("password")).sendKeys("xH$Qn=bKvS");
		driver.findElement(By.id("login-submit")).click();
		
		//adiocionar um projeto com o fluxo "padrão"
		driver.findElement(By.className("btn").className("btn-normal").className("btn-info").className("btn-create")).click();

		driver.findElement(By.id("new_project-submit")).click();
		
		Assert.assertEquals("",driver.findElement(By.id("title")).getText());
		driver.quit();
	}
	@Test
	public void registerProjectSemTituloComDescricao() {
		System.setProperty("webdriver.edge.driver", "C:\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		//fazer o login
		driver.get("http://www.lesse.com.br/tools/silverbullet/rp2");
		driver.findElement(By.id("email")).sendKeys("rafaelsdl2.aluno@unipampa.edu.br");
		driver.findElement(By.id("password")).sendKeys("xH$Qn=bKvS");
		driver.findElement(By.id("login-submit")).click();
		
		//adiocionar um projeto com o fluxo "padrão"
		driver.findElement(By.className("btn").className("btn-normal").className("btn-info").className("btn-create")).click();
		
		driver.findElement(By.id("description")).sendKeys("Descrição");
		
		driver.findElement(By.id("new_project-submit")).click();
		
		Assert.assertEquals("",driver.findElement(By.id("title")).getText());
		
		driver.quit();

	}
	@Test
	public void registerProjectSemTituloComObservacao() {
		System.setProperty("webdriver.edge.driver", "C:\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		//fazer o login
		driver.get("http://www.lesse.com.br/tools/silverbullet/rp2");
		driver.findElement(By.id("email")).sendKeys("rafaelsdl2.aluno@unipampa.edu.br");
		driver.findElement(By.id("password")).sendKeys("xH$Qn=bKvS");
		driver.findElement(By.id("login-submit")).click();
		
		//adiocionar um projeto com o fluxo "padrão"
		driver.findElement(By.className("btn").className("btn-normal").className("btn-info").className("btn-create")).click();
		
		driver.findElement(By.id("objectives")).sendKeys("Objetivo");
		
		driver.findElement(By.id("new_project-submit")).click();
		
		Assert.assertEquals("",driver.findElement(By.id("title")).getText());
		
		driver.quit();
	}
	@Test
	public void registerProjectSemTituloComDescricaoEndObservacao() {
		System.setProperty("webdriver.edge.driver", "C:\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		//fazer o login
		driver.get("http://www.lesse.com.br/tools/silverbullet/rp2");
		driver.findElement(By.id("email")).sendKeys("rafaelsdl2.aluno@unipampa.edu.br");
		driver.findElement(By.id("password")).sendKeys("xH$Qn=bKvS");
		driver.findElement(By.id("login-submit")).click();
		
		//adiocionar um projeto com o fluxo "padrão"
		driver.findElement(By.className("btn").className("btn-normal").className("btn-info").className("btn-create")).click();
		
		driver.findElement(By.id("description")).sendKeys("Descrição");
		driver.findElement(By.id("objectives")).sendKeys("Objetivo");
		driver.findElement(By.id("new_project-submit")).click();
		
		Assert.assertEquals("",driver.findElement(By.id("title")).getText());
		driver.quit();
		
	}
	
	@Test
	public void registerProjectComCaractereEspeciais() {
		System.setProperty("webdriver.edge.driver", "C:\\drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		//fazer o login
		driver.get("http://www.lesse.com.br/tools/silverbullet/rp2");
		driver.findElement(By.id("email")).sendKeys("rafaelsdl2.aluno@unipampa.edu.br");
		driver.findElement(By.id("password")).sendKeys("xH$Qn=bKvS");
		driver.findElement(By.id("login-submit")).click();
		
		//adiocionar um projeto com o fluxo "padrão"
		driver.findElement(By.className("btn").className("btn-normal").className("btn-info").className("btn-create")).click();
		
		//CADASTRAR PROJETO
		driver.findElement(By.id("title")).sendKeys("@@@@");
		driver.findElement(By.id("description")).sendKeys("Descrição");
		driver.findElement(By.id("objectives")).sendKeys("Objetivo");
		driver.findElement(By.id("new_project-submit")).click();
		
		Assert.assertEquals("", driver.findElement(By.tagName("strong")).getText());
		driver.quit();
	}
}
