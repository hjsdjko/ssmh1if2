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


import com.dao.ShaixuanleixingDao;
import com.entity.ShaixuanleixingEntity;
import com.service.ShaixuanleixingService;
import com.entity.vo.ShaixuanleixingVO;
import com.entity.view.ShaixuanleixingView;

@Service("shaixuanleixingService")
public class ShaixuanleixingServiceImpl extends ServiceImpl<ShaixuanleixingDao, ShaixuanleixingEntity> implements ShaixuanleixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShaixuanleixingEntity> page = this.selectPage(
                new Query<ShaixuanleixingEntity>(params).getPage(),
                new EntityWrapper<ShaixuanleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShaixuanleixingEntity> wrapper) {
		  Page<ShaixuanleixingView> page =new Query<ShaixuanleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShaixuanleixingVO> selectListVO(Wrapper<ShaixuanleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShaixuanleixingVO selectVO(Wrapper<ShaixuanleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShaixuanleixingView> selectListView(Wrapper<ShaixuanleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShaixuanleixingView selectView(Wrapper<ShaixuanleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
