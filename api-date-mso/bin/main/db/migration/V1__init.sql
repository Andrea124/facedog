CREATE TABLE user_dog (
  id      VARCHAR(255) PRIMARY KEY,
  username VARCHAR(255) UNIQUE NOT NULL,
  email VARCHAR(255) NOT NULL,
  address VARCHAR(255) NOT NULL,
  genero VARCHAR(255) NOT NULL,
  edad Integer NOT NULL,
  phone VARCHAR(255) NOT NULL,
  UNIQUE(username)
);
CREATE TABLE login (
  id VARCHAR(255) PRIMARY KEY,
  username VARCHAR(255) NOT NULL,
  password VARCHAR(255) NOT NULL,
  last_date VARCHAR(255) NOT NULL,
  status VARCHAR(255) NOT NULL,
  CONSTRAINT FK_user_name FOREIGN KEY(username)
  REFERENCES user_dog(username)
);
CREATE TABLE post (
  id VARCHAR(255) PRIMARY KEY,
  username VARCHAR(255) NOT NULL,
  text VARCHAR(255) NOT NULL,
  image VARCHAR(255) NOT NULL,
  date_publish VARCHAR(255) NOT NULL,
  status VARCHAR(255) NOT NULL,
  CONSTRAINT FK_user_name FOREIGN KEY(username)
  REFERENCES user_dog(username)
);
CREATE TABLE date (
  id VARCHAR(255) PRIMARY KEY,
  username VARCHAR(255) NOT NULL,
  friend_username VARCHAR(255) NOT NULL,
  date VARCHAR(255) NOT NULL,
  please VARCHAR(255) NOT NULL,
  status VARCHAR(255) NOT NULL,
  CONSTRAINT FK_user_name FOREIGN KEY(username)
  REFERENCES user_dog(username)
);
CREATE TABLE friends (
  id VARCHAR(255) PRIMARY KEY,
  username VARCHAR(255) NOT NULL,
  friend_username VARCHAR(255) NOT NULL,
  CONSTRAINT FK_user_name FOREIGN KEY(username)
  REFERENCES user_dog(username)
);
insert into user_dog (id, username , email , address, genero, edad, phone) VALUES('1','Yoko','yoko@gmail.com','CDMX Tlalpan', 'Hembra', 3, '5543456754');
insert into login (id, username, password, last_date, status) VALUES('1','Yoko','123yoko','18/12/2022', 'online');
insert into post (id, username, text, image, date_publish, status) VALUES('1','Yoko','Mi primer helado de fresa','/img/yoko/heladofresa.png','18/12/2022', 'available');
insert into date (id, username, friend_username, date, please, status) VALUES('1','Yoko','Ringo','19/12/2022','Jardin de las rosas', 'schedule');
