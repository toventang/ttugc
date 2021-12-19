package com.p2082ss.android.ugc.aweme.donation.webpage;

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
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.C40618a;
import com.p2082ss.android.ugc.aweme.crossplatform.view.AbstractC40735a;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.donation.webpage.DonationWebPageDialogActivity */
public final class DonationWebPageDialogActivity extends ActivityC17312a {

    /* renamed from: a */
    public static final C43156a f100573a = new C43156a((byte) 0);

    /* renamed from: b */
    private C40618a f100574b;

    /* renamed from: c */
    private C43160a f100575c;

    /* renamed from: d */
    private SparseArray f100576d;

    static {
        Covode.recordClassIndex(51332);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f100576d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f100576d == null) {
            this.f100576d = new SparseArray();
        }
        View view = (View) this.f100576d.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f100576d.put(i, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.donation.webpage.DonationWebPageDialogActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.donation.webpage.DonationWebPageDialogActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.donation.webpage.DonationWebPageDialogActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.webpage.DonationWebPageDialogActivity$a */
    public static final class C43156a {
        static {
            Covode.recordClassIndex(51333);
        }

        private C43156a() {
        }

        public /* synthetic */ C43156a(byte b) {
            this();
        }

        /* renamed from: a */
        private static void m86054a(Context context, Intent intent) {
            C84349a.m145093a(intent, context);
            context.startActivity(intent);
        }

        /* renamed from: a */
        public static void m86055a(Context context, Bundle bundle) {
            C89219l.m154721d(context, "");
            C89219l.m154721d(bundle, "");
            bundle.putBoolean("show_load_dialog", false);
            bundle.putBoolean("webview_progress_bar", true);
            Intent intent = new Intent(context, DonationWebPageDialogActivity.class);
            intent.putExtras(bundle);
            m86054a(context, intent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.donation.webpage.DonationWebPageDialogActivity$b */
    static final class C43157b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ DonationWebPageDialogActivity f100577a;

        static {
            Covode.recordClassIndex(51334);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43157b(DonationWebPageDialogActivity donationWebPageDialogActivity) {
            super(0);
            this.f100577a = donationWebPageDialogActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f100577a.finish();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void finish() {
        super.finish();
        super.overridePendingTransition(0, R.anim.ah);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
        C43160a aVar = this.f100575c;
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

    /* renamed from: com.ss.android.ugc.aweme.donation.webpage.DonationWebPageDialogActivity$c */
    static final class C43158c extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C43158c f100578a = new C43158c();

        static {
            Covode.recordClassIndex(51335);
        }

        C43158c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C431591.f100579a);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.donation.webpage.DonationWebPageDialogActivity", "onCreate", true);
        activityConfiguration(C43158c.f100578a);
        super.onCreate(bundle);
        setContentView(R.layout.y4);
        super.overridePendingTransition(R.anim.af, 0);
        C40618a a = C40618a.C40619a.m81985a(getIntent());
        C89219l.m154716b(a, "");
        this.f100574b = a;
        C40618a aVar = this.f100574b;
        if (aVar == null) {
            C89219l.m154710a("crossPlatformParams");
        }
        C43160a aVar2 = new C43160a(this, aVar, (byte) 0);
        this.f100575c = aVar2;
        aVar2.mo73391a();
        C43160a aVar3 = this.f100575c;
        if (aVar3 == null) {
            C89219l.m154710a("donationWebPageContainer");
        }
        aVar3.f100585e = new C43157b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.donation.webpage.DonationWebPageDialogActivity", "onCreate", false);
    }
}
