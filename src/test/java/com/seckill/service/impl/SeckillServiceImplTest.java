package com.seckill.service.impl;

import com.seckill.dto.Exposer;
import com.seckill.dto.SeckillExecution;
import com.seckill.exception.RepeatKillException;
import com.seckill.exception.SeckillCloseException;
import com.seckill.pojo.Seckill;
import com.seckill.service.SeckillService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class SeckillServiceImplTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private SeckillService seckillService;

	@Test
	public void getSeckillList() {
		List<Seckill> seckills = seckillService.getSeckillList();
		logger.info("seckills={}", seckills);
	}

	@Test
	public void getById() {
		long id = 1L;
		Seckill seckill = seckillService.getById(id);
		logger.info("seckill={}", seckill);
	}

	@Test
	public void exposerSeckillUrl() {
		long id = 1L;
		Exposer exposer = seckillService.exposerSeckillUrl(id);
		logger.info("exposer={}", exposer);
	}

	@Test
	public void executeSeckill() {
		long id = 1L;
		long userPhone = 13692916769L;
		String md5 = "afc9fdb48c3ce274d247a41224e8c5a0";
		try {
			SeckillExecution seckillExecution = seckillService.executeSeckill(id, userPhone, md5);
			logger.info("seckillExecution={}", seckillExecution);
		} catch (RepeatKillException e) {
			logger.error(e.getMessage());
		} catch (SeckillCloseException e) {
			logger.error(e.getMessage());
		}
	}
}