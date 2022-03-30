package enc;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;
import java.util.TreeMap;

public class ByteArrCompa {

	public static void main(String[] args) {
		String s = "123122";
		String s1 = s.substring(0,s.length()/2);
		String s2 = s.substring(s.length()/2);
		System.out.println(s1+" "+s2);
		  
		  
		  
	}
	
	}

public int minSteps(String s, String t) {
    TreeMap<Character, Integer> m1 = new TreeMap<>();
    TreeMap<Character, Integer> m2 = new TreeMap<>();

    for (char c : s.toCharArray()) {
        m1.compute(c, (k, v) -> v == null ? 1 : v + 1);
    }
    for (char c : t.toCharArray()) {
        m2.compute(c, (k, v) -> v == null ? 1 : v + 1);
    }

    int result=0;
    for(Map.Entry<Character,Integer> e:m2.entrySet()){
        char key=e.getKey();
        int val2=e.getValue();
        if(m1.containsKey(key)) {
            int val1 = m1.get(key);
            if (val1 > val2) {
                m2.put(key,0);
            } else if (val1 < val2) {
                m2.put(key, Math.abs(val1 - m2.get(key)));
            } else {
                m2.put(key,0);
                m1.put(key,0);
            }
        }
    }
    for(Map.Entry<Character,Integer> e:m2.entrySet()){
        result+=e.getValue();
    }
    return result;
}
}


