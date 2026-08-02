SELECT name, bonus
FROM Employee
Left Join Bonus
ON Employee.empId = Bonus.empId
where Bonus.bonus < 1000 
    OR Bonus.bonus IS null;