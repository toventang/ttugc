package com.bytedance.services.apm.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.news.common.service.manager.IService;
import java.util.List;
import org.json.JSONObject;

public interface IMonitorLogManager extends IService {
    static {
        Covode.recordClassIndex(26536);
    }

    void deleteLegacyLogByIds(String str, String str2);

    void getLegacyLog(long j, long j2, String str, AbstractC22714g gVar);

    List<JSONObject> getRecentUiActionRecords();
}
