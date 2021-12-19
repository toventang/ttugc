package com.p2082ss.android.ugc.aweme.services.interceptor;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.client.Request;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.services.interceptor.IInterceptor */
public interface IInterceptor {
    static {
        Covode.recordClassIndex(79890);
    }

    Map<String, String> tryToIntercept(String str, Request request, String str2, int i, Map<String, String> map);
}
