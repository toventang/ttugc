package com.p2082ss.android.ugc.aweme.account.login.rememberaccount;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.login.EnumC32330v;
import com.p2082ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;
import com.p2082ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.CommonFlowActivity;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32404v;
import com.p2082ss.android.ugc.aweme.account.login.rememberaccount.C32065c;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.account.p2247f.C31667a;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32857g;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListActivity */
public final class LoginMethodListActivity extends CommonFlowActivity implements C31667a.AbstractC31669b {

    /* renamed from: a */
    public static final C32045a f76499a = new C32045a((byte) 0);

    /* renamed from: h */
    private HashMap f76500h;

    static {
        Covode.recordClassIndex(38800);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.CommonFlowActivity, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f76500h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.CommonFlowActivity, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f76500h == null) {
            this.f76500h = new HashMap();
        }
        View view = (View) this.f76500h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f76500h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.CommonFlowActivity
    /* renamed from: c */
    public final int mo58017c() {
        return -1;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.CommonFlowActivity
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.CommonFlowActivity
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.CommonFlowActivity, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.CommonFlowActivity
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListActivity$a */
    public static final class C32045a {
        static {
            Covode.recordClassIndex(38801);
        }

        private C32045a() {
        }

        public /* synthetic */ C32045a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m66442a(Activity activity, Bundle bundle, List<? extends BaseLoginMethod> list, IAccountService.AbstractC31277g gVar) {
            int i;
            long time;
            C89219l.m154721d(activity, "");
            C89219l.m154721d(bundle, "");
            C89219l.m154721d(list, "");
            HashMap hashMap = new HashMap();
            Map<String, Object> a = C32404v.m66765a(bundle);
            if (a != null) {
                hashMap.putAll(a);
            }
            C31376a aVar = new C31376a();
            hashMap.put("show_user_cnt", Integer.valueOf(list.size()));
            hashMap.put("trust_one_click_is_show", 1);
            hashMap.put("login_last_time", 1);
            HashSet hashSet = new HashSet();
            JSONArray jSONArray = new JSONArray();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                JSONObject jSONObject = new JSONObject();
                try {
                    BaseLoginMethod baseLoginMethod = (BaseLoginMethod) list.get(i2);
                    String a2 = C32052a.m66445a(baseLoginMethod);
                    hashSet.add(a2);
                    jSONObject.put("user_id", baseLoginMethod.getUid());
                    jSONObject.put("platform", a2);
                    Long lastActiveTime = baseLoginMethod.getLastActiveTime();
                    if (lastActiveTime == null || lastActiveTime.longValue() <= 0) {
                        time = baseLoginMethod.getExpires().getTime() - 2592000000L;
                    } else {
                        Long lastActiveTime2 = baseLoginMethod.getLastActiveTime();
                        if (lastActiveTime2 == null) {
                            C89219l.m154715b();
                        }
                        time = lastActiveTime2.longValue();
                    }
                    jSONArray.put(jSONObject.put("last_active", C32065c.C32069b.m66462a(time)));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            String jSONArray2 = jSONArray.toString();
            C89219l.m154716b(jSONArray2, "");
            hashMap.put("user_detail", jSONArray2);
            EnumC32330v[] values = EnumC32330v.values();
            C89219l.m154716b(values, "");
            for (EnumC32330v vVar : values) {
                String name = vVar.name();
                Locale locale = Locale.ENGLISH;
                C89219l.m154716b(locale, "");
                Objects.requireNonNull(name, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = name.toLowerCase(locale);
                C89219l.m154716b(lowerCase, "");
                aVar.mo57397a(lowerCase + "_is_show", hashSet.contains(lowerCase) ? 1 : 0);
            }
            if (hashSet.contains("email") || hashSet.contains("sms_verification") || hashSet.contains("sms_verification") || hashSet.contains("phone") || hashSet.contains("handle")) {
                i = 1;
            } else {
                i = 0;
            }
            aVar.mo57397a("phone_email_show", i);
            aVar.mo57399a("enter_method", bundle.getString("enter_method", ""));
            aVar.mo57399a("enter_from", bundle.getString("enter_from", ""));
            aVar.mo57399a("enter_type", "click_login");
            C32404v.m66768a(aVar, hashMap);
            C39162r.m79460a("login_notify", aVar.f75156a);
            Intent intent = new Intent(activity, LoginMethodListActivity.class);
            intent.putExtra("next_page", EnumC32594j.ONE_KEY_LOGIN.getValue());
            intent.putExtra("current_scene", EnumC32592i.ONE_KEY_LOGIN.getValue());
            intent.putExtras(bundle);
            intent.putExtra("action_type", EnumC32592i.ONE_KEY_LOGIN.getValue());
            intent.putExtra("origin_bundle", bundle);
            intent.putExtra("ONE_KEY_LOGIN_MOB_PARAMS", hashMap);
            CommonFlowActivity.C32560a.m67021a(activity, EnumC32592i.ONE_KEY_LOGIN.getValue(), gVar, false);
            C84349a.m145093a(intent, activity);
            activity.startActivity(intent);
            activity.overridePendingTransition(R.anim.a3, 0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a
    /* renamed from: a */
    public final void mo58015a() {
        setContentView(R.layout.fk);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.CommonFlowActivity
    public final void finish() {
        overridePendingTransition(0, R.anim.a5);
        super.finish();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.CommonFlowActivity, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        C31667a.m65986b(this);
        super.onDestroy();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a
    /* renamed from: b */
    public final void mo58016b() {
        supportRequestWindowFeature(1);
        Window window = getWindow();
        window.setGravity(80);
        window.setLayout(-1, -1);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListActivity$c */
    static final class RunnableC32047c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LoginMethodListActivity f76503a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89236c f76504b;

        /* renamed from: c */
        final /* synthetic */ ViewPagerBottomSheetBehavior f76505c;

        static {
            Covode.recordClassIndex(38803);
        }

        RunnableC32047c(LoginMethodListActivity loginMethodListActivity, C89233z.C89236c cVar, ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior) {
            this.f76503a = loginMethodListActivity;
            this.f76504b = cVar;
            this.f76505c = viewPagerBottomSheetBehavior;
        }

        public final void run() {
            RelativeLayout relativeLayout = (RelativeLayout) this.f76503a._$_findCachedViewById(R.id.dnb);
            C89219l.m154716b(relativeLayout, "");
            if (relativeLayout.getHeight() != this.f76504b.element) {
                ViewPagerBottomSheetBehavior viewPagerBottomSheetBehavior = this.f76505c;
                C89219l.m154716b(viewPagerBottomSheetBehavior, "");
                RelativeLayout relativeLayout2 = (RelativeLayout) this.f76503a._$_findCachedViewById(R.id.dnb);
                C89219l.m154716b(relativeLayout2, "");
                viewPagerBottomSheetBehavior.mo57751b(relativeLayout2.getHeight());
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.CommonFlowActivity, androidx.appcompat.app.ActivityC0218d
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

    /* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListActivity$d */
    static final class C32048d extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C32048d f76506a = new C32048d();

        static {
            Covode.recordClassIndex(38804);
        }

        C32048d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C320491.f76507a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListActivity$e */
    static final class View$OnClickListenerC32050e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LoginMethodListActivity f76508a;

        static {
            Covode.recordClassIndex(38806);
        }

        View$OnClickListenerC32050e(LoginMethodListActivity loginMethodListActivity) {
            this.f76508a = loginMethodListActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            LoginMethodListActivity loginMethodListActivity = this.f76508a;
            C32857g.m67458a(loginMethodListActivity, "trust_one_click_pad", loginMethodListActivity.mo58456f());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListActivity$f */
    static final class View$OnClickListenerC32051f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LoginMethodListActivity f76509a;

        static {
            Covode.recordClassIndex(38807);
        }

        View$OnClickListenerC32051f(LoginMethodListActivity loginMethodListActivity) {
            this.f76509a = loginMethodListActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f76509a.finish();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.p2247f.C31667a.AbstractC31669b
    /* renamed from: a */
    public final void mo57661a(int i) {
        if (i == 11) {
            mo58449a(i, (Bundle) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0055  */
    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.CommonFlowActivity, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r12) {
        /*
        // Method dump skipped, instructions count: 196
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.rememberaccount.LoginMethodListActivity$b */
    public static final class C32046b extends ViewPagerBottomSheetBehavior.AbstractC31806a {

        /* renamed from: a */
        final /* synthetic */ LoginMethodListActivity f76501a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89236c f76502b;

        static {
            Covode.recordClassIndex(38802);
        }

        @Override // com.p2082ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior.AbstractC31806a
        /* renamed from: a */
        public final void mo57736a(View view) {
            C89219l.m154721d(view, "");
        }

        C32046b(LoginMethodListActivity loginMethodListActivity, C89233z.C89236c cVar) {
            this.f76501a = loginMethodListActivity;
            this.f76502b = cVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior.AbstractC31806a
        /* renamed from: a */
        public final void mo57737a(View view, int i) {
            C89219l.m154721d(view, "");
            if (i == 5) {
                this.f76501a.getWindow().setDimAmount(0.0f);
                this.f76501a.finish();
            }
        }
    }
}
