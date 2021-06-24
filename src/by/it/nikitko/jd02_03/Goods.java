package by.it.nikitko.jd02_03;

import java.util.HashMap;
import java.util.Map;


public class Goods {
    private static final Map<String, Integer> GOODS = new HashMap<>();

    static {
        GOODS.put("Absent", 104);
        GOODS.put("Whiskey", 160);
        GOODS.put("Beer", 12);
        GOODS.put("Vodka", 73);
        GOODS.put("Minskaya-4", 8);
    }

    public static Map<String, Integer> getGoods() {
        return GOODS;
    }


}
