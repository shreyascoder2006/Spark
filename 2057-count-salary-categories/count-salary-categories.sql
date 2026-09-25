# Write your MySQL query statement below

    Select "Low Salary" as Category,Count(*) as accounts_count 
    from Accounts
    where income <  20000

    UNION 

   
    Select "Average Salary" as Category,Count(*) as accounts_count
    from Accounts
    where income BETWEEN 20000 AND 50000

    UNION


    Select "High Salary" as Category,Count(*) as accounts_count
    from Accounts
    where income > 50000