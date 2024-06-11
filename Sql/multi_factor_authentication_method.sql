create table if not exists multi_factor_authentication_method(
mfa_auth_id Integer not null,
auth_method varchar(255) null,
oauth2_support char null,
jwt_subject varchar(255) null,
issuer varchar(255) null,
audience varchar(255) null,
issued_at bigint null,
federal_identity_support varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint multi_factor_authentication_method_pk primary key(mfa_auth_id));