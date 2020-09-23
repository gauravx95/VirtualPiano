package Piano_s;

import java.awt.EventQueue;
import java.io.*;
import javax.sound.sampled.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Window;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

import java.awt.Panel;
import java.awt.Button;
import java.awt.Point;
import javax.swing.ButtonGroup;
import java.awt.Component;

public class Pianos {

	private JFrame frame;
	private JLayeredPane panel;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pianos window = new Pianos();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pianos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		panel = new JLayeredPane();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 1009, 780);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.setBounds(61, 170, 77, 378);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\Ritesh Shakya\\Desktop\\University\\Sem 5\\Labs\\Multimedia\\MusicNotes\\C.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				} catch (Exception ex) {
					
				}
			}
		});
		frame.getContentPane().setLayout(null);
		
		JButton btnD = new JButton("D");
		btnD.setBounds(150, 170, 77, 378);
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\Ritesh Shakya\\Desktop\\University\\Sem 5\\Labs\\Multimedia\\MusicNotes\\D.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				} catch (Exception ex) {
					
				}
			}
		});
		
		Button button = new Button("C#");
		button.setBackground(Color.BLACK);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\Ritesh Shakya\\Desktop\\University\\Sem 5\\Labs\\Multimedia\\MusicNotes\\C_s.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				} catch (Exception ex) {
					
				}
			}
		});
		
		JButton btnD_1 = new JButton("D1");
		btnD_1.setBounds(758, 170, 77, 378);
		btnD_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\Ritesh Shakya\\Desktop\\University\\Sem 5\\Labs\\Multimedia\\MusicNotes\\D1.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				} catch (Exception ex) {
					
				}
			}
		});
		
		Button button_1 = new Button("D#");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\Ritesh Shakya\\Desktop\\University\\Sem 5\\Labs\\Multimedia\\MusicNotes\\D_s.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				} catch (Exception ex) {
					
				}
			}
		});
		
		Button button_2 = new Button("F#");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\Ritesh Shakya\\Desktop\\University\\Sem 5\\Labs\\Multimedia\\MusicNotes\\F_s.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				} catch (Exception ex) {
					
				}
			}
		});
		
		Button button_3 = new Button("G#");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\Ritesh Shakya\\Desktop\\University\\Sem 5\\Labs\\Multimedia\\MusicNotes\\G_s.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				} catch (Exception ex) {
					
				}
			}
		});
		
		Button button_4 = new Button("Bb");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\Ritesh Shakya\\Desktop\\University\\Sem 5\\Labs\\Multimedia\\MusicNotes\\Bb.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				} catch (Exception ex) {
					
				}
			}
		});
		
		Button button_5 = new Button("C#1");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\Ritesh Shakya\\Desktop\\University\\Sem 5\\Labs\\Multimedia\\MusicNotes\\C_s1.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				} catch (Exception ex) {
					
				}
			}
		});
		
		Button button_6 = new Button("D#1");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\Ritesh Shakya\\Desktop\\University\\Sem 5\\Labs\\Multimedia\\MusicNotes\\D_s1.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				} catch (Exception ex) {
					
				}
			}
		});
		button_6.setForeground(Color.WHITE);
		button_6.setFont(new Font("Dialog", Font.BOLD, 22));
		button_6.setBackground(Color.BLACK);
		button_6.setBounds(807, 170, 77, 224);
		frame.getContentPane().add(button_6);
		button_5.setForeground(Color.WHITE);
		button_5.setFont(new Font("Dialog", Font.BOLD, 22));
		button_5.setBackground(Color.BLACK);
		button_5.setBounds(712, 170, 77, 224);
		frame.getContentPane().add(button_5);
		button_4.setForeground(Color.WHITE);
		button_4.setFont(new Font("Dialog", Font.BOLD, 22));
		button_4.setBackground(Color.BLACK);
		button_4.setBounds(539, 170, 77, 224);
		frame.getContentPane().add(button_4);
		button_3.setForeground(Color.WHITE);
		button_3.setFont(new Font("Dialog", Font.BOLD, 22));
		button_3.setBackground(Color.BLACK);
		button_3.setBounds(461, 170, 72, 224);
		frame.getContentPane().add(button_3);
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Dialog", Font.BOLD, 22));
		button_2.setBackground(Color.BLACK);
		button_2.setBounds(375, 170, 82, 224);
		frame.getContentPane().add(button_2);
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Dialog", Font.BOLD, 22));
		button_1.setBackground(Color.BLACK);
		button_1.setBounds(192, 170, 77, 224);
		frame.getContentPane().add(button_1);
		btnD_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnD_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.getContentPane().add(btnD_1);
		button.setFont(new Font("Dialog", Font.BOLD, 22));
		button.setForeground(Color.WHITE);
		button.setBounds(104, 170, 82, 224);
		frame.getContentPane().add(button);
		btnD.setVerticalAlignment(SwingConstants.BOTTOM);
		btnD.setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.getContentPane().add(btnD);
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.getContentPane().add(btnNewButton);
		
		JButton btnE = new JButton("E");
		btnE.setBounds(237, 170, 77, 378);
		btnE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\Ritesh Shakya\\Desktop\\University\\Sem 5\\Labs\\Multimedia\\MusicNotes\\E.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				} catch (Exception ex) {
					
				}
			}
		});
		btnE.setVerticalAlignment(SwingConstants.BOTTOM);
		btnE.setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.getContentPane().add(btnE);
		
		JButton btnF = new JButton("F");
		btnF.setBounds(324, 170, 77, 378);
		btnF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\Ritesh Shakya\\Desktop\\University\\Sem 5\\Labs\\Multimedia\\MusicNotes\\F.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				} catch (Exception ex) {
					
				}
			}
		});
		btnF.setVerticalAlignment(SwingConstants.BOTTOM);
		btnF.setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.getContentPane().add(btnF);
		
		JButton btnG = new JButton("G");
		btnG.setBounds(411, 170, 77, 378);
		btnG.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\Ritesh Shakya\\Desktop\\University\\Sem 5\\Labs\\Multimedia\\MusicNotes\\G.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				} catch (Exception ex) {
					
				}
			}
		});
		btnG.setVerticalAlignment(SwingConstants.BOTTOM);
		btnG.setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.getContentPane().add(btnG);
		
		JButton btnA = new JButton("A");
		btnA.setBounds(498, 170, 77, 378);
		btnA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\Ritesh Shakya\\Desktop\\University\\Sem 5\\Labs\\Multimedia\\MusicNotes\\A.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				} catch (Exception ex) {
					
				}
			}
		});
		btnA.setVerticalAlignment(SwingConstants.BOTTOM);
		btnA.setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.getContentPane().add(btnA);
		
		JButton btnB = new JButton("B");
		btnB.setBounds(582, 170, 77, 378);
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\Ritesh Shakya\\Desktop\\University\\Sem 5\\Labs\\Multimedia\\MusicNotes\\B.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				} catch (Exception ex) {
					
				}
			}
		});
		btnB.setVerticalAlignment(SwingConstants.BOTTOM);
		btnB.setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.getContentPane().add(btnB);
		
		JButton btnC = new JButton("C1");
		btnC.setBounds(671, 170, 77, 378);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\Ritesh Shakya\\Desktop\\University\\Sem 5\\Labs\\Multimedia\\MusicNotes\\C1.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				} catch (Exception ex) {
					
				}
			}
		});
		btnC.setVerticalAlignment(SwingConstants.BOTTOM);
		btnC.setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.getContentPane().add(btnC);
		
		JButton btnF_1 = new JButton("F1");
		btnF_1.setBounds(848, 170, 77, 378);
		btnF_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\Ritesh Shakya\\Desktop\\University\\Sem 5\\Labs\\Multimedia\\MusicNotes\\F1.wav"));
					Clip clip = AudioSystem.getClip();
					clip.open(audioInputStream);
					clip.start();
				} catch (Exception ex) {
					
				}
			}
		});
		btnF_1.setVerticalAlignment(SwingConstants.BOTTOM);
		btnF_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		frame.getContentPane().add(btnF_1);
		
		JLabel lblNewLabel = new JLabel("Virtual Piano");
		lblNewLabel.setBounds(330, 0, 350, 124);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 50));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Ritesh Shakya");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setBounds(788, 621, 256, 59);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2018UIT2521");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_2.setBounds(798, 667, 182, 47);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
	
