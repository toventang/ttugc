package com.bytedance.android.livesdk.feed.tab.p541b;

import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.livesdk.feed.C8678s;
import com.bytedance.android.livesdk.feed.tab.api.FeedTabApi;
import com.bytedance.android.livesdk.feed.tab.p540a.C8689a;
import com.bytedance.android.livesdk.feed.tab.p540a.C8692d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.bytedance.android.livesdk.feed.tab.b.g */
public class C8701g extends C8694a {

    /* renamed from: c */
    private static volatile C8701g f21469c;

    static {
        Covode.recordClassIndex(9569);
    }

    /* renamed from: b */
    public static C8701g m16993b() {
        MethodCollector.m26663i(4324);
        if (f21469c == null) {
            synchronized (C8701g.class) {
                try {
                    if (f21469c == null) {
                        f21469c = new C8701g(new C8704j(new C8689a(), new C8692d(), new C8678s()), new C8705k((FeedTabApi) C5805e.m12718a().mo11572a(FeedTabApi.class)));
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(4324);
                    throw th;
                }
            }
        }
        C8701g gVar = f21469c;
        MethodCollector.m26664o(4324);
        return gVar;
    }

    private C8701g(AbstractC8702h hVar, AbstractC8703i iVar) {
        super(hVar, iVar);
    }
}
