/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio5;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author melis
 */
public class InsertarEstudianteFrame {

    Label label_estudiante;
    TextField textField_carnet;
    TextField textField_nombre;
    TextField textField_nota;
    Button button_insertarEstudiante;

    public void start(Stage primaryStage) {

        label_estudiante = new Label("Ingrese los datos del estudiante");

        textField_carnet = new TextField();
        textField_carnet.setText("Carnet");

        textField_nombre = new TextField();
        textField_nombre.setText("Nombre");

        textField_nota = new TextField();
        textField_nota.setText("Nota");

        button_insertarEstudiante = new Button();
        button_insertarEstudiante.setText("Ingresar");
        button_insertarEstudiante.setPrefSize(100, 30);
        button_insertarEstudiante.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
            }
        });

        VBox verticalWindow = new VBox();
        verticalWindow.setSpacing(15);

        verticalWindow.setAlignment(Pos.CENTER);
        verticalWindow.getChildren().addAll(label_estudiante,textField_carnet, textField_nombre, textField_nota, button_insertarEstudiante);

        BorderPane window = new BorderPane();

        window.setCenter(verticalWindow);

        Scene scene = new Scene(window, 300, 300);

        primaryStage.setTitle("Insertar Estudiante");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
