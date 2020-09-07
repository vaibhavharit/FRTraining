package MyPack;

public class TypeCasting {
	
	public static void main(String[] args) {
		
		// 8 TYPES: 
		// byte(1B), short(2B), int(4B) long(8B needs 'L') 
		// float(4B needs 'f'), double(8B)
		// char(2B) .... boolean(1b)
		
		int x = 100;
		float f = x; //implicit casting
		System.out.println(f);
		
		f = 99.8834f;
		x = (int)f; //explicit casting
		System.out.println(x);
		
		char c = 'G';
		x = c; //implicit casting: ASCII code
		System.out.println(x);
		
		x = 99;
		c = (char)x; //explicit casting: ASCII char
		System.out.println(c);
		
		//UNI-CODE:
		System.out.println(Character.UnicodeBlock.of(90));
		char c2 = '\u0905';
		System.out.println(c2);
	}

}
