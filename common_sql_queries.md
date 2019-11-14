
Unfortunately these questions are still asked as of 2019. Which does not check other than SQL grammar.

table name - employees

| empId | name | doj | city |salary |
|----|------|-----|--------| -----|
| 1  | Davolio Nancy | 1968-12-04 | Vancouver | 100000 |
| 2  | Fuller Margaret | 1978-05-06 | Seattle | 200000 |
| 3  | Leverling Nancy | 1988-02-01 | Singapore | 300000 |
| 4  | Peacock Jenny | 1999-06-03 | Bangalore | 400000 |
| 5  | Buchanan Pam | 1987-12-01 | Seattle | 250000 |


table name - department

| depId | name  |
|----|------|
| 1  | HR | 
| 2  | Finanace |
| 3  | Medical | 
| 4  | HR | 
| 5  | Finanace|


table name - emp_to_dept

| empId | depId  |
|----|------|
| 1  | 1 | 
| 2  | 2 |
| 3  | 3 | 
| 4  | 2 | 
| 5  | 1|



1. Count employees per department 

```
select e.name, d.name,  count(*) from employees e  
join department d  on d.empId = e.empId
join emp_to_dept etd etd.depId = d.depId
group by d.name 

 
```

2. Find Nth Highest salary
```
SELECT salary
FROM employees emp1
WHERE N-1 = (
                SELECT COUNT( DISTINCT ( emp2.Salary ) )
                FROM employees emp2
                WHERE emp2.salary > emp1.salary
```

3.

