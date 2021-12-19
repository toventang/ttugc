package com.p2082ss.android.ugc.aweme.kids.setting.items.security;

import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.kids.api.account.IKidsAccountService;
import com.p2082ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.security.KidsSecurityActivity */
public final class KidsSecurityActivity extends ActivityC17312a {

    /* renamed from: b */
    public static final C57961a f132137b = new C57961a((byte) 0);

    /* renamed from: a */
    public IKidsAccountService f132138a = KidsAccountServiceImpl.m104406h();

    /* renamed from: c */
    private HashMap f132139c;

    static {
        Covode.recordClassIndex(67986);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f132139c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f132139c == null) {
            this.f132139c = new HashMap();
        }
        View view = (View) this.f132139c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f132139c.put(Integer.valueOf(i), findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.security.KidsSecurityActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.security.KidsSecurityActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.security.KidsSecurityActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.security.KidsSecurityActivity$a */
    public static final class C57961a {
        static {
            Covode.recordClassIndex(67987);
        }

        private C57961a() {
        }

        public /* synthetic */ C57961a(byte b) {
            this();
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

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.security.KidsSecurityActivity$d */
    public static final class C57967d implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ KidsSecurityActivity f132145a;

        static {
            Covode.recordClassIndex(67993);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57967d(KidsSecurityActivity kidsSecurityActivity) {
            this.f132145a = kidsSecurityActivity;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            this.f132145a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.security.KidsSecurityActivity$c */
    static final class C57965c extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C57965c f132143a = new C57965c();

        static {
            Covode.recordClassIndex(67991);
        }

        C57965c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C579661.f132144a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo95297a(boolean z) {
        this.f132138a.mo94316a("allow_one_key_login", z);
        CommonItemView commonItemView = (CommonItemView) _$_findCachedViewById(R.id.dp0);
        C89219l.m154716b(commonItemView, "");
        commonItemView.setChecked(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.security.KidsSecurityActivity$b */
    static final class View$OnClickListenerC57962b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ KidsSecurityActivity f132140a;

        static {
            Covode.recordClassIndex(67988);
        }

        View$OnClickListenerC57962b(KidsSecurityActivity kidsSecurityActivity) {
            this.f132140a = kidsSecurityActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!this.f132140a.f132138a.mo94319c()) {
                this.f132140a.mo95297a(true);
            } else if (this.f132140a.f132138a.mo94320d()) {
                C17197a.C17200a aVar = new C17197a.C17200a(this.f132140a);
                aVar.mo27189a(R.string.fd);
                aVar.f41067M = false;
                aVar.mo27194b(R.string.fa).mo27195b(R.string.fb, (DialogInterface.OnClickListener) DialogInterface$OnClickListenerC579631.f132141a, false).mo27190a(R.string.fc, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
                    /* class com.p2082ss.android.ugc.aweme.kids.setting.items.security.KidsSecurityActivity.View$OnClickListenerC57962b.DialogInterface$OnClickListenerC579642 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC57962b f132142a;

                    static {
                        Covode.recordClassIndex(67990);
                    }

                    {
                        this.f132142a = r1;
                    }

                    public final void onClick(DialogInterface dialogInterface, int i) {
                        this.f132142a.f132140a.mo95297a(false);
                    }
                }, false).mo27193a().mo27185c();
            } else {
                this.f132140a.mo95297a(false);
            }
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.security.KidsSecurityActivity", "onCreate", true);
        activityConfiguration(C57965c.f132143a);
        super.onCreate(bundle);
        setContentView(R.layout.abv);
        boolean c = this.f132138a.mo94319c();
        CommonItemView commonItemView = (CommonItemView) _$_findCachedViewById(R.id.dp0);
        C89219l.m154716b(commonItemView, "");
        commonItemView.setVisibility(0);
        CommonItemView commonItemView2 = (CommonItemView) _$_findCachedViewById(R.id.dp0);
        C89219l.m154716b(commonItemView2, "");
        commonItemView2.setChecked(c);
        ((CommonItemView) _$_findCachedViewById(R.id.dp0)).setOnClickListener(new View$OnClickListenerC57962b(this));
        ((ButtonTitleBar) _$_findCachedViewById(R.id.ejf)).setOnTitleBarClickListener(new C57967d(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.security.KidsSecurityActivity", "onCreate", false);
    }
}
