package com.p2082ss.android.ugc.aweme.feed.api;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.ugc.aweme.net.interceptor.FeedRetryInterceptorTTNet;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.api.f */
public final class C48332f {

    /* renamed from: a */
    public static final C48332f f112005a = new C48332f();

    private C48332f() {
    }

    static {
        Covode.recordClassIndex(57104);
    }

    /* renamed from: a */
    public static List<AbstractC22021a> m91792a() {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.equals(C17867d.f42595s, "local_test")) {
            arrayList.add(new ComplianceEncryptCheckInterceptor());
        }
        arrayList.add(new FeedRetryInterceptorTTNet());
        arrayList.add(new DetectInterceptor());
        arrayList.add(new FetchNetworkInfoInterceptor());
        return arrayList;
    }
}
