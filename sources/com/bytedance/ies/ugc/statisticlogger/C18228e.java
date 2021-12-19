package com.bytedance.ies.ugc.statisticlogger;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.p2144h.C29921d;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import p4560f.p4561a.p4591l.AbstractC88969g;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.statisticlogger.e */
public final class C18228e {

    /* renamed from: a */
    public static final AbstractC88969g<C18218c> f43417a;

    /* renamed from: b */
    public static volatile String f43418b;

    /* renamed from: c */
    static volatile long f43419c;

    /* renamed from: d */
    public static final C18229a f43420d = new C18229a();

    /* renamed from: e */
    public static final C18228e f43421e = new C18228e();

    /* renamed from: com.bytedance.ies.ugc.statisticlogger.e$a */
    public static final class C18229a implements AppLog.AbstractC29762h {
        static {
            Covode.recordClassIndex(20888);
        }

        C18229a() {
        }

        @Override // com.p2082ss.android.common.applog.AppLog.AbstractC29762h
        /* renamed from: a */
        public final void mo29089a(long j) {
            C18228e.f43417a.onNext(new C18218c(EnumC18227d.Start, j));
            C18228e.f43419c = j;
        }

        @Override // com.p2082ss.android.common.applog.AppLog.AbstractC29762h
        /* renamed from: b */
        public final void mo29091b(long j, String str, JSONObject jSONObject) {
            C18228e.f43417a.onNext(new C18218c(EnumC18227d.End, j, str, jSONObject));
        }

        @Override // com.p2082ss.android.common.applog.AppLog.AbstractC29762h
        /* renamed from: a */
        public final void mo29090a(long j, String str, JSONObject jSONObject) {
            C18228e.f43418b = str;
            C18228e.f43417a.onNext(new C18218c(EnumC18227d.LogSessionBatch, j, str, jSONObject));
        }
    }

    private C18228e() {
    }

    static {
        Covode.recordClassIndex(20887);
        AbstractC88969g<C18218c> j = new C88960c().mo143230j();
        C89219l.m154716b(j, "");
        f43417a = j;
    }

    /* renamed from: a */
    public static void m33927a(Activity activity) {
        C89219l.m154721d(activity, "");
        if (!C18230f.f43422a) {
            C18230f.f43423b = new WeakReference<>(activity);
        } else {
            C29921d.C29923a.f71406a.mo52229a(activity);
        }
    }

    /* renamed from: b */
    public static void m33928b(Activity activity) {
        C89219l.m154721d(activity, "");
        if (C29921d.C29923a.f71406a.f71399b.get()) {
            AppLog.onPause(activity);
        }
    }
}
