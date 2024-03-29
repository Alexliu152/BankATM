import javax.swing.*;
import java.awt.*;


public class balanceGUI {
    JFrame j = new JFrame();
    JLabel header = new JLabel("Account Information");
    JLabel accNum = new JLabel("Account Number");
    JLabel number;
    JLabel accType = new JLabel("Account Type");
    JLabel type;
    JLabel accName = new JLabel("Name");
    JLabel name;
    JLabel accBal = new JLabel("Account Balance");
    JTextArea balance;
    JButton ret = new JButton("Return");
    JButton exit = new JButton("Exit");
    private String curr(Account a) {
        String str = "";
        for (int i = 0; i < a.getC().length; i++) {
            // if(a.getC()[i].getBalance() == 0) {
            //     continue;
            // }
            str += a.getC()[i].getName();
            str += ": ";
            str += a.getC()[i].getSymbol();
            str += a.getC()[i].getBalance();
            System.out.println(a.getC()[i].getBalance());
            str += "\n";
        } 
        return str;
    }
    public balanceGUI(Account a, String str, Customer c) {
        GUI.balanceGUIAL(this, a, str, c);
        name = new JLabel(c.getPerInfomation().getName());
        number = new JLabel("" + a.getAccountNumber());
        balance = new JTextArea(curr(a));
        if(a.getType() == 1) {
            type = new JLabel("Checking");
        }
        else {
            type = new JLabel("Saving");
        }
        
        ret.setBounds(100,450,150,50);
        exit.setBounds(650,450,150,50);
        header.setFont(new Font("Black", Font.CENTER_BASELINE,30));
        header.setBounds(325,50,300,50);
        accNum.setFont(new Font("Black", Font.CENTER_BASELINE,15));
        accNum.setBounds(200,125,200,25);
        accType.setFont(new Font("Black", Font.CENTER_BASELINE,15));
        accType.setBounds(200,175,200,25);
        accName.setFont(new Font("Black", Font.CENTER_BASELINE,15));
        accName.setBounds(200,225,200,25);
        accBal.setFont(new Font("Black", Font.CENTER_BASELINE,15));
        accBal.setBounds(200,275,200,25);
        number.setFont(new Font("Black", Font.CENTER_BASELINE,15));
        number.setBounds(550,125,200,25);
        type.setFont(new Font("Black", Font.CENTER_BASELINE,15));
        type.setBounds(550,175,200,25);
        name.setFont(new Font("Black", Font.CENTER_BASELINE,15));
        name.setBounds(550,225,200,25);
        balance.setFont(new Font("Black", Font.CENTER_BASELINE,15));
        balance.setOpaque(true);
        balance.setBorder(null);
        balance.setBackground(null);
        balance.setEditable(false);
        balance.setBounds(550,275,200,100);

        j.add(header);
        j.add(accNum);
        j.add(accType);
        j.add(accName);
        j.add(balance);
        j.add(number);
        j.add(type);
        j.add(name);
        j.add(accBal);
        j.add(ret);
        j.add(exit);
        j.setTitle("ATM");
        j.setSize(900,600);
        j.setLayout(null);
        j.setResizable(false);
        j.setVisible(true);
    }
}