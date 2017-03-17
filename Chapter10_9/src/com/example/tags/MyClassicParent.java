package com.example.tags;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;

// TagSupport is Classic
public class MyClassicParent extends TagSupport{

	// this field variable is for attribute:
	private String name;
	
	// setter method for attribute:
	public void setName(String name){
		this.name = name;
	}
	
	// Provide a getter method for the attribute, so that the child tag can get the attribute value:
	public String getName(){
		return name;
	}
	
	public int doStartTag()throws JspException{
		return EVAL_BODY_INCLUDE; // if you return SKIP_BODY , the inner tag will never be processed
	}
}
