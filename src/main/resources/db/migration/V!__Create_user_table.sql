create table USER
(
    ID          INT auto_increment,
    ACCOUNT_ID  CHAR(100),
    NAME        CHAR(50),
    TOKEN       CHAR(36),
    GMT_CREATE  BIGINT,
    GMT_MODIFED BIGINT,
    constraint TABLE_NAME_PK
        primary key (ID)
);