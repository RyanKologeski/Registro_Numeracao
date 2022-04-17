package dao;

import model.Data;
import view.ConsultaFrame;
import view.MainFrame;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DataDAO {

    private Data data;
    private MainFrame frame;
    private ConsultaFrame consFrame;

    public boolean salvaRegistro(Data data) throws IOException {

        try{
            File folder = new File("C:/SinanDengue");
            folder.mkdir();
            File file = new File(folder+"/data.txt");

            FileWriter fw = new FileWriter(file,true);
            fw.write(data.toString());
            fw.flush();
            fw.close();
            JOptionPane.showMessageDialog(null, "Registro realizado!");

            return  true;
        }catch (Exception e){
            System.out.println("Erro: Registro não realizado!"+e);

            return false;
        }

    }

    public boolean consultaRegistro(Data data, ConsultaFrame consFrame) throws IOException {
        File file = new File("C:/SinanDengue/data.txt");

        try{
            Scanner scan = new Scanner(file);
            String linha;
            String[] corta = new String[6];
            int consulta = 0;

            while(scan.hasNextLine()){
                linha = scan.nextLine();
                corta = linha.split(";");

                if(data.getCodConsulta().equals(corta[1])){
                    consFrame.getTextAreaConsulta().append(data.imprimeConsulta(corta));
                    consulta += 1;
                }
            }
            if(consulta == 0){
                consFrame.getFieldCodConsulta().setText(null);
                JOptionPane.showMessageDialog(null,"Nenhum registro localizado!");
            }

            return true;
        }catch(Exception e){

            return false;
        }
    }
}
