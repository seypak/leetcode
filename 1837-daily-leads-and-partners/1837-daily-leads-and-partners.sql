# Write your MySQL query statement below

SELECT
    DATE_ID
    , MAKE_NAME
    , COUNT(DISTINCT LEAD_ID) AS unique_leads
    , COUNT(DISTINCT PARTNER_ID) AS unique_partners
FROM DAILYSALES
GROUP BY DATE_ID, MAKE_NAME