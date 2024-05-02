package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GaizaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GaizaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GaizaoxinxiView;


/**
 * 改造信息
 *
 * @author 
 * @email 
 * @date 2021-05-07 15:52:14
 */
public interface GaizaoxinxiService extends IService<GaizaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GaizaoxinxiVO> selectListVO(Wrapper<GaizaoxinxiEntity> wrapper);
   	
   	GaizaoxinxiVO selectVO(@Param("ew") Wrapper<GaizaoxinxiEntity> wrapper);
   	
   	List<GaizaoxinxiView> selectListView(Wrapper<GaizaoxinxiEntity> wrapper);
   	
   	GaizaoxinxiView selectView(@Param("ew") Wrapper<GaizaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GaizaoxinxiEntity> wrapper);
   	
}

