package datastructures;

public class AllSubstring {

	public static void main(String[] args) {

		String s = "abcd";

		for (int i = 0; i < s.length(); i++) {
			String interim = String.valueOf(s.charAt(i));
			System.out.println(interim);
			for (int j = i + 1; j < s.length(); j++) {
				interim = interim + String.valueOf(s.charAt(j));
				System.out.println(interim);
			}

		}

	}

}
