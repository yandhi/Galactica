package me.kix.galactica.listener;

import me.kix.galactica.event.Event;

/**
 * @author Kix
 * @since 7/8/2018
 */
public interface Executed<E extends Event> {

	void execute(E event);

}
