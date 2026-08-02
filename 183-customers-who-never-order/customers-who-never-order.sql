# Write your MySQL query statement below
Select c.name AS Customers
From Customers c LEFT JOIN Orders o
ON c.id = o.customerId
Where o.customerId is null;