package cn.zjj.checkworklist.dao;

import java.lang.reflect.ParameterizedType;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;

public abstract class BaseDao<T, PK> implements IBaseDao<T, PK> {
	@Resource
	protected SqlSession sqlSession;
	
	protected String nameSpace;
	
	{
        //由于泛型擦除规则，暂时只能以此方式获取，由于不能类型转换为Class<T>,只能取得simpleName。留待以后更好的解决办法（2013-08-15 ）
    	String t_name = ((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0].toString();   
        nameSpace = String.format("cn.zjj.checkworklist.dto.%s", t_name);
    }
	
	public void save(T t) {
		sqlSession.insert(String.format("%s.insert", nameSpace), t);
	}

	public void deleteById(PK pk) {
		sqlSession.delete(String.format("%s.deleteById", nameSpace), pk);
	}

	public T findById(PK pk) {
		return sqlSession.selectOne(String.format("%s.findById", nameSpace), pk);
	}

	public void updateAll(T t) {
		sqlSession.update(String.format("%s.updateAll", nameSpace), t);		
	}

}
