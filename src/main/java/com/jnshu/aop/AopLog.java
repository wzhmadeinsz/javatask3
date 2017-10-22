package com.jnshu.aop;
import org.apache.log4j.Logger;

public class AopLog {
    private static org.apache.log4j.Logger log = Logger.getLogger(AopLog.class);

    public void beforeSqlact(){
        System.out.println("---------------------------------开始网页运作---------------------------------"+"\n\n\n\n\n");
        log.info("准备进行数据库操作");
    }

    public void afterSqlintsert(){
        System.out.println("------------------------插入结束----------------------------------");
        log.info("数据插入成功");
    }

    public void afterSqldelete(){
        System.out.println("------------------------删除结束----------------------------------");
        log.info("数据删除成功");
    }

    public void afterSqlupdate(){
        System.out.println("------------------------更新结束----------------------------------");
        log.info("数据更新成功");
    }

    public void afterSqlfind(){
        System.out.println("------------------------查找人结束----------------------------------");
        log.info("查找人结束");
    }




}
