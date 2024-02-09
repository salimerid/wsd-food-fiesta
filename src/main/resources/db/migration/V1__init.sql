create table customer (
    id bigint not null auto_increment,
    address varchar(255),
    email varchar(255),
    mobile varchar(255),
    name varchar(255),
    primary key (id)) engine=InnoDB;

create table orders (
    order_no bigint not null auto_increment,
    order_date date,
    sale_amount decimal(38,2),
    sale_date date,
    customer_id bigint,
    primary key (order_no)) engine=InnoDB;

alter table orders add constraint FK624gtjin3po807j3vix093tlf foreign key (customer_id) references customer (id);
