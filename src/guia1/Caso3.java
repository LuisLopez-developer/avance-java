package guia1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class Caso3 extends JFrame implements ActionListener{
    // controles
    private JDesktopPane dsk_escritorio;
    private JMenuBar mb_principal;
    private JMenu menu_1;
    private JMenuItem mi_caso1, mi_caso2 , mi_salir;
    private JSeparator msp;
    
    // Constructor
   public Caso3(){
       super();
       ConfigurarVentana();
        IniciarComponentes();
   }

    private void ConfigurarVentana() {
        this.setTitle("SENATI");
        this.setSize(600, 500);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void IniciarComponentes() {
        dsk_escritorio = new JDesktopPane();
        mb_principal = new JMenuBar();
        menu_1 = new JMenu("Casos");
        mi_caso1 = new JMenuItem("Ver caso 1");
        mi_caso1.addActionListener(this);
        
        mi_caso2 = new JMenuItem("Ver caso 1");
        mi_caso2.addActionListener(this);
        
        msp = new JSeparator();
        mi_salir = new JMenuItem("Salir");
        mi_salir.addActionListener(this);
        
        menu_1.add(mi_caso1);
        menu_1.add(mi_caso2);
        menu_1.add(msp);
        menu_1.add(mi_salir);
        
        mb_principal.add(menu_1);
        
        this.setJMenuBar(mb_principal);
        this.add(dsk_escritorio);
    }
    
    public static void main(String args[]){
        Caso3 caso3 = new Caso3();
        caso3.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == mi_caso1){
            Caso1 caso1 = new Caso1();
            caso1.show();
        }
    }
}
