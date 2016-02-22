/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab2_maven;

import java.util.Scanner;

/**
 *
 * @author 1
 */
public class lab1 {
    
    
    public static void main(String[] args){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст");
        text t1 = new text(sc.nextLine()); 
 
        System.out.println("Введите номер заменяемого элемента");
        number n1 = new number(sc.nextInt()); 
  
        System.out.println("Введите символ");
        Scanner sc1 = new Scanner(System.in);
        symbol r1 = new symbol(sc1.nextLine());	
        text t2 = new text(r1.replace(t1.Gettext(), n1.Getnumber(), r1.Getsymbol()));
        System.out.println("Исправленный текст: " + t2.Gettext());
	System.out.println("I <3 Krujka");

    }
}
