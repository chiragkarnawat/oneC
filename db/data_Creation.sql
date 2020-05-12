CREATE MULTISET TABLE L_EWW_POC_DM.event_details ,FALLBACK ,
     NO BEFORE JOURNAL,
     NO AFTER JOURNAL,
     CHECKSUM = DEFAULT,
     DEFAULT MERGEBLOCKRATIO,
     MAP = TD_MAP1
     (
id int,
event_name varchar(10),
people_count int
); 


insert into event_details values(1,'event1',99);
insert into event_details values(2,'event2',191);
insert into event_details values(3,'event3',200);
insert into event_details values(4,'evnet4',500);
insert into event_details values(5,'event5',47);
insert into event_details values(6,'event6',55);
insert into event_details values(7,'event7',88);
insert into event_details values(8,'event8',999);
insert into event_details values(9,'event9',111);
insert into event_details values(10,'event10',10);
insert into event_details values(11,'event11',100);
insert into event_details values(12,'event12',200);
insert into event_details values(13,'event13',300);
insert into event_details values(14,'event14',400);
insert into event_details values(15,'event15',444);
insert into event_details values(16,'event16',99);
insert into event_details values(17,'event17',99);
insert into event_details values(18,'event18',99);
insert into event_details values(19,'event19',10);
insert into event_details values(20,'event20',100);
insert into event_details values(21,'event21',100);
insert into event_details values(22,'event22',111);
insert into event_details values(23,'event23',121);
insert into event_details values(24,'event24',100);
insert into event_details values(25,'event25',100);
