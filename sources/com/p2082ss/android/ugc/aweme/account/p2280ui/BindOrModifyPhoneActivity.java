package com.p2082ss.android.ugc.aweme.account.p2280ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1210r;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.ActionResultModel;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32791i;
import com.p2082ss.android.ugc.aweme.app.services.IPushLaunchPageAssistantService;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity */
public final class BindOrModifyPhoneActivity extends AbstractActivityC32568a {

    /* renamed from: d */
    public static final C32953a f78406d = new C32953a((byte) 0);

    /* renamed from: a */
    public boolean f78407a;

    /* renamed from: b */
    public Bundle f78408b;

    /* renamed from: c */
    public Integer f78409c;

    /* renamed from: e */
    private EnumC32594j f78410e = EnumC32594j.INPUT_PHONE_BIND;

    /* renamed from: f */
    private final AbstractC89244h f78411f = C89250i.m154773a((AbstractC89171a) new C32956c(this));

    /* renamed from: g */
    private HashMap f78412g;

    static {
        Covode.recordClassIndex(39747);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f78412g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f78412g == null) {
            this.f78412g = new HashMap();
        }
        View view = (View) this.f78412g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f78412g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public final Bundle mo58017c() {
        return (Bundle) this.f78411f.getValue();
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity$a */
    public static final class C32953a {
        static {
            Covode.recordClassIndex(39748);
        }

        private C32953a() {
        }

        public /* synthetic */ C32953a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity$c */
    static final class C32956c extends AbstractC89220m implements AbstractC89171a<Bundle> {

        /* renamed from: a */
        final /* synthetic */ BindOrModifyPhoneActivity f78415a;

        static {
            Covode.recordClassIndex(39751);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32956c(BindOrModifyPhoneActivity bindOrModifyPhoneActivity) {
            super(0);
            this.f78415a = bindOrModifyPhoneActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Bundle invoke() {
            Bundle bundle;
            if (m67594a(this.f78415a.getIntent()) != null) {
                bundle = new Bundle(m67594a(this.f78415a.getIntent()));
            } else {
                bundle = new Bundle();
            }
            bundle.remove("next_page");
            bundle.remove("current_scene");
            return bundle;
        }

        /* renamed from: a */
        private static Bundle m67594a(Intent intent) {
            try {
                return intent.getExtras();
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void finish() {
        super.finish();
        if (this.f78407a) {
            Integer num = this.f78409c;
            if (num == null) {
                C89219l.m154715b();
            }
            C36085cj.m73540a(num.intValue(), 1, this.f78408b);
            return;
        }
        ((IPushLaunchPageAssistantService) C31291a.m65463a(IPushLaunchPageAssistantService.class)).mo60086a(this);
        User f = C36085cj.m73552f();
        if (f != null && !f.isPhoneBinded()) {
            C36085cj.m73540a(7, 2, (Object) null);
        }
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

    /* renamed from: a */
    private static Bundle m67589a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity$b */
    static final class C32954b extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C32954b f78413a = new C32954b();

        static {
            Covode.recordClassIndex(39749);
        }

        C32954b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C329551.f78414a);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a
    /* renamed from: a */
    public final void mo57417a(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        EnumC32594j a = EnumC32594j.C32595a.m67087a(bundle2.getInt("next_page", EnumC32594j.INPUT_PHONE_BIND.getValue()));
        bundle2.putInt("previous_page", bundle2.getInt("current_page", -1));
        bundle2.putInt("current_page", a.getValue());
        bundle2.remove("next_page");
        AbstractActivityC32568a.m67029a(this, C32791i.m67383a(a), bundle2);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a
    /* renamed from: b */
    public final void mo57418b(Bundle bundle) {
        if (mo58017c().getBoolean("show_success_toast", true)) {
            Context applicationContext = getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            new C79459a(applicationContext).mo123052a(getString(R.string.fk4)).mo123053a();
        }
        finish();
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity", "onCreate", true);
        activityConfiguration(C32954b.f78413a);
        super.onCreate(bundle);
        getWindow().setBackgroundDrawable(new ColorDrawable(C0643b.m2378c(this, R.color.l)));
        this.f78410e = EnumC32594j.C32595a.m67087a(getIntent().getIntExtra("next_page", EnumC32594j.INPUT_PHONE_BIND.getValue()));
        if (getIntent().getIntExtra("current_scene", EnumC32592i.NONE.getValue()) == EnumC32592i.NONE.getValue()) {
            getIntent().putExtra("current_scene", EnumC32592i.BIND_PHONE.getValue());
            getIntent().putExtra("enter_method", "first_bind_phone_click");
        }
        if (bundle == null) {
            C1210r<Bundle> rVar = ((ActionResultModel) C1181ae.m3881a(this, (C1175ad.AbstractC1177b) null).mo3983a(ActionResultModel.class)).f77690a;
            Bundle a = m67589a(getIntent());
            if (a == null) {
                a = new Bundle();
            }
            a.putString("enter_from", m67590a(getIntent(), "ENTER_REASON"));
            a.putString("enter_method", m67590a(getIntent(), "enter_method"));
            a.putString("enter_type", mo58457g());
            a.putInt("next_page", this.f78410e.getValue());
            rVar.postValue(a);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.ui.BindOrModifyPhoneActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m67590a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
