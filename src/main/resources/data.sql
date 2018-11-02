INSERT INTO users(username,Encrypted_Password,enabled)
VALUES ('steve','$2a$10$pC0F6knNw6NhpuWujg9XyeW0aZBcm.0co9Tcbhkv0SzjqtQur.a1G',1);
INSERT INTO users(username,Encrypted_Password,enabled)
VALUES ('bill','$2a$10$bRyIb0GbafP2rviKvkTDXukswVczuw.qG6bq8vEFCRFBbK6tkQVnq',1);

INSERT INTO roles (user_id, role) VALUES (1, 'ROLE_USER');
INSERT INTO roles (user_id, role) VALUES (2, 'ROLE_ADMIN');
INSERT INTO roles (user_id, role) VALUES (2, 'ROLE_USER');