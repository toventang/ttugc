package com.p2082ss.android.ugc.aweme.performance;

import android.os.SystemClock;
import com.bytedance.apm.p788p.C12560b;
import com.bytedance.apm.p789q.C12582f;
import com.bytedance.apm.trace.p791b.C12616b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.services.performance.LagDataCallback;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.performance.c */
public final class C62837c {

    /* renamed from: a */
    private final C12616b f142495a;

    /* renamed from: b */
    private final C62838a f142496b;

    /* renamed from: c */
    private long f142497c;

    /* renamed from: d */
    private boolean f142498d;

    /* renamed from: e */
    private boolean f142499e;

    /* renamed from: f */
    private final Runnable f142500f = new RunnableC62839d(this);

    static {
        Covode.recordClassIndex(73663);
    }

    /* renamed from: a */
    public final void mo100800a() {
        if (!this.f142498d) {
            this.f142498d = true;
            this.f142497c = SystemClock.uptimeMillis();
            this.f142495a.mo20427a();
        }
    }

    /* renamed from: b */
    public final void mo100803b() {
        if (this.f142498d) {
            this.f142498d = false;
            if (this.f142499e) {
                C34727m.m70943a().removeCallbacks(this.f142500f);
            }
            this.f142499e = false;
            this.f142496b.f142501a = SystemClock.uptimeMillis() - this.f142497c;
            this.f142495a.mo20430b();
            this.f142497c = 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.performance.c$a */
    public static class C62838a implements C12616b.AbstractC12622c, C12616b.AbstractC12623d {

        /* renamed from: a */
        public long f142501a;

        /* renamed from: b */
        LagDataCallback f142502b = null;

        /* renamed from: c */
        private final String f142503c;

        /* renamed from: d */
        private double f142504d;

        static {
            Covode.recordClassIndex(73664);
        }

        @Override // com.bytedance.apm.trace.p791b.C12616b.AbstractC12623d
        /* renamed from: a */
        public final void mo20436a(double d) {
            this.f142504d = d;
        }

        public C62838a(String str) {
            this.f142503c = str;
        }

        /* renamed from: a */
        public final synchronized void mo100804a(LagDataCallback lagDataCallback) {
            MethodCollector.m26663i(6777);
            this.f142502b = lagDataCallback;
            MethodCollector.m26664o(6777);
        }

        @Override // com.bytedance.apm.trace.p791b.C12616b.AbstractC12622c
        /* renamed from: a */
        public final void mo20435a(JSONObject jSONObject) {
            C12560b.C12564a.f30567a.mo20387a(new RunnableC62840e(this, this.f142503c, this.f142501a, this.f142504d, jSONObject));
            this.f142501a = -1;
            this.f142504d = -1.0d;
        }

        /* renamed from: a */
        static void m113243a(HashMap<String, String> hashMap, JSONObject jSONObject) {
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                float f = C12582f.f30616a;
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (keys.hasNext()) {
                    String next = keys.next();
                    int parseInt = Integer.parseInt(next);
                    int optInt = jSONObject.optInt(next);
                    if (optInt > 0) {
                        if (i3 < parseInt) {
                            i3 = parseInt;
                        }
                        if (parseInt >= 3) {
                            i2 += (int) (((float) (optInt * parseInt)) * f);
                        }
                        if (parseInt != 0) {
                            if (parseInt < 3) {
                                i4 += optInt;
                            } else if (parseInt < 7) {
                                i5 += optInt;
                            } else if (parseInt < 14) {
                                i6 += optInt;
                            } else {
                                i7 += optInt;
                            }
                        }
                        i += optInt;
                    }
                }
                hashMap.put("total_frame", String.valueOf(i));
                hashMap.put("block_duration", String.valueOf(i2));
                hashMap.put("drop_max", String.valueOf(i3));
                hashMap.put("weighted_drop_count", String.valueOf((float) ((i4 * 0) + (i5 * 1) + (i6 * 1) + (i7 * 1))));
                hashMap.put("level_1", String.valueOf(i4));
                hashMap.put("level_2", String.valueOf(i5));
                hashMap.put("level_3", String.valueOf(i6));
                hashMap.put("level_4", String.valueOf(i7));
            }
        }
    }

    /* renamed from: a */
    public final void mo100802a(LagDataCallback lagDataCallback) {
        this.f142496b.mo100804a(lagDataCallback);
    }

    public C62837c(String str) {
        C62838a aVar = new C62838a(str);
        this.f142496b = aVar;
        C12616b bVar = new C12616b(str, true);
        this.f142495a = bVar;
        bVar.mo20429a((C12616b.AbstractC12623d) aVar);
        bVar.mo20428a((C12616b.AbstractC12622c) aVar);
    }

    /* renamed from: a */
    public final void mo100801a(long j) {
        if (!this.f142498d) {
            this.f142499e = true;
            mo100800a();
            C34727m.m70943a().postDelayed(this.f142500f, j);
        }
    }
}
