package com.example.tags;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;

public class SimpleInnerTag extends SimpleTagSupport{
	
	public void doTag()throws JspException, IOException{
		// it's OK for a SimpleTag to ask for a Classic parent:
		MyClassicParent parent = (MyClassicParent)getParent();
		// Once you have a parent, you can call methods on it like any other Java object, so you can get
		// attributes of the parent tag:
		getJspContext().getOut().println("Parent attribute is: " + parent.getName());
	}
}
