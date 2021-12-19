package com.bytedance.ies.ugc.aweme.commercialize.splash.show;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.android.base.runtime.C16091a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.C17957a;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1258b.C17936b;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.AbstractC17973g;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17964b;
import com.bytedance.ies.ugc.aweme.commercialize.splash.p1262f.C17966c;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.p2092ad.splash.AbstractC29669j;
import com.p2082ss.android.p2092ad.splash.AbstractC29671l;
import com.p2082ss.android.p2092ad.splash.AbstractC29684v;
import com.p2082ss.android.p2092ad.splash.C29676q;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38220ag;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38580b;
import com.p2082ss.android.ugc.aweme.commercialize_tools_api.singleton.TroubleshootingLogDelegate;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

public class NormalSplashAdActivity extends ActivityC17312a implements AbstractC18006a {

    /* renamed from: a */
    public static final C18005b f42867a = new C18005b();

    /* renamed from: c */
    public static int f42868c;

    /* renamed from: b */
    Handler f42869b = new Handler(Looper.getMainLooper());

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.show.NormalSplashAdActivity$b */
    public static class C18005b {

        /* renamed from: a */
        AbstractC29684v f42872a;

        /* renamed from: b */
        View f42873b;

        /* renamed from: c */
        C18004a f42874c;

        static {
            Covode.recordClassIndex(20627);
        }

        C18005b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo28736a() {
            this.f42872a = null;
            this.f42873b = null;
            this.f42874c = null;
        }

        /* renamed from: a */
        public final boolean mo28737a(Context context, AbstractC29684v vVar, View view, C18004a aVar) {
            this.f42872a = vVar;
            this.f42873b = view;
            this.f42874c = aVar;
            if (view == null) {
                mo28736a();
                return false;
            }
            C17957a.m33426a().mo28641k();
            Intent intent = new Intent(context, NormalSplashAdActivity.class);
            if (context instanceof Activity) {
                intent.putExtra("from", context.getClass().getName());
            } else {
                intent.addFlags(268435456);
            }
            C84349a.m145093a(intent, context);
            context.startActivity(intent);
            return true;
        }
    }

    /* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.show.NormalSplashAdActivity$a */
    public static class C18004a implements AbstractC29671l {

        /* renamed from: a */
        NormalSplashAdActivity f42870a;

        /* renamed from: b */
        private boolean f42871b;

        static {
            Covode.recordClassIndex(20626);
        }

        /* synthetic */ C18004a() {
            this(false);
        }

        private C18004a(boolean z) {
            this.f42871b = false;
        }

        @Override // com.p2082ss.android.p2092ad.splash.AbstractC29671l
        /* renamed from: a */
        public final void mo28734a(AbstractC29669j jVar) {
            AbstractC81915c.m141874a(new C17936b());
            NormalSplashAdActivity normalSplashAdActivity = this.f42870a;
            if (normalSplashAdActivity != null) {
                NormalSplashAdActivity.f42868c = jVar.mo51657a();
                normalSplashAdActivity.finish();
                if (NormalSplashAdActivity.f42868c == 1 || NormalSplashAdActivity.f42868c == 4) {
                    C38580b.m78285a(System.currentTimeMillis(), "skip");
                } else if (NormalSplashAdActivity.f42868c == 3) {
                    C38580b.m78285a(System.currentTimeMillis(), "click");
                } else {
                    C38580b.m78285a(System.currentTimeMillis(), "finish");
                }
            }
        }

