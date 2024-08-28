package com.quanxiaoha.weblog.admin.controller;

import com.quanxiaoha.weblog.admin.service.BaseConfigService;
import com.quanxiaoha.weblog.common.domain.mongo.PageHeader;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/admin/pageHeader")
public class AdminBaseConfigController
{
    @Resource
    private BaseConfigService baseConfigService;

    @RequestMapping("/list")
    public Object listPageHeader()
    {
        return baseConfigService.listPageHeader();
    }

    @RequestMapping("/save")
    public Object savePageHeader(@RequestBody @Validated PageHeader pageHeader)
    {
        return baseConfigService.savePageHeader(pageHeader);
    }

    @RequestMapping("/delete")
    public Object deletePageHeader(@RequestParam Long id)
    {
        return baseConfigService.deletePageHeader(id);
    }
}
