package com.p2082ss.android.ugc.aweme.account.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0974l;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.foundation.base.AbstractC17362a;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.router.SmartRoute;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.IGuestModeService;
import com.p2082ss.android.ugc.aweme.account.experiment.C31650h;
import com.p2082ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.p2082ss.android.ugc.aweme.account.login.C32816w;
import com.p2082ss.android.ugc.aweme.account.login.C32819y;
import com.p2082ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;
import com.p2082ss.android.ugc.aweme.account.login.p2254a.C31828h;
import com.p2082ss.android.ugc.aweme.account.login.p2254a.C31847n;
import com.p2082ss.android.ugc.aweme.account.login.p2254a.C31851p;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32584f;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32404v;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2247f.C31667a;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32856f;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32857g;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32867m;
import com.p2082ss.android.ugc.aweme.account.util.C33051t;
import com.p2082ss.android.ugc.aweme.account.views.AutoRTLImageView;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import com.p2082ss.android.ugc.aweme.base.p2370c.AbstractC34533b;
import com.p2082ss.android.ugc.aweme.base.p2370c.C34531a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.sec.SecApiImpl;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity */
public class I18nSignUpActivity extends ActivityC17312a implements C31667a.AbstractC31669b {

    /* renamed from: h */
    public static final C31771a f75941h = new C31771a((byte) 0);

    /* renamed from: a */
    public boolean f75942a;

    /* renamed from: b */
    public String f75943b = "";

    /* renamed from: c */
    public boolean f75944c;

    /* renamed from: d */
    final AbstractC89244h f75945d = C89250i.m154773a((AbstractC89171a) new C31772aa(this));

    /* renamed from: e */
    final AbstractC89244h f75946e = C89250i.m154773a((AbstractC89171a) new C31776b(this));

    /* renamed from: f */
    public Intent f75947f;

    /* renamed from: g */
    public SmartRoute f75948g;

    /* renamed from: i */
    private long f75949i = System.currentTimeMillis();

    /* renamed from: j */
    private final AbstractC89244h f75950j = C89250i.m154773a((AbstractC89171a) new C31779e(this));

    /* renamed from: k */
    private final AbstractC89244h f75951k = C89250i.m154773a((AbstractC89171a) new C31780f(this));

    /* renamed from: l */
    private final AbstractC89244h f75952l = C89250i.m154773a((AbstractC89171a) new C31797v(this));

    /* renamed from: m */
    private final AbstractC89244h f75953m = C89250i.m154773a((AbstractC89171a) new C31786l(this));

    /* renamed from: n */
    private final AbstractC89244h f75954n = C89250i.m154773a((AbstractC89171a) new C31789o(this));

    /* renamed from: o */
    private final AbstractC89244h f75955o = C89250i.m154773a((AbstractC89171a) new C31775ad(this));

    /* renamed from: p */
    private final AbstractC89244h f75956p = C89250i.m154773a((AbstractC89171a) new C31773ab(this));

    /* renamed from: q */
    private final AbstractC89244h f75957q = C89250i.m154773a((AbstractC89171a) new C31785k(this));

    /* renamed from: r */
    private final AbstractC89244h f75958r = C89250i.m154773a((AbstractC89171a) new C31783i(this));

    /* renamed from: s */
    private final AbstractC89244h f75959s = C89250i.m154773a((AbstractC89171a) new C31784j(this));

    /* renamed from: t */
    private final AbstractC89244h f75960t = C89250i.m154773a((AbstractC89171a) new C31787m(this));

    /* renamed from: u */
    private final AbstractC89244h f75961u = C89250i.m154773a((AbstractC89171a) new C31774ac(this));

    /* renamed from: v */
    private final AbstractC89244h f75962v = C89250i.m154773a((AbstractC89171a) new C31788n(this));

    /* renamed from: w */
    private HashMap f75963w;

    static {
        Covode.recordClassIndex(38506);
    }

