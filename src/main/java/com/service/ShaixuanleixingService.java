package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShaixuanleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShaixuanleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShaixuanleixingView;


/**
 * 筛选类型
 *
 * @author 
 * @email 
 * @date 2021-05-07 15:52:14
 */
public interface ShaixuanleixingService extends IService<ShaixuanleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShaixuanleixingVO> selectListVO(Wrapper<ShaixuanleixingEntity> wrapper);
   	
   	ShaixuanleixingVO selectVO(@Param("ew") Wrapper<ShaixuanleixingEntity> wrapper);
   	
   	List<ShaixuanleixingView> selectListView(Wrapper<ShaixuanleixingEntity> wrapper);
   	
   	ShaixuanleixingView selectView(@Param("ew") Wrapper<ShaixuanleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShaixuanleixingEntity> wrapper);
   	
}

