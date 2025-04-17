package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest { public static void main(String[] args) {

String listaInvitati[] = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax","Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

Scanner input = new Scanner(System.in);

System.out.println("Buonasera ,gentilmente può dirmi il suo nome");

String nomeInvitato = input.nextLine();

input.close();

int i = 0;
while (i < listaInvitati.length) {
if (nomeInvitato.equals(listaInvitati[i]))
   {System.out.println("benvenuto può entrare"); break;}
 
 else if (i == 10)

    {System.out.println("vattene a quel paese"); }
  
    i++;

};

//for (int i = 0 , i < listaInvitati.length, i++){ 

};


}