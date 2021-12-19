package com.p2082ss.android.ugc.aweme.compliance.business.p2641a;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.C17205a;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.DialogContext;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.app.services.HybridABInfoService;
import com.p2082ss.android.ugc.aweme.appsflyer.AppsflyerImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.consent.AbstractC39273a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.p2082ss.android.ugc.aweme.compliance.business.termspp.C39586c;
import com.p2082ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialog;
import com.p2082ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialogV2;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.sec.SecApiImpl;
import com.p2082ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89047am;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.a.c */
public final class C39300c {

    /* renamed from: e */
    public static final AbstractC89244h f92778e = C89250i.m154774a(EnumC89331m.SYNCHRONIZED, C39302b.f92789a);

    /* renamed from: f */
    public static final Keva f92779f;

    /* renamed from: g */
    public static boolean f92780g;

    /* renamed from: h */
    public static final Set<String> f92781h = C89047am.m154438a((Object[]) new String[]{"AL", "AD", "AT", "BE", "BG", "HR", "CZ", "DK", "EE", "FO", "FI", "FR", "DE", "GI", "GR", "GG", "VA", "HU", "IS", "IE", "IM", "IT", "JE", "LV", "LI", "LT", "LU", "MT", "MC", "NL", "MK", "NO", "PL", "PT", "RO", "SM", "RS", "SK", "SI", "ES", "SJ", "SE", "CH", "GB", "AX"});

    /* renamed from: i */
    public static final String f92782i = "IT";

    /* renamed from: j */
    public static final C39301a f92783j = new C39301a((byte) 0);

    /* renamed from: k */
    private static final String f92784k = "tpc_consent";

    /* renamed from: a */
    public DialogC39292b f92785a;

    /* renamed from: b */
    public String f92786b;

    /* renamed from: c */
    public AbstractC39273a f92787c;

    /* renamed from: d */
    public long f92788d;

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.a.c$a */
    public static final class C39301a {
        static {
            Covode.recordClassIndex(46980);
        }

        /* renamed from: a */
        public static C39300c m79951a() {
            return (C39300c) C39300c.f92778e.getValue();
        }

        private C39301a() {
        }

        /* renamed from: b */
        public static boolean m79954b() {
            if (C39300c.f92779f.getBoolean("is_consent_accepted", false) || C39300c.f92779f.getBoolean("user_logged_in_atleast_once", false)) {
                return true;
            }
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (g.isLogin()) {
                return true;
            }
            return false;
        }

        /* renamed from: c */
        public static ITpcConsentService.EnumC39272a m79955c() {
            String a = C58071d.m104907a();
            C89219l.m154716b(a, "");
            Locale locale = Locale.ROOT;
            C89219l.m154716b(locale, "");
            Objects.requireNonNull(a, "null cannot be cast to non-null type java.lang.String");
            String upperCase = a.toUpperCase(locale);
            C89219l.m154716b(upperCase, "");
            if (C89219l.m154714a((Object) upperCase, (Object) "US")) {
                return ITpcConsentService.EnumC39272a.US;
            }
            if (C39300c.f92781h.contains(upperCase)) {
                return ITpcConsentService.EnumC39272a.EU;
            }
            if (C89219l.m154714a((Object) upperCase, (Object) "KR")) {
                return ITpcConsentService.EnumC39272a.KR;
            }
            return ITpcConsentService.EnumC39272a.ROW;
        }

