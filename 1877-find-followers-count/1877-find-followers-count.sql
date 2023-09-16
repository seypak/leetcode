# Write your MySQL query statement below

SELECT
    USER_ID
    , COUNT(USER_ID) AS followers_count
FROM FOLLOWERS
GROUP BY USER_ID
ORDER BY USER_ID