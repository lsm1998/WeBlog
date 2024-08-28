package com.quanxiaoha.weblog.admin.service.impl;

import com.anwen.mongo.conditions.update.LambdaUpdateChainWrapper;
import com.anwen.mongo.mapper.BaseMapper;
import com.quanxiaoha.weblog.common.Response;
import com.quanxiaoha.weblog.common.domain.mongo.PageHeader;
import com.quanxiaoha.weblog.admin.service.BaseConfigService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class BaseConfigServiceImpl implements BaseConfigService
{
    @Resource
    private BaseMapper baseMapper;

    @Override
    public Response<List<PageHeader>> listPageHeader()
    {
        List<PageHeader> list = baseMapper.list(PageHeader.class);
        return Response.success(list);
    }

    @Override
    public Response<PageHeader> savePageHeader(PageHeader pageHeader)
    {
        if (pageHeader.getId() == null)
        {
            baseMapper.save(pageHeader);
        } else
        {
            PageHeader header = baseMapper.getById(pageHeader.getId(), PageHeader.class);
            if (header == null)
            {
                return Response.fail("记录找不到");
            }
            LambdaUpdateChainWrapper<PageHeader> lambdaUpdate = new LambdaUpdateChainWrapper<>(baseMapper, PageHeader.class);
            lambdaUpdate.eq("id", pageHeader.getId()).update();
        }
        return Response.success(pageHeader);
    }

    @Override
    public Response<String> deletePageHeader(Long id)
    {
        LambdaUpdateChainWrapper<PageHeader> chainWrapper = new LambdaUpdateChainWrapper<>(baseMapper, PageHeader.class);
        chainWrapper.eq("id", id).remove();
        return Response.success("删除成功");
    }
}