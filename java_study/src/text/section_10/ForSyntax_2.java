package text.section_10;

public class ForSyntax_2 {
	public static void main(String[] args) {
		
		for(int i = 1; i < 11; i++) {
			
		if(i == 3 ) {
			System.out.println("繰り返し処理を強制終了します");
			continue;
		}
		System.out.println(i);
	}
	}

}