        @Override // com.p2082ss.android.p2092ad.splash.AbstractC29671l
        /* renamed from: a */
        public final void mo28735a(C29676q qVar) {
            NormalSplashAdActivity normalSplashAdActivity = this.f42870a;
            if (normalSplashAdActivity != null) {
                C38580b.m78285a(System.currentTimeMillis(), "click");
                C51423a.m95784a(3, null, "openSplashScheme: from = SplashAdActivity");
                TroubleshootingLogDelegate.INSTANCE.ordinarySplashLog("Click to open the screen and hang up");
                AbstractC17973g gVar = C18008c.f42876a;
                if (qVar != null) {
                    List<C29676q.C29678b> list = qVar.f70764j;
                    if (!C13603b.m24435a((Collection) list)) {
                        Iterator<C29676q.C29678b> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C29676q.C29678b next = it.next();
                            if (next != null) {
                                String str = next.f70787a;
                                int i = next.f70788b;
                                if (!TextUtils.isEmpty(str)) {
                                    long j = qVar.f70755a;
                                    String str2 = qVar.f70757c;
                                    if (i == 1) {
                                        C17966c.m33444a(normalSplashAdActivity, str, Long.valueOf(j), str2, gVar);
                                        break;
                                    } else if (i != 2) {
                                        if (C13627m.m24498a(str) || (!str.toLowerCase().startsWith("http://") && !str.toLowerCase().startsWith("https://"))) {
                                            C17966c.m33444a(normalSplashAdActivity, str, Long.valueOf(j), str2, gVar);
                                        } else if (C17966c.m33445a(normalSplashAdActivity, str, qVar.f70761g, Long.valueOf(j), str2, (C38220ag) GsonHolder.m138943c().mo123620b().mo46670a(qVar.f70770p, C38220ag.class), qVar.f70771q, qVar.f70772r)) {
                                            break;
                                        }
                                    } else if (C17966c.m33445a(normalSplashAdActivity, str, qVar.f70761g, Long.valueOf(j), str2, (C38220ag) GsonHolder.m138943c().mo123620b().mo46670a(qVar.f70770p, C38220ag.class), qVar.f70771q, qVar.f70772r)) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                }
                if (this.f42871b) {
                    long a = C16048b.m29633a().mo25413a(true, "splashad_finish_delay", 0L);
                    if (a > 0) {
                        normalSplashAdActivity.f42869b.postDelayed(new RunnableC18007b(normalSplashAdActivity), a);
                        return;
                    }
                }
                normalSplashAdActivity.finish();
            }
        }

        @Override // com.p2082ss.android.p2092ad.splash.AbstractC29671l
        /* renamed from: a */
        public final void mo28733a(long j, String str) {
            long currentTimeMillis = System.currentTimeMillis() - C17957a.m33426a().mo28642l();
            C18129a.m33747a("splash_ad", "first_view", String.valueOf(j), str, "0").mo28897a("launchduration", Long.valueOf(currentTimeMillis)).mo28901b();
            C38580b.m78284a(currentTimeMillis, 2, System.currentTimeMillis());
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    static {
        Covode.recordClassIndex(20625);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        super.onResume();
        C17957a.m33426a().mo28640j();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        Handler handler = this.f42869b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        super.onDestroy();
        C17964b.f42785d = false;
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
        MethodCollector.m26663i(4415);
        Log.getStackTraceString(new RuntimeException());
        C17964b.f42786e = false;
        if (C17964b.f42787f) {
            C17964b.f42787f = false;
            synchronized (C17964b.f42788g) {
                try {
                    C17964b.f42788g.notifyAll();
                } catch (Throwable th) {
                    MethodCollector.m26664o(4415);
                    throw th;
                }
            }
        }
        super.finish();
        int i = f42868c;
        if (i == 4) {
            overridePendingTransition(0, R.anim.e2);
        } else if (i != 1) {
            int a = SettingsManager.m29616a().mo25394a("splash_disappear_time", 0);
            if (a == 1) {
                overridePendingTransition(0, R.anim.e0);
            } else if (a == 2) {
                overridePendingTransition(0, R.anim.e1);
            } else {
                overridePendingTransition(0, 0);
            }
        } else {
            overridePendingTransition(0, 0);
        }
        C17964b.f42785d = false;
        MethodCollector.m26664o(4415);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        MethodCollector.m26663i(4405);
        C15477a.m28474a(this, bundle);
        super.onCreate(bundle);
        C17957a.m33426a().mo28639i();
        try {
            setContentView(R.layout.bq);
            if (Build.VERSION.SDK_INT >= 28) {
                WindowManager.LayoutParams attributes = getWindow().getAttributes();
                attributes.layoutInDisplayCutoutMode = 1;
                getWindow().setAttributes(attributes);
            }
            C18005b bVar = f42867a;
            View view = bVar.f42873b;
            C18004a aVar = bVar.f42874c;
            if (aVar != null) {
                aVar.f42870a = this;
            }
            bVar.mo28736a();
            if (view != null) {
                C34729o.m70953a((Activity) this);
                view.setBackgroundResource(R.drawable.bl2);
                ((ViewGroup) findViewById(R.id.e55)).addView(view);
            } else {
                if (getIntent() != null) {
                    m33513a(getIntent(), "from");
                }
                finish();
                overridePendingTransition(0, 0);
            }
            C17964b.f42786e = true;
            MethodCollector.m26664o(4405);
            return;
        } catch (RuntimeException e) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", e.toString());
            C16091a.f38742b.monitorCommonLog("splash_set_content_view", jSONObject);
        } catch (Throwable unused) {
        }
        f42867a.mo28736a();
        finish();
        MethodCollector.m26664o(4405);
    }

    /* renamed from: a */
    private static String m33513a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
