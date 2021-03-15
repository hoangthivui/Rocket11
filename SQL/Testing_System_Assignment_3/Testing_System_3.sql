-- ``````````QUESTION 1: TẠO VIEW CÓ CHỨA DANH SÁCH NHÂN VIÊN THUỘC PHÒNG BAN 'SECURITY'```````````````````````
CREATE VIEW danhsachnhanvienphongSecurity AS
SELECT a.AccountID, a.Username, a.FullName
FROM department d
JOIN `account` a ON a.DepartmentID=d.DepartmentID
WHERE d.DepartmentName='Security'
;

-- ````````````QUESTION 2: TẠO VIEW CÓ CHỨA THÔNG TIN CÁC ACCOUNT THAM GIA VÀO NHIỀU GROUP NHẤT`````````````````
CREATE VIEW accountthamgiavaonhieugrnhat AS
SELECT g.AccountID,COUNT(g.GroupID)
FROM groupaccount g
JOIN `account` a ON a.AccountID= g.AccountID
GROUP BY g.AccountID
HAVING COUNT(g.GroupID)=(SELECT MAX(dem)
FROM ( SELECT AccountID,COUNT(GroupID) AS dem
		FROM groupaccount 
		GROUP BY AccountID
		) AS max);
        
-- ````````QUESTION 3: TẠO VIEW CÓ CHỨA CÂU HỎI CÓ NHỮNG CONTENT QUÁ DÀI (CONTENT QUÁ 300 TỪ ĐƯỢC COI LÀ QUÁ DÀI) VÀ XÓA NÓ ĐI
CREATE VIEW cau_hoi_co_content_dai AS
SELECT QuestionID, char_length(Content)
FROM question
WHERE char_length(Content)>12;

-- ```````QUESTION 4: TẠO VIEW CÓ CHỨA DANH SÁCH CÁC PHÒNG BAN CÓ NHIỀU NHÂN VIÊN NHẤT``````````````````````````
CREATE VIEW department_nhieu_account_nhat AS
SELECT DepartmentID, COUNT(AccountID)AS dem
FROM `account`
GROUP BY DepartmentID
HAVING COUNT(AccountID)=(SELECT max(dem)
FROM (SELECT DepartmentID, COUNT(AccountID)AS dem
		FROM `account`
		GROUP BY DepartmentID)AS max);
        
-- `````````QUESTION 5: TẠO VIEW CÓ CHỨA TẤT CÁC CÁC CÂU HỎI DO USER HỌ NGUYỄN TẠO``````````````````````
-- có 2 user họ 'mat'
SELECT q.Content, a.FullName
FROM  question q JOIN `account` a ON q.CreatorID=a.AccountID
WHERE q.CreatorID=(SELECT AccountID
					FROM `account`
					WHERE FullName LIKE '%mat%');
                    
-- có >2 user họ nguyễn
CREATE OR REPLACE VIEW vw_Que5
AS
SELECT Q.CategoryID, Q.Content, A.FullName AS Creator FROM question Q
INNER JOIN `account` A ON A.AccountID = Q.CreatorID 
WHERE SUBSTRING_INDEX( A.FullName, ' ', 1 ) = 'mat';
SELECT * FROM vw_Que5;

