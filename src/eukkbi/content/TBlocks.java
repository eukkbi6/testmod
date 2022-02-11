package eukkbi.content;

import mindustry.content.Items;
import mindustry.ctype.ContentList;
import mindustry.type.Category;
import mindustry.type.LiquidStack;
import mindustry.world.Block;
import mindustry.world.blocks.environment.OreBlock;
import mindustry.world.blocks.production.GenericCrafter;
import mindustry.world.blocks.production.Separator;

import static mindustry.type.ItemStack.*;

public class TBlocks implements ContentList {
    public static Block

    //ore
    oreHematite,oreTungsten,oreIronSulFide,oreAluminum,

    //production
    BTXExtractor;


    @Override
    public void load() {
        oreHematite = new OreBlock(TItems.Hematite){{
            oreDefault = true;
            oreThreshold = 0.8341f;
            oreScale = 25.03443f;
        }};

        oreIronSulFide = new OreBlock(TItems.IronSulFide){{
            oreDefault = true;
            oreThreshold = 0.95f;
            oreScale = 25.7823f;
        }};

        oreTungsten = new OreBlock(TItems.Tungsten){{
            oreDefault = true;
            oreThreshold = 0.8294f;
            oreScale = 25.3242f;
        }};

        oreAluminum = new OreBlock(TItems.Aluminum){{
            oreDefault = true;
            oreThreshold = 0.91f;
            oreScale = 25.2529f;
        }};
    }
}