    /* renamed from: p */
    private final boolean m66103p() {
        return ((Boolean) this.f75960t.getValue()).booleanValue();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f75963w;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public View _$_findCachedViewById(int i) {
        if (this.f75963w == null) {
            this.f75963w = new HashMap();
        }
        View view = (View) this.f75963w.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f75963w.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: b */
    public final String mo57715b() {
        return (String) this.f75950j.getValue();
    }

    /* renamed from: c */
    public final String mo57717c() {
        return (String) this.f75951k.getValue();
    }

    /* renamed from: d */
    public final Bundle mo57718d() {
        return (Bundle) this.f75952l.getValue();
    }

    /* renamed from: e */
    public final Bundle mo57719e() {
        return (Bundle) this.f75954n.getValue();
    }

    /* renamed from: f */
    public final Bundle mo57720f() {
        return (Bundle) this.f75955o.getValue();
    }

    /* renamed from: g */
    public final boolean mo57721g() {
        return ((Boolean) this.f75956p.getValue()).booleanValue();
    }

    /* renamed from: h */
    public final boolean mo57722h() {
        return ((Boolean) this.f75957q.getValue()).booleanValue();
    }

    /* renamed from: i */
    public final boolean mo57723i() {
        return ((Boolean) this.f75958r.getValue()).booleanValue();
    }

    /* renamed from: j */
    public final boolean mo57724j() {
        return ((Boolean) this.f75959s.getValue()).booleanValue();
    }

    /* renamed from: m */
    public final List<C31828h> mo57727m() {
        return (List) this.f75961u.getValue();
    }

    /* renamed from: n */
    public final List<C31828h> mo57728n() {
        return (List) this.f75962v.getValue();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.I18nSignUpActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.I18nSignUpActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.I18nSignUpActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$a */
    public static final class C31771a {
        static {
            Covode.recordClassIndex(38507);
        }

        private C31771a() {
        }

        public /* synthetic */ C31771a(byte b) {
            this();
        }

        /* renamed from: a */
        private static void m66131a(Activity activity, Intent intent) {
            C84349a.m145093a(intent, activity);
            activity.startActivity(intent);
        }

        /* renamed from: a */
        public static C31376a m66130a(String str, String str2, String str3, Map<String, ? extends Object> map) {
            int i;
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            C31376a aVar = new C31376a();
            C31376a a = aVar.mo57399a("enter_method", str2).mo57399a("enter_from", str).mo57397a("_perf_monitor", 1).mo57399a("enter_type", str3);
            if (C17873f.m33102j() != null) {
                i = C32856f.m67456b(C17873f.m33102j());
            } else {
                i = -1;
            }
            a.mo57397a("google_status", i);
            C32404v.m66768a(aVar, map);
            C89219l.m154716b(aVar, "");
            return aVar;
        }

        /* renamed from: a */
        public static void m66132a(Activity activity, Bundle bundle, boolean z, boolean z2, boolean z3) {
            Intent intent;
            boolean z4;
            Boolean bool;
            int i;
            C89219l.m154721d(activity, "");
            if (z3) {
                intent = new Intent(activity, I18nSignUpActivityWithNoAnimation.class);
            } else {
                intent = new Intent(activity, I18nSignUpActivity.class);
            }
            intent.putExtra("sign_up_data", bundle);
            if (z || (bundle != null && bundle.getBoolean("show_login_page_first"))) {
                z4 = true;
            } else {
                z4 = false;
            }
            intent.putExtra("show_login_page_first", z4);
            intent.putExtra("has_callBack", z2);
            if (bundle != null) {
                bool = Boolean.valueOf(bundle.getBoolean("show_learn_feed_toast"));
            } else {
                bool = null;
            }
            intent.putExtra("show_learn_feed_toast", bool);
            m66131a(activity, intent);
            if (z3) {
                i = 0;
            } else {
                i = R.anim.a3;
            }
            activity.overridePendingTransition(i, 0);
        }

        /* renamed from: a */
        public static void m66133a(String str, String str2, String str3, Map<String, ? extends Object> map, List<? extends C31828h> list, int i) {
            String str4;
            String str5;
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            C89219l.m154721d(list, "");
            C31376a a = m66130a(str, str2, str3, map);
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 <= i) {
                    a.mo57397a(((C31828h) list.get(i2)).f76071f, 1);
                } else {
                    a.mo57397a(((C31828h) list.get(i2)).f76071f, 0);
                }
            }
            if (TextUtils.equals(str3, "click_login")) {
                str4 = "login";
            } else {
                str4 = "register";
            }
            SecApiImpl.m119993a().reportData(str4);
            IGuestModeService d = GuestModeServiceImpl.m65990d();
            if (!d.mo57218b() || d.mo57219c()) {
                str5 = "0";
            } else {
                str5 = "1";
            }
            a.mo57399a("guestmode_is_show", str5);
            C39162r.m79460a("login_notify", a.f75156a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$h */
    public static final class C31782h implements AbstractC32584f {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f75974a;

        /* renamed from: b */
        final /* synthetic */ String f75975b;

        /* renamed from: c */
        final /* synthetic */ Bundle f75976c;

        static {
            Covode.recordClassIndex(38518);
        }

        @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32584f
        public final String ac_() {
            return this.f75975b;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32584f
        public final Bundle ae_() {
            return this.f75976c;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32584f
        public final String aa_() {
            String b = this.f75974a.mo57715b();
            C89219l.m154716b(b, "");
            return b;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32584f
        public final String ab_() {
            String c = this.f75974a.mo57717c();
            C89219l.m154716b(c, "");
            return c;
        }

        C31782h(I18nSignUpActivity i18nSignUpActivity, String str, Bundle bundle) {
            this.f75974a = i18nSignUpActivity;
            this.f75975b = str;
            this.f75976c = bundle;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$q */
    static final class C31791q implements ViewPagerBottomSheetBehavior.AbstractC31807b {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f75985a;

        static {
            Covode.recordClassIndex(38527);
        }

        C31791q(I18nSignUpActivity i18nSignUpActivity) {
            this.f75985a = i18nSignUpActivity;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior.AbstractC31807b
        /* renamed from: a */
        public final void mo57738a() {
            this.f75985a.finish();
        }
    }

    /* renamed from: t */
    private void m66107t() {
        this.f75947f = null;
        this.f75948g = null;
    }

    /* renamed from: u */
    private static boolean m66108u() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        C31667a.m65986b(this);
        super.onDestroy();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$aa */
    static final class C31772aa extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f75964a;

        static {
            Covode.recordClassIndex(38508);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31772aa(I18nSignUpActivity i18nSignUpActivity) {
            super(0);
            this.f75964a = i18nSignUpActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(this.f75964a.getIntent().getBooleanExtra("show_learn_feed_toast", false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$ab */
    static final class C31773ab extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f75965a;

        static {
            Covode.recordClassIndex(38509);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31773ab(I18nSignUpActivity i18nSignUpActivity) {
            super(0);
            this.f75965a = i18nSignUpActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(this.f75965a.getIntent().getBooleanExtra("show_login_page_first", false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$ad */
    static final class C31775ad extends AbstractC89220m implements AbstractC89171a<Bundle> {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f75967a;

        static {
            Covode.recordClassIndex(38511);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31775ad(I18nSignUpActivity i18nSignUpActivity) {
            super(0);
            this.f75967a = i18nSignUpActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Bundle invoke() {
            Bundle bundle = new Bundle(this.f75967a.mo57718d());
            Map<String, Object> a = C32404v.m66765a(bundle);
            if (a != null) {
                a.put("enter_type", "click_sign_up");
            }
            bundle.putString("enter_type", "click_sign_up");
            return bundle;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$e */
    static final class C31779e extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f75971a;

        static {
            Covode.recordClassIndex(38515);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31779e(I18nSignUpActivity i18nSignUpActivity) {
            super(0);
            this.f75971a = i18nSignUpActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String string = this.f75971a.mo57718d().getString("enter_from");
            if (string == null) {
                return "";
            }
            return string;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$f */
    static final class C31780f extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f75972a;

        static {
            Covode.recordClassIndex(38516);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31780f(I18nSignUpActivity i18nSignUpActivity) {
            super(0);
            this.f75972a = i18nSignUpActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String string = this.f75972a.mo57718d().getString("enter_method");
            if (string == null) {
                return "";
            }
            return string;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$g */
    public static final class RunnableC31781g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f75973a;

        static {
            Covode.recordClassIndex(38517);
        }

        RunnableC31781g(I18nSignUpActivity i18nSignUpActivity) {
            this.f75973a = i18nSignUpActivity;
        }

        public final void run() {
            if (TextUtils.equals(C36085cj.m73548b(), this.f75973a.f75943b) && !this.f75973a.f75942a) {
                C36085cj.m73540a(1, 3, (Object) "");
                C36085cj.m73555i();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$l */
    static final class C31786l extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f75980a;

        static {
            Covode.recordClassIndex(38522);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31786l(I18nSignUpActivity i18nSignUpActivity) {
            super(0);
            this.f75980a = i18nSignUpActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(this.f75980a.mo57718d().getBoolean("is_multi_account", false));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$o */
    static final class C31789o extends AbstractC89220m implements AbstractC89171a<Bundle> {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f75983a;

        static {
            Covode.recordClassIndex(38525);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31789o(I18nSignUpActivity i18nSignUpActivity) {
            super(0);
            this.f75983a = i18nSignUpActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Bundle invoke() {
            Bundle bundle = new Bundle(this.f75983a.mo57718d());
            Map<String, Object> a = C32404v.m66765a(bundle);
            if (a != null) {
                a.put("enter_type", "click_login");
            }
            bundle.putString("enter_type", "click_login");
            return bundle;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$t */
    static final class RunnableC31795t implements Runnable {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f75990a;

        /* renamed from: b */
        final /* synthetic */ ViewPagerBottomSheetBehavior f75991b;

        static {
            Covode.recordClassIndex(38531);
        }

        RunnableC31795t(I18nSignUpActivity i18nSignUpActivity, ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior) {
            this.f75990a = i18nSignUpActivity;
            this.f75991b = viewPagerBottomSheetBehavior;
        }

        public final void run() {
            ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.f75991b;
            C89219l.m154716b(viewPagerBottomSheetBehavior, "");
            RelativeLayout relativeLayout = (RelativeLayout) this.f75990a._$_findCachedViewById(R.id.dnb);
            C89219l.m154716b(relativeLayout, "");
            viewPagerBottomSheetBehavior.mo57751b(relativeLayout.getHeight());
        }
    }

    /* renamed from: r */
    private final boolean m66105r() {
        Bundle a = m66099a(getIntent());
        if (a != null) {
            return a.getBoolean("has_callBack", false);
        }
        return false;
    }

    /* renamed from: o */
    public final int mo57729o() {
        int i = 4;
        if (mo57723i()) {
            return 4;
        }
        Integer num = C33051t.m67698a().f78601a;
        if (num != null) {
            i = num.intValue() + 1;
        }
        return i + 1;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$ac */
    static final class C31774ac extends AbstractC89220m implements AbstractC89171a<List<? extends C31828h>> {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f75966a;

        static {
            Covode.recordClassIndex(38510);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31774ac(I18nSignUpActivity i18nSignUpActivity) {
            super(0);
            this.f75966a = i18nSignUpActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<? extends C31828h> invoke() {
            I18nSignUpActivity i18nSignUpActivity = this.f75966a;
            List<C31828h> a = C31828h.C31831b.m66177a(true, new C31778d(i18nSignUpActivity));
            String c = i18nSignUpActivity.mo57717c();
            C89219l.m154716b(c, "");
            a.add(1, new C31851p(c, i18nSignUpActivity.mo57720f(), i18nSignUpActivity));
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$b */
    static final class C31776b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f75968a;

        static {
            Covode.recordClassIndex(38512);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31776b(I18nSignUpActivity i18nSignUpActivity) {
            super(0);
            this.f75968a = i18nSignUpActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            Bundle bundleExtra = this.f75968a.getIntent().getBundleExtra("sign_up_data");
            Context context = BadParcelableCrashOptimizer.getContext();
            if (bundleExtra != null) {
                if (context != null) {
                    bundleExtra.setClassLoader(context.getClassLoader());
                }
                z = bundleExtra.getBoolean("age_gate_block");
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$j */
    static final class C31784j extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f75978a;

        static {
            Covode.recordClassIndex(38520);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31784j(I18nSignUpActivity i18nSignUpActivity) {
            super(0);
            this.f75978a = i18nSignUpActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            Bundle bundleExtra = this.f75978a.getIntent().getBundleExtra("sign_up_data");
            Context context = BadParcelableCrashOptimizer.getContext();
            if (bundleExtra != null) {
                if (context != null) {
                    bundleExtra.setClassLoader(context.getClassLoader());
                }
                z = bundleExtra.getBoolean("is_from_new_user_journey");
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$k */
    static final class C31785k extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f75979a;

        static {
            Covode.recordClassIndex(38521);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31785k(I18nSignUpActivity i18nSignUpActivity) {
            super(0);
            this.f75979a = i18nSignUpActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            Bundle bundleExtra = this.f75979a.getIntent().getBundleExtra("sign_up_data");
            Context context = BadParcelableCrashOptimizer.getContext();
            if (bundleExtra != null) {
                if (context != null) {
                    bundleExtra.setClassLoader(context.getClassLoader());
                }
                z = bundleExtra.getBoolean("is_fullscreen_dialog");
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$m */
    static final class C31787m extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f75981a;

        static {
            Covode.recordClassIndex(38523);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31787m(I18nSignUpActivity i18nSignUpActivity) {
            super(0);
            this.f75981a = i18nSignUpActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            Bundle bundleExtra = this.f75981a.getIntent().getBundleExtra("sign_up_data");
            Context context = BadParcelableCrashOptimizer.getContext();
            if (bundleExtra != null) {
                if (context != null) {
                    bundleExtra.setClassLoader(context.getClassLoader());
                }
                z = bundleExtra.getBoolean("is_skippable_dialog");
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$n */
    static final class C31788n extends AbstractC89220m implements AbstractC89171a<List<? extends C31828h>> {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f75982a;

        static {
            Covode.recordClassIndex(38524);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31788n(I18nSignUpActivity i18nSignUpActivity) {
            super(0);
            this.f75982a = i18nSignUpActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ List<? extends C31828h> invoke() {
            I18nSignUpActivity i18nSignUpActivity = this.f75982a;
            List<C31828h> a = C31828h.C31831b.m66177a(false, new C31777c(i18nSignUpActivity));
            String b = i18nSignUpActivity.mo57715b();
            C89219l.m154716b(b, "");
            a.add(1, new C31847n(b, new Bundle(i18nSignUpActivity.mo57719e()), i18nSignUpActivity));
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$v */
    static final class C31797v extends AbstractC89220m implements AbstractC89171a<Bundle> {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f75997a;

        static {
            Covode.recordClassIndex(38533);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31797v(I18nSignUpActivity i18nSignUpActivity) {
            super(0);
            this.f75997a = i18nSignUpActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Bundle invoke() {
            Bundle bundleExtra = this.f75997a.getIntent().getBundleExtra("sign_up_data");
            Context context = BadParcelableCrashOptimizer.getContext();
            if (bundleExtra == null) {
                return new Bundle();
            }
            if (context == null) {
                return bundleExtra;
            }
            bundleExtra.setClassLoader(context.getClassLoader());
            return bundleExtra;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void finish() {
        super.finish();
        if (!m66105r()) {
            C36085cj.m73541a(10, 4, "");
            new Handler().postDelayed(new RunnableC31781g(this), 200);
        }
        overridePendingTransition(0, R.anim.a5);
        C31667a.m65983a(15);
    }

    /* renamed from: l */
    public final void mo57726l() {
        ViewPager viewPager = (ViewPager) _$_findCachedViewById(R.id.fgn);
        if (viewPager == null) {
            C89219l.m154715b();
        }
        ViewPager viewPager2 = (ViewPager) _$_findCachedViewById(R.id.fgn);
        if (viewPager2 == null) {
            C89219l.m154715b();
        }
        viewPager.setCurrentItem(1 - viewPager2.getCurrentItem());
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public void onBackPressed() {
        ViewPager viewPager = (ViewPager) _$_findCachedViewById(R.id.fgn);
        if (viewPager == null || viewPager.getCurrentItem() != 0) {
            ViewPager viewPager2 = (ViewPager) _$_findCachedViewById(R.id.fgn);
            C89219l.m154716b(viewPager2, "");
            ViewPager viewPager3 = (ViewPager) _$_findCachedViewById(R.id.fgn);
            C89219l.m154716b(viewPager3, "");
            viewPager2.setCurrentItem(viewPager3.getCurrentItem() - 1);
        } else if (!mo57722h()) {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (C17873f.f42636l) {
            mo57710a("background");
        } else {
            C39162r.m79460a("sign_up_main_page", new C31376a().mo57398a("stay_time", System.currentTimeMillis() - this.f75949i).f75156a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$i */
    static final class C31783i extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f75977a;

        static {
            Covode.recordClassIndex(38519);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31783i(I18nSignUpActivity i18nSignUpActivity) {
            super(0);
            this.f75977a = i18nSignUpActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = false;
            if (((int) TypedValue.applyDimension(1, (float) this.f75977a.getResources().getDisplayMetrics().heightPixels, this.f75977a.getResources().getDisplayMetrics())) >= 700) {
                Bundle bundleExtra = this.f75977a.getIntent().getBundleExtra("sign_up_data");
                Context context = BadParcelableCrashOptimizer.getContext();
                if (bundleExtra != null) {
                    if (context != null) {
                        bundleExtra.setClassLoader(context.getClassLoader());
                    }
                    z = bundleExtra.getBoolean("is_expandable_dialog");
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: q */
    private final String m66104q() {
        String str;
        String str2;
        try {
            StringBuilder sb = new StringBuilder();
            for (String str3 : mo57718d().keySet()) {
                StringBuilder append = new StringBuilder(" ").append(str3).append(":");
                Object a = m66100a(mo57718d(), str3);
                if (a != null) {
                    str2 = a.toString();
                } else {
                    str2 = null;
                }
                sb.append(append.append(str2).toString());
            }
            StringBuilder sb2 = new StringBuilder("call: ");
            ComponentName callingActivity = getCallingActivity();
            if (callingActivity == null || (str = callingActivity.getClassName()) == null) {
                str = "";
            }
            return sb2.append(str).append(" bundle:").append((Object) sb).toString();
        } catch (Exception unused) {
            return "Exception";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007a, code lost:
        if (r0.booleanValue() == false) goto L_0x007d;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m66106s() {
        /*
        // Method dump skipped, instructions count: 126
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.login.I18nSignUpActivity.m66106s():boolean");
    }

    /* renamed from: k */
    public final void mo57725k() {
        if (!GuestModeServiceImpl.m65990d().mo57218b() || GuestModeServiceImpl.m65990d().mo57219c() || !C31650h.f75706b.mo57657e()) {
            if (mo57724j()) {
                AutoRTLImageView autoRTLImageView = (AutoRTLImageView) _$_findCachedViewById(R.id.elw);
                C89219l.m154716b(autoRTLImageView, "");
                m66102b(autoRTLImageView);
                if (m66103p()) {
                    TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.e1w);
                    C89219l.m154716b(tuxTextView, "");
                    tuxTextView.setVisibility(0);
                    ((TuxTextView) _$_findCachedViewById(R.id.e1w)).setOnClickListener(new View$OnClickListenerC31801z(this));
                    return;
                }
                return;
            }
            if (m66103p() || !mo57722h()) {
                AutoRTLImageView autoRTLImageView2 = (AutoRTLImageView) _$_findCachedViewById(R.id.elk);
                C89219l.m154716b(autoRTLImageView2, "");
                m66101a(autoRTLImageView2);
            }
            AutoRTLImageView autoRTLImageView3 = (AutoRTLImageView) _$_findCachedViewById(R.id.elw);
            C89219l.m154716b(autoRTLImageView3, "");
            m66102b(autoRTLImageView3);
        } else if (mo57713a()) {
            AutoRTLImageView autoRTLImageView4 = (AutoRTLImageView) _$_findCachedViewById(R.id.elw);
            C89219l.m154716b(autoRTLImageView4, "");
            autoRTLImageView4.setVisibility(8);
            TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.e1w);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setVisibility(0);
            ((TuxTextView) _$_findCachedViewById(R.id.e1w)).setText(R.string.c9d);
            ((TuxTextView) _$_findCachedViewById(R.id.e1w)).setOnClickListener(new View$OnClickListenerC31800y(this));
        } else {
            AutoRTLImageView autoRTLImageView5 = (AutoRTLImageView) _$_findCachedViewById(R.id.elw);
            C89219l.m154716b(autoRTLImageView5, "");
            m66102b(autoRTLImageView5);
            TuxTextView tuxTextView3 = (TuxTextView) _$_findCachedViewById(R.id.e1w);
            C89219l.m154716b(tuxTextView3, "");
            tuxTextView3.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final boolean mo57713a() {
        PagerAdapter pagerAdapter;
        ViewPager viewPager = (ViewPager) _$_findCachedViewById(R.id.fgn);
        if (viewPager != null) {
            pagerAdapter = viewPager.getAdapter();
        } else {
            pagerAdapter = null;
        }
        Objects.requireNonNull(pagerAdapter, "null cannot be cast to non-null type androidx.fragment.app.FragmentPagerAdapter");
        ViewPager viewPager2 = (ViewPager) _$_findCachedViewById(R.id.fgn);
        C89219l.m154716b(viewPager2, "");
        Fragment a = ((AbstractC0974l) pagerAdapter).mo3639a(viewPager2.getCurrentItem());
        C89219l.m154716b(a, "");
        Bundle arguments = a.getArguments();
        if (arguments == null) {
            C89219l.m154715b();
        }
        return arguments.getBoolean("view_type", true);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$p */
    public static final class C31790p extends ViewPagerBottomSheetBehavior.AbstractC31806a {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f75984a;

        static {
            Covode.recordClassIndex(38526);
        }

        @Override // com.p2082ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior.AbstractC31806a
        /* renamed from: a */
        public final void mo57736a(View view) {
            C89219l.m154721d(view, "");
        }

        C31790p(I18nSignUpActivity i18nSignUpActivity) {
            this.f75984a = i18nSignUpActivity;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior.AbstractC31806a
        /* renamed from: a */
        public final void mo57737a(View view, int i) {
            C89219l.m154721d(view, "");
            if (i == 5) {
                this.f75984a.getWindow().setDimAmount(0.0f);
                this.f75984a.finish();
            }
        }
    }

    /* renamed from: a */
    private static Bundle m66099a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$w */
    public static final class View$OnClickListenerC31798w implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f75998a;

        static {
            Covode.recordClassIndex(38534);
        }

        View$OnClickListenerC31798w(I18nSignUpActivity i18nSignUpActivity) {
            this.f75998a = i18nSignUpActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f75998a.mo57710a("skip");
            this.f75998a.finish();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$z */
    public static final class View$OnClickListenerC31801z implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f76001a;

        static {
            Covode.recordClassIndex(38537);
        }

        View$OnClickListenerC31801z(I18nSignUpActivity i18nSignUpActivity) {
            this.f76001a = i18nSignUpActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f76001a.finish();
            this.f76001a.mo57710a("skip");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$c */
    static final class C31777c implements AbstractC34533b {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f75969a;

        static {
            Covode.recordClassIndex(38513);
        }

        C31777c(I18nSignUpActivity i18nSignUpActivity) {
            this.f75969a = i18nSignUpActivity;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2370c.AbstractC34533b
        /* renamed from: a */
        public final String mo57730a(C34531a aVar) {
            I18nSignUpActivity i18nSignUpActivity = this.f75969a;
            C89219l.m154716b(aVar, "");
            String str = (String) aVar.mo60999a();
            C89219l.m154716b(str, "");
            i18nSignUpActivity.mo57712a(false, str, "click_login", this.f75969a.mo57719e());
            return "";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$d */
    static final class C31778d implements AbstractC34533b {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f75970a;

        static {
            Covode.recordClassIndex(38514);
        }

        C31778d(I18nSignUpActivity i18nSignUpActivity) {
            this.f75970a = i18nSignUpActivity;
        }

        @Override // com.p2082ss.android.ugc.aweme.base.p2370c.AbstractC34533b
        /* renamed from: a */
        public final String mo57730a(C34531a aVar) {
            I18nSignUpActivity i18nSignUpActivity = this.f75970a;
            C89219l.m154716b(aVar, "");
            String str = (String) aVar.mo60999a();
            C89219l.m154716b(str, "");
            i18nSignUpActivity.mo57712a(true, str, "click_sign_up", this.f75970a.mo57720f());
            return "";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$r */
    static final class C31792r extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f75986a;

        static {
            Covode.recordClassIndex(38528);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31792r(I18nSignUpActivity i18nSignUpActivity) {
            super(1);
            this.f75986a = i18nSignUpActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(new AbstractC89171a<AbstractC17362a>(this) {
                /* class com.p2082ss.android.ugc.aweme.account.login.I18nSignUpActivity.C31792r.C317931 */

                /* renamed from: a */
                final /* synthetic */ C31792r f75987a;

                static {
                    Covode.recordClassIndex(38529);
                }

                {
                    this.f75987a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ AbstractC17362a invoke() {
                    if (this.f75987a.f75986a.mo57722h()) {
                        C33103x xVar = new C33103x(0, false, false, 7);
                        xVar.f78671e = R.attr.m;
                        xVar.f78672f = R.attr.m;
                        xVar.f78674h = true;
                        return xVar;
                    }
                    C33103x xVar2 = new C33103x(0, false, false, 7);
                    xVar2.f78668b = true;
                    xVar2.f78672f = R.attr.m;
                    xVar2.f78667a = true;
                    return xVar2;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$x */
    public static final class View$OnClickListenerC31799x implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f75999a;

        static {
            Covode.recordClassIndex(38535);
        }

        View$OnClickListenerC31799x(I18nSignUpActivity i18nSignUpActivity) {
            this.f75999a = i18nSignUpActivity;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            I18nSignUpActivity i18nSignUpActivity = this.f75999a;
            if (i18nSignUpActivity.mo57713a()) {
                str = "signup_login_homepage";
            } else {
                str = "login_homepage";
            }
            C32857g.m67458a(i18nSignUpActivity, str, this.f75999a.mo57717c());
        }
    }

    /* renamed from: a */
    private final void m66101a(AutoRTLImageView autoRTLImageView) {
        autoRTLImageView.setOnClickListener(new View$OnClickListenerC31798w(this));
        autoRTLImageView.setImageResource(2131231075);
        autoRTLImageView.setVisibility(0);
    }

    /* renamed from: b */
    private final void m66102b(AutoRTLImageView autoRTLImageView) {
        autoRTLImageView.setOnClickListener(new View$OnClickListenerC31799x(this));
        autoRTLImageView.setImageResource(R.drawable.jj);
        autoRTLImageView.setVisibility(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$u */
    public static final class C31796u implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        public int f75992a;

        /* renamed from: b */
        public float f75993b;

        /* renamed from: c */
        public int f75994c;

        /* renamed from: d */
        final /* synthetic */ I18nSignUpActivity f75995d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f75996e;

        static {
            Covode.recordClassIndex(38532);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            C31943j jVar;
            int i2 = 1 - i;
            if (i2 >= 0 && i2 < this.f75996e.size()) {
                C31971o oVar = (C31971o) this.f75996e.get(i2);
                if (oVar.af_() && (jVar = oVar.f76355a) != null) {
                    jVar.mo57871a().mo4413b(0);
                }
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
            if (this.f75992a == 0 && i == 1) {
                TuxTextView tuxTextView = (TuxTextView) this.f75995d._$_findCachedViewById(R.id.eiz);
                C89219l.m154716b(tuxTextView, "");
                this.f75993b = tuxTextView.getAlpha();
            } else if (i == 0) {
                I18nSignUpActivity i18nSignUpActivity = this.f75995d;
                if (i18nSignUpActivity.mo57713a()) {
                    TuxTextView tuxTextView2 = (TuxTextView) i18nSignUpActivity._$_findCachedViewById(R.id.eiz);
                    C89219l.m154716b(tuxTextView2, "");
                    tuxTextView2.setText(i18nSignUpActivity.getText(R.string.aq5));
                } else {
                    TuxTextView tuxTextView3 = (TuxTextView) i18nSignUpActivity._$_findCachedViewById(R.id.eiz);
                    C89219l.m154716b(tuxTextView3, "");
                    tuxTextView3.setText(i18nSignUpActivity.getString(R.string.aoh));
                }
                this.f75995d.mo57725k();
                ViewPager viewPager = (ViewPager) this.f75995d._$_findCachedViewById(R.id.fgn);
                C89219l.m154716b(viewPager, "");
                this.f75994c = viewPager.getCurrentItem();
            }
            this.f75992a = i;
        }

        C31796u(I18nSignUpActivity i18nSignUpActivity, ArrayList arrayList) {
            this.f75995d = i18nSignUpActivity;
            this.f75996e = arrayList;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
            if (this.f75993b != 0.0f && f != 0.0f) {
                TuxTextView tuxTextView = (TuxTextView) this.f75995d._$_findCachedViewById(R.id.eiz);
                C89219l.m154716b(tuxTextView, "");
                float f2 = this.f75993b;
                if (this.f75994c == 0) {
                    f = 1.0f - f;
                }
                tuxTextView.setAlpha(f2 * f);
                View _$_findCachedViewById = this.f75995d._$_findCachedViewById(R.id.amc);
                C89219l.m154716b(_$_findCachedViewById, "");
                TuxTextView tuxTextView2 = (TuxTextView) this.f75995d._$_findCachedViewById(R.id.eiz);
                C89219l.m154716b(tuxTextView2, "");
                _$_findCachedViewById.setAlpha(tuxTextView2.getAlpha());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$y */
    public static final class View$OnClickListenerC31800y implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f76000a;

        static {
            Covode.recordClassIndex(38536);
        }

        View$OnClickListenerC31800y(I18nSignUpActivity i18nSignUpActivity) {
            this.f76000a = i18nSignUpActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39162r.m79460a("click_skip_to_watch", new C31376a().f75156a);
            IGuestModeService d = GuestModeServiceImpl.m65990d();
            I18nSignUpActivity i18nSignUpActivity = this.f76000a;
            Bundle bundle = new Bundle();
            bundle.putString("enter_method", this.f76000a.mo57717c());
            bundle.putString("enter_from", this.f76000a.mo57715b());
            d.mo57216a(i18nSignUpActivity, bundle);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.p2247f.C31667a.AbstractC31669b
    /* renamed from: a */
    public final void mo57661a(int i) {
        if (i == 11) {
            this.f75942a = true;
            finish();
        } else if (i == 14) {
            finish();
        } else if (i == 15) {
            super.finish();
        }
    }

    /* renamed from: b */
    public final void mo57716b(String str) {
        C89219l.m154721d(str, "");
        if (mo57722h()) {
            C39162r.m79460a("exit_cold_launch_login_notify", new C31376a().mo57399a("enter_method", mo57717c()).mo57399a("enter_from", mo57715b()).mo57399a("exit_method", str).f75156a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.I18nSignUpActivity$s */
    public static final class C31794s extends AbstractC0974l {

        /* renamed from: a */
        final /* synthetic */ I18nSignUpActivity f75988a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f75989b;

        static {
            Covode.recordClassIndex(38530);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public final int getCount() {
            return 2;
        }

        @Override // androidx.fragment.app.AbstractC0974l
        /* renamed from: a */
        public final Fragment mo3639a(int i) {
            C31971o oVar = new C31971o();
            this.f75989b.add(oVar);
            Bundle bundle = new Bundle();
            if (i == 0) {
                bundle.putBoolean("view_type", !this.f75988a.mo57721g());
            } else {
                bundle.putBoolean("view_type", this.f75988a.mo57721g());
            }
            bundle.putBoolean("show_learn_feed_toast", ((Boolean) this.f75988a.f75945d.getValue()).booleanValue());
            bundle.putBoolean("is_from_new_user_journey", this.f75988a.mo57724j());
            bundle.putBoolean("age_gate_block", ((Boolean) this.f75988a.f75946e.getValue()).booleanValue());
            bundle.putBoolean("is_fullscreen", this.f75988a.mo57722h());
            bundle.putBoolean("is_expandable_dialog", this.f75988a.mo57723i());
            oVar.setArguments(bundle);
            return oVar;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31794s(I18nSignUpActivity i18nSignUpActivity, ArrayList arrayList, AbstractC0952i iVar) {
            super(iVar);
            this.f75988a = i18nSignUpActivity;
            this.f75989b = arrayList;
        }

        @Override // androidx.viewpager.widget.PagerAdapter, androidx.fragment.app.AbstractC0974l
        public final void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(obj, "");
            super.setPrimaryItem(viewGroup, i, obj);
            while (i + 1 > this.f75989b.size()) {
                mo3639a(i);
            }
            I18nSignUpActivity i18nSignUpActivity = this.f75988a;
            i18nSignUpActivity.mo57711a(i18nSignUpActivity.mo57713a());
        }
    }

    /* renamed from: a */
    public final void mo57710a(String str) {
        if (mo57722h()) {
            C39162r.m79460a("exit_cold_launch_login_notify", new C31376a().mo57399a("enter_method", mo57717c()).mo57399a("enter_from", mo57715b()).mo57399a("exit_method", str).f75156a);
        }
    }

    /* renamed from: a */
    public final void mo57711a(boolean z) {
        if (!mo57723i() || !z || this.f75944c) {
            ((NonSwipeableViewPager) _$_findCachedViewById(R.id.fgn)).setShouldLimitHeight(false);
        } else {
            ((NonSwipeableViewPager) _$_findCachedViewById(R.id.fgn)).setShouldLimitHeight(true);
        }
        ((NonSwipeableViewPager) _$_findCachedViewById(R.id.fgn)).requestLayout();
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        Map<String, Object> a;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.I18nSignUpActivity", "onCreate", true);
        AccountService.m65215a().mo57079o();
        String b = C36085cj.m73548b();
        C89219l.m154716b(b, "");
        this.f75943b = b;
        activityConfiguration(new C31792r(this));
        super.onCreate(bundle);
        C31667a.m65984a(this);
        supportRequestWindowFeature(1);
        setContentView(R.layout.h2);
        ArrayList arrayList = new ArrayList();
        ViewPager viewPager = (ViewPager) _$_findCachedViewById(R.id.fgn);
        C89219l.m154716b(viewPager, "");
        viewPager.setAdapter(new C31794s(this, arrayList, getSupportFragmentManager()));
        if (!m66105r()) {
            C36085cj.m73541a(10, 1, "");
        }
        Window window = getWindow();
        window.setGravity(80);
        window.setLayout(-1, -1);
        if (mo57722h()) {
            CoordinatorLayout.C0560e eVar = new CoordinatorLayout.C0560e(-1, -1);
            eVar.setMargins(0, 0, 0, 0);
            RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(R.id.dnb);
            C89219l.m154716b(relativeLayout, "");
            relativeLayout.setLayoutParams(eVar);
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) _$_findCachedViewById(R.id.aed);
            C89219l.m154716b(coordinatorLayout, "");
            ViewGroup.LayoutParams layoutParams = coordinatorLayout.getLayoutParams();
            if (layoutParams != null) {
                ((FrameLayout.LayoutParams) layoutParams).topMargin = 0;
                RelativeLayout relativeLayout2 = (RelativeLayout) _$_findCachedViewById(R.id.dnb);
                C89219l.m154716b(relativeLayout2, "");
                ViewGroup.LayoutParams layoutParams2 = relativeLayout2.getLayoutParams();
                if (layoutParams2 != null) {
                    ((CoordinatorLayout.C0560e) layoutParams2).mo2538a((CoordinatorLayout.AbstractC0557b) null);
                    RelativeLayout relativeLayout3 = (RelativeLayout) _$_findCachedViewById(R.id.dnb);
                    C89219l.m154716b(relativeLayout3, "");
                    relativeLayout3.setBackground(C0643b.m2369a(this, (int) R.color.l));
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                    ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.I18nSignUpActivity", "onCreate", false);
                    throw nullPointerException;
                }
            } else {
                NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.I18nSignUpActivity", "onCreate", false);
                throw nullPointerException2;
            }
        } else {
            ViewPagerBottomSheetBehavior b2 = ViewPagerBottomSheetBehavior.m66141b(_$_findCachedViewById(R.id.dnb));
            b2.f76011e = true;
            b2.mo57750b();
            b2.f76018l = new C31790p(this);
            b2.f76021o = new C31791q(this);
            if (!mo57723i()) {
                ((RelativeLayout) _$_findCachedViewById(R.id.dnb)).post(new RunnableC31795t(this, b2));
            }
        }
        ((ViewPager) _$_findCachedViewById(R.id.fgn)).addOnPageChangeListener(new C31796u(this, arrayList));
        C31928g.m66295a((ViewPager) _$_findCachedViewById(R.id.fgn));
        mo57725k();
        if (bundle == null) {
            if (mo57713a()) {
                a = C32404v.m66765a(mo57720f());
                String b3 = mo57715b();
                C89219l.m154716b(b3, "");
                String c = mo57717c();
                C89219l.m154716b(c, "");
                C31771a.m66133a(b3, c, "click_sign_up", a, mo57727m(), mo57729o());
            } else {
                a = C32404v.m66765a(mo57719e());
                String b4 = mo57715b();
                C89219l.m154716b(b4, "");
                String c2 = mo57717c();
                C89219l.m154716b(c2, "");
                C31771a.m66133a(b4, c2, "click_login", a, mo57728n(), mo57728n().size() - 1);
            }
            if (a == null) {
                C39162r.m79460a("account_debug_info", new C31376a().mo57399a("info", m66104q()).f75156a);
            }
        }
        C32819y.C32820a.m67397a();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.I18nSignUpActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final boolean mo57714a(SmartRoute smartRoute) {
        C89219l.m154721d(smartRoute, "");
        m66107t();
        this.f75948g = smartRoute;
        return m66106s();
    }

    /* renamed from: a */
    private static Object m66100a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    /* renamed from: a */
    public final void mo57712a(boolean z, String str, String str2, Bundle bundle) {
        boolean z2;
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            z2 = m66108u();
            C58029j.f132256h = z2;
        } else {
            z2 = C58029j.f132256h;
        }
        if (!z2) {
            new C79459a(this).mo123050a(R.string.dcq).mo123053a();
            return;
        }
        if (mo57720f().getBoolean("is_multi_account", false) && C32816w.C32817a.m67394a()) {
            bundle.putBoolean("is_multi_account_same_user", true);
        }
        if (!z || !C39223a.m79594h().mo68584c() || TextUtils.equals(str, "facebook") || TextUtils.equals(str, "google")) {
            m66107t();
            this.f75947f = C31858ab.m66184a(this, z, str, new C31782h(this, str2, bundle));
            if (!m66106s()) {
                C31858ab.m66186a(this, this.f75947f);
            }
        } else {
            SmartRoute a = C32867m.m67466a(this);
            bundle.putBoolean("age_gate_block", true);
            a.withParam(bundle);
            if (!mo57714a(a)) {
                a.open();
            }
        }
        mo57716b("click_platform");
    }
}
