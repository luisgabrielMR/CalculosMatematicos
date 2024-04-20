package Front;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class RegraDeTresFront extends JFrame{
	public RegraDeTresFront() {
		setSize(500, 300);
        setLocationRelativeTo(null);
        setTitle("Regra de três");

        // Adicionar os componentes desejados à nova janela
        JLabel label = new JLabel("Nova janela aberta!");
        getContentPane().add(label);
	}
}
