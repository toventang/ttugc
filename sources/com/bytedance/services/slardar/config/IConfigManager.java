package com.bytedance.services.slardar.config;

import com.bytedance.covode.number.Covode;
import com.bytedance.news.common.service.manager.IService;
import org.json.JSONObject;

public interface IConfigManager extends IService {
    static {
        Covode.recordClassIndex(26544);
    }

    void fetchConfig();

    int getConfigInt(String str, int i);

    JSONObject getConfigJSON(String str);

    boolean getLogTypeSwitch(String str);

    boolean getMetricTypeSwitch(String str);

    boolean getServiceSwitch(String str);

    boolean getSwitch(String str);

    boolean isConfigReady();

    String queryConfig();

    void registerConfigListener(AbstractC22715a aVar);

    void registerResponseConfigListener(AbstractC22716b bVar);

    void unregisterConfigListener(AbstractC22715a aVar);

    void unregisterResponseConfigListener(AbstractC22716b bVar);
}
