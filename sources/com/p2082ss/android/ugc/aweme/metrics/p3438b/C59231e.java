package com.p2082ss.android.ugc.aweme.metrics.p3438b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.metrics.b.e */
public final class C59231e {

    /* renamed from: a */
    public static boolean f135160a = true;

    /* renamed from: b */
    public static boolean f135161b = true;

    /* renamed from: com.ss.android.ugc.aweme.metrics.b.e$a */
    public static class CallableC59232a implements Callable {

        /* renamed from: a */
        private String f135162a;

        /* renamed from: b */
        private JSONObject f135163b;

        static {
            Covode.recordClassIndex(69595);
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            C39162r.m79461a(this.f135162a, this.f135163b);
            C59227a.m108848a(this.f135162a, this.f135163b);
            return null;
        }

        public CallableC59232a(String str, JSONObject jSONObject) {
            this.f135162a = str;
            this.f135163b = jSONObject;
        }
    }

    static {
        Covode.recordClassIndex(69594);
    }
}
