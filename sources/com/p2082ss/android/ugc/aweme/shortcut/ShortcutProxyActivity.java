package com.p2082ss.android.ugc.aweme.shortcut;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouteSet;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.money.growth.C60180e;
import com.p2082ss.android.ugc.aweme.p4173ug.AbstractC79622e;
import com.p2082ss.android.ugc.aweme.p4173ug.UgCommonServiceImpl;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortcut.ShortcutProxyActivity */
public final class ShortcutProxyActivity extends ActivityC17312a {
    public static final C69705a Companion = new C69705a((byte) 0);
    private SparseArray _$_findViewCache;

    static {
        Covode.recordClassIndex(82082);
    }

    public final void ShortcutProxyActivity__onStop$___twin___() {
        super.onStop();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this._$_findViewCache;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new SparseArray();
        }
        View view = (View) this._$_findViewCache.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(i, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortcut.ShortcutProxyActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortcut.ShortcutProxyActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        C15477a.m28478d(this);
        m123116x7d28597c(this);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortcut.ShortcutProxyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortcut.ShortcutProxyActivity$a */
    public static final class C69705a {
        static {
            Covode.recordClassIndex(82083);
        }

        private C69705a() {
        }

        public /* synthetic */ C69705a(byte b) {
            this();
        }

        /* renamed from: a */
        public static Intent m123119a(Context context, EnumC69719h hVar) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(hVar, "");
            Intent intent = new Intent(context, ShortcutProxyActivity.class);
            intent.setAction("android.intent.action.VIEW");
            intent.putExtra(StringSet.type, hVar.toString());
            return intent;
        }
    }

    private final void openMoneyGrowthPage() {
        String com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = m123117x5a43a67a(getIntent(), "open_url");
        if (com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra == null) {
            C89219l.m154715b();
        }
        C60180e.m109671a(com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra, this);
        C39162r.m79460a("enter_activity_page", new C33744d().mo59983a("enter_from", "feed_popup").f79943a);
    }

    private final void openShootingPage() {
        SmartRouteSet buildRoute = SmartRouteSet.Companion.buildRoute(this);
        SmartRoute buildRoute2 = SmartRouter.buildRoute(this, "//main");
        C89219l.m154716b(buildRoute2, "");
        buildRoute.addRoute(buildRoute2);
        SmartRoute buildRoute3 = SmartRouter.buildRoute(this, "//shortcut/shooting");
        C89219l.m154716b(buildRoute3, "");
        buildRoute.addRoute(buildRoute3);
        buildRoute.open();
    }

    private final void openNormalPage(String str) {
        SmartRouter.buildRoute(this, str).open();
    }

    /* renamed from: com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop */
    public static void m123115x80957615(ShortcutProxyActivity shortcutProxyActivity) {
        shortcutProxyActivity.ShortcutProxyActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                shortcutProxyActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop */
    public static void m123116x7d28597c(ShortcutProxyActivity shortcutProxyActivity) {
        m123115x80957615(shortcutProxyActivity);
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                shortcutProxyActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    private final boolean needBlock(boolean z) {
        if (z || C69712e.f155623a == null) {
            return false;
        }
        Intent intent = new Intent(this, C69712e.f155623a);
        intent.putExtra(StringSet.type, m123117x5a43a67a(getIntent(), StringSet.type));
        intent.putExtra("open_url", m123117x5a43a67a(getIntent(), "open_url"));
        m123118x22e7baa3(this, intent);
        return true;
    }

    private final void openPage(EnumC69719h hVar) {
        int i = C69717f.f155631a[hVar.ordinal()];
        if (i == 1) {
            openMoneyGrowthPage();
        } else if (i == 2) {
            openMoneyGrowthPage();
        } else if (i == 3) {
            openNormalPage("//shortcut/message");
        } else if (i == 4) {
            openShootingPage();
        } else if (i == 5) {
            openNormalPage("//shortcut/trending");
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        EnumC69719h hVar;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortcut.ShortcutProxyActivity", "onCreate", true);
        super.onCreate(bundle);
        boolean booleanExtra = getIntent().getBooleanExtra("from_live_block_dialog", false);
        try {
            String com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = m123117x5a43a67a(getIntent(), StringSet.type);
            if (com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra == null) {
                com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = "";
            }
            C89219l.m154716b(com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra, "");
            hVar = EnumC69719h.valueOf(com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
        } catch (IllegalArgumentException unused) {
            hVar = EnumC69719h.NONE;
        }
        if (!booleanExtra) {
            C39162r.m79460a("shortcut_click", new C33744d().mo59983a(StringSet.type, hVar.toString()).f79943a);
            UgCommonServiceImpl.m138290j().mo123110h().mo123168a(AbstractC79622e.EnumC79623a.SHORTCUT, hVar.getValue());
        }
        if (needBlock(booleanExtra)) {
            finish();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortcut.ShortcutProxyActivity", "onCreate", false);
            return;
        }
        openPage(hVar);
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.shortcut.ShortcutProxyActivity", "onCreate", false);
    }

    /* renamed from: com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra */
    public static String m123117x5a43a67a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com_ss_android_ugc_aweme_shortcut_ShortcutProxyActivity_com_ss_android_ugc_tiktok_security_lancet_ContextLancet_startActivity */
    public static void m123118x22e7baa3(ShortcutProxyActivity shortcutProxyActivity, Intent intent) {
        C84349a.m145093a(intent, shortcutProxyActivity);
        shortcutProxyActivity.startActivity(intent);
    }
}
