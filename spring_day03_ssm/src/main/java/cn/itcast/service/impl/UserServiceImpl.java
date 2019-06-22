package cn.itcast.service.impl;

import cn.itcast.dao.TbUserMapper;
import cn.itcast.domain.TbUser;
import cn.itcast.domain.TbUserExample;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private TbUserMapper tbUserMapper;
    @Override
    public boolean login(TbUser tbUser) {
        if (tbUser==null){
            throw new RuntimeException("没有数据!");
        }
        TbUserExample example = new TbUserExample();
        TbUserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(tbUser.getUsername());
        criteria.andPasswordEqualTo(tbUser.getPassword());
        List<TbUser> list = tbUserMapper.selectByExample(example);
        if (list == null || list.size() < 1){
            throw new RuntimeException("用户名或者密码错误!");

        }
        return true;
    }


}
