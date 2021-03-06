package commands;

import java.util.ArrayList;

public class Commands {


	static ArrayList<Command> commands = new ArrayList<Command>();
	
	public Commands(){
		CreateCommands();
	}
	


	private void CreateCommands() {
		commands.add(new ListCommand("List","l"));
		commands.add(new CopyCommand("Copy","c"));
		commands.add(new FindCommand("Find","f"));	
		commands.add(new MatchCommand("Match","m"));
		commands.add(new TagSearchCommand("Tag","t"));
		commands.add(new HelpCommand("Help","h"));
	}


	public ArrayList<Command> getCommands() {
		return commands;
	}

	public void setCommands(ArrayList<Command> commands) {
		Commands.commands = commands;
	}

	
	
	public void matchCommand(String command, String parms){
		for(int i=0; i<commands.size(); i++){
			
			if(command.equalsIgnoreCase(commands.get(i).getCommand())|| command.equalsIgnoreCase(commands.get(i).getShortname())){
				  commands.get(i).excute(parms);
				  return;
			}
		}
	}
	
	
	
	
}
