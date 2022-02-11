package eukkbi.content;

import arc.graphics.Color;
import mindustry.ctype.ContentList;
import mindustry.type.Item;

public class TItems implements ContentList {
    public static Item Wood,Hematite,Tungsten,IronSulFide,Aluminum;


    @Override
    public void load() {

        Wood = new Item("Wood"){{
           flammability = 0.6f;
           hardness = 1;
        }};

        Hematite = new Item("Hematite", Color.valueOf("a48a8b")){{
           hardness = 1;
        }};

        Tungsten = new Item("Tungsten", Color.valueOf("7a7a87")){{
            hardness = 1;

        }};

        IronSulFide = new Item("IronSulFide", Color.valueOf("b7bc8d")){{
            hardness = 1;
        }};

        Aluminum = new Item("Aluminum", Color.valueOf("969696")){{
           hardness = 1;
        }};
    }
}