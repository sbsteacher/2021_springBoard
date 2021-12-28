CREATE TABLE t_board(
    iboard INT UNSIGNED AUTO_INCREMENT,
    title VARCHAR(100) NOT NULL,
    ctnt VARCHAR(1000) NOT NULL,
    hits INT UNSIGNED not null DEFAULT 0,
    rdt TIMESTAMP NOT NULL DEFAULT current_timestamp(),
    mdt TIMESTAMP NOT NULL DEFAULT current_timestamp(),
    PRIMARY KEY(iboard)
);