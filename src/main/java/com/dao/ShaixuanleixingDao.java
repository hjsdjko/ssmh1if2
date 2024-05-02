package com.dao;

import com.entity.ShaixuanleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShaixuanleixingVO;
import com.entity.view.ShaixuanleixingView;


/**
 * 筛选类型
 * 
 * @author 
 * @email 
 * @date 2021-05-07 15:52:14
 */
public interface ShaixuanleixingDao extends BaseMapper<ShaixuanleixingEntity> {
	
	List<ShaixuanleixingVO> selectListVO(@Param("ew") Wrapper<ShaixuanleixingEntity> wrapper);
	
	ShaixuanleixingVO selectVO(@Param("ew") Wrapper<ShaixuanleixingEntity> wrapper);
	
	List<ShaixuanleixingView> selectListView(@Param("ew") Wrapper<ShaixuanleixingEntity> wrapper);

	List<ShaixuanleixingView> selectListView(Pagination page,@Param("ew") Wrapper<ShaixuanleixingEntity> wrapper);
	
	ShaixuanleixingView selectView(@Param("ew") Wrapper<ShaixuanleixingEntity> wrapper);
	
}
