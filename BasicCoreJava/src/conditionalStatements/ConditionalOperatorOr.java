package conditionalStatements;

public class ConditionalOperatorOr

{

	public static void main(String[] args) {
		int pcm = 60, jre = 30, cet = 60;

		if (pcm >= 60) {
			if (jre >= 30 || cet >= 60) {
				System.out.println("You are eligible");
			}

			else {
				System.out.println("You are not eligible");
			}

		} else

			System.out.println("You are not eligible");

	}

}
