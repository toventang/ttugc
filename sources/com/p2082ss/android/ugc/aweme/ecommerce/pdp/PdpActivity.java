package com.p2082ss.android.ugc.aweme.ecommerce.pdp;

import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b.C44720k;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2851c.C44766a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.trill.R;
import java.io.Serializable;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpActivity */
public final class PdpActivity extends AbstractActivityC44311b {

    /* renamed from: a */
    private long f104139a = -1;

    /* renamed from: b */
    private SparseArray f104140b;

    static {
        Covode.recordClassIndex(53016);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f104140b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f104140b == null) {
            this.f104140b = new SparseArray();
        }
        View view = (View) this.f104140b.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f104140b.put(i, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.pdp.PdpActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
        C44720k a = C44720k.C44721a.m87476a(this);
        if (a != null) {
            a.mo75859a("return");
        }
        super.onBackPressed();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
        ILiveOuterService s = LiveOuterService.m107269s();
        C89219l.m154716b(s, "");
        s.mo95830d().mo13015b(SystemClock.elapsedRealtime() - this.f104139a);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.pdp.PdpActivity", "onResume", true);
        super.onResume();
        this.f104139a = SystemClock.elapsedRealtime();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.pdp.PdpActivity", "onResume", false);
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

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.PdpActivity$a */
    static final class C44634a extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C44634a f104141a = new C44634a();

        static {
            Covode.recordClassIndex(53017);
        }

        C44634a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C446351.f104142a);
            baseActivityViewModel2.config(C446362.f104143a);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.pdp.PdpActivity", "onCreate", true);
        activityConfiguration(C44634a.f104141a);
        super.onCreate(bundle);
        setContentView(R.layout.pg);
        Serializable serializableExtra = getIntent().getSerializableExtra("ENTER_PARAMS");
        if (serializableExtra != null) {
            IPdpStarter.PdpEnterParam pdpEnterParam = (IPdpStarter.PdpEnterParam) serializableExtra;
            ProductPackStruct productPackStruct = (ProductPackStruct) getIntent().getParcelableExtra("PREFETCH_RESULT");
            int intExtra = getIntent().getIntExtra("ERROR_CODE", 0);
            C44720k kVar = new C44720k(this, pdpEnterParam);
            kVar.f104335r = getIntent().getLongExtra("CLICK_TIMESTAMP", SystemClock.elapsedRealtime());
            kVar.f104334q = getIntent().getLongExtra("CLICK_TIMESTAMP", SystemClock.elapsedRealtime());
            C44805i iVar = new C44805i();
            Bundle bundle2 = new Bundle();
            bundle2.putSerializable("ENTER_PARAMS", pdpEnterParam);
            bundle2.putBoolean("full_screen", pdpEnterParam.getFullScreen());
            if (productPackStruct != null) {
                if (intExtra != 0) {
                    bundle2.putInt("ERROR_CODE", intExtra);
                }
                bundle2.putParcelable("PREFETCH_RESULT", productPackStruct);
                bundle2.putLong("PREFETCH_FINISH_TIME", getIntent().getLongExtra("PREFETCH_FINISH_TIME", 0));
            }
            iVar.setArguments(bundle2);
            getSupportFragmentManager().mo3552a().mo3454a(R.id.b82, iVar, "pdp_fragment").mo3473c();
            C44766a.m87493a(this).mo75886b();
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.pdp.PdpActivity", "onCreate", false);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter.PdpEnterParam");
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.pdp.PdpActivity", "onCreate", false);
        throw nullPointerException;
    }
}
