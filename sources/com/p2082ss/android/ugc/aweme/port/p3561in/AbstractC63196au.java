package com.p2082ss.android.ugc.aweme.port.p3561in;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.google.gson.C27910f;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.port.in.au */
public interface AbstractC63196au {
    static {
        Covode.recordClassIndex(74469);
    }

    <T> T createDefaultRetrofit(Class<T> cls);

    <T> T createRetrofit(String str, boolean z, Class<T> cls);

    <T> T createRetrofitWithInterceptors(String str, boolean z, Class<T> cls, List<? extends AbstractC22021a> list);

    String getApiHost();

    C27910f getRetrofitFactoryGson();

    <T> T retrofitCreate(String str, Class<T> cls);
}
