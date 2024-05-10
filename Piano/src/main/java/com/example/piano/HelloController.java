package com.example.piano;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import java.io.File;

public class HelloController {

    @FXML
    private Button keyA;

    @FXML
    private Button keyA_Sharp;

    @FXML
    private Button keyB;

    @FXML
    private Button keyC_Sharp;

    @FXML
    private Button keyD;

    @FXML
    private Button keyD_Sharp;

    @FXML
    private Button keyE;

    @FXML
    private Button keyF;

    @FXML
    private Button keyF_Sharp;

    @FXML
    private Button keyG;

    @FXML
    private Button keyG_Sharp;

    @FXML
    private Button keyHigherC;

    @FXML
    private Button keyLowerC;

    MediaPlayer mediaPlayer;

    @FXML
    void onKeyA_click(ActionEvent event) {
        String fileName = "A.mp3";
        playHitSound(fileName);
    }

    @FXML
    void onKeyB_click(ActionEvent event) {
        String fileName = "B.mp3";
        playHitSound(fileName);
    }

    @FXML
    void onKeyBb_click(ActionEvent event) {
        String fileName = "Bb.mp3";
        playHitSound(fileName);
    }

    @FXML
    void onKeyCSharp_click(ActionEvent event) {
        String fileName = "C_s.mp3";
        playHitSound(fileName);
    }

    @FXML
    void onKeyDSharp_click(ActionEvent event) {
        String fileName = "D_s.mp3";
        playHitSound(fileName);
    }

    @FXML
    void onKeyD_click(ActionEvent event) {
        String fileName = "D.mp3";
        playHitSound(fileName);
    }

    @FXML
    void onKeyE_click(ActionEvent event) {
        String fileName = "E.mp3";
        playHitSound(fileName);
    }

    @FXML
    void onKeyFSharp_click(ActionEvent event) {
        String fileName = "F_s.mp3";
        playHitSound(fileName);
    }

    @FXML
    void onKeyF_click(ActionEvent event) {
        String fileName = "F.mp3";
        playHitSound(fileName);
    }

    @FXML
    void onKeyGSharp_click(ActionEvent event) {
        String fileName = "G_s.mp3";
        playHitSound(fileName);
    }

    @FXML
    void onKeyG_click(ActionEvent event) {
        String fileName = "G.mp3";
        playHitSound(fileName);
    }

    @FXML
    void onKeyHigherC_click(ActionEvent event) {
        String fileName = "C1.mp3";
        playHitSound(fileName);
    }

    @FXML
    void onKeyLowerC_click(ActionEvent event) {
        String fileName = "C.mp3";
        playHitSound(fileName);
    }

    private void playHitSound(String fileName) {
        String path = getClass().getResource(fileName).getPath();
        Media media = new Media(new File(path).toURI().toString());
        mediaPlayer = new MediaPlayer(media);
        mediaPlayer.play();
    }
}
