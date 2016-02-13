INSERT INTO users (name, surname, email, password, locked, tries) VALUES ('Airouche', 'Meidi', 'meidi.airouche@gmail.com', 'vjZn7mxIbux578oxUfoU1A==', false, 0);
INSERT INTO users (name, surname, email, password, locked, tries) VALUES ('User', 'Test', 'test@gmail.com', 'vjZn7mxIbux578oxUfoU1A==', true, 3);
INSERT INTO users (name, surname, email, password, locked, tries) VALUES ('UserToLock', 'WillBeLocked', 'willbelocked@gmail.com', 'vjZn7mxIbux578oxUfoU1A==', false, 0);
INSERT INTO users (name, surname, email, password, locked, tries) VALUES ('UserUnauthorized', 'UserUnauthorized', 'userunauthorized@gmail.com', 'vjZn7mxIbux578oxUfoU1A==', false, 0);
INSERT INTO users (name, surname, email, password, locked, tries) VALUES ('UserToRemoveName', 'UserToRemoveSurname', 'usertoremove@gmail.com', 'vjZn7mxIbux578oxUfoU1A==', false, 0);
INSERT INTO users (name, surname, email, password, locked, tries) VALUES ('UpdateUserName', 'UpdateUserSurname', 'updateuser@gmail.com', 'vjZn7mxIbux578oxUfoU1A==', false, 0);
INSERT INTO users (name, surname, email, password, locked, tries) VALUES ('lockedUser', 'lockedUser', 'lockedUser@gmail.com', 'vjZn7mxIbux578oxUfoU1A==', true, 3);
INSERT INTO users (name, surname, email, password, locked, tries) VALUES ('accountUpdateName', 'accountUpdateSurname', 'accountUpdate@gmail.com', 'vjZn7mxIbux578oxUfoU1A==', true, 3);
INSERT INTO applications(AUID, name) VALUES('TKP', 'Trello KPI');
INSERT INTO applications(AUID, name) VALUES('FRG', 'Forge Argonot');
INSERT INTO applications(AUID, name) VALUES('UPD', 'Update');
INSERT INTO applications(AUID, name) VALUES('RMV', 'Remove');
INSERT INTO roles(RUID, name) VALUES ('ADM', 'ADMIN');
INSERT INTO roles(RUID, name) VALUES ('USR', 'USER');
INSERT INTO roles(RUID, name) VALUES ('RMV', 'REMOVE');
INSERT INTO authorizations(id_user, AUID, RUID) VALUES(1, 'FRG', 'ADM');
INSERT INTO authorizations(id_user, AUID, RUID) VALUES(2, 'FRG', 'USR');
INSERT INTO authorizations(id_user, AUID, RUID) VALUES(2, 'TKP', 'USR');
INSERT INTO authorizations(id_user, AUID, RUID) VALUES(3, 'FRG', 'USR');
INSERT INTO authorizations(id_user, AUID, RUID) VALUES(5, 'FRG', 'USR');
INSERT INTO authorizations(id_user, AUID, RUID) VALUES(5, 'TKP', 'USR');
INSERT INTO authorizations(id_user, AUID, RUID) VALUES(5, 'FRG', 'ADM');
INSERT INTO authorizations(id_user, AUID, RUID) VALUES(8, 'FRG', 'USR');