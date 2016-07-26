package commands;

import java.util.ArrayList;

import MailMessage.Message;

public class FindCommand extends Command{

	public FindCommand(String command, String shortname) {
		super(command, shortname);
		// TODO Auto-generated constructor stub
	}


	
	
	public ArrayList<Message> findMessages(String message){
		 return getController().searchAll(message);
	}

	@Override
	public void excute(String params) {
		ArrayList<Message> data = findMessages(params);
		for(int i=0; i<data.size(); i++){
			System.out.println(this.getController().getData().getMessages().indexOf(data.get(i))+". "+data.get(i).getTitle());
		}
	}




	public void getHelp() {
		System.out.println("Finds any message containing <String> \n"
				+ "Usage: f <string>");
		
	}

}
