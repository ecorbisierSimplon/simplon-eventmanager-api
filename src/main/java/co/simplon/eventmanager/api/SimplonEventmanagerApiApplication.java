package co.simplon.eventmanager.api;

import java.awt.Desktop;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimplonEventmanagerApiApplication {

    public static void main(String[] args) {
	System.setProperty("java.awt.headless", "false");
	SpringApplication.run(SimplonEventmanagerApiApplication.class, args);
	String myURL = "http://localhost:8080/";

	if (!GraphicsEnvironment.isHeadless()) {
	    try {
		Desktop desktop = Desktop.getDesktop();
		if (desktop.isSupported(Desktop.Action.BROWSE)) {
		    desktop.browse(new URI(myURL));
		} else {
		    System.out.println(
			    "La fonctionnalité d'ouverture d'URL n'est pas prise en charge sur cet environnement.");
		}
	    } catch (IOException | URISyntaxException e) {
		e.printStackTrace();
	    }
	} else {
	    System.out.println(
		    "Environnement headless détecté. Ouvrez l'URL manuellement dans votre navigateur : " + myURL);
	}
    }

}
