package fr.eni.spring;

public class Message {
	private String msg;
	
	public Message() {
		System.out.println("Cr�ation d'un message");
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
