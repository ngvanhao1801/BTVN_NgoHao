﻿SELECT * FROM Employees
Cau1
SELECT LOWER (FirstName)+ ' ' + LOWER (LastName) AS FullName From Employees
Cau2
SELECT UPPER (FirstName)+ ' ' + UPPER (LastName) AS FullName From Employees
Cau3
SELECT * FROM Employees 
WHERE Country='USA'
Cau4
SELECT * FROM Customers 
WHERE Country='UK'
Cau5
SELECT * FROM Customers 
WHERE Country='Mexico'
Cau6
SELECT * FROM Customers 
WHERE Country='Sweden'
Cau7
SELECT * FROM Products
SELECT ProductID, Productname, UnitPrice
FROM Products
WHERE UnitsInStock BETWEEN 5 AND 10;
Cau8
SELECT ProductID, ProductName, UnitPrice, ReorderLevel
FROM Products
WHERE UnitsOnOrder BETWEEN 60 AND 100;

SELECT * FROM Orders;

SELECT 
	CategoryID, 
	COUNT(ProductID)
FROM Products
GROUP BY CategoryID;


select 
	*
FROM Products 
WHERE CategoryID = 7

SELECT * FROM Orders
Cau9
SELECT 
	EmployeeID,
	COUNT(OrderID) AS 'Tổng đơn hàng'
	FROM Orders 
	WHERE Year(OrderDate)= '1996' 
GROUP BY EmployeeID;

select 
	*
FROM Orders 
WHERE EmployeeID = 9
Cau10
SELECT 
	EmployeeID,
	COUNT(OrderID) AS 'Tổng đơn hàng'
	FROM Orders 
	WHERE Year(OrderDate)= '1998'
GROUP BY EmployeeID;
Cau11
SELECT 
	EmployeeID, 
	COUNT(OrderID) AS 'Tổng đơn hàng'
	FROM Orders 
	WHERE OrderDate BETWEEN '1998-1-1' AND '1998-7-31'
	GROUP BY EmployeeID

select 
	*
FROM Orders 
WHERE EmployeeID = 5
Cau12
SELECT 
	EmployeeID, 
	COUNT(OrderID) AS 'Tổng đơn hàng'
	FROM Orders 
	WHERE OrderDate BETWEEN '1997-1-1' AND '1997-6-30'
	GROUP BY EmployeeID
Cau13
SELECT OrderID, Freight, 
CASE  
WHEN Freight >= 100 
THEN Freight * 1.1 ELSE Freight * 1.05 
END AS 'Cước phí có thuế'
FROM Orders 
WHERE OrderDate BETWEEN '1996-08-01' AND '1996-08-05';
Cau14
SELECT  CONCAT(FirstName, ' ', LastName) AS 'Họ và Tên', 
CASE TitleOfCourtesy  
WHEN 'Mr.' THEN 'Nam'  
WHEN 'Ms.' THEN 'Female'  
WHEN 'Mrs.' THEN 'Female'  
END AS 'Giới tính',  title AS 'Chức danh'
FROM Employees;

Cau15
SELECT  CONCAT(FirstName, ' ', LastName) AS 'Họ và Tên', 
CASE TitleOfCourtesy  
WHEN 'Mr.' THEN 'M'
WHEN 'Dr.' THEN 'M'
WHEN 'Ms.' THEN 'F'  
WHEN 'Mrs.' THEN 'F'  
END AS 'Giới tính',  title AS 'Chức danh'
FROM Employees;


Cau16
SELECT  CONCAT(FirstName, ' ', LastName) AS 'Họ và Tên',  
CASE  
WHEN TitleOfCourtesy = 'Mr.' THEN 'Nam'  
WHEN TitleOfCourtesy IN ('Ms.', 'Mrs.') THEN 'Female'  
ELSE 'Unknown'  
END AS 'Giới tính', Title AS 'Chức danh'
FROM  Employees;

Cau17
SELECT  CONCAT(FirstName, ' ', LastName) AS 'Họ và Tên',  
CASE  
WHEN TitleOfCourtesy = 'Mr.' THEN '0'  
WHEN TitleOfCourtesy IN ('Ms.', 'Mrs.') THEN '1'  
ELSE '2'  
END AS 'Giới tính', Title AS 'Chức danh'
FROM  Employees;

Cau18
SELECT  CONCAT(FirstName, ' ', LastName) AS 'Họ và Tên',  
CASE  
WHEN TitleOfCourtesy = 'Mr.' THEN 'M'  
WHEN TitleOfCourtesy IN ('Ms.', 'Mrs.') THEN 'F'  
ELSE 'N/A'  
END AS 'Giới tính', Title AS 'Chức danh'
FROM  Employees;

