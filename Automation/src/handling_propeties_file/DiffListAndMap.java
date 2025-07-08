package handling_propeties_file;

import java.util.ArrayList;
import java.util.HashMap;

public class DiffListAndMap {
	public static void main(String[] args) {
		// to arraylisr
		ArrayList<String> al = new ArrayList<String>();
		al.add("https://www.bing.com/");
		al.add("admin");
		al.add("nandajuturu@gmail.com");
		al.add("manager");
		System.out.println(al.get(2));
		// to create object of the map 
		HashMap<String, String > hm = new HashMap<String, String>();
		hm.put("url", "https://www.bing.com/");
		hm.put("username", "admin");
		hm.put("email", "nandajuturu@gmail.com");
		hm.put("password","manager");
		System.out.println(hm.get("password"));
	}
}
