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


import com.dao.ShixishenqingDao;
import com.entity.ShixishenqingEntity;
import com.service.ShixishenqingService;
import com.entity.vo.ShixishenqingVO;
import com.entity.view.ShixishenqingView;

@Service("shixishenqingService")
public class ShixishenqingServiceImpl extends ServiceImpl<ShixishenqingDao, ShixishenqingEntity> implements ShixishenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShixishenqingEntity> page = this.selectPage(
                new Query<ShixishenqingEntity>(params).getPage(),
                new EntityWrapper<ShixishenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShixishenqingEntity> wrapper) {
		  Page<ShixishenqingView> page =new Query<ShixishenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShixishenqingVO> selectListVO(Wrapper<ShixishenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShixishenqingVO selectVO(Wrapper<ShixishenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShixishenqingView> selectListView(Wrapper<ShixishenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShixishenqingView selectView(Wrapper<ShixishenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
