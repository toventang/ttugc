package com.bytedance.ies.p1208im.core.p1224e;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.p1208im.core.api.C17415a;
import com.bytedance.ies.p1208im.core.p1222c.C17492a;
import com.bytedance.ies.p1208im.core.p1228i.C17595a;
import com.bytedance.p1399im.core.internal.utils.C20041s;
import com.bytedance.p1399im.core.p1404a.C19483d;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.im.core.e.e */
public final class C17514e {

    /* renamed from: a */
    public static final AbstractC89516am f41920a = C89517an.m155448a(C89546bf.f203266a);

    /* renamed from: b */
    static volatile long f41921b;

    /* renamed from: c */
    public static final C17514e f41922c = new C17514e();

    /* renamed from: d */
    private static Handler f41923d;

    /* renamed from: com.bytedance.ies.im.core.e.e$a */
    public enum EnumC17515a {
        HEART_BEAT,
        IM_BIZ,
        NET,
        WS;

        static {
            Covode.recordClassIndex(20004);
        }
    }

    private C17514e() {
    }

    static {
        Covode.recordClassIndex(20003);
    }

    /* renamed from: a */
    public static void m32487a() {
        C17415a.m32255b().mo27836b("SDKMessagePuller", "tokenPullMessage");
        if (m32490b() && SystemClock.uptimeMillis() - f41921b > 5000) {
            C17415a.m32255b().mo27836b("SDKMessagePuller", "tokenPullMessage real");
            f41921b = SystemClock.uptimeMillis();
            C19483d.m36365a().mo31144e();
        }
    }

    /* renamed from: b */
    public static boolean m32490b() {
        int[] iArr = C17415a.m32259f().mo27803a().f41791a;
        for (int i : iArr) {
            if (C19483d.m36365a().f46156a != null) {
                C19483d.m36365a();
                C20041s.m37876a();
                if (C20041s.m37899g(i)) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private final Handler m32491c() {
        MethodCollector.m26663i(9120);
        if (f41923d == null) {
            synchronized (this) {
                try {
                    if (f41923d == null) {
                        f41923d = new HandlerC17516b(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9120);
                    throw th;
                }
            }
        }
        Handler handler = f41923d;
        if (handler == null) {
            C89219l.m154715b();
        }
        MethodCollector.m26664o(9120);
        return handler;
    }

    /* renamed from: com.bytedance.ies.im.core.e.e$b */
    public static final class HandlerC17516b extends Handler {
        static {
            Covode.recordClassIndex(20005);
        }

        HandlerC17516b(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            C89219l.m154721d(message, "");
            super.handleMessage(message);
            if (message.what == 10) {
                C17514e.m32489a(EnumC17515a.HEART_BEAT);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.im.core.e.e$e */
    public static final class C17519e extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f41928a;

        /* renamed from: b */
        final /* synthetic */ int f41929b;

        static {
            Covode.recordClassIndex(20008);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C17519e(int i, AbstractC89124d dVar) {
            super(2, dVar);
            this.f41929b = i;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C17519e(this.f41929b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C17519e) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f41928a == 0) {
                C89382r.m154942a(obj);
                C19483d.m36365a().mo31137a(this.f41929b);
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.bytedance.ies.im.core.e.e$c */
    public static final class C17517c extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f41926a;

        static {
            Covode.recordClassIndex(20006);
        }

        public C17517c(AbstractC89124d dVar) {
            super(2, dVar);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C17517c(dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C17517c) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f41926a == 0) {
                C89382r.m154942a(obj);
                if (!C17514e.m32490b() || SystemClock.uptimeMillis() - C17514e.f41921b <= 10000) {
                    C17514e.f41922c.mo27945a(false);
                } else {
                    C17514e.f41921b = SystemClock.uptimeMillis();
                    C17514e.m32488a(4);
                    C17514e.f41922c.mo27945a(true);
                }
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.im.core.e.e$d */
    public static final class C17518d extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f41927a;

        static {
            Covode.recordClassIndex(20007);
        }

        C17518d(AbstractC89124d dVar) {
            super(2, dVar);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C17518d(dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C17518d) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f41927a == 0) {
                C89382r.m154942a(obj);
                if (!C17514e.m32490b() || SystemClock.uptimeMillis() - C17514e.f41921b <= InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
                    C17514e.f41922c.mo27945a(false);
                } else {
                    C17514e.f41921b = SystemClock.uptimeMillis();
                    C17514e.m32488a(3);
                    C17514e.f41922c.mo27945a(true);
                }
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    public static void m32488a(int i) {
        C17415a.m32255b().mo27836b("SDKMessagePuller", "realPullMessage: " + C17492a.m32480a());
        if (C17492a.m32480a()) {
            AbstractC89568bz unused = C89624i.m155555a(f41920a, null, null, new C17519e(i, null), 3);
        } else {
            C19483d.m36365a().mo31137a(i);
        }
    }

    /* renamed from: a */
    public static void m32489a(EnumC17515a aVar) {
        C89219l.m154721d(aVar, "");
        C17415a.m32255b().mo27836b("SDKMessagePuller", "pullMessage: ".concat(String.valueOf(aVar)));
        AbstractC89568bz unused = C89624i.m155555a(f41920a, null, null, new C17518d(null), 3);
    }

    /* renamed from: a */
    public final void mo27945a(boolean z) {
        Handler handler = f41923d;
        if (handler != null) {
            if (z || !handler.hasMessages(10)) {
                Handler handler2 = f41923d;
                if (handler2 == null) {
                    C89219l.m154715b();
                }
                handler2.removeMessages(10);
            } else {
                return;
            }
        }
        if (C17595a.f42083a.mo27858a() || !C17415a.m32256c().mo27844a()) {
            C17415a.m32255b().mo27827a("SDKMessagePuller", "ws connected or net unavailable");
            return;
        }
        C17415a.m32256c();
        int a = C16048b.m29633a().mo25412a(true, "im_api_hb_when_ws_disable", 15000);
        if (a < 0) {
            C17415a.m32255b().mo27836b("SDKMessagePuller", "api hb disable");
        } else if (a == 0) {
            C17415a.m32255b().mo27836b("SDKMessagePuller", "ab test not config");
        } else {
            if (a < 10000) {
                a = 10000;
            }
            C17415a.m32255b().mo27836b("SDKMessagePuller", "delayNetPullMsg interval=".concat(String.valueOf(a)));
            Message obtainMessage = m32491c().obtainMessage(10);
            C89219l.m154716b(obtainMessage, "");
            m32491c().sendMessageDelayed(obtainMessage, (long) a);
        }
    }
}
