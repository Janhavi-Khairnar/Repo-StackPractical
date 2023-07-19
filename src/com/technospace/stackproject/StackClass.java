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
	
	public void pop() {
		if(top == -1){
			System.out.println("Stack is underflow.");
		} else{
			System.out.println("Element Pop :"+stack[top]);
			top--;
		}
	}
	
	
	public static void main(String[] args) {
		StackClass stackClass = new StackClass();
	
		Scanner sc = new Scanner(System.in);
		
		int choice;
		do{
			System.out.println("*** Stack Index ***");
			System.out.println("1)Push \n2)Display \n3)Pop \n4)Exit.");
			System.out.println("Enter which operation would you perform :");
			choice = sc.nextInt();
			
			switch(choice) 
			{
				case 1:
					stackClass.push();
					break;
				case 2:
					stackClass.display();
					break;
				case 3:
					stackClass.pop();
					break;
				default:
					System.out.println("Please enter the number between 1 to 3.");
			}
		}while(choice != 5);
	}
}