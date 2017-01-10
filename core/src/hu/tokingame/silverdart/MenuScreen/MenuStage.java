package hu.tokingame.silverdart.MenuScreen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.Viewport;

import hu.tokingame.silverdart.CreditsScreen.CreditsScreen;
import hu.tokingame.silverdart.CreditsScreen.HowToPlayScreen;
import hu.tokingame.silverdart.Global.Assets;
import hu.tokingame.silverdart.Global.Globals;
import hu.tokingame.silverdart.MyGdxGame;
import hu.tokingame.silverdart.MyBaseClasses.MyLabel;
import hu.tokingame.silverdart.MyBaseClasses.MyStage;
import hu.tokingame.silverdart.MyBaseClasses.MyTextButton;
import hu.tokingame.silverdart.MyBaseClasses.OneSpriteAnimatedActor;

/**
 * Created by M on 11/14/2016.
 */

public class MenuStage extends MyStage {

    MyTextButton button;

    public static boolean musicToggle = true;

    public MenuStage(Viewport viewport, Batch batch, MyGdxGame game) {
        super(viewport, batch, game);
        Gdx.input.setCatchBackKey(true);
    }

    @Override
    public boolean keyDown(int keycode) {
        if(keycode == Input.Keys.BACK){
            game.setScreen(new ExitScreen(game));
        }
        return false;
    }

    @Override
    public void init() {

        addActor(new MyTextButton("How To Play"){
            @Override
            protected void init() {
                super.init();
                setPosition(10, 100);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        game.setScreen(new HowToPlayScreen(game));
                    }
                });
            }
        });

        addActor(new MyTextButton("Play"){
            @Override
            protected void init() {
                super.init();
                setPosition(10, 400);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        //game.setScreen(new LevelSelectScreen(game));
                        //game.setScreen(new LevelSelectScreen(game));

                    }
                });
            }

        });
        addActor(new MyTextButton("Credits"){
            @Override
            protected void init() {
                super.init();
                setPosition(10, 10);
                addListener(new ClickListener(){
                    @Override
                    public void clicked(InputEvent event, float x, float y) {
                        super.clicked(event, x, y);
                        game.setScreen(new CreditsScreen(game));
                    }
                });
            }
        });



    }
}

