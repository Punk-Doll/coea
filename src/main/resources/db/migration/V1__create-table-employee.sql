create table employee(

     id bigint not null auto_increment,
     start_date varchar(100) not null,
     end_date varchar(100) not null,
     register varchar(100) not null unique,
     employee_name varchar(100) not null,
     phone varchar(20) not null,
     email varchar(100) not null unique,
     gender varchar(1) not null,
     skill varchar(100) not null,
     employee_position varchar(100) not null,
     location varchar(100) not null,
     unit varchar(100) not null,
     cost_center varchar(100) not null,
     contract_manager varchar(100) not null,
     pep varchar(50) not null,
     project_manager varchar(100) not null,
     squad varchar(100) not null,
     last_review_score varchar(100) not null,

     date_last_feedback varchar(100) not null,
     feedback varchar(100) not null,
     start_date_vacation varchar(10) not null,
     end_date_vacation varchar(10) not null,
     date_order_promotion varchar(10) not null,
     reason_promotion varchar(100) not null,
     refuse_promotion varchar(100) not null,

     primary key(id)

);