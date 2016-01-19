package retrostruct.epsilon.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import retrostruct.epsilon.graphics.Animation;
import retrostruct.epsilon.interfaces.Renderable;

public abstract class Character extends GameObject implements Renderable {
	
	protected Animation animation;

	public Character(float x, float y) {
		super(x, y);
	}
	
	public void say(String message) {
		// TODO: Actually display message with text on screen
		System.out.println(message);
	}

	public void render(SpriteBatch batch) {
		animation.render(batch, position);
	}
}
