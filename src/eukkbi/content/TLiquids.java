package eukkbi.content;

import mindustry.ctype.ContentList;
import mindustry.type.Liquid;

public class TLiquids implements ContentList {
    public static Liquid Toluene,Benzene,Xylene;

    @Override
    public void load() {
        Toluene = new Liquid("Toluene"){{

        }};

        Benzene = new Liquid("Benzene"){{

        }};

        Xylene = new Liquid("Xylene"){{

        }};
    }
}
