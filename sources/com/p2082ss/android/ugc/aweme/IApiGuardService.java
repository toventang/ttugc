package com.p2082ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.bytedance.news.common.service.manager.IService;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.IApiGuardService */
public interface IApiGuardService extends IService {
    static {
        Covode.recordClassIndex(37943);
    }

    Map<String, String> getHeaders(String str);

    AbstractC22021a getInterceptor();

    void initializeApiGuard();

    boolean isEnabled();

    void parseHeaders(Map<String, String> map);
}
