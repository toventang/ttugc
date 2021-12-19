package com.p2082ss.android.ugc.aweme.compliance.business.termspp;

import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AbstractC0211a;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.C17205a;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17235c;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.business.policynotice.p2654a.C39465a;
import com.p2082ss.android.ugc.aweme.compliance.business.serviceimpl.TpcConsentServiceImpl;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialog */
public final class TermsConsentCombineDialog extends ActivityC17312a {

    /* renamed from: d */
    public static final C39552a f93284d = new C39552a((byte) 0);

    /* renamed from: a */
    public int f93285a = 1;

    /* renamed from: b */
    public boolean f93286b;

    /* renamed from: c */
    public boolean f93287c;

    /* renamed from: e */
    private SparseArray f93288e;

    static {
        Covode.recordClassIndex(47260);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f93288e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f93288e == null) {
            this.f93288e = new SparseArray();
        }
        View view = (View) this.f93288e.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f93288e.put(i, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialog", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialog", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialog", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialog$a */
    public static final class C39552a {
        static {
            Covode.recordClassIndex(47261);
        }

        private C39552a() {
        }

        public /* synthetic */ C39552a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    public final void mo68977b() {
        finish();
        C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.TERMS_CONSENT);
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

    /* renamed from: c */
    public final void mo68978c() {
        if (this.f93286b) {
            TuxButton tuxButton = (TuxButton) _$_findCachedViewById(R.id.xd);
            C89219l.m154716b(tuxButton, "");
            ((TuxButton) _$_findCachedViewById(R.id.xd)).setTextColor(C0643b.m2378c(tuxButton.getContext(), R.color.a9));
            TuxButton tuxButton2 = (TuxButton) _$_findCachedViewById(R.id.xd);
            C89219l.m154716b(tuxButton2, "");
            tuxButton2.setBackground(C0643b.m2369a(this, (int) R.drawable.a2u));
            C17235c.m31810a(_$_findCachedViewById(R.id.xd), 0.5f);
            return;
        }
        TuxButton tuxButton3 = (TuxButton) _$_findCachedViewById(R.id.xd);
        C89219l.m154716b(tuxButton3, "");
        ((TuxButton) _$_findCachedViewById(R.id.xd)).setTextColor(C0643b.m2378c(tuxButton3.getContext(), R.color.bz));
        TuxButton tuxButton4 = (TuxButton) _$_findCachedViewById(R.id.xd);
        C89219l.m154716b(tuxButton4, "");
        tuxButton4.setBackground(C0643b.m2369a(this, (int) R.drawable.a2y));
        C17235c.m31810a(_$_findCachedViewById(R.id.xd), 1.0f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: androidx.appcompat.widget.AppCompatCheckBox[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: com.bytedance.tux.input.TuxCheckBox */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void mo68976a() {
        boolean z;
        boolean z2;
        AppCompatCheckBox[] appCompatCheckBoxArr = {_$_findCachedViewById(R.id.a2m), _$_findCachedViewById(R.id.a2k)};
        ArrayList<AppCompatCheckBox> arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            TuxCheckBox tuxCheckBox = appCompatCheckBoxArr[i];
            C89219l.m154716b(tuxCheckBox, "");
            if (tuxCheckBox.getVisibility() == 0) {
                arrayList.add(tuxCheckBox);
            }
        }
        for (AppCompatCheckBox appCompatCheckBox : arrayList) {
            RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(R.id.d_t);
            C89219l.m154716b(relativeLayout, "");
            if (relativeLayout.getVisibility() == 0) {
                C89219l.m154716b(appCompatCheckBox, "");
                AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) _$_findCachedViewById(R.id.a29);
                C89219l.m154716b(appCompatCheckBox2, "");
                if (appCompatCheckBox2.isChecked()) {
                    AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) _$_findCachedViewById(R.id.a27);
                    C89219l.m154716b(appCompatCheckBox3, "");
                    if (appCompatCheckBox3.isChecked()) {
                        AppCompatCheckBox appCompatCheckBox4 = (AppCompatCheckBox) _$_findCachedViewById(R.id.a2i);
                        C89219l.m154716b(appCompatCheckBox4, "");
                        if (appCompatCheckBox4.isChecked()) {
                            z2 = true;
                            appCompatCheckBox.setChecked(z2);
                        }
                    }
                }
                z2 = false;
                appCompatCheckBox.setChecked(z2);
            } else {
                C89219l.m154716b(appCompatCheckBox, "");
                AppCompatCheckBox appCompatCheckBox5 = (AppCompatCheckBox) _$_findCachedViewById(R.id.a29);
                C89219l.m154716b(appCompatCheckBox5, "");
                if (appCompatCheckBox5.isChecked()) {
                    AppCompatCheckBox appCompatCheckBox6 = (AppCompatCheckBox) _$_findCachedViewById(R.id.a27);
                    C89219l.m154716b(appCompatCheckBox6, "");
                    if (appCompatCheckBox6.isChecked()) {
                        z = true;
                        appCompatCheckBox.setChecked(z);
                    }
                }
                z = false;
                appCompatCheckBox.setChecked(z);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialog$c */
    static final class View$OnClickListenerC39554c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AppCompatCheckBox f93290a;

        static {
            Covode.recordClassIndex(47263);
        }

        View$OnClickListenerC39554c(AppCompatCheckBox appCompatCheckBox) {
            this.f93290a = appCompatCheckBox;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AppCompatCheckBox appCompatCheckBox = this.f93290a;
            C89219l.m154716b(appCompatCheckBox, "");
            if (appCompatCheckBox.isChecked()) {
                C39162r.m79460a("click_agree_to_all", new C33744d().f79943a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialog$g */
    static final class View$OnClickListenerC39558g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TermsConsentCombineDialog f93294a;

        static {
            Covode.recordClassIndex(47267);
        }

        View$OnClickListenerC39558g(TermsConsentCombineDialog termsConsentCombineDialog) {
            this.f93294a = termsConsentCombineDialog;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            if (TpcConsentServiceImpl.m80302j().mo68639b()) {
                str = "https://www.tiktok.com/legal/terms-of-service?lang=ko-KR";
            } else {
                str = "https://www.tiktok.com/legal/terms-of-service?lang=ko";
            }
            SmartRouter.buildRoute(this.f93294a, "//webview").withParam("url", str).withParam("title", this.f93294a.getString(R.string.aqs)).withParam("skip_consent", TpcConsentServiceImpl.m80302j().mo68639b()).open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialog$h */
    static final class View$OnClickListenerC39559h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TermsConsentCombineDialog f93295a;

        static {
            Covode.recordClassIndex(47268);
        }

        View$OnClickListenerC39559h(TermsConsentCombineDialog termsConsentCombineDialog) {
            this.f93295a = termsConsentCombineDialog;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            if (TpcConsentServiceImpl.m80302j().mo68639b()) {
                str = "https://www.tiktok.com/legal/privacy-policy?lang=ko-KR";
            } else {
                str = "https://www.tiktok.com/legal/privacy-policy?lang=ko";
            }
            SmartRouter.buildRoute(this.f93295a, "//webview").withParam("url", str).withParam("title", this.f93295a.getString(R.string.aqr)).withParam("skip_consent", TpcConsentServiceImpl.m80302j().mo68639b()).open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialog$i */
    static final class View$OnClickListenerC39560i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TermsConsentCombineDialog f93296a;

        static {
            Covode.recordClassIndex(47269);
        }

        View$OnClickListenerC39560i(TermsConsentCombineDialog termsConsentCombineDialog) {
            this.f93296a = termsConsentCombineDialog;
        }

        public final void onClick(View view) {
            int i;
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                if (this.f93296a.f93286b) {
                    C39223a.m79604r().mo68640c();
                    if (this.f93296a.f93285a != 3) {
                        C39465a aVar = new C39465a();
                        if (this.f93296a.f93287c) {
                            i = 2;
                        } else {
                            i = 1;
                        }
                        aVar.mo68919a("kr_market_ms_d", "v20200906", "pop", null, Integer.valueOf(i), 0, new AbstractC89171a<C89391z>(this) {
                            /* class com.p2082ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialog.View$OnClickListenerC39560i.C395611 */

                            /* renamed from: a */
                            final /* synthetic */ View$OnClickListenerC39560i f93297a;

                            static {
                                Covode.recordClassIndex(47270);
                            }

                            {
                                this.f93297a = r2;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            @Override // p4600h.p4611f.p4612a.AbstractC89171a
                            public final /* synthetic */ C89391z invoke() {
                                this.f93297a.f93296a.mo68977b();
                                return C89391z.f203057a;
                            }
                        });
                        return;
                    }
                    this.f93296a.mo68977b();
                    return;
                }
                new C23144b(this.f93296a).mo37640e(R.string.aqt).mo37637b();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: androidx.appcompat.widget.AppCompatCheckBox[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.bytedance.tux.input.TuxCheckBox */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialog", "onCreate", true);
        super.onCreate(bundle);
        setContentView(R.layout.u7);
        AbstractC0211a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo421c();
        }
        this.f93285a = getIntent().getIntExtra("style", 1);
        mo68978c();
        int i = this.f93285a;
        if (i == 2) {
            RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(R.id.du4);
            C89219l.m154716b(relativeLayout, "");
            relativeLayout.setVisibility(8);
        } else if (i != 3) {
            RelativeLayout relativeLayout2 = (RelativeLayout) _$_findCachedViewById(R.id.du3);
            C89219l.m154716b(relativeLayout2, "");
            relativeLayout2.setVisibility(8);
        } else {
            RelativeLayout relativeLayout3 = (RelativeLayout) _$_findCachedViewById(R.id.du3);
            C89219l.m154716b(relativeLayout3, "");
            relativeLayout3.setVisibility(8);
            RelativeLayout relativeLayout4 = (RelativeLayout) _$_findCachedViewById(R.id.d_t);
            C89219l.m154716b(relativeLayout4, "");
            relativeLayout4.setVisibility(8);
        }
        AppCompatCheckBox[] appCompatCheckBoxArr = {_$_findCachedViewById(R.id.a2m), _$_findCachedViewById(R.id.a2k)};
        int i2 = 0;
        do {
            TuxCheckBox tuxCheckBox = appCompatCheckBoxArr[i2];
            tuxCheckBox.setOnCheckedChangeListener(new C39553b(this));
            tuxCheckBox.setOnClickListener(new View$OnClickListenerC39554c(tuxCheckBox));
            i2++;
        } while (i2 < 2);
        ((AppCompatCheckBox) _$_findCachedViewById(R.id.a29)).setOnCheckedChangeListener(new C39555d(this));
        ((AppCompatCheckBox) _$_findCachedViewById(R.id.a27)).setOnCheckedChangeListener(new C39556e(this));
        ((AppCompatCheckBox) _$_findCachedViewById(R.id.a2i)).setOnCheckedChangeListener(new C39557f(this));
        ((RelativeLayout) _$_findCachedViewById(R.id.efl)).setOnClickListener(new View$OnClickListenerC39558g(this));
        ((RelativeLayout) _$_findCachedViewById(R.id.d6i)).setOnClickListener(new View$OnClickListenerC39559h(this));
        ((TuxButton) _$_findCachedViewById(R.id.xd)).setOnClickListener(new View$OnClickListenerC39560i(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialog", "onCreate", false);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialog$b */
    static final class C39553b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ TermsConsentCombineDialog f93289a;

        static {
            Covode.recordClassIndex(47262);
        }

        C39553b(TermsConsentCombineDialog termsConsentCombineDialog) {
            this.f93289a = termsConsentCombineDialog;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean z2;
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) this.f93289a._$_findCachedViewById(R.id.a29);
            C89219l.m154716b(appCompatCheckBox, "");
            appCompatCheckBox.setChecked(z);
            AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) this.f93289a._$_findCachedViewById(R.id.a27);
            C89219l.m154716b(appCompatCheckBox2, "");
            appCompatCheckBox2.setChecked(z);
            AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) this.f93289a._$_findCachedViewById(R.id.a2i);
            C89219l.m154716b(appCompatCheckBox3, "");
            appCompatCheckBox3.setChecked(z);
            TermsConsentCombineDialog termsConsentCombineDialog = this.f93289a;
            AppCompatCheckBox appCompatCheckBox4 = (AppCompatCheckBox) termsConsentCombineDialog._$_findCachedViewById(R.id.a29);
            C89219l.m154716b(appCompatCheckBox4, "");
            if (appCompatCheckBox4.isChecked()) {
                AppCompatCheckBox appCompatCheckBox5 = (AppCompatCheckBox) this.f93289a._$_findCachedViewById(R.id.a27);
                C89219l.m154716b(appCompatCheckBox5, "");
                if (appCompatCheckBox5.isChecked()) {
                    z2 = true;
                    termsConsentCombineDialog.f93286b = z2;
                    this.f93289a.mo68978c();
                }
            }
            z2 = false;
            termsConsentCombineDialog.f93286b = z2;
            this.f93289a.mo68978c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialog$d */
    static final class C39555d implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ TermsConsentCombineDialog f93291a;

        static {
            Covode.recordClassIndex(47264);
        }

        C39555d(TermsConsentCombineDialog termsConsentCombineDialog) {
            this.f93291a = termsConsentCombineDialog;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean z2;
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) this.f93291a._$_findCachedViewById(R.id.a27);
            C89219l.m154716b(appCompatCheckBox, "");
            boolean isChecked = appCompatCheckBox.isChecked();
            AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) this.f93291a._$_findCachedViewById(R.id.a2i);
            C89219l.m154716b(appCompatCheckBox2, "");
            boolean isChecked2 = appCompatCheckBox2.isChecked();
            this.f93291a.mo68976a();
            AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) this.f93291a._$_findCachedViewById(R.id.a27);
            C89219l.m154716b(appCompatCheckBox3, "");
            appCompatCheckBox3.setChecked(isChecked);
            AppCompatCheckBox appCompatCheckBox4 = (AppCompatCheckBox) this.f93291a._$_findCachedViewById(R.id.a2i);
            C89219l.m154716b(appCompatCheckBox4, "");
            appCompatCheckBox4.setChecked(isChecked2);
            TermsConsentCombineDialog termsConsentCombineDialog = this.f93291a;
            if (z) {
                AppCompatCheckBox appCompatCheckBox5 = (AppCompatCheckBox) termsConsentCombineDialog._$_findCachedViewById(R.id.a27);
                C89219l.m154716b(appCompatCheckBox5, "");
                if (appCompatCheckBox5.isChecked()) {
                    z2 = true;
                    termsConsentCombineDialog.f93286b = z2;
                    this.f93291a.mo68978c();
                }
            }
            z2 = false;
            termsConsentCombineDialog.f93286b = z2;
            this.f93291a.mo68978c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialog$e */
    static final class C39556e implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ TermsConsentCombineDialog f93292a;

        static {
            Covode.recordClassIndex(47265);
        }

        C39556e(TermsConsentCombineDialog termsConsentCombineDialog) {
            this.f93292a = termsConsentCombineDialog;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean z2;
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) this.f93292a._$_findCachedViewById(R.id.a29);
            C89219l.m154716b(appCompatCheckBox, "");
            boolean isChecked = appCompatCheckBox.isChecked();
            AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) this.f93292a._$_findCachedViewById(R.id.a2i);
            C89219l.m154716b(appCompatCheckBox2, "");
            boolean isChecked2 = appCompatCheckBox2.isChecked();
            this.f93292a.mo68976a();
            AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) this.f93292a._$_findCachedViewById(R.id.a29);
            C89219l.m154716b(appCompatCheckBox3, "");
            appCompatCheckBox3.setChecked(isChecked);
            AppCompatCheckBox appCompatCheckBox4 = (AppCompatCheckBox) this.f93292a._$_findCachedViewById(R.id.a2i);
            C89219l.m154716b(appCompatCheckBox4, "");
            appCompatCheckBox4.setChecked(isChecked2);
            TermsConsentCombineDialog termsConsentCombineDialog = this.f93292a;
            if (z) {
                AppCompatCheckBox appCompatCheckBox5 = (AppCompatCheckBox) termsConsentCombineDialog._$_findCachedViewById(R.id.a29);
                C89219l.m154716b(appCompatCheckBox5, "");
                if (appCompatCheckBox5.isChecked()) {
                    z2 = true;
                    termsConsentCombineDialog.f93286b = z2;
                    this.f93292a.mo68978c();
                }
            }
            z2 = false;
            termsConsentCombineDialog.f93286b = z2;
            this.f93292a.mo68978c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.termspp.TermsConsentCombineDialog$f */
    static final class C39557f implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ TermsConsentCombineDialog f93293a;

        static {
            Covode.recordClassIndex(47266);
        }

        C39557f(TermsConsentCombineDialog termsConsentCombineDialog) {
            this.f93293a = termsConsentCombineDialog;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) this.f93293a._$_findCachedViewById(R.id.a29);
            C89219l.m154716b(appCompatCheckBox, "");
            boolean isChecked = appCompatCheckBox.isChecked();
            AppCompatCheckBox appCompatCheckBox2 = (AppCompatCheckBox) this.f93293a._$_findCachedViewById(R.id.a27);
            C89219l.m154716b(appCompatCheckBox2, "");
            boolean isChecked2 = appCompatCheckBox2.isChecked();
            this.f93293a.mo68976a();
            AppCompatCheckBox appCompatCheckBox3 = (AppCompatCheckBox) this.f93293a._$_findCachedViewById(R.id.a29);
            C89219l.m154716b(appCompatCheckBox3, "");
            appCompatCheckBox3.setChecked(isChecked);
            AppCompatCheckBox appCompatCheckBox4 = (AppCompatCheckBox) this.f93293a._$_findCachedViewById(R.id.a27);
            C89219l.m154716b(appCompatCheckBox4, "");
            appCompatCheckBox4.setChecked(isChecked2);
            this.f93293a.f93287c = z;
        }
    }
}
