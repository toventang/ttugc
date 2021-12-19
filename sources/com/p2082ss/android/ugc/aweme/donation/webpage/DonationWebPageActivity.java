package com.p2082ss.android.ugc.aweme.donation.webpage;

import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.C40618a;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40735a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.donation.webpage.DonationWebPageActivity */
public final class DonationWebPageActivity extends ActivityC17312a {

    /* renamed from: a */
    private C40618a f100568a;

    /* renamed from: b */
    private C43160a f100569b;

    /* renamed from: c */
    private SparseArray f100570c;

    static {
        Covode.recordClassIndex(51329);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f100570c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f100570c == null) {
            this.f100570c = new SparseArray();
        }
        View view = (View) this.f100570c.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f100570c.put(i, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.donation.webpage.DonationWebPageActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.donation.webpage.DonationWebPageActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.donation.webpage.DonationWebPageActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.webpage.DonationWebPageActivity$a */
    static final class C43154a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ DonationWebPageActivity f100571a;

        static {
            Covode.recordClassIndex(51330);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43154a(DonationWebPageActivity donationWebPageActivity) {
            super(0);
            this.f100571a = donationWebPageActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f100571a.finish();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.webpage.DonationWebPageActivity$b */
    static final class C43155b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ DonationWebPageActivity f100572a;

        static {
            Covode.recordClassIndex(51331);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43155b(DonationWebPageActivity donationWebPageActivity) {
            super(0);
            this.f100572a = donationWebPageActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f100572a.setResult(-1);
            this.f100572a.finish();
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
        C43160a aVar = this.f100569b;
        if (aVar == null) {
            C89219l.m154710a("donationWebPageContainer");
        }
        AbstractC40735a f = aVar.mo67258f();
        if (f == null || !f.mo69922a()) {
            super.onBackPressed();
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.donation.webpage.DonationWebPageActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.y4);
        C40618a a = C40618a.C40619a.m81985a(getIntent());
        C89219l.m154716b(a, "");
        this.f100568a = a;
        C40618a aVar = this.f100568a;
        if (aVar == null) {
            C89219l.m154710a("crossPlatformParams");
        }
        C43160a aVar2 = new C43160a(this, aVar, (byte) 0);
        this.f100569b = aVar2;
        aVar2.mo73391a();
        C43160a aVar3 = this.f100569b;
        if (aVar3 == null) {
            C89219l.m154710a("donationWebPageContainer");
        }
        aVar3.f100585e = new C43154a(this);
        C43160a aVar4 = this.f100569b;
        if (aVar4 == null) {
            C89219l.m154710a("donationWebPageContainer");
        }
        aVar4.f100584d = new C43155b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.donation.webpage.DonationWebPageActivity", "onCreate", false);
    }
}
