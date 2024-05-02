package com.dao;

import com.entity.GaizaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GaizaoxinxiVO;
import com.entity.view.GaizaoxinxiView;


/**
 * 改造信息
 * 
 * @author 
 * @email 
 * @date 2021-05-07 15:52:14
 */
public interface GaizaoxinxiDao extends BaseMapper<GaizaoxinxiEntity> {
	
	List<GaizaoxinxiVO> selectListVO(@Param("ew") Wrapper<GaizaoxinxiEntity> wrapper);
	
	GaizaoxinxiVO selectVO(@Param("ew") Wrapper<GaizaoxinxiEntity> wrapper);
	
	List<GaizaoxinxiView> selectListView(@Param("ew") Wrapper<GaizaoxinxiEntity> wrapper);

	List<GaizaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GaizaoxinxiEntity> wrapper);
	
	GaizaoxinxiView selectView(@Param("ew") Wrapper<GaizaoxinxiEntity> wrapper);
	
}
