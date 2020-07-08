package yhl.dg.mtk.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yhl.dg.mtk.dao.ListDao;
import yhl.dg.mtk.pojo.Activity;
import yhl.dg.mtk.service.ListService;
@Service
public class ListServiceImpl implements ListService {
    @Autowired
    ListDao listDao;
    @Override
    public int DeleteFind(int id) {
        int ort = listDao.deleteById(id);
        System.out.println(ort);
        return ort;
    }

    @Override
    public int doSaveActivity(Activity activity) {
        if(activity.getId()==null){
            return listDao.insertActivity(activity);
        }
        else {
            return listDao.updateActivity(activity);
        }
    }
}
