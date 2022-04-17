package controller;

import dao.DataDAO;
import model.Data;
import view.ConsultaFrame;
import view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class DataController implements ActionListener {

    private MainFrame frame;
    private Data data;
    private ConsultaFrame consFrame;
    private DataDAO dataDao;

    public DataController(MainFrame frame, ConsultaFrame consFrame, Data data){
        this.frame = frame;
        this.consFrame = consFrame;
        this.data = data;
        dataDao = new DataDAO();
        this.frame.getButtonSalvar().addActionListener(this);
        this.frame.getMenuItemConsulta().addActionListener(this);
        this.consFrame.getButtonConsultar().addActionListener(this);
        this.consFrame.getButtonNovaConsulta().addActionListener(this);
        this.consFrame.getMenuItemRegistro().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Salvar")){
            try {
                registraDados();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        else if(e.getSource() == frame.getMenuItemConsulta()){
            trocaJanelaConsulta();
        }
        else if(e.getActionCommand().equals("Consultar")){
            try {
                data.setCodConsulta(consFrame.getFieldCodConsulta().getText());
                dataDao.consultaRegistro(data, consFrame);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        else if(e.getActionCommand().equals("Nova Consulta")){
            consFrame.getTextAreaConsulta().setText(null);
            consFrame.getFieldCodConsulta().setText(null);
        }
        else if(e.getSource() == consFrame.getMenuItemRegistro()){
            trocaJanelaMain();
        }
    }

    public void registraDados() throws IOException {
        if(!frame.campoBranco()){
            data.setMunicipio(frame.getFieldMunicipio().getText());
            data.setCod(Integer.parseInt(frame.getFieldCod().getText()));
            data.setCrs(Integer.parseInt(frame.getFieldCrs().getText()));
            data.setQtdNumeracao(Integer.parseInt(frame.getFieldQtdNumeracao().getText()));
            data.setNumeracao(frame.getFieldNumeracao().getText());
            data.setEmail(frame.getFieldEmail().getText());

            dataDao.salvaRegistro(data);
            frame.limpaMainFrame();
        }
    }

    public void trocaJanelaConsulta(){
        frame.setVisible(false);
        consFrame.setVisible(true);
    }

    public void trocaJanelaMain(){
        consFrame.setVisible(false);
        frame.setVisible(true);
    }
}
