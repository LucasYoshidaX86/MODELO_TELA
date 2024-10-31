//Importando bibliotecas.
import java.awt.BorderLayout;
import java.awt.FlowLayout; 
import javax.swing.*; 

//Criando classe para criar um GUI (Graphical User Interface), criando uma interface gráfica básica.
public class AWTTestSwing {

	public static void main(String[] args) {
		
/*Criando janela da interface, contendo a configuração de tamanho, uma operação para encerrar o programa quando fechado, 
 e permitindo mudança de layout de outros componentes. */
		JFrame frame = new JFrame("AWT Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,200);
		frame.setLayout(new BorderLayout());
		
//Criando a função JLabel como 'título' e JTextField para caixa de texto com tamanho 15.
		JLabel label1 = new JLabel("Label1");
		JTextField textField1 = new JTextField(15);
		
//Adicionando e organizando as funções JLabel e JTextField na mesma linha e adicionando ao 'topPanel'.	
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new FlowLayout());
		topPanel.add(label1);
		topPanel.add(textField1);
		
//Criando botões já com seus nomes criados.		
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		
//Adicionando e organizando botões, ajustando todos na mesma linha. 
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(button1);
		buttonPanel.add(button2);
		buttonPanel.add(button3);
		
//Organizando os dois painéis na janela, 'topPanel' ao norte da janela e 'buttonPanel' no centro da janela.		
		frame.add(topPanel, BorderLayout.NORTH);
		frame.add(buttonPanel, BorderLayout.CENTER);
		
//Permissão para que o usuário possa ver a janela.
		frame.setVisible(true);
		
	}

}
