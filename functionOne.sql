drop function if exists fun1;
delimiter $
create function fun1(value int) returns int
deterministic
BEGIN
    return value*value;
END $
delimiter ;