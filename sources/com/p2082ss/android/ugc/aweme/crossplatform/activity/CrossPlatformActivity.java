package com.p2082ss.android.ugc.aweme.crossplatform.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.AbstractC13615f;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.xbridge.p1301e.C18484a;
import com.bytedance.ies.xbridge.p1301e.C18494b;
import com.bytedance.ies.xbridge.platform.p1352b.C18822b;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.sdk.webview.C30278q;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import com.p2082ss.android.ugc.aweme.base.C34611o;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34467b;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34471f;
import com.p2082ss.android.ugc.aweme.bullet.impl.BulletService;
import com.p2082ss.android.ugc.aweme.commercialize.event.C37832b;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38659ay;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38754l;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.crossplatform.business.IMixActivityContainerProvider;
import com.p2082ss.android.ugc.aweme.crossplatform.business.MixActivityContainerProvider;
import com.p2082ss.android.ugc.aweme.crossplatform.p2706a.AbstractC40518a;
import com.p2082ss.android.ugc.aweme.crossplatform.p2706a.C40522d;
import com.p2082ss.android.ugc.aweme.crossplatform.p2707b.C40563b;
import com.p2082ss.android.ugc.aweme.crossplatform.p2707b.C40565d;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.C40618a;
import com.p2082ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p2082ss.android.ugc.aweme.crossplatform.view.WebViewFrameLayout;
import com.p2082ss.android.ugc.aweme.favorites.p2927i.C47449d;
import com.p2082ss.android.ugc.aweme.framework.p3009d.C51429c;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.p2310al.C33488c;
import com.p2082ss.android.ugc.aweme.p4173ug.C79559a;
import com.p2082ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80517gw;
import com.p2082ss.android.ugc.aweme.utils.permission.C80611a;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity */
public class CrossPlatformActivity extends ActivityC17312a implements AbstractC13615f, AbstractC34471f, AbstractC90252i, AbstractC90253j {

    /* renamed from: b */
    public static boolean f94800b = true;

    /* renamed from: c */
    public static long f94801c;

    /* renamed from: a */
    public AbsActivityContainer f94802a;

    /* renamed from: d */
    public AbstractC40526a f94803d;

    /* renamed from: e */
    boolean f94804e;

    /* renamed from: f */
    private C40618a f94805f;

    /* renamed from: g */
    private AbstractC34467b f94806g;

    /* renamed from: h */
    private boolean f94807h = true;

    /* renamed from: i */
    private C51429c f94808i;

    /* renamed from: j */
    private long f94809j;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity$a */
    public interface AbstractC40526a {
        static {
            Covode.recordClassIndex(48345);
        }

