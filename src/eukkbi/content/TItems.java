package eukkbi.content;

import mindustry.ctype.ContentList;
import mindustry.type.Item;

public class TItems implements ContentList {
    public static Item Wood;

    @Override
    public void load() {
        Wood = new Item("Wood"){{
           flammability = 0.6f;
           hardness = 1;
           cost = 1;
        }};
    }
}
