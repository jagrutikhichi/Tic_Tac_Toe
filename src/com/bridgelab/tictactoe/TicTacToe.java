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
		System.out.println(bored[0]+"|"+bored[1]+"|"+bored[2]);
		System.out.println(bored[3]+"|"+bored[4]+"|"+bored[5]);
		System.out.println(bored[6]+"|"+bored[7]+"|"+bored[8]);
		
	}

}
