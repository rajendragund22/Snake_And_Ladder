package com.snakeandladder;

public class SnakeAndLadder {
	public static void main(String[] args) {
		System.out.println("Welcome To the snake and ladder code");
		int position = 0;
		System.out.println("Your Starting position is : " + position);
		int dice = (int) Math.floor(Math.random() * 6 + 1);
		System.out.println(dice);
		int option = (int) Math.floor(Math.random() * 3 + 1);
		System.out.println(option);
		switch (option) {
		case 1:
			System.out.println("No Play");
			break;
		case 2:
			position = position + dice;
			System.out.println("Position is : " + position);
			break;
		case 3:
			position = position - dice;
			if(position<0) {
				position=0;
			}
			System.out.println("Position is : " + position);
			break;
		}

	}
}
