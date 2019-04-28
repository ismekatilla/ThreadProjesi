package org.ismek;

public class OndanYirmeye extends Thread {

	@Override
	public void run() {
		for (char i = 96; i < 110; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

}
