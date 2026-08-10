SELECT c.name AS Customers
From Customers c LEFT JOIN Orders o
ON c.id = o.customerId
WHERE o.customerId IS NULL;