package com.p2082ss.android.ugc.aweme.ecommerce.semipdp;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2851c.C44766a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpStarter;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpActivity */
public final class SemiPdpActivity extends AbstractActivityC44311b {

    /* renamed from: a */
    private SparseArray f105570a;

    static {
        Covode.recordClassIndex(53746);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f105570a;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f105570a == null) {
            this.f105570a = new SparseArray();
        }
        View view = (View) this.f105570a.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f105570a.put(i, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
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

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpActivity$a */
    static final class C45292a extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C45292a f105571a = new C45292a();

        static {
            Covode.recordClassIndex(53747);
        }

        C45292a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C452931.f105572a);
            baseActivityViewModel2.config(C452942.f105573a);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpActivity", "onCreate", true);
        activityConfiguration(C45292a.f105571a);
        super.onCreate(bundle);
        setContentView(R.layout.pg);
        String a = m87883a(getIntent(), "ENTER_PARAMS");
        String a2 = m87883a(getIntent(), "product_info");
        int intExtra = getIntent().getIntExtra("ERROR_CODE", 0);
        C45307a aVar = new C45307a();
        Bundle bundle2 = new Bundle();
        bundle2.putSerializable("ENTER_PARAMS", (Serializable) C80342dg.m139301a(a, SemiPdpStarter.SemiPdpEnterParams.class));
        bundle2.putParcelable("product_info", (Parcelable) C80342dg.m139301a(a2, ProductPackStruct.class));
        bundle2.putInt("ERROR_CODE", intExtra);
        aVar.setArguments(bundle2);
        C44766a.m87493a(this).mo75886b();
        getSupportFragmentManager().mo3552a().mo3454a(R.id.b82, aVar, "SemiPdpFragment").mo3473c();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.semipdp.SemiPdpActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m87883a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
