
Unfortunately these questions are still asked as of 2019. Which does not check other than SQL grammar.

table name - Employees

| EmpId | EmpName | DOJ | City |Salary | ManagerId |
|----|------|-----|--------| -----| ---- |
| 1  | Davolio Nancy | 1968-12-04 | Vancouver | 100000 | 2 |
| 2  | Fuller Margaret | 1978-05-06 | Seattle | 200000 | 2  |
| 3  | Leverling Nancy | 1988-02-01 | Singapore | 300000 | 4 |
| 4  | Peacock Jenny | 1999-06-03 | Bangalore | 400000 | 3 |
| 5  | Buchanan Pam | 1987-12-01 | Seattle | 250000 | 2 |


table name - Department

| DepId | DepName  |
|----|------|
| 1  | HR | 
| 2  | Finanace |
| 3  | Medical | 
| 4  | HR | 
| 5  | Finanace|


table name - DepartmentDetails

| EmpId | DepId  |
|----|------|
| 1  | 1 | 
| 2  | 2 |
| 3  | 3 | 
| 4  | 2 | 
| 5  | 1|



1. Count Employees per department 

```
select E.EmpName, D.DepName,  count(*) from Employees E  
join Department D  on E.EmpId = D.EmpId
join DepartmentDetails DD D.DepId = DD.DepId
group by d.name 

 
```

2. Find Nth Highest salary
```
SELECT salary
FROM Employees emp1
WHERE N-1 = ( SELECT COUNT( DISTINCT ( emp2.Salary ) )
                FROM Employees emp2
                WHERE emp2.salary > emp1.salary
```

3. Count Employees by city 

```
SELECT City, COUNT(*) from Employees group by City

```

4. Delete duplicate Employees with same name and  without creating temp table 

```
DELETE FROM Employees  
WHERE EmpId IN 
( SELECT EmpId 
FROM Employees       
GROUP BY EmpName
HAVING COUNT(*) > 1));

```

5. Select employess who are managers

```
SELECT DISTINCT E.EmpName
FROM Employees E
INNER JOIN Employees M
ON E.EmpID = M.ManagerID;
```


