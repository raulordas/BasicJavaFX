package application;

import javafx.fxml.FXML;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

public class BlurController {
	
	@FXML
    private ImageView imageView;   
	private Ellipse ellipse;

	
	@FXML
    public void setclip() {           
        ellipse = new Ellipse();
//        circle = new Circle((imageView.getFitWidth()));

        ellipse.centerXProperty().setValue(95);
        ellipse.centerYProperty().setValue(70);
        ellipse.radiusXProperty().setValue(70);
        ellipse.radiusYProperty().setValue(70);
        
//        importing and modifying sizes
//    	ellipse.radiusXProperty().setValue(imageView.getFitWidth()*0.1);
//    	ellipse.radiusYProperty().setValue(imageView.getFitHeight()*0.17);
//      ellipse.radiusXProperty().bind(root.widthProperty().multiply(0.8));
//      ellipse.radiusYProperty().bind(root.heightProperty().multiply(0.6));
        
        imageView.setClip(ellipse);
//
////apply a shadow effect.
//        imageView.setEffect(new DropShadow(1200, Color.BLACK));

    }

	@FXML
    public void setblur() {           
             imageView.setEffect(new GaussianBlur(10));
    }
	
	@FXML
	private void handleClose() {
	
	        System.exit(0);
	}
	
}
