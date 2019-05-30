/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste_de_interface;


import java.util.Random;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

/**
 *
 * @author danpg
 */
public class Resultado {
    private Random resultvalue;
    private Image resultimage;
    private ImageView imagem;
    private Button exit;
    private String message,color;
    public void Display(){
        AudioClip espada = new AudioClip(Resultado.class.getResource("sword.mp3").toString());
        espada.setVolume(0.3);
        espada.play();
        //Display Basics
        Stage window = new Stage();
        window.setMinWidth(300);
        window.setMinHeight(300);
        VBox layout = new VBox();
        layout.setPadding(new Insets(20,20,20,20));
        layout.setSpacing(20);
        Scene cena = new Scene(layout);
        window.setScene(cena);
        //RandomInput
        resultvalue = new Random();
        int res = resultvalue.nextInt(3);
        //ButtonInput
        exit = new Button();
        exit.setMinSize(100, 50);
        exit.setOnAction(e -> window.close());
        //ImageInput
        switch(res){
            case 0:
                resultimage=new Image(Resultado.class.getResourceAsStream("Rock.png"));
                switch(Teste_de_Interface.format){
                    case 0:
                        exit.setText("Not good enought, i'll try again now");
                        message="NOT BAD AT ALL";
                        color="#ff7b00";
                        break;
                    case 1:
                        exit.setText("Hell year i'm too good for this game");
                        message="VICTORY";
                        color="#01bc1a";
                        break;
                    case 2:
                        exit.setText("S.H.I.T. i'll try again now");
                        message="DEFEAT";

                        color="#ff000c";
                        break;
                }
                break;
            case 1:
                resultimage=new Image(Resultado.class.getResourceAsStream("Paper.png"));
                switch(Teste_de_Interface.format){
                    case 0:
                        exit.setText("S.H.I.T., i'll try again now");
                        message="DEFEAT";
                        color="#ff000c";
                        break;
                    case 1:
                        exit.setText("Not good enought, i'll try again now");
                        message="NOT BAD AT ALL";
                        color="#ff7b00";
                        break;
                    case 2:
                        exit.setText("Hell year i'm too good for this game");
                        message="VICTORY";
                        color="#01bc1a";
                        break;
                }
                break;
            case 2:
                resultimage=new Image(Resultado.class.getResourceAsStream("Scissors.png"));
                switch(Teste_de_Interface.format){
                    case 0:
                        exit.setText("Hell year i'm too good for this game");
                        message="VICTORY";
                        color="#01bc1a";
                        break;
                    case 1:
                        exit.setText("S.H.I.T., i'll try again now");
                        message="DEFEAT";
                        color="#ff000c";
                        break;
                    case 2:
                        exit.setText("Not good enought, i'll try again now");
                        message="NOT BAD AT ALL";
                        color="#ff7b00";
                        break;
                }
                break;   
        }
        exit.setStyle("-fx-font-size:20;-fx-text-fill: "+color+";-fx-border-color: "+color+"");
        Label text = new Label(message);
        window.setTitle(message);
        Label uptext = new Label("The oponent choose:");
        uptext.setStyle("-fx-font-size:30");
        text.setStyle("-fx-font-size:30; -fx-text-fill: "+color+"");
        layout.setStyle("-fx-border-color: "+color+"");
        imagem = new ImageView();
        imagem.setImage(resultimage);
        imagem.setFitHeight(200);
        imagem.setFitWidth(200);
        layout.getChildren().addAll(uptext,imagem,text,exit);
        layout.setAlignment(Pos.CENTER);
        cena.getStylesheets().addAll(Teste_de_Interface.class.getResource("fundoresult.css").toExternalForm());
        window.showAndWait();
    }
    
}
