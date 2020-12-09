package com.performgroup;

import com.performgroup.config.TestConfig;
import com.performgroup.topic.Topic;
import com.performgroup.topic.TopicController;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.hamcrest.CoreMatchers.is;

public class SpringTest {

    ApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);


    @Test
    public void firstTest() throws Exception {

        TopicController controller = context.getBean(TopicController.class);
        Topic topic = controller.getTopic(1L);

        Assert.assertThat(topic.getName(), is("Spring Framework"));

    }
}
