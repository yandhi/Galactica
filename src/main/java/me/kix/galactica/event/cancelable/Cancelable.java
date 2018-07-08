package me.kix.galactica.event.cancelable;

/**
 * @author Kix
 * @since 7/8/2018
 */
public interface Cancelable {

	boolean isCanceled();
	void setCanceled(boolean canceled);

}
