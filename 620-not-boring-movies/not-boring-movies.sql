# Write your MySQL query statement below
Select id,movie,description,rating from Cinema 
where id%2!=0 
AND description !="boring"
ORDER BY rating DESC