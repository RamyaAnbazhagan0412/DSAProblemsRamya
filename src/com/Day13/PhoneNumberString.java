package com.Day13;
import java.util.*;
 
public class PhoneNumberString {
   
  
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
        String digits=sc.next();
        int n = digits.length();
        int[] num=new int[n];
        for(int i=0;i<n;i++) {
        	char ch=digits.charAt(i);
        	num[i]=Character.getNumericValue(ch);

        }
        for(int i=0;i<n;i++) {
        	System.out.println(num[i]);
        }
        String[] s  = { "0",   "1",   "abc",  "def", "ghi",
                "jkl", "mno", "pqrs", "tuv", "wxyz" };
 
        ArrayList<String> l
            = letters(num, n, s);
 
        for (int i = 0; i < l.size(); i++) {
            System.out.print(l.get(i) + " ");
        }
    }
    public  static  ArrayList<String>  letters(int[] num, int n,  String[] table)
    {
        ArrayList<String> list = new ArrayList<>();
 
        Queue<String> q = new LinkedList<>();
        q.add("");
 
        while (!q.isEmpty()) {
            String s = q.remove();
            if (s.length() == n)
                list.add(s);
            else {
                String val = table[num[s.length()]];
                for (int i = 0; i < val.length(); i++)
                {
                    q.add(s + val.charAt(i));
                }
            }
        }
        return list;
    }
}