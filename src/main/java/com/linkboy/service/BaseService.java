package com.linkboy.service;

import com.linkboy.util.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

public class BaseService<T> {
   private SqlSession sqlSession;
   public SqlSession getSqlSession(){
       if(sqlSession==null){
          sqlSession=MyBatisUtils.getSqlSession();
       }
       return sqlSession;
   }
   public T getDao(Class<T> clazz){
       return getSqlSession().getMapper(clazz);
   }
   public void closeSqlsession(){
       if(sqlSession!=null){
           sqlSession.close();
       }
   }
}
