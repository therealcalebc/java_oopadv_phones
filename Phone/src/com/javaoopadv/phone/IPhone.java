/**
 * 
 */
package com.javaoopadv.phone;

/**
 * @author ccomstock
 *
 */
public class IPhone extends Phone implements Ringable {

	/**
	 * @param versionNumber
	 * @param batteryPercentage
	 * @param carrier
	 * @param ringTone
	 */
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}

	@Override
	public String ring() {
		return String.format("iPhone %s says %s", getVersionNumber(), getRingTone());
	}

	@Override
	public String unlock() {
		return "Unlocking via facial recognition";
	}

	@Override
	public void displayInfo() {
		System.out.printf("iPhone %s from %s has %d%% battery left\n", 
				getVersionNumber(), getCarrier(), getBatteryPercentage());
	}

}
