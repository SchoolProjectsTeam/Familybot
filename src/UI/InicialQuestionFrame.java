package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InicialQuestionFrame extends JFrame {

	private JPanel contentPane;
	private AuxiliarFamilyCreator auxCreator;   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicialQuestionFrame frame = new InicialQuestionFrame();
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
	public InicialQuestionFrame() {
		initializate();
	}
	
	
	
	
	
	
	
	
	private void initializate() {
		auxCreator = new AuxiliarFamilyCreator();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 382, 176);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setResizable(false);
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[][]", "[][][][324.00][71.00]"));
		
		JLabel lblNewLabel = new JLabel("No existen familias en la base de datos, \u00BFdesea crear una nueva familia?");
		contentPane.add(lblNewLabel, "cell 0 0 2 4,alignx center,aligny center");
		
		JButton btnNewButton = new JButton("Si");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				auxCreator.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnNewButton, "flowx,cell 1 4,alignx center");
		
		JButton btnNewButton_1 = new JButton("No");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		contentPane.add(btnNewButton_1, "cell 1 4");
	}
	
	

}
