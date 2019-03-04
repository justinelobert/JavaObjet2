import java.util.Scanner;

public class MainLivre {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Livre user = new Livre ();

		user.Quest();
		System.out.println(user);

		Livre us = new Livre();

		us.Quest();
		System.out.println(us);

		Livre u = new Livre();

		u.Quest();
		System.out.println(user + " " + us + " " + u);

	}

}
