package hu.tokingame.silverdart.LoadingScreen;

import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.utils.viewport.Viewport;

import hu.tokingame.silverdart.Global.Assets;
import hu.tokingame.silverdart.MyGdxGame;
import hu.tokingame.silverdart.MyBaseClasses.MyStage;
import hu.tokingame.silverdart.MyBaseClasses.OneSpriteAnimatedActor;

/**
 * Created by M on 11/14/2016.
 */

public class LoadingStage extends MyStage {

    private LoadingStage loadingStage;
    private OneSpriteAnimatedActor cassetteActor;

    public LoadingStage(Viewport viewport, Batch batch, MyGdxGame game) {
        super(viewport, batch, game);
    }


    @Override
    public void init() {
        /*loadingStage = this;
        addActor(cassetteActor = new OneSpriteAnimatedActor("ButtonAndOther/loading.txt"){
            @Override
            public void init() {
                super.init();
                stop();
                setFrame(0);
                setSize(loadingStage.getViewport().getWorldWidth(),loadingStage.getViewport().getWorldHeight());
            }
        });*/
    }

    @Override
    public void act(float delta) {
        super.act(delta);
        //cassetteActor.setFramePercent(Assets.manager.getProgress());
        //System.out.println(Assets.manager.getProgress());
    }
}
