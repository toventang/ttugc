package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.http.p2146a.p2149b.C29935e;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.app.api.Api;
import com.p2082ss.android.ugc.aweme.tools.AVApi;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.AVApiImpl */
public class AVApiImpl implements AVApi {
    static {
        Covode.recordClassIndex(82098);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.AVApi
    /* renamed from: a */
    public final String mo109850a() {
        return Api.f79771d;
    }

    /* renamed from: b */
    public static AVApi m123134b() {
        Object a = C81908b.m141854a(AVApi.class, false);
        if (a != null) {
            return (AVApi) a;
        }
        return new AVApiImpl();
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.AVApi
    /* renamed from: a */
    public final <T> T mo109849a(String str, Class<T> cls) {
        return (T) Api.m68816a(str, cls, (String) null, (C29935e) null);
    }
}
