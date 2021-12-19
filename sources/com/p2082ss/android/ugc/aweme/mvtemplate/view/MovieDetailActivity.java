package com.p2082ss.android.ugc.aweme.mvtemplate.view;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.analysis.AbstractC33501c;
import com.p2082ss.android.ugc.aweme.analysis.Analysis;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mvtemplate.view.MovieDetailActivity */
public final class MovieDetailActivity extends ActivityC17312a implements AbstractC33501c {

    /* renamed from: f */
    public static final C61255a f139105f = new C61255a((byte) 0);

    /* renamed from: a */
    public String f139106a = "";

    /* renamed from: b */
    public String f139107b = "";

    /* renamed from: c */
    public String f139108c = "";

    /* renamed from: d */
    public String f139109d = "";

    /* renamed from: e */
    public int f139110e;

    /* renamed from: g */
    private SparseArray f139111g;

    static {
        Covode.recordClassIndex(71871);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f139111g;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f139111g == null) {
            this.f139111g = new SparseArray();
        }
        View view = (View) this.f139111g.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f139111g.put(i, findViewById);
        return findViewById;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mvtemplate.view.MovieDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mvtemplate.view.MovieDetailActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mvtemplate.view.MovieDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.mvtemplate.view.MovieDetailActivity$a */
    public static final class C61255a {
        static {
            Covode.recordClassIndex(71872);
        }

        private C61255a() {
        }

        public /* synthetic */ C61255a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.mvtemplate.view.MovieDetailActivity$b */
    public static final class C61256b implements IExternalService.ServiceLoadCallback {

        /* renamed from: a */
        final /* synthetic */ MovieDetailActivity f139112a;

        /* renamed from: b */
        final /* synthetic */ int f139113b;

        /* renamed from: c */
        final /* synthetic */ int f139114c;

        /* renamed from: d */
        final /* synthetic */ Intent f139115d;

        static {
            Covode.recordClassIndex(71873);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onDismiss() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onFailed() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onFailed(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onOK() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C89219l.m154721d(asyncAVService, "");
            asyncAVService.uiService().recordService().recordActivityResult(this.f139112a, this.f139113b, this.f139114c, this.f139115d);
        }

        C61256b(MovieDetailActivity movieDetailActivity, int i, int i2, Intent intent) {
            this.f139112a = movieDetailActivity;
            this.f139113b = i;
            this.f139114c = i2;
            this.f139115d = intent;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.analysis.AbstractC33501c
    /* renamed from: F */
    public final Analysis mo59595F() {
        long j;
        Exception e;
        long j2 = 0;
        try {
            j = Long.parseLong(this.f139106a);
            try {
                j2 = Long.parseLong(this.f139109d);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            j = 0;
            e.printStackTrace();
            Analysis value = new Analysis().setLabelName("mv_page").setExt_value(j).setValue(j2);
            C89219l.m154716b(value, "");
            return value;
        }
        Analysis value2 = new Analysis().setLabelName("mv_page").setExt_value(j).setValue(j2);
        C89219l.m154716b(value2, "");
        return value2;
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

    /* renamed from: com.ss.android.ugc.aweme.mvtemplate.view.MovieDetailActivity$c */
    static final class C61257c extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C61257c f139116a = new C61257c();

        static {
            Covode.recordClassIndex(71874);
        }

        C61257c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C612581.f139117a);
            baseActivityViewModel2.config(C612592.f139118a);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mvtemplate.view.MovieDetailActivity", "onCreate", true);
        activityConfiguration(C61257c.f139116a);
        super.onCreate(bundle);
        setContentView(R.layout.bn);
        String a = m110911a(getIntent(), "mv_id");
        if (a == null) {
            a = "";
        }
        this.f139106a = a;
        String a2 = m110911a(getIntent(), "enter_method");
        if (a2 == null) {
            a2 = "";
        }
        this.f139108c = a2;
        String a3 = m110911a(getIntent(), "enter_from");
        if (a3 == null) {
            a3 = "";
        }
        this.f139107b = a3;
        String a4 = m110911a(getIntent(), "group_id");
        if (a4 == null) {
            a4 = "";
        }
        this.f139109d = a4;
        this.f139110e = getIntent().getIntExtra(StringSet.type, 0);
        AbstractC0952i supportFragmentManager = getSupportFragmentManager();
        AbstractC0976n a5 = supportFragmentManager.mo3552a();
        C89219l.m154716b(a5, "");
        Fragment a6 = supportFragmentManager.mo3551a("movie_detail_fragment_tag");
        if (a6 == null) {
            String str = this.f139106a;
            String str2 = this.f139107b;
            String str3 = this.f139109d;
            String str4 = this.f139108c;
            int i = this.f139110e;
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            C89219l.m154721d(str3, "");
            C89219l.m154721d(str4, "");
            a6 = new C61267f();
            Bundle bundle2 = new Bundle(3);
            bundle2.putString("mv_id", str);
            bundle2.putString("enter_from", str2);
            bundle2.putString("enter_method", str4);
            bundle2.putString("group_id", str3);
            bundle2.putInt(StringSet.type, i);
            a6.setArguments(bundle2);
        }
        a6.setUserVisibleHint(true);
        a5.mo3470b(R.id.acf, a6, "movie_detail_fragment_tag");
        a5.mo3467b();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.mvtemplate.view.MovieDetailActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m110911a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AVExternalServiceImpl.m113114a().asyncService(this, "movie_detail", new C61256b(this, i, i2, intent));
        if (i == 10086 && i2 == -1) {
            setResult(-1, intent);
            finish();
            overridePendingTransition(0, 0);
        }
    }
}
