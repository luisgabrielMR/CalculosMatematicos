package Front;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DescontoABFront extends JFrame{
	public DescontoABFront() {
		setSize(500, 300);
        setLocationRelativeTo(null);
        setTitle("Valor era A e paguei B, qual foi o desconto%?");

        // Adicionar os componentes desejados à nova janela
        JLabel label = new JLabel("Nova janela aberta!");
        getContentPane().add(label);
	}
}
