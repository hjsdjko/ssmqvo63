package com.dao;

import com.entity.ShixichengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShixichengjiVO;
import com.entity.view.ShixichengjiView;


/**
 * 实习成绩
 * 
 * @author 
 * @email 
 * @date 2021-05-15 10:18:47
 */
public interface ShixichengjiDao extends BaseMapper<ShixichengjiEntity> {
	
	List<ShixichengjiVO> selectListVO(@Param("ew") Wrapper<ShixichengjiEntity> wrapper);
	
	ShixichengjiVO selectVO(@Param("ew") Wrapper<ShixichengjiEntity> wrapper);
	
	List<ShixichengjiView> selectListView(@Param("ew") Wrapper<ShixichengjiEntity> wrapper);

	List<ShixichengjiView> selectListView(Pagination page,@Param("ew") Wrapper<ShixichengjiEntity> wrapper);
	
	ShixichengjiView selectView(@Param("ew") Wrapper<ShixichengjiEntity> wrapper);
	
}
