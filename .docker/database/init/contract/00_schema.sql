create table contracts
(
    id            serial primary key,
    contract_date timestamp   not null,
    contract_id   varchar(64) not null,
    updated_at    timestamp not null
);