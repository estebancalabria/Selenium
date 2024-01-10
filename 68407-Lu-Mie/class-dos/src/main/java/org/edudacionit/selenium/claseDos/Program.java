package org.edudacionit.selenium.claseDos;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

public class Program {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bienvenido clase dos");
		WebDriver webBrowser = new ChromeDriver();
		try {
			webBrowser.get("http://www.automationpractice.pl/index.php");

			// Busco un elemento por id
			//// Opcion 1 - Guardo lo que me devuelve el metodo en una variable
			//// WebElement inputSearch = webBrowser.findElement(By.id("search_query_top"));
			//// inputSearch.sendKeys("shirt");

			//// Opcion 2
			webBrowser.findElement(By.id("search_query_top")).sendKeys("shirt");

			// Busco un elemento por Name
			//// Opcion 1 : Encuentro el elemento
		    WebElement botonBuscar = webBrowser.findElement(By.name("submit_search"));
		    botonBuscar.click();

			//// Opcion 2 : Que pasa si el elemento no existe?
			////String nombreBotonBuscar = "submit_search_noexiste";
			////try {				
			////	WebElement botonBuscar = webBrowser.findElement(By.name(nombreBotonBuscar));
			////	botonBuscar.click();
			////} catch (Exception ex) {
			////	System.out.println("El elemento " + nombreBotonBuscar + " no existe");
			////}
		    
		    Thread.sleep(3000);
		    WebElement spanSearchResults = webBrowser.findElement(By.className("heading-counter"));
		    //System.out.println(spanSearchResults.getText());
		    String textoEsperado = "1 result has been found.";
		    if (spanSearchResults.getText().equals(textoEsperado)) {
		    	System.out.println("Obtuve el resultao esperado");
		    } else {
		    	System.out.println("La pagina no me devolvio lo que queria");
		    }
		    

			// Espero antes de cerrar el navegador
			Thread.sleep(7000);
		} finally {
			webBrowser.quit();
		}
	}

}
