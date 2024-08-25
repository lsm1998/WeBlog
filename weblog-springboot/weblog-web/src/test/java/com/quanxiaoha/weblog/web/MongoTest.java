package com.quanxiaoha.weblog.web;

import com.anwen.mongo.mapper.BaseMapper;
import com.anwen.mongo.mapper.MongoPlusMapMapper;
import com.quanxiaoha.weblog.common.domain.mongo.Article;
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
        List<Article> userList = baseMapper.list(Article.class);
        userList.forEach(System.out::println);
    }
}
