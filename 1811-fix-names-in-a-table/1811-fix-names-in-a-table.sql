# Write your MySQL query statement below

SELECT
  USER_ID as user_id
  , CONCAT(UPPER(LEFT(NAME, 1)), LOWER(RIGHT(NAME, LENGTH(NAME)-1))) AS name
FROM USERS
ORDER BY USER_ID