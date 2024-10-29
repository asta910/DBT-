drop procedure if exists proc1;
delimiter $
create procedure proc1(IN value int,out ans int,inout value2 int)
BEGIN
    set ans = value + value2;
    set value2 = value * value2;
END $
delimiter ;

