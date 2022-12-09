CREATE TABLE products (
    id SERIAL PRIMARY KEY,
    name VARCHAR(250) NOT NULL,
    price NUMERIC(7,2)
);