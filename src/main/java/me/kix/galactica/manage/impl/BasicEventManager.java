package me.kix.galactica.manage.impl;

import me.kix.galactica.event.Event;
import me.kix.galactica.listener.Listener;
import me.kix.galactica.manage.EventManager;
import me.kix.galactica.manage.registry.ListenerRegistry;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Kix
 * @since 7/8/2018
 */
public final class BasicEventManager implements EventManager {

	private final ListenerRegistry registry = new ListenerRegistry();

	@Override
	public void register(Listener listener) {
		registry.register(listener);
	}

	@Override
	public void unregister(Listener listener) {
		registry.unregister(listener);
	}

	@Override
	public void clear() {
		registry.getListeners().clear();
	}

	@Override
	@SuppressWarnings("unchecked")
	public void dispatch(Event event) {
		if (registry.getListeners().get(event.getClass()) != null) {
			Set<Listener> listenersFromEvent = registry.getListeners().get(event.getClass());
			if (listenersFromEvent != null) {
				listenersFromEvent.forEach(listener -> listener.execute(event));
			}
		}
	}

	@Override
	public ListenerRegistry getRegistry() {
		return registry;
	}
}