        /* renamed from: d */
        public static boolean m79956d() {
            boolean z;
            if (!C39300c.f92779f.contains("have_passed_consent")) {
                Keva keva = C39300c.f92779f;
                if ((!m79954b() || C80580in.m139687c()) && !GuestModeServiceImpl.m65990d().mo57219c()) {
                    z = false;
                } else {
                    z = true;
                }
                keva.storeBoolean("have_passed_consent", z);
            }
            if (!C39300c.f92779f.getBoolean("have_passed_consent", false)) {
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                if (!g.isLogin() || C80580in.m139687c()) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ C39301a(byte b) {
            this();
        }

        /* renamed from: b */
        public static void m79953b(int i) {
            C39300c.f92779f.storeInt("consent_reason", i);
        }

        /* renamed from: a */
        public static void m79952a(int i) {
            if (!C39300c.f92779f.getBoolean("have_passed_consent", false)) {
                SplashAdServiceImpl.m33397i().mo28721g();
            }
            C39300c.f92779f.storeBoolean("have_passed_consent", true);
            m79953b(i);
        }
    }

    private C39300c() {
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.a.c$b */
    static final class C39302b extends AbstractC89220m implements AbstractC89171a<C39300c> {

        /* renamed from: a */
        public static final C39302b f92789a = new C39302b();

        static {
            Covode.recordClassIndex(46981);
        }

        C39302b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C39300c invoke() {
            return new C39300c((byte) 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.a.c$c */
    public static final class CallableC39303c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C39300c f92790a;

        /* renamed from: b */
        final /* synthetic */ Activity f92791b;

        static {
            Covode.recordClassIndex(46982);
        }

        public CallableC39303c(C39300c cVar, Activity activity) {
            this.f92790a = cVar;
            this.f92791b = activity;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C17205a aVar = C17205a.C17206a.f41116a;
            Activity activity = this.f92791b;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            DialogContext.C17204a aVar2 = new DialogContext.C17204a((ActivityC0945e) activity);
            aVar2.f41106a = AbstractC17207b.EnumC17208a.TERMS_PRIVACY_COOKIE;
            aVar2.f41110e = AbstractC17207b.EnumC17212d.TERMS_PRIVACY_COOKIE;
            aVar.mo27209a(aVar2.mo27207a(new AbstractC17207b.AbstractC17211c(this) {
                /* class com.p2082ss.android.ugc.aweme.compliance.business.p2641a.C39300c.CallableC39303c.C393041 */

                /* renamed from: a */
                final /* synthetic */ CallableC39303c f92792a;

                static {
                    Covode.recordClassIndex(46983);
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
                    boolean z;
                    if (((ActivityC0945e) this.f92792a.f92791b).isFinishing()) {
                        C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.TERMS_PRIVACY_COOKIE);
                        return;
                    }
                    this.f92792a.f92790a.f92788d = System.currentTimeMillis();
                    this.f92792a.f92790a.f92785a = new DialogC39292b(this.f92792a.f92791b);
                    DialogC39292b bVar = this.f92792a.f92790a.f92785a;
                    if (bVar != null) {
                        bVar.setOnDismissListener(new DialogInterface$OnDismissListenerC39305a(this));
                    }
                    DialogC39292b bVar2 = this.f92792a.f92790a.f92785a;
                    if (bVar2 != null) {
                        if (C39301a.m79955c() == ITpcConsentService.EnumC39272a.EU) {
                            z = true;
                        } else {
                            z = false;
                        }
                        bVar2.f92770a = z;
                    }
                    DialogC39292b bVar3 = this.f92792a.f92790a.f92785a;
                    if (bVar3 == null || bVar3.isShowing()) {
                        DialogC39292b bVar4 = this.f92792a.f92790a.f92785a;
                        if (bVar4 != null) {
                            bVar4.mo68733a();
                            return;
                        }
                        return;
                    }
                    DialogC39292b bVar5 = this.f92792a.f92790a.f92785a;
                    if (bVar5 != null) {
                        bVar5.show();
                    }
                    SpecActServiceImpl.m131497i().mo118026a(true);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f92792a = r1;
                }

                /* renamed from: com.ss.android.ugc.aweme.compliance.business.a.c$c$1$a */
                static final class DialogInterface$OnDismissListenerC39305a implements DialogInterface.OnDismissListener {

                    /* renamed from: a */
                    final /* synthetic */ C393041 f92793a;

                    static {
                        Covode.recordClassIndex(46984);
                    }

                    DialogInterface$OnDismissListenerC39305a(C393041 r1) {
                        this.f92793a = r1;
                    }

                    public final void onDismiss(DialogInterface dialogInterface) {
                        C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.TERMS_PRIVACY_COOKIE);
                        SpecActServiceImpl.m131497i().mo118026a(false);
                    }
                }
            }));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.a.c$d */
    public static final class CallableC39306d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C39300c f92794a;

        /* renamed from: b */
        final /* synthetic */ Activity f92795b;

        static {
            Covode.recordClassIndex(46985);
        }

        public CallableC39306d(C39300c cVar, Activity activity) {
            this.f92794a = cVar;
            this.f92795b = activity;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C17205a aVar = C17205a.C17206a.f41116a;
            Activity activity = this.f92795b;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            DialogContext.C17204a aVar2 = new DialogContext.C17204a((ActivityC0945e) activity);
            aVar2.f41106a = AbstractC17207b.EnumC17208a.TERMS_PRIVACY_COOKIE;
            aVar2.f41110e = AbstractC17207b.EnumC17212d.TERMS_PRIVACY_COOKIE;
            aVar.mo27209a(aVar2.mo27207a(new AbstractC17207b.AbstractC17211c(this) {
                /* class com.p2082ss.android.ugc.aweme.compliance.business.p2641a.C39300c.CallableC39306d.C393071 */

                /* renamed from: a */
                final /* synthetic */ CallableC39306d f92796a;

                static {
                    Covode.recordClassIndex(46986);
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
                    if (((ActivityC0945e) this.f92796a.f92795b).isFinishing()) {
                        C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.TERMS_PRIVACY_COOKIE);
                        return;
                    }
                    this.f92796a.f92794a.f92788d = System.currentTimeMillis();
                    Activity activity = this.f92796a.f92795b;
                    C89219l.m154721d(activity, "");
                    if (C39586c.m80369a() == 0) {
                        Intent intent = new Intent(activity, TermsConsentCombineDialog.class);
                        intent.putExtra("style", 3);
                        C84349a.m145093a(intent, activity);
                        activity.startActivity(intent);
                        return;
                    }
                    C89219l.m154721d(activity, "");
                    Intent intent2 = new Intent(activity, TermsConsentCombineDialogV2.class);
                    C84349a.m145093a(intent2, activity);
                    activity.startActivity(intent2);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f92796a = r1;
                }
            }));
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    private final void m79948b() {
        mo68745a(true);
        AbstractC39273a aVar = this.f92787c;
        if (aVar != null) {
            aVar.mo68648j();
        }
        C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.TERMS_PRIVACY_COOKIE);
        f92779f.storeBoolean("is_consent_accepted", true);
        C39301a.m79952a(6);
        C81079v.m140776O().mo123950y();
        AppsflyerImpl.m69447b().mo60155a();
    }

    /* renamed from: a */
    public final void mo68744a() {
        m79948b();
        SecApiImpl.m119993a().updateCollectMode(null);
        int i = C39308d.f92797a[C39301a.m79955c().ordinal()];
        if (i == 1) {
            C39223a.m79600n().mo68671a("kr_dnu_consent_box", "v1803");
        } else if (i != 2) {
            C39223a.m79600n().mo68671a("row_dnu_consent_box", "v1");
        } else {
            C39223a.m79600n().mo68671a("eu_dnu_consent_box", "v1");
        }
    }

    static {
        Covode.recordClassIndex(46979);
        Keva repo = Keva.getRepo("tpc_consent");
        f92779f = repo;
        if (!repo.contains("is_consent_accepted")) {
            repo.storeBoolean("is_consent_accepted", false);
        }
    }

    public /* synthetic */ C39300c(byte b) {
        this();
    }

    /* renamed from: a */
    public final void mo68745a(boolean z) {
        String str;
        long j;
        C33744d a = new C33744d().mo59983a("enter_from", this.f92786b).mo59981a("stay_time", System.currentTimeMillis() - this.f92788d);
        if (z) {
            str = "confirm";
        } else {
            str = "background";
        }
        C33744d a2 = a.mo59983a("result", str);
        Integer a3 = HybridABInfoService.m69246b().mo60084a();
        if (a3 != null) {
            a2.mo59980a("is_ab_backend_resp_received", a3.intValue());
        }
        C39162r.m79460a("confirm_consent_box", a2.f79943a);
        if (z) {
            j = 0;
        } else {
            j = -1;
        }
        this.f92788d = j;
    }
}
