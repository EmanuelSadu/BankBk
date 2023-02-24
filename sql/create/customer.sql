CREATE TABLE
    `CUSTOMER` (

                           `CUSTOMER_ID` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
                           `CUSTOMER_NAME` varchar(200) NOT NULL,
                           `CUSTOMER_COUNTRY` varchar(200) NOT NULL,
                           `CUSTOMER_CNP` varchar(20)  NOT NULL
) ENGINE = InnoDB DEFAULT CHARSET = latin1 COLLATE = latin1_swedish_ci
;
insert into CUSTOMER( CUSTOMER_NAME,CUSTOMER_COUNTRY, CUSTOMER_CNP) VALUES ("GIGEL","ROMANIA","19412123");