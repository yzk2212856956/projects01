<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>品牌</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="../css/bootstrap.min.css" rel="stylesheet">
    <script src="../js/jquery-3.2.1.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container">
        <h3>品牌功能</h3>
        <div class="row">
            <form class="form-inline" id="searchform">
                <div class="form-group">
                    <label class="sr-only" for="exampleInputEmail3">品牌名称:</label>
                    <input type="text" class="form-control" name="name" id="exampleInputEmail3" placeholder="请输入品牌名称">
                </div>
                <div class="form-group">
                    <label class="sr-only" for="exampleInputPassword3">品牌首字母:</label>
                    <input type="text" class="form-control" name="firstChar" id="exampleInputPassword3" placeholder="请输入品牌首字母">
                </div>
                <button type="button" class="btn btn-success" id="searchbtn">搜索</button>
                <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">
                    新增品牌
                </button>
            </form>
        </div><br>
        <div class="row">
            <table class="table table-bordered table-hover">
                <thead>
                    <tr>
                        <td>ID</td>
                        <td>品牌名称</td>
                        <td>品牌首字母</td>
                        <td>操作</td>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>1</td>
                        <td>七匹狼</td>
                        <td>Q</td>
                        <td>
                            <button class="btn btn-primary" data-toggle="modal" data-target="#myModal">编辑</button>
                            <button class="btn btn-danger">删除</button>
                        </td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
<!--编辑窗口-->
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title" id="myModalLabel">编辑窗口</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal" id="brandForm">
                        <input type="hidden" id="hid" name="id">
                        <div class="form-group">
                            <label for="name" class="col-sm-3 control-label" >品牌名称</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" name="name" id="name" placeholder="请输入品牌名称">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="firstChar" class="col-sm-3 control-label" id="shouzimu">品牌首字母</label>
                            <div class="col-sm-9">
                                <input type="text" class="form-control" name="firstChar" id="firstChar" placeholder="请输入品牌首字母">
                            </div>
                        </div>
                    </form>
                    
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" id="editbtn">保存</button>
                </div>
            </div>
        </div>
    </div>
</body>

<script>


















































    /*$(function () {
      $.get("../brand/findAll",function (response) {
          if(response.success){
              show(response.data);
          }
      });

        function show(data) {
          $("table tbody").empty();
          $.each(data,function (i,e) {
              $("table tbody").append('<tr>' +
                  '<td>'+e.id+'</td>' +
                  '<td>'+e.name+'</td>' +
                  '<td>'+e.firstChar+'</td>' +
                  '<td>'+
                  '<button class="btn btn-primary" data-toggle="modal" data-target="#myModal" onclick="edit('+e.id+')">编辑</button>' +
                  '<button onclick="del('+e.id+');" class="btn btn-danger">删除</button>' +
                  '</td>'+
                  '</tr>')
          });

        }

        $("#editbtn").click(function () {
            var val = $("#hid").val();
            if (val==null||val == ""){
                $.post("../brand/saveBrand",$("#brandForm").serialize(),function (response) {
                    if (response.success){
                        location.reload();
                    }else {
                        alert(response.message);
                    }
                })
            }else {
                $.post("../brand/update",$("#brandForm").serialize(),function (response) {
                    if (response.success){
                        location.reload();
                    }else {
                        alert("保存失败");
                    }

                })
            }



        });


        $("#searchbtn").click(function () {
            $.post("../brand/search",$("#searchform").serialize(),function (response) {
                if (response.success){
                    show(response.data);
                }
            })
        });
    })


    function del(uid) {
        if (confirm("是否删除此信息?")){
            $.post("../brand/del",{id:uid},function (response) {
                if (response.success){
                    location.reload();
                }else{
                    alert(response.message);
                }

            });
        }
    }



    function edit(uid) {
        $.post("../brand/edit",{id:uid},function (response) {
             //alert(response.data.name)
            $("#name").val(response.data.name);
            $("#firstChar").val(response.data.firstChar);
            $("#hid").val(response.data.id)
        })

    }*/
</script>
</html>