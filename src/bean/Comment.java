package bean;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

public class Comment implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String author;
	
	private String parentPodforuma;
	private String parentTeme;
	private String id;
	private long datumKreiranja;
	private HashMap<String, Comment> comments;
	private String sadrzaj;
	private long like;
	private long dislike;
	private boolean oznaka;
	
	public Comment(String author, String parentPodforuma, String parentTeme,
			String id, String sadrzaj) {
		super();
		this.author = author;
		this.parentPodforuma = parentPodforuma;
		this.parentTeme = parentTeme;
		this.id = UUID.randomUUID().toString();	//za jedinstveno oznacavanje
		this.datumKreiranja = new Date().getTime();
		this.comments = new HashMap<>();
		this.sadrzaj = sadrzaj;
		this.like = 0;
		this.dislike = 0;
		this.oznaka = false;
	}
	//=====================================================
	public void addComment(Comment comment) {
		this.comments.put(comment.getId(), comment);
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
	
	//===============================================================
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getParentPodforuma() {
		return parentPodforuma;
	}

	public void setParentPodforuma(String parentPodforuma) {
		this.parentPodforuma = parentPodforuma;
	}

	public String getParentTeme() {
		return parentTeme;
	}

	public void setParentTeme(String parentTeme) {
		this.parentTeme = parentTeme;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getDatumKreiranja() {
		return datumKreiranja;
	}

	public void setDatumKreiranja(long datumKreiranja) {
		this.datumKreiranja = datumKreiranja;
	}

	public HashMap<String, Comment> getComments() {
		return comments;
	}

	public void setComments(HashMap<String, Comment> comments) {
		this.comments = comments;
	}

	public String getSadrzaj() {
		return sadrzaj;
	}

	public void setSadrzaj(String sadrzaj) {
		this.sadrzaj = sadrzaj;
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

	public boolean isOznaka() {
		return oznaka;
	}

	public void setOznaka(boolean oznaka) {
		this.oznaka = oznaka;
	}
	
}
