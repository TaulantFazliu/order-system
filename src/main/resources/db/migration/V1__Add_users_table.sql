CREATE TYPE ROLI AS ENUM ('WAITER','ADMIN');

CREATE TABLE users
(
    user_id       SERIAL PRIMARY KEY NOT NULL,
    user_name     VARCHAR(50)        NOT NULL,
    user_password VARCHAR(50)        NOT NULL,
    role          ROLI               NOT NULL
);