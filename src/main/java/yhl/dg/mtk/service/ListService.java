package yhl.dg.mtk.service;

import yhl.dg.mtk.pojo.Activity;

public interface ListService {
    int DeleteFind(int id);

    int doSaveActivity(Activity activity);
}
