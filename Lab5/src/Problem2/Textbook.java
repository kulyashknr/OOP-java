package Problem2;

import java.io.Serializable;

public class Textbook implements Serializable{
	private String isbn, title, author;
	
	public Textbook () {
		isbn = null;
		title = null;
		author = null;
	}
	
	public Textbook (String title, String author, String isbn) {
		this.isbn = isbn;
		this.title = title;
		this.author = author;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
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

	public String toString () {
		return author + "," + isbn + " " + title + " ";
	}

	public boolean equals(Object o) {
		if (o == this) return true;
		if (!(o instanceof Textbook))  {
			return false;
		}
		
		Textbook t = (Textbook)o;
		return (title.equals(t.title) && (author.equals(t.author)) && (isbn.equals(t.isbn)));
	}
}
