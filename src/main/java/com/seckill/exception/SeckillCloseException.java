package com.seckill.exception;

/**
 * 秒杀关闭异常
 *
 * @author handsome
 * @date 2020年 02月13日 18:35:44
 */
public class SeckillCloseException extends RuntimeException {

	public SeckillCloseException(String message) {
		super(message);
	}

	public SeckillCloseException(String message, Throwable cause) {
		super(message, cause);
	}
}
