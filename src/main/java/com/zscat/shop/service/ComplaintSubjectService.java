package com.zscat.shop.service; import com.zscat.common.utils.PageUtils;

import com.zscat.shop.domain.ComplaintSubjectDO;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:36
 */
public interface ComplaintSubjectService {
	
	ComplaintSubjectDO get(Long id);
	
	List<ComplaintSubjectDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ComplaintSubjectDO complaintSubject);
	
	int update(ComplaintSubjectDO complaintSubject);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);

	ComplaintSubjectDO selectOne(Map<String, Object> params);

    PageUtils listPage(Map<String, Object> map);
}
