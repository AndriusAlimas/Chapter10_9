package com.example.tags;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;

// In the child tag:MenuItem
public class MenuItem extends TagSupport {
	// MenuItem has an attribute declared in the TLD for the itemValue.
	// This is the value we need to send to the parent tag...
	private String itemValue;
	
	// this is attribute setter:
	public void setItemValue(String itemValue){
		this.itemValue = itemValue;
	}
	
	public int doStartTag()throws JspException{
		return EVAL_BODY_INCLUDE;
	}
	
	public int doEndTag()throws JspException{
		// Simple-get reference to the parent tag and call its addMenuItem() method!:
		Menu parent = (Menu)getParent();// dont forget to cast!!
		parent.addMenuItem(itemValue);
		return EVAL_PAGE;
	}
}
