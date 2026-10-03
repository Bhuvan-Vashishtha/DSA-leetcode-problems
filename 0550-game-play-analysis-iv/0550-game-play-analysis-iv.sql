# Write your MySQL query statement below
SELECT ROUND(COUNT(DISTINCT T.player_id)/COUNT(DISTINCT a.player_id),2) AS fraction
FROM Activity a
LEFT JOIN 
(SELECT player_id, MIN(event_date) AS FLD
FROM Activity
GROUP BY player_id) T
ON a.player_id = T.player_id
AND DATEDIFF(a.event_date, T.FLD) = 1;