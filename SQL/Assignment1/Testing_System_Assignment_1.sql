DROP DATABASE IF EXISTS test;
CREATE DATABASE IF NOT EXISTS test;
USE test;

-- create table Department
CREATE TABLE Department (
    DepartmentID 		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    DepartmentName		VARCHAR(50) UNIQUE KEY NOT NULL
);

-- create table Position
CREATE TABLE `Position` (
    PositionID 			TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    PositionName 		ENUM('Dev','Test','Scrum Master','PM') UNIQUE KEY NOT NULL
);

-- create table Account
CREATE TABLE `Account` (
    AccountID 			TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    Username 			VARCHAR(50) UNIQUE KEY NOT NULL,
    Email 				VARCHAR(50) UNIQUE KEY NOT NULL,
    FullName 			VARCHAR(50) NOT NULL,
    DepartmentID 		TINYINT UNSIGNED NOT NULL,
    PositionID 			TINYINT UNSIGNED NOT NULL,
    CreateDate			 DATETIME DEFAULT NOW(),
    FOREIGN KEY(DepartmentID) REFERENCES Department (DepartmentID),
    FOREIGN KEY(PositionID) REFERENCES `Position`(PositionID)
);

-- create table Group
CREATE TABLE `Group` (
    GroupID 		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    GroupName		 VARCHAR(50) NOT NULL UNIQUE KEY,
    CreatorID		 TINYINT UNSIGNED NOT NULL,
    CreateDate		 DATETIME DEFAULT NOW(),
    FOREIGN KEY(CreatorID) REFERENCES `Account`(AccountID)
);

-- create table GroupAccount
CREATE TABLE GroupAccount (
    GroupID 			TINYINT UNSIGNED,
    AccountID 			TINYINT UNSIGNED,
    JoinDate 			DATETIME DEFAULT NOW(),
	PRIMARY KEY (GroupID,AccountID),
    FOREIGN KEY(GroupID) REFERENCES `Group`(GroupID),
    FOREIGN KEY(AccountID) REFERENCES `Account`(AccountID)
);

-- create table TypeQuestion
CREATE TABLE TypeQuestion (
    TypeID 			TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    TypeName 	 	ENUM('Essay','Multiple-Choice') NOT NULL
);

-- create table CategoryQuestion
CREATE TABLE CategoryQuestion (
    CategoryID 				TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    CategoryName 			 VARCHAR(30) NOT NULL UNIQUE KEY
);

-- create table Question
CREATE TABLE Question (
    QuestionID 		TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Content 	 	VARCHAR(100) NOT NULL,
    CategoryID 		TINYINT UNSIGNED NOT NULL,
    TypeID 	 		TINYINT UNSIGNED NOT NULL,
    CreatorID 	 	TINYINT UNSIGNED NOT NULL,
    CreateDate 	 	DATETIME DEFAULT NOW(),
    FOREIGN KEY(CategoryID) REFERENCES `CategoryQuestion`(CategoryID),
	FOREIGN KEY(TypeID) REFERENCES `TypeQuestion`(TypeID),
    FOREIGN KEY(CreatorID) 		REFERENCES `Account`(AccountId)
);

-- create table Answer
CREATE TABLE Answer (
    AnswerID 		TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Content 	 	VARCHAR(100) NOT NULL,
    QuestionID 		TINYINT UNSIGNED,
    isCorrect 	 	BIT DEFAULT 1,
    FOREIGN KEY(QuestionID) REFERENCES `Question`(QuestionID)
);

-- create table Exam
CREATE TABLE Exam (
    ExamID 			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    `Code` 	 		VARCHAR(10) NOT NULL,
    Title 			VARCHAR(30) NOT NULL,
    CategoryID 	 	TINYINT UNSIGNED NOT NULL,
    Duration 	 	TINYINT NOT NULL,
    CreatorID 	 	TINYINT UNSIGNED NOT NULL,
    CreateDate 	 	DATETIME DEFAULT NOW(),
    FOREIGN KEY(CategoryID) REFERENCES CategoryQuestion(CategoryID),
    FOREIGN KEY(CategoryID) REFERENCES Question(CategoryID),
    FOREIGN KEY(CreatorID) 	REFERENCES `Account`(AccountId)
);

-- create table ExamQuestion
CREATE TABLE ExamQuestion (
    ExamID 						TINYINT UNSIGNED,
    QuestionID 	 				TINYINT UNSIGNED,
    PRIMARY KEY(ExamID,QuestionID),
    FOREIGN KEY(QuestionID) REFERENCES `Question`(QuestionID),
    FOREIGN KEY(ExamID) REFERENCES `Exam`(ExamID)
);

