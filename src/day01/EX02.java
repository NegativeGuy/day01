package day01;

public class EX02 {
	public static void main(String[] args) {
		/* 이스케이프 문자
		  \n : 키보드 enter 역할(개행)
		  \t : tab 크기만큼 오른쪽으로 커서 이동(8칸 정도)
		  \" : "(쌍따옴표)를 일반 문자로 사용하고자 할 때
		  \\ " \(역슬래쉬)를 표현 할 때 사용
	    */
		
		// " " : 쌍따옴표로 묶인 값은 문자열로 인식한다
		System.out.println("He\nllo Java");
		System.out.println("1\t1234567\t12345678\t12");
		System.out.println("test \"123\" \\456");
	}
}
