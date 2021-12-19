package com.bytedance.android.livesdk.feed.p526c;

import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5827a;
import com.bytedance.android.livesdk.feed.feed.C8587f;
import com.bytedance.android.livesdk.feed.tab.api.FeedTabApi;
import com.bytedance.android.livesdk.feed.tab.p541b.C8695b;
import com.bytedance.android.livesdk.feed.tab.p541b.C8696c;
import com.bytedance.android.livesdk.feed.tab.p541b.C8701g;
import com.bytedance.android.livesdk.feed.tab.p541b.C8705k;
import com.bytedance.android.livesdk.model.C9520ag;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4560f.p4561a.AbstractC88979t;

/* renamed from: com.bytedance.android.livesdk.feed.c.a */
public class C8521a {

    /* renamed from: a */
    public static boolean f21068a;

    /* renamed from: b */
    private static C8521a f21069b = new C8521a();

    private C8521a() {
    }

    static {
        Covode.recordClassIndex(9375);
    }

    /* renamed from: a */
    public static synchronized void m16719a() {
        AbstractC88979t<R> b;
        synchronized (C8521a.class) {
            MethodCollector.m26663i(1792);
            C8701g b2 = C8701g.m16993b();
            if (b2.f21453b == null) {
                b2.f21453b = new C8705k((FeedTabApi) C5805e.m12718a().mo11572a(FeedTabApi.class));
            }
            AbstractC88979t<C5827a<C9520ag, C8587f>> a = b2.f21453b.mo14985a();
            if (!(a == null || (b = a.mo143292d(new C8695b(b2)).mo143280b(new C8696c(b2))) == null)) {
                b.mo143254a(C8522b.f21070a, C8523c.f21071a);
            }
            MethodCollector.m26664o(1792);
        }
    }
}
