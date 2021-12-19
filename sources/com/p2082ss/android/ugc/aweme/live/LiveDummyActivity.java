package com.p2082ss.android.ugc.aweme.live;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.container.p510g.AbstractC8248b;
import com.bytedance.android.livesdk.watch.AbstractC11325d;
import com.bytedance.android.livesdkapi.C11755f;
import com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11635b;
import com.bytedance.android.livesdkapi.depend.p680d.p682b.C11637d;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.android.livesdkapi.p674b.AbstractC11610a;
import com.bytedance.android.livesdkapi.p674b.AbstractC11613c;
import com.bytedance.android.livesdkapi.p674b.AbstractC11614d;
import com.bytedance.android.livesdkapi.p701n.C11840a;
import com.bytedance.android.livesdkapi.service.AbstractC11846d;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17233a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.p1469l.C20688a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.base.p2364a.C34468c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56257j;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80517gw;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.live.LiveDummyActivity */
public class LiveDummyActivity extends ActivityC17312a implements AbstractC11613c, AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    private AbstractC11614d f133126a;

    /* renamed from: b */
    private AbstractC8248b f133127b;

    /* renamed from: c */
    private AbstractC11610a f133128c;

    /* renamed from: d */
    private boolean f133129d;

    /* renamed from: e */
    private View f133130e;

    /* renamed from: f */
    private boolean f133131f;

    /* renamed from: g */
    private long f133132g = -1;

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(26, new RunnableC90250g(LiveDummyActivity.class, "onEvent", C56257j.class, ThreadMode.POSTING, 0, false));
        hashMap.put(27, new RunnableC90250g(LiveDummyActivity.class, "onEvent", C11840a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveDummyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    static {
        Covode.recordClassIndex(68764);
        C20688a.m38942a();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void finish() {
        super.finish();
        if (C80471gb.m139483a(this)) {
            overridePendingTransition(R.anim.cs, R.anim.cu);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public void onBackPressed() {
        AbstractC11610a aVar = this.f133128c;
        if (aVar == null || !aVar.mo13295a("swipe")) {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
        C17233a.f41165a = this.f133129d;
        IHostApp iHostApp = (IHostApp) C6193a.m13435a(IHostApp.class);
        if (iHostApp != null) {
            iHostApp.setCurrentPage(-1);
        }
        if (this.f133131f) {
            ((AbstractC11325d) C6193a.m13435a(AbstractC11325d.class)).addLiveDuration(SystemClock.elapsedRealtime() - this.f133132g);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveDummyActivity", "onResume", true);
        super.onResume();
        this.f133129d = C17233a.f41165a;
        C17233a.f41165a = false;
        IHostApp iHostApp = (IHostApp) C6193a.m13435a(IHostApp.class);
        if (iHostApp != null) {
            iHostApp.setCurrentPage(2);
        }
        if (this.f133131f) {
            this.f133132g = SystemClock.elapsedRealtime();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveDummyActivity", "onResume", false);
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
    private static Bundle m107228a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @AbstractC90264r
    public void onEvent(C56257j jVar) {
        IIMService createIIMServicebyMonsterPlugin;
        if (!isDestroyed() && TextUtils.equals("live_event", jVar.f128321d) && (createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false)) != null) {
            createIIMServicebyMonsterPlugin.showIMSnackbar(this, this.f133130e, jVar);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.appcompat.app.ActivityC0218d
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC11610a aVar;
        AbstractC8248b bVar = this.f133127b;
        if (bVar != null && bVar.mo14596a(keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1 || (aVar = this.f133128c) == null || !aVar.mo13295a("hardware_back_press")) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @AbstractC90264r
    public void onEvent(final C11840a aVar) {
        C11637d dVar = new C11637d();
        dVar.mo18421a(aVar.f28229c);
        LiveOuterService.m107269s().mo95830d().mo12973a(this, new AbstractC11635b() {
            /* class com.p2082ss.android.ugc.aweme.live.LiveDummyActivity.C584781 */

            static {
                Covode.recordClassIndex(68765);
            }

            @Override // com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11635b
            /* renamed from: a */
            public final void mo18418a(int i, int i2, String str) {
            }

            @Override // com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11635b
            /* renamed from: a */
            public final void mo18419a(long j) {
                aVar.f28227a.mo18915a();
            }

            @Override // com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11635b
            /* renamed from: a */
            public final void mo18420a(Exception exc, String str) {
                aVar.f28227a.mo18916b();
            }
        }, aVar.f28228b, dVar).showNow(getSupportFragmentManager(), getClass().getSimpleName());
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        Fragment a;
        C15477a.m28474a(this, bundle);
        boolean z = true;
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveDummyActivity", "onCreate", true);
        activityConfiguration(C58789y.f133795a);
        super.onCreate(bundle);
        C34468c.m70449a(this, 0);
        setContentView(R.layout.ajo);
        this.f133130e = findViewById(R.id.b82);
        getWindow().getDecorView().setBackgroundColor(C0643b.m2378c(this, R.color.l));
        getWindow().setSoftInputMode(18);
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("intent_type", 0);
        if (intExtra == 1) {
            Bundle a2 = m107228a(intent);
            AbstractC11846d a3 = C11755f.m20713a();
            if (a3 != null) {
                C80517gw.m139563a().mo123772a(a2.getString("url"));
                AbstractC11614d b = a3.mo13012b(a2);
                this.f133126a = b;
                Fragment a4 = b.mo13290a();
                this.f133128c = (AbstractC11610a) a4;
                a2.putBoolean("is_dummy_host", true);
                a4.setArguments(a2);
                getSupportFragmentManager().mo3552a().mo3453a(R.id.b82, a4).mo3473c();
            }
        } else if (intExtra == 2) {
            Bundle a5 = m107228a(intent);
            AbstractC11846d a6 = C11755f.m20713a();
            if (a6 != null) {
                Fragment a7 = a6.mo12970a(this, a5);
                a7.setArguments(a5);
                getSupportFragmentManager().mo3552a().mo3453a(R.id.b82, a7).mo3467b();
            }
        } else if (intExtra == 3) {
            Bundle a8 = m107228a(intent);
            AbstractC11846d a9 = C11755f.m20713a();
            if (a9 != null) {
                getSupportFragmentManager().mo3552a().mo3453a(R.id.b82, a9.mo13009b(this, a8)).mo3467b();
            }
        } else if (intExtra == 4) {
            Bundle a10 = m107228a(intent);
            AbstractC11846d a11 = C11755f.m20713a();
            if (a11 != null) {
                Fragment c = a11.mo13019c(this, a10);
                if (c instanceof AbstractC11610a) {
                    this.f133128c = (AbstractC11610a) c;
                }
                a10.putBoolean("is_dummy_host", true);
                c.setArguments(a10);
                getSupportFragmentManager().mo3552a().mo3453a(R.id.b82, c).mo3473c();
            }
        } else if (intExtra == 5) {
            Uri uri = (Uri) m107228a(intent).getParcelable("bundle_uri");
            String queryParameter = uri.getQueryParameter("url");
            if (queryParameter == null || !queryParameter.contains("fe_tiktok_ecommerce_shop_cart")) {
                z = false;
            }
            this.f133131f = z;
            AbstractC11846d a12 = C11755f.m20713a();
            if (!(a12 == null || (a = a12.mo12972a(uri, this)) == null)) {
                if (a instanceof AbstractC8248b) {
                    this.f133127b = (AbstractC8248b) a;
                }
                this.f133130e.setFitsSystemWindows(false);
                getSupportFragmentManager().mo3552a().mo3453a(R.id.b82, a).mo3473c();
            }
        } else {
            finish();
        }
        if (C80471gb.m139483a(this)) {
            overridePendingTransition(R.anim.cr, R.anim.ct);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LiveDummyActivity", "onCreate", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }
}
