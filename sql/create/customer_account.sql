CREATE TABLE
    `CUSTOMER_ACCOUNT` (
        `ACCOUNT_ID` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
        `ACCOUNT_NAME` int(11) DEFAULT 0,
        `ACCOUNT_VALUE` int(11) DEFAULT 0,
        `ACCOUNT_CURRENCY` varchar(5) DEFAULT NULL,
        `CUSTOMER_ID` INT,
        CONSTRAINT FK_CUSTOMER_ID
            FOREIGN KEY (CUSTOMER_ID)
                REFERENCES CUSTOMER(CUSTOMER_ID)
) ENGINE = InnoDB DEFAULT CHARSET = latin1 COLLATE = latin1_swedish_ci
;

insert into CUSTOMER_ACCOUNT(account_name, ACCOUNT_VALUE,ACCOUNT_CURRENCY, CUSTOMER_ID) VALUES (123124,300,"RON",1);V
