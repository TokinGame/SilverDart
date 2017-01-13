package hu.tokingame.silverdart.MyBaseClasses;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.ui.Label;

import hu.tokingame.silverdart.Global.Assets;


/**
 * Created by davimatyi on 2017. 01. 10..
 */
public class MyLabel extends Label implements InitableInterface{

    public static com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle style1, style2;

    static {
        refresh();
    }

    public static void refresh(){
        style1 = new com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle();
        style1.font = Assets.manager.get(Assets.ANTON_FONT);
        style1.fontColor = Color.WHITE;

    }

    public MyLabel(CharSequence text, LabelStyle style) {
        super(text, style);
        init();
    }

    @Override
    public void init() {

    }

    protected float elapsedtime =0;

    @Override
    public void act(float delta) {
        super.act(delta);
        elapsedtime += delta;

        //setFontScale(Math.abs((float)Math.sin(elapsedtime*2f))/2f+0.8f);
    }
}
