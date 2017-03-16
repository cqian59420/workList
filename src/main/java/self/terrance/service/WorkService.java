package self.terrance.service;

import org.jooq.*;
import org.jooq.impl.DSL;
import self.terrance.entity.WorkItem;

import java.sql.Connection;
import java.sql.DriverManager;

import static spark.Spark.*;

/**
 * Created by cq on 2017/3/16.
 */
public class WorkService {

    static DSLContext dslConction=null;

    public static void main(String[] args) throws Exception {
        getDbConnection();
        get("/", (req, resp) -> "Hello World!");
        get("/works", (req, resp) -> "跳转至我的任务页面!");
    }


    static void getDbConnection() throws Exception {
        String url = "jdbc:h2:~/worklist";
        String user = "sa";
        String password = "";
        Connection connection = DriverManager.getConnection(url, user, password);
        dslConction = DSL.using(connection);

    }


}
