


--lover (id integer not null, version integer, age integer not null, city varchar(255), eyeColor varchar(255),
    --  gender varchar(255), height integer not null, name varchar(255), primary key (id))
DELETE FROM lover;
INSERT INTO lover (id,version,age,city,eyeColor,gender,height,name) VALUES (1,0,32,'porto','blue','male',180,'Rodrigo'),
                                                    (2,0,24,'lisboa','blue','female',180,'Rodriga');




--rating (id integer not null, version integer, type varchar(255), dating_id integer, primary key (id))
--DELETE FROM rating;
--INSERT INTO rating (id,version,type,dating_id) VALUES (1,0,'Eye contact'),
--(2,0,'Fakeball'),
--(3,0,'one more type');


--evaluator (id integer not null, version integer, name varchar(255), primary key (id))
--DELETE FROM evaluator;
--INSERT INTO evaluator (id,version,name) VALUES (1,0,'Ze'),
--(2,0,'Quim');


--dating (id integer not null, version integer, score integer not null,
  --  evaluator_id integer, lover_id integer, rating_id integer, primary key (id))
--DELETE FROM dating;
--INSERT INTO dating (id,version,score,evaluator_id,lover_id,rating_id)
                --VALUES (1,0,3,1,1,1);


INSERT INTO lover (id,version,age,city,eyeColor,gender,height,image,name)
VALUES (1,0,32,'porto','blue','male',180,'https://randomuser.me/api/portraits/men/5.jpg','Rodrigo'),
       (2,0,24,'lisboa','blue','female',180,'https://randomuser.me/api/portraits/men/82.jpg','Rodriga');

INSERT INTO profile (id,version,age,city, commitment,eyeColor,eyeContact,gender,height,ignored,image,mobileUsage,name,respectful,viewsNumber)
VALUES (99,0,32,'porto',4,'blue',3,'male',180,3,'https://randomuser.me/api/portraits/men/4.jpg',5,'António Castro',1,945);