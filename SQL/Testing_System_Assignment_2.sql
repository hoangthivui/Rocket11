DROP DATABASE IF EXISTS test;
CREATE DATABASE IF NOT EXISTS test;
USE test;

CREATE TABLE Department (
    DepartmentID 		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    DepartmentName		VARCHAR(50) UNIQUE KEY NOT NULL
);

CREATE TABLE `Position` (
    PositionID 			TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    PositionName 		ENUM('Dev','Test','Scrum Master','PM') UNIQUE KEY NOT NULL
);

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

CREATE TABLE `Group` (
    GroupID 		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    GroupName		 VARCHAR(50) NOT NULL UNIQUE KEY,
    CreatorID		 TINYINT UNSIGNED NOT NULL,
    CreateDate		 DATETIME DEFAULT NOW(),
    FOREIGN KEY(CreatorID) REFERENCES `Account`(AccountID)
);

CREATE TABLE GroupAccount (
    GroupID 			TINYINT UNSIGNED,
    AccountID 			TINYINT UNSIGNED,
    JoinDate 			DATETIME DEFAULT NOW(),
	PRIMARY KEY (GroupID,AccountID),
    FOREIGN KEY(GroupID) REFERENCES `Group`(GroupID),
    FOREIGN KEY(AccountID) REFERENCES `Account`(AccountID)
);

CREATE TABLE TypeQuestion (
    TypeID 			TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    TypeName 	 	ENUM('Essay','Multiple-Choice') NOT NULL
);

CREATE TABLE CategoryQuestion (
    CategoryID 				TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    CategoryName 			 VARCHAR(30) NOT NULL UNIQUE KEY
);

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

CREATE TABLE Answer (
    AnswerID 		TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Content 	 	VARCHAR(100) NOT NULL,
    QuestionID 		TINYINT UNSIGNED,
    isCorrect 	 	BIT DEFAULT 1,
    FOREIGN KEY(QuestionID) REFERENCES `Question`(QuestionID)
);

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

CREATE TABLE ExamQuestion (
    ExamID 						TINYINT UNSIGNED,
    QuestionID 	 				TINYINT UNSIGNED,
    PRIMARY KEY(ExamID,QuestionID),
    FOREIGN KEY(QuestionID) REFERENCES `Question`(QuestionID),
    FOREIGN KEY(ExamID) REFERENCES `Exam`(ExamID)
);

-- INSERTinto
INSERT INTO Department(DepartmentName)
VALUES 			('Marketing'		),
				('Sale'				),
				('Security'			),
				('Administration'	),
				('Customer Service'	);
                
INSERT INTO `Position`(PositionName)
VALUES 			('Dev'			),
				('Test'			),
				('Scrum Master'	),
				('PM'			); 
                
 INSERT INTO `Account`(Email,                 Username,             FullName, 			 DepartmentID, 	PositionID,		 CreateDate)
VALUES 			('mattroibecon.@gmail.com'		,'matroi'			,'mat troi be con'		, '1'		, '2'		, '2020-03-05 01:01:01'),
				('hoangvana.@gmail.com'			,'anh'				,'hoang van anh'		, '3'		, '4'		, '2020-04-05 09:00:01'),
				('hoangvanh.@gmail.com'			,'hieu'				,'hoang van hieu'		, '4'		, '1'		, '2020-04-15 10:01:01'),
				('nguyenvant.@gmail.com'		,'trung'			,'nguyen van tien'		, '1'		, '3'		, '2020-05-18 18:01:01'),
				('nguyenvand.@gmail.com'		,'duc'				,'nguyen van duc'		, '3'		,'2'		, '2020-10-29 15:01:01');
			
INSERT INTO `Group`(GroupName	,CreatorID ,		CreateDate)
VALUES 				('Group1'		,'1'	,'2021-10-29 22:01:01'),
					('Group2'		,'2'	,'2021-10-29 15:09:04'),
					('Group3'		,'1'	,'2020-10-29 13:08:03'),
					('Group4'		,'2'	,'2020-10-29 19:07:02'),
					('Group5'		,'3'	,'2020-10-29 16:11:01'); 
                    
INSERT INTO `GroupAccount`(GroupID,  AccountID ,		JoinDate)
VALUES 					('1'			,'1'	,'2021-11-29 22:44:55'),
						('5'			,'2'	,'2021-11-29 15:22:44'),
						('4'			,'1'	,'2020-10-30 23:35:01'),
						('3'			,'2'	,'2020-12-29 20:07:34'),
						('1'			,'3'	,'2020-10-29 19:11:24'); 
                        
INSERT INTO `TypeQuestion`(TypeName)
VALUES 					('Essay'  			),
						('Multiple-Choice'	);
                        
INSERT INTO `CategoryQuestion`(CategoryName)
VALUES 					('Java'  		),
						('.NET'  		),
						('SQL'  		),
						('Postman'  	),
						('Ruby'			);
 INSERT INTO `Question`(Content,               CategoryID,         TypeID, 		CreatorID, 		CreateDate)
VALUES 					('Question Java'			,'1'				,'1'		, '1'			, '2020-03-05 01:01:01'),
						('Question .NET'			,'2'				,'2'		, '5'			, '2020-03-05 01:01:01'),
						('Question SQL'				,'3'				,'2'		, '3'			, '2020-03-05 01:01:01'),
						('Question Postman'			,'4'				,'1'		, '2'			, '2020-03-05 01:01:01'),
						('Question Ruby'			,'5'				,'2'		, '1'			, '2020-03-05 01:01:01');

