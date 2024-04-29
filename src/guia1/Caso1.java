package guia1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Caso1 extends JInternalFrame implements ActionListener{
    private JLabel lbl1;
    private JLabel lbl2;
    private JTextField txt_nombre;
    private JComboBox cbo_programa;
    private JButton btn_aceptar;
    private JButton btn_cerrar;

    
    public Caso1(){
        super();
        
        ConfigurarVentana();
        IniciarComponente();
    }
    
    private void ConfigurarVentana(){
        this.setTitle("SENATI");
        this.setSize(400, 300);
        //this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    private void IniciarComponente()
    {
        lbl1 = new JLabel();
        lbl1.setText("Ingresa Nombre");
        lbl1.setBounds(20, 20, 100, 20);
        
        txt_nombre = new JTextField();
        txt_nombre.setBounds(20, 50, 100, 20);
        
        lbl2 = new JLabel();
        lbl2.setText("Ingresa Nombre");
        lbl2.setBounds(20, 80, 140, 20);
        
        cbo_programa = new JComboBox();
        cbo_programa.setBounds(20, 110, 140, 20);
        
        String[] arr_programa = {"Redes", "IA", "Ofimatica", "base de Datos", "Diseño web"};
     
        
        for (String programa: arr_programa){
            cbo_programa.addItem(programa);
        }
        cbo_programa.setSelectedIndex(-1);
        
        btn_aceptar = new JButton();
        btn_aceptar.setText("aceptar");
        btn_aceptar.setBounds(30, 165, 120, 30);
        btn_aceptar.addActionListener(this);
        
        btn_cerrar = new JButton();
        btn_cerrar.setText("cerrar");
        btn_cerrar.setBounds(160, 165, 120, 30);
        btn_cerrar.addActionListener(this);
        
        this.add(lbl1);
        this.add(txt_nombre);
        this.add(lbl2);
        this.add(cbo_programa);
        this.add(btn_aceptar);
        this.add(btn_cerrar);
    }    

    public static void main(String [] args){
        Caso1 caso1 = new Caso1();
        caso1.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn_aceptar){
            if(txt_nombre.getText().length()== 0){
                JOptionPane.showMessageDialog(null, "Escriba su nombre");
                txt_nombre.requestFocus();
                return;
            }
            
            if(cbo_programa.getSelectedIndex() == -1){
                JOptionPane.showMessageDialog(null, "Selecione un curso");
                cbo_programa.requestFocus();
                return;
            }
            
            String nombre = txt_nombre.getText();
            String programa = (String) cbo_programa.getSelectedItem();
            
            float[] arr_costo = {434.52f, 294.8f, 863.94f, 123.47f, 365.21f}; 
            
            float costo = arr_costo[cbo_programa.getSelectedIndex()];
            
            String mensaje = "";
            mensaje += "Bienvenido \n";
            mensaje += "Nombre: " + nombre + "\n";
            mensaje += "Programa: " + programa + "\n";
            mensaje += "costo: " + costo + "\n";
            
            JOptionPane.showMessageDialog(null, mensaje);
            
        }else if(e.getSource() == btn_cerrar){
            int op = JOptionPane.showConfirmDialog(null, "¿Seguro de cerrar?", "SENATI", JOptionPane.YES_OPTION);
            
            if(op == JOptionPane.YES_OPTION){
                dispose();
            }
            //dispose();
        }
    }
}