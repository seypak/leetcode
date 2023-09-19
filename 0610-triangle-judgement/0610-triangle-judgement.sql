# Write your MySQL query statement below
SELECT
  A.X
  , A.Y
  , A.Z
  , IF((A.SUM-A.MAX) > A.MAX , 'Yes', 'No') AS TRIANGLE
FROM
(
  SELECT 
  X
  , Y
  , Z
  , (X+Y+Z) AS SUM
  , IF(IF(X > Y, X, Y) > Z, IF(X > Y, X, Y) , Z) AS MAX
  FROM TRIANGLE
) A
