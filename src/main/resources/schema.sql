-----------------------------------------------------
-- Script to create State Info Table
-----------------------------------------------------

-- Create Table
CREATE TABLE STATE_INFO (
State_name VARCHAR(250) NOT NULL,
State_Abrv VARCHAR(250) NOT NULL PRIMARY KEY,
State_Capital VARCHAR(250) NOT NULL,
Capital_Since INT NOT NULL,
Capital_Population INT NOT NULL,
Fun_Fact VARCHAR(250) NOT NULL);