package commands;

import java.util.ArrayList;

import MailMessage.Message;

public class MatchCommand extends Command{

	public MatchCommand(String command, String shortname) {
		super(command, shortname);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void excute(String params) {
		ArrayList<Message> data = this.getController().findByCatergory(params);
		for(int i=0; i<data.size(); i++){
			System.out.println(this.getController().getData().getMessages().indexOf(data.get(i))+". "+data.get(i).getTitle());
		}
		
	}



}
