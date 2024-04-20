package Front;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ValorOriginalFront extends JFrame{
	public ValorOriginalFront() {
		setSize(500, 300);
        setLocationRelativeTo(null);
        setTitle("Qual era o valor original?");

        // Adicionar os componentes desejados à nova janela
        JLabel label = new JLabel("Nova janela aberta!");
        getContentPane().add(label);
	}
}
