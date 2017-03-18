package com.example.tags;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;

public class FindAncestor extends TagSupport {
	// this classic tag has one method, which find ancestor tag (Top level tag) and return some kind variable:
	public int doStartTag()throws JspException{
		
/*
 * findParent will return the nearest enclosing tag.
findAncestorWithClass will find the nearest ancestor with the given class. This may be the parent, but likely will not. 
i.e. consider basic HTML tags for tables as tag classes.
Table
Tbody
TR
TD
findParent from TD will find the TR it is in. findAncestorWithClass(TR) will find the same TR. 
findAncestorWithClass(Table) will find the table. 1-arg is starting tag, 2-arg the class of the tag you want: */
		Menu ancestor = (Menu)findAncestorWithClass(this, Menu.class);
		try{
			pageContext.getOut().println("We find ancestor tag Menu, then retrieve ArrayList elements: " 
		+ ancestor.getItems());
		}catch(Exception ex){
			
		}
		return SKIP_BODY;
	}
}
