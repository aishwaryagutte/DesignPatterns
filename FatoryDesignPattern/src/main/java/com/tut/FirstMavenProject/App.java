package com.tut.FirstMavenProject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	factory f1= new factory();
		Scooty s1=f1.getInstance("Activa");
		s1.spec();
		
		factory f2= new factory();
		Scooty s2=f2.getInstance("jupiter");
		s2.spec();
    }
}
