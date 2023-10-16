# Write your MySQL query statement below

SELECT
    ROUND(SUM(TIV_2016), 2) AS tiv_2016
FROM INSURANCE
WHERE TIV_2015 IN
(
    SELECT TIV_2015 FROM INSURANCE GROUP BY TIV_2015 HAVING COUNT(*) > 1
)
AND (LAT, LON) IN
(
    SELECT LAT, LON FROM INSURANCE GROUP BY LAT, LON HAVING COUNT(*) = 1
)