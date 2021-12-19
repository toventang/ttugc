package com.p2082ss.android.ugc.aweme.live;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.AbstractC0976n;
import com.bytedance.android.live.p255l.AbstractC4374a;
import com.bytedance.android.live.p379n.AbstractC5776i;
import com.bytedance.android.live.p408u.C6203g;
import com.bytedance.android.livesdk.p561j.C9037bd;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11678b;
import com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11679c;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.p2082ss.android.sdk.p2174a.C30222a;
import com.p2082ss.android.ugc.aweme.live.p3409f.C58613b;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84918b;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.live.LiveBroadcastActivity */
public class LiveBroadcastActivity extends ActivityC58486a implements AbstractC84919c, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public AbstractC11679c f133112a;

    /* renamed from: b */
    public AbstractC5776i f133113b;

    /* renamed from: c */
    public Boolean f133114c = true;

    /* renamed from: d */
    AbstractC11678b f133115d = new AbstractC11678b() {
        /* class com.p2082ss.android.ugc.aweme.live.LiveBroadcastActivity.C584731 */

        static {
            Covode.recordClassIndex(68758);
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11678b
        /* renamed from: a */
        public final void mo18448a(BroadcastReceiver broadcastReceiver) {
            LiveBroadcastActivity.this.unregisterReceiver(broadcastReceiver);
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11678b
        /* renamed from: a */
        public final void mo18450a(Bundle bundle) {
            if (LiveBroadcastActivity.this.f133114c.booleanValue()) {
                LiveBroadcastActivity.this.f133114c = false;
                LiveBroadcastActivity.this.f133113b = Live.getService().mo12974a(bundle);
                LiveBroadcastActivity.this.getSupportFragmentManager().mo3552a().mo3469b(R.id.b82, LiveBroadcastActivity.this.f133113b.mo11521a()).mo3478e();
            }
            LiveBroadcastActivity.this.f133112a = null;
        }

        @Override // com.bytedance.android.livesdkapi.depend.model.p685a.AbstractC11678b
        /* renamed from: a */
        public final void mo18449a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            m107223b(LiveBroadcastActivity.this, broadcastReceiver, intentFilter);
        }

        /* renamed from: a */
        private static Intent m107222a(LiveBroadcastActivity liveBroadcastActivity, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
            try {
                return liveBroadcastActivity.registerReceiver(broadcastReceiver, intentFilter);
            } catch (Exception e) {
                if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                    return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
                }
                throw e;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
            r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
            if (r0 != false) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
            r2 = move-exception;
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
            com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, "Register Receiver Exception");
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
            return com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
            r0 = r2.getMessage();
            r2 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
            if (r0 != null) goto L_0x0018;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static android.content.Intent m107223b(com.p2082ss.android.ugc.aweme.live.LiveBroadcastActivity r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
            /*
                android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
                com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
                android.content.Intent r0 = m107222a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
                return r0
            L_0x000c:
                android.content.Intent r0 = com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
                return r0
            L_0x0011:
                r2 = move-exception
                java.lang.String r0 = r2.getMessage()
                if (r0 == 0) goto L_0x0027
                java.lang.String r1 = r2.getMessage()
                java.lang.String r0 = "regist too many Broadcast Receivers"
                boolean r0 = r1.contains(r0)
                if (r0 != 0) goto L_0x0025
                goto L_0x0027
            L_0x0025:
                throw r2
            L_0x0026:
                r2 = move-exception
            L_0x0027:
                java.lang.String r0 = "Register Receiver Exception"
                com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, r0)
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.live.LiveBroadcastActivity.C584731.m107223b(com.ss.android.ugc.aweme.live.LiveBroadcastActivity, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
        }
    };

    /* renamed from: e */
    private final List<AbstractC84918b> f133116e = new ArrayList();

    static {
        Covode.recordClassIndex(68757);
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: a */
    public final void mo87531a(AbstractC84917a aVar) {
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: b */
    public final void mo87533b(AbstractC84917a aVar) {
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: c */
    public final void mo87535c(AbstractC84917a aVar) {
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.live.ActivityC58486a
    /* renamed from: e */
    public final int mo95845e() {
        return 1;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(43, new RunnableC90250g(LiveBroadcastActivity.class, "onEvent", C30222a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.live.ActivityC58486a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.live.ActivityC58486a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public void onBackPressed() {
        AbstractC11679c cVar = this.f133112a;
        if (cVar == null || !cVar.mo8641j()) {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.live.ActivityC58486a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        this.f133115d = null;
        Live.getService().mo12988a((Activity) null);
        ((AbstractC89172b) DataChannelGlobal.f42558d.mo28324b(C9037bd.class)).invoke(0);
        super.onDestroy();
        AbstractC4374a x = Live.getService().mo13043x();
        if (x != null) {
            x.mo10135b(true);
        }
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

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: a */
    private static Bundle m107215a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: b */
    public final void mo87534b(AbstractC84918b bVar) {
        this.f133116e.remove(bVar);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.AbstractC17736b, com.bytedance.ies.powerpage.ActivityC17733a
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        C58613b.m107736a(this, intent);
    }

    @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c
    /* renamed from: a */
    public final void mo87532a(AbstractC84918b bVar) {
        this.f133116e.add(bVar);
    }

    @AbstractC90264r
    public void onEvent(C30222a aVar) {
        if (Live.getService() != null) {
            Live.getService().mo13033n();
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.live.ActivityC58486a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onCreate", true);
        activityConfiguration(C58784u.f133791a);
        if (bundle != null) {
            bundle.remove("android:support:fragments");
        }
        ((AbstractC89172b) DataChannelGlobal.f42558d.mo28324b(C9037bd.class)).invoke(1);
        super.onCreate(bundle);
        setContentView(R.layout.aj9);
        if (getWindow() != null) {
            getWindow().addFlags(128);
        }
        AbstractC4374a x = Live.getService().mo13043x();
        if (x != null) {
            x.mo10134a(true);
        }
        mo95856f();
        Bundle bundle2 = new Bundle();
        if (getIntent() != null) {
            bundle2 = m107215a(getIntent());
        }
        C6203g.m13469c(new RunnableC58785v(this));
        this.f133112a = Live.getService().mo12979a(this.f133115d, bundle2);
        AbstractC0976n a = getSupportFragmentManager().mo3552a();
        a.mo3469b(R.id.b82, this.f133112a.mo8639g());
        a.mo3467b();
        Live.getService().mo12988a((Activity) this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveBroadcastActivity", "onCreate", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.live.ActivityC58486a, com.bytedance.ies.powerpage.ActivityC17733a
    public void onActivityResult(int i, int i2, Intent intent) {
        for (AbstractC84918b bVar : this.f133116e) {
            if (bVar.mo62778a(i, i2, intent)) {
                return;
            }
        }
        super.onActivityResult(i, i2, intent);
    }
}
