# Write your MySQL query statement below

SELECT MAX(A.NUM) AS NUM
FROM 
(
    SELECT
        NUM
    FROM MYNUMBERS
    GROUP BY NUM
    HAVING COUNT(NUM) = 1
) A
