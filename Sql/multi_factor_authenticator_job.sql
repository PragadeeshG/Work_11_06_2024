create table if not exists multi_factor_authenticator_job(
mfa_device_id Integer not null,
mfa_device_name varchar(255) null,
mfa_device_registry varchar(255) null,
mfa_device_start_time varchar(255) null,
mfa_device_approved_time varchar(255) null,
mfa_device_owner varchar(255) null,
authorized_device char null,
time_out_in_seconds varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_State varchar(255) null,
constraint multi_factor_authenticator_job_pk primary key(mfa_device_id));