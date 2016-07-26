
package commands;

public class HelpCommand extends Command {

	public HelpCommand(String command, String shortname) {
		super(command, shortname);
		// TODO Auto-generated constructor stub
	}
	
	
	

	@Override
	public void excute(String params) {
		for(int i=0; i<Commands.commands.size(); i++){
			if(params.equalsIgnoreCase(Commands.commands.get(i).getCommand()) || params.equalsIgnoreCase(Commands.commands.get(i).getShortname())){
				Commands.commands.get(i).getHelp();;
				
			}
		}
	}






}
