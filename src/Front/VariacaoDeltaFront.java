package Front;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class VariacaoDeltaFront extends JFrame{
	public VariacaoDeltaFront() {
		setSize(500, 300);
        setLocationRelativeTo(null);
        setTitle("Variação Delta(%) - diferença % entre valores");

        // Adicionar os componentes desejados à nova janela
        JLabel label = new JLabel("Nova janela aberta!");
        getContentPane().add(label);
	}
}
