# Write your MySQL query statement below

DELETE FROM PERSON WHERE ID IN 
(
  -- delete문에서 서브쿼리를 사용할 경우 
  -- 표준SQL상 구문은 이상이 없는데, MySQL에서 You can't specify target table 'xxx' for update in FROM clause 에러가 발생한다.
  -- 이는 MySQL의 특징으로 데이터를 추가나 갱신할 경우 동일한 테이블로 서브쿼리를 사용할 수 없도록 되어 있기 때문
  -- Oracle이나 Postgresql에서는 문제 없이 실행된다.
  SELECT A.ID FROM (SELECT P1.ID FROM PERSON P1 INNER JOIN PERSON P2 ON P1.EMAIL = P2.EMAIL AND P1.ID > P2.ID) A
);