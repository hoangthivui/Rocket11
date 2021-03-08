-- Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban 'Security'
CREATE VIEW danhsachnhanvienphongSecurity AS
SELECT a.AccountID, a.Username, a.FullName
FROM department d
JOIN `account` a ON a.DepartmentID=d.DepartmentID
WHERE d.DepartmentName='Security'
;

-- Question 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất
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
        
-- Question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ được coi là quá dài) và xóa nó đi
SELECT * FROM question;

