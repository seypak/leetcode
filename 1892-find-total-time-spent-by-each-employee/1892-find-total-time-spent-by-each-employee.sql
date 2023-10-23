# Write your MySQL query statement below

SELECT
    EVENT_DAY AS day
    , EMP_ID
    , SUM(OUT_TIME) - SUM(IN_TIME) AS total_time
FROM EMPLOYEES
GROUP BY EVENT_DAY, EMP_ID