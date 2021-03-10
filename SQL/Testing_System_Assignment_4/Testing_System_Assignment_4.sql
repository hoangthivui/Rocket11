USE test;
-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các  account thuộc phòng ban đó
/*DROP PROCEDURE IF EXISTS sp_GetAccFromDep;
DELIMITER $$
CREATE PROCEDURE sp_GetAccFromDep(IN in_dep_name NVARCHAR(50))
BEGIN
	SELECT A.AccountID, A.FullName, D.DepartmentName FROM `account` A
	INNER JOIN department D ON D.DepartmentID = A.DepartmentID
	WHERE D.DepartmentName = in_dep_name;
END$$
DELIMITER ;
Call sp_GetAccFromDep('Security');
*/
DROP PROCEDURE IF EXISTS cau1;
DELIMITER $$
CREATE PROCEDURE cau1(IN in_dep_name varchar(50))
BEGIN
	SELECT d.DepartmentID, d.DepartmentName, a.FullName
    FROM `account` a JOIN department d ON a.DepartmentID=d.DepartmentID
    WHERE d.DepartmentName=in_dep_name;
END$$
DELIMITER ;
Call cau1('Security');


-- Question 2: Tạo store để in ra số lượng account trong mỗi group
/*DROP PROCEDURE IF EXISTS sp_GetCountAccFromGroup;
DELIMITER $$
CREATE PROCEDURE sp_GetCountAccFromGroup(IN in_group_name NVARCHAR(50))
BEGIN
	SELECT g.GroupName, count(ga.AccountID) AS SL 
    FROM groupaccount ga           
	INNER JOIN `group` g ON ga.GroupID = g.GroupID
	WHERE g.GroupName = in_group_name;
END$$
DELIMITER ;
Call sp_GetCountAccFromGroup('Group1');*/

DROP PROCEDURE IF EXISTS cau2;
DELIMITER $$
CREATE PROCEDURE cau2(IN in_gr_name VARCHAR(50))
BEGIN
SELECT g.GroupName, count(ga.AccountID) AS sl
FROM groupaccount ga 
JOIN `group` g ON ga.GroupID=g.GroupID
where g.GroupName=in_gr_name;
END$$
DELIMITER ;
Call cau2('Group1');

-- Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo trong tháng hiện tại
/*DROP PROCEDURE IF EXISTS sp_GetCountTypeInMonth;
DELIMITER $$
CREATE PROCEDURE sp_GetCountTypeInMonth()
BEGIN
SELECT tq.TypeName, count(q.TypeID) FROM question q
INNER JOIN typequestion tq ON q.TypeID = tq.TypeID
WHERE month(q.CreateDate) = month(now()) AND year(q.CreateDate) = year(now())
GROUP BY q.TypeID;
END$$
DELIMITER ;
Call sp_GetCountTypeInMonth();*/

SELECT tq.TypeName, count(q.QuestionID)
FROM question q JOIN typequestion tq ON tq.TypeID= q.TypeID
WHERE month(q.CreateDate)=month(now()) and year(q.CreateDate)=year(now())
GROUP BY q.TypeID;
-- store
DROP PROCEDURE IF EXISTS cau3;
DELIMITER $$
CREATE PROCEDURE cau3()
BEGIN
			SELECT tq.TypeName, count(q.QuestionID)
			FROM question q JOIN typequestion tq ON tq.TypeID= q.TypeID
			WHERE month(q.CreateDate)=month(now()) and year(q.CreateDate)=year(now())
			GROUP BY q.TypeID;
END$$
DELIMITER ;
Call cau3();


-- Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhấT
-- bài mẫU
DROP PROCEDURE IF EXISTS sp_GetCountQuesFromType;
DELIMITER $$
CREATE PROCEDURE sp_GetCountQuesFromType(OUT v_maxID TINYINT)
BEGIN
	WITH CTE_MaxTypeID AS(
		SELECT count(q.TypeID) AS SL FROM question q
		GROUP BY q.TypeID	
		)
	SELECT q.QuestionID INTO v_maxID FROM question q
	INNER JOIN typequestion tq ON tq.TypeID = q.TypeID
	GROUP BY q.TypeID
	HAVING count(q.TypeID) = (SELECT MAX(SL) FROM CTE_MaxTypeID);
