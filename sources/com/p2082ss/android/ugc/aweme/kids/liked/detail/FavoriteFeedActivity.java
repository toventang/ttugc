package com.p2082ss.android.ugc.aweme.kids.liked.detail;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3335c.AbstractC57401a;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.AbstractActivityC57484a;
import com.p2082ss.android.ugc.aweme.kids.liked.p3362b.C57734a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import p4600h.p4601a.C89086z;

/* renamed from: com.ss.android.ugc.aweme.kids.liked.detail.FavoriteFeedActivity */
public final class FavoriteFeedActivity extends AbstractActivityC57484a {

    /* renamed from: a */
    public static final C57736a f131726a = new C57736a((byte) 0);

    /* renamed from: b */
    private HashMap f131727b;

    static {
        Covode.recordClassIndex(67715);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.AbstractActivityC57484a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f131727b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.AbstractActivityC57484a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f131727b == null) {
            this.f131727b = new HashMap();
        }
        View view = (View) this.f131727b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f131727b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.AbstractActivityC57484a
    /* renamed from: b */
    public final String mo94737b() {
        return "favorite_feed_fragment";
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.AbstractActivityC57484a
    /* renamed from: c */
    public final String mo94738c() {
        return "like";
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.AbstractActivityC57484a
    /* renamed from: d */
    public final String mo94739d() {
        return "";
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.AbstractActivityC57484a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.liked.detail.FavoriteFeedActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.liked.detail.FavoriteFeedActivity", "onCreate", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.AbstractActivityC57484a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.AbstractActivityC57484a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.liked.detail.FavoriteFeedActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.liked.detail.FavoriteFeedActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.liked.detail.FavoriteFeedActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.liked.detail.FavoriteFeedActivity$a */
    public static final class C57736a {
        static {
            Covode.recordClassIndex(67716);
        }

        private C57736a() {
        }

        public /* synthetic */ C57736a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.AbstractActivityC57484a
    /* renamed from: f */
    public final String mo94741f() {
        return m104451a(getIntent(), "current_id");
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.AbstractActivityC57484a
    /* renamed from: a */
    public final AbstractC57401a mo94736a() {
        List<Aweme> list;
        WeakReference<List<Aweme>> weakReference = C57734a.f131724a;
        if (weakReference == null || (list = weakReference.get()) == null) {
            list = C89086z.INSTANCE;
        }
        return new C57737a(list);
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

    /* renamed from: a */
    private static String m104451a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
