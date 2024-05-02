package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShixichengjiDao;
import com.entity.ShixichengjiEntity;
import com.service.ShixichengjiService;
import com.entity.vo.ShixichengjiVO;
import com.entity.view.ShixichengjiView;

@Service("shixichengjiService")
public class ShixichengjiServiceImpl extends ServiceImpl<ShixichengjiDao, ShixichengjiEntity> implements ShixichengjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShixichengjiEntity> page = this.selectPage(
                new Query<ShixichengjiEntity>(params).getPage(),
                new EntityWrapper<ShixichengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShixichengjiEntity> wrapper) {
		  Page<ShixichengjiView> page =new Query<ShixichengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShixichengjiVO> selectListVO(Wrapper<ShixichengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShixichengjiVO selectVO(Wrapper<ShixichengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShixichengjiView> selectListView(Wrapper<ShixichengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShixichengjiView selectView(Wrapper<ShixichengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
