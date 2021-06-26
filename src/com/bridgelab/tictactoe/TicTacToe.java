package com.bridgelab.tictactoe;

import java.util.*;
public class TicTacToe {
	public static void main(String[] args) {
		
		createBored();
		Scanner userInput = new Scanner(System.in);
		char userLetter = userChoice(userInput);
		char player = ' ';
		char computer = ' ';
		
		if (userLetter == 'X') {
			player = 'X';
			computer = 'O';
			System.out.println("You have Taken Letter : "+player);
		}
		else if (userLetter == 'Y') {
			player = 'O';
			computer = 'X';
			System.out.println("You have Taken Letter : "+player);
		}
		else {
			System.out.println("Invalid Input");
		}
	}
	public static void createBored() {
		int [] bored = new int [9];
		for (int i= 0;i < 9;i++) {
			bored[i] = i+1 ;
		}
		System.out.println(bored[0]+"|"+bored[1]+"|"+bored[2]);
		System.out.println(bored[3]+"|"+bored[4]+"|"+bored[5]);
		System.out.println(bored[6]+"|"+bored[7]+"|"+bored[8]);
	}
	private static char userChoice(Scanner userInput) {
		System.out.println("Choose a Letter X or O :");
		return userInput.next().toUpperCase().charAt(0);
	}

}
