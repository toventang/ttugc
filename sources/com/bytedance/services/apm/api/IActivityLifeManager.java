package com.bytedance.services.apm.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.news.common.service.manager.IService;

public interface IActivityLifeManager extends IService {
    static {
        Covode.recordClassIndex(26530);
    }

    boolean isForeground();

    void register(AbstractC22711d dVar);

    void unregister(AbstractC22711d dVar);
}
