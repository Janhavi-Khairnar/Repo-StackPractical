package com.technospace.stackproject;

import java.util.Scanner;

public class StackClass {

	int[] stack = new int[5];
	int top=-1;
	
	Scanner sc = new Scanner(System.in);
	
	public void push() {
		if(top == stack.length-1) {
			System.out.println("Stack is overflow.");
		} else{
			System.out.println("Enter the Number :");
			int num = sc.nextInt();
			top++;
			stack[top] = num;
		}
	}
	
	public void display() {
		for(int i=top ; i>=0 ; i--) {
			System.out.println(stack[i]);
		}
	}
	
	public static void main(String[] args) {
		StackClass stackClass = new StackClass();
		stackClass.push();
		stackClass.push();
		stackClass.push();
		stackClass.push();
		stackClass.push();
		stackClass.display();
	}

}
