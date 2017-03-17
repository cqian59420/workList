package self.terrance.service;

import org.jooq.*;
import org.jooq.impl.DSL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import self.terrance.entity.WorkItem;
import spark.ModelAndView;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.HashMap;

import static org.jooq.impl.DSL.table;
import static spark.Spark.*;

/**
 * Created by cq on 2017/3/16.
 */
public class WorkService {

    private static Logger logger = LoggerFactory.getLogger(WorkService.class);

    static DSLContext dslConction=null;

    public static void main(String[] args) throws Exception {
        getDbConnection();
        get("/", (req, resp) -> "Hello World1!");
        get("/dashboard", (req, resp) -> {

            return new ModelAndView(new HashMap(), "index.html");
        });
        get("/works", (req, resp) -> "跳转至我的任务页面!");
        get("/works2", (req, resp) -> {
            Result<Record1<Integer>> workItems = dslConction.selectCount().from(table("workItems")).fetch();

            Result<Record> workItems1 = dslConction.select().from(table("workItems")).fetch();
            logger.debug("{1}", workItems1);
            return workItems1;
        });
    }

/*
    private static Object saveItem() {
        WorkItem workItem = new WorkItem();

        Result<Record1<Integer>> workItems = dslConction.selectCount().from(table("workItems")).fetch();
        return null;
    }
*/


    static void getDbConnection() throws Exception {
        String url = "jdbc:h2:~/worklist";
        String user = "sa";
        String password = "";
        Connection connection = DriverManager.getConnection(url, user, password);
        dslConction = DSL.using(connection);

    }


}
