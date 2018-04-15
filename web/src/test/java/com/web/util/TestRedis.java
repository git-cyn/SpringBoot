package com.web.util;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.web.WebApplication;
import com.web.domain.User;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedis {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    
	@Autowired
	private RedisTemplate redisTemplate;

    @Test
    public void test() throws Exception {
        stringRedisTemplate.opsForValue().set("aaa", "111");
        Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
    }
    @Test
    public void test2() throws Exception {
       System.out.println(stringRedisTemplate.opsForValue().get("aaa"));
        ValueOperations<String, User> operations = redisTemplate.opsForValue();
        User user = operations.get("com.neox");
        System.out.println(user.getEmail());

        User user1=new User("aa@126.com", "aa1", "aa123456", "aa","123");
        User user2=new User("aa@126.com", "aa2", "aa123456", "aa","123");
        List<User> list = new ArrayList();
        list.add(user);
        list.add(user1);
        list.add(user2);

        ValueOperations<String, List<User>> op = redisTemplate.opsForValue();
        op.set("list",list);
        List<User> d = op.get("list");
        System.out.println(d.size());
    }

    @Test
    public void testObj() throws Exception {
        User user=new User("aa@126.com", "aa", "aa123456", "aa","123");

        ValueOperations<String, User> operations=redisTemplate.opsForValue();
        operations.set("com.neo.f", user,1,TimeUnit.SECONDS);
        operations.set("com.neox", user);
        Thread.sleep(1000);
        //redisTemplate.delete("com.neo.f");
        boolean exists=redisTemplate.hasKey("com.neo.f");
        if(exists){
        	System.out.println("exists is true");
        }else{
        	System.out.println("exists is false");
        }
       // Assert.assertEquals("aa", operations.get("com.neo.f").getUserName());
    }


}