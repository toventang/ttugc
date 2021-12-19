package com.p2082ss.android.ugc.aweme.account.login.twostep;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sdk.p1625a.p1626a.p1628b.AbstractC22300f;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22323j;
import com.bytedance.sdk.p1625a.p1641d.C22355a;
import com.bytedance.sdk.p1625a.p1644g.C22400i;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1722h.C23155d;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.AbstractC34913br;
import com.p2082ss.android.ugc.aweme.AbstractC35418cb;
import com.p2082ss.android.ugc.aweme.AbstractC40763cv;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.login.DialogC31962m;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32176a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.BaseBindService;
import com.p2082ss.android.ugc.aweme.services.TwoStepVerificationService;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import com.p2082ss.android.ugc.aweme.utils.C80273bt;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity */
public final class TwoStepVerificationManageActivity extends ActivityC17312a {

    /* renamed from: a */
    public C32176a f76654a;

    /* renamed from: b */
    public C32292u f76655b;

    /* renamed from: c */
    private final AbstractC89244h f76656c = C89250i.m154773a((AbstractC89171a) new C32132h(this));

    /* renamed from: d */
    private final AbstractC89244h f76657d = C89250i.m154773a((AbstractC89171a) new C32126c(this));

    /* renamed from: e */
    private final AbstractC89244h f76658e = C89250i.m154773a((AbstractC89171a) new C32130f(this));

    /* renamed from: f */
    private final AbstractC89244h f76659f = C89250i.m154773a((AbstractC89171a) new C32131g(this));

    /* renamed from: g */
    private final TwoStepVerificationService f76660g;

    /* renamed from: h */
    private HashMap f76661h;

    static {
        Covode.recordClassIndex(38886);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f76661h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f76661h == null) {
            this.f76661h = new HashMap();
        }
        View view = (View) this.f76661h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f76661h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final DialogC31962m mo58106a() {
        return (DialogC31962m) this.f76656c.getValue();
    }

    /* renamed from: b */
    public final String mo58115b() {
        return (String) this.f76657d.getValue();
    }

