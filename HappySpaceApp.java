import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class HappySpaceApp extends Application {

    @Override
    public void start(Stage stage) {
        VBox vbox = new VBox(20);
        Text welcomeText = new Text("Welcome, Aditi!");
        Button jokeButton = new Button("Click for a Joke!");
        Text jokeText = new Text("");

        jokeButton.setOnAction(e -> {
            String[] jokes = {
                "Why don't scientists trust atoms? Because they make up everything!",
                "What do you call a fake noodle? An impasta!",
                "Why did the scarecrow win an award? He was outstanding in his field!",
                "Why don't eggs tell jokes? They'd crack each other up!",
                "What do you call a can opener that doesn't work? A can't opener!"
            };
            int randomIndex = (int) (Math.random() * jokes.length);
            jokeText.setText(jokes[randomIndex]);
        });

        vbox.getChildren().addAll(welcomeText, jokeButton, jokeText);
        Scene scene = new Scene(vbox, 300, 200);
        stage.setTitle("Aditi's Happy Space");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
