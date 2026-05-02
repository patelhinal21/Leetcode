# Write your MySQL query statement below
select query_name, round(avg(rating/position),2) as quality , 
round(sum(rating < 3)/COUNT(*) * 100,2)as poor_query_percentage from Queries
group by query_name 
