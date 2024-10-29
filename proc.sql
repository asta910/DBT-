DROP PROCEDURE IF EXISTS proc_simple_cursor;
DELIMITER $ 

CREATE PROCEDURE proc_simple_cursor(IN _dname VARCHAR(20))
BEGIN 
    DECLARE _deptNo INT;
    DECLARE _loc VARCHAR(20);
    DECLARE done BOOLEAN DEFAULT FALSE;

    -- Declare the cursor
    DECLARE c1 CURSOR FOR 
        SELECT DEPTNO, LOC 
        FROM dept 
        WHERE DNAME = _dname;

    -- Declare a handler for when there are no more rows to fetch
    DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE;

    -- Open the cursor
    OPEN c1;

    -- Loop through the cursor
    read_loop: LOOP
        FETCH c1 INTO _deptNo, _loc;

        IF done THEN
            LEAVE read_loop;
        END IF;

        -- Display the fetched data
        SELECT _deptNo AS Department_Number, _loc AS Location;
    END LOOP;

    -- Close the cursor
    CLOSE c1;
END $ 

DELIMITER ;
