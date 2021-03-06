package ThePokerPlayer.relics;

import ThePokerPlayer.PokerPlayerMod;
import basemod.abstracts.CustomRelic;
import com.badlogic.gdx.graphics.Texture;
import com.megacrit.cardcrawl.relics.AbstractRelic;

public class DeckCase extends CustomRelic {

	private static final String RAW_ID = "DeckCase";
	public static final String ID = PokerPlayerMod.makeID(RAW_ID);
	public static final String IMG = PokerPlayerMod.GetRelicPath(RAW_ID);
	public static final String OUTLINE = PokerPlayerMod.GetRelicOutlinePath(RAW_ID);
	public static final int EXHAUST_COUNT = 6;

	public DeckCase() {
		super(ID, new Texture(IMG), new Texture(OUTLINE), RelicTier.STARTER, LandingSound.FLAT);
	}

	@Override
	public void atPreBattle() {
		setCounter(EXHAUST_COUNT);
	}

	@Override
	public void onVictory() {
		setCounter(-1);
	}

	@Override
	public String getUpdatedDescription() {
		return DESCRIPTIONS[0] + EXHAUST_COUNT + DESCRIPTIONS[1];
	}

	@Override
	public AbstractRelic makeCopy() {
		return new DeckCase();
	}
}
