package gs.service;

import gs.dao.PetDao;
import org.litespring.beans.factory.annotation.Autowired;
import org.litespring.stereotype.Component;

/**
 * Created by zhengtengfei on 2018/8/23.
 */
@Component
public class PencliStore {
    @Autowired
    private PetDao petDao;

    public String get(){
        return petDao.get();
    }
}
