create table CUSTOMERS (
    id int not null auto_increment primary key,
    name varchar(15),
    surname varchar(15),
    age int,
    phone_number int
);

create table ORDERS (
  id int not null auto_increment primary key,
  date DATE,
  customer_id int,
  product_name varchar(30),
  amount int,
  foreign key (customer_id) references CUSTOMERS(id)
);
