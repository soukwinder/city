package grouptest.artifacttest;

import java.util.ArrayList;

public class TestClass {
	
	ArrayList<Integer> khota = new ArrayList<Integer>();

	public void loop() {
		
		for(int i = 0; i<=50; i++){
			//System.out.println(i);
			khota.add(i);
		}
		System.out.println(khota);
	}

}
