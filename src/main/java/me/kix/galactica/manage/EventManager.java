package me.kix.galactica.manage;

import me.kix.galactica.event.Event;
import me.kix.galactica.listener.Listener;

import java.util.Set;

/**
 * @author Kix
 * @since 7/8/2018
 */
public interface EventManager {

	void register(Listener listener);

	void unregister(Listener listener);

	void clear();

	void dispatch(Event event);

	Set<Listener> getListeners();

}
