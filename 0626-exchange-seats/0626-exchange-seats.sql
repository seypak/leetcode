# Write your MySQL query statement below

SELECT
  CASE
    WHEN ID % 2 != 0 AND ID = (SELECT COUNT(*) FROM SEAT) THEN ID
    WHEN ID % 2 != 0 THEN ID+1
    WHEN ID % 2 = 0 THEN ID-1
  END AS ID
  , STUDENT
FROM SEAT
ORDER BY ID