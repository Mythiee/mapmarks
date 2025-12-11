package MapMarks.patches;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePostfixPatch;
import com.megacrit.cardcrawl.core.CardCrawlGame;

@SpirePatch(clz = CardCrawlGame.class, method = "loadSave")
public class LoadSavePatch {

    // The old Map in the game will be destroyed after load save, so it is necessary to re-render the map tile
    @SpirePostfixPatch
    public static void onLoadSave() {
        System.out.println("save loaded");
    }
}
