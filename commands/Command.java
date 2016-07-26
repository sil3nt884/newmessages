package commands;

import MailMessage.MessageController;

public abstract class Command {


	private String command;
	private String [] parameters;
	private String shortname;
	private MessageController controller = new MessageController();
	
	
	public Command (String command, String shortname){
		this.command=command;
		this.shortname=shortname;
	}
	
	public   void getHelp(){
		System.out.println("To get more details...Usage: help <command>");
		
	}
	
	public abstract void excute(String params);
	
	public String getCommand() {
		return command;
	}
	public void setCommand(String command) {
		this.command = command;
	}
	public String [] getParameters() {
		return parameters;
	}
	public void setParameters(String [] parameters) {
		this.parameters = parameters;
	}
	public String getShortname() {
		return shortname;
	}
	public void setShortname(String shortname) {
		this.shortname = shortname;
	}

	public MessageController getController() {
		return controller;
	}

	public void setController(MessageController controller) {
		this.controller = controller;
	}
	

	
}
