package com.dao;

import com.entity.ChuyudengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChuyudengjiVO;
import com.entity.view.ChuyudengjiView;


/**
 * 出狱登记
 * 
 * @author 
 * @email 
 * @date 2021-05-07 15:52:14
 */
public interface ChuyudengjiDao extends BaseMapper<ChuyudengjiEntity> {
	
	List<ChuyudengjiVO> selectListVO(@Param("ew") Wrapper<ChuyudengjiEntity> wrapper);
	
	ChuyudengjiVO selectVO(@Param("ew") Wrapper<ChuyudengjiEntity> wrapper);
	
	List<ChuyudengjiView> selectListView(@Param("ew") Wrapper<ChuyudengjiEntity> wrapper);

	List<ChuyudengjiView> selectListView(Pagination page,@Param("ew") Wrapper<ChuyudengjiEntity> wrapper);
	
	ChuyudengjiView selectView(@Param("ew") Wrapper<ChuyudengjiEntity> wrapper);
	
}