INSERT INTO `Answer`(	Content, 		QuestionID,		 isCorrect)
VALUES 					('Answer Ruby'  	,'5',			1),	
						('Answer Java22'  	,'1',			0),	
						('Answer Ruby'  	,'5',			1),	
						('Answer Postman'  	,'4',			0),	
						('Answer Java'  	,'1',			0);									
                        
INSERT INTO `Exam`	(`Code`,               Title,        	 CategoryID, 	Duration, 	CreatorID,		CreateDate)
VALUES 					('DT01'			,'Title Java'		,'1'			, 60			,1,			'2020-03-05'),
						('DT02'			,'Title .NET'		,'2'			, 90			,4, 		'2020-03-05'),
						('DT03'			,'Title SQL'		,'3'			, 80			,3, 		'2020-03-05'),
						('DT04'			,'Title Java'		,'1'			, 60			,1, 		'2020-03-05'),
						('DT05'			,'Title Ruby'		,'5'			, 70			,2, 		'2020-03-05');


INSERT INTO `ExamQuestion`(	ExamID, 		QuestionID)
VALUES 						(1  				,1),
							(2 					,2),
							(3  				,3),
							(4  				,1),
							(5 					,5);
 -- Question 1: lấy ra tất cả các phòng ban
SELECT * FROM `department`;
    
-- Question 2: lấy ra id của phòng ban có tên là "Sale"    
SELECT 
    `DepartmentID`
FROM
    `Department`
WHERE
    DepartmentName = 'Sale';
    
-- Question 3: lấy ra thông tin account có full name dài nhất 
SELECT 
    FullName, CHAR_LENGTH(FullName)
FROM
    `account`
WHERE
     CHAR_LENGTH(FullName)= (SELECT MAX(CHAR_LENGTH(FullName)) FROM `account`);

-- Question 4: Lấy ra tên group đã tham gia trước ngày 20/12/2019
SELECT 
    GroupName
FROM
    `Group`
WHERE
    CreateDate <= '2019-12-20';
    
-- Question 5: Lấy ra ID của question có >= 4 câu trả lời
SELECT QuestionID, COUNT(AnswerID) AS so_luong
FROM answer
GROUP BY QuestionID
HAVING COUNT(AnswerID)=2;

-- Question 6: Lấy ra 2 group được tạo gần đây nhất
SELECT *
 FROM `group`
 ORDER BY CreateDate DESC
 LIMIT 2;
 
 -- Question 8: Xóa tất cả các exam được tạo trước ngày 20/12/2019
DELETE FROM examquestion 
WHERE
    ExamID IN (SELECT 
        ExamID
    FROM
        exam
    
    WHERE
        CreateDate < '2021-10-29');
   
-- Question 9: Update thông tin của account có id = 5 thành tên "Nguyễn Bá Lộc" và email thành loc.nguyenba@vti.com.vn
UPDATE `account` 
SET 
    FullName = 'nguyen ba loc',
    Email = 'loc.nguyenba@vti.com.vn'
WHERE
    AccountID = 5;
    
-- Question 10: Viết lệnh để lấy ra danh sách nhân viên và thông tin phòng ban của họ 
SELECT *
FROM `account` a
JOIN `department` d ON a.DepartmentID = d.DepartmentID;

-- Question 11: Viết lệnh để lấy ra tất cả các developer
SELECT 
    *
FROM
    `account` a
JOIN `position` p ON a.PositionID = p.PositionID
WHERE
    p.PositionName = 'Dev';
    
-- Question 12: Viết lệnh để lấy ra danh sách các phòng ban có =2 nhân viên
SELECT 
    *,COUNT(a.DepartmentID) AS 'SO LUONG'
FROM
    `department` d
        JOIN
    account a ON a.DepartmentID = d.DepartmentID
GROUP BY 	a.DepartmentID
HAVING COUNT(a.DepartmentID)= 2;

-- Question 13: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất
SELECT MAX(so_luong)
FROM (SELECT 
    Content, COUNT(eq.QuestionID) AS so_luong
FROM
    examquestion eq
        JOIN
    question q ON eq.QuestionID = q.QuestionID
GROUP BY q.QuestionID) AS max;

-- Question 14: Thông kê mỗi category Question được sử dụng trong bao nhiêu Question
SELECT 
    c.CategoryName, COUNT(q.CategoryID)
FROM
    question q
        JOIN
    categoryquestion c ON c.CategoryID = q.CategoryID
GROUP BY QuestionID;

-- Question 15: Lấy ra Question có nhiều câu trả lời nhất------------------
SELECT 
    q.Content, COUNT(a.AnswerID)
FROM
    answer a JOIN question q
ON a.QuestionID = q.QuestionID
GROUP BY a.QuestionID
HAVING COUNT(a.AnswerID) = (SELECT MAX(cout)
							FROM
								(SELECT COUNT(a.AnswerID) AS cout
								FROM answer a
								JOIN question q ON a.QuestionID = q.QuestionID
								GROUP BY a.QuestionID) AS max);
                                
-- Question 16: Tìm chức vụ có ít người nhất 
SELECT COUNT(a.AccountID) FROM `account` a JOIN position p ON a.PositionID=p.PositionID GROUP BY a.PositionID;                             







