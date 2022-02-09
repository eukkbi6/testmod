package eukkbi.content;

import mindustry.ctype.ContentList;
import mindustry.world.Block;
import mindustry.world.blocks.environment.OreBlock;

public class TBlocks implements ContentList {
    public static Block oreHematite,oreTungsten,oreIronSulFide,oreAluminum;

    @Override
    public void load() {
        oreHematite = new OreBlock(TItems.HematiteOrg){{
            oreDefault = true;
            oreThreshold = 0.8341f;
            oreScale = 25.03443f;
        }};

        oreIronSulFide = new OreBlock(TItems.IronSulFideOrg){{
            oreDefault = true;
            oreThreshold = 0.95f;
            oreScale = 25.7823f;
        }};

        oreTungsten = new OreBlock(TItems.TungstenOrg){{
            oreDefault = true;
            oreThreshold = 0.8294f;
            oreScale = 25.3242f;
        }};

        oreAluminum = new OreBlock(TItems.AluminumOrg){{
            oreDefault = true;
            oreThreshold = 0.91f;
            oreScale = 25.2529f;
        }};
    }
}
