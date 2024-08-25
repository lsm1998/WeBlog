package com.quanxiaoha.weblog.common.domain.mongo;

import com.anwen.mongo.annotation.ID;
import com.anwen.mongo.annotation.collection.CollectionName;
import lombok.Data;

import java.io.Serializable;

@CollectionName("article")
@Data
public class Article implements Serializable
{
    @ID
    private Long id;
}
