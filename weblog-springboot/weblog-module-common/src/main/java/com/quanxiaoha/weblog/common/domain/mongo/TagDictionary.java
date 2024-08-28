package com.quanxiaoha.weblog.common.domain.mongo;

import com.anwen.mongo.annotation.ID;
import com.anwen.mongo.annotation.collection.CollectionField;
import com.anwen.mongo.annotation.collection.CollectionName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

import static com.anwen.mongo.enums.IdTypeEnum.OBJECT_ID;

@CollectionName("tag_dictionary")
@Data
public class TagDictionary implements Serializable
{
    @ID(type = OBJECT_ID)
    private String _id;

    @CollectionField("id")
    private Long id;

    @CollectionField("tag_name")
    private String tagName;

    @CollectionField("created_at")
    private LocalDateTime createdAt;

    @CollectionField("updated_at")
    private LocalDateTime updatedAt;
}
