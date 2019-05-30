/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste_de_interface;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author danpg
 */
public class Teste_de_Interface extends Application{

    Button rockButton,paperButton,scissorsButton;
    public static void main(String[] args) {
        launch(args);
    }
        static int format;

    @Override
    public void start(Stage primarystage) throws Exception {
        primarystage = new Stage();
        primarystage.setTitle("Epic Rock Paper Scissors");
        primarystage.setMaximized(false);
        
        VBox layout = new VBox();
        layout.setPadding(new Insets(20,20,20,20));
        layout.setSpacing(10);
        layout.setAlignment(Pos.CENTER);
        
        HBox buttons = new HBox();
        buttons.setPadding(new Insets(20,20,20,20));
        layout.setSpacing(10);
        buttons.setAlignment(Pos.CENTER);
        
        ImageView rock = new ImageView(new Image(Teste_de_Interface.class.getResourceAsStream("Rock.png")));
        rock.setFitHeight(50);
        rock.setFitWidth(50);
        ImageView paper = new ImageView(new Image(Teste_de_Interface.class.getResourceAsStream("Paper.png")));
        paper.setFitHeight(50);
        paper.setFitWidth(50);
        ImageView scissors = new ImageView(new Image(Teste_de_Interface.class.getResourceAsStream("Scissors.png")));
        scissors.setFitHeight(50);
        scissors.setFitWidth(50);
        
        //Botões
        rockButton = new Button("Rock",rock);
        rockButton.setStyle("-fx-font-size:15");
        rockButton.setOnAction(e ->{
            format = 0;
            Resultado res = new Resultado();
            res.Display();
        });
        paperButton = new Button("Paper",paper);
        paperButton.setStyle("-fx-font-size:15");
        paperButton.setOnAction(e ->{
            format = 1;
            Resultado res = new Resultado();
            res.Display();
        });
        
        scissorsButton = new Button("Scissors",scissors);
        scissorsButton.setStyle("-fx-font-size:15");
        scissorsButton.setOnAction(e ->{
            format = 2;
            Resultado res = new Resultado();
            res.Display();
        });
        Label text = new Label("Choose your weapon for this game");
        Label othertext = new Label("GAME: Fight for your life");
        othertext.setStyle("-fx-font-size:30;-fx-text-fill: #e21212");
        text.setStyle("-fx-font-size:20; -fx-text-fill: #ffa100");
        buttons.getChildren().addAll(rockButton,paperButton,scissorsButton);
        layout.getChildren().addAll(othertext,text);
        BorderPane entirelayout = new BorderPane();
        entirelayout.setTop(layout);
        entirelayout.setBottom(buttons);
        Scene cena = new Scene(entirelayout,500,250);
        //entirelayout.getStylesheets().addAll(Teste_de_Interface.class.getResource("fundo.css").toExternalForm());
        cena.getStylesheets().addAll(Teste_de_Interface.class.getResource("fundo.css").toExternalForm());
        primarystage.setMaxWidth(500);
        primarystage.setMaxHeight(250);
        primarystage.setMinWidth(500);
        primarystage.setMinHeight(250);
        
        
        primarystage.setScene(cena);
        primarystage.show();
    }
}
