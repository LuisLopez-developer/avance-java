
package guia1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import clases.Vector;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class Caso2 extends JInternalFrame implements ActionListener{
    private JLabel lbl_titulo, lbl1, lbl2, lbl3, lbl_elaborado;
    private JTextField txt_valor_x, txt_valor_y;
    private JTextArea txt_resultado;
    private JButton btn_aceptar, btn_cerrar;
    
    private JScrollPane scr_resultado;
    
    public Caso2(){
        super();
        
        ConfigurarVentana();
        IniciarComponente();
    }
    
    private void ConfigurarVentana(){
        this.setTitle("SENATI");
        this.setSize(400, 400);
        //this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
    private void IniciarComponente(){
        lbl_titulo = new JLabel();
        lbl_titulo.setText("VECTORES");
        lbl_titulo.setFont(new Font("Consolas", Font.BOLD, 18));
        lbl_titulo.setForeground(new Color(17, 122, 250));
        lbl_titulo.setBounds(20, 20, 100,20);
                
        lbl1 = new JLabel();
        lbl1.setText("Valor X");
        lbl1.setBounds(20, 50, 100, 20);
        
        txt_valor_x = new JTextField();
        txt_valor_x.setBounds(80, 50, 80, 20);
        
        lbl2 = new JLabel();
        lbl2.setText("Valor Y");
        lbl2.setBounds(20, 80, 100, 20);
        
        txt_valor_y = new JTextField();
        txt_valor_y.setBounds(80, 80, 80, 20);

        lbl3 = new JLabel();
        lbl3.setText("Resultados");
        lbl3.setBounds(20, 120, 100, 20);
        
        txt_resultado = new JTextArea();
        txt_resultado.setFont(new Font("Consolas", Font.BOLD, 14));
        txt_resultado.setEditable(false);
        
        scr_resultado = new JScrollPane(txt_resultado,
        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
        JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scr_resultado.setBounds(20, 140, 350, 100);
                
        btn_aceptar = new JButton();
        btn_aceptar.setText("aceptar");
        btn_aceptar.setBounds(60, 300, 120, 30);
        btn_aceptar.addActionListener(this);
        
        btn_cerrar = new JButton();
        btn_cerrar.setText("cerrar");
        btn_cerrar.setBounds(190, 300, 120, 30);
        btn_cerrar.addActionListener(this);
        
        lbl_elaborado = new JLabel();
        lbl_elaborado.setText("Elaborado por Luis lopez");
        lbl_elaborado.setForeground(new Color(255, 0, 0));
        lbl_elaborado.setBounds(120, 335, 150, 20);
        
        this.add(lbl_titulo);
        this.add(lbl1);
        this.add(txt_valor_x);
        this.add(lbl2);
        this.add(txt_valor_y);
        this.add(lbl3);
        this.add(scr_resultado);
        this.add(btn_aceptar);
        this.add(btn_cerrar);
        this.add(lbl_elaborado);
    }
    
    public static void main(String [] args){
        Caso2 caso2 = new Caso2();
        caso2.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn_aceptar){
            
            if(txt_valor_x.getText().length()== 0){
                JOptionPane.showMessageDialog(null, "Digite el valor X");
                txt_valor_x.requestFocus();
                return;
            }
            
            if(txt_valor_y.getText().length()== 0){
                JOptionPane.showMessageDialog(null, "Digite el valor Y");
                txt_valor_y.requestFocus();
                return;
            }
            
            Vector vector = new Vector();
            
            float valor_x = Float.parseFloat(txt_valor_x.getText());
            float valor_y = Float.parseFloat(txt_valor_y.getText());
            
            vector.setValorX(valor_x);
            vector.setValorY(valor_y);
            
            String rpta = "";
            rpta += "Vetor: " + vector.MostrarVector() + "\n";
            rpta += "Modulo: " + vector.CalcularModulo() + "\n";
            rpta += "Ángulo: " + vector.CalcularAngulo() + "\n";
            
            txt_resultado.setText(rpta);
            
        }else if (e.getSource() == btn_cerrar){
            int op = JOptionPane.showConfirmDialog(null, "¿Seguro de cerrar?", "SENATI", JOptionPane.YES_OPTION);
            
            if(op == JOptionPane.YES_OPTION){
                dispose();
            }
        }
        
    }
}