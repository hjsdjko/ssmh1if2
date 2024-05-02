package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChuyudengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChuyudengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChuyudengjiView;


/**
 * 出狱登记
 *
 * @author 
 * @email 
 * @date 2021-05-07 15:52:14
 */
public interface ChuyudengjiService extends IService<ChuyudengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChuyudengjiVO> selectListVO(Wrapper<ChuyudengjiEntity> wrapper);
   	
   	ChuyudengjiVO selectVO(@Param("ew") Wrapper<ChuyudengjiEntity> wrapper);
   	
   	List<ChuyudengjiView> selectListView(Wrapper<ChuyudengjiEntity> wrapper);
   	
   	ChuyudengjiView selectView(@Param("ew") Wrapper<ChuyudengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChuyudengjiEntity> wrapper);
   	
}

