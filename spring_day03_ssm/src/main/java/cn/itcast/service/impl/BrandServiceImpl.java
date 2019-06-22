package cn.itcast.service.impl;

import cn.itcast.dao.TbBrandMapper;
import cn.itcast.domain.TbBrand;
import cn.itcast.domain.TbBrandExample;
import cn.itcast.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private TbBrandMapper brandMapper;
    @Override
    public List<TbBrand> findAll() {
        return brandMapper.selectByExample(null);
    }

    @Override
    public void save(TbBrand tbBrand) {
        brandMapper.insert(tbBrand);
    }

    @Override
    public List<TbBrand> search(TbBrand tbBrand) {
        TbBrandExample tbBrandExample = new TbBrandExample();
        TbBrandExample.Criteria criteria = tbBrandExample.createCriteria();
        if (tbBrand.getName()!=null && !"".equals(tbBrand.getName())){
            criteria.andNameLike("%"+tbBrand.getName()+"%");
        }

        if (tbBrand.getFirstChar()!=null && !"".equals(tbBrand.getFirstChar())){
            criteria.andFirstCharLike("%"+tbBrand.getFirstChar()+"%");
        }

        List<TbBrand> tbBrands = brandMapper.selectByExample(tbBrandExample);
        return tbBrands;
    }

    @Override
    public boolean del(Long uid) {
        int i = brandMapper.deleteByPrimaryKey(uid);
        if (i == 0){
            return false;
        }
        return true;
    }

    @Override
    public TbBrand edit(Long id) {
        TbBrand tbBrand = brandMapper.selectByPrimaryKey(id);
        return tbBrand;
    }

    @Override
    public void update(TbBrand tbBrand) {
        brandMapper.updateByPrimaryKey(tbBrand);
    }


}
