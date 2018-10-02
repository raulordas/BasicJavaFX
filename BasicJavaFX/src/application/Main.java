package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

	private AnchorPane mypane;
	
	/**
	 * crea el Stage
	 */
	
    @Override
    public void start(Stage stage) throws IOException {
    
    	/**
    	 * carga el controlador y la vista fxml 
    	 */
    	
    	FXMLLoader loader = new FXMLLoader(
            getClass().getResource(
                "forest.fxml"
            )
        );
//    	loader.setController(new SetBlur());
        mypane = (AnchorPane) loader.load();

        /**
         * titula y coloca la escena en el stage
         */
        stage.setTitle("Where's the squirrel?");
        stage.setScene(new Scene(mypane));
        stage.show();
    }
   

    	
    /**
     * la clase controladora que añade un efecto a la imagen
     */
    private class SetBlur {
    	
    	@FXML
        private ImageView imageView;       

/**
 * inicializa al igual que el constructor pero permite acceder al componente imageView ya creado en fxml
 */
    	@FXML
        public void initialize() {           
                 imageView.setEffect(new GaussianBlur(10));
        }
    	
    }
   

    


    /**
     * arranca la aplicación
     * @param args
     */
    
    public static void main(String[] args) {
        launch(args);
    }
    
}