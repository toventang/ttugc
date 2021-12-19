package com.p2082ss.android.ugc.aweme.deeplink;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.services.IMainService;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.services.MandatoryLoginService;
import com.p2082ss.android.ugc.aweme.utils.C80578il;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.Random;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.deeplink.RequireLoginActivity */
public final class RequireLoginActivity extends Activity {

    /* renamed from: d */
    public static final C40992a f95861d = new C40992a((byte) 0);

    /* renamed from: a */
    public String f95862a;

    /* renamed from: b */
    public Intent f95863b;

    /* renamed from: c */
    public boolean f95864c;

    /* renamed from: e */
    private final IAccountService.AbstractC31277g f95865e = new C40993b(this);

    static {
        Covode.recordClassIndex(48852);
    }

    /* access modifiers changed from: protected */
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.RequireLoginActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.RequireLoginActivity", "onResume", false);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.RequireLoginActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.deeplink.RequireLoginActivity$a */
    public static final class C40992a {
        static {
            Covode.recordClassIndex(48853);
        }

        private C40992a() {
        }

        public /* synthetic */ C40992a(byte b) {
            this();
        }

        /* renamed from: b */
        private static String m82603b(Uri uri) {
            if (uri == null) {
                return null;
            }
            if (C89219l.m154714a((Object) uri.getHost(), (Object) "webview")) {
                return C80578il.m139674a(C80578il.m139673a(uri), "awedp_require_login");
            }
            return uri.getQueryParameter("awedp_require_login");
        }

        /* renamed from: a */
        public static boolean m82602a(Uri uri) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (g.isLogin()) {
                return false;
            }
            if (MandatoryLoginService.createIMandatoryLoginServicebyMonsterPlugin(false).shouldShowForcedLogin()) {
                return true;
            }
            return C89219l.m154714a((Object) "normal", (Object) m82603b(uri));
        }

        /* renamed from: a */
        public static void m82600a(Activity activity, Intent intent) {
            C84349a.m145093a(intent, activity);
            activity.startActivity(intent);
        }

        /* renamed from: a */
        public static void m82601a(Activity activity, String str, boolean z) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(str, "");
            Intent intent = new Intent(activity, RequireLoginActivity.class);
            intent.putExtra("deep_link_intent", activity.getIntent());
            intent.putExtra("enter_from", str);
            intent.putExtra("is_new_procedure", z);
            activity.overridePendingTransition(0, 0);
            m82600a(activity, intent);
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: protected */
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

    /* access modifiers changed from: protected */
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m82599a(intent);
    }

    /* renamed from: a */
    private final void m82599a(Intent intent) {
        Intent intent2;
        String str = null;
        if (intent != null) {
            str = m82598a(intent, "enter_from");
        }
        this.f95862a = str;
        boolean z = false;
        if (intent != null) {
            z = intent.getBooleanExtra("is_new_procedure", false);
        }
        this.f95864c = z;
        if (intent != null && (intent2 = (Intent) intent.getParcelableExtra("deep_link_intent")) != null) {
            this.f95863b = intent2;
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.RequireLoginActivity", "onCreate", true);
        super.onCreate(bundle);
        m82599a(getIntent());
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("is_fullscreen_dialog", true);
        bundle2.putBoolean("is_skippable_dialog", false);
        bundle2.putBoolean("need_callback", true);
        IAccountService.C31274d dVar = new IAccountService.C31274d();
        dVar.f74961b = "deeplink";
        dVar.f74960a = this;
        dVar.f74964e = this.f95865e;
        dVar.f74963d = bundle2;
        AccountService.m65215a().mo57071g().showLoginAndRegisterView(dVar.mo57084a());
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.deeplink.RequireLoginActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m82598a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.deeplink.RequireLoginActivity$b */
    static final class C40993b implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ RequireLoginActivity f95866a;

        static {
            Covode.recordClassIndex(48854);
        }

        C40993b(RequireLoginActivity requireLoginActivity) {
            this.f95866a = requireLoginActivity;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            Class<? extends Activity> deepLinkHandlerActivityClass;
            String str;
            if (i == 1 && i2 == 1) {
                Intent intent = this.f95866a.f95863b;
                RequireLoginActivity requireLoginActivity = this.f95866a;
                String str2 = requireLoginActivity.f95862a;
                boolean z = this.f95866a.f95864c;
                C89219l.m154721d(requireLoginActivity, "");
                if (!(intent == null || intent.getData() == null)) {
                    if (C89219l.m154714a((Object) str2, (Object) "from_app_link")) {
                        deepLinkHandlerActivityClass = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getAppLinkHandlerActivityClass(z);
                    } else {
                        deepLinkHandlerActivityClass = MainServiceImpl.createIMainServicebyMonsterPlugin(false).getDeepLinkHandlerActivityClass(z);
                    }
                    Intent intent2 = new Intent(requireLoginActivity, deepLinkHandlerActivityClass);
                    Uri data = intent.getData();
                    if (data != null) {
                        str = data.toString();
                    } else {
                        str = null;
                    }
                    C29844g gVar = new C29844g(str);
                    gVar.mo52130a("random", new Random(1000).toString());
                    intent2.setData(Uri.parse(gVar.mo52126a()));
                    intent2.putExtras(intent);
                    intent2.putExtra("inner_from", "require_login");
                    C40992a.m82600a(requireLoginActivity, intent2);
                }
            } else {
                Intent intent3 = this.f95866a.getIntent();
                if (intent3 == null) {
                    intent3 = new Intent();
                }
                RequireLoginActivity requireLoginActivity2 = this.f95866a;
                IMainService createIMainServicebyMonsterPlugin = MainServiceImpl.createIMainServicebyMonsterPlugin(false);
                C89219l.m154716b(createIMainServicebyMonsterPlugin, "");
                intent3.setClass(requireLoginActivity2, createIMainServicebyMonsterPlugin.getMainActivityClass());
                intent3.putExtra("from_require_login", true);
                intent3.setFlags(335544320);
                RequireLoginActivity requireLoginActivity3 = this.f95866a;
                C84349a.m145093a(intent3, requireLoginActivity3);
                requireLoginActivity3.startActivity(intent3);
            }
            this.f95866a.finish();
        }
    }
}
