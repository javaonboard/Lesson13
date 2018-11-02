DROP TABLE IF EXISTS roles;
DROP TABLE IF EXISTS users;
CREATE  TABLE users (
  id int(11) NOT NULL AUTO_INCREMENT,
  username VARCHAR(45) NOT NULL,
  Encrypted_Password VARCHAR(60) NOT NULL ,
  PRIMARY KEY (id));

CREATE TABLE roles (
  id int(11) NOT NULL AUTO_INCREMENT,
  role varchar(45) NOT NULL,
  user_id int(11) NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (user_id) REFERENCES users (id));