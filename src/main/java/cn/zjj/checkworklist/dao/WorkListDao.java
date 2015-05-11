package cn.zjj.checkworklist.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class WorkListDao<WorkListDto> extends BaseDao<WorkListDto,Long> implements IWorkListDao<WorkListDto> {

	public List<WorkListDto> selectUncheckWorkList(Map<String, Object> params) {
		return sqlSession.selectList(String.format("%s.selectUncheckWorkList", nameSpace), params);	
	}

}
