# Write your MySQL query statement below

DELETE FROM PERSON
WHERE ID NOT IN (
  SELECT A.ID FROM (SELECT MIN(ID) AS ID FROM PERSON GROUP BY EMAIL ORDER BY ID) A
)
