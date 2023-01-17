BEGIN TRANSACTION;

DROP TABLE IF EXISTS user_scales;
DROP TABLE IF EXISTS scales;
DROP TABLE IF EXISTS users;


CREATE TABLE users (
	user_id SERIAL PRIMARY KEY UNIQUE,
	username varchar(50) NOT NULL UNIQUE,
	password_hash varchar(200) NOT NULL
);

CREATE TABLE scales (
    scale_id Serial PRIMARY KEY UNIQUE,
    root varchar (10) NOT NULL,
    type varchar (50) NOT NULL,
--    notes text[] NOT NULL,
    notes varchar(70) NOT NULL,
    diagram varchar (500) NULL,
    description varchar (500) NULL
);

CREATE TABLE user_scales (
    user_id int NOT NULL,
    scale_id int NOT NULL,

    FOREIGN KEY (user_id) REFERENCES users(user_id),
    FOREIGN KEY (scale_id) REFERENCES scales(scale_id)
);

COMMIT TRANSACTION;
