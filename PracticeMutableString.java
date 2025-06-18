package StringPractice;

public class PracticeMutableString {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" world");
		System.out.println(sb);
		sb.insert(11, '!');
		System.out.println(sb);
		sb.replace(6,10,"dear");
		System.out.println(sb);
		System.out.println(sb.length());
		sb.delete(10,10);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.setLength(20);
		System.out.println(sb);
	}

}
