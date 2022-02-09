package eukkbi.content;

import mindustry.ctype.ContentList;
import mindustry.type.Item;

public class TItems implements ContentList {
    public static Item Wood,HematiteOrg,TungstenOrg,IronSulFideOrg,AluminumOrg;

    @Override
    public void load() {

        Wood = new Item("Wood"){{
           flammability = 0.6f;
           hardness = 1;
        }};

        HematiteOrg = new Item("Hematite"){{
           hardness = 1;
        }};

        TungstenOrg = new Item("Tungsten"){{
            hardness = 1;
        }};

        IronSulFideOrg = new Item("IronSulFide"){{
            hardness = 1;
        }};

        AluminumOrg = new Item("Aluminum"){{
           hardness = 1;
        }};
    }
}