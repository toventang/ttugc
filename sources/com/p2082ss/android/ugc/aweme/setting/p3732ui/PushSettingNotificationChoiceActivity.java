package com.p2082ss.android.ugc.aweme.setting.p3732ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p1194ui.widget.DmtTextView;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.profile.C63419ae;
import com.p2082ss.android.ugc.aweme.utils.C80428fg;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.setting.ui.PushSettingNotificationChoiceActivity */
public final class PushSettingNotificationChoiceActivity extends ActivityC17312a {

    /* renamed from: a */
    public static final C68494a f153304a = new C68494a((byte) 0);

    /* renamed from: b */
    private ButtonTitleBar f153305b;

    /* renamed from: c */
    private TextView f153306c;

    /* renamed from: d */
    private SparseArray f153307d;

    static {
        Covode.recordClassIndex(80744);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f153307d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f153307d == null) {
            this.f153307d = new SparseArray();
        }
        View view = (View) this.f153307d.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f153307d.put(i, findViewById);
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

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.PushSettingNotificationChoiceActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.PushSettingNotificationChoiceActivity$a */
    public static final class C68494a {
        static {
            Covode.recordClassIndex(80745);
        }

        private C68494a() {
        }

        public /* synthetic */ C68494a(byte b) {
            this();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.PushSettingNotificationChoiceActivity", "onResume", true);
        super.onResume();
        if (!C80428fg.m139432a(this)) {
            finish();
            overridePendingTransition(0, 0);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.PushSettingNotificationChoiceActivity", "onResume", false);
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

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.PushSettingNotificationChoiceActivity$b */
    static final class View$OnClickListenerC68495b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PushSettingNotificationChoiceActivity f153308a;

        static {
            Covode.recordClassIndex(80746);
        }

        View$OnClickListenerC68495b(PushSettingNotificationChoiceActivity pushSettingNotificationChoiceActivity) {
            this.f153308a = pushSettingNotificationChoiceActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f153308a.onBackPressed();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.ui.PushSettingNotificationChoiceActivity$c */
    static final class C68496c extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C68496c f153309a = new C68496c();

        static {
            Covode.recordClassIndex(80747);
        }

        C68496c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C684971.f153310a);
            baseActivityViewModel2.config(C684982.f153311a);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.PushSettingNotificationChoiceActivity", "onCreate", true);
        activityConfiguration(C68496c.f153309a);
        super.onCreate(bundle);
        setContentView(R.layout.axf);
        AbstractC0952i supportFragmentManager = getSupportFragmentManager();
        Fragment a = supportFragmentManager.mo3551a("FRAGMENT_PUSH_MANAGER_LIST");
        if (a == null) {
            a = C63419ae.f143971a.mo101967e();
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("enter_from", m120961a(getIntent(), "enter_from"));
        a.setArguments(bundle2);
        AbstractC0976n a2 = supportFragmentManager.mo3552a();
        C89219l.m154716b(a2, "");
        a2.mo3470b(R.id.b82, a, "FRAGMENT_PUSH_MANAGER_LIST").mo3473c();
        View _$_findCachedViewById = _$_findCachedViewById(R.id.ejf);
        Objects.requireNonNull(_$_findCachedViewById, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar");
        ButtonTitleBar buttonTitleBar = (ButtonTitleBar) _$_findCachedViewById;
        this.f153305b = buttonTitleBar;
        if (buttonTitleBar == null) {
            C89219l.m154710a("mButtonTitleBar");
        }
        DmtTextView titleView = buttonTitleBar.getTitleView();
        C89219l.m154716b(titleView, "");
        this.f153306c = titleView;
        ButtonTitleBar buttonTitleBar2 = this.f153305b;
        if (buttonTitleBar2 == null) {
            C89219l.m154710a("mButtonTitleBar");
        }
        buttonTitleBar2.getStartBtn().setOnClickListener(new View$OnClickListenerC68495b(this));
        TextView textView = this.f153306c;
        if (textView == null) {
            C89219l.m154710a("mTitle");
        }
        textView.setText(getString(R.string.edt));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.setting.ui.PushSettingNotificationChoiceActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m120961a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
