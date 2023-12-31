# Write your MySQL query statement below

SELECT
 A1.MACHINE_ID AS machine_id
 , ROUND(AVG(A1.TIMESTAMP-A2.TIMESTAMP), 3) AS processing_time
FROM ACTIVITY A1 INNER JOIN ACTIVITY A2 ON A1.MACHINE_ID = A2.MACHINE_ID
WHERE A1.PROCESS_ID = A2.PROCESS_ID
AND A1.ACTIVITY_TYPE = 'end'
AND A2.ACTIVITY_TYPE = 'start'
GROUP BY machine_id