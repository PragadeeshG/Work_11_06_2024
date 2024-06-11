package com.test1;

public class MultiFactorAuthenticatorJob {
	private Integer mfaDeviceId;
	private String mfaDeviceName;
	private String mfaDeviceRegistry;
	private String mfaDeviceStartTime;
	private String mfaDeviceApprovedTime;
	private String mfaDeviceOwner;
	private boolean authorizedDevice;
	private String timeOutInSeconds;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public MultiFactorAuthenticatorJob() {

	}

	public MultiFactorAuthenticatorJob(Integer mfaDeviceId, String mfaDeviceName, String mfaDeviceRegistry,
			String mfaDeviceStartTime, String mfaDeviceApprovedTime, String mfaDeviceOwner, boolean authorizedDevice,
			String timeOutInSeconds, String creationDate, String modifiedDate, String entityState) {
		super();
		this.mfaDeviceId = mfaDeviceId;
		this.mfaDeviceName = mfaDeviceName;
		this.mfaDeviceRegistry = mfaDeviceRegistry;
		this.mfaDeviceStartTime = mfaDeviceStartTime;
		this.mfaDeviceApprovedTime = mfaDeviceApprovedTime;
		this.mfaDeviceOwner = mfaDeviceOwner;
		this.authorizedDevice = authorizedDevice;
		this.timeOutInSeconds = timeOutInSeconds;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getMfaDeviceId() {
		return mfaDeviceId;
	}

	public void setMfaDeviceId(Integer mfaDeviceId) {
		this.mfaDeviceId = mfaDeviceId;
	}

	public String getMfaDeviceName() {
		return mfaDeviceName;
	}

	public void setMfaDeviceName(String mfaDeviceName) {
		this.mfaDeviceName = mfaDeviceName;
	}

	public String getMfaDeviceRegistry() {
		return mfaDeviceRegistry;
	}

	public void setMfaDeviceRegistry(String mfaDeviceRegistry) {
		this.mfaDeviceRegistry = mfaDeviceRegistry;
	}

	public String getMfaDeviceStartTime() {
		return mfaDeviceStartTime;
	}

	public void setMfaDeviceStartTime(String mfaDeviceStartTime) {
		this.mfaDeviceStartTime = mfaDeviceStartTime;
	}

	public String getMfaDeviceApprovedTime() {
		return mfaDeviceApprovedTime;
	}

	public void setMfaDeviceApprovedTime(String mfaDeviceApprovedTime) {
		this.mfaDeviceApprovedTime = mfaDeviceApprovedTime;
	}

	public String getMfaDeviceOwner() {
		return mfaDeviceOwner;
	}

	public void setMfaDeviceOwner(String mfaDeviceOwner) {
		this.mfaDeviceOwner = mfaDeviceOwner;
	}

	public boolean isAuthorizedDevice() {
		return authorizedDevice;
	}

	public void setAuthorizedDevice(boolean authorizedDevice) {
		this.authorizedDevice = authorizedDevice;
	}

	public String getTimeOutInSeconds() {
		return timeOutInSeconds;
	}

	public void setTimeOutInSeconds(String timeOutInSeconds) {
		this.timeOutInSeconds = timeOutInSeconds;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
