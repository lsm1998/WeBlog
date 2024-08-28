package com.quanxiaoha.weblog.common.domain.mongo;

import com.anwen.mongo.annotation.ID;
import com.anwen.mongo.annotation.collection.CollectionField;
import com.anwen.mongo.annotation.collection.CollectionName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

import static com.anwen.mongo.enums.IdTypeEnum.OBJECT_ID;

@CollectionName("article")
@Data
public class Article implements Serializable
{

}
