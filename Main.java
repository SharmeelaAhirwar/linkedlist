package com.org.SingleLinkedList;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice, data, k, x;
		Scanner scan = new Scanner(System.in);
		SingleLinkedList sLinkedList = new SingleLinkedList();
		sLinkedList.createList();
		while (true) {
			System.out.println("1,Display the list");
			System.out.println("2,search for an element");
			System.out.println("3,insert in the begining");
			System.out.println("4,insert at the end");
			System.out.println("5,insert after a node");
			System.out.println("6,reverse a list");
			System.out.println("7, delete first Node");
			System.out.println("8,delete last node");
			System.out.println("enter you choice");
			choice = scan.nextInt();
			if (choice == 0)
				break;
			switch (choice) {
			case 1: {
				
				sLinkedList.display();
				break;

				
			}
			case 2: {
				System.out.println("enter an element to be search");
				data=scan.nextInt();
				sLinkedList.search(data);
				break;

				
			}
			case 3: {
				System.out.println("enter a data to be inserted");
				data=scan.nextInt();
				sLinkedList.insertAtBegining(data);
				break;

				
			}
			case 4: {
				System.out.println("enter a data to be inserted");
				data=scan.nextInt();
				sLinkedList.insertAtEnd(data);
				break;

				
			}
			case 5: {
				System.out.println("enter a data ");
				data=scan.nextInt();
				System.out.println("enter a element after that you want to insert node");
				x=scan.nextInt();
				sLinkedList.insertAfterANode(data,x);
				break;

				
			}
			case 6 :{
				sLinkedList.reverse();
				break;
			}
			case 7 :{
				sLinkedList.deleteFirstNode();;
				break;
			}
			case 8 :{
				sLinkedList.deleteLastNode();;
				break;
			}
			default:
				System.out.println("wrong choice");
			}//end of switch
			System.out.println();
		}//end of while
		scan.close();
		System.out.println("existing");
	}

}