        /* renamed from: a */
        boolean mo69627a();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(263, new RunnableC90250g(CrossPlatformActivity.class, "onEvent", C33488c.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void dismissCustomToast() {
        C51429c cVar = this.f94808i;
        if (cVar != null) {
            cVar.mo86856c();
        }
    }

    static {
        Covode.recordClassIndex(48344);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
        C51429c cVar = this.f94808i;
        if (cVar != null) {
            cVar.mo86854b();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onResume", true);
        super.onResume();
        C51429c cVar = this.f94808i;
        if (cVar != null) {
            cVar.f118509f = false;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onResume", false);
    }

    /* renamed from: a */
    private boolean m81761a() {
        if (isDestroyed()) {
            return false;
        }
        if (this.f94808i != null) {
            return true;
        }
        C51429c cVar = new C51429c(this);
        this.f94808i = cVar;
        cVar.f118510g = false;
        return true;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public void onBackPressed() {
        if (this.f94802a != null && this.f94807h) {
            this.f94804e = true;
            AbstractC40526a aVar = this.f94803d;
            if (aVar == null || !aVar.mo69627a()) {
                this.f94802a.mo69619b();
            }
            C40618a aVar2 = this.f94805f;
            if (aVar2 != null) {
                String str = aVar2.f95068a.f95054c;
                if (!TextUtils.isEmpty(str)) {
                    SpecActServiceImpl.m131497i().mo118031c(str);
                }
            }
        }
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

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void finish() {
        if (this.f94807h) {
            C38754l.m78608a(this);
            super.finish();
            C40618a aVar = this.f94805f;
            if (aVar == null || !aVar.f95071d.f95181n) {
                C40618a aVar2 = this.f94805f;
                if (aVar2 == null || !aVar2.f95071d.f95168a) {
                    int i = Build.VERSION.SDK_INT;
                    if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                        super.overridePendingTransition(R.anim.dq, R.anim.dv);
                    } else {
                        super.overridePendingTransition(R.anim.f205073do, R.anim.dx);
                    }
                } else if (this.f94804e) {
                    super.overridePendingTransition(0, R.anim.ah);
                } else {
                    super.overridePendingTransition(0, 0);
                }
            } else {
                super.overridePendingTransition(0, R.anim.ah);
            }
            AbsActivityContainer absActivityContainer = this.f94802a;
            if (absActivityContainer != null) {
                absActivityContainer.mo69622j();
            }
            C38659ay.f91340a = null;
            EventBus.m156962a().mo145394b(C79559a.class);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        String str;
        MethodCollector.m26663i(7080);
        C15477a.m28479e(this);
        this.f94809j = System.currentTimeMillis() - this.f94809j;
        AbstractC81915c.m141874a(new C40563b(Long.valueOf(this.f94809j)));
        AbstractC81915c.m141874a(new C40565d(this.f94809j));
        C40618a aVar = this.f94805f;
        if (!(aVar == null || aVar.f95068a == null)) {
            C30278q a = C30278q.m61264a();
            String a2 = C30278q.m61265a(this.f94805f.f95068a.f95054c);
            if (a2 != null) {
                a.f72230a.remove(a2);
            }
        }
        C40556v a3 = C40556v.m81851a();
        C40618a aVar2 = this.f94805f;
        if (aVar2 != null) {
            String str2 = aVar2.f95068a.f95054c;
            if (!TextUtils.isEmpty(str2)) {
                synchronized (a3.f94899e) {
                    try {
                        if (Build.VERSION.SDK_INT >= 23 && !a3.mo69680a(str2) && a3.f94895a.size() < a3.f94898d) {
                            C17867d.m33078a().getMainLooper().getQueue().addIdleHandler(new C40560x(a3));
                        }
                    } catch (Throwable th) {
                        MethodCollector.m26664o(7080);
                        throw th;
                    }
                }
            }
        }
        super.onDestroy();
        C51429c cVar = this.f94808i;
        if (cVar != null) {
            cVar.mo86850a();
        }
        String str3 = null;
        if (C47449d.f110205a != null) {
            C47449d.f110205a = null;
        }
        C40618a aVar3 = this.f94805f;
        if (aVar3 == null || aVar3.f95068a == null) {
            str = null;
        } else {
            str3 = this.f94805f.f95068a.f95054c;
            str = this.f94805f.f95068a.f95061j;
        }
        AbstractC81915c.m141874a(new C37832b(2, str3, str));
        EventBus.m156962a().mo145395b(this);
        HashMap hashMap = new HashMap();
        hashMap.put("url", str3);
        hashMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
        C18494b.m34415a(new C18484a("ad_webview_close", System.currentTimeMillis(), C18822b.m34925a(hashMap)));
        if (this.f94805f.f95072e.f95196c != null) {
            try {
                JSONObject jSONObject = new JSONObject(this.f94805f.f95072e.f95196c);
                jSONObject.put("duration", System.currentTimeMillis() - f94801c);
                C39162r.m79461a("anchor_stay_time", jSONObject);
                MethodCollector.m26664o(7080);
                return;
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        MethodCollector.m26664o(7080);
    }

    @AbstractC90264r
    public void onEvent(C33488c cVar) {
        finish();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34471f
    public void setActivityResultListener(AbstractC34467b bVar) {
        this.f94806g = bVar;
    }

    /* renamed from: a */
    private static Bundle m81759a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C40522d.C40523a.f94795a.mo69606a();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AbsActivityContainer absActivityContainer = this.f94802a;
        if (absActivityContainer != null) {
            absActivityContainer.mo69613a(configuration);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void showCustomToast(String str) {
        if (m81761a()) {
            this.f94808i.mo86853a(str);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        boolean z;
        String str;
        boolean z2;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onCreate", true);
        C33103x xVar = new C33103x((byte) 0);
        xVar.f78675i = true;
        activityConfiguration(new C40539f(xVar));
        f94801c = System.currentTimeMillis();
        super.onCreate(bundle);
        AbsActivityContainer absActivityContainer = this.f94802a;
        if (absActivityContainer != null) {
            absActivityContainer.mo67255c();
        }
        Intent intent = getIntent();
        intent.putExtra("webview_progress_bar", AbstractC40518a.m81731a(m81759a(intent)));
        C40618a a = C40618a.C40619a.m81985a(intent);
        this.f94805f = a;
        if (a != null) {
            String str2 = a.f95068a.f95054c;
            if (!TextUtils.isEmpty(str2) && str2.contains("/ies-cdn-alisg/tiktok_activities/covid19")) {
                try {
                    a.f95068a.f95054c = Uri.parse(str2).buildUpon().appendQueryParameter("webview_created_timestamp", String.valueOf(f94801c)).build().toString();
                } catch (Throwable unused) {
                }
            }
        }
        Uri data = intent.getData();
        if (this.f94805f.f95068a.f95052a.intValue() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (data == null || data.isOpaque() || (!z && !TextUtils.equals("bullet", data.getQueryParameter("hybrid_sdk_version")))) {
            this.f94807h = getIntent().getBooleanExtra("key_support_back", true);
            Uri data2 = getIntent().getData();
            C40618a aVar = this.f94805f;
            if (!(aVar == null || aVar.f95068a.f95054c == null)) {
                data2 = Uri.parse(this.f94805f.f95068a.f95054c);
            }
            if (data2 != null && ((data2.toString().startsWith("http") || data2.toString().startsWith("https")) && TextUtils.equals(data2.getQueryParameter("__live_platform__"), "webcast"))) {
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("bundle_no_hw_acceleration", this.f94805f.f95068a.f95063l);
                bundle2.putBoolean("hide_nav_bar", this.f94805f.f95071d.f95187t);
                bundle2.putBoolean("hide_status_bar", this.f94805f.f95071d.f95188u);
                bundle2.putBoolean("hide_more", !this.f94805f.f95071d.f95179l);
                bundle2.putInt("bundle_web_view_background_color", this.f94805f.f95071d.f95157B);
                bundle2.putLong("ad_id", this.f94805f.f95069b.f95106a);
                bundle2.putString("title", this.f94805f.f95071d.f95172e);
                LiveOuterService.m107269s().mo95832f().mo120926a(data2.toString(), bundle2, this);
                finish();
            }
            C40618a aVar2 = this.f94805f;
            IMixActivityContainerProvider a2 = MixActivityContainerProvider.m81898a();
            if (a2 != null) {
                this.f94802a = a2.mo69717a(this, aVar2);
            }
            if (this.f94802a == null) {
                this.f94802a = new MixActivityContainer(this, aVar2);
            }
            this.f94802a.mo69616a(new RunnableC40540g(this));
            getLifecycle().mo4012a(this.f94802a);
            if (!this.f94802a.mo69617a()) {
                this.f94807h = true;
                finish();
                ActivityAgent.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onCreate", false);
                return;
            }
            if (this.f94805f.f95071d.f95181n) {
                super.overridePendingTransition(R.anim.cd, 0);
            } else if (this.f94805f.f95071d.f95168a) {
                super.overridePendingTransition(0, 0);
            } else {
                int i = Build.VERSION.SDK_INT;
                if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
                    super.overridePendingTransition(R.anim.f205073do, R.anim.dx);
                } else {
                    super.overridePendingTransition(R.anim.dq, R.anim.dv);
                }
            }
            supportRequestWindowFeature(10);
            setContentView(R.layout.uz);
            new C40533a(this);
            this.f94802a.mo69614a(m81759a(getIntent()));
            this.f94802a.mo69623k();
            EventBus.m156966a(EventBus.m156962a(), this);
            if (this.f94805f.f95070c != null && TextUtils.equals("page_movie_detail", this.f94805f.f95070c.f95145e)) {
                C47449d.f110205a = new WeakReference<>(this.f94802a.mo67258f());
            }
            C40618a aVar3 = this.f94805f;
            String str3 = null;
            if (aVar3 == null || aVar3.f95068a == null) {
                str = null;
            } else {
                str3 = this.f94805f.f95068a.f95054c;
                str = this.f94805f.f95068a.f95061j;
            }
            C30278q a3 = C30278q.m61264a();
            if (this.f94805f.f95069b.f95106a != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            a3.mo53733a(z2, str3);
            AbstractC81915c.m141874a(new C37832b(1, str3, str));
            this.f94809j = System.currentTimeMillis();
            C80517gw.m139563a().mo123771a(data);
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onCreate", false);
            return;
        }
        BulletService.m71938f().mo61853a(this, data.toString(), m81759a(intent));
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onCreate", false);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.common.utility.AbstractC13615f
    public void showCustomLongToast(int i, String str) {
        if (m81761a()) {
            this.f94808i.mo86851a(i, str);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void showCustomToast(int i, String str) {
        if (m81761a()) {
            this.f94808i.mo86855b(i, str);
        }
    }

    public void startActivity(Intent intent, Bundle bundle) {
        C84349a.m145093a(intent, this);
        super.startActivity(intent, bundle);
        AbsActivityContainer absActivityContainer = this.f94802a;
        if (absActivityContainer != null) {
            absActivityContainer.mo69621i();
        }
    }

    /* renamed from: a */
    private static void m81760a(boolean z, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("webViewPoolIsCache", z);
            jSONObject.put("webViewPoolCostTime", j);
        } catch (Exception e) {
            e.printStackTrace();
        }
        C34611o.m70671b("service_monitor", "webview_pool_cache", jSONObject);
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.core.app.C0569a.AbstractC0571a
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C80611a.m139766a(this, i, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AbstractC34467b bVar = this.f94806g;
        if (bVar != null) {
            bVar.mo60905a(i, i2, intent);
        }
        AbsActivityContainer absActivityContainer = this.f94802a;
        if (absActivityContainer != null) {
            absActivityContainer.mo60905a(i, i2, intent);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void showCustomToast(String str, int i, int i2) {
        if (m81761a()) {
            this.f94808i.mo86852a(0, str, i);
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.common.utility.AbstractC13615f
    public void showCustomToast(int i, String str, int i2, int i3) {
        if (m81761a()) {
            this.f94808i.mo86852a(i, str, i2);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (TextUtils.equals(str, "com.ss.android.ugc.aweme.crossplatform.view.WebViewFrameLayout")) {
            WebViewFrameLayout webViewFrameLayout = new WebViewFrameLayout(context, attributeSet);
            SingleWebView a = C40556v.m81851a().mo69678a(this, this.f94805f);
            if (a != null) {
                webViewFrameLayout.setId(R.id.fil);
                webViewFrameLayout.addView(a, new FrameLayout.LayoutParams(-1, -1));
                return webViewFrameLayout;
            }
        }
        if (!C40556v.m81851a().mo69679a(this.f94805f) || !TextUtils.equals(str, "com.ss.android.ugc.aweme.crossplatform.view.WebViewFrameLayout")) {
            return super.onCreateView(view, str, context, attributeSet);
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        WebViewFrameLayout webViewFrameLayout2 = new WebViewFrameLayout(context, attributeSet);
        SingleWebView a2 = C40556v.m81851a().mo69677a(this);
        if (a2 == null) {
            a2 = new SingleWebView(this, attributeSet);
            m81760a(false, SystemClock.uptimeMillis() - uptimeMillis);
        } else {
            m81760a(true, SystemClock.uptimeMillis() - uptimeMillis);
        }
        webViewFrameLayout2.setId(R.id.fil);
        webViewFrameLayout2.addView(a2, new FrameLayout.LayoutParams(-1, -1));
        return webViewFrameLayout2;
    }
}
