package com.tut.FirstMavenProject;

public class factory {
	public Scooty getInstance(String obj) {
		if(obj.equals("jupiter")) {
			return new Jupiter();
		}
		if(obj.equals("Activa")) {
			return new Activa();
		}
		return null;
	}

}
