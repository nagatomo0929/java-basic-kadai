package text.section_09;

public class AgeBasedFee {
	public static void main(String[]args) {
		int agegroup = 30;
		int fee;
		
		fee = switch (agegroup) {
		case 10 -> 1000;
		case 20 -> 2000;
		case 30,40 -> 3000;
		case 50 -> 4000;
		default -> 500;
		};
		
		System.out.println(agegroup + "代の料金は" + fee + "円です");
	}

}
