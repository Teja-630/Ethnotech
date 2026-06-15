import java.util.*;
class HashExam {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("1", "Akhila");
        hashMap.put("2", "Pagundla");
        hashMap.put("1", "Akhila");
        hashMap.put("3", "tej");
        hashMap.put("1", "seetha");
        hashMap.put("1", "ram");
        System.out.println(hashMap);
        System.out.println(hashMap.get("ram"));
        System.out.println(hashMap.remove("Akhila"));
        System.out.println(hashMap.containsValue("tej"));
        System.out.println(hashMap.containsKey("3"));
        
    }
}