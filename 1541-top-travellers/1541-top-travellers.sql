# Write your MySQL query statement below

SELECT
    U.NAME AS name     
    , SUM(IFNULL(R.DISTANCE, 0)) AS travelled_distance
FROM RIDES R RIGHT OUTER JOIN USERS U ON R.USER_ID = U.ID
GROUP BY R.USER_ID
ORDER BY travelled_distance DESC, name