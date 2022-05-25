/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Utkarsh
 */
public class AccountHolder {
    private String name;
    private int account;
    private double balance;
    private String password;
    private long mobile;
    private static int ac=1001;
    public AccountHolder(String n,double b,long m,String pass)
    {
        name=n;
        account=ac++;
        balance=b;
        password=pass;
        javax.swing.JOptionPane.showMessageDialog(null,"Your Account Number="+account);
    
    }
    public void withdraw(double bal)
    {
    if(balance<bal)
    {
     javax.swing.JOptionPane.showMessageDialog(null, "Insufficient Balance");
    }
    else
    {
        balance-=bal;
        javax.swing.JOptionPane.showMessageDialog(null, "New Balance"+balance);
    }
    }
    public void deposit(double bal)
    {
        balance=balance+bal;
        javax.swing.JOptionPane.showMessageDialog(null, "New Balance "+balance);
    }
    public double getBalance()
    {
        return balance;
    }
    public int getAcc()
    {
        return account;
    }
    public String getPass()
    {
        return password;
    }
}