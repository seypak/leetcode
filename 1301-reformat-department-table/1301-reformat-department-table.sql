# Write your MySQL query statement below

SELECT
    ID
    , SUM(CASE WHEN MONTH = 'Jan' THEN REVENUE ELSE NULL END) AS Jan_Revenue
    , SUM(CASE WHEN MONTH = 'Feb' THEN REVENUE ELSE NULL END) AS Feb_Revenue
    , SUM(CASE WHEN MONTH = 'Mar' THEN REVENUE ELSE NULL END) AS Mar_Revenue
    , SUM(CASE WHEN MONTH = 'Apr' THEN REVENUE ELSE NULL END) AS Apr_Revenue
    , SUM(CASE WHEN MONTH = 'May' THEN REVENUE ELSE NULL END) AS May_Revenue
    , SUM(CASE WHEN MONTH = 'Jun' THEN REVENUE ELSE NULL END) AS Jun_Revenue
    , SUM(CASE WHEN MONTH = 'Jul' THEN REVENUE ELSE NULL END) AS Jul_Revenue
    , SUM(CASE WHEN MONTH = 'Aug' THEN REVENUE ELSE NULL END) AS Aug_Revenue
    , SUM(CASE WHEN MONTH = 'Sep' THEN REVENUE ELSE NULL END) AS Sep_Revenue
    , SUM(CASE WHEN MONTH = 'Oct' THEN REVENUE ELSE NULL END) AS Oct_Revenue
    , SUM(CASE WHEN MONTH = 'Nov' THEN REVENUE ELSE NULL END) AS Nov_Revenue
    , SUM(CASE WHEN MONTH = 'Dec' THEN REVENUE ELSE NULL END) AS Dec_Revenue
FROM DEPARTMENT
GROUP BY ID