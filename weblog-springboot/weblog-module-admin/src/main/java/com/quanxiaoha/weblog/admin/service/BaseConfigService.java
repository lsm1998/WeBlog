package com.quanxiaoha.weblog.admin.service;

import com.quanxiaoha.weblog.common.Response;
import com.quanxiaoha.weblog.common.domain.mongo.PageHeader;

import java.util.List;

public interface BaseConfigService
{
    Response<List<PageHeader>> listPageHeader();

    Response<PageHeader> savePageHeader(PageHeader pageHeader);

    Response<String> deletePageHeader(Long id);
}
