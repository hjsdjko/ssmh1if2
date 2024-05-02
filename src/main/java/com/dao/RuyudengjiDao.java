package com.dao;

import com.entity.RuyudengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RuyudengjiVO;
import com.entity.view.RuyudengjiView;


/**
 * 入狱登记
 * 
 * @author 
 * @email 
 * @date 2021-05-07 15:52:14
 */
public interface RuyudengjiDao extends BaseMapper<RuyudengjiEntity> {
	
	List<RuyudengjiVO> selectListVO(@Param("ew") Wrapper<RuyudengjiEntity> wrapper);
	
	RuyudengjiVO selectVO(@Param("ew") Wrapper<RuyudengjiEntity> wrapper);
	
	List<RuyudengjiView> selectListView(@Param("ew") Wrapper<RuyudengjiEntity> wrapper);

	List<RuyudengjiView> selectListView(Pagination page,@Param("ew") Wrapper<RuyudengjiEntity> wrapper);
	
	RuyudengjiView selectView(@Param("ew") Wrapper<RuyudengjiEntity> wrapper);
	
}
