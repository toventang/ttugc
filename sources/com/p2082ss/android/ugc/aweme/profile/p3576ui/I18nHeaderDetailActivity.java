package com.p2082ss.android.ugc.aweme.profile.p3576ui;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.uikit.dialog.DialogC18267b;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.p2082ss.android.ugc.aweme.i18n.musically.cut.C53484j;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.I18nHeaderDetailActivity */
public final class I18nHeaderDetailActivity extends HeaderDetailActivity {

    /* renamed from: r */
    public boolean f145001r;

    /* renamed from: s */
    private SparseArray f145002s;

    static {
        Covode.recordClassIndex(75373);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f145002s;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f145002s == null) {
            this.f145002s = new SparseArray();
        }
        View view = (View) this.f145002s.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f145002s.put(i, findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.HeaderDetailActivity
    /* renamed from: c */
    public final boolean mo103494c() {
        return true;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.profile.p3576ui.HeaderDetailActivity
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.profile.p3576ui.HeaderDetailActivity
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.profile.p3576ui.HeaderDetailActivity
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.I18nHeaderDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.I18nHeaderDetailActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.profile.p3576ui.HeaderDetailActivity
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.profile.p3576ui.HeaderDetailActivity
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.I18nHeaderDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.HeaderDetailActivity
    /* renamed from: d */
    public final void mo103495d() {
        super.mo103495d();
        this.f145001r = getIntent().getBooleanExtra("handle_with_video_avatar", false);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.HeaderDetailActivity
    /* renamed from: b */
    public final void mo103493b() {
        if (this.f145001r) {
            new DialogC18267b.C18268a(this).mo29155a(getResources().getStringArray(R.array.ae), new DialogInterface$OnClickListenerC63939a(this)).mo29157b().show();
        } else {
            super.mo103496e();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.profile.p3576ui.HeaderDetailActivity
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

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.I18nHeaderDetailActivity$b */
    static final class C63940b implements C53484j.AbstractC53488a {

        /* renamed from: a */
        final /* synthetic */ I18nHeaderDetailActivity f145004a;

        static {
            Covode.recordClassIndex(75375);
        }

        C63940b(I18nHeaderDetailActivity i18nHeaderDetailActivity) {
            this.f145004a = i18nHeaderDetailActivity;
        }

        @Override // com.p2082ss.android.ugc.aweme.i18n.musically.cut.C53484j.AbstractC53488a
        /* renamed from: a */
        public final void mo90080a(String str) {
            this.f145004a.mo103507a(str);
        }
    }

    /* renamed from: a */
    public final void mo103507a(String str) {
        try {
            Uri parse = Uri.parse("file://".concat(String.valueOf(str)));
            if (parse != null) {
                C24428k.m46551a().mo40247e().mo40228a(parse);
                mo103492a(this.f144969c, false, parse.toString());
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.profile.p3576ui.HeaderDetailActivity, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.I18nHeaderDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.b43);
        if (frameLayout != null) {
            frameLayout.setBackgroundColor(C0643b.m2378c(this, R.color.a3));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.profile.ui.I18nHeaderDetailActivity", "onCreate", false);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.I18nHeaderDetailActivity$a */
    static final class DialogInterface$OnClickListenerC63939a implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ I18nHeaderDetailActivity f145003a;

        static {
            Covode.recordClassIndex(75374);
        }

        DialogInterface$OnClickListenerC63939a(I18nHeaderDetailActivity i18nHeaderDetailActivity) {
            this.f145003a = i18nHeaderDetailActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            if (i == 0) {
                I18nHeaderDetailActivity i18nHeaderDetailActivity = this.f145003a;
                new C53484j().mo90076a(i18nHeaderDetailActivity, new C63940b(i18nHeaderDetailActivity));
            }
        }
    }
}
