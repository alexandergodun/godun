/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab2_maven;

/**
 *
 * @author 1
 */
public class symbol {
   
    char s;
    
    symbol (String str)
    {
        this.s = str.charAt(0);
    } 
        
    public char Getsymbol()  
    {
        return this.s;
    }
	
	
    public String replace( String text, int number, char s )
    {
        String newText="";
        String mass[] = text.trim().split("\\s");   
         
        int i=0;
        while (i < mass.length)
        {
            newText += mass[i].substring(0,number-1) + s + mass[i].substring(number)+" ";
            i++;
        } 
        return newText;
    } 
}
