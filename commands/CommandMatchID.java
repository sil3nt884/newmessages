package commands;

public class CommandMatchID extends Command {

	public CommandMatchID(String command, String shortname) {
		super(command, shortname);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void excute(String params) {
		System.out.println(getController().findByID(Integer.parseInt(params)));
		
	}

	public  void getHelp() {
		// TODO Auto-generated method stub
		
	}

}
