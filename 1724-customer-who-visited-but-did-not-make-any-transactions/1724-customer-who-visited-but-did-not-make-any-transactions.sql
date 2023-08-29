# Write your MySQL query statement below

-- 1. VISITS 테이블의 VISIT_ID가 TRANSACTIONS 테이블에 있는지 체크한다.
-- 2. 있는건 카운트를 제외하고, 없는걸 카운팅한다.

SELECT 
V.CUSTOMER_ID AS customer_id
, COUNT(V.CUSTOMER_ID) AS count_no_trans
 FROM VISITS V 
WHERE NOT EXISTS(SELECT 1 FROM TRANSACTIONS T WHERE T.VISIT_ID=V.VISIT_ID)
GROUP BY CUSTOMER_ID
ORDER BY count_no_trans DESC