# Write your MySQL query statement below

SELECT 'High Salary' AS category, COUNT(*) AS accounts_count FROM Accounts WHERE INCOME > 50000
UNION ALL
SELECT 'Low Salary' AS category, COUNT(*) AS accounts_count FROM Accounts WHERE INCOME < 20000
UNION ALL
SELECT 'Average Salary' AS category, COUNT(*) AS accounts_count FROM Accounts WHERE INCOME >= 20000 AND INCOME <= 50000