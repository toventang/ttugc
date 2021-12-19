package com.p2082ss.android.ugc.aweme.kids.homepage.deeplink;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.kids.homepage.deeplink.KidsDeepLinkHandlerActivity */
public final class KidsDeepLinkHandlerActivity extends ActivityC17312a {
    public static final C57643a Companion = new C57643a((byte) 0);
    private HashMap _$_findViewCache;
    private String gdLabel = "";
    private boolean isOpenAwemeDetail;
    private boolean mNoMatched;
    private Uri mUri;

    static {
        Covode.recordClassIndex(67606);
    }

    /* renamed from: com_ss_android_ugc_aweme_kids_homepage_deeplink_KidsDeepLinkHandlerActivity_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m104373xb6ef2d58(String str, String str2, Throwable th) {
        return 0;
    }

    public final void KidsDeepLinkHandlerActivity__onStop$___twin___() {
        super.onStop();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        m104371x2ef472a(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.deeplink.KidsDeepLinkHandlerActivity$a */
    public static final class C57643a {
        static {
            Covode.recordClassIndex(67607);
        }

        private C57643a() {
        }

        public /* synthetic */ C57643a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean getMNoMatched() {
        return this.mNoMatched;
    }

    /* access modifiers changed from: protected */
    public final Uri getMUri() {
        return this.mUri;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        super.onDestroy();
        this.mNoMatched = false;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        super.onStart();
        finish();
    }

    /* access modifiers changed from: protected */
    public final void setMNoMatched(boolean z) {
        this.mNoMatched = z;
    }

    /* access modifiers changed from: protected */
    public final void setMUri(Uri uri) {
        this.mUri = uri;
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, android.view.ContextThemeWrapper, androidx.appcompat.app.ActivityC0218d, android.app.Activity
    public final void setTheme(int i) {
        try {
            super.setTheme(i);
        } catch (Exception unused) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.deeplink.KidsDeepLinkHandlerActivity$b */
    static final class C57644b extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C57644b f131563a = new C57644b();

        static {
            Covode.recordClassIndex(67608);
        }

        C57644b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C576451.f131564a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com_ss_android_ugc_aweme_kids_homepage_deeplink_KidsDeepLinkHandlerActivity_com_bytedance_sysoptimizer_EnterTransitionLancet_onStop */
    public static void m104370x151d0dc3(KidsDeepLinkHandlerActivity kidsDeepLinkHandlerActivity) {
        kidsDeepLinkHandlerActivity.KidsDeepLinkHandlerActivity__onStop$___twin___();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                kidsDeepLinkHandlerActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: com_ss_android_ugc_aweme_kids_homepage_deeplink_KidsDeepLinkHandlerActivity_com_ss_android_ugc_aweme_lancet_ActivityEnterTransitionCoordinatorLancet_onStop */
    public static void m104371x2ef472a(KidsDeepLinkHandlerActivity kidsDeepLinkHandlerActivity) {
        m104370x151d0dc3(kidsDeepLinkHandlerActivity);
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                kidsDeepLinkHandlerActivity.getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
    }

    private final boolean parseUri(Intent intent) {
        if (intent == null) {
            return false;
        }
        String action = intent.getAction();
        if (!C13627m.m24498a(action)) {
            if (action == null) {
                C89219l.m154715b();
            }
            if (C89361p.m154888a((CharSequence) action, "com.ss.android.sdk.", 0, false, 6) == 0) {
                String com_ss_android_ugc_aweme_kids_homepage_deeplink_KidsDeepLinkHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = m104372xacbbb728(intent, "open_url");
                if (!C13627m.m24498a(com_ss_android_ugc_aweme_kids_homepage_deeplink_KidsDeepLinkHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra)) {
                    try {
                        this.mUri = Uri.parse(com_ss_android_ugc_aweme_kids_homepage_deeplink_KidsDeepLinkHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra);
                    } catch (Exception e) {
                        m104373xb6ef2d58(KidsDeepLinkHandlerActivity.class.getSimpleName(), "", e);
                        return false;
                    }
                }
            }
        }
        if (this.mUri == null) {
            this.mUri = intent.getData();
        }
        Uri uri = this.mUri;
        if (uri == null || uri.isOpaque()) {
            return false;
        }
        return true;
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        activityConfiguration(C57644b.f131563a);
        super.onCreate(bundle);
        C17873f.m33093a(this);
        Intent intent = getIntent();
        if (parseUri(intent)) {
            Uri data = intent.getData();
            if (!(data == null || data.getQueryParameter("gd_label") == null)) {
                String queryParameter = data.getQueryParameter("gd_label");
                if (queryParameter == null) {
                    C89219l.m154715b();
                }
                this.gdLabel = queryParameter;
            }
            SmartRouter.buildRoute(this, "//kids/main").open();
            if (TextUtils.equals("amazon_alexa", this.gdLabel) || TextUtils.equals("google_assistant", this.gdLabel)) {
                new C23144b(this).mo37635a(getResources().getString(R.string.b4v)).mo37632a().mo37637b();
            }
        } else if (!isFinishing()) {
            finish();
        }
    }

    /* renamed from: com_ss_android_ugc_aweme_kids_homepage_deeplink_KidsDeepLinkHandlerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra */
    public static String m104372xacbbb728(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
