package Front;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import Utilities.PasswordUtilities;
public class GeradorSenhaFront extends JFrame{
	private JLabel lbMaiuscula;
	private JLabel lbMinuscula;
	private JLabel lbNumeros;
	private JLabel lbSimbolos;
	private JLabel lbTamanho;
	private JLabel lbSenha;
	private JCheckBox cbMaiuscula;
	private JCheckBox cbMinuscula;
	private JCheckBox cbNumeros;
	private JCheckBox cbSimbolos;
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
		//LEGENDAS
		lbMaiuscula = new JLabel("Maiúscula");
		lbMaiuscula.setBounds(40, 20, 100, 10);
		getContentPane().add(lbMaiuscula);
		
		lbMinuscula = new JLabel("Minúscula");
		lbMinuscula.setBounds(200, 20, 100, 10);
		getContentPane().add(lbMinuscula);
		
		lbNumeros = new JLabel("Números");
		lbNumeros.setBounds(40, 40, 100, 10);
		getContentPane().add(lbNumeros);
		
		lbSimbolos = new JLabel("Símbolos");
		lbSimbolos.setBounds(200, 40, 100, 10);
		getContentPane().add(lbSimbolos);
		
		lbTamanho = new JLabel("Tamanho");
		lbTamanho.setBounds(40, 80, 100, 10);
		getContentPane().add(lbTamanho);
		
		lbSenha = new JLabel("Senha");
		lbSenha.setBounds(40, 200, 100, 10);
		getContentPane().add(lbSenha);
		
		//CHECK-BOX
		cbMaiuscula = new JCheckBox();
		cbMaiuscula.setBounds(20, 15, 20, 20);
		getContentPane().add(cbMaiuscula);
		
		cbMinuscula = new JCheckBox();
		cbMinuscula.setBounds(180, 15, 20, 20);
		getContentPane().add(cbMinuscula);
		
		cbNumeros = new JCheckBox();
		cbNumeros.setBounds(20, 35, 20, 20);
		getContentPane().add(cbNumeros);
		
		cbSimbolos = new JCheckBox();
		cbSimbolos.setBounds(180, 35, 20, 20);
		getContentPane().add(cbSimbolos);
		
		spTamanho = new JSpinner();
		spTamanho.setBounds(100, 75, 200, 20);
		getContentPane().add(spTamanho);
		
		btnGerar = new JButton(new AbstractAction("Gerar") {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Object ObjTamanho = spTamanho.getValue();
				int Tamanho = Integer.parseInt(ObjTamanho.toString());
		        boolean BLMaiuscula = cbMaiuscula.isSelected();
		        boolean BLMinuscula = cbMinuscula.isSelected();
		        boolean BLNumeros = cbNumeros.isSelected();
		        boolean BLSimbolos = cbSimbolos.isSelected();

				txtSenha.setText(PasswordUtilities.KeyGenerator(Tamanho, BLMaiuscula, BLMinuscula, BLNumeros, BLSimbolos));

				
				
			}
		});
		btnGerar.setBounds(350, 75, 100, 20);
		getContentPane().add(btnGerar);
		
		txtSenha = new JTextField();
		txtSenha.setBounds(80, 200, 350, 20);
		getContentPane().add(txtSenha);
	}
}
