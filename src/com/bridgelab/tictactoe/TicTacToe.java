package com.bridgelab.tictactoe;

import java.util.*;
public class TicTacToe {
	public static void main(String[] args) {
		createBored();
		userChoice();
	}
	public static void createBored() {
		char [] bored = new char [9];
		for (int i= 0;i < 9;i++) {
			bored[i] = '-';
		}
	}
	public static void userChoice() {
		char player = ' ';
		char computer = ' ';
		Scanner s = new Scanner(System.in);
		System.out.println("Choose a Letter 1.X or 2.O :");
		int userInput = s.nextInt();
		switch (userInput) {
		case 1 :
			player = 'X';
			computer = 'O';
			System.out.println("You have Taken Letter : "+player);
			break;
		case 2 :
			player = 'O';
			computer = 'X';
			System.out.println("You have Taken Letter : "+player);
			break;
		}
	}

}
