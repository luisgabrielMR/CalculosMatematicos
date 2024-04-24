package Front;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class GeradorSenhaFront extends JFrame{
	private JLabel lbMaiuscula;
	private JLabel lbMinuscula;
	private JLabel lbNumeros;
	private JLabel lbSimbolos;
	private JLabel lbTamanho;
	private JLabel lbSenha;
	private JComboBox<Boolean> cbMaiuscula;
	private JComboBox<Boolean> cbMinuscula;
	private JComboBox<Boolean> cbNumeros;
	private JComboBox<Boolean> cbSimbolos;
	private JSpinner spTamanho;
	private JButton btnGerar;
	private JTextField txtSenha;
	
	public GeradorSenhaFront() {
		setSize(500, 300);
        setLocationRelativeTo(null);
        setLayout(null);
        setTitle("Gerador de Senha");
        createComponents();
        setVisible(true);
	}
	
	public void createComponents() {
		
	}
}
