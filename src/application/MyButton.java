package application;

import javafx.scene.control.Button;
import javafx.scene.control.Skin;

public class MyButton extends Button {

    public MyButton() {
        super();
    }

    public MyButton(String text) {
        super(text);
    }

    @Override
    protected Skin<?> createDefaultSkin() {
        return new MyButtonSkin(this);
    }

}
