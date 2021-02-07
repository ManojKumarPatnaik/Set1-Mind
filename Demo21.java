/*
 * Exercise :22
 * reverse of a string word by word 
 * */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo21 {

	public static String customiseReverse(String str) {
		List<String> list = Mysplit(str);
		str = "";
		for (int i = 0; i < list.size(); i++) {
			String res = list.get(i);
			String temp = "";
			abc:for (int j = 0; j < res.length(); j++) {
				char ch = res.charAt(j);
				if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
					temp = ch+temp;
				} else {
					break abc;
				}
			}
			if(temp.equals(""))
				str = str + res;
			else
				str = str + temp;
		}

		return str;
	}

	public static List<String> Mysplit(String str) {
		List<String> res = new ArrayList<>();
		for (int i = 0; i < str.length();) {
			String temp = "";
			while (i < str.length() && str.charAt(i) != ' ' && !(str.charAt(i) >= '0' && str.charAt(i) <= '9')
					&& str.charAt(i) != ',' && str.charAt(i) != '.') {
				temp = temp + String.valueOf(str.charAt(i));
				i++;
			}
			res.add(temp);
			if (i < str.length() && str.charAt(i) == ' ') {
				res.add(" ");
				i++;
			}
			if (i < str.length() && (str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
				temp = "";
				while (i < str.length() && (str.charAt(i) >= '0' && str.charAt(i) <= '9')) {
					temp = temp + String.valueOf(str.charAt(i));
					i++;
				}
				res.add(temp);
			}
			if (i < str.length() && str.charAt(i) == '.') {
				res.add(".");
				i++;
			}
			if (i < str.length() && str.charAt(i) == ',') {
				res.add(",");
				i++;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(customiseReverse(str));
		sc.close();
	}

}