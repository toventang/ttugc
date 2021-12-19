package com.p2082ss.android.ugc.aweme.ecommerce.review;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.AbstractC0976n;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.bytedance.tux.p1717e.C23073a;
import com.p2082ss.android.ugc.aweme.base.p2364a.C34469d;
import com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45264j;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45551e;
import com.p2082ss.android.ugc.aweme.ecommerce.track.TrackerProvider;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.review.ProductReviewActivity */
public final class ProductReviewActivity extends AbstractActivityC44311b {

    /* renamed from: a */
    private SparseArray f105176a;

    static {
        Covode.recordClassIndex(53538);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f105176a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f105176a == null) {
            this.f105176a = new SparseArray();
        }
        View view = (View) this.f105176a.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f105176a.put(i, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.review.ProductReviewActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.review.ProductReviewActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.review.ProductReviewActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.ProductReviewActivity$a */
    static final class C45107a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ ProductReviewActivity f105177a;

        static {
            Covode.recordClassIndex(53539);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45107a(ProductReviewActivity productReviewActivity) {
            super(0);
            this.f105177a = productReviewActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f105177a.finish();
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void finish() {
        super.finish();
        C34469d.m70450a(this, 0, false);
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

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        Object obj;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.review.ProductReviewActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.q9);
        C34469d.m70450a(this, 0, true);
        C23073a.C23074a.m43508a(this).mo37499b(true).mo37493a().f54627a.mo33415d();
        try {
            obj = C45264j.m87844a().mo46670a(m87756a(getIntent(), "track_params"), Map.class);
        } catch (Exception unused) {
            obj = null;
        }
        Map map = (Map) obj;
        if (map == null) {
            map = new HashMap();
        }
        String a = m87756a(getIntent(), "product_id");
        if (a == null) {
            a = "";
        }
        C89219l.m154716b(a, "");
        float floatExtra = getIntent().getFloatExtra("review_score", -1.0f);
        int intExtra = getIntent().getIntExtra("review_count", 0);
        Map d = C89041ag.m154431d(map);
        d.put("page_name", "product_review");
        d.put("product_id", a);
        d.putAll(map);
        d.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        TrackerProvider.C45534a.m88074a(this, new C45551e(d));
        AbstractC0976n a2 = getSupportFragmentManager().mo3552a();
        C45121a aVar = new C45121a();
        Bundle bundle2 = new Bundle();
        bundle2.putString("product_id", a);
        bundle2.putInt("review_count", intExtra);
        if (floatExtra >= 0.0f) {
            bundle2.putFloat("review_score", floatExtra);
        }
        aVar.setArguments(bundle2);
        a2.mo3470b(R.id.b82, aVar, "PRODUCT_COMMENT_FRAGMENT_TAG").mo3473c();
        TuxNavBar.C23179a aVar2 = new TuxNavBar.C23179a();
        C23187b a3 = new C23187b().mo37738a(R.raw.icon_arrow_left_ltr);
        a3.f54930b = true;
        TuxNavBar.C23179a a4 = aVar2.mo37732a(a3.mo37741a((AbstractC89171a<C89391z>) new C45107a(this)));
        C23194g gVar = new C23194g();
        String string = getString(R.string.bhg, new Object[]{String.valueOf(intExtra)});
        C89219l.m154716b(string, "");
        ((TuxNavBar) _$_findCachedViewById(R.id.eiz)).setNavActions(a4.mo37731a(gVar.mo37753a(string)));
        ((TuxNavBar) _$_findCachedViewById(R.id.eiz)).mo37727a(true);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.review.ProductReviewActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m87756a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
