package me.kix.galactica.event.cancelable;

/**
 * @author Kix
 * @since 7/8/2018
 */
public class CancelableEvent implements Cancelable {

	private boolean canceled;

	@Override
	public boolean isCanceled() {
		return canceled;
	}

	@Override
	public void setCanceled(boolean canceled) {
		this.canceled = canceled;
	}
}
