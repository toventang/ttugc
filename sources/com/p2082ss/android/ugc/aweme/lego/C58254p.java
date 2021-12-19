package com.p2082ss.android.ugc.aweme.lego;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lego.p3396f.C58228b;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import java.util.concurrent.ExecutorService;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.lego.p */
public final class C58254p {

    /* renamed from: a */
    public static Handler f132679a;

    /* renamed from: b */
    public static final C58228b f132680b = new C58228b();

    /* renamed from: c */
    public static final C58254p f132681c = new C58254p();

    /* renamed from: d */
    private static final AbstractC89244h f132682d = C89250i.m154773a((AbstractC89171a) C58255a.f132689a);

    /* renamed from: e */
    private static final AbstractC89244h f132683e = C89250i.m154773a((AbstractC89171a) C58257c.f132691a);

    /* renamed from: f */
    private static final ExecutorService f132684f;

    /* renamed from: g */
    private static final ExecutorService f132685g;

    /* renamed from: h */
    private static final ExecutorService f132686h;

    /* renamed from: i */
    private static final HandlerThread f132687i;

    /* renamed from: j */
    private static final AbstractC89244h f132688j = C89250i.m154773a((AbstractC89171a) C58256b.f132690a);

    /* renamed from: a */
    public static Handler m105190a() {
        return (Handler) f132688j.getValue();
    }

    /* renamed from: b */
    private static ExecutorService m105193b() {
        return (ExecutorService) f132682d.getValue();
    }

    private C58254p() {
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.p$b */
    static final class C58256b extends AbstractC89220m implements AbstractC89171a<Handler> {

        /* renamed from: a */
        public static final C58256b f132690a = new C58256b();

        static {
            Covode.recordClassIndex(68323);
        }

        C58256b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.p$a */
    static final class C58255a extends AbstractC89220m implements AbstractC89171a<ExecutorService> {

        /* renamed from: a */
        public static final C58255a f132689a = new C58255a();

        static {
            Covode.recordClassIndex(68322);
        }

        C58255a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ExecutorService invoke() {
            if (((Boolean) C58267z.f132711f.getValue()).booleanValue()) {
                return C40780g.m82245b();
            }
            C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
            a.f95504b = "LegoExecutor_executorWork";
            a.f95505c = C58266y.f132705a;
            return C40780g.m82242a(a.mo70028a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.lego.p$c */
    static final class C58257c extends AbstractC89220m implements AbstractC89171a<ExecutorService> {

        /* renamed from: a */
        public static final C58257c f132691a = new C58257c();

        static {
            Covode.recordClassIndex(68324);
        }

        C58257c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ExecutorService invoke() {
            C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
            a.f95504b = "LegoExecutor_executorWork";
            a.f95505c = Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4));
            return C40780g.m82242a(a.mo70028a());
        }
    }

    static {
        Covode.recordClassIndex(68321);
        ExecutorService e = C40780g.m82248e();
        C89219l.m154716b(e, "");
        f132684f = e;
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SERIAL);
        a.f95504b = "LegoExecutor_executorRequest";
        ExecutorService a2 = C40780g.m82242a(a.mo70028a());
        C89219l.m154716b(a2, "");
        f132685g = a2;
        ExecutorService a3 = C40780g.m82241a();
        C89219l.m154716b(a3, "");
        f132686h = a3;
        HandlerThread handlerThread = new HandlerThread("LegoHandler");
        f132687i = handlerThread;
        handlerThread.start();
        f132679a = new Handler(handlerThread.getLooper());
        Process.setThreadPriority(handlerThread.getThreadId(), -20);
    }

    /* renamed from: a */
    public static ExecutorService m105191a(EnumC58147aa aaVar) {
        C89219l.m154721d(aaVar, "");
        if (aaVar == EnumC58147aa.P0) {
            return f132686h;
        }
        return f132685g;
    }

    /* renamed from: b */
    public static ExecutorService m105194b(boolean z) {
        if (!z) {
            return (ExecutorService) f132683e.getValue();
        }
        return f132684f;
    }

    /* renamed from: a */
    public static ExecutorService m105192a(boolean z) {
        if (!z) {
            return m105193b();
        }
        return f132684f;
    }
}
