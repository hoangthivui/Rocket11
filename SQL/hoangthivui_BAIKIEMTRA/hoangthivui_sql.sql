DROP DATABASE IF EXISTS ThucTap;
CREATE DATABASE IF NOT EXISTS ThucTap;
USE ThucTap;

-- create table Country
CREATE TABLE Country (
	country_id 		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
   country_name		VARCHAR(50) NOT NULL
);

-- create table Location
CREATE TABLE `Location` (
    location_id 			TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    street_address 			VARCHAR(100) NOT NULL,
    postal_code				TINYINT UNSIGNED  NOT NULL,
    country_id				TINYINT UNSIGNED NOT NULL,
	FOREIGN KEY(country_id) REFERENCES `Country`(country_id)
);

-- create table Employee
CREATE TABLE `Employee` (
    employee_id 			TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    full_name 				VARCHAR(50) NOT NULL,
    email 					VARCHAR(50) UNIQUE KEY NOT NULL,
    location_id 			TINYINT UNSIGNED NOT NULL,
    FOREIGN KEY(location_id) REFERENCES `Location`(location_id)
    );
    
-- INSERT ban ghi vào table
--  them ban ghi vao table contry(country_name)
INSERT INTO Country(country_name)
VALUES
				('vietnam'			),
				('phap'				),
				('ha lan'			);
                
-- them ban ghi vao table Location
INSERT INTO Location(street_address,postal_code,country_id)
VALUES
				('paris'		,'011'	,'2'),
				('ha noi'		,'013'	,'1'),
				('thai binh'	,'012'	,'1');
                
-- them ban ghi vao table Employee
INSERT INTO Employee(full_name,email,location_id)
VALUES
				('hoang van a'			,'vana@gmail.com'	,'2'),
				('pham thi b'			,'nn03@gmail.com'	,'1'),
				('nguyen van c'			,'c@gmail.com'		,'3');
	
    
-- Lấy tất cả các nhân viên thuộc Việt nam
SELECT c.country_id, c.country_name, e.employee_id, e.full_name
FROM  country c 
JOIN location l ON c.country_id = l.country_id
JOIN employee e ON l.location_id = e.location_id
WHERE c.country_name ='viet nam';

SELECT e.full_name 
FROM employee e 
JOIN location l 
ON e.location_id=l.location_id
GROUP BY e.location_id
HAVING e.location_id=(SELECT l.location_id
					FROM location l
					JOIN country c ON l.country_id=c.country_id
					GROUP BY c.country_name='viet nam');



    -- Lấy ra tên quốc gia của employee có email là "nn03@gmail.com"
    SELECT c.country_name as ten_quoc_gia
    FROM country c
    JOIN location l ON c.country_id=l.country_id
    WHERE location_id =( SELECT location_id
							FROM  employee 
							WHERE email='nn03@gmail.com');
    
-- Thống kê mỗi country, mỗi location có bao nhiêu employee đang làm việc.
SELECT country_name AS dia_diem,COUNT(l.location_id) AS so_luong FROM  country c 
JOIN Location l ON c.country_id = l.country_id
GROUP BY l.country_id
UNION
SELECT l.street_address,COUNT(e.employee_id) FROM  employee e 
JOIN Location l ON e.location_id= l.location_id
GROUP BY l.location_id;


-- Tạo trigger cho table Employee chỉ cho phép insert mỗi quốc gia có tối đa 10 employee

DROP TRIGGER IF EXISTS not_insert_country;
DELIMITER $$
CREATE TRIGGER not_insert_country
BEFORE INSERT ON country
FOR EACH ROW
BEGIN
	IF  ()THEN
     SIGNAL SQLSTATE '12345'
     SET MESSAGE_TEXT = 'mỗi quốc gia có tối đa 10 employee';
     END IF;
END $$
DELIMITER ;
    
-- Hãy cấu hình table sao cho khi xóa 1 location nào đó thì tất cả employee ở location đó sẽ có location_id = null
DELETE FROM employee WHERE location_id=2;