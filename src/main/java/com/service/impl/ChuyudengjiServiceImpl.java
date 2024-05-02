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


import com.dao.ChuyudengjiDao;
import com.entity.ChuyudengjiEntity;
import com.service.ChuyudengjiService;
import com.entity.vo.ChuyudengjiVO;
import com.entity.view.ChuyudengjiView;

@Service("chuyudengjiService")
public class ChuyudengjiServiceImpl extends ServiceImpl<ChuyudengjiDao, ChuyudengjiEntity> implements ChuyudengjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChuyudengjiEntity> page = this.selectPage(
                new Query<ChuyudengjiEntity>(params).getPage(),
                new EntityWrapper<ChuyudengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChuyudengjiEntity> wrapper) {
		  Page<ChuyudengjiView> page =new Query<ChuyudengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChuyudengjiVO> selectListVO(Wrapper<ChuyudengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChuyudengjiVO selectVO(Wrapper<ChuyudengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChuyudengjiView> selectListView(Wrapper<ChuyudengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChuyudengjiView selectView(Wrapper<ChuyudengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
