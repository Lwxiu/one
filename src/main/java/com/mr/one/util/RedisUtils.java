package com.mr.one.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

@Component
public class RedisUtils {

    @Autowired
    private RedisTemplate redisTemplate;

    public  void setKV(String key,String fields,Object value){
//        Map<String,Object> temp = new HashMap<>();
//        temp.put("name","giaole");
//        temp.put("age","20");
        try {
            redisTemplate.opsForHash().put(key,fields,value);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    /**
     * @Description: 获取hash对象
     * @Param:
     * @return:
     * @Author: yxy
     * @Date: 2019/11/29
     */
    public  Object getKV(String key,String fields){
        Object o = redisTemplate.opsForHash().get(key, fields);
        return o;
    }






    public void delRedis(String key) {
        //根据key删除缓存
        Boolean hasKey = redisTemplate.hasKey(key);

        System.out.println("是否删除成功:"+key);
    }

}
