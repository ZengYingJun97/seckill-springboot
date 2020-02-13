package com.seckill.service;

import com.seckill.dto.Exposer;
import com.seckill.dto.SeckillExecution;
import com.seckill.exception.RepeatKillException;
import com.seckill.exception.SeckillCloseException;
import com.seckill.exception.SeckillException;
import com.seckill.pojo.Seckill;

import java.util.List;

/**
 * SeckillService
 *
 * @author handsome
 * @date 2020年 02月13日 18:27:56
 */
public interface SeckillService {

	/**
	 * 查询所有秒杀记录
	 * @date 2020/02/13 18:37:54
	 * @author handsome
	 * @param 
	 * @return java.util.List<com.seckill.pojo.Seckill>
	 */        
	List<Seckill> getSeckillList();

	/**
	 * 查询单个秒杀记录
	 * @date 2020/02/13 18:45:32
	 * @author handsome
	 * @param seckillId
	 * @return com.seckill.pojo.Seckill
	 */
	Seckill getById(long seckillId);

	/**
	 * 秒杀开启输出接口地址否则输出系统时间和秒杀时间
	 * @date 2020/02/13 18:46:11
	 * @author handsome
	 * @param seckillId
	 * @return com.seckill.dto.Exposer
	 */        
	Exposer exposerSeckillUrl(long seckillId);

	/**
	 * 执行秒杀操作
	 * @date 2020/02/13 18:46:39
	 * @author handsome
	 * @param seckillId
	 * @param userPhone
	 * @param md5
	 * @return com.seckill.dto.SeckillExecution
	 */        
	SeckillExecution executeSeckill(long seckillId, long userPhone, String md5)
			throws SeckillException, RepeatKillException, SeckillCloseException;
}
