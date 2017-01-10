package hu.tokingame.silverdart.CreditsScreen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.ExtendViewport;

import hu.tokingame.silverdart.Global.Globals;
import hu.tokingame.silverdart.MyGdxGame;
import hu.tokingame.silverdart.MyBaseClasses.MyScreen;

/**
 * Created by davimatyi on 2016. 11. 15..
 */

public class CreditsScreen extends MyScreen {
    private CreditsStage stage;
    public CreditsScreen(MyGdxGame game) {
        super(game);
    }

    @Override
    public void init() {
        super.init();
        stage = new CreditsStage(new ExtendViewport(Globals.WORLD_WIDTH,Globals.WORLD_HEIGHT,new OrthographicCamera(Globals.WORLD_WIDTH,Globals.WORLD_HEIGHT)),new SpriteBatch(),game);
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        stage.act(delta);
        stage.draw();
    }
}
