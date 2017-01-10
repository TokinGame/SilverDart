package hu.tokingame.silverdart.CreditsScreen;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.Viewport;

import hu.tokingame.silverdart.Global.Globals;
import hu.tokingame.silverdart.MyGdxGame;
import hu.tokingame.silverdart.MyBaseClasses.MyLabel;
import hu.tokingame.silverdart.MyBaseClasses.MyStage;
import hu.tokingame.silverdart.MyBaseClasses.MyTextButton;

/**
 * Created by davimatyi on 2016. 12. 09..
 */

public class HowToPlayStage extends MyStage {
    String s;

    public HowToPlayStage(Viewport viewport, Batch batch, MyGdxGame game) {
        super(viewport, batch, game);
    }

    @Override
    public boolean keyDown(int keycode) {
        if(keycode == Input.Keys.BACK){
            game.setScreenBackByStackPop();
        }
        return false;
    }

    @Override
    public void init() {

    }
}
