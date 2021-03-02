DROP DATABASE IF EXISTS fresher;
CREATE DATABASE IF NOT EXISTS fresher;
USE fresher;
-- create table Trainee
CREATE TABLE Trainee (
    TraineeID 			TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    Full_Name			VARCHAR(50) NOT NULL,
    Birth_Date		 	DATETIME DEFAULT NOW(),
    Gender 				ENUM('male','female','unknown') NOT NULL,
    ET_IQ				TINYINT UNSIGNED CHECK(ET_IQ <=20),
    ET_Gmath 			TINYINT UNSIGNED CHECK(ET_Gmath <=20),
    ET_English 			TINYINT UNSIGNED CHECK(ET_English <=50),
    Training_Class 		VARCHAR(10)  NOT NULL,
    Evaluation_Notes	VARCHAR(300)
);

ALTER TABLE Trainee
  ADD VTI_Account VARCHAR(10) NOT NULL UNIQUE KEY;

-- create table Data_1  
CREATE TABLE Data_1 (
ID					MEDIUMINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
`Name`				VARCHAR(50) NOT NULL,
`Code`				CHAR(5) NOT NULL UNIQUE KEY,
ModifiedDate		TIMESTAMP
);

-- create table Data_2
CREATE TABLE Data_2 (
ID					MEDIUMINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
`Name`				VARCHAR(40) NOT NULL,
BirthDate			DATETIME NOT NULL,
`Gender`			BIT,
IsDeletedFlag		BIT NOT NULL
);
  
  