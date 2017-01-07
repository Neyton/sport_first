CREATE TABLE client
(
    id INT(11) PRIMARY KEY NOT NULL,
    email VARCHAR(45),
    login VARCHAR(45),
    money INT(11),
    password VARCHAR(16)
);
CREATE TABLE club
(
    id_club INT(11) PRIMARY KEY NOT NULL,
    name VARCHAR(255)
);
CREATE TABLE event
(
    id_event INT(11) PRIMARY KEY NOT NULL,
    date DATETIME,
    name VARCHAR(45),
    result VARCHAR(45),
    id_tournament INT(11),
    CONSTRAINT FK6qvggh8rc8sr0sun4gpb1qls2 FOREIGN KEY (id_tournament) REFERENCES tournament (id_tournament)
);
CREATE INDEX FK6qvggh8rc8sr0sun4gpb1qls2 ON event (id_tournament);
CREATE TABLE rate_event
(
    id INT(11) PRIMARY KEY NOT NULL,
    kf DOUBLE,
    event_id INT(11),
    type_id INT(11),
    CONSTRAINT FKqpdsrgoh4j6t1sov5pmaxyl9i FOREIGN KEY (event_id) REFERENCES event (id_event),
    CONSTRAINT FKefs1tik3va3lpdt53e21krofl FOREIGN KEY (type_id) REFERENCES type_rate (id)
);
CREATE INDEX FKefs1tik3va3lpdt53e21krofl ON rate_event (type_id);
CREATE INDEX FKqpdsrgoh4j6t1sov5pmaxyl9i ON rate_event (event_id);
CREATE TABLE role
(
    id INT(11) PRIMARY KEY NOT NULL,
    name VARCHAR(45) NOT NULL
);
CREATE TABLE tournament
(
    id_tournament INT(11) PRIMARY KEY NOT NULL,
    name VARCHAR(255)
);
CREATE TABLE type_rate
(
    id INT(11) PRIMARY KEY NOT NULL,
    name VARCHAR(45)
);
CREATE TABLE user_roles
(
    user_id INT(11) NOT NULL,
    role_id INT(11) NOT NULL,
    CONSTRAINT `PRIMARY` PRIMARY KEY (user_id, role_id),
    CONSTRAINT FKs2g5i4d6eotfcwvibs3gaji7p FOREIGN KEY (user_id) REFERENCES client (id),
    CONSTRAINT FKrhfovtciq1l558cw6udg0h0d3 FOREIGN KEY (role_id) REFERENCES role (id)
);
CREATE INDEX FKrhfovtciq1l558cw6udg0h0d3 ON user_roles (role_id);
CREATE TABLE club_tournament
(
    id_club INT(11),
    id_tournament INT(11),
    CONSTRAINT keyClub FOREIGN KEY (id_club) REFERENCES club (id_club),
    CONSTRAINT keyTourn FOREIGN KEY (id_tournament) REFERENCES tournament (id_tournament)
);
CREATE INDEX keyClub_idx ON club_tournament (id_club);
CREATE INDEX keyTourn_idx ON club_tournament (id_tournament);
CREATE TABLE event_club
(
    id_event INT(11),
    id_club INT(11),
    status VARCHAR(45),
    CONSTRAINT keyEvent FOREIGN KEY (id_event) REFERENCES event (id_event),
    CONSTRAINT keyClubEvent FOREIGN KEY (id_club) REFERENCES club (id_club)
);
CREATE INDEX keyClubEvent_idx ON event_club (id_club);
CREATE INDEX keyEvent_idx ON event_club (id_event);
CREATE TABLE bet
(
    id INT(11) PRIMARY KEY NOT NULL,
    win_loss VARCHAR(45),
    id_client INT(11),
    id_event INT(11),
    CONSTRAINT keyBetClient FOREIGN KEY (id_client) REFERENCES client (id),
    CONSTRAINT keyBetEvent FOREIGN KEY (id_event) REFERENCES event (id_event)
);
CREATE INDEX keyBetClient_idx ON bet (id_client);
CREATE INDEX keyBetEvent_idx ON bet (id_event);