package eukkbi.content;


import mindustry.ctype.ContentList;
import mindustry.type.Item;

public class TItems implements ContentList {
    public static Item wood;

    @Override
    public void load() {
        wood = new Item("wood"){{
           flammability = 0.6f;
           hardness = 1;
           cost = 1;

        }};
    };
}
