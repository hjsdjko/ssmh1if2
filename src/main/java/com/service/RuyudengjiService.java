package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RuyudengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RuyudengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RuyudengjiView;


/**
 * 入狱登记
 *
 * @author 
 * @email 
 * @date 2021-05-07 15:52:14
 */
public interface RuyudengjiService extends IService<RuyudengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RuyudengjiVO> selectListVO(Wrapper<RuyudengjiEntity> wrapper);
   	
   	RuyudengjiVO selectVO(@Param("ew") Wrapper<RuyudengjiEntity> wrapper);
   	
   	List<RuyudengjiView> selectListView(Wrapper<RuyudengjiEntity> wrapper);
   	
   	RuyudengjiView selectView(@Param("ew") Wrapper<RuyudengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RuyudengjiEntity> wrapper);
   	
}

