# Write your MySQL query statement below

SELECT
  DATE_FORMAT(TRANS_DATE, '%Y-%m') AS month
  , country
  , COUNT(DATE_FORMAT(TRANS_DATE, '%Y-%m')) AS trans_count
  , SUM(IF(STATE = 'approved', 1, 0)) AS approved_count
  , SUM(AMOUNT) AS trans_total_amount
  , SUM(IF(STATE = 'approved', amount, 0)) AS approved_total_amount
FROM TRANSACTIONS
GROUP BY month, country;