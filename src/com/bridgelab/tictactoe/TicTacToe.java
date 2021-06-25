package com.bridgelab.tictactoe;

public class TicTacToe {
	public static void main(String[] args) {
		CreateBored();
		
	}
	public static void CreateBored() {
		int N = 9;
		char bored[] = new char [N];
		for (int i= 0;i < 9;i++) {
			bored[i] = '-';
		}		
	}

}
