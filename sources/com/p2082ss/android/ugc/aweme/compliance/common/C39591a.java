package com.p2082ss.android.ugc.aweme.compliance.common;

import android.app.Activity;
import android.os.Looper;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.C17205a;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.DialogContext;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.AbstractC34824bg;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.model.AdPersonalitySettings;
import com.p2082ss.android.ugc.aweme.compliance.api.services.agegate.AbstractC39264b;
import com.p2082ss.android.ugc.aweme.compliance.api.services.depend.C39275a;
import com.p2082ss.android.ugc.aweme.main.AbstractC59104k;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.common.a */
public final class C39591a {

    /* renamed from: a */
    public static final C39591a f93355a = new C39591a();

    /* renamed from: com.ss.android.ugc.aweme.compliance.common.a$a */
    public static final class C39592a implements AbstractC17207b.AbstractC17211c {

        /* renamed from: a */
        final /* synthetic */ Activity f93356a;

        static {
            Covode.recordClassIndex(47305);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
        /* renamed from: a */
        public final void mo27202a(List<Integer> list) {
        }

        @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
        /* renamed from: a */
        public final void mo27203a(List<Integer> list, int i) {
        }

        /* renamed from: com.ss.android.ugc.aweme.compliance.common.a$a$a */
        public static final class C39593a implements AbstractC34824bg {
            static {
                Covode.recordClassIndex(47306);
            }

            C39593a() {
            }

            @Override // com.p2082ss.android.ugc.aweme.AbstractC34824bg
            /* renamed from: a */
            public final void mo61666a(String str, boolean z) {
                C89219l.m154721d(str, "");
                C39608b.f93373d = true;
                C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.AGE_GATE);
            }
        }

        @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
        /* renamed from: a */
        public final void mo27201a() {
            C31575b.m65862d().mo57201b();
            if (!C31575b.m65862d().mo57200a(this.f93356a, new C39593a())) {
                C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.AGE_GATE);
            }
        }

