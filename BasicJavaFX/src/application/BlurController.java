package application;

import javafx.fxml.FXML;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;

public class BlurController {
	
	@FXML
    private ImageView imageView;       

/**
* inicializa al igual que el constructor pero permite acceder al componente imageView ya creado en fxml
*/
	@FXML
    public void setblur() {           
             imageView.setEffect(new GaussianBlur(10));
    }
	
	@FXML
	private void handleClose() {
	
	        System.exit(0);
	}
	
}
