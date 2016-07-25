package commands;

public class ListCommand extends Command {

	public ListCommand(String command, String shortname) {
		super(command, shortname);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void excute(String params) {
		this.getController().printAllMessages();
		
	}

	

}
