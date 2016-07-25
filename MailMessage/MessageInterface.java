package MailMessage;
import java.util.ArrayList;

public interface MessageInterface {

	public Message findByID(int id);
	public ArrayList<Message> findByTag(String message);
	public ArrayList<Message> findByCatergory(String cat);
	public ArrayList<Message> searchAll(String message);
}
