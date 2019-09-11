package com.example.springbootdemo;

import org.activiti.engine.FormService;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.repository.Deployment;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ActivitiDemoApplicationTests {
	
	@Autowired
	private RepositoryService repositoryService;
	
	@Autowired
	private RuntimeService runtimeService;
	
	@Autowired
	private TaskService taskService;
	
	@Autowired
	private FormService formService;
	
	@Test
	public void contextLoads() {
	}
	
	@Test
	public void deployProcess() throws Exception{
		repositoryService.createDeployment().addClasspathResource( "processes/demo01.bpmn" ).deploy();
	}
	
	/**
	 * @author dudawei
	 * @description 表单相关测试
	 * @date 2019-09-09 01:47
	 * @param
	 * @return void
	 */
	@Test
	public void formTestMethod() {
	}
}
