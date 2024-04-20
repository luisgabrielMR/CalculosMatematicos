package Front;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DescontoPercFront extends JFrame{
	public DescontoPercFront() {
		setSize(500, 300);
        setLocationRelativeTo(null);
        setTitle("Aplicar desconto % num valor");

        // Adicionar os componentes desejados à nova janela
        JLabel label = new JLabel("Nova janela aberta!");
        getContentPane().add(label);
	}
}
