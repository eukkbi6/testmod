package eukkbi.world.blocks;

import arc.util.Structs;
import mindustry.type.LiquidStack;
import mindustry.world.blocks.production.LiquidConverter;
import mindustry.world.meta.Stat;
import mindustry.world.meta.StatValues;

public class WaterSeparator extends LiquidConverter {
    public LiquidStack[] results;

    public WaterSeparator(String name) {
        super(name);
        hasLiquids = true;
    }

    @Override
    public void setStats(){
        super.setStats();

        stats.add(Stat.output, StatValues.liquids(liquid -> {
            return Structs.contains(results, i -> i.liquid == liquid);
        }));
    }
}