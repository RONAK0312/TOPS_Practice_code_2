package com.assignments;

public class CAustarilaTraffice implements CentralTraffic {

	public static void main(String[] args) {
	
		CentralTraffic ct = new CAustarilaTraffice();
		ct.redStop();
		ct.greenGo();
		ct.FlashingYellow();
		
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("green Go implementation");
		
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red Stop implementation");
	}

	@Override
	public void FlashingYellow() {
		// TODO Auto-generated method stub
		System.out.println("Flash Yello Wait");
	}
}
