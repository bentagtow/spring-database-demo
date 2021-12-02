create table person
(
    id integer not null,
    name varchar(255) not null,
    location varchar(255),
    birth_date timestamp,
    primary key(id)
);

INSERT INTO PERSON
(ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10011, 'Kayperson', 'CA', sysdate());
INSERT INTO PERSON
(ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10012, 'Mitch', 'OR', sysdate());
INSERT INTO PERSON
(ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10013, 'Ben', 'CO', sysdate());