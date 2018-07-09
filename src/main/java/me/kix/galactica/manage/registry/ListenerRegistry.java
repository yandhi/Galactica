package me.kix.galactica.manage.registry;

import me.kix.galactica.listener.Listener;

import java.util.*;

/**
 * @author Kix
 * @since 7/8/2018
 */
public class ListenerRegistry {

	private final Map<Class, Set<Listener>> listeners = new HashMap<>();

	public void register(Listener listener) {
		if (!listeners.containsKey(listener.getEvent())) {
			listeners.put(listener.getEvent(), new HashSet<>());
		} else {
			listeners.get(listener.getEvent()).add(listener);
		}
	}

	public void unregister(Listener listener) {
		listeners.get(listener.getEvent()).remove(listener);
	}

	public Map<Class, Set<Listener>> getListeners() {
		return listeners;
	}
}
