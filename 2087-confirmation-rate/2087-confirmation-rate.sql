# Write your MySQL query statement below



SELECT 
  S.USER_ID AS user_id
  , ROUND(AVG(IF(C.ACTION = 'confirmed', 1, 0)), 2) AS confirmation_rate
FROM SIGNUPS S 
LEFT OUTER JOIN CONFIRMATIONS C ON S.USER_ID = C.USER_ID
GROUP BY S.USER_ID
