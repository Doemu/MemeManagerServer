CREATE TABLE IF NOT EXISTS account (
    id BIGSERIAL PRIMARY KEY,
    login TEXT NOT NULL UNIQUE,
    password TEXT NOT NULL,
    username TEXT
);