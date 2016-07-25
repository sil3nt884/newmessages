package MailMessage;

public class Message {

	private String title,body,cat;
	private String [] tags;
	
	
	
	public Message(String title, String body, String cat, String...tags){
		this.setTitle(title);
		this.setBody(body);
		this.setCat(cat);
		this.setTags(tags);
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getBody() {
		return body;
	}



	public void setBody(String body) {
		this.body = body;
	}



	public String getCat() {
		return cat;
	}



	public void setCat(String cat) {
		this.cat = cat;
	}



	public String [] getTags() {
		return tags;
	}



	public void setTags(String [] tags) {
		this.tags = tags;
	}
	
	

}
