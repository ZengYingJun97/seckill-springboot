package com.seckill.dao;

import com.seckill.pojo.SuccessKilled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class SuccessKilledDaoTest {

	@Autowired
	private SuccessKilledDao successKilledDao;

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Test
	public void insertSuccessKilled() {
		long id = 1L;
		long userPhone = 12345678912L;
		int insertCount = successKilledDao.insertSuccessKilled(id, userPhone);
		logger.info("insertCount = {}", insertCount);
	}

	@Test
	public void queryByIdWithSeckill() {
		long id = 1L;
		SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(id);
		logger.info("successKilled = {}", successKilled);
	}
}