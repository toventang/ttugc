package com.p2082ss.android.ugc.aweme.search.p3696l;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.p2132c.C29819a;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p4600h.C89391z;

/* renamed from: com.ss.android.ugc.aweme.search.l.l */
public final class C67639l {

    /* renamed from: a */
    public static long f151540a;

    /* renamed from: b */
    public static final C67639l f151541b = new C67639l();

    private C67639l() {
    }

    static {
        Covode.recordClassIndex(79278);
    }

    /* renamed from: com.ss.android.ugc.aweme.search.l.l$a */
    public static final class CallableC67640a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ long f151542a;

        static {
            Covode.recordClassIndex(79279);
        }

        public CallableC67640a(long j) {
            this.f151542a = j;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cost", this.f151542a);
            C29819a.m60077a("search_page_launch_event", jSONObject);
            C34611o.m70668a("search_page_launch_event", jSONObject);
            return C89391z.f203057a;
        }
    }
}
