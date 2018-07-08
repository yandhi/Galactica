package me.kix.galactica;

import me.kix.galactica.manage.EventManager;
import me.kix.galactica.manage.impl.BasicEventManager;

/**
 * Galactica is a simple event system based on anonymous inner classes.
 *
 * @author Kix
 * @since 7/8/2018
 */
public class Galactica {

	private static Galactica instance;

	public EventManager newEventManager() {
		return new BasicEventManager();
	}

	public static Galactica getInstance() {
		if (instance == null) {
			instance = new Galactica();
		}
		return instance;
	}
}
