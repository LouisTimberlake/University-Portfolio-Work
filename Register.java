package lib;

import java.util.ArrayList;

public class Register {
	
	//Fields
	
	private ArrayList<Name> list;
	
	//Constructors
	
	public Register() {
		list = new ArrayList<>();
	}
	
	//Methods
	
	public void addName(Name e) {
		list.add(e);
	}
	
	public Name removeName(int pos) {
		return list.remove(pos);
	}
	
	public Name getName(int pos) {
		return list.get(pos);
	}
		
	public int registerSize() {
		return list.size();
	}
		
	public void clearRegister() {
		list.clear();
	}
	
	public boolean isRegisterEmpty() {
		return list.isEmpty();
	}
	
	public String toString() {
		return "Register:[" + "list=" + list + "]";
	}
	
	public String searchRegisterByFamilyName() {
		if 
		
		return
	}
	
	public char countFirstNameOccurrences() {
		
		
		return 
	}
	

}
