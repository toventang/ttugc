package com.bytedance.services.apm.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.news.common.service.manager.IService;

public interface ILaunchTrace extends IService {
    static {
        Covode.recordClassIndex(26535);
    }

    void cancelTrace();

    void endSpan(String str, String str2);

    void endTrace(int i, String str, long j);

    void startSpan(String str, String str2);

    void startTrace();
}
