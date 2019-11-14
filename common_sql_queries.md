table name - Employees

| EmpId | EmpName | DOJ | City |Salary | ManagerId |
|----|------|-----|--------| -----| ---- |
| 1  | Davolio Nancy | 1968-12-04 | Vancouver | 100000 | 2 |
| 2  | Fuller Margaret | 1978-05-06 | Seattle | 200000 | 2  |
| 3  | Leverling Nancy | 1988-02-01 | Singapore | 300000 | 4 |
| 4  | Peacock Jenny | 1999-04-03 | Bangalore | 400000 | 3 |
| 5  | Buchanan Pam | 1987-04-04 | Seattle | 250000 | 2 |


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

6. Group by same joining month 

```
SELECT strftime("%m", DOJ), EmpName from Employess group by strftime("%m", DOJ)

```

7. Count employees joined per month

```
SELECT strftime("%m", DOJ), count(*) from Employess group by strftime("%m", DOJ)

```

8. Count employees joined per month more than 2

```
SELECT strftime("%m", DOJ), count(*) AS count from Employess group by strftime("%m", DOJ) having count > 2 order by count DESC

```


