package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class HelloController {
        private Squadra sq= new Squadra();

        @FXML
        private TextField nomeGiocatoreField;
        @FXML
        private TextField goalField;
        @FXML
        private CheckBox capitano;
        @FXML
        private TextArea infoLabel;

        @FXML
        protected void aggiungiGiocatore() {
            Giocatori g=new Giocatori(Integer.parseInt(goalField.getText()),nomeGiocatoreField.getText());
            sq.aggiungi(g);

        }

        @FXML
        protected void visualizzaGiocatori() {
            infoLabel.setText(String.valueOf(sq));
        }
/*
        @FXML
        protected void modificaDati() {

        }

        @FXML
        protected void cancellaGiocatore() {

        }

        @FXML
        protected void visualizzaCapitano() {

        }

        @FXML
        protected void visualizzaGoalSopra5() {

        }

        @FXML
        protected void capitanoCasuale() {


        }

        @FXML
        protected void esci() {

            System.exit(0);
        }*/
    }