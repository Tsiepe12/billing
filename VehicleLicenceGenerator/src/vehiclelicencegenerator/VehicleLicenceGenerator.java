/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclelicencegenerator;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionListener;

/**
*
* @author tsiepe
*/
public class VehicleLicenceGenerator extends JFrame implements ActionListener { 
 int CA=1; int ZN=2; int MP=3; int EC=4; int L=5; int GP =6;
 int NC=7; int FS=8; int NW=9;
JButton  btnPress = new JButton("Generate"); 
JTextArea taDisplay = new JTextArea(); 
JScrollPane scPane = new JScrollPane(taDisplay); 
JPanel buttonPanel = new JPanel(); 
JPanel totalsPanel = new JPanel(new GridLayout(4, 4)); 
JLabel lblGP = new JLabel("Gauteng="); 
JTextField txtGP = new JTextField(); 
JLabel lblZN = new JLabel("KwaZulu Natal="); 
JTextField txtZN = new JTextField();
JLabel lblMP = new JLabel("Mpumalanga="); 
JTextField txtMP = new JTextField(); 
JLabel lblEC = new JLabel("Eastern Cape="); 
JTextField txtEC = new JTextField(); 
JLabel lblL = new JLabel("Limpopo="); 
JTextField txtL = new JTextField(); 
JLabel lblNC = new JLabel("Northern Cape="); 
JTextField txtNC = new JTextField(); 
JLabel lblFS = new JLabel("Free State="); 
JTextField txtFS = new JTextField();
JLabel lblNW = new JLabel("North West="); 
JTextField txtNW = new JTextField(); 
JLabel lblCA = new JLabel("Western Cape="); 
JTextField txtCA = new JTextField(); 
 public VehicleLicenceGenerator() 
 {
setSize(500,500); 

setDefaultCloseOperation(EXIT_ON_CLOSE); //closes pane

//license pane
setTitle("Vehicle Registration Number Generator."); 
buttonPanel.add(btnPress); 
totalsPanel.add(lblGP); 
totalsPanel.add(txtGP); 
totalsPanel.add(lblZN); 
totalsPanel.add(txtZN); 
totalsPanel.add(lblMP); 
totalsPanel.add(txtMP); 
totalsPanel.add(lblEC); 
totalsPanel.add(txtEC); 
totalsPanel.add(lblL); 
totalsPanel.add(txtL); 
totalsPanel.add(lblFS); 
totalsPanel.add(txtFS); 
totalsPanel.add(lblCA); 
totalsPanel.add(txtCA); 
this.setLayout(new BorderLayout()); 
 add(buttonPanel,BorderLayout. NORTH); 
 add(scPane, BorderLayout.CENTER); 
 add(totalsPanel, BorderLayout.SOUTH); 
btnPress.addActionListener(this); 
 }
 public static void main(String[] args) {
VehicleLicenceGenerator r = new VehicleLicenceGenerator(); 
r.setVisible(true); 
 }
 public static int getNumbers() 
 {
 Random gen = new Random(); 
 return gen.nextInt(899) +100; 
 }
 public String getLetters() 
 {
 char letter = 'A' ; 
 Random gen = new Random(); 
 return ((char)(letter + gen.nextInt(17))+ ""+
 (char)(letter + gen.nextInt(17))+""+
 (char)(letter + gen.nextInt(17))).toUpperCase( ) ; 
 }
 public String getCode() 
 {
 Random gen = new Random();
 int num = gen.nextInt(9)+1; 
 switch(num) 
 {
     //case to return province codes
 case 1: CA++; return "CA"; 
 case 2: ZN++; return "ZN"; 
 case 3: MP++; return "MP"; 
 case 4: EC++; return "EC"; 
 case 5: L++; return "L"; 
 case 6: GP++; return "GP"; 
 case 7: NC++; return "NC"; 
 case 8: FS++; return "FS"; 
 case 9: NW++; return "NW"; 
 default: return ""; 
 }
 }
 public String getVehicleReg(String letters,int numbers,String code) 
 {
 return letters+"-"+numbers+"-"+code; 
 }
 @Override
 public void actionPerformed(ActionEvent e) { 
for( int k =0; k<1000000;k++) 
 {
 int num = getNumbers(); 
 String letters = getLetters(); 
 String code = getCode();
taDisplay.append("\n " +getVehicleReg(letters,num,code) ); 
 }
txtCA.setText(CA+""); 
txtZN.setText(ZN+""); 
txtMP.setText(MP+""); 
txtEC.setText(EC+""); 
txtL.setText(L+""); 
txtGP.setText(GP+""); 
txtNC.setText(NC+""); 
txtFS.setText(FS+""); 
txtNW.setText(NW+""); 
 }
}
