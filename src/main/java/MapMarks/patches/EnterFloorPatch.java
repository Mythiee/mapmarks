package MapMarks.patches;

import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePrefixPatch;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;

@SpirePatch(clz = AbstractDungeon.class, method = "nextRoomTransition")
public class EnterFloorPatch {

    // This method is executed when entering a new floor. NOTE: Starting a new game will trigger this patch too.
    @SpirePrefixPatch
    public static void onNextFloor() {
        int floor = AbstractDungeon.floorNum;
        System.out.println("enter floor: " + floor);
    }
}
