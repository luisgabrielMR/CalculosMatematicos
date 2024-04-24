package Front;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RegraDeTresFront extends JFrame{
	private JLabel lbValorA;
    private JLabel lbValorB;
    private JLabel lbR1;
    private JLabel lbR2;
    private JLabel lbResultado;
    private JTextField txtValorA;
    private JTextField txtValorB;
    private JTextField txtR1;
    private JTextField txtR2;
    private JTextField txtResultado;
    private JButton btnResult;
	
	public RegraDeTresFront() {
		setSize(500, 300);
        setLocationRelativeTo(null);
        setLayout(null);
        setTitle("Regra de três");
        createComponents();
        setVisible(true);
	}
	
	public void createComponents() {
		lbValorA = new JLabel("a: ");
		lbValorA.setBounds(20, 20, 200, 20);
		getContentPane().add(lbValorA);
		
		txtValorA = new JTextField();
		txtValorA.setBounds(40, 20, 200, 20);
		getContentPane().add(txtValorA);
		
		lbValorB = new JLabel("b: ");
		lbValorB.setBounds(20, 50, 200, 20);
		getContentPane().add(lbValorB);
		
		txtValorB = new JTextField();
		txtValorB.setBounds(40, 50, 200, 20);
		getContentPane().add(txtValorB);
		
		lbR1 = new JLabel(" =  r1: ");
		lbR1.setBounds(245, 20, 200, 20);
		getContentPane().add(lbR1);
		
		txtR1 = new JTextField();
		txtR1.setBounds(280, 20, 200, 20);
		getContentPane().add(txtR1);
		
		lbR2 = new JLabel(" =  r2: ");
		lbR2.setBounds(245, 50, 200, 20);
		getContentPane().add(lbR2);
		
		txtR2 = new JTextField();
		txtR2.setBounds(280, 50, 200, 20);
		getContentPane().add(txtR2);
		
		lbResultado = new JLabel("Resultado");
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
