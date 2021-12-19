package com.p2082ss.android.ugc.aweme.kids.discovery.detail;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57351c;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3335c.AbstractC57401a;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.AbstractActivityC57484a;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.discovery.detail.DiscoveryFeedActivity */
public final class DiscoveryFeedActivity extends AbstractActivityC57484a {

    /* renamed from: a */
    public static final C57563a f131410a = new C57563a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f131411b = C89250i.m154773a((AbstractC89171a) new C57564b(this));

    /* renamed from: c */
    private final AbstractC89244h f131412c = C89250i.m154773a((AbstractC89171a) new C57565c(this));

    /* renamed from: d */
    private final AbstractC89244h f131413d = C89250i.m154773a((AbstractC89171a) new C57566d(this));

    /* renamed from: e */
    private HashMap f131414e;

    static {
        Covode.recordClassIndex(67517);
    }

    /* renamed from: g */
    private final String m104277g() {
        return (String) this.f131411b.getValue();
    }

    /* renamed from: h */
    private final int m104278h() {
        return ((Number) this.f131412c.getValue()).intValue();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.AbstractActivityC57484a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f131414e;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.AbstractActivityC57484a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f131414e == null) {
            this.f131414e = new HashMap();
        }
        View view = (View) this.f131414e.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f131414e.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.AbstractActivityC57484a
    /* renamed from: b */
    public final String mo94737b() {
        return "discovery_feed_fragment";
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.AbstractActivityC57484a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.discovery.detail.DiscoveryFeedActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.discovery.detail.DiscoveryFeedActivity", "onCreate", false);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.discovery.detail.DiscoveryFeedActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.discovery.detail.DiscoveryFeedActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.discovery.detail.DiscoveryFeedActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.detail.DiscoveryFeedActivity$a */
    public static final class C57563a {
        static {
            Covode.recordClassIndex(67518);
        }

        private C57563a() {
        }

        public /* synthetic */ C57563a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.AbstractActivityC57484a
    /* renamed from: e */
    public final String mo94740e() {
        return m104277g();
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.AbstractActivityC57484a
    /* renamed from: c */
    public final String mo94738c() {
        String a = m104276a(getIntent(), "enter_from");
        if (a == null) {
            return "";
        }
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.AbstractActivityC57484a
    /* renamed from: d */
    public final String mo94739d() {
        String a = m104276a(getIntent(), "title");
        if (a == null) {
            return "";
        }
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.AbstractActivityC57484a
    /* renamed from: f */
    public final String mo94741f() {
        return m104276a(getIntent(), "current_id");
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.detail.DiscoveryFeedActivity$b */
    static final class C57564b extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ DiscoveryFeedActivity f131415a;

        static {
            Covode.recordClassIndex(67519);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57564b(DiscoveryFeedActivity discoveryFeedActivity) {
            super(0);
            this.f131415a = discoveryFeedActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String a = m104285a(this.f131415a.getIntent(), "challenge_id");
            if (a == null) {
                a = "";
            }
            C89219l.m154716b(a, "");
            return a;
        }

        /* renamed from: a */
        private static String m104285a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.detail.DiscoveryFeedActivity$c */
    static final class C57565c extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ DiscoveryFeedActivity f131416a;

        static {
            Covode.recordClassIndex(67520);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57565c(DiscoveryFeedActivity discoveryFeedActivity) {
            super(0);
            this.f131416a = discoveryFeedActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(this.f131416a.getIntent().getIntExtra("feed_type", -1));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.detail.DiscoveryFeedActivity$d */
    static final class C57566d extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ DiscoveryFeedActivity f131417a;

        static {
            Covode.recordClassIndex(67521);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57566d(DiscoveryFeedActivity discoveryFeedActivity) {
            super(0);
            this.f131417a = discoveryFeedActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(this.f131417a.getIntent().getBooleanExtra("preload_from_cache", false));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.AbstractActivityC57484a
    /* renamed from: a */
    public final AbstractC57401a mo94736a() {
        return new C57567a(m104277g(), ((Boolean) this.f131413d.getValue()).booleanValue());
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
    private static String m104276a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
        View onCreateView = super.onCreateView(str, context, attributeSet);
        if (m104278h() == 1) {
            C57351c.f130726a = "category_id";
        } else if (m104278h() == 0) {
            C57351c.f130726a = "trending_content_id";
        }
        C57351c.f130727b = m104277g();
        return onCreateView;
    }
}
