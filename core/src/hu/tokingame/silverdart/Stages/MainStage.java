package hu.tokingame.silverdart.Stages;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.utils.viewport.Viewport;

import hu.tokingame.silverdart.Global.Globals;
import hu.tokingame.silverdart.MyBaseClasses.MyActor;
import hu.tokingame.silverdart.MyBaseClasses.MyLabel;
import hu.tokingame.silverdart.MyBaseClasses.MyStage;
import hu.tokingame.silverdart.MyBaseClasses.OneSpriteStaticActor;
import hu.tokingame.silverdart.MyGdxGame;

/**
 * Created by davimatyi on 2017. 01. 13..
 */

public class MainStage extends MyStage {

    private Texture bg;
    private OneSpriteStaticActor weapon, tool;
    private MyLabel health;


    @Override
    public void init() {


        addActor(new OneSpriteStaticActor(bg){
            @Override
            public void init() {
                this.setSize(Globals.WORLD_WIDTH, Globals.WORLD_HEIGHT);
                this.setPosition(0, 0);
            }
        });
        addActor(health = new MyLabel("",null){
            @Override
            public void init() {
                super.init();
                this.setSize(160, 80);
                setPosition(Globals.WORLD_WIDTH-this.getWidth(), Globals.WORLD_HEIGHT-this.getHeight());
            }
        });
    }

    public MainStage(Viewport viewport, Batch batch, MyGdxGame game) {
        super(viewport, batch, game);


    }

}
