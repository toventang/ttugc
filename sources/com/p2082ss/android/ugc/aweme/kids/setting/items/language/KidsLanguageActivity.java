package com.p2082ss.android.ugc.aweme.kids.setting.items.language;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.kids.setting.items.language.viewmodel.AppLanguageViewModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.language.KidsLanguageActivity */
public final class KidsLanguageActivity extends ActivityC17312a {

    /* renamed from: b */
    public static final C57938a f132085b = new C57938a((byte) 0);

    /* renamed from: a */
    public AppLanguageViewModel f132086a;

    /* renamed from: c */
    private C57941a f132087c;

    /* renamed from: d */
    private HashMap f132088d;

    static {
        Covode.recordClassIndex(67960);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f132088d;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f132088d == null) {
            this.f132088d = new HashMap();
        }
        View view = (View) this.f132088d.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f132088d.put(Integer.valueOf(i), findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.language.KidsLanguageActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.language.KidsLanguageActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.language.KidsLanguageActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.language.KidsLanguageActivity$a */
    public static final class C57938a {
        static {
            Covode.recordClassIndex(67961);
        }

        private C57938a() {
        }

        public /* synthetic */ C57938a(byte b) {
            this();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
        finish();
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

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.language.KidsLanguageActivity$b */
    static final class C57939b extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C57939b f132089a = new C57939b();

        static {
            Covode.recordClassIndex(67962);
        }

        C57939b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C579401.f132090a);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.language.KidsLanguageActivity", "onCreate", true);
        activityConfiguration(C57939b.f132089a);
        super.onCreate(bundle);
        setContentView(R.layout.abw);
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(R.id.dnl);
        if (relativeLayout != null) {
            RelativeLayout relativeLayout2 = (RelativeLayout) _$_findCachedViewById(R.id.dnl);
            C89219l.m154716b(relativeLayout2, "");
            relativeLayout.setBackgroundColor(C0643b.m2378c(relativeLayout2.getContext(), R.color.l));
        }
        AbstractC0952i supportFragmentManager = getSupportFragmentManager();
        C89219l.m154716b(supportFragmentManager, "");
        C57941a aVar = (C57941a) supportFragmentManager.mo3551a("language_app_fragment");
        this.f132087c = aVar;
        if (aVar == null) {
            this.f132087c = new C57941a();
        }
        AbstractC0976n a = supportFragmentManager.mo3552a();
        C89219l.m154716b(a, "");
        C57941a aVar2 = this.f132087c;
        if (aVar2 == null) {
            C89219l.m154715b();
        }
        a.mo3454a(R.id.b82, aVar2, "language_app_fragment");
        a.mo3457a((String) null);
        a.mo3473c();
        this.f132086a = (AppLanguageViewModel) C1181ae.m3881a(this, (C1175ad.AbstractC1177b) null).mo3983a(AppLanguageViewModel.class);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.language.KidsLanguageActivity", "onCreate", false);
    }
}
