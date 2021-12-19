package com.p2082ss.android.ugc.aweme.commercialize.util;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.p2132c.C29819a;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.util.b */
public final class C38580b {

    /* renamed from: a */
    public static final C38580b f91166a = new C38580b();

    /* renamed from: b */
    private static long f91167b = -1;

    /* renamed from: c */
    private static long f91168c = -1;

    /* renamed from: d */
    private static long f91169d = -1;

    /* renamed from: e */
    private static long f91170e = -1;

    /* renamed from: f */
    private static int f91171f = -1;

    /* renamed from: g */
    private static String f91172g = "";

    /* renamed from: h */
    private static AtomicBoolean f91173h = new AtomicBoolean(false);

    private C38580b() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.commercialize.util.b$a */
    public static final class CallableC38581a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ JSONObject f91174a;

        static {
            Covode.recordClassIndex(46113);
        }

        CallableC38581a(JSONObject jSONObject) {
            this.f91174a = jSONObject;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            C29819a.m60077a("adver_first_frame", this.f91174a);
            return null;
        }
    }

    static {
        Covode.recordClassIndex(46112);
    }

    /* renamed from: a */
    private static final void m78282a() {
        if (!f91173h.getAndSet(true) && f91171f >= 0 && f91167b >= 0 && f91168c >= 0 && f91169d >= 0 && !TextUtils.isEmpty(f91172g)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adver_first_show_duration", String.valueOf(f91167b));
            long j = f91169d;
            long j2 = f91168c;
            if (j - j2 > 0) {
                jSONObject.put("adver_close_duration", String.valueOf(j - j2));
            }
            if (f91171f == 2) {
                long j3 = f91170e;
                long j4 = f91169d;
                if (j3 - j4 > 0 && j3 - j4 < 600000) {
                    jSONObject.put("feed_first_show_duration", String.valueOf(j3 - j4));
                }
            }
            jSONObject.put("adv_status", f91172g);
            jSONObject.put("adver_type", String.valueOf(f91171f));
            C1731i.m5640b(new CallableC38581a(jSONObject), C1731i.f5562a);
        }
    }

    /* renamed from: a */
    public static final void m78283a(long j) {
        if (f91171f == 2) {
            f91170e = j;
            m78282a();
        }
    }

    /* renamed from: a */
    public static final void m78285a(long j, String str) {
        C89219l.m154721d(str, "");
        f91169d = j;
        f91172g = str;
        if (f91171f == 1) {
            m78282a();
        }
    }

    /* renamed from: a */
    public static final void m78284a(long j, int i, long j2) {
        f91167b = j;
        f91171f = i;
        f91168c = j2;
    }
}
