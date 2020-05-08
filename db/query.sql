select * from ( 
select case when y.event_name = y.next_event_id and y.next_event_id=y.next_event_id_2 then 1 else 0 end as ind,
y.event_name, y.next_event_id,y.next_event_id_2, y.people_count 
from (
select z.event_name , z.next_event_id, LEAD(z.event_name) over (ORDER BY z.id) AS next_event_id_2 ,z.people_count from ( 
select event_name ,  LEAD(event_name) over (ORDER BY id) AS next_event_id,people_count from test.test_table ) z
  )y )x where x.ind=1 and x.people_count>100;
  
