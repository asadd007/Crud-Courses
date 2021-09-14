package com.restapiproject.learnspringboot.Courses;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class courses {
	@Id
	@GeneratedValue
private long id;
	
	//@Column(name="course_name")
private String name;

private String author;
public courses()
{
	
}
public courses(long id, String name, String author) {
	super();
	this.id = id;
	this.name = name;
	this.author = author;
}
@Override
public String toString() {
	return "courses [id =" + id +  ", name=" + name + ", author=" + author + "]";
}
public long getId() {
	return id;
}
public String getName() {
	return name;
}
public String getAuthor() {
	return author;
}

}
