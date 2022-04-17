package controller;

import model.Data;
import view.ConsultaFrame;
import view.MainFrame;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
        ConsultaFrame consFrame = new ConsultaFrame();
        consFrame.setVisible(false);
        Data data = new Data();
        DataController dataCont = new DataController(frame,consFrame,data);
    }
}
