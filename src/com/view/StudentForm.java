package com.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.model.Student;
import com.service.StudentService;
import com.service.StudentServiceImpl;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;

public class StudentForm extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JTextField fnameTxt;
	private JLabel lblLastname;
	private JTextField rollnoTxt;
	private JLabel lblLastname_1;
	private JTextField lnameTxt;
	private JLabel lblRollno;
	private JTextField emailTxt;
	private JLabel lblLastname_1_1;
	private JRadioButton maleBtn;
	private JRadioButton femaleBtn;
	private JLabel lblFaculty;
	private JTextField facultyTxt;
	private JLabel lblDob;
	private JTextField dobTxt;
	private JLabel lblAge;
	private JTextField ageTxt;
	private JLabel lblCollege;
	private JTextField collegeTxt;
	private JLabel lblPhone;
	private JTextField phoneTxt;
	private JLabel lblState;
	private JComboBox stateCmb;
	private JLabel lblCountry;
	private JTextField countryTxt;
	private JLabel lblCity;
	private JTextField cityTxt;
	private JButton addBtn;
	private JButton updateBtn;
	private JSeparator separator;
	private JLabel lblSearch;
	private JTextField searchTxt;
	private JScrollPane scrollPane;
	private JTable table;
	private JButton deleteBtn;
	private JButton editBtn;
	private JButton printBtn;
	private JButton viewBtn;
	private JButton exitBtn;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private int sid=0;
	private JButton btnEdit;
	private JButton btnEdit_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentForm frame = new StudentForm();
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
	public StudentForm() {
		setTitle("StudentForm");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1121, 634);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblNewLabel());
		contentPane.add(getFnameTxt());
		contentPane.add(getLblLastname());
		contentPane.add(getRollnoTxt());
		contentPane.add(getLblLastname_1());
		contentPane.add(getLnameTxt());
		contentPane.add(getLblRollno());
		contentPane.add(getEmailTxt());
		contentPane.add(getLblLastname_1_1());
		contentPane.add(getMaleBtn());
		contentPane.add(getFemaleBtn());
		contentPane.add(getLblFaculty());
		contentPane.add(getFacultyTxt());
		contentPane.add(getLblDob());
		contentPane.add(getDobTxt());
		contentPane.add(getLblAge());
		contentPane.add(getAgeTxt());
		contentPane.add(getLblCollege());
		contentPane.add(getCollegeTxt());
		contentPane.add(getLblPhone());
		contentPane.add(getPhoneTxt());
		contentPane.add(getLblState());
		contentPane.add(getStateCmb());
		contentPane.add(getLblCountry());
		contentPane.add(getCountryTxt());
		contentPane.add(getLblCity());
		contentPane.add(getCityTxt());
		contentPane.add(getAddBtn());
		contentPane.add(getUpdateBtn());
		contentPane.add(getSeparator());
		contentPane.add(getLblSearch());
		contentPane.add(getSearchTxt());
		contentPane.add(getScrollPane());
		contentPane.add(getDeleteBtn());
		contentPane.add(getBtnNewButton_1_1_1_1());
		contentPane.add(getViewBtn());
		contentPane.add(getBtnNewButton_1_1_1_1_1());
		contentPane.add(getBtnEdit_1());
		display();
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("FirstName");
			lblNewLabel.setBounds(18, 23, 71, 28);
		}
		return lblNewLabel;
	}
	private JTextField getFnameTxt() {
		if (fnameTxt == null) {
			fnameTxt = new JTextField();
			fnameTxt.setBounds(112, 23, 115, 28);
			fnameTxt.setColumns(10);
		}
		return fnameTxt;
	}
	private JLabel getLblLastname() {
		if (lblLastname == null) {
			lblLastname = new JLabel("Rollno");
			lblLastname.setBounds(249, 23, 62, 28);
		}
		return lblLastname;
	}
	private JTextField getRollnoTxt() {
		if (rollnoTxt == null) {
			rollnoTxt = new JTextField();
			rollnoTxt.setColumns(10);
			rollnoTxt.setBounds(321, 23, 115, 28);
		}
		return rollnoTxt;
	}
	private JLabel getLblLastname_1() {
		if (lblLastname_1 == null) {
			lblLastname_1 = new JLabel("LastName");
			lblLastname_1.setBounds(18, 77, 71, 28);
		}
		return lblLastname_1;
	}
	private JTextField getLnameTxt() {
		if (lnameTxt == null) {
			lnameTxt = new JTextField();
			lnameTxt.setColumns(10);
			lnameTxt.setBounds(112, 77, 115, 28);
		}
		return lnameTxt;
	}
	private JLabel getLblRollno() {
		if (lblRollno == null) {
			lblRollno = new JLabel("Email");
			lblRollno.setBounds(249, 77, 62, 28);
		}
		return lblRollno;
	}
	private JTextField getEmailTxt() {
		if (emailTxt == null) {
			emailTxt = new JTextField();
			emailTxt.setColumns(10);
			emailTxt.setBounds(321, 77, 115, 28);
		}
		return emailTxt;
	}
	private JLabel getLblLastname_1_1() {
		if (lblLastname_1_1 == null) {
			lblLastname_1_1 = new JLabel("Gender");
			lblLastname_1_1.setBounds(20, 149, 53, 28);
		}
		return lblLastname_1_1;
	}
	private JRadioButton getMaleBtn() {
		if (maleBtn == null) {
			maleBtn = new JRadioButton("Male");
			buttonGroup.add(maleBtn);
			maleBtn.setBounds(79, 153, 62, 23);
		}
		return maleBtn;
	}
	private JRadioButton getFemaleBtn() {
		if (femaleBtn == null) {
			femaleBtn = new JRadioButton("Female");
			buttonGroup.add(femaleBtn);
			femaleBtn.setBounds(153, 153, 77, 23);
		}
		return femaleBtn;
	}
	private JLabel getLblFaculty() {
		if (lblFaculty == null) {
			lblFaculty = new JLabel("Faculty");
			lblFaculty.setBounds(246, 150, 62, 28);
		}
		return lblFaculty;
	}
	private JTextField getFacultyTxt() {
		if (facultyTxt == null) {
			facultyTxt = new JTextField();
			facultyTxt.setColumns(10);
			facultyTxt.setBounds(318, 150, 115, 28);
		}
		return facultyTxt;
	}
	private JLabel getLblDob() {
		if (lblDob == null) {
			lblDob = new JLabel("DoB");
			lblDob.setBounds(18, 207, 62, 28);
		}
		return lblDob;
	}
	private JTextField getDobTxt() {
		if (dobTxt == null) {
			dobTxt = new JTextField();
			dobTxt.setColumns(10);
			dobTxt.setBounds(79, 207, 115, 28);
		}
		return dobTxt;
	}
	private JLabel getLblAge() {
		if (lblAge == null) {
			lblAge = new JLabel("Age");
			lblAge.setBounds(249, 207, 62, 28);
		}
		return lblAge;
	}
	private JTextField getAgeTxt() {
		if (ageTxt == null) {
			ageTxt = new JTextField();
			ageTxt.setColumns(10);
			ageTxt.setBounds(321, 207, 115, 28);
		}
		return ageTxt;
	}
	private JLabel getLblCollege() {
		if (lblCollege == null) {
			lblCollege = new JLabel("College");
			lblCollege.setBounds(18, 273, 62, 28);
		}
		return lblCollege;
	}
	private JTextField getCollegeTxt() {
		if (collegeTxt == null) {
			collegeTxt = new JTextField();
			collegeTxt.setColumns(10);
			collegeTxt.setBounds(79, 273, 115, 28);
		}
		return collegeTxt;
	}
	private JLabel getLblPhone() {
		if (lblPhone == null) {
			lblPhone = new JLabel("Phone");
			lblPhone.setBounds(249, 273, 62, 28);
		}
		return lblPhone;
	}
	private JTextField getPhoneTxt() {
		if (phoneTxt == null) {
			phoneTxt = new JTextField();
			phoneTxt.setColumns(10);
			phoneTxt.setBounds(321, 273, 115, 28);
		}
		return phoneTxt;
	}
	private JLabel getLblState() {
		if (lblState == null) {
			lblState = new JLabel("State");
			lblState.setBounds(18, 329, 62, 28);
		}
		return lblState;
	}
	private JComboBox getStateCmb() {
		if (stateCmb == null) {
			stateCmb = new JComboBox();
			stateCmb.setModel(new DefaultComboBoxModel(new String[] {"select", "State1", "State2", "State3", "State4", "State5"}));
			stateCmb.setBounds(79, 329, 120, 28);
		}
		return stateCmb;
	}
	private JLabel getLblCountry() {
		if (lblCountry == null) {
			lblCountry = new JLabel("Country");
			lblCountry.setBounds(18, 386, 62, 28);
		}
		return lblCountry;
	}
	private JTextField getCountryTxt() {
		if (countryTxt == null) {
			countryTxt = new JTextField();
			countryTxt.setColumns(10);
			countryTxt.setBounds(79, 386, 115, 28);
		}
		return countryTxt;
	}
	private JLabel getLblCity() {
		if (lblCity == null) {
			lblCity = new JLabel("City");
			lblCity.setBounds(18, 443, 62, 28);
		}
		return lblCity;
	}
	private JTextField getCityTxt() {
		if (cityTxt == null) {
			cityTxt = new JTextField();
			cityTxt.setColumns(10);
			cityTxt.setBounds(79, 443, 115, 28);
		}
		return cityTxt;
	}
	private JButton getAddBtn() {
		if (addBtn == null) {
			addBtn = new JButton("Add");
			addBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Student s = new Student();
					s.setFname(fnameTxt.getText());
					s.setLname(lnameTxt.getText());
					s.setDob(dobTxt.getText());
					s.setEmail(emailTxt.getText());
					s.setCollege(collegeTxt.getText());
					s.setFaculty(facultyTxt.getText());
					s.setRollno(Integer.parseInt(rollnoTxt.getText()));
					s.setAge(Integer.parseInt(ageTxt.getText()));
					s.setCountry(countryTxt.getText());
					s.setCity(cityTxt.getText());	
					s.setState(stateCmb.getSelectedItem().toString());
					s.setPhone(phoneTxt.getText());
					if(maleBtn.isSelected()){
						s.setGender("Male");
					}
					else {
						s.setGender("Female");
					}
					
					
					StudentService ss = new StudentServiceImpl();
					boolean res= ss.addStudent(s);
					if (res) {
						JOptionPane.showMessageDialog(null	, "Add success");
						display();
					}
					else {
						JOptionPane.showMessageDialog(null, "Not added");
					}
					
					updateBtn.setEnabled(false);
					
				}
			});
			addBtn.setBounds(33, 516, 103, 44);
		}
		return addBtn;
	}
	private JButton getUpdateBtn() {
		if (updateBtn == null) {
			updateBtn = new JButton("Update");
			updateBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Student s = new Student();
					s.setId(sid);
					s.setFname(fnameTxt.getText());
					s.setLname(lnameTxt.getText());
					s.setDob(dobTxt.getText());
					s.setEmail(emailTxt.getText());
					s.setCollege(collegeTxt.getText());
					s.setFaculty(facultyTxt.getText());
					s.setRollno(Integer.parseInt(rollnoTxt.getText()));
					s.setAge(Integer.parseInt(ageTxt.getText()));
					s.setCountry(countryTxt.getText());
					s.setCity(cityTxt.getText());	
					s.setState(stateCmb.getSelectedItem().toString());
					s.setPhone(phoneTxt.getText());
					if(maleBtn.isSelected()){
						s.setGender("Male");
					}
					else {
						s.setGender("Female");
					}
					
					
					StudentService ss = new StudentServiceImpl();
					boolean res= ss.updateStudent(s);
					if (res) {
						JOptionPane.showMessageDialog(null	, "Update success");
						display();
					}
					else {
						JOptionPane.showMessageDialog(null, "Not Updateded");
					}
				}
			});
			updateBtn.setEnabled(false);
			addBtn.setEnabled(true);
			
			updateBtn.setBounds(249, 516, 103, 44);
		}
		return updateBtn;
	}
	private JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setOrientation(SwingConstants.VERTICAL);
			separator.setBounds(489, 11, 13, 549);
		}
		return separator;
	}
	private JLabel getLblSearch() {
		if (lblSearch == null) {
			lblSearch = new JLabel("Search");
			lblSearch.setFont(new Font("Tahoma", Font.PLAIN, 14));
			lblSearch.setBounds(889, 26, 62, 28);
		}
		return lblSearch;
	}
	private JTextField getSearchTxt() {
		if (searchTxt == null) {
			searchTxt = new JTextField();
			searchTxt.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					String sdata =searchTxt.getText().trim();
					StudentService ss = new StudentServiceImpl();
					List<Student> slist= ss.searchStudent(sdata);
					DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
					tmodel.setRowCount(0);
					for (Student s : slist) {
						tmodel.addRow(new Object[] {s.getId(),s.getFname(),s.getLname(),s.getCollege(),s.getAge(),s.getPhone()});
					}
				}
			});
			searchTxt.setColumns(10);
			searchTxt.setBounds(961, 23, 132, 35);
		}
		return searchTxt;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(538, 101, 555, 385);
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Id", "FName", "LName", "College", "Age", "Phone"
				}
			));
		}
		return table;
	}
	private JButton getDeleteBtn() {
		if (deleteBtn == null) {
			deleteBtn = new JButton("Delete");
			deleteBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if ( table.getSelectedRow()<0) {
						JOptionPane.showMessageDialog(null, "select any row");
						return;
						
					}
					int srow = table.getSelectedRow();
					int sid= (int) table.getModel().getValueAt(srow, 0);
					
					StudentService ss = new StudentServiceImpl();
					if(ss.deleteStudent(sid)) {
						JOptionPane.showMessageDialog(null, "deleted success");
						display();
					}
					else {
						JOptionPane.showMessageDialog(null, "Delete failed");
					}
				}
			});
			deleteBtn.setBounds(535, 515, 71, 46);
		}
		return deleteBtn;
	}
	private JButton getBtnNewButton_1_1_1_1() {
		if (printBtn == null) {
			printBtn = new JButton("Print");
			printBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						table.print();
					} catch (PrinterException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
			printBtn.setBounds(898, 515, 71, 46);
		}
		return printBtn;
	}
	private JButton getViewBtn() {
		if (viewBtn == null) {
			viewBtn = new JButton("View");
			viewBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if ( table.getSelectedRow()<0) {
						JOptionPane.showMessageDialog(null, "select any row");
						return;
						
					}
					 int srow = table.getSelectedRow();
					 int sid= (int) table.getModel().getValueAt(srow, 0);
					 StudentViewForm view = new StudentViewForm();
					 view.setDataInView(sid);
					 view.setVisible(true);
					 
					 dispose();
					
				}
			});
			viewBtn.setBounds(769, 515, 71, 46);
		}
		return viewBtn;
	}
	private JButton getBtnNewButton_1_1_1_1_1() {
		if (exitBtn == null) {
			exitBtn = new JButton("Exit");
			exitBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			exitBtn.setBounds(1024, 515, 71, 46);
		}
		return exitBtn;
	}
	private void display() {
		StudentService ss= new StudentServiceImpl();
		List<Student> slist=ss.getAllStudent();
		DefaultTableModel tmodel = (DefaultTableModel) table.getModel();
		tmodel.setRowCount(0);
		for (Student s : slist) {
			tmodel.addRow(new Object[] {s.getId(),s.getFname(),s.getLname(),s.getCollege(),s.getAge(),s.getPhone()});
		}
	}
	private JButton getBtnEdit_1() {
		if (btnEdit_1 == null) {
			btnEdit_1 = new JButton("Edit");
			btnEdit_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if ( table.getSelectedRow()<0) {
						JOptionPane.showMessageDialog(null, "select any row");
						return;
						
					}
					 int srow = table.getSelectedRow();
					 sid= (int) table.getModel().getValueAt(srow, 0);
					 StudentService ss = new StudentServiceImpl();
					 Student s = ss.getStudentById(sid);
					 
					 // set student data to form
					 
					 fnameTxt.setText(s.getFname());
					 lnameTxt.setText(s.getLname());
					 ageTxt.setText(String.valueOf(s.getAge()));
					 phoneTxt.setText(s.getPhone());
					 emailTxt.setText(s.getEmail());
					 collegeTxt.setText(s.getCollege());
					 facultyTxt.setText(s.getFaculty());
					 rollnoTxt.setText(String.valueOf(s.getRollno()));
					 countryTxt.setText(s.getCountry());
					 cityTxt.setText(s.getCity());
					 stateCmb.setSelectedItem(s.getState());
					 dobTxt.setText(s.getDob());
					 if(s.getGender().equalsIgnoreCase("male")) {
						 maleBtn.setSelected(true);
					 }
					 else {
						 femaleBtn.setSelected(true);
					 }
					 addBtn.setEnabled(false);
					 updateBtn.setEnabled(true);
					 
				}
			});
			btnEdit_1.setBounds(646, 516, 71, 46);
		}
		return btnEdit_1;
	}
}
