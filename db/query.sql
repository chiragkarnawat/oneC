select * from (
select y.id ,y.event_name, y.people_count ,
 case when y.people_count >=100 and 
 y.Lead_people_count>=100 and
 y.Lead_people_count2 >=100 then 1 

 when y.lag_people_count >=100 and
y.lag_people_count2 >=100 and
 y.people_count>=100 then 1 
 when  y.people_count >=100 and 
 y.Lead_people_count>=100 and   y.lag_people_count >=100  then 1 else 0 end as ind 
 
from (
select z.id ,z.event_name, z.people_count , z.Lead_people_count ,
LEAD(z.Lead_people_count) over (ORDER BY z.id) AS Lead_people_count2 ,z.lag_people_count, lag(z.lag_people_count) over (ORDER BY z.id) AS lag_people_count2 from ( 
select event_name,id , people_count, LEAD(people_count) over (ORDER BY id) AS Lead_people_count , LAG(people_count) OVER  (ORDER BY id) AS lag_people_count   


from  L_EWW_POC_DM.event_details )z

) y ) x where x.ind =1
