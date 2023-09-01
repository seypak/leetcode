# Write your MySQL query statement below

SELECT 
  NAME
FROM EMPLOYEE 
WHERE ID 
IN(
  SELECT 
    MANAGERID 
  FROM 
  (
    SELECT
      MANAGERID
      , COUNT(MANAGERID) AS count
    FROM EMPLOYEE
    GROUP BY MANAGERID
  ) A
  WHERE count >= 5
)
