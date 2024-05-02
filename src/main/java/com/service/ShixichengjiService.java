package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShixichengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShixichengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShixichengjiView;


/**
 * 实习成绩
 *
 * @author 
 * @email 
 * @date 2021-05-15 10:18:47
 */
public interface ShixichengjiService extends IService<ShixichengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShixichengjiVO> selectListVO(Wrapper<ShixichengjiEntity> wrapper);
   	
   	ShixichengjiVO selectVO(@Param("ew") Wrapper<ShixichengjiEntity> wrapper);
   	
   	List<ShixichengjiView> selectListView(Wrapper<ShixichengjiEntity> wrapper);
   	
   	ShixichengjiView selectView(@Param("ew") Wrapper<ShixichengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShixichengjiEntity> wrapper);
   	
}

