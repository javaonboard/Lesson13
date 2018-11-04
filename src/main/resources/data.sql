INSERT INTO users(id,username,Encrypted_Password)
VALUES (999,'steve','$2a$10$pC0F6knNw6NhpuWujg9XyeW0aZBcm.0co9Tcbhkv0SzjqtQur.a1G');
INSERT INTO users(id,username,Encrypted_Password)
VALUES (1000,'bill','$2a$10$bRyIb0GbafP2rviKvkTDXukswVczuw.qG6bq8vEFCRFBbK6tkQVnq');

INSERT INTO roles (id, user_id, role) VALUES (999, 999, 'ROLE_USER');
INSERT INTO roles (id, user_id, role) VALUES (1000, 1000, 'ROLE_ADMIN');
INSERT INTO roles (id, user_id, role) VALUES (1001, 1000, 'ROLE_USER');