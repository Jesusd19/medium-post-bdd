package MediumBDD.models;

public class Post {
	private String title;
	private String author;
	private String date;
	private String estimated_time;
	
	public Post(String title, String author, String date, String estimated_time) {
		this.title = title;
		this.author = author;
		this.date = date;
		this.estimated_time = estimated_time;
	}
	
	public String getTitle() {
		return title;
	}
	 	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getEstimated_time() {
		return estimated_time;
	}
	
	public void setEstimated_time(String estimated_time) {
		this.estimated_time = estimated_time;
	}
	

}
