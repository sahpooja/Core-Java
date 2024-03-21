package com.eb.entity;

import java.util.Iterator;
import java.util.List;

public class Post 
{
  private int postId;
  private String postName;
  private List<String>comments;
public Post() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Post [postId=" + postId + ", postName=" + postName + ", comments=" + comments + "]";
}
public Post(int postId, String postName, List<String> comments) {
	super();
	this.postId = postId;
	this.postName = postName;
	this.comments = comments;
}
 public void Show()
 {
	 System.out.println("Post Id:"+postId+"\nPost Heading:"+postName);
	 System.out.println("Comments are:");
	 
	 Iterator<String>itr=comments.iterator();
	 
	 while(itr.hasNext())
	 {
		 System.out.println(itr.next());
	 }
   }
  
  }
