package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest { public static void main(String[] args) {

String listaInvitati[] = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax"," Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};

Scanner input = new Scanner(System.in);

System.out.println("inserisci nome dell'invitato");

String nomeInvitato = input.nextLine();


int index = 0;
while (nomeInvitato != listaInvitati[index] && index < listaInvitati.length) {

System.out.println(listaInvitati[index]);
    index++;
};

//for (int i = 0 , i < listaInvitati.length, i++){ 

};
//}

}