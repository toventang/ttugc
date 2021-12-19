package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.google.android.material.snackbar.Snackbar;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56245a;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56257j;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89097a;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.AbstractC89127f;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.y */
public final class C55236y {

    /* renamed from: a */
    public static final C55236y f126325a = new C55236y();

    private C55236y() {
    }

    static {
        Covode.recordClassIndex(64983);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.y$a */
    public static final class C55237a extends AbstractC89097a implements CoroutineExceptionHandler {
        static {
            Covode.recordClassIndex(64984);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(AbstractC89127f fVar, Throwable th) {
        }

        public C55237a(AbstractC89127f.AbstractC89132c cVar) {
            super(cVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.y$c */
    public static final class C55239c extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f126329a;

        /* renamed from: b */
        final /* synthetic */ Snackbar f126330b;

        static {
            Covode.recordClassIndex(64986);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55239c(Snackbar snackbar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f126330b = snackbar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C55239c(this.f126330b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C55239c) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[RETURN] */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                h.c.a.a r4 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
                int r0 = r5.f126329a
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
                r5.f126329a = r2
                java.lang.Object r0 = kotlinx.coroutines.C89536ay.m155464a(r0, r5)
                if (r0 != r4) goto L_0x0023
                return r4
            L_0x0020:
                p4600h.C89382r.m154942a(r6)
            L_0x0023:
                kotlinx.coroutines.ci r2 = kotlinx.coroutines.internal.C89652o.f203399a
                com.ss.android.ugc.aweme.im.sdk.common.controller.utils.y$c$1 r1 = new com.ss.android.ugc.aweme.im.sdk.common.controller.utils.y$c$1
                r0 = 0
                r1.<init>(r5, r0)
                r5.f126329a = r3
                java.lang.Object r0 = kotlinx.coroutines.C89624i.m155554a(r2, r1, r5)
                if (r0 != r4) goto L_0x000f
                return r4
            L_0x0034:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55236y.C55239c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.y$d */
    public static final class C55241d extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f126333a;

        /* renamed from: b */
        final /* synthetic */ Snackbar f126334b;

        static {
            Covode.recordClassIndex(64988);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C55241d(Snackbar snackbar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f126334b = snackbar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C55241d(this.f126334b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C55241d) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[RETURN] */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                h.c.a.a r4 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
                int r0 = r5.f126333a
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
                r0 = 5000(0x1388, double:2.4703E-320)
                r5.f126333a = r2
                java.lang.Object r0 = kotlinx.coroutines.C89536ay.m155464a(r0, r5)
                if (r0 != r4) goto L_0x0023
                return r4
            L_0x0020:
                p4600h.C89382r.m154942a(r6)
            L_0x0023:
                kotlinx.coroutines.ci r2 = kotlinx.coroutines.internal.C89652o.f203399a
                com.ss.android.ugc.aweme.im.sdk.common.controller.utils.y$d$1 r1 = new com.ss.android.ugc.aweme.im.sdk.common.controller.utils.y$d$1
                r0 = 0
                r1.<init>(r5, r0)
                r5.f126333a = r3
                java.lang.Object r0 = kotlinx.coroutines.C89624i.m155554a(r2, r1, r5)
                if (r0 != r4) goto L_0x000f
                return r4
            L_0x0034:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55236y.C55241d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.y$b */
    public static final class View$OnClickListenerC55238b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ Context f126326a;

        /* renamed from: b */
        final /* synthetic */ C56257j f126327b;

        /* renamed from: c */
        final /* synthetic */ Snackbar f126328c;

        static {
            Covode.recordClassIndex(64985);
        }

        public View$OnClickListenerC55238b(Context context, C56257j jVar, Snackbar snackbar) {
            this.f126326a = context;
            this.f126327b = jVar;
            this.f126328c = snackbar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Context context = this.f126326a;
            C56257j jVar = this.f126327b;
            IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
            if (createIIMServicebyMonsterPlugin != null) {
                if (jVar.f128320c) {
                    Bundle bundle = new Bundle();
                    bundle.putString("enter_from", jVar.f128322e);
                    bundle.putString("enter_method", "share_toast");
                    createIIMServicebyMonsterPlugin.openSessionListActivity(context, bundle);
                } else {
                    createIIMServicebyMonsterPlugin.startChat(C56245a.C56247b.m102213a(context, jVar.f128318a).mo93274c(jVar.f128322e).mo93262a(6).mo93271b("toast").f128281a);
                }
            }
            this.f126328c.mo44223c();
        }
    }
}
