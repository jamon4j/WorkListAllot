package cn.zjj.checkworklist.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zjj.checkworklist.dao.IWorkListDao;
import cn.zjj.checkworklist.dto.WorkListDto;

@Service
public class WorkListService implements IWorkListService{
	@Autowired
	private IWorkListDao<WorkListDto> workListDao;
	
	public List<WorkListDto> getUncheckWorkList(Map<String,Object> params) {
		
		List<WorkListDto> uncheckWorkList = workListDao.selectUncheckWorkList(params);
		return uncheckWorkList;
	}
}
