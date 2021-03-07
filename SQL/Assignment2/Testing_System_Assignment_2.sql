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

-- Question 4: Lấy ra tên group đã tham gia trước ngày 2021-10-29
SELECT 
    GroupName,CreateDate
FROM
    `Group`
WHERE
    CreateDate <= '2021-10-29';
    
-- Question 5: Lấy ra ID của question có =2 câu trả lời
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


/*SELECT MAX(so_luong)
FROM (SELECT 
    Content, COUNT(eq.QuestionID) AS so_luong
FROM
    examquestion eq
        JOIN
    question q ON eq.QuestionID = q.QuestionID
GROUP BY q.QuestionID) AS max;*/
-- Question 13: Viết lệnh để lấy ra danh sách câu hỏi được sử dụng trong đề thi nhiều nhất
SELECT q.Content, COUNT(e.ExamID) 
FROM question q 
JOIN examquestion e ON q.QuestionID=e.QuestionID
 GROUP BY e.QuestionID
HAVING COUNT(e.ExamID)=(SELECT MAX(dem) 
						FROM (SELECT COUNT(ExamID) AS dem
								FROM examquestion
								GROUP BY QuestionID) AS timmax);

-- Question 14: Thông kê mỗi category Question được sử dụng trong bao nhiêu Question
SELECT 
    c.CategoryName, COUNT(q.QuestionID)
FROM
    question q
        JOIN
    categoryquestion c ON c.CategoryID = q.CategoryID
GROUP BY q.CategoryID;

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
-- SELECT COUNT(a.AccountID) FROM `account` a JOIN position p ON a.PositionID=p.PositionID GROUP BY a.PositionID;   
SELECT 
    PositionID, COUNT(AccountID)
FROM
    `account`
GROUP BY PositionID
HAVING COUNT(AccountID) = (SELECT 
        MIN(co_so_nguoi_la)
    FROM
        (SELECT 
            COUNT(AccountID) AS co_so_nguoi_la
        FROM
            `account`
        GROUP BY PositionID) AS max);
        
-- Question 17: Thống kê mỗi phòng ban có bao nhiêu dev, test, scrum master, PM
SELECT 
    d.DepartmentID,p.PositionName ,COUNT(a.PositionID) AS thanh_vien
FROM
    `department` d
        JOIN
    `account` a ON a.DepartmentID = d.DepartmentID JOIN position p ON a.PositionID=p.PositionID
GROUP BY a.DepartmentID;

-- Question 18: Lấy thông tin chi tiết của câu hỏi bao gồm: thông tin cơ bản của
-- question, loại câu hỏi, ai là người tạo ra câu hỏi, câu trả lời là gì, …
SELECT q.QuestionID, q.Content, t.TypeName, q.CategoryID, a.Content
FROM question q
JOIN typequestion t ON t.TypeID=q.TypeID 
JOIN answer a ON q.QuestionID=a.QuestionID;

-- Question 19: Lấy ra số lượng câu hỏi của mỗi loại tự luận hay trắc nghiệm
SELECT 
    t.TypeName, COUNT(q.TypeID) AS so_luong
FROM
    question q
    JOIN typequestion t ON q.TypeID=t.TypeID
GROUP BY q.TypeID;