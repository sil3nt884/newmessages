package MailMessage;
import java.util.ArrayList;

public class MessageController implements MessageInterface {
	
	private Collection data  = new Collection();

	@Override
	public Message findByID(int id) {
		return data.getMessages().get(id);
	}

	public Collection getData() {
		return data;
	}

	public void setData(Collection data) {
		this.data = data;
	}

	@Override
	public ArrayList<Message> findByTag(String tags) {
		ArrayList<Message> messagesTags = new ArrayList<Message>();
		for(int i=0; i<data.getMessages().size(); i++){
			for(int j=0; j<data.getMessages().get(i).getTags().length; j++){
				 if(data.getMessages().get(i).getTags()[j].contains(tags)){
					  messagesTags.add(data.getMessages().get(i));
				 }
			}
		}
		return messagesTags;
	}
	

	@Override
	public ArrayList<Message> findByCatergory(String cat) {
		ArrayList<Message> messagesCat = new ArrayList<Message>();
		for(int i=0; i<data.getMessages().size(); i++){
			if(data.getMessages().get(i).getCat().equalsIgnoreCase((cat))){
				messagesCat.add(data.getMessages().get(i));
			}
		}
		return messagesCat;
	}

	@Override
	public ArrayList<Message> searchAll(String message) {
		ArrayList<Message> messagesAll = new ArrayList<Message>();
		for(int i=0; i<data.getMessages().size(); i++){
			if(data.getMessages().get(i).getBody().contains(message)){
				messagesAll.add(data.getMessages().get(i));
			}
		}
		return messagesAll;
	}
	
	
	public void printAllMessages(){
		for(int i=0; i<data.getMessages().size(); i++){
			System.out.println(i+". "+data.getMessages().get(i).getTitle());
		
		}
		return;
	}
	
	

	
	
}
