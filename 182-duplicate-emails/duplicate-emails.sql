SELECT email AS Email
From Person
Group by email
Having Count(*)>1;