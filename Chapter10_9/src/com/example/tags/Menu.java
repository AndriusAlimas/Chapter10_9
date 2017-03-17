package com.example.tags;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.ArrayList;

// In the parent tag:Menu
public class Menu extends TagSupport{
	// This is NOT an attribute setter method!! This method exist ONLY!! so that a child tag can tell the parent tag
	// about the child's attribute value. (It's called in between doStartTag() and doEndTag())
	private ArrayList items;
	
	public void addMenuItem(String item){
		items.add(item);
	}
	
	public int doStartTag()throws JspException{
		// Don't forget to reset the ArrayList in doStartTag(), since the tag handler might
		// be reused by the Container:
		items = new ArrayList();
		
		// If you do not return EVAL_BODY_INCLUDE, the child tag's will never be processed!
		return EVAL_BODY_INCLUDE;
	}
	
	public int doEndTag()throws JspException{
		try{
			pageContext.getOut().println("Menu items are: " + items);
		}catch(Exception ex){
			throw new JspException("Exception: " + ex.toString());
		} 
		// you dont want to stop page at this point so you use EVAL_PAGE
		return EVAL_PAGE;
	}
}
