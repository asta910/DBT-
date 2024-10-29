drop procedure if exists proc1;
delimiter $
create procedure proc1(IN _tableName varchar(240))
BEGIN
    declare x varchar(255);

    set @query = concat('insert into ', _tableName , ' (message, Current) values("My First PL/SQL program",now())');

    prepare x from @query;
    execute x;

    
END $
delimiter ;