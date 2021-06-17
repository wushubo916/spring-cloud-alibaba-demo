package com.demo.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringRedisApplication.class, args);
    }

    /**
     * ִ��sql�ű��ļ� ʹ��Spring������
     */
    public void runSqlBySpringUtils() throws Exception {
        try {
            SqlSession sqlSession = sqlSessionFactory.openSession();
            Connection conn = sqlSession.getConnection();
            ClassPathResource rc = new ClassPathResource("�ű�.Sql", RunSqlDao.class);
            EncodedResource er = new EncodedResource(rc, "utf-8");
            ScriptUtils.executeSqlScript(conn, er);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
