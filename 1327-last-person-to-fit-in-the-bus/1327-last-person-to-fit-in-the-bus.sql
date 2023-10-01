# Write your MySQL query statement below

# WITH CTE AS (
#     SELECT 
#         turn, person_name, weight,
#         SUM(weight) OVER(ORDER BY turn ASC) AS tot_weight 
#     FROM Queue
#     ORDER BY turn
# )

SELECT person_name
FROM Queue q
WHERE q.turn 
= (SELECT MAX(turn) 
FROM (
  SELECT Q.*, (SELECT SUM(WEIGHT) FROM QUEUE WHERE TURN <= Q.TURN) AS TOT_WEIGHT FROM QUEUE Q
) A 
WHERE A.tot_weight <= 1000);