package com.cts.avijeet;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {
	
	  @Id
	    @GeneratedValue
	    private Long id;
	    private String name;
	    private String author;
	    private BigDecimal price;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public BigDecimal getPrice() {
			return price;
		}
		public void setPrice(BigDecimal price) {
			this.price = price;
		}
		public Book() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Book(Long id, String name, String author, BigDecimal price) {
			super();
			this.id = id;
			this.name = name;
			this.author = author;
			this.price = price;
		}

	    
	    
}
