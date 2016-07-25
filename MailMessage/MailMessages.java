package MailMessage;

import java.util.Scanner;

import commands.Commands;

public class MailMessages {
	
	public static void main(String[] args) {
		Commands commands =new Commands();
		System.out.println("Welcome here is a list of messages you can choose from");
		System.out.println("\n");
		commands.matchCommand("List", null);
		System.out.println("\n");
		Scanner sc = new Scanner (System.in);
		String command = null;
		while(true){
			System.out.print("\n");
			System.out.print("Enter a command ");
			while((command= sc.nextLine()) !=null){
				if(command.equalsIgnoreCase("List")|| command.equalsIgnoreCase("l")){
					commands.matchCommand(command, null);
				}
				else{
					commands.matchCommand(command.split(" ")[0], command.split(" ")[1]);
				}
				break;
			}
			
		}

	}

}
