# Write your MySQL query statement below

SELECT
  A.ACTIVITY_DATE AS day
  , COUNT(A.USER_ID) AS active_users
FROM
(
  SELECT
  user_id
  , activity_date
FROM
ACTIVITY
WHERE ACTIVITY_DATE BETWEEN date_add('2019-07-28', interval -30 DAY) AND date_format('2019-07-27', '%Y-%m-%d')
GROUP BY USER_ID, ACTIVITY_DATE
) A
GROUP BY A.ACTIVITY_DATE
ORDER BY DAY