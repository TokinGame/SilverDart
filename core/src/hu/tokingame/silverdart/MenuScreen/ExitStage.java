package hu.tokingame.silverdart.MenuScreen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.Viewport;

import hu.tokingame.silverdart.MyGdxGame;
import hu.tokingame.silverdart.MyBaseClasses.MyLabel;
import hu.tokingame.silverdart.MyBaseClasses.MyStage;
import hu.tokingame.silverdart.MyBaseClasses.MyTextButton;

/**
 * Created by davimatyi on 2016. 12. 06..
 */

public class ExitStage extends MyStage {
    public ExitStage(Viewport viewport, Batch batch, MyGdxGame game) {
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

        addActor(new MyLabel("Are you sure want to exit?", MyLabel.style1){
            @Override
            public void init() {
                super.init();
                this.setPosition(200, 600);
            }
        });

        addActor(new MyTextButton("Yes"){
            @Override
            protected void init() {
                super.init();
                this.setPosition(200, 400);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        System.exit(0);
                    }
                });
            }
        });
        addActor(new MyTextButton("No"){
            @Override
            protected void init() {
                super.init();
                this.setPosition(200, 450);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        game.setScreenBackByStackPop();
                    }
                });
            }
        });

    }
}

