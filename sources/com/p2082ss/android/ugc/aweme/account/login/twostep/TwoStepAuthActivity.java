package com.p2082ss.android.ugc.aweme.account.login.twostep;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.titlebar.AbstractC17250a;
import com.bytedance.ies.dmt.p1194ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.account.login.twostep.C32232n;
import com.p2082ss.android.ugc.aweme.account.p2248g.C31672b;
import com.p2082ss.android.ugc.aweme.account.p2280ui.AbstractC32989c;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity */
public final class TwoStepAuthActivity extends ActivityC17312a implements C32232n.AbstractC32233a, AbstractC32989c {

    /* renamed from: f */
    public static final boolean f76613f = false;

    /* renamed from: g */
    public static final C32109a f76614g = new C32109a((byte) 0);

    /* renamed from: a */
    public C32232n f76615a;

    /* renamed from: b */
    public String f76616b;

    /* renamed from: c */
    public String f76617c;

    /* renamed from: d */
    public String f76618d;

    /* renamed from: e */
    public AbstractC32110b f76619e;

    /* renamed from: h */
    private ViewStub f76620h;

    /* renamed from: i */
    private int f76621i = -1;

    /* renamed from: j */
    private AbstractC32989c.AbstractC32990a f76622j;

    /* renamed from: k */
    private boolean f76623k;

    /* renamed from: l */
    private HashMap f76624l;

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity$b */
    public interface AbstractC32110b {
        static {
            Covode.recordClassIndex(38871);
        }

        /* renamed from: a */
        void mo58071a(int i, int i2, Intent intent);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f76624l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f76624l == null) {
            this.f76624l = new HashMap();
        }
        View view = (View) this.f76624l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f76624l.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity$a */
    public static final class C32109a {
        static {
            Covode.recordClassIndex(38870);
        }

        private C32109a() {
        }

        public /* synthetic */ C32109a(byte b) {
            this();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        this.f76619e = null;
    }