SELECT * FROM [Order Details]
Cau21
SELECT OrderID, Freight, 
CASE  
WHEN Freight >= 100 THEN Freight * 1.1 
ELSE Freight * 1.05 
END AS 'Cước phí có thuế'
FROM Orders 
WHERE OrderDate BETWEEN '1996-08-01' AND '1996-08-05';

Cau22
SELECT Products.CategoryID, Products.ProductID, 
SUM([Order Details].Quantity * [Order Details].UnitPrice) AS 'Doanh thu sản phẩm'
FROM [Order Details] 
INNER JOIN Orders ON [Order Details].OrderID = Orders.OrderID 
INNER JOIN Products ON [Order Details].ProductID = Products.ProductID 
WHERE Orders.OrderDate BETWEEN '1996-07-01' AND '1996-07-05' 
GROUP BY Products.CategoryID, Products.ProductID 
ORDER BY Products.CategoryID, Products.ProductID;

SELECT * FROM ORDERS

Cau23
SELECT o.OrderID, o.OrderDate, o.RequiredDate, o.ShippedDate, e.EmployeeID, e.FirstName, e.LastName
FROM orders o
JOIN employees e ON o.EmployeeID = e.EmployeeID
WHERE o.ShippedDate > o.RequiredDate + 7;

SELECT * FROM Customers
SELECT * FROM Employees

Cau24
SELECT LastName AS 'Tên', HomePhone AS 'Số điện thoại'
FROM (
  SELECT LastName, HomePhone
  FROM Employees
  UNION ALL
  SELECT CompanyName, Phone  
  FROM customers
  WHERE CompanyName LIKE 'W%'
) AS all_people

SELECT * FROM Orders

Cau24
SELECT Customers. *
FROM Customers
JOIN Orders ON Customers.CustomerID = Orders.CustomerID
WHERE orders.OrderID = 10643;


SELECT * FROM Products
Cau25
SELECT Products.ProductID, Products.ProductName, 
SUM([Order Details].Quantity) AS 'Tổng số đơn vị đặt hàng'
FROM Products
INNER JOIN [Order Details] ON Products.ProductID = [Order Details].ProductID
GROUP BY Products.ProductID, Products.ProductName
HAVING SUM([Order Details].Quantity) >= 1200;

Cau26
SELECT Products.ProductID, Products.ProductName, Products.SupplierID, Products.CategoryID, 
SUM([Order Details].Quantity) AS 'Tổng số đơn vị đặt hàng'
FROM Products
INNER JOIN [Order Details] ON Products.ProductID = [Order Details].ProductID
GROUP BY Products.ProductID, Products.ProductName, Products.SupplierID, Products.CategoryID
HAVING SUM([Order Details].Quantity) >= 1400;


SELECT TOP 1 Categories.CategoryName, 
COUNT(Products.ProductID) AS TotalProduct
FROM Products
INNER JOIN Categories ON Products.CategoryID = Categories.CategoryID
GROUP BY Categories.CategoryName
ORDER BY TotalProduct DESC


SELECT TOP 1 Categories.CategoryName, 
SUM([Order Details].Quantity) as total_quantity
FROM Categories
JOIN Products ON Categories.CategoryID = Products.CategoryID
JOIN [Order Details] ON Products.CategoryID = [Order Details].ProductID
GROUP BY Categories.CategoryName
ORDER BY total_quantity 

Cau28

SELECT TOP 1 Categories.CategoryName, 
COUNT(Products.ProductID) AS TotalProduct
FROM Products
INNER JOIN Categories ON Products.CategoryID = Categories.CategoryID
GROUP BY Categories.CategoryName
ORDER BY TotalProduct ASC



SELECT COUNT(*) AS TotalRecords FROM Customers;
SELECT COUNT(*) AS TotalRecords FROM Employees;

SELECT * FROM Orders 
SELECT * FROM Employees

Cau30
SELECT Employees.EmployeeID, SUM(Orders.ShipVia) AS 'Tổng đơn hàng tối thiểu'
FROM Employees
JOIN Orders ON Employees.EmployeeID = Orders.EmployeeID
GROUP BY Employees.EmployeeID
HAVING SUM(Orders.ShipVia) = (SELECT MIN(TotalOrdersSubquery.MinTotal) 
FROM (SELECT SUM(ShipVia) AS MinTotal 
FROM Orders 
GROUP BY EmployeeID) AS TotalOrdersSubquery)

