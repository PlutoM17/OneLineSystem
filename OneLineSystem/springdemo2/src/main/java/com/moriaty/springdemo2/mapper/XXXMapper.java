package com.moriaty.springdemo2.mapper;

import com.moriaty.springdemo2.pojo.Goods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 *
 */
@Repository
@Mapper
public interface XXXMapper {

    List<Goods> getAllGoods();

    List<Goods> getGoodsByID(int id);

}

