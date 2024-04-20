package Front;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class AmostraXYFront extends JFrame{
	private JLabel lbValorA;
    private JLabel lbValorB;
    private JLabel lbResultado;
    private JButton btnResult;
	
	public AmostraXYFront() {
		setSize(500, 300);
        setLocationRelativeTo(null);
        setTitle("Amostragem 2 - Quanto X representa de Y");
        createComponents();
        setVisible(true);
	}
	
	private void createComponents() {
		lbValorA = new JLabel("Valor inicial R$ (a)");
		lbValorA.setBounds(9, 9, 9, 9);
		getContentPane().add(lbValorA);
		
		lbValorB = new JLabel("% acréscim0 (b)");
		getContentPane().add(lbValorB);
		
		lbResultado = new JLabel("Resultado");
		getContentPane().add(lbResultado);
		
		btnResult = new JButton(new AbstractAction("Calcular") {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		btnResult.setBounds(9, 9, 9, 9);
		getContentPane().add(btnResult);
		
	}
}
