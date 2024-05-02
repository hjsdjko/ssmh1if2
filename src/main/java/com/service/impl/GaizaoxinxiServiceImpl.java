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


import com.dao.GaizaoxinxiDao;
import com.entity.GaizaoxinxiEntity;
import com.service.GaizaoxinxiService;
import com.entity.vo.GaizaoxinxiVO;
import com.entity.view.GaizaoxinxiView;

@Service("gaizaoxinxiService")
public class GaizaoxinxiServiceImpl extends ServiceImpl<GaizaoxinxiDao, GaizaoxinxiEntity> implements GaizaoxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GaizaoxinxiEntity> page = this.selectPage(
                new Query<GaizaoxinxiEntity>(params).getPage(),
                new EntityWrapper<GaizaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GaizaoxinxiEntity> wrapper) {
		  Page<GaizaoxinxiView> page =new Query<GaizaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GaizaoxinxiVO> selectListVO(Wrapper<GaizaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GaizaoxinxiVO selectVO(Wrapper<GaizaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GaizaoxinxiView> selectListView(Wrapper<GaizaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GaizaoxinxiView selectView(Wrapper<GaizaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
