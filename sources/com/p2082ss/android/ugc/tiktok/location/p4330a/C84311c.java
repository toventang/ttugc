package com.p2082ss.android.ugc.tiktok.location.p4330a;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.bdlocation.p846a.C13153b;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.AbstractC16082i;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.C17205a;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.DialogContext;
import com.bytedance.ies.powerpermissions.AbstractC17765f;
import com.bytedance.ies.powerpermissions.C17770j;
import com.bytedance.ies.powerpermissions.C17773l;
import com.bytedance.ies.powerpermissions.p1240c.C17749a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23029d;
import com.bytedance.tux.dialog.p1713b.C23032e;
import com.bytedance.tux.dialog.p1716e.C23051b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.p2310al.C33491f;
import com.p2082ss.android.ugc.aweme.services.MandatoryLoginService;
import com.p2082ss.android.ugc.tiktok.location.p4331b.C84328b;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tiktok.location.a.c */
public final class C84311c implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    static EnumC84312a f188534a = EnumC84312a.SCENE_BOOT;

    /* renamed from: b */
    static boolean f188535b;

    /* renamed from: c */
    public static final C84311c f188536c = new C84311c();

    /* renamed from: com.ss.android.ugc.tiktok.location.a.c$a */
    enum EnumC84312a {
        SCENE_BOOT,
        SCENE_LOGIN,
        SCENE_SWITCH,
        SCENE_LOGOUT;

        static {
            Covode.recordClassIndex(98242);
        }
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(367, new RunnableC90250g(C84311c.class, "onUserStateChangeEvent", C33491f.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.tiktok.location.a.c$c */
    public static final class C84314c implements AbstractC17765f {
        static {
            Covode.recordClassIndex(98244);
        }

        C84314c() {
        }

        @Override // com.bytedance.ies.powerpermissions.AbstractC17765f
        /* renamed from: a */
        public final void mo28241a(C17749a... aVarArr) {
            C89219l.m154721d(aVarArr, "");
            if (aVarArr.length == 0) {
                C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.LOCATION_PERMISSION);
                return;
            }
            int i = C84323d.f188553a[aVarArr[0].f42426b.ordinal()];
            if (i == 1) {
                C84324e.m145022a(true);
            } else if (i == 2 || i == 3) {
                C84324e.m145022a(false);
                C84325f.m145023a().storeBoolean("has_deny_location_permission_manually", true);
            }
            C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.LOCATION_PERMISSION);
        }
    }

    private C84311c() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tiktok.location.a.c$g */
    public static final class CallableC84319g<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f188548a;

        static {
            Covode.recordClassIndex(98249);
        }

        CallableC84319g(ActivityC0945e eVar) {
            this.f188548a = eVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C17205a aVar = C17205a.C17206a.f41116a;
            DialogContext.C17204a aVar2 = new DialogContext.C17204a(this.f188548a);
            aVar2.f41106a = AbstractC17207b.EnumC17208a.LOCATION_PERMISSION;
            aVar.mo27209a(aVar2.mo27207a(new AbstractC17207b.AbstractC17211c(this) {
                /* class com.p2082ss.android.ugc.tiktok.location.p4330a.C84311c.CallableC84319g.C843201 */

                /* renamed from: a */
                final /* synthetic */ CallableC84319g f188549a;

                static {
                    Covode.recordClassIndex(98250);
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
                    ActivityC0945e eVar = this.f188549a.f188548a;
                    C17773l.f42440d.mo28243a(eVar, PrivacyCert.Builder.Companion.with("bpea-747").usage("we plan to improve the diversity of our ads by location (city-level) and improve its accuracy for state-level, thus we need to apply GPS permission from users to get location information. ").tag("request_location_permission").policies(PrivacyPolicyStore.getLatitudeAndLongitudePrivacyPolicy()).build()).mo28229a("android.permission.ACCESS_FINE_LOCATION").mo28230a(new C84314c());
                    C39162r.onEventV3("system_location_permission_show");
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f188549a = r1;
                }
            }));
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.tiktok.location.a.c$h */
    public static final class CallableC84321h<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ ActivityC0945e f188550a;

        /* renamed from: b */
        final /* synthetic */ boolean f188551b;

        static {
            Covode.recordClassIndex(98251);
        }

        CallableC84321h(ActivityC0945e eVar, boolean z) {
            this.f188550a = eVar;
            this.f188551b = z;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C17205a aVar = C17205a.C17206a.f41116a;
            DialogContext.C17204a aVar2 = new DialogContext.C17204a(this.f188550a);
            aVar2.f41106a = AbstractC17207b.EnumC17208a.LOCATION_PERMISSION_HINT;
            aVar.mo27209a(aVar2.mo27207a(new AbstractC17207b.AbstractC17211c(this) {
                /* class com.p2082ss.android.ugc.tiktok.location.p4330a.C84311c.CallableC84321h.C843221 */

                /* renamed from: a */
                final /* synthetic */ CallableC84321h f188552a;

                static {
                    Covode.recordClassIndex(98252);
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
                    ActivityC0945e eVar = this.f188552a.f188550a;
                    ((C23023b) C23032e.m43444a((C23023b) C23051b.m43468a(C23013a.C23015a.m43405a(eVar), 2131233218).mo37479a(R.string.bux).mo37483b(R.string.buw).mo37482a(false), new C84315d(this.f188552a.f188551b, eVar)).mo37484b(C84317e.f188546a).mo37481a(C84318f.f188547a)).mo37405a().mo37396b().show();
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f188552a = r1;
                }
            }));
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(98241);
    }

    /* renamed from: a */
    public final void mo129334a() {
        Activity j = C17873f.m33102j();
        if (!(j instanceof ActivityC0945e)) {
            j = null;
        }
        ActivityC0945e eVar = (ActivityC0945e) j;
        if (eVar != null) {
            if (C84309b.m145007a() == 1 || C84309b.m145007a() == 2) {
                m145009a(eVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.tiktok.location.a.c$b */
    public static final class C84313b implements AbstractC16082i {

        /* renamed from: a */
        public static final C84313b f188542a = new C84313b();

        static {
            Covode.recordClassIndex(98243);
        }

        C84313b() {
        }

        @Override // com.bytedance.ies.abmock.AbstractC16082i
        /* renamed from: a */
        public final void mo25536a() {
            String str;
            C84311c.f188534a.name();
            Thread.currentThread();
            if (C84311c.f188534a == EnumC84312a.SCENE_BOOT) {
                if (C84309b.m145007a() > 0 && ((Build.VERSION.SDK_INT >= 23 || C84325f.m145024b()) && !C13153b.m23674b())) {
                    C84328b.m145031a(PrivacyCert.Builder.Companion.with("bpea-243").usage("we plan to improve the diversity of our ads by location (city-level) and improve its accuracy for state-level, thus we need to apply GPS permission from users to get location information. ").tag("init_location_sdk_when_launch").policies(PrivacyPolicyStore.getLatitudeAndLongitudePrivacyPolicy()).build());
                    boolean a = C84311c.m145011a(C17867d.m33078a());
                    C33744d dVar = new C33744d();
                    if (a) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    C39162r.m79460a("location_status", dVar.mo59983a("is_open", str).f79943a);
                }
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                if (g.isLogin() || !MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false).shouldShowForcedLogin()) {
                    C84311c.f188536c.mo129334a();
                } else {
                    C84311c.f188535b = true;
                }
            } else if (C84311c.f188534a == EnumC84312a.SCENE_LOGIN && C84311c.f188535b) {
                C84311c.f188536c.mo129334a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.tiktok.location.a.c$e */
    static final class C84317e extends AbstractC89220m implements AbstractC89172b<C23013a, C89391z> {

        /* renamed from: a */
        public static final C84317e f188546a = new C84317e();

        static {
            Covode.recordClassIndex(98247);
        }

        C84317e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23013a aVar) {
            C89219l.m154721d(aVar, "");
            C39162r.onEventV3("location_permission_show");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.tiktok.location.a.c$f */
    static final class C84318f extends AbstractC89220m implements AbstractC89172b<C23013a, C89391z> {

        /* renamed from: a */
        public static final C84318f f188547a = new C84318f();

        static {
            Covode.recordClassIndex(98248);
        }

        C84318f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23013a aVar) {
            C89219l.m154721d(aVar, "");
            C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.LOCATION_PERMISSION_HINT);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static boolean m145011a(Context context) {
        if (context != null) {
            return C17770j.m32957a(context, "android.permission.ACCESS_FINE_LOCATION");
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.tiktok.location.a.c$d */
    static final class C84315d extends AbstractC89220m implements AbstractC89172b<C23029d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ boolean f188543a;

        /* renamed from: b */
        final /* synthetic */ ActivityC0945e f188544b;

        static {
            Covode.recordClassIndex(98245);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84315d(boolean z, ActivityC0945e eVar) {
            super(1);
            this.f188543a = z;
            this.f188544b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23029d dVar) {
            C23029d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            dVar2.mo37423a(R.string.a70, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.tiktok.location.p4330a.C84311c.C84315d.C843161 */

                /* renamed from: a */
                final /* synthetic */ C84315d f188545a;

                static {
                    Covode.recordClassIndex(98246);
                }

                {
                    this.f188545a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    C84325f.m145023a().storeBoolean("has_consented_location_permission", true);
                    C39162r.m79460a("location_permission_result", new C33744d().mo59983a("is_allow", "1").f79943a);
                    if (this.f188545a.f188543a) {
                        C84311c.m145012b(this.f188545a.f188544b);
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public static void m145012b(ActivityC0945e eVar) {
        if (!C84325f.m145025c()) {
            C1731i.m5640b(new CallableC84319g(eVar), C1731i.f5564c);
        }
    }

    @AbstractC90264r
    public final void onUserStateChangeEvent(C33491f fVar) {
        C89219l.m154721d(fVar, "");
        int i = fVar.f79560a;
        if (i == 0) {
            f188534a = EnumC84312a.SCENE_LOGIN;
        } else if (i == 1) {
            f188534a = EnumC84312a.SCENE_SWITCH;
        } else if (i == 2) {
            f188534a = EnumC84312a.SCENE_LOGOUT;
        }
    }

    /* renamed from: a */
    public static void m145009a(ActivityC0945e eVar) {
        if (!eVar.isFinishing()) {
            if (Build.VERSION.SDK_INT < 23) {
                if (C84308a.m145006a()) {
                    m145010a(eVar, false);
                }
            } else if (!m145011a((Context) eVar)) {
                if (C84308a.m145006a()) {
                    m145010a(eVar, true);
                } else {
                    m145012b(eVar);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m145010a(ActivityC0945e eVar, boolean z) {
        if (!C84325f.m145024b()) {
            C1731i.m5640b(new CallableC84321h(eVar, z), C1731i.f5564c);
        } else if (z) {
            m145012b(eVar);
        }
    }
}
