# Write your MySQL query statement below
SELECT 
PLAYER_ID AS player_id
, MIN(EVENT_DATE) AS first_login
FROM ACTIVITY
GROUP BY player_id