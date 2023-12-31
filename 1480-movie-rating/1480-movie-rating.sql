# Write your MySQL query statement below

(
  SELECT
    U.NAME AS RESULTS
  FROM MOVIERATING M 
  INNER JOIN USERS U 
  ON M.USER_ID = U.USER_ID
  GROUP BY M.USER_ID
  ORDER BY COUNT(M.USER_ID) DESC, U.NAME LIMIT 1
)
UNION ALL
(
  SELECT
    MV.TITLE AS RESULTS
  FROM MOVIERATING MR
  INNER JOIN MOVIES MV
  ON MR.MOVIE_ID = MV.MOVIE_ID
  WHERE DATE_FORMAT(MR.CREATED_AT, '%Y-%m') = '2020-02'
  GROUP BY MV.MOVIE_ID
  ORDER BY AVG(MR.RATING) DESC, MV.TITLE LIMIT 1
)
