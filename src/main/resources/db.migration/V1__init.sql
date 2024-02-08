CREATE TABLE customer
(
    id      bigserial NOT NULL,
    name    varchar(255) NULL,
    email   varchar(255) NULL,
    mobile   varchar(50) NULL,
    address varchar(255) NULL,
    CONSTRAINT customer_pkey PRIMARY KEY (id)
);

CREATE TABLE orders
(
    order_no    bigserial NOT NULL,
    order_date  date NULL,
    sale_amount numeric(38, 2) NULL,
    sale_date   date NULL,
    customer_id int8 NULL,
    CONSTRAINT orders_pkey PRIMARY KEY (id)
);


-- public.orders foreign keys

ALTER TABLE public.orders
    ADD CONSTRAINT fk_orders FOREIGN KEY (customer_id) REFERENCES public.customer (id);
