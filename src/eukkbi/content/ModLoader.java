package eukkbi.content;

import mindustry.ctype.ContentList;

public class ModLoader implements ContentList{
    private final ContentList[] contents = {
            new TItems(),
    };

    public void load(){
        for(ContentList list : contents){
            list.load();
        }
    }
}
