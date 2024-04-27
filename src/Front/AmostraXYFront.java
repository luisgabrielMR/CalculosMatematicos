package Front;

import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Utilities.MatUtilities;

public class AmostraXYFront extends JFrame{
	private JLabel lbValorA;
    private JLabel lbValorB;
    private JLabel lbResultado;
    private JTextField txtValorA;
    private JTextField txtValorB;
    private JTextField txtResultado;
    private JButton btnResult;
	
	public AmostraXYFront() {
		setSize(500, 300);
        setLocationRelativeTo(null);
        setLayout(null);
        setTitle("Amostragem 2 - Quanto X representa de Y");
        createComponents();
        setVisible(true);
	}
	
	private void createComponents() {
		lbValorA = new JLabel("Total (X)");
		lbValorA.setBounds(70, 20, 200, 20);
		getContentPane().add(lbValorA);
		
		txtValorA = new JTextField();
		txtValorA.setBounds(130, 20, 200, 20);
		getContentPane().add(txtValorA);
		
		lbValorB = new JLabel("Parte (Y)");
		lbValorB.setBounds(70, 50, 200, 20);
		getContentPane().add(lbValorB);
		
		txtValorB = new JTextField();
		txtValorB.setBounds(130, 50, 200, 20);
		getContentPane().add(txtValorB);
		
		lbResultado = new JLabel("Corresponde a");
		lbResultado.setBounds(180, 160, 200, 20);
		getContentPane().add(lbResultado);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(130, 190, 200, 20);
		getContentPane().add(txtResultado);
		
		btnResult = new JButton(new AbstractAction("Calcular") {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//Transforma o valor de string em double
				double valorA = Double.parseDouble(txtValorA.getText());
				double valorB = Double.parseDouble(txtValorB.getText());
				
				double resultado = MatUtilities.SamplingTwo(valorA, valorB);

		        // Definindo o formato para duas casas decimais
		        DecimalFormat df = new DecimalFormat("#.##");
		        
		        String resultadoFormatado = df.format(resultado);
				
		        txtResultado.setText(""+resultadoFormatado+"%");

				
			}
		});
		btnResult.setBounds(130, 90, 200, 20);
		getContentPane().add(btnResult);
		
	}
}
