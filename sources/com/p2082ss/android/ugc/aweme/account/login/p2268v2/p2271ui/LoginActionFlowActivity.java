package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.CommonFlowActivity;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import java.io.Serializable;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.LoginActionFlowActivity */
public final class LoginActionFlowActivity extends CommonFlowActivity {

    /* renamed from: a */
    private final AbstractC89244h f77777a = C89250i.m154773a((AbstractC89171a) new C32603a(this));

    /* renamed from: h */
    private HashMap f77778h;

    static {
        Covode.recordClassIndex(39378);
    }

    /* renamed from: i */
    private final C32789g m67097i() {
        return (C32789g) this.f77777a.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.CommonFlowActivity, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f77778h;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.CommonFlowActivity, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f77778h == null) {
            this.f77778h = new HashMap();
        }
        View view = (View) this.f77778h.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f77778h.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.CommonFlowActivity, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.CommonFlowActivity
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.CommonFlowActivity
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.LoginActionFlowActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.LoginActionFlowActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.CommonFlowActivity, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.CommonFlowActivity
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.LoginActionFlowActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.LoginActionFlowActivity$a */
    static final class C32603a extends AbstractC89220m implements AbstractC89171a<C32789g> {

        /* renamed from: a */
        final /* synthetic */ LoginActionFlowActivity f77779a;

        static {
            Covode.recordClassIndex(39379);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32603a(LoginActionFlowActivity loginActionFlowActivity) {
            super(0);
            this.f77779a = loginActionFlowActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C32789g invoke() {
            Serializable serializable;
            Intent intent = this.f77779a.getIntent();
            if (intent != null) {
                serializable = intent.getSerializableExtra("LoginActionContext");
            } else {
                serializable = null;
            }
            if (!(serializable instanceof C32789g)) {
                return null;
            }
            return serializable;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
        AbstractC32572b d;
        AbstractC32572b d2 = mo58454d();
        if ((d2 == null || !d2.mo57458q()) && (d = mo58454d()) != null) {
            Bundle arguments = d.getArguments();
            if (arguments == null) {
                C89219l.m154715b();
            }
            arguments.putInt("next_page", EnumC32594j.FINISH.getValue());
            Bundle arguments2 = d.getArguments();
            if (arguments2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(arguments2, "");
            d.mo58461a(arguments2);
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

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.LoginActionFlowActivity$b */
    static final class C32604b extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C32604b f77780a = new C32604b();

        static {
            Covode.recordClassIndex(39380);
        }

        C32604b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C326051.f77781a);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.CommonFlowActivity, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.LoginActionFlowActivity", "onCreate", true);
        activityConfiguration(C32604b.f77780a);
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.ui.LoginActionFlowActivity", "onCreate", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.CommonFlowActivity
    /* renamed from: a */
    public final void mo57417a(Bundle bundle) {
        EnumC32594j jVar;
        if (bundle != null && EnumC32594j.C32595a.m67087a(bundle.getInt("next_page", EnumC32594j.FINISH.getValue())) == EnumC32594j.FINISH) {
            EnumC32594j a = EnumC32594j.C32595a.m67087a(bundle.getInt("current_page", -1));
            while (true) {
                C89219l.m154721d(a, "");
                int i = C32790h.f78140a[a.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        C32789g i2 = m67097i();
                        if (i2 != null && i2.getNeedShowPrivateAccountTips()) {
                            jVar = EnumC32594j.PRIVATE_ACCOUNT_TIPS;
                            break;
                        }
                        a = EnumC32594j.PRIVATE_ACCOUNT_TIPS;
                    } else {
                        jVar = EnumC32594j.FINISH;
                        break;
                    }
                } else {
                    C32789g i3 = m67097i();
                    if (i3 != null && i3.getNeedSetUserName()) {
                        jVar = EnumC32594j.CREATE_USERNAME;
                        break;
                    }
                    a = EnumC32594j.CREATE_USERNAME;
                }
            }
            if (jVar == EnumC32594j.FINISH) {
                mo57418b(null);
                return;
            }
            bundle.putInt("next_page", jVar.getValue());
        }
        super.mo57417a(bundle);
    }
}
