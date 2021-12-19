package com.p2082ss.android.ugc.trill.setting;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.contentlanguage.p2684a.C40184a;
import com.p2082ss.android.ugc.aweme.journey.C57058z;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.ugc.trill.setting.C85151k;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.trill.setting.ContentPreferenceActivity */
public final class ContentPreferenceActivity extends ActivityC17312a implements C85151k.AbstractC85152a {

    /* renamed from: a */
    private C85151k f190398a;

    /* renamed from: b */
    private C85119b f190399b;

    /* renamed from: c */
    private C40184a f190400c;

    /* renamed from: d */
    private C85133d f190401d;

    /* renamed from: e */
    private SparseArray f190402e;

    static {
        Covode.recordClassIndex(99130);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f190402e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f190402e == null) {
            this.f190402e = new SparseArray();
        }
        View view = (View) this.f190402e.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f190402e.put(i, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.ContentPreferenceActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.ContentPreferenceActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.ContentPreferenceActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.p2082ss.android.ugc.trill.setting.C85151k.AbstractC85152a
    /* renamed from: d */
    public final void mo130042d() {
        onBackPressed();
    }

    @Override // com.p2082ss.android.ugc.trill.setting.C85151k.AbstractC85152a
    /* renamed from: e */
    public final void mo130043e() {
        C39162r.m79460a("enter_customize_interests_page", new C33744d().mo59983a("enter_from", "content_preference_page").f79943a);
        C57058z.f129923a.mo57265a((Context) this);
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

    @Override // com.p2082ss.android.ugc.trill.setting.C85151k.AbstractC85152a
    /* renamed from: a */
    public final void mo130039a() {
        AbstractC0952i supportFragmentManager = getSupportFragmentManager();
        C40184a aVar = (C40184a) supportFragmentManager.mo3551a("language_content_fragment");
        this.f190400c = aVar;
        if (aVar == null) {
            this.f190400c = new C40184a();
        }
        C40184a aVar2 = this.f190400c;
        if (aVar2 == null) {
            C89219l.m154715b();
        }
        if (!aVar2.isAdded()) {
            AbstractC0976n a = supportFragmentManager.mo3552a();
            C89219l.m154716b(a, "");
            a.mo3452a(R.anim.dm, 0, 0, R.anim.dt);
            C40184a aVar3 = this.f190400c;
            if (aVar3 == null) {
                C89219l.m154715b();
            }
            a.mo3454a(R.id.b82, aVar3, "language_content_fragment");
            a.mo3457a((String) null);
            a.mo3473c();
        }
    }

    @Override // com.p2082ss.android.ugc.trill.setting.C85151k.AbstractC85152a
    /* renamed from: b */
    public final void mo130040b() {
        if (!C39223a.m79591e().mo68725a()) {
            C33830n.m69192a("vpa_show_in_error_region", "", (JSONObject) null);
        }
        if (C80580in.m139687c() || C39223a.m79601o().mo68703a()) {
            C33830n.m69192a("vpa_setting_button_clicked_in_child_mode", "", (JSONObject) null);
        }
        AbstractC0952i supportFragmentManager = getSupportFragmentManager();
        C85133d dVar = (C85133d) supportFragmentManager.mo3551a("vpa_choice_fragment");
        this.f190401d = dVar;
        if (dVar == null) {
            this.f190401d = new C85133d();
        }
        C85133d dVar2 = this.f190401d;
        if (dVar2 == null) {
            C89219l.m154715b();
        }
        if (!dVar2.isAdded()) {
            AbstractC0976n a = supportFragmentManager.mo3552a();
            C89219l.m154716b(a, "");
            a.mo3452a(R.anim.dq, R.anim.dv, R.anim.f205073do, R.anim.dx);
            C85133d dVar3 = this.f190401d;
            if (dVar3 == null) {
                C89219l.m154715b();
            }
            a.mo3470b(R.id.b82, dVar3, "vpa_choice_fragment");
            a.mo3457a((String) null);
            a.mo3473c();
        }
    }

    @Override // com.p2082ss.android.ugc.trill.setting.C85151k.AbstractC85152a
    /* renamed from: c */
    public final void mo130041c() {
        C39162r.m79460a("enter_video_language_page", new C33744d().mo59983a("enter_from", "content_preference_page").f79943a);
        C85151k kVar = (C85151k) getSupportFragmentManager().mo3551a("video_language_fragment");
        this.f190398a = kVar;
        if (kVar == null) {
            C89378p<Integer, Integer> a = m146332a(true);
            C89378p<Integer, Integer> a2 = m146332a(false);
            this.f190398a = new C85151k();
            AbstractC0976n a3 = getSupportFragmentManager().mo3552a().mo3452a(a.getFirst().intValue(), a.getSecond().intValue(), a2.getFirst().intValue(), a2.getSecond().intValue());
            C85151k kVar2 = this.f190398a;
            if (kVar2 == null) {
                C89219l.m154715b();
            }
            a3.mo3470b(R.id.b82, kVar2, "video_language_fragment").mo3457a((String) null).mo3473c();
        }
        C85151k kVar3 = this.f190398a;
        if (kVar3 == null) {
            C89219l.m154715b();
        }
        C89219l.m154721d(this, "");
        kVar3.f190511b = this;
    }

    /* renamed from: com.ss.android.ugc.trill.setting.ContentPreferenceActivity$a */
    static final class C85100a extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C85100a f190403a = new C85100a();

        static {
            Covode.recordClassIndex(99131);
        }

        C85100a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C851011.f190404a);
            baseActivityViewModel2.config(C851022.f190405a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static C89378p<Integer, Integer> m146332a(boolean z) {
        if (C80471gb.m139482a() ? z : !z) {
            return new C89378p<>(Integer.valueOf((int) R.anim.f205073do), Integer.valueOf((int) R.anim.dx));
        }
        return new C89378p<>(Integer.valueOf((int) R.anim.dq), Integer.valueOf((int) R.anim.dv));
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.ContentPreferenceActivity", "onCreate", true);
        activityConfiguration(C85100a.f190403a);
        super.onCreate(bundle);
        supportRequestWindowFeature(10);
        setContentView(R.layout.c3);
        ((RelativeLayout) _$_findCachedViewById(R.id.dnb)).setBackgroundColor(C0643b.m2378c(this, R.color.l));
        C85119b bVar = (C85119b) getSupportFragmentManager().mo3551a("content_setting_host_fragment");
        this.f190399b = bVar;
        if (bVar == null) {
            this.f190399b = new C85119b();
            AbstractC0976n a = getSupportFragmentManager().mo3552a();
            C85119b bVar2 = this.f190399b;
            if (bVar2 == null) {
                C89219l.m154715b();
            }
            a.mo3454a(R.id.b82, bVar2, "content_setting_host_fragment").mo3473c();
        }
        C85119b bVar3 = this.f190399b;
        if (bVar3 == null) {
            C89219l.m154715b();
        }
        bVar3.f190461a = this;
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.ContentPreferenceActivity", "onCreate", false);
    }
}
