package com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3211a;

import android.app.Activity;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.main.AbstractC59103j;
import com.p2082ss.android.ugc.aweme.main.AbstractC59105l;
import com.p2082ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55075a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3212b.C55680b;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a.f */
public final class C55662f {

    /* renamed from: a */
    public volatile boolean f126953a;

    /* renamed from: b */
    private C55680b f126954b;

    static {
        Covode.recordClassIndex(65445);
    }

    /* renamed from: a */
    public final void mo92551a() {
        C55680b bVar = this.f126954b;
        if (bVar != null && bVar.f127022a) {
            bVar.mo92571a((AbstractC89171a<C89391z>) null);
        }
        this.f126954b = null;
    }

    /* renamed from: b */
    private static boolean m101421b() {
        Aweme a;
        Activity a2 = C55075a.m100721a();
        if (a2 == null || !(a2 instanceof AbstractC59103j) || !(((AbstractC59103j) a2).getCurFragment() instanceof AbstractC59105l) || (a = AwemeChangeCallBack.m108593a((ActivityC0945e) a2)) == null || !a.isAd()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a.f$a */
    public static final class C55663a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f126955a;

        /* renamed from: b */
        final /* synthetic */ C55662f f126956b;

        /* renamed from: c */
        final /* synthetic */ long f126957c;

        static {
            Covode.recordClassIndex(65446);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C55663a(C55662f fVar, long j, AbstractC89124d dVar) {
            super(2, dVar);
            this.f126956b = fVar;
            this.f126957c = j;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C55663a(this.f126956b, this.f126957c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C55663a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[RETURN] */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                h.c.a.a r4 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
                int r0 = r5.f126955a
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
                long r0 = r5.f126957c
                r5.f126955a = r2
                java.lang.Object r0 = kotlinx.coroutines.C89536ay.m155464a(r0, r5)
                if (r0 != r4) goto L_0x0023
                return r4
            L_0x0020:
                p4600h.C89382r.m154942a(r6)
            L_0x0023:
                kotlinx.coroutines.ci r2 = kotlinx.coroutines.internal.C89652o.f203399a
                com.ss.android.ugc.aweme.im.sdk.notification.a.f$a$1 r1 = new com.ss.android.ugc.aweme.im.sdk.notification.a.f$a$1
                r0 = 0
                r1.<init>(r5, r0)
                r5.f126955a = r3
                java.lang.Object r0 = kotlinx.coroutines.C89624i.m155554a(r2, r1, r5)
                if (r0 != r4) goto L_0x000f
                return r4
            L_0x0034:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.notification.p3211a.C55662f.C55663a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public final void mo92552a(long j) {
        while (!C55649c.m101405c() && C55654e.f126932b.mo92549f()) {
            if (j > 0) {
                AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C89546bf.f203266a), null, null, new C55663a(this, j, null), 3);
                return;
            } else if (!this.f126953a) {
                if (!m101421b()) {
                    C55670k d = C55649c.m101406d();
                    if (d != null) {
                        if (this.f126954b == null) {
                            this.f126954b = new C55680b();
                        }
                        C55680b bVar = this.f126954b;
                        if (bVar != null) {
                            bVar.mo92570a(d);
                        }
                        this.f126953a = true;
                    } else {
                        return;
                    }
                }
                j = 1000;
            } else {
                return;
            }
        }
        this.f126953a = false;
    }
}
