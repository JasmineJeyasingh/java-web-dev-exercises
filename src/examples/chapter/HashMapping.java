package examples.chapter;
import java.util.HashMap;

public class HashMapping {
    public static void main(String[] args) {

        HashMap<String, Integer> moons = new HashMap<>();
        moons.put("Mercury", 0);
        moons.put("venus", 1);
        System.out.println(moons.get("venus"));


    }



}
