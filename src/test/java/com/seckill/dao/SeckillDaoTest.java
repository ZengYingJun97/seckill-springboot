package com.seckill.dao;

import com.seckill.pojo.Seckill;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@Transactional
//@RunWith(SpringRunner.class)
@SpringBootTest
public class SeckillDaoTest {

	@Autowired
	private SeckillDao seckillDao;

	@Test
	public void reduceNumber() {
	}

	@Test
	public void queryById() {
		long seckillId = 1L;
		Seckill seckill = seckillDao.queryById(seckillId);
		System.out.println(seckill);
	}

	@Test
	public void queryAll() {
	}
}