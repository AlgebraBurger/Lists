import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.Window;

/**
 * Created by Butchokoi on 1/17/2016.
 */
public class Main extends Application {

    Stage window;
    Scene scene;
    Button button;

    public static void main(String[] args){

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        window.setTitle("JavaFx - ChoiceBox Demo");
        button = new Button("Click Me");

        ChoiceBox<String> choiceBox = new ChoiceBox<>();

        //getItems returns the ObeservableList oject which you can add items to
        choiceBox.getItems().add("Apples");
        choiceBox.getItems().add("Banana");
        choiceBox.getItems().add("Jackfruit");
        choiceBox.getItems().addAll("Orange","Guava");

        //set Default Value
        choiceBox.setValue("Apples");

        button.setOnAction(e->getChoice(choiceBox));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(button,choiceBox);


        scene = new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
    }

    private void getChoice(ChoiceBox<String> choiceBox){
        String food = choiceBox.getValue();
        System.out.print(food);
    }
}
