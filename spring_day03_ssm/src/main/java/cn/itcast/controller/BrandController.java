package cn.itcast.controller;

import cn.itcast.domain.TbBrand;
import cn.itcast.model.Result;
import cn.itcast.service.BrandService;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RestController
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    private BrandService brandService;
    @RequestMapping("/findAll")
    public Result findAll(){
        List<TbBrand> all = brandService.findAll();
        return new Result(true,"成功",all);
    }


    @RequestMapping("/saveBrand")
    public Result saveBrand(TbBrand tbBrand){
        try {
            brandService.save(tbBrand);
            return new Result(true,"保存成功!");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false,"保存失败!");
        }
    }
    @RequestMapping("/search")
    public Result search(TbBrand tbBrand){
        List<TbBrand> search = brandService.search(tbBrand);
        return new Result(true,"成功",search);
    }
    @RequestMapping("/del")
    public Result del(Long id){
        boolean del = brandService.del(id);
        if (del){
            return new Result(true,"删除成功!");
        }
        return new Result(false,"没有该数据!");
    }


        @RequestMapping("/edit")
        public Result edit(Long id){
            TbBrand t = brandService.edit(id);
            return new Result(true,"成功",t);
        }


        @RequestMapping("/update")
        public Result update(TbBrand tbBrand){
            brandService.update(tbBrand);
            return  new Result(true,"成功");


        }

}
