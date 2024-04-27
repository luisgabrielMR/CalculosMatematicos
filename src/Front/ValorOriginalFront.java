package Front;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Utilities.MatUtilities;
import Utilities.ValidationClass;

public class ValorOriginalFront extends JFrame {
	private JLabel lbValorA;
	private JLabel lbValorB;
	private JLabel lbResultado;
	private JTextField txtValorA;
	private JTextField txtValorB;
	private JTextField txtResultado;
	private JButton btnResult;

	public ValorOriginalFront() {
		setSize(500, 300);
		setLocationRelativeTo(null);
		setLayout(null);
		setTitle("Qual era o valor original?");
		createComponents();
		setVisible(true);
	}

	public void createComponents() {
		lbValorA = new JLabel("Valor final R$ (a)");
		lbValorA.setBounds(30, 20, 200, 20);
		getContentPane().add(lbValorA);

		txtValorA = new JTextField();
		txtValorA.setBounds(130, 20, 200, 20);
		getContentPane().add(txtValorA);

		lbValorB = new JLabel("% desconto (b)");
		lbValorB.setBounds(40, 50, 200, 20);
		getContentPane().add(lbValorB);

		txtValorB = new JTextField();
		txtValorB.setBounds(130, 50, 200, 20);
		getContentPane().add(txtValorB);

		lbResultado = new JLabel("Valor inicial");
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

				if (ValidationClass.BbiggerthanHundred(valorB)) {
					JOptionPane.showMessageDialog(null, "Valor de desconto não pode ser maior que 100%");
				}
				if (ValidationClass.BbiggerthanHundred(valorB)==false) {

					double resultado = MatUtilities.OriginalValue(valorA, valorB);

					// Definindo o formato para duas casas decimais
					txtResultado.setText("R$"+MatUtilities.CasasDecimais(resultado));
				}
			}
		});
		btnResult.setBounds(130, 90, 200, 20);
		getContentPane().add(btnResult);
	}
}
