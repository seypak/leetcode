# Write your MySQL query statement below


SELECT 
    QUERY_NAME AS query_name
    , ROUND((SUM(RATING/POSITION))/COUNT(QUERY_NAME), 2) AS quality
    , ROUND((SUM(IF(RATING < 3, 1, 0))/COUNT(RATING))* 100, 2) AS poor_query_percentage
FROM QUERIES
GROUP BY QUERY_NAME