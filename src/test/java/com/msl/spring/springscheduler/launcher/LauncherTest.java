package com.msl.spring.springscheduler.launcher;

import com.msl.spring.springscheduler.SpringQuartzApplication;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringQuartzApplication.class)
@SpringBootTest( properties = "server.port=8080", classes = SpringQuartzApplication.class, webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@Ignore
public class LauncherTest {
}
