package com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import com.p2082ss.android.ugc.aweme.compliance.protection.digitalwellbeing.C40074a;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.C40128l;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.p2683a.C40135p;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.viewmodel.C40154a;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.viewmodel.SetLockParamViewModel;
import com.p2082ss.android.ugc.aweme.compliance.protection.timelock.viewmodel.TimeLockOptionViewModel;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.compliance.protection.timelock.ui.SetTimeLockActivity */
public class SetTimeLockActivity extends AbstractActivityC40107a {

    /* renamed from: b */
    ViewGroup f94180b;

    /* renamed from: c */
    private C40154a f94181c;

    static {
        Covode.recordClassIndex(47888);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.AbstractActivityC40107a
    /* renamed from: a */
    public final int mo69254a() {
        return R.layout.u0;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.timelock.ui.SetTimeLockActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.timelock.ui.SetTimeLockActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.timelock.ui.SetTimeLockActivity", "onWindowFocusChanged", true);
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

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.AbstractActivityC40107a
    /* renamed from: b */
    public final void mo69255b() {
        Fragment a;
        Fragment a2;
        Fragment a3;
        this.f94180b = (ViewGroup) findViewById(R.id.dnb);
        C40154a aVar = new C40154a();
        this.f94181c = aVar;
        aVar.f94262a = getIntent().getIntExtra("SetTimeLockActivityKeyType", 0);
        if (getIntent().getBooleanExtra("SetTimeLockActivityKeyFromParent", false)) {
            C40154a.C40155a aVar2 = new C40154a.C40155a();
            aVar2.f94264a = m81132a(getIntent(), "SetTimeLockActivityKeyUid");
            aVar2.f94265b = m81132a(getIntent(), "SetTimeLockActivityKeySecUid");
            aVar2.f94266c = m81132a(getIntent(), "SetTimeLockActivityKeyUsername");
            this.f94181c.f94263b = aVar2;
        }
        ((SetLockParamViewModel) C1181ae.m3881a(this, (C1175ad.AbstractC1177b) null).mo3983a(SetLockParamViewModel.class)).f94260a.setValue(this.f94181c);
        if (getIntent().getBooleanExtra("SetTimeLockActivityKeyFromParent", false)) {
            int intExtra = getIntent().getIntExtra("SetTimeLockActivityKeyLockTimeInMin", 0);
            if (intExtra > 0) {
                ((TimeLockOptionViewModel) C1181ae.m3881a(this, (C1175ad.AbstractC1177b) null).mo3983a(TimeLockOptionViewModel.class)).f94261a.setValue(new C40128l.C40131a(intExtra));
            }
            if (getIntent().getBooleanExtra("SetTimeLockActivityKeyParentState", false)) {
                a3 = C40135p.m81187c(this.f94181c.f94262a);
            } else {
                a3 = C40135p.m81184a(this.f94181c.f94262a);
            }
            mo69256a(a3);
        } else if (this.f94181c.f94262a == 0) {
            if (C40074a.m81040c()) {
                a2 = C40135p.m81187c(this.f94181c.f94262a);
            } else {
                a2 = C40135p.m81184a(this.f94181c.f94262a);
            }
            mo69256a(a2);
        } else {
            if (C40074a.m81039b()) {
                a = C40135p.m81187c(this.f94181c.f94262a);
            } else {
                a = C40135p.m81184a(this.f94181c.f94262a);
            }
            mo69256a(a);
        }
        ViewGroup viewGroup = this.f94180b;
        viewGroup.setBackgroundColor(C0643b.m2378c(viewGroup.getContext(), R.color.l));
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a, com.p2082ss.android.ugc.aweme.compliance.protection.timelock.p2682ui.AbstractActivityC40107a
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.timelock.ui.SetTimeLockActivity", "onCreate", true);
        C33103x xVar = new C33103x((byte) 0);
        xVar.f78667a = true;
        xVar.f78673g = R.color.nc;
        activityConfiguration(new C40148b(xVar));
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.protection.timelock.ui.SetTimeLockActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m81132a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m81134a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    /* renamed from: a */
    public static void m81133a(Context context, int i, String str, String str2, String str3, boolean z, int i2) {
        Intent intent = new Intent(context, SetTimeLockActivity.class);
        intent.putExtra("SetTimeLockActivityKeyType", i);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("SetTimeLockActivityKeyFromParent", true);
            intent.putExtra("SetTimeLockActivityKeyUid", str);
            intent.putExtra("SetTimeLockActivityKeySecUid", str2);
            intent.putExtra("SetTimeLockActivityKeyUsername", str3);
            intent.putExtra("SetTimeLockActivityKeyParentState", z);
            intent.putExtra("SetTimeLockActivityKeyLockTimeInMin", i2);
        }
        if (context instanceof Application) {
            intent.addFlags(268435456);
        }
        m81134a(context, intent);
    }
}
