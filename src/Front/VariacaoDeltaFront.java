package Front;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VariacaoDeltaFront extends JFrame{
	private JLabel lbValorA;
    private JLabel lbValorB;
    private JLabel lbResultado;
    private JTextField txtValorA;
    private JTextField txtValorB;
    private JTextField txtResultado;
    private JButton btnResult;
	
	public VariacaoDeltaFront() {
		setSize(500, 300);
        setLocationRelativeTo(null);
        setLayout(null);
        setTitle("Variação Delta(%) - diferença % entre valores");
        createComponents();
        setVisible(true);
	}
	
	public void createComponents() {
		lbValorA = new JLabel("Valor inicial (a)");
		lbValorA.setBounds(40, 20, 200, 20);
		getContentPane().add(lbValorA);
		
		txtValorA = new JTextField();
		txtValorA.setBounds(130, 20, 200, 20);
		getContentPane().add(txtValorA);
		
		lbValorB = new JLabel("Valor final (b)");
		lbValorB.setBounds(50, 50, 200, 20);
		getContentPane().add(lbValorB);
		
		txtValorB = new JTextField();
		txtValorB.setBounds(130, 50, 200, 20);
		getContentPane().add(txtValorB);
		
		lbResultado = new JLabel("Diferença %");
		lbResultado.setBounds(200, 160, 200, 20);
		getContentPane().add(lbResultado);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(130, 190, 200, 20);
		getContentPane().add(txtResultado);
		
		btnResult = new JButton(new AbstractAction("Calcular") {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		btnResult.setBounds(130, 90, 200, 20);
		getContentPane().add(btnResult);
	}
}
