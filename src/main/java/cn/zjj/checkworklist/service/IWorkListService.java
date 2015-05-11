package cn.zjj.checkworklist.service;

import java.util.List;
import java.util.Map;

import cn.zjj.checkworklist.dto.WorkListDto;

public interface IWorkListService {
	/**
	 * 根据任务id,质检员任务序号,质检员人数,是否成功，通话时长类型返回待检工单
	 * @param Task_ID,Remainder,checker_num,Is_Success,Duration_Type
	 * @return
	 */
	public List<WorkListDto> getUncheckWorkList(Map<String,Object> params);

}