        C39592a(Activity activity) {
            this.f93356a = activity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.common.a$b */
    public static final class C39594b implements AbstractC17207b.AbstractC17211c {
        static {
            Covode.recordClassIndex(47307);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
        /* renamed from: a */
        public final void mo27202a(List<Integer> list) {
        }

        @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
        /* renamed from: a */
        public final void mo27203a(List<Integer> list, int i) {
        }

        C39594b() {
        }

        @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
        /* renamed from: a */
        public final void mo27201a() {
            C39223a.m79600n().mo68668a();
        }
    }

    private C39591a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.common.a$c */
    public static final class CallableC39595c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f93357a;

        static {
            Covode.recordClassIndex(47308);
        }

        CallableC39595c(ActivityC0945e eVar) {
            this.f93357a = eVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C39591a.m80382b(this.f93357a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.common.a$d */
    public static final class C39596d implements AbstractC39264b {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f93358a;

        static {
            Covode.recordClassIndex(47309);
        }

        @Override // com.p2082ss.android.ugc.aweme.compliance.api.services.agegate.AbstractC39264b
        /* renamed from: a */
        public final void mo68586a() {
            C39591a.m80380a(this.f93358a);
        }

        C39596d(ActivityC0945e eVar) {
            this.f93358a = eVar;
        }
    }

    static {
        Covode.recordClassIndex(47304);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.common.a$e */
    public static final class CallableC39597e<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f93359a;

        static {
            Covode.recordClassIndex(47310);
        }

        CallableC39597e(ActivityC0945e eVar) {
            this.f93359a = eVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C17205a aVar = C17205a.C17206a.f41116a;
            DialogContext.C17204a aVar2 = new DialogContext.C17204a(this.f93359a);
            aVar2.f41106a = AbstractC17207b.EnumC17208a.PERSONALIZED_AD;
            aVar.mo27209a(aVar2.mo27207a(new AbstractC17207b.AbstractC17211c(this) {
                /* class com.p2082ss.android.ugc.aweme.compliance.common.C39591a.CallableC39597e.C395981 */

                /* renamed from: a */
                final /* synthetic */ CallableC39597e f93360a;

                static {
                    Covode.recordClassIndex(47311);
                }

                @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
                /* renamed from: a */
                public final void mo27203a(List<Integer> list, int i) {
                }

                @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
                /* renamed from: a */
                public final void mo27201a() {
                    C39223a.m79593g().mo68660a(this.f93360a.f93359a);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f93360a = r1;
                }

                @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
                /* renamed from: a */
                public final void mo27202a(List<Integer> list) {
                    C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.PERSONALIZED_AD);
                }
            }));
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.common.a$g */
    public static final class CallableC39601g<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f93362a;

        /* renamed from: b */
        final /* synthetic */ boolean f93363b;

        static {
            Covode.recordClassIndex(47314);
        }

        CallableC39601g(ActivityC0945e eVar, boolean z) {
            this.f93362a = eVar;
            this.f93363b = z;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C17205a aVar = C17205a.C17206a.f41116a;
            DialogContext.C17204a aVar2 = new DialogContext.C17204a(this.f93362a);
            aVar2.f41106a = AbstractC17207b.EnumC17208a.PRIVATE_ACCOUNT_TIP;
            aVar.mo27209a(aVar2.mo27207a(new AbstractC17207b.AbstractC17211c(this) {
                /* class com.p2082ss.android.ugc.aweme.compliance.common.C39591a.CallableC39601g.C396021 */

                /* renamed from: a */
                final /* synthetic */ CallableC39601g f93364a;

                static {
                    Covode.recordClassIndex(47315);
                }

                @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
                /* renamed from: a */
                public final void mo27203a(List<Integer> list, int i) {
                }

                @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
                /* renamed from: a */
                public final void mo27201a() {
                    SmartRouter.buildRoute(this.f93364a.f93362a, "//privacyaccounttip").withParam("isFirstLaunch", this.f93364a.f93363b).open();
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f93364a = r1;
                }

                @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
                /* renamed from: a */
                public final void mo27202a(List<Integer> list) {
                    C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.PRIVATE_ACCOUNT_TIP);
                }
            }));
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.common.a$h */
    public static final class CallableC39603h<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f93365a;

        static {
            Covode.recordClassIndex(47316);
        }

        CallableC39603h(ActivityC0945e eVar) {
            this.f93365a = eVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C17205a aVar = C17205a.C17206a.f41116a;
            DialogContext.C17204a aVar2 = new DialogContext.C17204a(this.f93365a);
            aVar2.f41106a = AbstractC17207b.EnumC17208a.TERMS_CONSENT;
            aVar.mo27209a(aVar2.mo27207a(new AbstractC17207b.AbstractC17211c(this) {
                /* class com.p2082ss.android.ugc.aweme.compliance.common.C39591a.CallableC39603h.C396041 */

                /* renamed from: a */
                final /* synthetic */ CallableC39603h f93366a;

                static {
                    Covode.recordClassIndex(47317);
                }

                @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
                /* renamed from: a */
                public final void mo27203a(List<Integer> list, int i) {
                }

                @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
                /* renamed from: a */
                public final void mo27201a() {
                    SmartRouter.buildRoute(this.f93366a.f93365a, "//compliance/terms_consent").open();
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f93366a = r1;
                }

                @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
                /* renamed from: a */
                public final void mo27202a(List<Integer> list) {
                    C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.TERMS_CONSENT);
                }
            }));
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.common.a$f */
    public static final class RunnableC39599f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f93361a;

        static {
            Covode.recordClassIndex(47312);
        }

        public RunnableC39599f(ActivityC0945e eVar) {
            this.f93361a = eVar;
        }

        public final void run() {
            C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.POLICY_NOTICE);
            C17205a aVar = C17205a.C17206a.f41116a;
            DialogContext.C17204a aVar2 = new DialogContext.C17204a(this.f93361a);
            aVar2.f41106a = AbstractC17207b.EnumC17208a.POLICY_NOTICE;
            aVar2.f41110e = AbstractC17207b.EnumC17212d.POLICY_NOTICE;
            aVar.mo27209a(aVar2.mo27207a(new AbstractC17207b.AbstractC17211c() {
                /* class com.p2082ss.android.ugc.aweme.compliance.common.C39591a.RunnableC39599f.C396001 */

                static {
                    Covode.recordClassIndex(47313);
                }

                @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
                /* renamed from: a */
                public final void mo27202a(List<Integer> list) {
                }

                @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
                /* renamed from: a */
                public final void mo27203a(List<Integer> list, int i) {
                }

                @Override // com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b.AbstractC17211c
                /* renamed from: a */
                public final void mo27201a() {
                    C39223a.m79600n().mo68672b();
                }
            }));
        }
    }

    /* renamed from: a */
    private static boolean m80381a() {
        if (!C39275a.m79779a().mo68104b()) {
            return false;
        }
        C39275a.m79779a().mo68105c();
        return true;
    }

    /* renamed from: a */
    public static void m80380a(ActivityC0945e eVar) {
        if (C89219l.m154714a(Looper.getMainLooper(), Looper.myLooper())) {
            C1731i.m5640b(new CallableC39595c(eVar), C1731i.f5562a);
        } else {
            m80382b(eVar);
        }
    }

    /* renamed from: e */
    private static void m80385e(ActivityC0945e eVar) {
        if (!C39275a.m79779a().mo68103a() && C39608b.m80426l()) {
            C1731i.m5640b(new CallableC39603h(eVar), C1731i.f5564c);
        }
    }

    /* renamed from: c */
    private static void m80383c(ActivityC0945e eVar) {
        boolean z;
        if (!C39275a.m79779a().mo68103a()) {
            if (eVar instanceof AbstractC59104k) {
                z = ((AbstractC59104k) eVar).getIsFirstLaunch();
            } else {
                z = false;
            }
            if (C39223a.m79595i().mo68682a()) {
                C1731i.m5640b(new CallableC39601g(eVar, z), C1731i.f5564c);
            }
        }
    }

    /* renamed from: d */
    private static void m80384d(ActivityC0945e eVar) {
        Boolean bool;
        if (!C39275a.m79779a().mo68103a()) {
            AdPersonalitySettings i = C39608b.m80423i();
            if (i != null) {
                bool = i.getNeedPopUp();
            } else {
                bool = null;
            }
            if (C89219l.m154714a((Object) bool, (Object) true)) {
                C1731i.m5640b(new CallableC39597e(eVar), C1731i.f5564c);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r1 != null) goto L_0x001f;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m80382b(androidx.fragment.app.ActivityC0945e r1) {
        /*
            boolean r0 = com.p2082ss.android.ugc.aweme.compliance.common.C39608b.f93373d
            if (r0 == 0) goto L_0x0010
            r0 = 0
            com.p2082ss.android.ugc.aweme.compliance.common.C39608b.f93373d = r0
            com.ss.android.ugc.aweme.compliance.common.a$d r0 = new com.ss.android.ugc.aweme.compliance.common.a$d
            r0.<init>(r1)
            com.p2082ss.android.ugc.aweme.compliance.common.C39608b.m80411a(r0)
            return
        L_0x0010:
            if (r1 != 0) goto L_0x001f
            android.app.Activity r1 = com.bytedance.ies.ugc.appcontext.C17873f.m33102j()
            boolean r0 = r1 instanceof androidx.fragment.app.ActivityC0945e
            if (r0 != 0) goto L_0x001b
            r1 = 0
        L_0x001b:
            androidx.fragment.app.e r1 = (androidx.fragment.app.ActivityC0945e) r1
            if (r1 == 0) goto L_0x002f
        L_0x001f:
            m80383c(r1)
            m80385e(r1)
            m80384d(r1)
            com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService r0 = com.p2082ss.android.ugc.aweme.compliance.api.C39223a.m79589c()
            r0.mo68603a(r1)
        L_0x002f:
            boolean r0 = m80381a()
            if (r0 == 0) goto L_0x0036
            return
        L_0x0036:
            com.ss.android.ugc.aweme.compliance.api.b.a r1 = new com.ss.android.ugc.aweme.compliance.api.b.a
            boolean r0 = com.p2082ss.android.ugc.aweme.compliance.common.C39608b.f93374e
            r0 = r0 ^ 1
            r1.<init>(r0)
            com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c.m141874a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.common.C39591a.m80382b(androidx.fragment.app.e):void");
    }
}
