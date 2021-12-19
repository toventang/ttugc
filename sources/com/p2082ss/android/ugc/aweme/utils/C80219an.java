package com.p2082ss.android.ugc.aweme.utils;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.p2132c.C29819a;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.an */
public final class C80219an {

    /* renamed from: a */
    public static long f179692a = -1;

    /* renamed from: b */
    public static int f179693b = -1;

    /* renamed from: c */
    public static final C80219an f179694c = new C80219an();

    /* renamed from: d */
    private static long f179695d = -1;

    /* renamed from: e */
    private static String f179696e = "";

    /* renamed from: f */
    private static int f179697f;

    private C80219an() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.utils.an$a */
    public static final class CallableC80220a<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ JSONObject f179698a;

        static {
            Covode.recordClassIndex(93488);
        }

        CallableC80220a(JSONObject jSONObject) {
            this.f179698a = jSONObject;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            C29819a.m60077a("push_first_frame", this.f179698a);
            return null;
        }
    }

    static {
        Covode.recordClassIndex(93487);
    }

    /* renamed from: a */
    public static final void m139045a() {
        if (f179693b >= 0 && f179695d >= 0 && f179692a >= 0 && !TextUtils.isEmpty(f179696e)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("app_status", String.valueOf(f179693b));
            jSONObject.put("push_label", f179696e);
            jSONObject.put("push_cold_boost_user_cache", f179697f);
            long j = f179692a;
            long j2 = f179695d;
            if (j - j2 > 0) {
                jSONObject.put("push_total", String.valueOf(j - j2));
            }
            C1731i.m5640b(new CallableC80220a(jSONObject), C1731i.f5562a);
        }
    }

    /* renamed from: b */
    public static final void m139047b(long j, String str, int i) {
        C89219l.m154721d(str, "");
        f179695d = j;
        f179696e = str;
        f179697f = i;
    }

    /* renamed from: a */
    public static final void m139046a(long j, String str, int i) {
        C89219l.m154721d(str, "");
        f179692a = j;
        f179696e = str;
        f179697f = i;
        f179693b = 1;
        f179695d = C58945a.C58947b.f134185a.f134181h;
        m139045a();
    }
}
