package me.kix.galactica.manage.impl;

import me.kix.galactica.event.Event;
import me.kix.galactica.listener.Listener;
import me.kix.galactica.manage.EventManager;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Kix
 * @since 7/8/2018
 */
public final class BasicEventManager implements EventManager {

	private final Set<Listener> listeners = new HashSet<>();

	@Override
	public void register(Listener listener) {
		listeners.add(listener);
	}

	@Override
	public void unregister(Listener listener) {
		listeners.remove(listener);
	}

	@Override
	public void clear() {
		listeners.clear();
	}

	@Override
	@SuppressWarnings("unchecked")
	public void dispatch(Event event) {
		for (Listener listener : listeners) {
			if (listener.getEvent().equals(event.getClass()))
				listener.execute(event);
		}
	}

	@Override
	public Set<Listener> getListeners() {
		return listeners;
	}
}
