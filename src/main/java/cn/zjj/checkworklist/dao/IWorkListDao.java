package cn.zjj.checkworklist.dao;

import java.util.List;
import java.util.Map;

public interface IWorkListDao<WorkListDto> extends IBaseDao<WorkListDto,Long>{
	List<WorkListDto> selectUncheckWorkList(Map<String, Object> params);
}
