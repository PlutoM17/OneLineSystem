package com.moriaty.springdemo2.service;

import com.moriaty.springdemo2.mapper.XXXMapper;
import com.moriaty.springdemo2.pojo.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    XXXMapper xxxMapper;

    @Override
    public List<Goods> getGoods() {
        List l1 = xxxMapper.getGoodsByID(1);
        List l2 = xxxMapper.getAllGoods();
        return l1;
    }
}
