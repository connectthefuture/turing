package com.viglet.turing.se.similar;

public class VigSESimilarResultAttr {
	String attribute;
	String value;
	
	public VigSESimilarResultAttr(String attribute, String value) {
		this.setAttribute(attribute);
		this.setValue(value);
	}
	public String getAttribute() {
		return attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
