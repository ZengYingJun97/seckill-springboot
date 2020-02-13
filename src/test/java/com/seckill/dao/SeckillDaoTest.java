package com.seckill.dao;

import com.seckill.pojo.Seckill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class SeckillDaoTest {

	@Autowired
	private SeckillDao seckillDao;

	@Test
	public void reduceNumber() {
		long seckillId = 1L;
		Date killTime = new Date();
		int updateCount = seckillDao.reduceNumber(seckillId, killTime);
		System.out.println("updateCount = " + updateCount);
	}

	@Test
	public void queryById() {
		long seckillId = 1L;
		Seckill seckill = seckillDao.queryById(seckillId);
		System.out.println(seckill);
	}

	@Test
	public void queryAll() {
		List<Seckill> seckillList = seckillDao.queryAll(0, 100);
		for (Seckill s: seckillList) {
			System.out.println(s);
		}
	}
}