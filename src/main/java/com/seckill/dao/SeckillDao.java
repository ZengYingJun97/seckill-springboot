package com.seckill.dao;

import com.seckill.pojo.Seckill;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * SeckillDao
 *
 * @author handsome
 * @date 2020年 02月10日 22:40:25
 */
public interface SeckillDao {

	/**
	 * 减库存
	 * @date 2020/02/10 22:42:05
	 * @author handsome
	 * @param seckillId
	 * @param killTime
	 * @return int
	 */        
	int reduceNumber(@Param("seckillId") long seckillId, @Param("killTime") Date killTime);

	/**
	 * 通过id查询秒杀商品
	 * @date 2020/02/10 22:43:30
	 * @author handsome
	 * @param seckillId
	 * @return com.seckill.pojo.Seckill
	 */        
	Seckill queryById(@Param("seckillId") long seckillId);

	/**
	 * 通过偏移量查询秒杀商品列表
	 * @date 2020/02/10 22:44:02
	 * @author handsome
	 * @param 
	 * @return java.util.List<com.seckill.pojo.Seckill>
	 */        
	List<Seckill> queryAll(@Param("offset") int offset, @Param("limit") int limit);
}
