package com.quanxiaoha.weblog.web;

import com.anwen.mongo.mapper.BaseMapper;
import com.quanxiaoha.weblog.common.domain.mongo.PageHeader;
import com.quanxiaoha.weblog.common.domain.mongo.TagDictionary;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class MongoTest
{
    @Resource
    private BaseMapper baseMapper;

    @Test
    public void testSelect()
    {
        System.out.println(("----- selectAll method test ------"));
        List<TagDictionary> userList = baseMapper.list(TagDictionary.class);
        userList.forEach(System.out::println);
    }
}
