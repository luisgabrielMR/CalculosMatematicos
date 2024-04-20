package Front;

import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MatFront extends JFrame{
	private JButton btnDescontoPerc;
	private JButton btnIncrementoPerc;
	private JButton btnAmostraXPercY;
	private JButton btnAmostraXY;
	private JButton btnDescontoAB;
	private JButton btnVariacaoDelta;
	private JButton btnValorOriginal;
	private JButton btnRegraDeTres;
	private JButton btnGeradorSenha;
	private JLabel lbInicio;
	private JLabel lbIntroducao;
	
	//Classe para inicializar tela inicial
	public MatFront(){
		setSize(1024, 768);
		setTitle("Cálculos Matemáticos");
		setLayout(null);
		createComponents();
		setVisible(true);
	}
	
	//Criando componentes
	private void createComponents() {	
		lbInicio = new JLabel("Olá usuário (=^w^=)");
		lbInicio.setFont(new Font(Font.MONOSPACED, Font.BOLD, 20));
		lbInicio.setBounds(400, 20, 300, 25);
		getContentPane().add(lbInicio);
		
		lbIntroducao = new JLabel("Selecione a opção desejada: ");
		lbIntroducao.setBounds(420, 90, 400, 25);
		getContentPane().add(lbIntroducao);
		
		btnDescontoPerc = new JButton(new AbstractAction("Aplicar desconto % num valor") {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DescontoPercFront d = new DescontoPercFront();
				d.setVisible(true);
			}
		});
		btnDescontoPerc.setBounds(50, 120, 900, 50);
		getContentPane().add(btnDescontoPerc);		
		
		btnIncrementoPerc = new JButton(new AbstractAction("Incrementar % num valor") {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				IncrementoPercFront i = new IncrementoPercFront();
				i.setVisible(true);
			}
		});
		btnIncrementoPerc.setBounds(50, 180, 900, 50);
		getContentPane().add(btnIncrementoPerc);
		
		btnAmostraXPercY = new JButton(new AbstractAction("Amostragem - Quanto X% representa Y") {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AmostraXPercYFront a = new AmostraXPercYFront();
				a.setVisible(true);
			}
		});
		btnAmostraXPercY.setBounds(50, 240, 900, 50);
		getContentPane().add(btnAmostraXPercY);
		
		btnAmostraXY = new JButton(new AbstractAction("Amostragem 2 - Qunato X representa de Y") {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				AmostraXYFront a = new AmostraXYFront();
				a.setVisible(true);
			}
		});
		btnAmostraXY.setBounds(50, 300, 900, 50);
		getContentPane().add(btnAmostraXY);
		
		btnDescontoAB = new JButton(new AbstractAction("Valor era A e paguei B, qual foi o desconto%?") {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DescontoABFront d = new DescontoABFront();
				d.setVisible(true);
			}
		});
		btnDescontoAB.setBounds(50, 360, 900, 50);
		getContentPane().add(btnDescontoAB);
		
		btnVariacaoDelta = new JButton(new AbstractAction("Variação Delta(%) - diferença % entre valores") {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				VariacaoDeltaFront v = new VariacaoDeltaFront();
				v.setVisible(true);
			}
		});
		btnVariacaoDelta.setBounds(50, 420, 900, 50);
		getContentPane().add(btnVariacaoDelta);
		
		btnValorOriginal = new JButton(new AbstractAction("Qual era o valor original?") {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ValorOriginalFront v = new ValorOriginalFront();
				v.setVisible(true);
			}
		});
		btnValorOriginal.setBounds(50, 480, 900, 50);
		getContentPane().add(btnValorOriginal);
		
		btnRegraDeTres = new JButton(new AbstractAction("Regra de três") {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				RegraDeTresFront r = new RegraDeTresFront();
				r.setVisible(true);
			}
		});
		btnRegraDeTres.setBounds(50, 540, 900, 50);
		getContentPane().add(btnRegraDeTres);
		
		btnGeradorSenha = new JButton(new AbstractAction("Gerador de Senha") {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				GeradorSenhaFront g = new GeradorSenhaFront();
				g.setVisible(true);
			}
		});
		btnGeradorSenha.setBounds(50, 600, 900, 50);
		getContentPane().add(btnGeradorSenha);
	}
	
	public static void main(String[] args) {
		new MatFront();
	}
}

