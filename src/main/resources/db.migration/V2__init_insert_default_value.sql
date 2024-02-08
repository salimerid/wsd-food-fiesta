-- Inserting data into the customer table
INSERT INTO customer (id, name, email, mobile, address) VALUES (1,'Salim Ahmed','salim@gmail.com', '01613305085', 'Uttara, Dhaka');
INSERT INTO customer (id, name, email, mobile, address) VALUES (2,'Tusher Ahmed','tusher@gmail.com','01613305086', 'Uttara, Dhaka');
INSERT INTO customer (id, name, email, mobile, address) VALUES (3,'Abdus Salam','salam@gmail.com', '01613305089', 'Belabo, Narsingdi');


-- Inserting data into the orders table
INSERT INTO orders (order_date, sale_amount, sale_date, customer_id) VALUES ('2024-01-10', 5000.00, '2024-01-10', 3);
INSERT INTO orders (order_date, sale_amount, sale_date, customer_id) VALUES ('2024-01-30', 500.00, '2024-01-30', 1);
INSERT INTO orders (order_date, sale_amount, sale_date, customer_id) VALUES ('2024-02-01', 600.00, '2024-02-02', 1);
INSERT INTO orders (order_date, sale_amount, sale_date, customer_id) VALUES ('2024-02-08', 1000.00, '2024-02-08', 2);

-- Inserting data into the orders table with current date for order_date and sale_date
INSERT INTO orders (order_date, sale_amount, sale_date, customer_id) VALUES (CURRENT_DATE, 2000.50, CURRENT_DATE, 3);
INSERT INTO orders (order_date, sale_amount, sale_date, customer_id) VALUES (CURRENT_DATE, 400.10, CURRENT_DATE, 1);