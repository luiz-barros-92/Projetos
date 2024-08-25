package weaponcalc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;



public class ExcsWeapon extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField numCargas;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExcsWeapon frame = new ExcsWeapon();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ExcsWeapon() {
		setTitle("Calculadora de Exercise Weapon");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 199);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);		
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ExcsWeapon.class.getResource("/imagens/Exercise_Dummy.gif")));
		lblNewLabel.setBounds(30, 11, 56, 103);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cargas");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(153, 11, 56, 25);
		contentPane.add(lblNewLabel_1);
		
		numCargas = new JTextField();
		numCargas.setBounds(121, 39, 123, 25);
		contentPane.add(numCargas);
		numCargas.setColumns(10);
		
		
		
		JLabel resposta = new JLabel("");
		resposta.setBounds(20, 115, 304, 29);
		contentPane.add(resposta);
		
		JButton calcular = new JButton("Calcular");		
	
		calcular.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				calculateTime();
			}

			private void calculateTime() {
				try {
		            int n = Integer.parseInt(numCargas.getText());
		            if (n < 0) {
		                resposta.setText("Por favor, insira um número válido de cargas.");
		                return;
		            }

		            int segundos = n * 2;
		            int minutosTotais = segundos / 60;
		            int horas = minutosTotais / 60;
		            int minutos = minutosTotais % 60;
		            if (horas == 1) {
		            	resposta.setText("Sua exercise weapon tem " + horas + " hora e " + minutos + " minutos.");
		            }else if(horas == 0) {
		            	
		            		resposta.setText("Sua exercise weapon tem " + minutos + " minutos.");
		            	} else {

		            resposta.setText("Sua exercise weapon tem " + horas + " horas e " + minutos + " minutos.");
		            }
		        } catch (NumberFormatException e) {
		            resposta.setText("Por favor, insira um número válido.");
		        }				
			}
		});
		calcular.setBounds(121, 75, 123, 29);
		contentPane.add(calcular);
		
		JLabel lblNewLabel_2 = new JLabel("By Luiz Barros");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 10));
		lblNewLabel_2.setBounds(267, 11, 67, 14);
		contentPane.add(lblNewLabel_2);
		numCargas.addKeyListener(new KeyAdapter() {
		    @Override
		    public void keyPressed(KeyEvent e) {
		        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
		            calcular.doClick();
		        }
		    }
		});		
	}	
}
