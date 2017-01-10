package hu.tokingame.silverdart.CreditsScreen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.Viewport;

import hu.tokingame.silverdart.Global.Assets;
import hu.tokingame.silverdart.Global.Globals;
import hu.tokingame.silverdart.MyGdxGame;
import hu.tokingame.silverdart.MyBaseClasses.MyLabel;
import hu.tokingame.silverdart.MyBaseClasses.MyStage;
import hu.tokingame.silverdart.MyBaseClasses.MyTextButton;
import hu.tokingame.silverdart.MyBaseClasses.OneSpriteStaticActor;

/**
 * Created by davimatyi on 2016. 11. 15..
 */

public class CreditsStage extends MyStage {
    String s;
    public CreditsStage(Viewport viewport, Batch batch, MyGdxGame game) {
        super(viewport, batch, game);
        Gdx.input.setCatchBackKey(true);
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