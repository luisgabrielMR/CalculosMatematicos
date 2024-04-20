package Front;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class AmostraXPercYFront extends JFrame{
	public AmostraXPercYFront() {
		setSize(500, 300);
        setLocationRelativeTo(null);
        setTitle("Amostragem 2 - Qunato X representa de Y");

        // Adicionar os componentes desejados à nova janela
        JLabel label = new JLabel("Nova janela aberta!");
        getContentPane().add(label);
	}
}
