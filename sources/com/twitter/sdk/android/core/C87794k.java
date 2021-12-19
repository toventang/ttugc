package com.twitter.sdk.android.core;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.common.applog.AppLog;
import com.p2082ss.android.ugc.aweme.share.C69477t;
import com.p2082ss.android.ugc.aweme.share.C69478u;
import com.twitter.sdk.android.core.C87805o;
import com.twitter.sdk.android.core.internal.C87708a;
import com.twitter.sdk.android.core.internal.C87728g;
import com.twitter.sdk.android.core.internal.C87730i;
import com.twitter.sdk.android.core.internal.C87733l;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.twitter.sdk.android.core.k */
public final class C87794k {

    /* renamed from: a */
    static final AbstractC87688f f199418a = new C87683c();

    /* renamed from: b */
    static volatile C87794k f199419b;

    /* renamed from: c */
    final Context f199420c;

    /* renamed from: d */
    public final C87733l f199421d;

    /* renamed from: e */
    public final ExecutorService f199422e;

    /* renamed from: f */
    public final TwitterAuthConfig f199423f;

    /* renamed from: g */
    public final C87708a f199424g;

    /* renamed from: h */
    private final AbstractC87688f f199425h;

    /* renamed from: i */
    private final boolean f199426i;

    static {
        Covode.recordClassIndex(103792);
    }

    /* renamed from: b */
    public static boolean m152810b() {
        if (f199419b == null) {
            return false;
        }
        return f199419b.f199426i;
    }

    /* renamed from: c */
    public static AbstractC87688f m152811c() {
        if (f199419b == null) {
            return f199418a;
        }
        return f199419b.f199425h;
    }

    /* renamed from: a */
    public static C87794k m152808a() {
        try {
            C69477t tVar = new C69477t("vbMKoIRhySn7uaM2CXSRovovF", "BwVUCx6KpedNLQSyDGYRUiaFXmK71GEdRlr9BN1ug78fGt9v0G", "9cff289b-94e9-4f6b-9642-0b4d571a98cd", "tiktok", AppLog.getInstallId());
            Context a = C17867d.m33078a();
            C89219l.m154721d(a, "");
            C89219l.m154721d(tVar, "");
            C69478u.f155203a = tVar;
            C87805o.C87806a aVar = new C87805o.C87806a(a);
            aVar.f199453a = new TwitterAuthConfig(tVar.f155198a, tVar.f155199b);
            m152809a(aVar.mo142263a());
            if (f199419b != null) {
                return f199419b;
            }
            throw new IllegalStateException("Must initialize Twitter before using getInstance()");
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static synchronized C87794k m152809a(C87805o oVar) {
        synchronized (C87794k.class) {
            MethodCollector.m26663i(6323);
            if (f199419b == null) {
                C87794k kVar = new C87794k(oVar);
                f199419b = kVar;
                MethodCollector.m26664o(6323);
                return kVar;
            }
            C87794k kVar2 = f199419b;
            MethodCollector.m26664o(6323);
            return kVar2;
        }
    }

    private C87794k(C87805o oVar) {
        Context context = oVar.f199448a;
        this.f199420c = context;
        this.f199421d = new C87733l(context);
        this.f199424g = new C87708a(context);
        if (oVar.f199450c == null) {
            this.f199423f = new TwitterAuthConfig(C87728g.m152669a(context, "com.twitter.sdk.android.CONSUMER_KEY", ""), C87728g.m152669a(context, "com.twitter.sdk.android.CONSUMER_SECRET", ""));
        } else {
            this.f199423f = oVar.f199450c;
        }
        if (oVar.f199451d == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(C87730i.f199247a, C87730i.f199248b, 1, TimeUnit.SECONDS, new LinkedBlockingQueue(), C87730i.m152681a("twitter-worker"));
            C87730i.m152682a("twitter-worker", threadPoolExecutor);
            this.f199422e = threadPoolExecutor;
        } else {
            this.f199422e = oVar.f199451d;
        }
        if (oVar.f199449b == null) {
            this.f199425h = f199418a;
        } else {
            this.f199425h = oVar.f199449b;
        }
        if (oVar.f199452e == null) {
            this.f199426i = false;
        } else {
            this.f199426i = oVar.f199452e.booleanValue();
        }
    }
}
