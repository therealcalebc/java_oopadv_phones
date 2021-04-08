/**
 * 
 */
package com.javaoopadv.phone;

/**
 * @author ccomstock
 *
 */
public class Galaxy extends Phone implements Ringable {

	/**
	 * @param versionNumber
	 * @param batteryPercentage
	 * @param carrier
	 * @param ringTone
	 */
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}

	@Override
	public String ring() {
		return String.format("Galaxy %s says %s", getVersionNumber(), getRingTone());
	}

	@Override
	public String unlock() {
		return "Unlocking via finger print";
	}

	@Override
	public void displayInfo() {
		System.out.printf("Galaxy %s from %s has %d%% battery left\n", 
				getVersionNumber(), getCarrier(), getBatteryPercentage());
	}

}
