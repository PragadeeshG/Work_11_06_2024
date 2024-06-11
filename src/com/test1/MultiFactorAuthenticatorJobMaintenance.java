package com.test1;

public class MultiFactorAuthenticatorJobMaintenance {
	private Integer mfaDeviceId;
	private String downTimeApplicable;
	private String downTimeNotificationMode;
	private String fromSystem;
	private String toSystem;
	private String activeDirectory;
	private String openId;
	private boolean serverless;
	private String serveerlessModelName;
	private String lambdas;
	private String queueName;
	private String queueType;
	private String status;

	public MultiFactorAuthenticatorJobMaintenance() {

	}

	public MultiFactorAuthenticatorJobMaintenance(Integer mfaDeviceId, String downTimeApplicable,
			String downTimeNotificationMode, String fromSystem, String toSystem, String activeDirectory, String openId,
			boolean serverless, String serveerlessModelName, String lambdas, String queueName, String queueType,
			String status) {
		super();
		this.mfaDeviceId = mfaDeviceId;
		this.downTimeApplicable = downTimeApplicable;
		this.downTimeNotificationMode = downTimeNotificationMode;
		this.fromSystem = fromSystem;
		this.toSystem = toSystem;
		this.activeDirectory = activeDirectory;
		this.openId = openId;
		this.serverless = serverless;
		this.serveerlessModelName = serveerlessModelName;
		this.lambdas = lambdas;
		this.queueName = queueName;
		this.queueType = queueType;
		this.status = status;
	}

	public Integer getMfaDeviceId() {
		return mfaDeviceId;
	}

	public void setMfaDeviceId(Integer mfaDeviceId) {
		this.mfaDeviceId = mfaDeviceId;
	}

	public String getDownTimeApplicable() {
		return downTimeApplicable;
	}

	public void setDownTimeApplicable(String downTimeApplicable) {
		this.downTimeApplicable = downTimeApplicable;
	}

	public String getDownTimeNotificationMode() {
		return downTimeNotificationMode;
	}

	public void setDownTimeNotificationMode(String downTimeNotificationMode) {
		this.downTimeNotificationMode = downTimeNotificationMode;
	}

	public String getFromSystem() {
		return fromSystem;
	}

	public void setFromSystem(String fromSystem) {
		this.fromSystem = fromSystem;
	}

	public String getToSystem() {
		return toSystem;
	}

	public void setToSystem(String toSystem) {
		this.toSystem = toSystem;
	}

	public String getActiveDirectory() {
		return activeDirectory;
	}

	public void setActiveDirectory(String activeDirectory) {
		this.activeDirectory = activeDirectory;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public boolean isServerless() {
		return serverless;
	}

	public void setServerless(boolean serverless) {
		this.serverless = serverless;
	}

	public String getServeerlessModelName() {
		return serveerlessModelName;
	}

	public void setServeerlessModelName(String serveerlessModelName) {
		this.serveerlessModelName = serveerlessModelName;
	}

	public String getLambdas() {
		return lambdas;
	}

	public void setLambdas(String lambdas) {
		this.lambdas = lambdas;
	}

	public String getQueueName() {
		return queueName;
	}

	public void setQueueName(String queueName) {
		this.queueName = queueName;
	}

	public String getQueueType() {
		return queueType;
	}

	public void setQueueType(String queueType) {
		this.queueType = queueType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
