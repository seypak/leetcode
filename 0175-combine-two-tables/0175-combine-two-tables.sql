# Write your MySQL query statement below

SELECT 
  P.FIRSTNAME AS firstName
  , P.LASTNAME as lastName
  , A.CITY as city
  , A.STATE  as state
FROM PERSON P 
LEFT OUTER JOIN ADDRESS A 
ON P.PERSONID = A.PERSONID
