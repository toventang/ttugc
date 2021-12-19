package com.p2082ss.ugc.live.sdk.msg.p4473d;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.ugc.live.sdk.msg.d.e */
public final class C87108e {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f196380a = {new C89232y(C89204ab.m154669a(C87108e.class), "sHandler", "getSHandler()Landroid/os/Handler;")};

    /* renamed from: b */
    public static final C87108e f196381b = new C87108e();

    /* renamed from: c */
    private static final AbstractC89244h f196382c = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C87109a.f196383a);

    private C87108e() {
    }

    /* renamed from: com.ss.ugc.live.sdk.msg.d.e$a */
    static final class C87109a extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C87109a f196383a = new C87109a();

        static {
            Covode.recordClassIndex(102905);
        }

        C87109a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: a */
    private static boolean m150858a() {
        return C89219l.m154714a(Looper.myLooper(), Looper.getMainLooper());
    }

    static {
        Covode.recordClassIndex(102904);
    }

    /* renamed from: b */
    private static void m150859b(Runnable runnable) {
        if (runnable != null) {
            ((Handler) f196382c.getValue()).post(runnable);
        }
    }

    /* renamed from: a */
    public static final void m150857a(Runnable runnable) {
        C89219l.m154719c(runnable, "");
        if (m150858a()) {
            runnable.run();
        } else {
            m150859b(runnable);
        }
    }
}
