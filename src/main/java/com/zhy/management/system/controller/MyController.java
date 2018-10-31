package com.zhy.management.system.controller;

import com.zhy.management.system.service.DeptService;
import com.zhy.management.system.vo.DeptDO;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/hello")
public class MyController {
    @Autowired
    private DeptService sysDeptService;

    @GetMapping()
    String dept() {
        return "/hello";
    }

    @ApiOperation(value="获取部门列表", notes="")
    @ResponseBody
    @GetMapping("/list")
    @RequiresPermissions("system:sysDept:sysDept")
    public List<DeptDO> list() {
        Map<String, Object> query = new HashMap<>(16);
        List<DeptDO> sysDeptList = sysDeptService.list(query);
        return sysDeptList;
    }
}
