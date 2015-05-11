package cn.zjj.checkworklist.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.zjj.checkworklist.dto.WorkListDto;
import cn.zjj.checkworklist.service.IWorkListService;

@Controller
@RequestMapping("/workList")
public class workListController {
	@Resource
	private IWorkListService workListService;
	
	@RequestMapping("/getUnchecked")
	@ResponseBody
	public Map<String,Object> getUncheckWorkList(
			@RequestParam("Task_ID") String Task_ID,
			@RequestParam("Remainder") String Remainder,
			@RequestParam("Checker_num") int Checker_num,
			@RequestParam("Is_Success") int Is_Success,
			@RequestParam("Duration_Type") int Duration_Type)
	{
		Map<String,Object> params = new HashMap<String,Object>();
		params.put("Task_ID", Task_ID);
		params.put("Remainder", Remainder);
		params.put("Checker_num", Checker_num);
		params.put("Is_Success", Is_Success);
		params.put("Duration_Type", Duration_Type);
		List<WorkListDto> workListDto = workListService.getUncheckWorkList(params);
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("workListDto", workListDto);
		return map;
	}
	
}
