package com.test1;

public class MultiFactorAuthenticationMethod {
	private Integer mfaAuthId;
	private String authMethod;
	private boolean oauth2Support;
	private String jwSubject;
	private String issuer;
	private String audience;
	private long issuedAt;
	private String federalIdentitySupport;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public MultiFactorAuthenticationMethod() {

	}

	public MultiFactorAuthenticationMethod(Integer mfaAuthId, String authMethod, boolean oauth2Support,
			String jwSubject, String issuer, String audience, long issuedAt, String federalIdentitySupport,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.mfaAuthId = mfaAuthId;
		this.authMethod = authMethod;
		this.oauth2Support = oauth2Support;
		this.jwSubject = jwSubject;
		this.issuer = issuer;
		this.audience = audience;
		this.issuedAt = issuedAt;
		this.federalIdentitySupport = federalIdentitySupport;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getMfaAuthId() {
		return mfaAuthId;
	}

	public void setMfaAuthId(Integer mfaAuthId) {
		this.mfaAuthId = mfaAuthId;
	}

	public String getAuthMethod() {
		return authMethod;
	}

	public void setAuthMethod(String authMethod) {
		this.authMethod = authMethod;
	}

	public boolean isOauth2Support() {
		return oauth2Support;
	}

	public void setOauth2Support(boolean oauth2Support) {
		this.oauth2Support = oauth2Support;
	}

	public String getJwSubject() {
		return jwSubject;
	}

	public void setJwSubject(String jwSubject) {
		this.jwSubject = jwSubject;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public String getAudience() {
		return audience;
	}

	public void setAudience(String audience) {
		this.audience = audience;
	}

	public long getIssuedAt() {
		return issuedAt;
	}

	public void setIssuedAt(long issuedAt) {
		this.issuedAt = issuedAt;
	}

	public String getFederalIdentitySupport() {
		return federalIdentitySupport;
	}

	public void setFederalIdentitySupport(String federalIdentitySupport) {
		this.federalIdentitySupport = federalIdentitySupport;
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
