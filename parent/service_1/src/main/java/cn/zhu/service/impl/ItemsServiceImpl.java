package cn.zhu.service.impl;


import cn.zhu.dao.ItemsDao;
import cn.zhu.domain.Items;
import cn.zhu.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;



    public Items findById(int id) {
        return itemsDao.findById(id);
    }


}
