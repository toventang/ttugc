package com.p2082ss.android.ugc.aweme.notification;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.EnumC20767w;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.button.TuxButton;
import com.p2082ss.android.ugc.aweme.setting.services.ITranslatedCaptionService;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.ugc.trill.setting.TranslatedCaptionCacheServiceImpl;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.TranslationOnboardActivity */
public final class TranslationOnboardActivity extends ActivityC17312a {

    /* renamed from: a */
    private final AbstractC89244h f140135a = C89250i.m154773a((AbstractC89171a) new C61754d(this));

    /* renamed from: b */
    private final AbstractC89244h f140136b = C89250i.m154773a((AbstractC89171a) new C61750b(this));

    /* renamed from: c */
    private SparseArray f140137c;

    static {
        Covode.recordClassIndex(72481);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f140137c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f140137c == null) {
            this.f140137c = new SparseArray();
        }
        View view = (View) this.f140137c.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f140137c.put(i, findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.TranslationOnboardActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.TranslationOnboardActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.TranslationOnboardActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.TranslationOnboardActivity$b */
    static final class C61750b extends AbstractC89220m implements AbstractC89171a<TuxButton> {

        /* renamed from: a */
        final /* synthetic */ TranslationOnboardActivity f140139a;

        static {
            Covode.recordClassIndex(72483);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61750b(TranslationOnboardActivity translationOnboardActivity) {
            super(0);
            this.f140139a = translationOnboardActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxButton invoke() {
            return this.f140139a.findViewById(R.id.cw2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.TranslationOnboardActivity$d */
    static final class C61754d extends AbstractC89220m implements AbstractC89171a<SmartImageView> {

        /* renamed from: a */
        final /* synthetic */ TranslationOnboardActivity f140143a;

        static {
            Covode.recordClassIndex(72487);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C61754d(TranslationOnboardActivity translationOnboardActivity) {
            super(0);
            this.f140143a = translationOnboardActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SmartImageView invoke() {
            return this.f140143a.findViewById(R.id.cw3);
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

    /* renamed from: com.ss.android.ugc.aweme.notification.TranslationOnboardActivity$c */
    static final class C61751c extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C61751c f140140a = new C61751c();

        static {
            Covode.recordClassIndex(72484);
        }

        C61751c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C617521.f140141a);
            baseActivityViewModel2.config(C617532.f140142a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.TranslationOnboardActivity$a */
    static final class View$OnClickListenerC61749a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TranslationOnboardActivity f140138a;

        static {
            Covode.recordClassIndex(72482);
        }

        View$OnClickListenerC61749a(TranslationOnboardActivity translationOnboardActivity) {
            this.f140138a = translationOnboardActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f140138a, "//aweme/detail").withParam("id", m111781a(this.f140138a.getIntent(), "aweme_id")).open();
            this.f140138a.finish();
        }

        /* renamed from: a */
        private static String m111781a(Intent intent, String str) {
            try {
                return intent.getStringExtra(str);
            } catch (Exception unused) {
                return null;
            }
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.TranslationOnboardActivity", "onCreate", true);
        activityConfiguration(C61751c.f140140a);
        super.onCreate(bundle);
        ITranslatedCaptionService j = TranslatedCaptionCacheServiceImpl.m146355j();
        if (j.mo108898h()) {
            SmartRouter.buildRoute(this, "//aweme/detail").withParam("id", m111780a(getIntent(), "aweme_id")).open();
            finish();
        } else {
            j.mo108899i();
            setContentView(R.layout.k2);
            C20766v a = C20761r.m39061a(C61755a.m111782a());
            a.f49092E = (SmartImageView) this.f140135a.getValue();
            a.f49125v = EnumC20767w.CENTER_INSIDE;
            a.mo34186c();
            ((TuxButton) this.f140136b.getValue()).setOnClickListener(new View$OnClickListenerC61749a(this));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.notification.TranslationOnboardActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m111780a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
