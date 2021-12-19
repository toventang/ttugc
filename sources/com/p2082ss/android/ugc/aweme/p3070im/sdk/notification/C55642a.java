package com.p2082ss.android.ugc.aweme.p3070im.sdk.notification;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.AbstractC89516am;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a */
public final class C55642a {

    /* renamed from: k */
    public static final AbstractC89244h f126906k = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C55644b.f126918a);

    /* renamed from: l */
    public static final C55643a f126907l = new C55643a((byte) 0);

    /* renamed from: a */
    WeakReference<Activity> f126908a;

    /* renamed from: b */
    public boolean f126909b;

    /* renamed from: c */
    public boolean f126910c;

    /* renamed from: d */
    public boolean f126911d;

    /* renamed from: e */
    public boolean f126912e;

    /* renamed from: f */
    public boolean f126913f;

    /* renamed from: g */
    public boolean f126914g;

    /* renamed from: h */
    public boolean f126915h;

    /* renamed from: i */
    boolean f126916i;

    /* renamed from: j */
    public boolean f126917j;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a$a */
    public static final class C55643a {
        static {
            Covode.recordClassIndex(65426);
        }

        /* renamed from: a */
        public static C55642a m101399a() {
            return (C55642a) C55642a.f126906k.getValue();
        }

        private C55643a() {
        }

        public /* synthetic */ C55643a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a$b */
    static final class C55644b extends AbstractC89220m implements AbstractC89171a<C55642a> {

        /* renamed from: a */
        public static final C55644b f126918a = new C55644b();

        static {
            Covode.recordClassIndex(65427);
        }

        C55644b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C55642a invoke() {
            return new C55642a((byte) 0);
        }
    }

    private C55642a() {
        this.f126916i = true;
    }

    static {
        Covode.recordClassIndex(65425);
    }

    public /* synthetic */ C55642a(byte b) {
        this();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a$c */
    public static final class C55645c extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f126919a;

        /* renamed from: b */
        final /* synthetic */ C55642a f126920b;

        /* renamed from: c */
        final /* synthetic */ boolean f126921c;

        static {
            Covode.recordClassIndex(65428);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55645c(C55642a aVar, boolean z, AbstractC89124d dVar) {
            super(2, dVar);
            this.f126920b = aVar;
            this.f126921c = z;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C55645c(this.f126920b, this.f126921c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C55645c) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[RETURN] */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                h.c.a.a r4 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
                int r0 = r5.f126919a
                r3 = 2
                r2 = 1
                if (r0 == 0) goto L_0x0012
                if (r0 == r2) goto L_0x0020
                if (r0 != r3) goto L_0x0034
                p4600h.C89382r.m154942a(r6)
            L_0x000f:
                h.z r0 = p4600h.C89391z.f203057a
                return r0
            L_0x0012:
                p4600h.C89382r.m154942a(r6)
                r0 = 500(0x1f4, double:2.47E-321)
                r5.f126919a = r2
                java.lang.Object r0 = kotlinx.coroutines.C89536ay.m155464a(r0, r5)
                if (r0 != r4) goto L_0x0023
                return r4
            L_0x0020:
                p4600h.C89382r.m154942a(r6)
            L_0x0023:
                kotlinx.coroutines.ci r2 = kotlinx.coroutines.internal.C89652o.f203399a
                com.ss.android.ugc.aweme.im.sdk.notification.a$c$1 r1 = new com.ss.android.ugc.aweme.im.sdk.notification.a$c$1
                r0 = 0
                r1.<init>(r5, r0)
                r5.f126919a = r3
                java.lang.Object r0 = kotlinx.coroutines.C89624i.m155554a(r2, r1, r5)
                if (r0 != r4) goto L_0x000f
                return r4
            L_0x0034:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.C55642a.C55645c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }
}
