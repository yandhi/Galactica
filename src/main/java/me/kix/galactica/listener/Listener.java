package me.kix.galactica.listener;

import me.kix.galactica.event.Event;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @author Kix
 * @since 7/8/2018
 */
public abstract class Listener<E extends Event> implements Executed<E> {

	private Class<E> event;

	@SuppressWarnings("unchecked")
	public Listener() {
		Type generic = this.getClass().getGenericSuperclass();
		if (generic instanceof ParameterizedType) {
			for (Type type : ((ParameterizedType) generic).getActualTypeArguments()) {
				if (type instanceof Class && Event.class.isAssignableFrom((Class<?>) type)) {
					this.event = (Class<E>) type;
					break;
				}
			}
		}
	}

	public Class<E> getEvent() {
		return event;
	}
}
