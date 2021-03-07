-- Question 2: Viết lệnh để lấy ra tất cả các thực tập sinh đã vượt qua bài test đầu vào,
-- nhóm chúng thành các tháng sinh khác nhau
SELECT COUNT(Birth_Date), Birth_Date FROM trainee GROUP BY MONTH(Birth_Date) 
HAVING (ET_IQ+ET_Gmath>=20) AND ET_IQ>=8 AND ET_Gmath>=8 AND ET_English>=18;

-- Question 3: Viết lệnh để lấy ra thực tập sinh có tên dài nhất, lấy ra các thông tin sau:
-- tên, tuổi, các thông tin cơ bản (như đã được định nghĩa trong table)
SELECT *, char_length(Full_Name)
FROM trainee 
WHERE char_length(Full_Name)=(SELECT MAX(char_length(Full_Name)) 
								FROM trainee);
                                
/* Question 4: Viết lệnh để lấy ra tất cả các thực tập sinh là ET, 1 ET thực tập sinh là
những người đã vượt qua bài test đầu vào và thỏa mãn số điểm như sau:
 ET_IQ + ET_Gmath>=20
 ET_IQ>=8
 ET_Gmath>=8
 ET_English>=18
*/
SELECT * FROM trainee WHERE ET_IQ+ET_Gmath>=20 AND ET_IQ>=8 AND ET_Gmath>=8 AND ET_English>=18;

-- Question 5: xóa thực tập sinh có TraineeID = 3
DELETE FROM trainee WHERE TraineeID='3';

-- Question 6: Thực tập sinh có TraineeID = 5 được chuyển sang lớp "2". Hãy cập nhật thông tin vào database
UPDATE trainee SET Training_Class=2 WHERE TraineeID=5;

DROP TABLE IF EXISTS Department;
CREATE TABLE Department(
Department_Number		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
Department_Name			VARCHAR(50) NOT NULL
);

DROP TABLE IF EXISTS Employee_Table;
CREATE TABLE Employee_Table(
Employee_Number		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
Employee_Name		VARCHAR(50) NOT NULL,
Department_Number	TINYINT UNSIGNED NOT NULL,
FOREIGN KEY (Department_Number) REFERENCES Department(Department_Number)
);

DROP TABLE IF EXISTS Employee_Skill_Table;
CREATE TABLE Employee_Skill_Table(
Employee_Number		TINYINT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
Skill_Code			TINYINT UNSIGNED NOT NULL,
Date_Registered		TINYINT UNSIGNED NOT NULL,
FOREIGN KEY (Employee_Number) REFERENCES Employee_Table(Employee_Number)
);



 					