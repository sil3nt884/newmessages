package commands;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class CopyCommand extends Command {

	public CopyCommand(String command, String shortname) {
		super(command, shortname);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void excute(String params) {
		Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
		StringSelection stringSelection = new StringSelection (this.getController().findByID(Integer.parseInt(params)).getBody());
		clpbrd.setContents (stringSelection, null);
		System.out.println("Copied "+ this.getController().findByID(Integer.parseInt(params)).getTitle()+" Body:"+this.getController().findByID(Integer.parseInt(params)).getBody());
		
		
	}

	public void getHelp() {
		System.out.println("Copy selected message \n"
				+ "Usage: <number>");
		
	}

	

}