    static {
        Covode.recordClassIndex(38869);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void finish() {
        if (this.f76623k) {
            C32231m.m66598a().mo58245a(new C31672b(null, null, 0, "User left TwoStepAuthActivity before completing auth process"));
        }
        super.finish();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
        AbstractC32989c.AbstractC32990a aVar = this.f76622j;
        if (aVar == null || !aVar.mo58811a()) {
            this.f76623k = true;
            finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity$e */
    static final class CallableC32114e<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ TwoStepAuthActivity f76628a;

        static {
            Covode.recordClassIndex(38875);
        }

        CallableC32114e(TwoStepAuthActivity twoStepAuthActivity) {
            this.f76628a = twoStepAuthActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Boolean call() {
            JSONObject jSONObject;
            boolean z;
            String str = null;
            try {
                jSONObject = new JSONObject(this.f76628a.f76617c);
            } catch (JSONException unused) {
                jSONObject = null;
            }
            if (jSONObject != null) {
                C32232n nVar = this.f76628a.f76615a;
                if (nVar != null) {
                    C89219l.m154721d(jSONObject, "");
                    nVar.f76907h = jSONObject;
                }
                TwoStepAuthActivity twoStepAuthActivity = this.f76628a;
                JSONObject jSONObject2 = jSONObject.getJSONObject("data");
                if (jSONObject2 != null) {
                    str = jSONObject2.optString("profile_key");
                }
                twoStepAuthActivity.f76618d = str;
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
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

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity$d */
    public static final class C32113d implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ TwoStepAuthActivity f76627a;

        static {
            Covode.recordClassIndex(38874);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C32113d(TwoStepAuthActivity twoStepAuthActivity) {
            this.f76627a = twoStepAuthActivity;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            this.f76627a.onBackPressed();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity$c */
    static final class C32111c extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C32111c f76625a = new C32111c();

        static {
            Covode.recordClassIndex(38872);
        }

        C32111c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C321121.f76626a);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.twostep.C32232n.AbstractC32233a
    /* renamed from: a */
    public final void mo58070a(String str) {
        C32231m.m66598a().mo58245a(new C31672b(str, this.f76618d, 0, null));
        finish();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity$f */
    static final class C32115f<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ TwoStepAuthActivity f76629a;

        static {
            Covode.recordClassIndex(38876);
        }

        C32115f(TwoStepAuthActivity twoStepAuthActivity) {
            this.f76629a = twoStepAuthActivity;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<Boolean> iVar) {
            if (!C80214ai.m139043a(iVar)) {
                return C89391z.f203057a;
            }
            C32232n nVar = this.f76629a.f76615a;
            if (nVar != null) {
                nVar.f76908i = this.f76629a.f76616b;
            }
            C32232n nVar2 = this.f76629a.f76615a;
            if (nVar2 != null) {
                return nVar2.mo58188a();
            }
            return null;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity", "onCreate", true);
        activityConfiguration(C32111c.f76625a);
        super.onCreate(bundle);
        setContentView(R.layout.fn);
        ((NormalTitleBar) _$_findCachedViewById(R.id.f7t)).setOnTitleBarClickListener(new C32113d(this));
        ((AbstractC17250a) _$_findCachedViewById(R.id.f7t)).mo27298a(false);
        NormalTitleBar normalTitleBar = (NormalTitleBar) _$_findCachedViewById(R.id.f7t);
        C89219l.m154716b(normalTitleBar, "");
        normalTitleBar.getStartBtn().setImageResource(R.drawable.ccv);
        ViewStub viewStub = (ViewStub) findViewById(R.id.f7s);
        C89219l.m154716b(viewStub, "");
        this.f76620h = viewStub;
        this.f76621i = getIntent().getIntExtra("auth_type", -1);
        this.f76617c = m66492a(getIntent(), "auth_data");
        this.f76616b = m66492a(getIntent(), "url_path");
        if (this.f76621i == -1) {
            finish();
        } else if (TextUtils.isEmpty(this.f76617c)) {
            finish();
        } else {
            int i = this.f76621i;
            if (i == 1) {
                ViewStub viewStub2 = this.f76620h;
                if (viewStub2 == null) {
                    C89219l.m154710a("contentStub");
                }
                this.f76615a = new C32211j(this, viewStub2, this);
            } else if (i == 2) {
                ViewStub viewStub3 = this.f76620h;
                if (viewStub3 == null) {
                    C89219l.m154710a("contentStub");
                }
                this.f76615a = new C32203h(this, viewStub3, this);
            } else if (i == 3) {
                ViewStub viewStub4 = this.f76620h;
                if (viewStub4 == null) {
                    C89219l.m154710a("contentStub");
                }
                this.f76615a = new C32218k(this, viewStub4, this);
            } else if (i == 4) {
                ViewStub viewStub5 = this.f76620h;
                if (viewStub5 == null) {
                    C89219l.m154710a("contentStub");
                }
                this.f76615a = new C32187f(this, viewStub5, this);
            } else if (i == 5) {
                ViewStub viewStub6 = this.f76620h;
                if (viewStub6 == null) {
                    C89219l.m154710a("contentStub");
                }
                this.f76615a = new C32183d(this, viewStub6, this);
            }
            C1731i.m5640b(new CallableC32114e(this), C1731i.f5562a).mo5534a(new C32115f(this), C1731i.f5564c, null);
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(C0643b.m2378c(this, R.color.l)));
        NormalTitleBar normalTitleBar2 = (NormalTitleBar) _$_findCachedViewById(R.id.f7t);
        C89219l.m154716b(normalTitleBar2, "");
        normalTitleBar2.getStartBtn().setImageResource(R.drawable.ccv);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m66492a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AbstractC32110b bVar = this.f76619e;
        if (bVar != null) {
            bVar.mo58071a(i, i2, intent);
        }
    }
}
