package Front;

import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Utilities.MatUtilities;
import Utilities.ValidationClass;

public class DescontoABFront extends JFrame {
	private JLabel lbValorA;
	private JLabel lbValorB;
	private JLabel lbResultado;
	private JTextField txtValorA;
	private JTextField txtValorB;
	private JTextField txtResultado;
	private JButton btnResult;

	public DescontoABFront() {
		setSize(500, 300);
		setLocationRelativeTo(null);
		setLayout(null);
		setTitle("Valor era A e paguei B, qual foi o desconto%?");
		createComponents();
		setVisible(true);
	}

	public void createComponents() {
		lbValorA = new JLabel("Valor original (a)");
		lbValorA.setBounds(30, 20, 200, 20);
		getContentPane().add(lbValorA);

		txtValorA = new JTextField();
		txtValorA.setBounds(130, 20, 200, 20);
		getContentPane().add(txtValorA);

		lbValorB = new JLabel("Valor c/ desconto (b)");
		lbValorB.setBounds(10, 50, 200, 20);
		getContentPane().add(lbValorB);

		txtValorB = new JTextField();
		txtValorB.setBounds(130, 50, 200, 20);
		getContentPane().add(txtValorB);

		lbResultado = new JLabel("% desconto");
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

				if (ValidationClass.BbiggherthanA(valorA, valorB)) {
					JOptionPane.showMessageDialog(null, "Valor com desconto não pode ser maior que o original");
				}

				if (ValidationClass.BbiggherthanA(valorA, valorB) == false) {
					double resultado = MatUtilities.ValueDiscWas(valorA, valorB);

					// Definindo o formato para duas casas decimais
					txtResultado.setText(MatUtilities.CasasDecimais(resultado) + "%");
				}

			}
		});
		btnResult.setBounds(130, 90, 200, 20);
		getContentPane().add(btnResult);
	}
}
