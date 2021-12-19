package com.p2082ss.android.ugc.aweme.net.interceptor;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.p1612c.AbstractC22021a;
import com.p2082ss.android.token.C30628d;
import com.p2082ss.android.ugc.aweme.experiment.C46807cw;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.EnsureTTTokenCronetInterceptor */
public class EnsureTTTokenCronetInterceptor extends FeedBaseCronetInterceptor {
    static {
        Covode.recordClassIndex(72042);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.net.interceptor.FeedBaseCronetInterceptor
    /* renamed from: a */
    public final C22099u mo98966a(AbstractC22021a.AbstractC22022a aVar) {
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        Request a = aVar.mo35809a();
        Map a2 = C30628d.m62921a(a.getUrl());
        if (a2 != null && !a2.isEmpty()) {
            ArrayList arrayList = null;
            for (Map.Entry entry : a2.entrySet()) {
                if (entry != null && !TextUtils.isEmpty((CharSequence) entry.getKey()) && !TextUtils.isEmpty((CharSequence) entry.getValue())) {
                    C22027b firstHeader = a.getFirstHeader((String) entry.getKey());
                    if (firstHeader != null) {
                        str = firstHeader.f52038b;
                    } else {
                        str = "";
                    }
                    if (!TextUtils.equals(str, (CharSequence) entry.getValue())) {
                        String str2 = (String) entry.getKey();
                        String str3 = (String) entry.getValue();
                        C22027b firstHeader2 = a.getFirstHeader(str2);
                        if (arrayList == null) {
                            arrayList = new ArrayList(a.getHeaders());
                        }
                        if (firstHeader2 != null) {
                            arrayList.remove(firstHeader2);
                        }
                        arrayList.add(new C22027b(str2, str3));
                    }
                }
            }
            if (arrayList != null) {
                Request.C22024a newBuilder = a.newBuilder();
                newBuilder.f52025c = arrayList;
                a = newBuilder.mo35840a();
            }
        }
        C58945a.C58947b.f134185a.mo96423a("ensure_tt_token_interceptor_duration", System.currentTimeMillis() - currentTimeMillis);
        System.currentTimeMillis();
        if (C46807cw.f109052d) {
            C58945a.C58947b.f134185a.mo96425a("feed_preload_ensuretttoken_interceptor", false);
            C58945a.C58947b.f134185a.mo96429b("feed_preload_ensuretttoken_interceptor", false);
        }
        return aVar.mo35810a(a);
    }
}
