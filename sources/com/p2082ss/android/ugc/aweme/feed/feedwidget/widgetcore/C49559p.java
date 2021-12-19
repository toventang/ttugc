package com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore;

import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p */
public final class C49559p {

    /* renamed from: a */
    public static final C49559p f113984a = new C49559p();

    /* renamed from: b */
    private static Handler f113985b;

    /* renamed from: c */
    private static boolean f113986c;

    private C49559p() {
    }

    static {
        Covode.recordClassIndex(58400);
    }

    /* renamed from: a */
    public final synchronized void mo81307a() {
        MethodCollector.m26663i(4592);
        if (!f113986c) {
            f113986c = true;
            f113985b = C58254p.f132679a;
        }
        MethodCollector.m26664o(4592);
    }

    /* renamed from: a */
    public final C49559p mo81305a(RunnableC49561r rVar) {
        if (!f113986c) {
            mo81307a();
        }
        Handler handler = f113985b;
        if (handler == null) {
            C89219l.m154710a("mWorkHandler");
        }
        handler.post(rVar);
        return this;
    }

    /* renamed from: a */
    public final C49559p mo81306a(RunnableC49561r rVar, long j) {
        if (!f113986c) {
            mo81307a();
        }
        Handler handler = f113985b;
        if (handler == null) {
            C89219l.m154710a("mWorkHandler");
        }
        handler.postDelayed(rVar, j);
        return this;
    }
}
