-- 코드를 입력하세요
SELECT name from (
    select name from animal_ins order by datetime asc) 
    where rownum = 1;