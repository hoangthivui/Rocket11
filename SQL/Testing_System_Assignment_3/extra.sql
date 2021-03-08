-- Question 1: Viết 1 query lấy thông tin "Name" từ bảng Production.Product có name của ProductSubcategory là 'Saddles'
-- Sử dụng Sub Query để lấy ra tất cả các ID của ProductSubcategory có name = 'Saddles'.
SELECT ProductSubcategoryID
FROM productsubcategory
WHERE `Name`='Saddles';
-- Sau đó trong outer query, sử dụng kết quả từ Sub Query để lấy ra yêu cầu của đề bài
SELECT `Name`
FROM Product
WHERE ProductSubcategoryID=(SELECT ProductSubcategoryID
							FROM productsubcategory
							WHERE `Name`='Saddles');
                            
/*  Thay đổi câu Query 1 để lấy được kết quả sau.
Hướng dẫn:
Mệnh đề WHERE trong subquery  sẽ sử dụng ký tự wildcard ‘Bo%’ .
kết quả sẽ như sau:
Name
----------------------------
Water Bottle - 30 oz.
Mountain Bottle Cage
Road Bottle Cage
LL Bottom Bracket
ML Bottom Bracket
HL Bottom Bracket
(6 row(s) affected)
 */ 
SELECT *
FROM (		SELECT `Name`
			FROM product
			WHERE SUBSTRING_INDEX(SUBSTRING_INDEX(`Name`, ' ', 2), ' ', -1) LIKE 'Bo%');
            
 /* Question 3:
Viết câu query trả về tất cả các sản phẩm có giá rẻ nhất (lowest ListPrice) và Touring 
Bike (nghĩa là ProductSubcategoryID = 3)
Hướng dẫn: sử dụng hàm MIN() trong subquery để trả về ListPrice thấp nhất 
*/
SELECT 	`Name`
FROM 	Product
WHERE	ListPrice = (SELECT MIN(ListPrice) 
					FROM 	Product
					WHERE 	ProductSubcategoryID = 3);
                    
                    
                    
												-- EXERCISE 2: JOIN NHIỀU BẢNG 
-- Question 1: Viết query lấy danh sách tên country và province
SELECT c.`Name`, s.`Name` FROM countryregion c 
JOIN stateprovince s
ON c.CountryRegionCode=s.CountryRegionCode;

--  Question2 Tiếp tục với câu query trước và thêm điều kiện là chỉ lấy country Germany và Canada
SELECT c.`Name`, s.`Name` 
FROM countryregion c 
JOIN stateprovince s
ON c.CountryRegionCode=s.CountryRegionCode
WHERE c.`Name`= 'Germany' OR c.`Name`='Canada'
;
 -- Question3  SalesOrderID, OrderDate and SalesPersonID. Từ bảng Saleoderheader, chúng ta lấy cột 
-- BusinessEntityID (là định danh của người sales), Bonus and the SalesYTD (là đã sale 
-- được bao nhiêu người trong năm nay)
SELECT sh.SalesOrderID, sh.OrderDate,s.SalesPersonID,s.Bonus,s.SalesYTD
FROM salesperson s
JOIN salesorderheader sh
ON s.SalesPersonID = sh.SalesPersonID;        

-- -- Sử dụng câu query, thêm cột JobTitle and xóa cột SalesPersonID và BusinessEntityID.
SELECT sh.SalesOrderID, sh.OrderDate,e.Title,s.SalesPersonID,s.Bonus,s.SalesYTD
FROM salesperson s
JOIN salesorderheader sh
ON s.SalesPersonID = sh.SalesPersonID
JOIN employee e
ON e.EmployeeID=s.SalesPersonID
;
      
ALTER TABLE table_name
DROP column_name;            