-- INSERT INTO
-- insert into Department
INSERT INTO Department(DepartmentName)
VALUES 			('Marketing'		),
				('Sale'				),
				('Security'			),
				('Administration'	),
				('Customer Service'	);
 
 -- insert into Position
INSERT INTO `Position`(PositionName)
VALUES 			('Dev'			),
				('Test'			),
				('Scrum Master'	),
				('PM'			); 
      
-- insert into  Account    
 INSERT INTO `Account`(Email,                 Username,             FullName, 			 DepartmentID, 	PositionID,		 CreateDate)
VALUES 			('mattroibecon.@gmail.com'		,'matroi'			,'mat troi be con'		, '1'		, '2'		, '2020-03-05 01:01:01'),
				('hoangvana.@gmail.com'			,'anh'				,'hoang van anh'		, '3'		, '4'		, '2020-04-05 09:00:01'),
				('hoangvanh.@gmail.com'			,'hieu'				,'hoang van hieu'		, '4'		, '1'		, '2020-04-15 10:01:01'),
				('nguyenvant.@gmail.com'		,'trung'			,'nguyen van tien'		, '1'		, '3'		, '2020-05-18 18:01:01'),
				('nguyenvand.@gmail.com'		,'duc'				,'nguyen van duc'		, '3'		,'2'		, '2020-10-29 15:01:01');

-- insert into	Group		
INSERT INTO `Group`(GroupName	,CreatorID ,		CreateDate)
VALUES 				('Group1'		,'1'	,'2021-10-29 22:01:01'),
					('Group2'		,'2'	,'2021-10-29 15:09:04'),
					('Group3'		,'1'	,'2020-10-29 13:08:03'),
					('Group4'		,'2'	,'2020-10-29 19:07:02'),
					('Group5'		,'3'	,'2020-10-29 16:11:01'); 

-- insert into GroupAccount                   
INSERT INTO `GroupAccount`(GroupID,  AccountID ,		JoinDate)
VALUES 					('1'			,'1'	,'2021-11-29 22:44:55'),
						('5'			,'2'	,'2021-11-29 15:22:44'),
						('4'			,'1'	,'2020-10-30 23:35:01'),
						('3'			,'2'	,'2020-12-29 20:07:34'),
						('1'			,'3'	,'2020-10-29 19:11:24'); 

-- insert into TypeQuestion					
INSERT INTO `TypeQuestion`(TypeName)
VALUES 					('Essay'  			),
						('Multiple-Choice'	);

-- insert into CategoryQuestion				
INSERT INTO `CategoryQuestion`(CategoryName)
VALUES 					('Java'  		),
						('.NET'  		),
						('SQL'  		),
						('Postman'  	),
						('Ruby'			);
                        
-- insert into Question                       
 INSERT INTO `Question`(Content,               CategoryID,         TypeID, 		CreatorID, 		CreateDate)
VALUES 					('Question Java'			,'1'				,'1'		, '1'			, '2020-03-05 01:01:01'),
						('Question .NET'			,'2'				,'2'		, '5'			, '2020-03-05 01:01:01'),
						('Question SQL'				,'3'				,'2'		, '3'			, '2020-03-05 01:01:01'),
						('Question Postman'			,'4'				,'1'		, '2'			, '2020-03-05 01:01:01'),
						('Question Ruby'			,'5'				,'2'		, '1'			, '2020-03-05 01:01:01');

-- insert into Answer
INSERT INTO `Answer`(	Content, 		QuestionID,		 isCorrect)
VALUES 					('Answer Ruby'  	,'5',			1),	
						('Answer Java22'  	,'1',			0),	
						('Answer Ruby'  	,'5',			1),	
						('Answer Postman'  	,'4',			0),	
						('Answer Java'  	,'1',			0);									

-- insert into Exam                       
INSERT INTO `Exam`	(`Code`,               Title,        	 CategoryID, 	Duration, 	CreatorID,		CreateDate)
VALUES 					('DT01'			,'Title Java'		,'1'			, 60			,1,			'2020-03-05'),
						('DT02'			,'Title .NET'		,'2'			, 90			,4, 		'2020-03-05'),
						('DT03'			,'Title SQL'		,'3'			, 80			,3, 		'2020-03-05'),
						('DT04'			,'Title Java'		,'1'			, 60			,1, 		'2020-03-05'),
						('DT05'			,'Title Ruby'		,'5'			, 70			,2, 		'2020-03-05');

-- insert into ExamQuestion
INSERT INTO `ExamQuestion`(	ExamID, 		QuestionID)
VALUES 						(1  				,1),
							(2 					,2),
							(3  				,3),
							(4  				,4),
							(5 					,5);









