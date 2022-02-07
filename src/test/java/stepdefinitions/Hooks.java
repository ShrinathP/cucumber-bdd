package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void PREinitilization(){
		System.out.println("PRE");
	}
	
	@Before("@SecondTag,@FirstTag")
	public void PREinitilization2(){
		System.out.println("PRE2");
	}
	
	@Before(order=0)
	public void PREinitilization3(){
		System.out.println("PRE3");
	}
	
	@Before(order=1)
	public void PREinitilization4(){
		System.out.println("PRE3");
	}
	
	
	@After
	public void POSTinitilization(){
		System.out.println("POST");
	}
}

