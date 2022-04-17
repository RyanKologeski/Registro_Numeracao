package view;

import javax.swing.*;

public class MainFrame extends JFrame {

    private JPanel mainFrame;
    private JLabel labelTitle;
    private JMenuBar myMenu;
    private JLabel labelMunicipio;
    private JTextField fieldMunicipio;
    private JMenu menuOpcoes;
    private JMenuItem menuItemConsulta;
    private JLabel labelCod;
    private JTextField fieldCod;
    private JLabel labelCrs;
    private JTextField fieldCrs;
    private JLabel labelNumeracao;
    private JTextField fieldNumeracao;
    private JLabel labelEmail;
    private JTextField fieldEmail;
    private JButton buttonSalvar;
    private JLabel labelQtdNumeracao;
    private JTextField fieldQtdNumeracao;

    public MainFrame(){
        setContentPane(mainFrame);
        setBounds(300,300,450,300);
        setResizable(false);
    }

    public JTextField getFieldMunicipio() {
        return fieldMunicipio;
    }

    public void setFieldMunicipio(JTextField fieldMunicipio) {
        this.fieldMunicipio = fieldMunicipio;
    }

    public JTextField getFieldCod() {
        return fieldCod;
    }

    public void setFieldCod(JTextField fieldCod) {
        this.fieldCod = fieldCod;
    }

    public JTextField getFieldCrs() {
        return fieldCrs;
    }

    public void setFieldCrs(JTextField fieldCrs) {
        this.fieldCrs = fieldCrs;
    }

    public JTextField getFieldNumeracao() {
        return fieldNumeracao;
    }

    public void setFieldNumeracao(JTextField fieldNumeracao) {
        this.fieldNumeracao = fieldNumeracao;
    }

    public JTextField getFieldQtdNumeracao() {
        return fieldQtdNumeracao;
    }

    public void setFieldQtdNumeracao(JTextField fieldQtdNumeracao) {
        this.fieldQtdNumeracao = fieldQtdNumeracao;
    }

    public JTextField getFieldEmail() {
        return fieldEmail;
    }

    public void setFieldEmail(JTextField fieldEmail) {
        this.fieldEmail = fieldEmail;
    }

    public JButton getButtonSalvar() {
        return buttonSalvar;
    }

    public void setButtonSalvar(JButton buttonSalvar) {
        this.buttonSalvar = buttonSalvar;
    }

    public JMenuItem getMenuItemConsulta() {
        return menuItemConsulta;
    }

    public void setMenuItemConsulta(JMenuItem menuItemConsulta) {
        this.menuItemConsulta = menuItemConsulta;
    }

    public void limpaMainFrame(){
        getFieldMunicipio().setText(null);
        getFieldCod().setText(null);
        getFieldCrs().setText(null);
        getFieldNumeracao().setText(null);
        getFieldQtdNumeracao().setText(null);
        getFieldEmail().setText(null);
    }

    public boolean campoBranco(){
        if(getFieldMunicipio().getText().isEmpty() || getFieldCod().getText().isEmpty() ||
                getFieldCrs().getText().isEmpty() || getFieldQtdNumeracao().getText().isEmpty() ||
                getFieldNumeracao().getText().isEmpty() || getFieldEmail().getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Campo em branco!");
            return true;
        }
        else{
            return false;
        }
    }

}