    /* renamed from: c */
    public final boolean mo58118c() {
        return ((Boolean) this.f76659f.getValue()).booleanValue();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void mo58114a(boolean z, List<String> list, int i) {
        C80273bt.m139145a(mo58106a());
        C22355a.C22356a aVar = new C22355a.C22356a();
        aVar.f52826a = "/passport/shark/safe_verify/verification_manage/";
        new C22400i(this, aVar.mo36706a("scene", "two_step_manage").mo36709b(), new C32128e(this, i, list, z)).mo36736d();
    }

    /* renamed from: a */
    public final void mo58113a(boolean z, String str, String str2, List<String> list, int i) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(list, "");
        if (!mo58118c() || this.f76655b == null) {
            User f = C36085cj.m73552f();
            if (list.contains("mobile_sms_verify") && !C32179ab.f76808b) {
                m66504b(z, "trust_environment", AbstractC35418cb.EnumC35419a.SMS, str2, list, i);
            } else if (list.contains("email_verify") && !C32179ab.f76809c) {
                m66504b(z, "trust_environment", AbstractC35418cb.EnumC35419a.EMAIL, str2, list, i);
            } else if (!list.contains("pwd_verify") || C32179ab.f76807a) {
                C89219l.m154716b(f, "");
                if (!f.isHasEmail()) {
                    m66505c(z, str, str2, list, i);
                } else if (!f.isPhoneBinded()) {
                    m66506d(z, str, str2, list, i);
                } else {
                    mo58117b(z, str, str2, list, i);
                }
            } else {
                m66504b(z, "trust_environment", AbstractC35418cb.EnumC35419a.PASSWORD, str2, list, i);
            }
        } else if (list.contains("mobile_sms_verify") && !C32179ab.f76808b) {
            m66503a(z, "trust_environment", AbstractC35418cb.EnumC35419a.SMS, str2, list, i);
        } else if (list.contains("email_verify") && !C32179ab.f76809c) {
            m66503a(z, "trust_environment", AbstractC35418cb.EnumC35419a.EMAIL, str2, list, i);
        } else if (!list.contains("pwd_verify") || C32179ab.f76807a) {
            C32292u uVar = this.f76655b;
            if (uVar == null) {
                C89219l.m154715b();
            }
            if (!C89219l.m154714a((Object) uVar.getHas_email(), (Object) true)) {
                m66505c(z, str, str2, list, i);
                return;
            }
            C32292u uVar2 = this.f76655b;
            if (uVar2 == null) {
                C89219l.m154715b();
            }
            if (!C89219l.m154714a((Object) uVar2.getHas_mobile(), (Object) true)) {
                m66506d(z, str, str2, list, i);
            } else {
                mo58117b(z, str, str2, list, i);
            }
        } else {
            m66503a(z, "trust_environment", AbstractC35418cb.EnumC35419a.PASSWORD, str2, list, i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$h */
    static final class C32132h extends AbstractC89220m implements AbstractC89171a<DialogC31962m> {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerificationManageActivity f76681a;

        static {
            Covode.recordClassIndex(38896);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32132h(TwoStepVerificationManageActivity twoStepVerificationManageActivity) {
            super(0);
            this.f76681a = twoStepVerificationManageActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DialogC31962m invoke() {
            return new DialogC31962m(this.f76681a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$c */
    static final class C32126c extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerificationManageActivity f76672a;

        static {
            Covode.recordClassIndex(38890);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32126c(TwoStepVerificationManageActivity twoStepVerificationManageActivity) {
            super(0);
            this.f76672a = twoStepVerificationManageActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String a = m66520a(this.f76672a.getIntent(), "enter_from");
            if (a == null) {
                return "";
            }
            return a;
        }

        /* renamed from: a */
        private static String m66520a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$f */
    static final class C32130f extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerificationManageActivity f76679a;

        static {
            Covode.recordClassIndex(38894);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32130f(TwoStepVerificationManageActivity twoStepVerificationManageActivity) {
            super(0);
            this.f76679a = twoStepVerificationManageActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String a = m66523a(this.f76679a.getIntent(), "interstitial_token");
            if (a == null) {
                return "";
            }
            return a;
        }

        /* renamed from: a */
        private static String m66523a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$g */
    static final class C32131g extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerificationManageActivity f76680a;

        static {
            Covode.recordClassIndex(38895);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32131g(TwoStepVerificationManageActivity twoStepVerificationManageActivity) {
            super(0);
            this.f76680a = twoStepVerificationManageActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(!TextUtils.isEmpty(m66524a(this.f76680a.getIntent(), "interstitial_token")));
        }

        /* renamed from: a */
        private static String m66524a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    public TwoStepVerificationManageActivity() {
        AbstractC35418cb m = C36085cj.f85262b.mo57077m();
        Objects.requireNonNull(m, "null cannot be cast to non-null type com.ss.android.ugc.aweme.services.TwoStepVerificationService");
        this.f76660g = (TwoStepVerificationService) m;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$k */
    public static final class C32137k implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerificationManageActivity f76686a;

        static {
            Covode.recordClassIndex(38901);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32137k(TwoStepVerificationManageActivity twoStepVerificationManageActivity) {
            this.f76686a = twoStepVerificationManageActivity;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            this.f76686a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$q */
    public static final class C32145q implements AbstractC40763cv {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerificationManageActivity f76709a;

        /* renamed from: b */
        final /* synthetic */ boolean f76710b;

        /* renamed from: c */
        final /* synthetic */ String f76711c;

        /* renamed from: d */
        final /* synthetic */ String f76712d;

        /* renamed from: e */
        final /* synthetic */ List f76713e;

        /* renamed from: f */
        final /* synthetic */ int f76714f;

        static {
            Covode.recordClassIndex(38909);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC40763cv
        /* renamed from: a */
        public final void mo57507a(String str) {
            this.f76709a.mo58109a((Integer) null, str);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC40763cv
        /* renamed from: a */
        public final void mo57508a(boolean z) {
            if (z) {
                C32179ab.f76807a = true;
                this.f76709a.mo58113a(this.f76710b, this.f76711c, this.f76712d, this.f76713e, this.f76714f);
                return;
            }
            AbstractC34913br i = C36085cj.f85262b.mo57073i();
            TwoStepVerificationManageActivity twoStepVerificationManageActivity = this.f76709a;
            Bundle bundle = new Bundle();
            bundle.putBoolean("show_skip", false);
            i.setPassword(twoStepVerificationManageActivity, bundle, new C32146a(this));
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$q$a */
        static final class C32146a implements IAccountService.AbstractC31277g {

            /* renamed from: a */
            final /* synthetic */ C32145q f76715a;

            static {
                Covode.recordClassIndex(38910);
            }

            C32146a(C32145q qVar) {
                this.f76715a = qVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
            public final void onResult(int i, int i2, Object obj) {
                if (i2 == 1) {
                    C32179ab.f76807a = true;
                    this.f76715a.f76709a.mo58113a(this.f76715a.f76710b, this.f76715a.f76711c, this.f76715a.f76712d, this.f76715a.f76713e, this.f76715a.f76714f);
                }
                C80273bt.m139146b(this.f76715a.f76709a.mo58106a());
            }
        }

        C32145q(TwoStepVerificationManageActivity twoStepVerificationManageActivity, boolean z, String str, String str2, List list, int i) {
            this.f76709a = twoStepVerificationManageActivity;
            this.f76710b = z;
            this.f76711c = str;
            this.f76712d = str2;
            this.f76713e = list;
            this.f76714f = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$x */
    public static final class C32153x implements AbstractC40763cv {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerificationManageActivity f76752a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f76753b;

        /* renamed from: c */
        final /* synthetic */ String f76754c;

        static {
            Covode.recordClassIndex(38917);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC40763cv
        /* renamed from: a */
        public final void mo57507a(String str) {
            this.f76752a.mo58109a((Integer) null, str);
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC40763cv
        /* renamed from: a */
        public final void mo57508a(boolean z) {
            User f = C36085cj.m73552f();
            if (z) {
                C36085cj.f85262b.mo57073i().verifyPassword(this.f76752a, "settings_security", new Bundle(), new C32154a(this));
                return;
            }
            C89219l.m154716b(f, "");
            if (f.isPhoneBinded()) {
                C36085cj.m73554h().verifyMobileForTicket(this.f76752a, "two_step_verification", "verify_for_ticket", null, new C32155b(this));
            } else if (f.isEmailVerified() || f.isHasEmail()) {
                C36085cj.m73554h().verifyEmailForTicket(this.f76752a, "two_step_verification", "verify_for_ticket", null, new C32156c(this));
            } else {
                this.f76753b.invoke(new C32123a(this.f76754c, "oauth_verify"));
            }
        }

        C32153x(TwoStepVerificationManageActivity twoStepVerificationManageActivity, AbstractC89172b bVar, String str) {
            this.f76752a = twoStepVerificationManageActivity;
            this.f76753b = bVar;
            this.f76754c = str;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$x$a */
        static final class C32154a implements IAccountService.AbstractC31277g {

            /* renamed from: a */
            final /* synthetic */ C32153x f76755a;

            static {
                Covode.recordClassIndex(38918);
            }

            C32154a(C32153x xVar) {
                this.f76755a = xVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
            public final void onResult(int i, int i2, Object obj) {
                String str;
                if (i2 == 1) {
                    C32258q.m66620a("password", "pass", "settings_security");
                    AbstractC89172b bVar = this.f76755a.f76753b;
                    if (!(obj instanceof Bundle)) {
                        obj = null;
                    }
                    Bundle bundle = (Bundle) obj;
                    if (bundle == null || (str = bundle.getString("ticket")) == null) {
                        str = "";
                    }
                    C89219l.m154716b(str, "");
                    bVar.invoke(new C32123a(str, "pwd_verify"));
                    return;
                }
                C32258q.m66620a("password", "fail", "settings_security");
                C80273bt.m139146b(this.f76755a.f76752a.mo58106a());
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$x$b */
        static final class C32155b implements IAccountService.AbstractC31277g {

            /* renamed from: a */
            final /* synthetic */ C32153x f76756a;

            static {
                Covode.recordClassIndex(38919);
            }

            C32155b(C32153x xVar) {
                this.f76756a = xVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
            public final void onResult(int i, int i2, Object obj) {
                String str;
                if (i2 == 1) {
                    C32258q.m66620a("sms", "pass", "settings_security");
                    AbstractC89172b bVar = this.f76756a.f76753b;
                    if (!(obj instanceof Bundle)) {
                        obj = null;
                    }
                    Bundle bundle = (Bundle) obj;
                    if (bundle == null || (str = bundle.getString("ticket")) == null) {
                        str = "";
                    }
                    C89219l.m154716b(str, "");
                    bVar.invoke(new C32123a(str, "mobile_sms_verify"));
                    return;
                }
                C32258q.m66620a("sms", "fail", "settings_security");
                C80273bt.m139146b(this.f76756a.f76752a.mo58106a());
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$x$c */
        static final class C32156c implements IAccountService.AbstractC31277g {

            /* renamed from: a */
            final /* synthetic */ C32153x f76757a;

            static {
                Covode.recordClassIndex(38920);
            }

            C32156c(C32153x xVar) {
                this.f76757a = xVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
            public final void onResult(int i, int i2, Object obj) {
                String str;
                if (i2 == 1) {
                    C32258q.m66620a("email", "pass", "settings_security");
                    AbstractC89172b bVar = this.f76757a.f76753b;
                    if (!(obj instanceof Bundle)) {
                        obj = null;
                    }
                    Bundle bundle = (Bundle) obj;
                    if (bundle == null || (str = bundle.getString("ticket")) == null) {
                        str = "";
                    }
                    C89219l.m154716b(str, "");
                    bVar.invoke(new C32123a(str, "email_verify"));
                    return;
                }
                C32258q.m66620a("email", "fail", "settings_security");
                C80273bt.m139146b(this.f76757a.f76752a.mo58106a());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$j */
    static final class View$OnClickListenerC32136j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerificationManageActivity f76685a;

        static {
            Covode.recordClassIndex(38900);
        }

        View$OnClickListenerC32136j(TwoStepVerificationManageActivity twoStepVerificationManageActivity) {
            this.f76685a = twoStepVerificationManageActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f76685a.mo58112a(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$m */
    public static final class C32139m<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerificationManageActivity f76689a;

        /* renamed from: b */
        final /* synthetic */ String f76690b;

        /* renamed from: c */
        final /* synthetic */ String f76691c;

        static {
            Covode.recordClassIndex(38903);
        }

        C32139m(TwoStepVerificationManageActivity twoStepVerificationManageActivity, String str, String str2) {
            this.f76689a = twoStepVerificationManageActivity;
            this.f76690b = str;
            this.f76691c = str2;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$m$a */
        static final class C32140a extends AbstractC89220m implements AbstractC89172b<C32123a, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C32139m f76692a;

            static {
                Covode.recordClassIndex(38904);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32140a(C32139m mVar) {
                super(1);
                this.f76692a = mVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C32123a aVar) {
                C32123a aVar2 = aVar;
                C89219l.m154721d(aVar2, "");
                this.f76692a.f76689a.mo58110a(this.f76692a.f76690b, aVar2.f76662a, C32258q.m66615a(aVar2.f76663b));
                return C89391z.f203057a;
            }
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<C32176a> iVar) {
            Integer num;
            String str;
            if (!C80214ai.m139043a(iVar)) {
                this.f76689a.mo58109a((Integer) null, "");
                return null;
            }
            C89219l.m154716b(iVar, "");
            C32176a d = iVar.mo5545d();
            if (!C89361p.m154872a("success", d.getMessage(), true) || d.getData() == null) {
                C32176a.C32177a data = d.getData();
                if (data != null) {
                    num = data.getErrorCode();
                } else {
                    num = null;
                }
                C32176a.C32177a data2 = d.getData();
                if (data2 != null) {
                    str = data2.getErrorDescription();
                } else {
                    str = null;
                }
                if (num != null && num.intValue() == 1356) {
                    this.f76689a.mo58108a(new C32140a(this), "");
                } else {
                    this.f76689a.mo58109a(num, str);
                }
                return null;
            }
            boolean a = C89219l.m154714a((Object) this.f76690b, (Object) "mobile_sms_verify");
            boolean a2 = C89219l.m154714a((Object) this.f76690b, (Object) "email_verify");
            boolean a3 = C89219l.m154714a((Object) this.f76690b, (Object) "pwd_verify");
            String b = this.f76689a.mo58115b();
            C89219l.m154716b(b, "");
            C32258q.m66618a("remove", a ? 1 : 0, a2 ? 1 : 0, a3 ? 1 : 0, b, this.f76691c);
            TwoStepVerificationManageActivity twoStepVerificationManageActivity = this.f76689a;
            C89219l.m154716b(d, "");
            twoStepVerificationManageActivity.mo58107a(d);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$p */
    public static final class C32143p<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerificationManageActivity f76705a;

        /* renamed from: b */
        final /* synthetic */ String f76706b;

        /* renamed from: c */
        final /* synthetic */ String f76707c;

        static {
            Covode.recordClassIndex(38907);
        }

        C32143p(TwoStepVerificationManageActivity twoStepVerificationManageActivity, String str, String str2) {
            this.f76705a = twoStepVerificationManageActivity;
            this.f76706b = str;
            this.f76707c = str2;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$p$a */
        static final class C32144a extends AbstractC89220m implements AbstractC89172b<C32123a, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C32143p f76708a;

            static {
                Covode.recordClassIndex(38908);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32144a(C32143p pVar) {
                super(1);
                this.f76708a = pVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C32123a aVar) {
                C32123a aVar2 = aVar;
                C89219l.m154721d(aVar2, "");
                this.f76708a.f76705a.mo58116b(this.f76708a.f76706b, aVar2.f76662a, C32258q.m66615a(aVar2.f76663b));
                return C89391z.f203057a;
            }
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<C32176a> iVar) {
            Integer num;
            String str;
            if (!C80214ai.m139043a(iVar)) {
                this.f76705a.mo58109a((Integer) null, "");
                return null;
            }
            C89219l.m154716b(iVar, "");
            C32176a d = iVar.mo5545d();
            if (!C89361p.m154872a("success", d.getMessage(), true) || d.getData() == null) {
                C32176a.C32177a data = d.getData();
                if (data != null) {
                    num = data.getErrorCode();
                } else {
                    num = null;
                }
                C32176a.C32177a data2 = d.getData();
                if (data2 != null) {
                    str = data2.getErrorDescription();
                } else {
                    str = null;
                }
                if (num != null && num.intValue() == 1356) {
                    this.f76705a.mo58108a(new C32144a(this), "");
                } else {
                    this.f76705a.mo58109a(num, str);
                }
                return null;
            }
            String b = this.f76705a.mo58115b();
            C89219l.m154716b(b, "");
            C32258q.m66618a("turn_off", 1, 1, 1, b, this.f76707c);
            C32179ab.f76807a = false;
            C32179ab.f76808b = false;
            C32179ab.f76809c = false;
            TwoStepVerificationManageActivity twoStepVerificationManageActivity = this.f76705a;
            C89219l.m154716b(d, "");
            twoStepVerificationManageActivity.mo58107a(d);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$i */
    static final class C32133i extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C32133i f76682a = new C32133i();

        static {
            Covode.recordClassIndex(38897);
        }

        C32133i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C321341.f76683a);
            baseActivityViewModel2.config(C321352.f76684a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$e */
    public static final class C32128e extends AbstractC22300f {

        /* renamed from: c */
        final /* synthetic */ TwoStepVerificationManageActivity f76674c;

        /* renamed from: d */
        final /* synthetic */ int f76675d;

        /* renamed from: e */
        final /* synthetic */ List f76676e;

        /* renamed from: f */
        final /* synthetic */ boolean f76677f;

        static {
            Covode.recordClassIndex(38892);
        }

        /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$e$a */
        static final class C32129a extends AbstractC89220m implements AbstractC89172b<C32123a, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C32128e f76678a;

            static {
                Covode.recordClassIndex(38893);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32129a(C32128e eVar) {
                super(1);
                this.f76678a = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C32123a aVar) {
                C32123a aVar2 = aVar;
                C89219l.m154721d(aVar2, "");
                this.f76678a.f76674c.mo58113a(this.f76678a.f76677f, C32258q.m66615a(aVar2.f76663b), aVar2.f76662a, this.f76678a.f76676e, this.f76678a.f76675d);
                return C89391z.f203057a;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
        @Override // com.bytedance.sdk.p1625a.AbstractC22346c
        /* renamed from: e */
        public final /* synthetic */ void mo36686e(C22323j jVar) {
            String str;
            Boolean bool;
            Boolean bool2;
            String email;
            String mobile;
            C22323j jVar2 = jVar;
            String str2 = "";
            C89219l.m154721d(jVar2, str2);
            int i = this.f76675d;
            List list = this.f76676e;
            boolean z = jVar2.f52767k;
            C89219l.m154721d(list, str2);
            C89219l.m154721d("settings_security", str2);
            boolean contains = list.contains("mobile_sms_verify");
            boolean contains2 = list.contains("pwd_verify");
            boolean contains3 = list.contains("email_verify");
            C33744d a = C32258q.m66614a();
            if (i == 1) {
                str = "new";
            } else {
                str = "backup";
            }
            C39162r.m79460a("twosv_setup_method_add_submit", a.mo59983a(StringSet.type, str).mo59982a("is_sms_selected", Boolean.valueOf(contains)).mo59982a("is_email_selected", Boolean.valueOf(contains3)).mo59982a("is_pw_selected", Boolean.valueOf(contains2)).mo59982a("is_trusted", Boolean.valueOf(z)).mo59983a("enter_from", "settings_security").f79943a);
            if (jVar2.f52767k) {
                TwoStepVerificationManageActivity twoStepVerificationManageActivity = this.f76674c;
                boolean z2 = this.f76677f;
                String str3 = jVar2.f52766j;
                C89219l.m154716b(str3, str2);
                twoStepVerificationManageActivity.mo58113a(z2, "trust_environment", str3, this.f76676e, this.f76675d);
                return;
            }
            C32129a aVar = new C32129a(this);
            if (this.f76674c.mo58118c()) {
                TwoStepVerificationManageActivity twoStepVerificationManageActivity2 = this.f76674c;
                String str4 = jVar2.f52766j;
                C89219l.m154716b(str4, str2);
                C32292u uVar = twoStepVerificationManageActivity2.f76655b;
                Boolean bool3 = null;
                if (uVar != null) {
                    bool = uVar.getHas_pwd();
                } else {
                    bool = null;
                }
                if (C89219l.m154714a((Object) bool, (Object) true)) {
                    C36085cj.f85262b.mo57073i().verifyPassword(twoStepVerificationManageActivity2, "settings_security", new Bundle(), new C32157y(twoStepVerificationManageActivity2, aVar));
                    return;
                }
                C32292u uVar2 = twoStepVerificationManageActivity2.f76655b;
                if (uVar2 != null) {
                    bool2 = uVar2.getHas_mobile();
                } else {
                    bool2 = null;
                }
                if (C89219l.m154714a((Object) bool2, (Object) true)) {
                    BaseBindService h = C36085cj.m73554h();
                    C32292u uVar3 = twoStepVerificationManageActivity2.f76655b;
                    if (!(uVar3 == null || (mobile = uVar3.getMobile()) == null)) {
                        str2 = mobile;
                    }
                    h.verifyMobileWithWorkflowTokenForTicket(twoStepVerificationManageActivity2, "two_step_verification", "verify_for_ticket", str2, null, new C32158z(twoStepVerificationManageActivity2, aVar));
                    return;
                }
                C32292u uVar4 = twoStepVerificationManageActivity2.f76655b;
                if (uVar4 != null) {
                    bool3 = uVar4.getHas_email();
                }
                if (C89219l.m154714a((Object) bool3, (Object) true)) {
                    BaseBindService h2 = C36085cj.m73554h();
                    C32292u uVar5 = twoStepVerificationManageActivity2.f76655b;
                    if (!(uVar5 == null || (email = uVar5.getEmail()) == null)) {
                        str2 = email;
                    }
                    h2.verifyEmailWithWorkflowTokenForTicket(twoStepVerificationManageActivity2, "two_step_verification", "verify_for_ticket", str2, null, new C32124aa(twoStepVerificationManageActivity2, aVar));
                    return;
                }
                aVar.invoke(new C32123a(str4, "oauth_verify"));
                return;
            }
            TwoStepVerificationManageActivity twoStepVerificationManageActivity3 = this.f76674c;
            String str5 = jVar2.f52766j;
            C89219l.m154716b(str5, str2);
            twoStepVerificationManageActivity3.mo58108a(aVar, str5);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
        @Override // com.bytedance.sdk.p1625a.AbstractC22346c
        /* renamed from: a */
        public final /* synthetic */ void mo36681a(C22323j jVar, int i) {
            String str;
            C22323j jVar2 = jVar;
            TwoStepVerificationManageActivity twoStepVerificationManageActivity = this.f76674c;
            Integer valueOf = Integer.valueOf(i);
            if (jVar2 == null || (str = jVar2.f52717f) == null) {
                str = "";
            }
            twoStepVerificationManageActivity.mo58109a(valueOf, str);
        }

        C32128e(TwoStepVerificationManageActivity twoStepVerificationManageActivity, int i, List list, boolean z) {
            this.f76674c = twoStepVerificationManageActivity;
            this.f76675d = i;
            this.f76676e = list;
            this.f76677f = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$l */
    public static final class C32138l<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerificationManageActivity f76687a;

        /* renamed from: b */
        final /* synthetic */ boolean f76688b;

        static {
            Covode.recordClassIndex(38902);
        }

        C32138l(TwoStepVerificationManageActivity twoStepVerificationManageActivity, boolean z) {
            this.f76687a = twoStepVerificationManageActivity;
            this.f76688b = z;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<C32176a> iVar) {
            if (!C80214ai.m139043a(iVar)) {
                ((DmtStatusView) this.f76687a._$_findCachedViewById(R.id.e77)).mo27387h();
                return null;
            }
            if (this.f76688b) {
                C89219l.m154716b(iVar, "");
                C32176a d = iVar.mo5545d();
                C89219l.m154716b(d, "");
                C32258q.m66617a(d);
            }
            C89219l.m154716b(iVar, "");
            C32176a d2 = iVar.mo5545d();
            if (!C89361p.m154872a("success", d2.getMessage(), true) || d2.getData() == null) {
                ((DmtStatusView) this.f76687a._$_findCachedViewById(R.id.e77)).mo27387h();
                return null;
            }
            DmtStatusView dmtStatusView = (DmtStatusView) this.f76687a._$_findCachedViewById(R.id.e77);
            C89219l.m154716b(dmtStatusView, "");
            dmtStatusView.setVisibility(8);
            FrameLayout frameLayout = (FrameLayout) this.f76687a._$_findCachedViewById(R.id.b82);
            C89219l.m154716b(frameLayout, "");
            frameLayout.setVisibility(0);
            TwoStepVerificationManageActivity twoStepVerificationManageActivity = this.f76687a;
            C89219l.m154716b(d2, "");
            twoStepVerificationManageActivity.mo58107a(d2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$d */
    static final class C32127d<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerificationManageActivity f76673a;

        static {
            Covode.recordClassIndex(38891);
        }

        C32127d(TwoStepVerificationManageActivity twoStepVerificationManageActivity) {
            this.f76673a = twoStepVerificationManageActivity;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<C32182c> iVar) {
            if (!C80214ai.m139043a(iVar)) {
                ((DmtStatusView) this.f76673a._$_findCachedViewById(R.id.e77)).mo27387h();
                return null;
            }
            C89219l.m154716b(iVar, "");
            C32182c d = iVar.mo5545d();
            if (!C89361p.m154872a("success", d.getMessage(), true) || d.getData() == null) {
                ((DmtStatusView) this.f76673a._$_findCachedViewById(R.id.e77)).mo27387h();
                return null;
            }
            DmtStatusView dmtStatusView = (DmtStatusView) this.f76673a._$_findCachedViewById(R.id.e77);
            C89219l.m154716b(dmtStatusView, "");
            dmtStatusView.setVisibility(8);
            FrameLayout frameLayout = (FrameLayout) this.f76673a._$_findCachedViewById(R.id.b82);
            C89219l.m154716b(frameLayout, "");
            frameLayout.setVisibility(0);
            this.f76673a.f76655b = d.getData();
            C32292u uVar = this.f76673a.f76655b;
            if (uVar == null) {
                C89219l.m154715b();
            }
            C32179ab.f76808b = C89219l.m154714a((Object) uVar.getHas_mobile(), (Object) true);
            C32292u uVar2 = this.f76673a.f76655b;
            if (uVar2 == null) {
                C89219l.m154715b();
            }
            C32179ab.f76809c = C89219l.m154714a((Object) uVar2.getHas_email(), (Object) true);
            C32292u uVar3 = this.f76673a.f76655b;
            if (uVar3 == null) {
                C89219l.m154715b();
            }
            C32179ab.f76807a = C89219l.m154714a((Object) uVar3.getHas_pwd(), (Object) true);
            C32176a aVar = this.f76673a.f76654a;
            if (aVar == null) {
                return null;
            }
            this.f76673a.mo58107a(aVar);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        int i;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity", "onCreate", true);
        activityConfiguration(C32133i.f76682a);
        super.onCreate(bundle);
        setContentView(R.layout.hb);
        TuxTextView tuxTextView = new TuxTextView(this, null, 0, 6);
        tuxTextView.setTuxFont(51);
        tuxTextView.setGravity(17);
        Integer a = C23155d.m43641a(this, R.attr.bj);
        if (a != null) {
            i = a.intValue();
        } else {
            i = -16777216;
        }
        tuxTextView.setTextColor(i);
        tuxTextView.setText(getString(R.string.cxh));
        tuxTextView.setOnClickListener(new View$OnClickListenerC32136j(this));
        DmtStatusView.C17269a c = DmtStatusView.C17269a.m31905a(this).mo27408c(tuxTextView);
        c.f41304g = 0;
        ((DmtStatusView) _$_findCachedViewById(R.id.e77)).setBuilder(c);
        ((ButtonTitleBar) _$_findCachedViewById(R.id.eiz)).setOnTitleBarClickListener(new C32137k(this));
        if (mo58118c()) {
            if (!TextUtils.isEmpty((String) this.f76658e.getValue())) {
                this.f76660g.getAvailableWays().mo5534a(new C32127d(this), C1731i.f5564c, null);
            }
            mo58112a(false);
        } else {
            C32176a twoStepVerificationResponseFromCache = this.f76660g.getTwoStepVerificationResponseFromCache();
            if (twoStepVerificationResponseFromCache != null) {
                DmtStatusView dmtStatusView = (DmtStatusView) _$_findCachedViewById(R.id.e77);
                C89219l.m154716b(dmtStatusView, "");
                dmtStatusView.setVisibility(8);
                FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(R.id.b82);
                C89219l.m154716b(frameLayout, "");
                frameLayout.setVisibility(0);
                mo58107a(twoStepVerificationResponseFromCache);
                C32258q.m66617a(twoStepVerificationResponseFromCache);
            } else {
                mo58112a(true);
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity", "onCreate", false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$b */
    public static final class C32125b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerificationManageActivity f76666a;

        /* renamed from: b */
        final /* synthetic */ boolean f76667b;

        /* renamed from: c */
        final /* synthetic */ List f76668c;

        /* renamed from: d */
        final /* synthetic */ int f76669d;

        /* renamed from: e */
        final /* synthetic */ String f76670e;

        /* renamed from: f */
        final /* synthetic */ String f76671f;

        static {
            Covode.recordClassIndex(38889);
        }

        C32125b(TwoStepVerificationManageActivity twoStepVerificationManageActivity, boolean z, List list, int i, String str, String str2) {
            this.f76666a = twoStepVerificationManageActivity;
            this.f76667b = z;
            this.f76668c = list;
            this.f76669d = i;
            this.f76670e = str;
            this.f76671f = str2;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<C32176a> iVar) {
            Integer num;
            String str;
            String str2;
            String str3;
            if (!C80214ai.m139043a(iVar)) {
                TwoStepVerificationManageActivity twoStepVerificationManageActivity = this.f76666a;
                C89219l.m154716b(iVar, "");
                Exception e = iVar.mo5546e();
                if (e != null) {
                    str3 = e.toString();
                } else {
                    str3 = null;
                }
                twoStepVerificationManageActivity.mo58109a((Integer) null, str3);
                return null;
            }
            C89219l.m154716b(iVar, "");
            C32176a d = iVar.mo5545d();
            if (!C89361p.m154872a("success", d.getMessage(), true) || d.getData() == null) {
                C32176a.C32177a data = d.getData();
                if (data != null) {
                    num = data.getErrorCode();
                } else {
                    num = null;
                }
                C32176a.C32177a data2 = d.getData();
                if (data2 != null) {
                    str = data2.getErrorDescription();
                } else {
                    str = null;
                }
                if (num != null && 1015 == num.intValue()) {
                    this.f76666a.mo58114a(this.f76667b, this.f76668c, this.f76669d);
                } else {
                    this.f76666a.mo58109a(num, str);
                }
                return null;
            }
            String str4 = this.f76670e;
            int i = this.f76669d;
            String b = this.f76666a.mo58115b();
            C89219l.m154716b(b, "");
            String str5 = this.f76671f;
            boolean z = C32179ab.f76808b;
            boolean z2 = C32179ab.f76809c;
            boolean z3 = C32179ab.f76807a;
            C89219l.m154721d(str4, "");
            C89219l.m154721d(b, "");
            C89219l.m154721d(str5, "");
            boolean a = C89361p.m154908a((CharSequence) str4, (CharSequence) "mobile_sms_verify", false);
            boolean a2 = C89361p.m154908a((CharSequence) str4, (CharSequence) "pwd_verify", false);
            boolean a3 = C89361p.m154908a((CharSequence) str4, (CharSequence) "email_verify", false);
            C33744d a4 = C32258q.m66614a();
            a4.mo59982a("is_mobile_linked", Boolean.valueOf(z));
            a4.mo59982a("is_email_linked", Boolean.valueOf(z2));
            a4.mo59982a("is_password_set", Boolean.valueOf(z3));
            a4.mo59982a("is_sms_selected", Boolean.valueOf(a));
            a4.mo59982a("is_email_selected", Boolean.valueOf(a3));
            a4.mo59982a("is_pw_selected", Boolean.valueOf(a2));
            a4.mo59983a("verify_method", str5);
            a4.mo59983a("enter_from", b);
            if (i == 1) {
                str2 = "new";
            } else {
                str2 = "backup";
            }
            a4.mo59983a(StringSet.type, str2);
            C39162r.m79460a("twosv_setup_method_add_success", a4.f79943a);
            if (this.f76666a.mo58118c()) {
                this.f76666a.finish();
                return C89391z.f203057a;
            }
            TwoStepVerificationManageActivity twoStepVerificationManageActivity2 = this.f76666a;
            C89219l.m154716b(d, "");
            twoStepVerificationManageActivity2.mo58107a(d);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo58107a(C32176a aVar) {
        String str;
        C89219l.m154721d(aVar, "");
        String str2 = null;
        if (mo58118c()) {
            this.f76654a = aVar;
            if (this.f76655b != null) {
                C32176a.C32177a data = aVar.getData();
                if (data != null) {
                    str = data.getDefault_verify_way();
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    finish();
                }
            } else {
                return;
            }
        }
        this.f76660g.setTwoStepVerificationResponseToCache(aVar);
        C80273bt.m139146b(mo58106a());
        Fragment a = getSupportFragmentManager().mo3549a(R.id.b82);
        C32176a.C32177a data2 = aVar.getData();
        if (data2 != null) {
            str2 = data2.getDefault_verify_way();
        }
        if (TextUtils.isEmpty(str2)) {
            String b = mo58115b();
            C89219l.m154716b(b, "");
            if (a instanceof C32234o) {
                new C79459a(this).mo123052a(getString(R.string.g3t)).mo123053a();
                b = "turn_off_refresh";
            }
            if (!(a instanceof C32224l)) {
                C32258q.m66623b(b);
                Fragment a2 = getSupportFragmentManager().mo3551a("TurnOnTwoStepVerificationFragment");
                if (a2 == null) {
                    a2 = new C32224l();
                }
                C89219l.m154716b(a2, "");
                a2.setArguments(new Bundle());
                Bundle arguments = a2.getArguments();
                if (arguments == null) {
                    C89219l.m154715b();
                }
                arguments.putString("enter_from", mo58115b());
                AbstractC0976n a3 = getSupportFragmentManager().mo3552a();
                C89219l.m154716b(a3, "");
                a3.mo3470b(R.id.b82, a2, "TurnOnTwoStepVerificationFragment");
                a3.mo3473c();
                return;
            }
            return;
        }
        String b2 = mo58115b();
        C89219l.m154716b(b2, "");
        String str3 = "refresh";
        if (a instanceof C32234o) {
            ((C32234o) a).mo58252a(aVar);
        } else {
            if (a instanceof C32224l) {
                new C79459a(this).mo123052a(getString(R.string.g3u)).mo123053a();
                b2 = str3;
            }
            Fragment a4 = getSupportFragmentManager().mo3551a("TwoStepVerificationDetailFragment");
            if (a4 == null) {
                a4 = new C32234o();
            }
            C89219l.m154716b(a4, "");
            AbstractC0952i supportFragmentManager = getSupportFragmentManager();
            if (supportFragmentManager == null) {
                C89219l.m154715b();
            }
            AbstractC0976n a5 = supportFragmentManager.mo3552a();
            C89219l.m154716b(a5, "");
            Bundle bundle = new Bundle();
            bundle.putSerializable("response", aVar);
            a4.setArguments(bundle);
            Bundle arguments2 = a4.getArguments();
            if (arguments2 == null) {
                C89219l.m154715b();
            }
            arguments2.putString("enter_from", b2);
            a5.mo3470b(R.id.b82, a4, "TwoStepVerificationDetailFragment");
            a5.mo3473c();
            str3 = b2;
        }
        C32258q.m66626c(str3);
    }

    /* renamed from: a */
    public final void mo58112a(boolean z) {
        ((DmtStatusView) _$_findCachedViewById(R.id.e77)).mo27384f();
        this.f76660g.getTwoStepStatus(z).mo5534a(new C32138l(this, z), C1731i.f5564c, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$a */
    public static final class C32123a {

        /* renamed from: a */
        public final String f76662a;

        /* renamed from: b */
        public final String f76663b;

        static {
            Covode.recordClassIndex(38887);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32123a)) {
                return false;
            }
            C32123a aVar = (C32123a) obj;
            return C89219l.m154714a(this.f76662a, aVar.f76662a) && C89219l.m154714a(this.f76663b, aVar.f76663b);
        }

        public final int hashCode() {
            String str = this.f76662a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.f76663b;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            return "VerifiedWay(ticket=" + this.f76662a + ", way=" + this.f76663b + ")";
        }

        public C32123a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            this.f76662a = str;
            this.f76663b = str2;
        }
    }

    /* renamed from: a */
    public final void mo58108a(AbstractC89172b<? super C32123a, C89391z> bVar, String str) {
        C36085cj.f85262b.mo57069e().getSetPasswordStatus(new C32153x(this, bVar, str));
    }

    /* renamed from: a */
    public final void mo58109a(Integer num, String str) {
        C79459a aVar;
        C32179ab.f76807a = false;
        C32179ab.f76808b = false;
        C32179ab.f76809c = false;
        C80273bt.m139146b(mo58106a());
        if (num == null) {
            aVar = new C79459a(this);
            str = getString(R.string.bos);
        } else if (num.intValue() < 0 || TextUtils.isEmpty(str)) {
            aVar = new C79459a(this);
            str = getString(R.string.dcq);
        } else {
            aVar = new C79459a(this);
            if (str == null) {
                C89219l.m154715b();
            }
        }
        aVar.mo123052a(str).mo123053a();
    }

    /* renamed from: a */
    public final void mo58111a(List<String> list, int i) {
        C89219l.m154721d(list, "");
        mo58114a(false, list, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$r */
    public static final class C32147r implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerificationManageActivity f76716a;

        /* renamed from: b */
        final /* synthetic */ boolean f76717b;

        /* renamed from: c */
        final /* synthetic */ String f76718c;

        /* renamed from: d */
        final /* synthetic */ String f76719d;

        /* renamed from: e */
        final /* synthetic */ List f76720e;

        /* renamed from: f */
        final /* synthetic */ int f76721f;

        static {
            Covode.recordClassIndex(38911);
        }

        C32147r(TwoStepVerificationManageActivity twoStepVerificationManageActivity, boolean z, String str, String str2, List list, int i) {
            this.f76716a = twoStepVerificationManageActivity;
            this.f76717b = z;
            this.f76718c = str;
            this.f76719d = str2;
            this.f76720e = list;
            this.f76721f = i;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            if (i2 == 1) {
                C32179ab.f76808b = true;
                this.f76716a.mo58113a(this.f76717b, this.f76718c, this.f76719d, this.f76720e, this.f76721f);
            }
            C80273bt.m139146b(this.f76716a.mo58106a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$s */
    public static final class C32148s implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerificationManageActivity f76722a;

        /* renamed from: b */
        final /* synthetic */ boolean f76723b;

        /* renamed from: c */
        final /* synthetic */ String f76724c;

        /* renamed from: d */
        final /* synthetic */ String f76725d;

        /* renamed from: e */
        final /* synthetic */ List f76726e;

        /* renamed from: f */
        final /* synthetic */ int f76727f;

        static {
            Covode.recordClassIndex(38912);
        }

        C32148s(TwoStepVerificationManageActivity twoStepVerificationManageActivity, boolean z, String str, String str2, List list, int i) {
            this.f76722a = twoStepVerificationManageActivity;
            this.f76723b = z;
            this.f76724c = str;
            this.f76725d = str2;
            this.f76726e = list;
            this.f76727f = i;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            if (i2 == 1) {
                C32179ab.f76809c = true;
                this.f76722a.mo58113a(this.f76723b, this.f76724c, this.f76725d, this.f76726e, this.f76727f);
            }
            C80273bt.m139146b(this.f76722a.mo58106a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$t */
    public static final class C32149t implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerificationManageActivity f76728a;

        /* renamed from: b */
        final /* synthetic */ boolean f76729b;

        /* renamed from: c */
        final /* synthetic */ String f76730c;

        /* renamed from: d */
        final /* synthetic */ String f76731d;

        /* renamed from: e */
        final /* synthetic */ List f76732e;

        /* renamed from: f */
        final /* synthetic */ int f76733f;

        static {
            Covode.recordClassIndex(38913);
        }

        C32149t(TwoStepVerificationManageActivity twoStepVerificationManageActivity, boolean z, String str, String str2, List list, int i) {
            this.f76728a = twoStepVerificationManageActivity;
            this.f76729b = z;
            this.f76730c = str;
            this.f76731d = str2;
            this.f76732e = list;
            this.f76733f = i;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            if (i2 == 1) {
                C32179ab.f76809c = true;
                this.f76728a.mo58113a(this.f76729b, this.f76730c, this.f76731d, this.f76732e, this.f76733f);
            }
            C80273bt.m139146b(this.f76728a.mo58106a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$aa */
    static final class C32124aa implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerificationManageActivity f76664a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f76665b;

        static {
            Covode.recordClassIndex(38888);
        }

        C32124aa(TwoStepVerificationManageActivity twoStepVerificationManageActivity, AbstractC89172b bVar) {
            this.f76664a = twoStepVerificationManageActivity;
            this.f76665b = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            String str;
            if (i2 == 1) {
                C32258q.m66620a("email", "pass", "settings_security");
                AbstractC89172b bVar = this.f76665b;
                if (!(obj instanceof Bundle)) {
                    obj = null;
                }
                Bundle bundle = (Bundle) obj;
                if (bundle == null || (str = bundle.getString("ticket")) == null) {
                    str = "";
                }
                C89219l.m154716b(str, "");
                bVar.invoke(new C32123a(str, "email_verify"));
                return;
            }
            C32258q.m66620a("email", "fail", "settings_security");
            C80273bt.m139146b(this.f76664a.mo58106a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$n */
    public static final class C32141n implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerificationManageActivity f76693a;

        /* renamed from: b */
        final /* synthetic */ List f76694b;

        /* renamed from: c */
        final /* synthetic */ boolean f76695c;

        /* renamed from: d */
        final /* synthetic */ String f76696d;

        /* renamed from: e */
        final /* synthetic */ String f76697e;

        /* renamed from: f */
        final /* synthetic */ int f76698f;

        static {
            Covode.recordClassIndex(38905);
        }

        C32141n(TwoStepVerificationManageActivity twoStepVerificationManageActivity, List list, boolean z, String str, String str2, int i) {
            this.f76693a = twoStepVerificationManageActivity;
            this.f76694b = list;
            this.f76695c = z;
            this.f76696d = str;
            this.f76697e = str2;
            this.f76698f = i;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            if (i2 == 1) {
                C32179ab.f76809c = true;
                this.f76694b.add("email_verify");
            }
            this.f76693a.mo58117b(this.f76695c, this.f76696d, this.f76697e, this.f76694b, this.f76698f);
            C80273bt.m139146b(this.f76693a.mo58106a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$o */
    public static final class C32142o implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerificationManageActivity f76699a;

        /* renamed from: b */
        final /* synthetic */ List f76700b;

        /* renamed from: c */
        final /* synthetic */ boolean f76701c;

        /* renamed from: d */
        final /* synthetic */ String f76702d;

        /* renamed from: e */
        final /* synthetic */ String f76703e;

        /* renamed from: f */
        final /* synthetic */ int f76704f;

        static {
            Covode.recordClassIndex(38906);
        }

        C32142o(TwoStepVerificationManageActivity twoStepVerificationManageActivity, List list, boolean z, String str, String str2, int i) {
            this.f76699a = twoStepVerificationManageActivity;
            this.f76700b = list;
            this.f76701c = z;
            this.f76702d = str;
            this.f76703e = str2;
            this.f76704f = i;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            if (i2 == 1) {
                C32179ab.f76808b = true;
                this.f76700b.add("email_verify");
            }
            this.f76699a.mo58117b(this.f76701c, this.f76702d, this.f76703e, this.f76700b, this.f76704f);
            C80273bt.m139146b(this.f76699a.mo58106a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$u */
    public static final class C32150u implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerificationManageActivity f76734a;

        /* renamed from: b */
        final /* synthetic */ boolean f76735b;

        /* renamed from: c */
        final /* synthetic */ String f76736c;

        /* renamed from: d */
        final /* synthetic */ String f76737d;

        /* renamed from: e */
        final /* synthetic */ List f76738e;

        /* renamed from: f */
        final /* synthetic */ int f76739f;

        static {
            Covode.recordClassIndex(38914);
        }

        C32150u(TwoStepVerificationManageActivity twoStepVerificationManageActivity, boolean z, String str, String str2, List list, int i) {
            this.f76734a = twoStepVerificationManageActivity;
            this.f76735b = z;
            this.f76736c = str;
            this.f76737d = str2;
            this.f76738e = list;
            this.f76739f = i;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            if (i2 == 1) {
                C32179ab.f76807a = true;
                C32292u uVar = this.f76734a.f76655b;
                if (uVar == null) {
                    C89219l.m154715b();
                }
                uVar.setHas_pwd(true);
                this.f76734a.mo58113a(this.f76735b, this.f76736c, this.f76737d, this.f76738e, this.f76739f);
            }
            C80273bt.m139146b(this.f76734a.mo58106a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$v */
    public static final class C32151v implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerificationManageActivity f76740a;

        /* renamed from: b */
        final /* synthetic */ boolean f76741b;

        /* renamed from: c */
        final /* synthetic */ String f76742c;

        /* renamed from: d */
        final /* synthetic */ String f76743d;

        /* renamed from: e */
        final /* synthetic */ List f76744e;

        /* renamed from: f */
        final /* synthetic */ int f76745f;

        static {
            Covode.recordClassIndex(38915);
        }

        C32151v(TwoStepVerificationManageActivity twoStepVerificationManageActivity, boolean z, String str, String str2, List list, int i) {
            this.f76740a = twoStepVerificationManageActivity;
            this.f76741b = z;
            this.f76742c = str;
            this.f76743d = str2;
            this.f76744e = list;
            this.f76745f = i;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            if (i2 == 1) {
                C32179ab.f76808b = true;
                C32292u uVar = this.f76740a.f76655b;
                if (uVar != null) {
                    uVar.setHas_mobile(true);
                }
                this.f76740a.mo58113a(this.f76741b, this.f76742c, this.f76743d, this.f76744e, this.f76745f);
            }
            C80273bt.m139146b(this.f76740a.mo58106a());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$w */
    public static final class C32152w implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerificationManageActivity f76746a;

        /* renamed from: b */
        final /* synthetic */ boolean f76747b;

        /* renamed from: c */
        final /* synthetic */ String f76748c;

        /* renamed from: d */
        final /* synthetic */ String f76749d;

        /* renamed from: e */
        final /* synthetic */ List f76750e;

        /* renamed from: f */
        final /* synthetic */ int f76751f;

        static {
            Covode.recordClassIndex(38916);
        }

        C32152w(TwoStepVerificationManageActivity twoStepVerificationManageActivity, boolean z, String str, String str2, List list, int i) {
            this.f76746a = twoStepVerificationManageActivity;
            this.f76747b = z;
            this.f76748c = str;
            this.f76749d = str2;
            this.f76750e = list;
            this.f76751f = i;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            if (i2 == 1) {
                C32179ab.f76809c = true;
                C32292u uVar = this.f76746a.f76655b;
                if (uVar == null) {
                    C89219l.m154715b();
                }
                uVar.setHas_email(true);
                this.f76746a.mo58113a(this.f76747b, this.f76748c, this.f76749d, this.f76750e, this.f76751f);
            }
            C80273bt.m139146b(this.f76746a.mo58106a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$y */
    static final class C32157y implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerificationManageActivity f76758a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f76759b;

        static {
            Covode.recordClassIndex(38921);
        }

        C32157y(TwoStepVerificationManageActivity twoStepVerificationManageActivity, AbstractC89172b bVar) {
            this.f76758a = twoStepVerificationManageActivity;
            this.f76759b = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            String str;
            if (i2 == 1) {
                C32258q.m66620a("password", "pass", "settings_security");
                AbstractC89172b bVar = this.f76759b;
                if (!(obj instanceof Bundle)) {
                    obj = null;
                }
                Bundle bundle = (Bundle) obj;
                if (bundle == null || (str = bundle.getString("ticket")) == null) {
                    str = "";
                }
                C89219l.m154716b(str, "");
                bVar.invoke(new C32123a(str, "pwd_verify"));
                return;
            }
            C32258q.m66620a("password", "fail", "settings_security");
            C80273bt.m139146b(this.f76758a.mo58106a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepVerificationManageActivity$z */
    static final class C32158z implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ TwoStepVerificationManageActivity f76760a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f76761b;

        static {
            Covode.recordClassIndex(38922);
        }

        C32158z(TwoStepVerificationManageActivity twoStepVerificationManageActivity, AbstractC89172b bVar) {
            this.f76760a = twoStepVerificationManageActivity;
            this.f76761b = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            String str;
            if (i2 == 1) {
                C32258q.m66620a("sms", "pass", "settings_security");
                AbstractC89172b bVar = this.f76761b;
                if (!(obj instanceof Bundle)) {
                    obj = null;
                }
                Bundle bundle = (Bundle) obj;
                if (bundle == null || (str = bundle.getString("ticket")) == null) {
                    str = "";
                }
                C89219l.m154716b(str, "");
                bVar.invoke(new C32123a(str, "mobile_sms_verify"));
                return;
            }
            C32258q.m66620a("sms", "fail", "settings_security");
            C80273bt.m139146b(this.f76760a.mo58106a());
        }
    }

    /* renamed from: a */
    public final void mo58110a(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C80273bt.m139145a(mo58106a());
        TwoStepAuthApi.m66499a(str2, str).mo5534a(new C32139m(this, str, str3), C1731i.f5564c, null);
    }

    /* renamed from: b */
    public final void mo58116b(String str, String str2, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C80273bt.m139145a(mo58106a());
        TwoStepAuthApi.m66498a(str2).mo5534a(new C32143p(this, str, str3), C1731i.f5564c, null);
    }

    /* renamed from: b */
    public final void mo58117b(boolean z, String str, String str2, List<String> list, int i) {
        String a = C32258q.m66616a(list);
        C80273bt.m139145a(mo58106a());
        TwoStepAuthApi.m66500a(str2, a, i).mo5534a(new C32125b(this, z, list, i, a, str), C1731i.f5564c, null);
    }

    /* renamed from: c */
    private final void m66505c(boolean z, String str, String str2, List<String> list, int i) {
        C80273bt.m139145a(mo58106a());
        BaseBindService h = C36085cj.m73554h();
        Bundle bundle = new Bundle();
        bundle.putBoolean("show_success_toast", false);
        bundle.putBoolean("show_skip", true);
        h.bindEmail(this, "two_step_verification", "turnOn", bundle, new C32141n(this, list, z, str, str2, i));
    }

    /* renamed from: d */
    private final void m66506d(boolean z, String str, String str2, List<String> list, int i) {
        BaseBindService h = C36085cj.m73554h();
        Bundle bundle = new Bundle();
        bundle.putBoolean("show_success_toast", false);
        bundle.putBoolean("show_skip", true);
        h.bindMobile(this, "two_step_verification", "turnOn", bundle, new C32142o(this, list, z, str, str2, i));
    }

    /* renamed from: a */
    private final void m66503a(boolean z, String str, AbstractC35418cb.EnumC35419a aVar, String str2, List<String> list, int i) {
        int i2 = C32257p.f76959a[aVar.ordinal()];
        if (i2 != 1) {
            Boolean bool = null;
            if (i2 == 2) {
                C32292u uVar = this.f76655b;
                if (uVar != null) {
                    bool = uVar.getHas_mobile();
                }
                if (C89219l.m154714a((Object) bool, (Object) true)) {
                    C32179ab.f76808b = true;
                    mo58113a(z, str, str2, list, i);
                    return;
                }
                BaseBindService h = C36085cj.m73554h();
                Bundle bundle = new Bundle();
                bundle.putBoolean("show_success_toast", false);
                h.bindMobile(this, "two_step_verification", "turnOn", bundle, new C32151v(this, z, str, str2, list, i));
            } else if (i2 == 3) {
                C32292u uVar2 = this.f76655b;
                if (uVar2 != null) {
                    bool = uVar2.getHas_email();
                }
                if (C89219l.m154714a((Object) bool, (Object) true)) {
                    C32179ab.f76809c = true;
                    mo58113a(z, str, str2, list, i);
                    return;
                }
                BaseBindService h2 = C36085cj.m73554h();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("show_success_toast", false);
                h2.bindEmail(this, "two_step_verification", "turnOn", bundle2, new C32152w(this, z, str, str2, list, i));
            }
        } else {
            C32292u uVar3 = this.f76655b;
            if (uVar3 == null) {
                C89219l.m154715b();
            }
            if (C89219l.m154714a((Object) uVar3.getHas_pwd(), (Object) true)) {
                C32179ab.f76807a = true;
                mo58113a(z, str, str2, list, i);
                return;
            }
            AbstractC34913br i3 = C36085cj.f85262b.mo57073i();
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean("show_skip", false);
            i3.setPassword(this, bundle3, new C32150u(this, z, str, str2, list, i));
        }
    }

    /* renamed from: b */
    private final void m66504b(boolean z, String str, AbstractC35418cb.EnumC35419a aVar, String str2, List<String> list, int i) {
        User f = C36085cj.m73552f();
        int i2 = C32257p.f76960b[aVar.ordinal()];
        if (i2 == 1) {
            C36085cj.f85262b.mo57069e().getSetPasswordStatus(new C32145q(this, z, str, str2, list, i));
        } else if (i2 == 2) {
            C89219l.m154716b(f, "");
            if (f.isPhoneBinded()) {
                C32179ab.f76808b = true;
                mo58113a(z, str, str2, list, i);
                return;
            }
            BaseBindService h = C36085cj.m73554h();
            Bundle bundle = new Bundle();
            bundle.putBoolean("show_success_toast", false);
            h.bindMobile(this, "two_step_verification", "turnOn", bundle, new C32147r(this, z, str, str2, list, i));
        } else if (i2 == 3) {
            C89219l.m154716b(f, "");
            if (f.isEmailVerified()) {
                C32179ab.f76809c = true;
                mo58113a(z, str, str2, list, i);
            } else if (f.isHasEmail()) {
                BaseBindService h2 = C36085cj.m73554h();
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("show_success_toast", false);
                h2.verifyEmail(this, "two_step_verification", bundle2, new C32148s(this, z, str, str2, list, i));
            } else {
                BaseBindService h3 = C36085cj.m73554h();
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("show_success_toast", false);
                h3.bindEmail(this, "two_step_verification", "turnOn", bundle3, new C32149t(this, z, str, str2, list, i));
            }
        }
    }
}
