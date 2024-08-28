package com.quanxiaoha.weblog.common.domain.mongo;

import com.anwen.mongo.annotation.ID;
import com.anwen.mongo.annotation.collection.CollectionField;
import com.anwen.mongo.annotation.collection.CollectionName;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

import static com.anwen.mongo.enums.IdTypeEnum.OBJECT_ID;

@CollectionName("page_header")
@Data
public class PageHeader implements Serializable
{
    @ID(type = OBJECT_ID)
    @CollectionField("_id")
    private String _id;

    @CollectionField("id")
    private Long id;

    @CollectionField("bg_url")
    private String bgUrl;

    @CollectionField("route_name")
    private String routeName;

    @CollectionField("created_at")
    private LocalDateTime createdAt;

    @CollectionField("updated_at")
    private LocalDateTime updatedAt;
}
