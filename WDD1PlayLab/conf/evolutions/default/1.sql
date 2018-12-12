# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table item_on_sale (
  id                            bigint,
  name                          varchar(255),
  description                   varchar(255),
  stock                         integer not null,
  price                         double not null
);


# --- !Downs

drop table if exists item_on_sale;

