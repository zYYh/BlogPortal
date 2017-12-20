package utils;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * MyBaties v1.20以上版本更改了SqlSession注入规则，手动set
 * @author YH
 *
 */
public class SqlSessionCommDao extends SqlSessionDaoSupport{
	 	@Resource
	    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
	        super.setSqlSessionFactory(sqlSessionFactory);
	    }
}
