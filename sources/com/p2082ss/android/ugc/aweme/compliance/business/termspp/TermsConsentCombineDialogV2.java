package com.p2082ss.android.ugc.aweme.compliance.business.termspp;

import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.appcompat.app.AbstractC0211a;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.C17205a;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17235c;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl.TpcConsentServiceImpl;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialogV2 */
public final class TermsConsentCombineDialogV2 extends ActivityC17312a {

    /* renamed from: b */
    public static final C39562a f93298b = new C39562a((byte) 0);

    /* renamed from: a */
    public C39578b f93299a;

    /* renamed from: c */
    private SparseArray f93300c;

    static {
        Covode.recordClassIndex(47271);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f93300c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f93300c == null) {
            this.f93300c = new SparseArray();
        }
        View view = (View) this.f93300c.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f93300c.put(i, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialogV2", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialogV2", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialogV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialogV2$a */
    public static final class C39562a {
        static {
            Covode.recordClassIndex(47272);
        }

        private C39562a() {
        }

        public /* synthetic */ C39562a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialogV2$c */
    static final class C39564c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ TermsConsentCombineDialogV2 f93302a;

        static {
            Covode.recordClassIndex(47274);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39564c(TermsConsentCombineDialogV2 termsConsentCombineDialogV2) {
            super(0);
            this.f93302a = termsConsentCombineDialogV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (TermsConsentCombineDialogV2.m80349a(this.f93302a).mo68999c().f93328c) {
                C39162r.m79460a("click_agree_to_all", new C33744d().f79943a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialogV2$f */
    static final class C39567f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ TermsConsentCombineDialogV2 f93305a;

        static {
            Covode.recordClassIndex(47277);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39567f(TermsConsentCombineDialogV2 termsConsentCombineDialogV2) {
            super(0);
            this.f93305a = termsConsentCombineDialogV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            String str;
            if (TpcConsentServiceImpl.m80302j().mo68639b()) {
                str = "https://www.tiktok.com/legal/terms-of-service?lang=ko-KR";
            } else {
                str = "https://www.tiktok.com/legal/terms-of-service?lang=ko";
            }
            TermsConsentCombineDialogV2 termsConsentCombineDialogV2 = this.f93305a;
            String string = termsConsentCombineDialogV2.getString(R.string.aqs);
            C89219l.m154716b(string, "");
            termsConsentCombineDialogV2.mo68988a(str, string);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialogV2$g */
    static final class C39568g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ TermsConsentCombineDialogV2 f93306a;

        static {
            Covode.recordClassIndex(47278);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39568g(TermsConsentCombineDialogV2 termsConsentCombineDialogV2) {
            super(0);
            this.f93306a = termsConsentCombineDialogV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            String str;
            if (TpcConsentServiceImpl.m80302j().mo68639b()) {
                str = "https://www.tiktok.com/legal/privacy-policy?lang=ko-KR";
            } else {
                str = "https://www.tiktok.com/legal/privacy-policy?lang=ko";
            }
            TermsConsentCombineDialogV2 termsConsentCombineDialogV2 = this.f93306a;
            String string = termsConsentCombineDialogV2.getString(R.string.aqr);
            C89219l.m154716b(string, "");
            termsConsentCombineDialogV2.mo68988a(str, string);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo68987a() {
        boolean z;
        C39578b bVar = this.f93299a;
        if (bVar == null) {
            C89219l.m154710a("contentView");
        }
        AbstractC39577a c = bVar.mo68999c();
        C39578b bVar2 = this.f93299a;
        if (bVar2 == null) {
            C89219l.m154710a("contentView");
        }
        if (bVar2.mo68997a().f93328c) {
            C39578b bVar3 = this.f93299a;
            if (bVar3 == null) {
                C89219l.m154710a("contentView");
            }
            if (bVar3.mo68998b().f93328c) {
                z = true;
                c.mo68996a(z);
            }
        }
        z = false;
        c.mo68996a(z);
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

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialogV2$h */
    static final class C39569h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ TermsConsentCombineDialogV2 f93307a;

        static {
            Covode.recordClassIndex(47279);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39569h(TermsConsentCombineDialogV2 termsConsentCombineDialogV2) {
            super(0);
            this.f93307a = termsConsentCombineDialogV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            if (!C58001a.m104815a(TermsConsentCombineDialogV2.m80349a(this.f93307a).mo69000d(), 1200)) {
                if (TermsConsentCombineDialogV2.m80349a(this.f93307a).mo68999c().f93328c) {
                    C39223a.m79604r().mo68640c();
                    this.f93307a.finish();
                    C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.TERMS_CONSENT);
                } else {
                    new C23144b(this.f93307a).mo37640e(R.string.aqt).mo37637b();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final void mo68989b() {
        if (C39586c.m80369a() != 1) {
            C39578b bVar = this.f93299a;
            if (bVar == null) {
                C89219l.m154710a("contentView");
            }
            if (bVar.mo68999c().f93328c) {
                C39578b bVar2 = this.f93299a;
                if (bVar2 == null) {
                    C89219l.m154710a("contentView");
                }
                TuxButton d = bVar2.mo69000d();
                C39578b bVar3 = this.f93299a;
                if (bVar3 == null) {
                    C89219l.m154710a("contentView");
                }
                d.setTextColor(C0643b.m2378c(bVar3.mo69000d().getContext(), R.color.a9));
                C39578b bVar4 = this.f93299a;
                if (bVar4 == null) {
                    C89219l.m154710a("contentView");
                }
                bVar4.mo69000d().setBackground(C0643b.m2369a(this, (int) R.drawable.a2u));
                C39578b bVar5 = this.f93299a;
                if (bVar5 == null) {
                    C89219l.m154710a("contentView");
                }
                C17235c.m31810a(bVar5.mo69000d(), 0.5f);
                return;
            }
            C39578b bVar6 = this.f93299a;
            if (bVar6 == null) {
                C89219l.m154710a("contentView");
            }
            TuxButton d2 = bVar6.mo69000d();
            C39578b bVar7 = this.f93299a;
            if (bVar7 == null) {
                C89219l.m154710a("contentView");
            }
            d2.setTextColor(C0643b.m2378c(bVar7.mo69000d().getContext(), R.color.bz));
            C39578b bVar8 = this.f93299a;
            if (bVar8 == null) {
                C89219l.m154710a("contentView");
            }
            bVar8.mo69000d().setBackground(C0643b.m2369a(this, (int) R.drawable.a2y));
            C39578b bVar9 = this.f93299a;
            if (bVar9 == null) {
                C89219l.m154710a("contentView");
            }
            C17235c.m31810a(bVar9.mo69000d(), 1.0f);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C39578b m80349a(TermsConsentCombineDialogV2 termsConsentCombineDialogV2) {
        C39578b bVar = termsConsentCombineDialogV2.f93299a;
        if (bVar == null) {
            C89219l.m154710a("contentView");
        }
        return bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialogV2$d */
    static final class C39565d extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ TermsConsentCombineDialogV2 f93303a;

        static {
            Covode.recordClassIndex(47275);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39565d(TermsConsentCombineDialogV2 termsConsentCombineDialogV2) {
            super(1);
            this.f93303a = termsConsentCombineDialogV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            bool.booleanValue();
            this.f93303a.mo68987a();
            this.f93303a.mo68989b();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialogV2$e */
    static final class C39566e extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ TermsConsentCombineDialogV2 f93304a;

        static {
            Covode.recordClassIndex(47276);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39566e(TermsConsentCombineDialogV2 termsConsentCombineDialogV2) {
            super(1);
            this.f93304a = termsConsentCombineDialogV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            bool.booleanValue();
            this.f93304a.mo68987a();
            this.f93304a.mo68989b();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialogV2$b */
    static final class C39563b extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ TermsConsentCombineDialogV2 f93301a;

        static {
            Covode.recordClassIndex(47273);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39563b(TermsConsentCombineDialogV2 termsConsentCombineDialogV2) {
            super(1);
            this.f93301a = termsConsentCombineDialogV2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            TermsConsentCombineDialogV2.m80349a(this.f93301a).mo68997a().mo68996a(booleanValue);
            TermsConsentCombineDialogV2.m80349a(this.f93301a).mo68998b().mo68996a(booleanValue);
            this.f93301a.mo68989b();
            return C89391z.f203057a;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialogV2", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.u8);
        AbstractC0211a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo421c();
        }
        this.f93299a = new C39578b(this);
        mo68989b();
        C39578b bVar = this.f93299a;
        if (bVar == null) {
            C89219l.m154710a("contentView");
        }
        AbstractC39577a c = bVar.mo68999c();
        c.f93326a = new C39563b(this);
        c.f93327b = new C39564c(this);
        C39578b bVar2 = this.f93299a;
        if (bVar2 == null) {
            C89219l.m154710a("contentView");
        }
        bVar2.mo68997a().f93326a = new C39565d(this);
        C39578b bVar3 = this.f93299a;
        if (bVar3 == null) {
            C89219l.m154710a("contentView");
        }
        bVar3.mo68998b().f93326a = new C39566e(this);
        C39578b bVar4 = this.f93299a;
        if (bVar4 == null) {
            C89219l.m154710a("contentView");
        }
        bVar4.f93333e = new C39567f(this);
        C39578b bVar5 = this.f93299a;
        if (bVar5 == null) {
            C89219l.m154710a("contentView");
        }
        bVar5.f93334f = new C39568g(this);
        C39578b bVar6 = this.f93299a;
        if (bVar6 == null) {
            C89219l.m154710a("contentView");
        }
        bVar6.f93335g = new C39569h(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialogV2", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo68988a(String str, String str2) {
        SmartRouter.buildRoute(this, "//webview").withParam("url", str).withParam("title", str2).withParam("skip_consent", TpcConsentServiceImpl.m80302j().mo68639b()).open();
    }
}
