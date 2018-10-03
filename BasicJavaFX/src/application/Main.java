package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
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
    	 * carga la vista fxml 
    	 */
    	
    	FXMLLoader loader = new FXMLLoader(
            getClass().getResource(
                "forest.fxml"
            )
        );
        mypane = (AnchorPane) loader.load();

        /**
         * titula y coloca la escena en el stage
         */
        stage.setTitle("Where's the squirrel?");
        stage.setScene(new Scene(mypane));
        stage.show();
    }
  
    
    /**
     * arranca la aplicación
     * @param args
     */
    
    public static void main(String[] args) {
        launch(args);
    }
    
}