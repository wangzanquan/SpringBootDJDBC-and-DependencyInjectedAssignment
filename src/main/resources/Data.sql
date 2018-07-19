create table employee(
	id integer not null,
	fName varchar(20) not null,
	lName varchar(20) not null,
	address varchar(255),
	primary key (id)
);
insert into employee(id, fName, lName, address)
values
(1, 'Lily', 'Li', 'VA'),
(2, 'Tony', 'Wang', 'DC'),
(3, 'Jiaxuan', 'Li', 'CA'),
(4, 'Yang', 'Wang', 'NY'),
(5, 'Piaoyi', 'Li', 'NA');