package com.example.tags;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;

// TagSupport is classic tag handler
public class NestedLevelTag extends TagSupport{
	// private field that count how deep the nesting goes:
	private int nestLevel = 0; // default value is zero set
	
	public int doStartTag()throws JspException{
		nestLevel = 0;
		
		// Call the inherited getParent() method:
		Tag parent = getParent();
		
		// If it's null, then we're at the top level, and we don't have a parent:
		while(parent!=null){
			parent = parent.getParent(); // but if it's not null, get the parent of the parent we just got,
			nestLevel++;                 // and increment the counter variable
		}
		
		try {
			pageContext.getOut().println("<br>Tag nested level: " + nestLevel);
		}catch(IOException ex){
			throw new JspException("IOException- " + ex.toString());
		}
		return EVAL_BODY_INCLUDE;
	}
}
