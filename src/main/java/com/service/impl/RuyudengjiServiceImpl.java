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


import com.dao.RuyudengjiDao;
import com.entity.RuyudengjiEntity;
import com.service.RuyudengjiService;
import com.entity.vo.RuyudengjiVO;
import com.entity.view.RuyudengjiView;

@Service("ruyudengjiService")
public class RuyudengjiServiceImpl extends ServiceImpl<RuyudengjiDao, RuyudengjiEntity> implements RuyudengjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RuyudengjiEntity> page = this.selectPage(
                new Query<RuyudengjiEntity>(params).getPage(),
                new EntityWrapper<RuyudengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RuyudengjiEntity> wrapper) {
		  Page<RuyudengjiView> page =new Query<RuyudengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RuyudengjiVO> selectListVO(Wrapper<RuyudengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RuyudengjiVO selectVO(Wrapper<RuyudengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RuyudengjiView> selectListView(Wrapper<RuyudengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RuyudengjiView selectView(Wrapper<RuyudengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
