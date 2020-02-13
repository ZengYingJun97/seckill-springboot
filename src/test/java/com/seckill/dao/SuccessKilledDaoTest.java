package com.seckill.dao;

import com.seckill.pojo.SuccessKilled;
import org.junit.Test;
import org.junit.runner.RunWith;
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

	@Test
	public void insertSuccessKilled() {
		long id = 1L;
		long userPhone = 12345678912L;
		int insertCount = successKilledDao.insertSuccessKilled(id, userPhone);
		System.out.println("insertCount = " + insertCount);
	}

	@Test
	public void queryByIdWithSeckill() {
		long id = 1L;
		SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(id);
		System.out.println(successKilled);
		System.out.println(successKilled.getSeckill());
	}
}