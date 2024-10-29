drop trigger if exists triggerOne
delimiter $ 
create trigger triggerOne before update on student for each row
BEGIN
    declare x varchar(20);
    set x = new.tblName;

    drop procedure if exists p1
    create procedure p1(in new.tblName varchar(20))
    BEGIN b1
        declare x varchar(300);
        set @query = concat('insert into ' new.tblName ,' values(new.ID,new.namefirst,new.namelast,new.dob,new.emailID)');
        
        prepare x from @query;
        execute x;
    end b1 
end $
delimiter ;


-- DROP TRIGGER IF EXISTS triggerOne;
-- DELIMITER $ 

-- CREATE TRIGGER triggerOne 
-- BEFORE UPDATE ON student 
-- FOR EACH ROW
-- BEGIN
--     DECLARE x VARCHAR(20);
--     SET x = NEW.tblName;

--     DROP PROCEDURE IF EXISTS p1;

--     CREATE PROCEDURE p1(IN newTblName VARCHAR(20))
--     BEGIN
--         DECLARE x VARCHAR(300);
--         SET @query = CONCAT('INSERT INTO ', newTblName, ' VALUES (NEW.ID, NEW.namefirst, NEW.namelast, NEW.dob, NEW.emailID)');
        
--         PREPARE x FROM @query;
--         EXECUTE x;
--     END;

--     CALL p1(x);
-- END $ 

-- DELIMITER ;
