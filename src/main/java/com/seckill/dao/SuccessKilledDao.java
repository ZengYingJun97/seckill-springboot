package com.seckill.dao;

import com.seckill.pojo.SuccessKilled;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * SuccessKilledDao
 *
 * @author handsome
 * @date 2020年 02月10日 22:45:14
 */
@Mapper
@Component
public interface SuccessKilledDao {

	/**
	 * 插入购买明细，过滤重复
	 * @date 2020/02/10 22:46:42
	 * @author handsome
	 * @param seckillId
	 * @param userPhone
	 * @return int
	 */        
	int insertSuccessKilled(@Param("seckillId") long seckillId, @Param("userPhone") long userPhone);

	/**
	 * 通过id查询SuccessKilled并携带秒杀产品对象实体
	 * @date 2020/02/05 18:36:06
	 * @author handsome
	 * @param seckillId
	 * @return com.seckill.entity.SuccessKilled
	 */
	SuccessKilled queryByIdWithSeckill(long seckillId);
}
