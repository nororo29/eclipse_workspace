package java_basic_day12;

class Employee {
	int eno;
	
	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Employee" + eno + " 생성");
	}
	
	@Override
	protected void finalize() throws Throwable {  // 가비지컬랙션
		System.out.println("Employee" + eno + " 삭제");
	}
}


public class SystemGcTest {
	public static void main(String[] args) {
		
		Employee emp = new Employee(1);  // Employee1 생성
		emp = null;  // Employee1이 가비지컬랙션 대상됨
		emp = new Employee(2);  // Employee2 생성
		emp = new Employee(3);  // Employee3 생성, Employee2 가비지컬랙션 대상됨
		
		System.out.println("Employee" + emp.eno);  //Employee3
		
		System.gc(); // Employee1 삭제, Employee2 삭제
		
	}

}
