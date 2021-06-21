package com.q.Utlils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName mybatisUtils
 * @Author 小林
 * @Date 2021/3/2 23:08
 * 这是一个工具类，就是建立工厂，然后getSqlSession得到实例，也就是得到一个顾客，顾客可以实现sql语句
 **/
public class mybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;


    static {
        try {
            //第一步
//    获取sqlSessionFactory对象 使用mybatis第一步
            String resource = "mybatis-config.xml";
            InputStream inputStream;
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //
//    从 SqlSessionFactory 中获取 SqlSession
//    既然有了 SqlSessionFactory，顾名思义，我们可以从中获得 SqlSession 的实例。
//    SqlSession 提供了在数据库执行 SQL 命令所需的所有方法。你可以通过 SqlSession 实例来直接执行已映射的 SQL 语句。例如：
//
    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession(true);

    }
}
