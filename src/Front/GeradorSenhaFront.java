package Front;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GeradorSenhaFront extends JFrame{
	public GeradorSenhaFront() {
		setSize(500, 300);
        setLocationRelativeTo(null);
        setTitle("Gerador de Senha");

        // Adicionar os componentes desejados à nova janela
        JLabel label = new JLabel("Nova janela aberta!");
        getContentPane().add(label);
	}
}
