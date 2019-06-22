package cn.itcast.service;

import cn.itcast.domain.TbBrand;

import java.util.List;

public interface BrandService {
    List<TbBrand> findAll();
    void save(TbBrand tbBrand);
    List<TbBrand> search(TbBrand tbBrand);
    boolean del(Long uid);
    TbBrand edit(Long id);

    void update(TbBrand tbBrand);

}
