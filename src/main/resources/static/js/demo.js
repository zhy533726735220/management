$(function() {
    load();
});

function load() {
    $('#exampleTable').bootstrapTreeTable({
        id : 'deptId',
        code : 'deptId',
        parentCode : 'parentId',
        type : "GET", // 请求数据的ajax类型
        url : '/hello/list', // 请求数据的ajax的url
        ajaxParams : {}, // 请求数据的ajax的data属性
        expandColumn : '1', // 在哪一列上面显示展开按钮
        striped : true, // 是否各行渐变色
        bordered : true, // 是否显示边框
        expandAll : false, // 是否全部展开
        // toolbar : '#exampleToolbar',
        columns : [

            {
                field : 'name',
                title : '部门名称',
                valign : 'center',
                witth :20
            },
            {
                field : 'orderNum',
                title : '排序',
                align : 'center',
                valign : 'center',
            },
            {
                field : 'delFlag',
                title : '状态',
                align : 'center',
                valign : 'center',
                formatter : function(item, index) {
                    if (item.delFlag == '0') {
                        return '<span class="label label-danger">禁用</span>';
                    } else if (item.delFlag == '1') {
                        return '<span class="label label-primary">正常</span>';
                    }
                }
            }
        ]
    });
}