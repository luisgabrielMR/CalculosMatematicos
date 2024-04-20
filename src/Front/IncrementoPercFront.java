package Front;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class IncrementoPercFront extends JFrame{
	public IncrementoPercFront() {
		setSize(500, 300);
        setLocationRelativeTo(null);
        setTitle("Incrementar % num valor");

        // Adicionar os componentes desejados à nova janela
        JLabel label = new JLabel("Nova janela aberta!");
        getContentPane().add(label);
	}
}