END$$
DELIMITER ;

SET @ID =0;
Call sp_GetCountQuesFromType(@ID);

SELECT @ID;

-- lệnh để trả ra id của type question có nhiều câu hỏi nhấT
SELECT TypeID, COUNT(QuestionID)
FROM question
GROUP BY TypeID
HAVING COUNT(QuestionID)=(SELECT max(dem)
							FROM (SELECT TypeID, COUNT(QuestionID) AS dem
									FROM question 
									GROUP BY TypeID) AS max);
-- tạo store
DROP PROCEDURE IF EXISTS cau4;
DELIMITER $$
CREATE PROCEDURE cau4()
BEGIN 
		SELECT TypeID, COUNT(QuestionID)
		FROM question
		GROUP BY TypeID
		HAVING COUNT(QuestionID)=(SELECT max(dem)
									FROM (SELECT TypeID, COUNT(QuestionID) AS dem
											FROM question 
											GROUP BY TypeID) AS max);
END$$
DELIMITER ;
CALL cau4;

-- Question 5: Sử dụng store ở question 4 để tìm ra tên của type question
DROP PROCEDURE IF EXISTS cau5;
DELIMITER $$
CREATE PROCEDURE cau5()
BEGIN
		SELECT tp.TypeName, COUNT(q.QuestionID)
		FROM question q JOIN typequestion tp ON q.TypeID=tp.TypeID
		GROUP BY q.TypeID
		HAVING COUNT(q.QuestionID)=(SELECT max(dem)
									FROM (SELECT TypeID, COUNT(QuestionID) AS dem
											FROM question 
											GROUP BY TypeID) AS max);
END$$
DELIMITER ;

Call cau5();

--- nhap id và trả ra tên phòng ban của phòng ban đó
DROP FUNCTION
DELIMITER $$
CREATE FUNCTION departmenttt(in_id TINYINT) RETURNS VARCHAR(50)
BEGIN
	DECLARE out_name VARCHAR(50);
    
    SELECT DepartmentName INTO out_name
	FROM department
    WHERE DepartmentID=in_id;
    
    RETURN out_name;
END$$
DELIMITER;
-- Question 6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về group có tên
-- chứa chuỗi của người dùng nhập vào hoặc trả về user có username chứa
-- chuỗi của người dùng nhập vào
DROP PROCEDURE IF EXISTS sp_getNameAccOrNameGroup;
DELIMITER $$
CREATE PROCEDURE sp_getNameAccOrNameGroup
( IN var_String VARCHAR(50),
  IN flag TINYINT
)
BEGIN
	IF flag = 1 THEN
    -- Đoạn này xử lý điều kiện để lấy tên group có tên trùng với chuỗi nhập vào
		SELECT g.GroupName FROM `group` g WHERE g.GroupName LIKE CONCAT("%",var_String,"%");
	ELSE
-- Đoạn này xử lý điều kiện khi flag !=1, khi đó sẽ tìm User mà Username có chữa chuỗi nhập vào.
		SELECT a.Username FROM `account` a WHERE a.Username LIKE CONCAT("%",var_String,"%");
	END IF;
END$$
DELIMITER ;
Call sp_getNameAccOrNameGroup('s',1);

-- uestion 8: Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice
-- để thống kê câu hỏi essay hoặc multiple-choice nào có content dài nhất

DROP PROCEDURE IF EXISTS ;
DELIMITER $$
CREATE PROCEDURE ()
BEGIN
END$$
DELIMITER ;

SET;
Call ;

SELECT ;























-- Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất
DROP PROCEDURE IF EXISTS type_question_max_question;
DELIMITER $$
CREATE PROCEDURE type_question_max_question(OUT TypeID_cua_question_co_nhieu_question_nhat TINYINT UNSIGNED)
	BEGIN
		SELECT  t.TypeID INTO TypeID_cua_question_co_nhieu_question_nhat
        FROM question q
        JOIN typequestion t
        ON q.TypeID=t.TypeID
		group by q.TypeID
        having count(QuestionID)=(SELECT max(dem)
								FROM (SELECT TypeID,count(QuestionID) as dem
									FROM question
									group by TypeID) as max);
	END$$
DELIMITER ;

CALL type_question_max_question(@TypeID);