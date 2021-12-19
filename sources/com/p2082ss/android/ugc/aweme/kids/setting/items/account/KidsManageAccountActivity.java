package com.p2082ss.android.ugc.aweme.kids.setting.items.account;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.AbstractC23189c;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.p2082ss.android.ugc.aweme.kids.api.account.AbstractC57152a;
import com.p2082ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.account.KidsManageAccountActivity */
public final class KidsManageAccountActivity extends ActivityC17312a {

    /* renamed from: a */
    public boolean f131858a;

    /* renamed from: b */
    private HashMap f131859b;

    static {
        Covode.recordClassIndex(67823);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f131859b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f131859b == null) {
            this.f131859b = new HashMap();
        }
        View view = (View) this.f131859b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f131859b.put(Integer.valueOf(i), findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.account.KidsManageAccountActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.account.KidsManageAccountActivity$d */
    static final class C57822d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ KidsManageAccountActivity f131863a;

        static {
            Covode.recordClassIndex(67827);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57822d(KidsManageAccountActivity kidsManageAccountActivity) {
            super(0);
            this.f131863a = kidsManageAccountActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f131863a.finish();
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.account.KidsManageAccountActivity", "onResume", true);
        super.onResume();
        KidsAccountServiceImpl.m104406h().mo94314a(new C57819a(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.account.KidsManageAccountActivity", "onResume", false);
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

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.account.KidsManageAccountActivity$a */
    public static final class C57819a implements AbstractC57152a {

        /* renamed from: a */
        final /* synthetic */ KidsManageAccountActivity f131860a;

        static {
            Covode.recordClassIndex(67824);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57819a(KidsManageAccountActivity kidsManageAccountActivity) {
            this.f131860a = kidsManageAccountActivity;
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.api.account.AbstractC57152a
        /* renamed from: a */
        public final void mo94324a(boolean z) {
            this.f131860a.f131858a = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.account.KidsManageAccountActivity$e */
    static final class C57823e extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C57823e f131864a = new C57823e();

        static {
            Covode.recordClassIndex(67828);
        }

        C57823e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C578241.f131865a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.account.KidsManageAccountActivity$b */
    static final class View$OnClickListenerC57820b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ KidsManageAccountActivity f131861a;

        static {
            Covode.recordClassIndex(67825);
        }

        View$OnClickListenerC57820b(KidsManageAccountActivity kidsManageAccountActivity) {
            this.f131861a = kidsManageAccountActivity;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        public final void onClick(android.view.View r6) {
            /*
                r5 = this;
                com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent.onClick(r6)
                com.ss.android.ugc.aweme.kids.setting.items.account.KidsManageAccountActivity r4 = r5.f131861a
                android.os.Bundle r3 = new android.os.Bundle
                r3.<init>()
                boolean r1 = r4.f131858a
                java.lang.String r0 = "have_set_password"
                r3.putBoolean(r0, r1)
                java.lang.String r0 = "enter_password_settings"
                com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57355f.m103960a(r0)
                com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService r2 = com.p2082ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl.m104406h()
                java.lang.String r1 = "manage_my_account"
                java.lang.String r0 = "password_click"
                r2.mo94313a(r4, r1, r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.kids.setting.items.account.KidsManageAccountActivity.View$OnClickListenerC57820b.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.account.KidsManageAccountActivity$c */
    static final class View$OnClickListenerC57821c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ KidsManageAccountActivity f131862a;

        static {
            Covode.recordClassIndex(67826);
        }

        View$OnClickListenerC57821c(KidsManageAccountActivity kidsManageAccountActivity) {
            this.f131862a = kidsManageAccountActivity;
        }

        /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
            java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
            	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            	at java.base/java.util.Objects.checkIndex(Objects.java:359)
            	at java.base/java.util.ArrayList.get(ArrayList.java:427)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.searchCastTypes(MethodInvokeVisitor.java:267)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processOverloaded(MethodInvokeVisitor.java:127)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInvoke(MethodInvokeVisitor.java:102)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.processInsn(MethodInvokeVisitor.java:73)
            	at jadx.core.dex.visitors.MethodInvokeVisitor.visit(MethodInvokeVisitor.java:66)
            */
        public final void onClick(android.view.View r7) {
            /*
                r6 = this;
                com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent.onClick(r7)
                com.ss.android.ugc.aweme.kids.setting.items.account.KidsManageAccountActivity r5 = r6.f131862a
                java.lang.String r0 = "delete_account"
                com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57355f.m103960a(r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r0 = "https://www.tiktok.com/web-inapp/account/delete/confirm_child?hide_nav_bar=1&should_full_screen=1&__status_bar=true&"
                java.lang.StringBuilder r1 = r1.append(r0)
                java.lang.String r0 = "locale="
                java.lang.StringBuilder r1 = r1.append(r0)
                java.lang.String r0 = com.p2082ss.android.ugc.aweme.kids.setting.items.language.p3381d.C57953a.m104733c()
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r4 = r0.toString()
                com.ss.android.ugc.aweme.bullet.api.IBulletService r3 = com.p2082ss.android.ugc.aweme.bullet.impl.BulletService.m71938f()
                android.os.Bundle r2 = new android.os.Bundle
                r2.<init>()
                java.lang.String r0 = "hide_nav_bar"
                r1 = 1
                r2.putBoolean(r0, r1)
                java.lang.String r0 = "hide_status_bar"
                r2.putBoolean(r0, r1)
                java.lang.String r0 = "kids_mode"
                r3.mo61854a(r5, r4, r0, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.kids.setting.items.account.KidsManageAccountActivity.View$OnClickListenerC57821c.onClick(android.view.View):void");
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.account.KidsManageAccountActivity", "onCreate", true);
        activityConfiguration(C57823e.f131864a);
        super.onCreate(bundle);
        setContentView(R.layout.abr);
        C23194g gVar = new C23194g();
        String string = getString(R.string.d0k);
        C89219l.m154716b(string, "");
        ((TuxNavBar) _$_findCachedViewById(R.id.eiz)).mo37725a(gVar.mo37753a(string));
        ((TuxNavBar) _$_findCachedViewById(R.id.eiz)).mo37724a((AbstractC23189c) new C23187b().mo37738a(R.raw.icon_arrow_left_ltr).mo37741a((AbstractC89171a<C89391z>) new C57822d(this)));
        ((TuxNavBar) _$_findCachedViewById(R.id.eiz)).mo37727a(true);
        ((CommonItemView) _$_findCachedViewById(R.id.a3u)).setOnClickListener(new View$OnClickListenerC57820b(this));
        ((TuxTextView) _$_findCachedViewById(R.id.aiy)).setOnClickListener(new View$OnClickListenerC57821c(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.setting.items.account.KidsManageAccountActivity", "onCreate", false);
    }
}
