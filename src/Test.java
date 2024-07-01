
public class Test {

	public static void main(String[] args) {
		
		Person taro = new Person();
		
		taro.name = "山田太郎" ;
		
		taro.age = 20 ;
		
		taro.phoneNumber = "090-XXXX-XXXX" ;
		
		taro.address = "XXX@gmail.com" ;
		
System.out.println(taro.name);
		
		System.out.println(taro.age);
		
		System.out.println(taro.phoneNumber);
		
		System.out.println(taro.address);
		
		taro.talk();
		
		taro.walk();
		
		taro.run();
		
		Person jiro = new Person();
		
		jiro.name = "木村次郎" ;
		
		jiro.age = 18 ;
		
		jiro.phoneNumber = "080-XXXX-XXXX" ;
		
		jiro.address = "XXX@yahoo.co.jp" ;
		
		System.out.println(jiro.name);
		
		System.out.println(jiro.age);
		
		System.out.println(jiro.phoneNumber);
		
		System.out.println(jiro.address);
		
		Person hanako = new Person();
		
		hanako.name = "鈴木花子" ;
		
		hanako.age = 16 ;
		
		hanako.phoneNumber = "050-XXXX-XXXX" ;
		
		hanako.address = "XXX@ezweb.ne.jp" ;
		
		System.out.println(hanako.name);
		
		System.out.println(hanako.age);
		
		System.out.println(hanako.phoneNumber);
		
		System.out.println(hanako.address);
		
		Person haraguchi = new Person();
		
		haraguchi.name ="原口智史" ;
		
		haraguchi.age = 28 ;
		
		haraguchi.phoneNumber ="090-3660-0797" ;
		
		haraguchi.address = "h8-shnagasaki@au.com" ;
		
		System.out.println(haraguchi.name);
		
		System.out.println(haraguchi.age);

		System.out.println(haraguchi.phoneNumber);
		
		System.out.println(haraguchi.address);
		
		Robot aibo = new Robot() ;
		
		aibo.name = "aibo" ;
		
		System.out.println(aibo.name);
		
		aibo.talk();
		
		aibo.walk();
		
		aibo.run();
		
		Robot asimo = new Robot() ;
		
		asimo.name = "asimo" ;
		
		System.out.println(asimo.name);
		
		asimo.talk();
		
		asimo.walk();
		
		asimo.run();
		
		Robot pepper = new Robot() ;
		
		pepper.name = "pepper" ;
		
		System.out.println(pepper.name);
		
		pepper.talk();
		
		pepper.walk();
		
		pepper.run();
		
	}

}
