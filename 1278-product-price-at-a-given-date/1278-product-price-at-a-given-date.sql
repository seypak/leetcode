# Write your MySQL query statement below
SELECT
  PRODUCT_ID
  , NEW_PRICE AS price
FROM
(
  SELECT
  PRODUCT_ID 
  , NEW_PRICE
FROM PRODUCTS
WHERE (PRODUCT_ID, CHANGE_DATE)
IN (
  SELECT PRODUCT_ID, MAX(CHANGE_DATE)
  FROM PRODUCTS
  WHERE CHANGE_DATE <= '2019.08.16'
  GROUP BY PRODUCT_ID
)
UNION ALL
SELECT
  product_id
  , 10 AS NEW_PRICE
FROM PRODUCTS
WHERE (PRODUCT_ID, CHANGE_DATE)
NOT IN (
  SELECT PRODUCT_ID, MAX(CHANGE_DATE)
  FROM PRODUCTS
  WHERE CHANGE_DATE <= '2019.08.16'
  GROUP BY PRODUCT_ID
)
AND CHANGE_DATE > '2019.08.16'
) A
GROUP BY A.PRODUCT_ID
