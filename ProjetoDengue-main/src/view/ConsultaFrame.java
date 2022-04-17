package view;

import javax.swing.*;

public class ConsultaFrame extends JFrame{
    private MainFrame frame;
    private JPanel consultaFrame;
    private JLabel labelTitle;
    private JMenuBar myMenu;
    private JMenu menuOpcoes;
    private JMenuItem menuItemRegistro;
    private JLabel labelCod;
    private JTextField fieldCodConsulta;
    private JTextArea textAreaConsulta;
    private JScrollPane scrollPaneConsulta;
    private JButton buttonConsultar;
    private JButton buttonNovaConsulta;

    public ConsultaFrame(){
        setContentPane(consultaFrame);
        setBounds(300,300,550,400);
        setResizable(false);
    }

    public JMenuItem getMenuItemRegistro() {
        return menuItemRegistro;
    }

    public void setMenuItemRegistro(JMenuItem menuItemRegistro) {
        this.menuItemRegistro = menuItemRegistro;
    }

    public JTextField getFieldCodConsulta() {
        return fieldCodConsulta;
    }

    public void setFieldCodConsulta(JTextField fieldCodConsulta) {
        this.fieldCodConsulta = fieldCodConsulta;
    }

    public JTextArea getTextAreaConsulta() {
        return textAreaConsulta;
    }

    public void setTextAreaConsulta(JTextArea textAreaConsulta) {
        this.textAreaConsulta = textAreaConsulta;
    }

    public JButton getButtonConsultar() {
        return buttonConsultar;
    }

    public void setButtonConsultar(JButton buttonConsultar) {
        this.buttonConsultar = buttonConsultar;
    }

    public JButton getButtonNovaConsulta() {
        return buttonNovaConsulta;
    }

    public void setButtonNovaConsulta(JButton buttonNovaConsulta) {
        this.buttonNovaConsulta = buttonNovaConsulta;
    }
}
