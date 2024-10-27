package com.yupi.springbootinit.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yupi.springbootinit.model.entity.Chart;
import com.yupi.springbootinit.service.ChartService;
import com.yupi.springbootinit.mapper.chartMapper;
import org.springframework.stereotype.Service;

/**
* @author 何玮
* @description 针对表【chart(图表信息表)】的数据库操作Service实现
* @createDate 2024-10-20 15:22:21
*/
@Service
public class ChartServiceImpl extends ServiceImpl<chartMapper, Chart>
    implements ChartService {

}




