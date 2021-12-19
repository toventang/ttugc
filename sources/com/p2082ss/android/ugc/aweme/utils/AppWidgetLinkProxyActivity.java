package com.p2082ss.android.ugc.aweme.utils;

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
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.p4173ug.AbstractC79622e;
import com.p2082ss.android.ugc.aweme.p4173ug.UgCommonServiceImpl;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.utils.AppWidgetLinkProxyActivity */
public final class AppWidgetLinkProxyActivity extends ActivityC17312a {

    /* renamed from: a */
    public static final C80171a f179609a = new C80171a((byte) 0);

    /* renamed from: b */
    private SparseArray f179610b;

    static {
        Covode.recordClassIndex(93416);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f179610b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f179610b == null) {
            this.f179610b = new SparseArray();
        }
        View view = (View) this.f179610b.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f179610b.put(i, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.utils.AppWidgetLinkProxyActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.utils.AppWidgetLinkProxyActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.utils.AppWidgetLinkProxyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.AppWidgetLinkProxyActivity$a */
    public static final class C80171a {
        static {
            Covode.recordClassIndex(93417);
        }

        private C80171a() {
        }

        public /* synthetic */ C80171a(byte b) {
            this();
        }

        /* renamed from: a */
        public static Intent m138931a(Context context, String str) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(str, "");
            Intent intent = new Intent(context, AppWidgetLinkProxyActivity.class);
            intent.putExtra("extra_widget_type", str);
            return intent;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
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

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.utils.AppWidgetLinkProxyActivity", "onCreate", true);
        super.onCreate(bundle);
        String a = m138930a(getIntent(), "extra_widget_type");
        if (a == null) {
            a = "";
        }
        C89219l.m154716b(a, "");
        C80608p.m139763a("launch_app", a);
        UgCommonServiceImpl.m138290j().mo123110h().mo123168a(AbstractC79622e.EnumC79623a.WIDGET, a);
        int intExtra = getIntent().getIntExtra("extra_jump_type", -1);
        if (intExtra == 1) {
            String a2 = m138930a(getIntent(), "extra_challenge_id");
            if (!(a2 == null || a2.length() == 0)) {
                SmartRouter.buildRoute(this, "//challenge/detail").withParam("id", a2).withParam("extra_challenge_from", "").withParam("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", 0).open(0);
            }
        } else if (intExtra == 2) {
            Serializable serializableExtra = getIntent().getSerializableExtra("extra_aweme");
            if (!(serializableExtra instanceof Aweme)) {
                serializableExtra = null;
            }
            Aweme aweme = (Aweme) serializableExtra;
            String a3 = m138930a(getIntent(), "extra_challenge_id");
            if (a3 == null) {
                a3 = "";
            }
            C89219l.m154716b(a3, "");
            if (!(aweme == null || a3.length() == 0)) {
                SmartRouter.buildRoute(this, "aweme://aweme/detail/").withParam("id", aweme.getAid()).withParam("refer", "discovery").withParam("video_from", "from_discovery_challenge").withParam("video_type", 2).withParam("profile_enterprise_type", aweme.getEnterpriseType()).withParam("challenge_id", a3).open();
            }
        } else if (intExtra == 3) {
            SmartRouter.buildRoute(this, "//kids/main").open();
        }
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.utils.AppWidgetLinkProxyActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m138930a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
