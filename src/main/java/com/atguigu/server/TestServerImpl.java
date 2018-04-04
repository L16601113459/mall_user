package com.atguigu.server;

public class TestServerImpl implements TestServerInf {

	@Override
	public String ping(String hello) {
		System.out.println("cxf接口调用："+hello);
		return "pong";
	}

}
