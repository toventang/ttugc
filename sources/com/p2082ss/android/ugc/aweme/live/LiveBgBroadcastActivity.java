package com.p2082ss.android.ugc.aweme.live;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.AbstractC0976n;
import com.bytedance.android.live.p379n.AbstractC5776i;
import com.bytedance.android.livesdk.p561j.C9037bd;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11677a;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11678b;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.live.p3409f.C58613b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity */
public class LiveBgBroadcastActivity extends ActivityC58486a {

    /* renamed from: a */
    public AbstractC11677a f133108a;

    /* renamed from: b */
    public AbstractC5776i f133109b;

    /* renamed from: c */
    AbstractC11678b f133110c = new AbstractC11678b() {
        /* class com.p2082ss.android.ugc.aweme.live.LiveBgBroadcastActivity.C584721 */

        static {
            Covode.recordClassIndex(68756);
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11678b
        /* renamed from: a */
        public final void mo18448a(BroadcastReceiver broadcastReceiver) {
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11678b
        /* renamed from: a */
        public final void mo18449a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11678b
        /* renamed from: a */
        public final void mo18450a(Bundle bundle) {
            LiveBgBroadcastActivity.this.f133109b = Live.getService().mo12974a(bundle);
            LiveBgBroadcastActivity.this.getSupportFragmentManager().mo3552a().mo3469b(R.id.b82, LiveBgBroadcastActivity.this.f133109b.mo11521a()).mo3478e();
            LiveBgBroadcastActivity.this.f133108a = null;
        }
    };

    static {
        Covode.recordClassIndex(68755);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.live.ActivityC58486a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.live.ActivityC58486a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void finish() {
        AbstractC11677a aVar = this.f133108a;
        if (aVar != null) {
            aVar.mo8496a();
        }
        super.finish();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public void onBackPressed() {
        AbstractC11677a aVar = this.f133108a;
        if (aVar == null || !aVar.mo8503b()) {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.live.ActivityC58486a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        Live.getService().mo12988a((Activity) null);
        ((AbstractC89172b) DataChannelGlobal.f42558d.mo28324b(C9037bd.class)).invoke(0);
        this.f133110c = null;
        Live.getService().mo13026g().mo16682b(hashCode());
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

    /* renamed from: a */
    private static Bundle m107211a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.AbstractC17736b, com.bytedance.ies.powerpage.ActivityC17733a
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C58613b.m107736a(this, intent);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.live.ActivityC58486a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onCreate", true);
        super.onCreate(bundle);
        if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        ((AbstractC89172b) DataChannelGlobal.f42558d.mo28324b(C9037bd.class)).invoke(2);
        setContentView(R.layout.aj9);
        if (getWindow() != null) {
            getWindow().addFlags(128);
        }
        Bundle bundle2 = new Bundle();
        if (getIntent() != null) {
            bundle2 = m107211a(getIntent());
        }
        AbstractC0976n a = getSupportFragmentManager().mo3552a();
        Live.getService().mo13026g().mo16680a(hashCode(), this);
        AbstractC11677a b = Live.getService().mo13013b(this.f133110c, bundle2);
        this.f133108a = b;
        a.mo3469b(R.id.b82, b.mo8504c());
        a.mo3467b();
        Live.getService().mo12988a((Activity) this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBgBroadcastActivity", "onCreate", false);
    }
}
