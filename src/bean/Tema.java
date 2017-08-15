package bean;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

public class Tema implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public enum Tip
	{
		TEXT,
		IMAGE,
		LINK
	}
	
	private Tip type;
	private String parent;
	private String title;
	private String author;
	private HashMap<String, Comment> comments;
	private String content;
	private long dateOfCreation;
	private long like;
	private long dislike;
	
	
	public Tema(Tip type, String parent, String title, String author,String content) {
		super();
		this.type = type;
		this.parent = parent;
		this.title = title;
		this.author = author;
		this.comments = new HashMap<>();
		this.content = content;
		this.dateOfCreation = new Date().getTime();
		this.like = 0;
		this.dislike = 0;
	}
	
	
	
	public Tip getType() {
		return type;
	}
	public void setType(Tip type) {
		this.type = type;
	}
	public String getParent() {
		return parent;
	}
	public void setParent(String parent) {
		this.parent = parent;
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
	public HashMap<String, Comment> getComments() {
		return comments;
	}
	public void setComments(HashMap<String, Comment> comments) {
		this.comments = comments;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public long getDateOfCreation() {
		return dateOfCreation;
	}
	public void setDateOfCreation(long dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}
	public long getLike() {
		return like;
	}
	public void setLike(long like) {
		this.like = like;
	}
	public long getDislike() {
		return dislike;
	}
	public void setDislike(long dislike) {
		this.dislike = dislike;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	public long upvote()
	{
		return ++like;
	}
	
	public long unupvote()
	{
		return --like;
	}
	
	public long downvote()
	{
		return ++dislike;
	}
	
	public long undownvote()
	{
		return --dislike;
	}
	
	
}
