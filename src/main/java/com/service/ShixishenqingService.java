package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShixishenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShixishenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShixishenqingView;


/**
 * 实习申请
 *
 * @author 
 * @email 
 * @date 2021-05-15 10:18:47
 */
public interface ShixishenqingService extends IService<ShixishenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShixishenqingVO> selectListVO(Wrapper<ShixishenqingEntity> wrapper);
   	
   	ShixishenqingVO selectVO(@Param("ew") Wrapper<ShixishenqingEntity> wrapper);
   	
   	List<ShixishenqingView> selectListView(Wrapper<ShixishenqingEntity> wrapper);
   	
   	ShixishenqingView selectView(@Param("ew") Wrapper<ShixishenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShixishenqingEntity> wrapper);
   	
}

