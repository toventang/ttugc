package com.p2082ss.android.ugc.trill.setting.children;

import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.ugc.trill.language.p4382b.C85095a;
import com.p2082ss.android.ugc.trill.language.viewmodel.AppLanguageViewModel;
import com.p2082ss.android.ugc.trill.setting.children.C85129c;

/* renamed from: com.ss.android.ugc.trill.setting.children.ChildrenDisplaySettingActivity */
public class ChildrenDisplaySettingActivity extends ActivityC17312a implements C85129c.AbstractC85130a {

    /* renamed from: a */
    AppLanguageViewModel f190472a;

    /* renamed from: b */
    private ViewGroup f190473b;

    /* renamed from: c */
    private C85129c f190474c;

    /* renamed from: d */
    private C85095a f190475d;

    static {
        Covode.recordClassIndex(99166);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.children.ChildrenDisplaySettingActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.children.ChildrenDisplaySettingActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.children.ChildrenDisplaySettingActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
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

    @Override // com.p2082ss.android.ugc.trill.setting.children.C85129c.AbstractC85130a
    /* renamed from: a */
    public final void mo130064a(Bundle bundle) {
        AbstractC0952i supportFragmentManager = getSupportFragmentManager();
        C85095a aVar = (C85095a) supportFragmentManager.mo3551a("language_app_fragment");
        this.f190475d = aVar;
        if (aVar == null) {
            C85095a aVar2 = new C85095a();
            this.f190475d = aVar2;
            aVar2.setArguments(bundle);
        }
        AbstractC0976n a = supportFragmentManager.mo3552a();
        a.mo3452a(R.anim.dm, 0, 0, R.anim.dt);
        a.mo3454a(R.id.b82, this.f190475d, "language_app_fragment");
        a.mo3457a((String) null);
        a.mo3473c();
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.children.ChildrenDisplaySettingActivity", "onCreate", true);
        C33103x xVar = new C33103x((byte) 0);
        xVar.f78667a = true;
        xVar.f78673g = R.color.nc;
        activityConfiguration(new C85127a(xVar));
        super.onCreate(bundle);
        setContentView(R.layout.axg);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.dnb);
        this.f190473b = viewGroup;
        viewGroup.setBackgroundColor(C0643b.m2378c(viewGroup.getContext(), R.color.l));
        AbstractC0952i supportFragmentManager = getSupportFragmentManager();
        C85129c cVar = (C85129c) supportFragmentManager.mo3549a(R.id.b82);
        this.f190474c = cVar;
        if (cVar == null) {
            this.f190474c = new C85129c();
            supportFragmentManager.mo3552a().mo3454a(R.id.b82, this.f190474c, "language_setting_host_fragment").mo3473c();
            this.f190474c.f190481d = this;
        }
        this.f190472a = (AppLanguageViewModel) C1181ae.m3881a(this, (C1175ad.AbstractC1177b) null).mo3983a(AppLanguageViewModel.class);
        C39223a.m79598l().mo68665a("new_kids_mode_visit", true ^ C80580in.m139687c(), new C33744d().mo59983a("activity", "ChildrenDisplaySettingActivity").f79943a);
        ActivityAgent.onTrace("com.ss.android.ugc.trill.setting.children.ChildrenDisplaySettingActivity", "onCreate", false);
    }
}
