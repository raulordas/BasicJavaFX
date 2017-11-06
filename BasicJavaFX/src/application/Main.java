package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class Main extends Application {

	private Pane mypane;
	
	/**
	 * modifica el método start de la clase principal
	 */
	
    @Override
    public void start(Stage stage) throws IOException {
    
    	/**
    	 * carga la vista fxml y opcionalmente un controlador para inicializar algún componente
    	 * sobre el panel mypane colocamos la vista   
    	 */
    	
    	FXMLLoader loader = new FXMLLoader(
            getClass().getResource(
                "../view/forest.fxml"
            )
        );
    	loader.setController(new SetBlur());
        mypane = (Pane) loader.load();

        /**
         * titula el stage y añade la escena al stage
         */
        stage.setTitle("Where's the squirrel?");
        stage.setScene(new Scene(mypane));
        stage.show();
    }
   
    /**
     * la clase controladora que añade un efecto a la imagen
     */
    class SetBlur {
    	
    	@FXML
        private ImageView imageView;       

/**
 * la etiqueta FXML permite acceder al componente imageView ya creado en fxml
 */
    	@FXML
        public void initialize() {           
                 imageView.setEffect(new GaussianBlur(5));
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