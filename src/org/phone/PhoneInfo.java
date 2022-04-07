package org.phone;

public class PhoneInfo {
	private void phoneName() {
		System.out.println("apple");

	}
	private void phoneImeiNum() {
		System.out.println("123456");

	}
	private void camera() {
		System.out.println("64mega pixel");

	}
	private void storage() {
		System.out.println("64GB");

	}
	private void osName() {
		System.out.println("mac os");

	}
	public static void main(String[] args) {
		//classname objname=new classname();
		PhoneInfo phinfo=new PhoneInfo();
		//obj.methodname();
		phinfo.phoneName();
		phinfo.phoneImeiNum();
		phinfo.camera();
		phinfo.storage();
		phinfo.osName();
	}

}
