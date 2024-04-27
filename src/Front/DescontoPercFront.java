package Front;

import java.awt.Component;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Utilities.MatUtilities;
import Utilities.ValidationClass;

public class DescontoPercFront extends JFrame{
	private JLabel lbValorA;
    private JLabel lbValorB;
    private JLabel lbResultado;
    private JTextField txtValorA;
    private JTextField txtValorB;
    private JTextField txtResultado;
    private JButton btnResult;
	
	public DescontoPercFront() {
		setSize(500, 300);
        setLocationRelativeTo(null);
        setLayout(null);
        setTitle("Aplicar desconto % num valor");
        createComponents();
        setVisible(true);
	}
	
	private void createComponents() {
		lbValorA = new JLabel("Valor inicial R$ (a)");
		lbValorA.setBounds(20, 20, 200, 20);
		getContentPane().add(lbValorA);
		
		txtValorA = new JTextField();
		txtValorA.setBounds(130, 20, 200, 20);
		getContentPane().add(txtValorA);
		
		lbValorB = new JLabel("% desconto (b)");
		lbValorB.setBounds(30, 50, 200, 20);
		getContentPane().add(lbValorB);
		
		txtValorB = new JTextField();
		txtValorB.setBounds(130, 50, 200, 20);
		getContentPane().add(txtValorB);
		
		lbResultado = new JLabel("Resultado");
		lbResultado.setBounds(200, 160, 200, 20);
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

				if (ValidationClass.BiggerZero(valorA, valorB)) {
					JOptionPane.showMessageDialog(null, "Valores não podem ser igual a 0");
				}
				if (ValidationClass.BbiggerthanHundred(valorB)) {
					JOptionPane.showMessageDialog(null, "Desconto não pode ser maior que 100%");
				}
				if (ValidationClass.BiggerZero(valorA, valorB) == false
						&& ValidationClass.BbiggerthanHundred(valorB) == false)
					txtResultado.setText("" + MatUtilities.ApplyDiscValor(valorA, valorB));
			}
		});
		btnResult.setBounds(130, 90, 200, 20);
		getContentPane().add(btnResult);

	}
}
