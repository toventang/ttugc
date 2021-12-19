package com.p2082ss.android.ugc.aweme.compliance.business.policynotice.p2655ui;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.SparseArray;
import android.view.View;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39248i;
import com.p2082ss.android.ugc.aweme.compliance.api.model.C39249j;
import com.p2082ss.android.ugc.aweme.compliance.api.model.PolicyBodyLinkList;
import com.p2082ss.android.ugc.aweme.compliance.business.policynotice.C39456a;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47959j;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.ui.PolicyNoticeFullscreenActivity */
public final class PolicyNoticeFullscreenActivity extends ActivityC17312a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public C39248i f93137a;

    /* renamed from: b */
    private SparseArray f93138b;

    static {
        Covode.recordClassIndex(47162);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f93138b;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f93138b == null) {
            this.f93138b = new SparseArray();
        }
        View view = (View) this.f93138b.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f93138b.put(i, findViewById);
        return findViewById;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(58, new RunnableC90250g(PolicyNoticeFullscreenActivity.class, "onJsBroadCastEvent", C47959j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.policynotice.ui.PolicyNoticeFullscreenActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.policynotice.ui.PolicyNoticeFullscreenActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.policynotice.ui.PolicyNoticeFullscreenActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.ui.PolicyNoticeFullscreenActivity$b */
    static final class C39472b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ PolicyNoticeFullscreenActivity f93140a;

        static {
            Covode.recordClassIndex(47164);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39472b(PolicyNoticeFullscreenActivity policyNoticeFullscreenActivity) {
            super(0);
            this.f93140a = policyNoticeFullscreenActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f93140a.finish();
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        EventBus.m156962a().mo145395b(this);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
        Boolean bool;
        C39248i iVar = this.f93137a;
        if (iVar != null) {
            bool = iVar.isSubPopUp();
        } else {
            bool = null;
        }
        if (C89219l.m154714a((Object) bool, (Object) true)) {
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

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.ui.PolicyNoticeFullscreenActivity$c */
    public static final class C39473c implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ PolicyNoticeFullscreenActivity f93141a;

        static {
            Covode.recordClassIndex(47165);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C39473c(PolicyNoticeFullscreenActivity policyNoticeFullscreenActivity) {
            this.f93141a = policyNoticeFullscreenActivity;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            this.f93141a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.ui.PolicyNoticeFullscreenActivity$a */
    static final class C39471a extends AbstractC89220m implements AbstractC89172b<C39249j, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PolicyNoticeFullscreenActivity f93139a;

        static {
            Covode.recordClassIndex(47163);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39471a(PolicyNoticeFullscreenActivity policyNoticeFullscreenActivity) {
            super(1);
            this.f93139a = policyNoticeFullscreenActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C39249j jVar) {
            C39249j jVar2 = jVar;
            C89219l.m154721d(jVar2, "");
            this.f93139a.mo68923a(jVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.ui.PolicyNoticeFullscreenActivity$d */
    static final class C39474d extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C39474d f93142a = new C39474d();

        static {
            Covode.recordClassIndex(47166);
        }

        C39474d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C394751.f93143a);
            baseActivityViewModel2.config(C394762.f93144a);
            return C89391z.f203057a;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MethodInvokeVisitor
        java.lang.IndexOutOfBoundsException: Index 2 out of bounds for length 2
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
    /* renamed from: a */
    public final void mo68923a(com.p2082ss.android.ugc.aweme.compliance.api.model.C39249j r2) {
        /*
            r1 = this;
            com.ss.android.ugc.aweme.compliance.api.model.i r0 = r1.f93137a
            com.p2082ss.android.ugc.aweme.compliance.business.policynotice.C39456a.m80153a(r0, r2)
            com.p2082ss.android.ugc.aweme.compliance.business.policynotice.C39456a.m80159b()
            r1.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.compliance.business.policynotice.p2655ui.PolicyNoticeFullscreenActivity.mo68923a(com.ss.android.ugc.aweme.compliance.api.model.j):void");
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C47959j jVar) {
        C89219l.m154721d(jVar, "");
        if (TextUtils.equals(jVar.f111077b.optString("eventName"), "cancel_post_success")) {
            finish();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.compliance.business.policynotice.ui.PolicyNoticeFullscreenActivity$e */
    public static final class View$OnClickListenerC39477e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PolicyNoticeFullscreenActivity f93145a;

        /* renamed from: b */
        final /* synthetic */ C39249j f93146b;

        static {
            Covode.recordClassIndex(47169);
        }

        View$OnClickListenerC39477e(PolicyNoticeFullscreenActivity policyNoticeFullscreenActivity, C39249j jVar) {
            this.f93145a = policyNoticeFullscreenActivity;
            this.f93146b = jVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39456a.m80155a(this.f93146b, this.f93145a, new AbstractC89172b<C39249j, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.compliance.business.policynotice.p2655ui.PolicyNoticeFullscreenActivity.View$OnClickListenerC39477e.C394781 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC39477e f93147a;

                static {
                    Covode.recordClassIndex(47170);
                }

                {
                    this.f93147a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C39249j jVar) {
                    C39249j jVar2 = jVar;
                    C89219l.m154721d(jVar2, "");
                    this.f93147a.f93145a.mo68923a(jVar2);
                    return C89391z.f203057a;
                }
            }, new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.compliance.business.policynotice.p2655ui.PolicyNoticeFullscreenActivity.View$OnClickListenerC39477e.C394792 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC39477e f93148a;

                static {
                    Covode.recordClassIndex(47171);
                }

                {
                    this.f93148a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    this.f93148a.f93145a.finish();
                    return C89391z.f203057a;
                }
            });
            String str = this.f93146b.f92716a;
            C39248i iVar = this.f93145a.f93137a;
            if (iVar == null) {
                C89219l.m154715b();
            }
            String business = iVar.getBusiness();
            C39248i iVar2 = this.f93145a.f93137a;
            if (iVar2 == null) {
                C89219l.m154715b();
            }
            C39456a.m80158a(str, business, iVar2.getStyle());
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.policynotice.ui.PolicyNoticeFullscreenActivity", "onCreate", true);
        activityConfiguration(C39474d.f93142a);
        super.onCreate(bundle);
        setContentView(R.layout.u2);
        this.f93137a = C39456a.f93108d;
        List<PolicyBodyLinkList> list = null;
        C39456a.f93108d = null;
        C39248i iVar = this.f93137a;
        if (iVar != null) {
            if (C89219l.m154714a((Object) iVar.isSubPopUp(), (Object) true)) {
                ButtonTitleBar buttonTitleBar = (ButtonTitleBar) _$_findCachedViewById(R.id.eiz);
                C89219l.m154716b(buttonTitleBar, "");
                buttonTitleBar.setVisibility(0);
                ((ButtonTitleBar) _$_findCachedViewById(R.id.eiz)).setOnTitleBarClickListener(new C39473c(this));
            } else {
                ButtonTitleBar buttonTitleBar2 = (ButtonTitleBar) _$_findCachedViewById(R.id.eiz);
                C89219l.m154716b(buttonTitleBar2, "");
                buttonTitleBar2.setVisibility(4);
            }
            TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.d3o);
            C39248i iVar2 = this.f93137a;
            if (iVar2 != null) {
                str = iVar2.getTitle();
            } else {
                str = null;
            }
            tuxTextView.setText(str);
            tuxTextView.setTuxFont(23);
            TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.acq);
            Context context = tuxTextView2.getContext();
            C89219l.m154716b(context, "");
            C39248i iVar3 = this.f93137a;
            if (iVar3 != null) {
                str2 = iVar3.getBody();
            } else {
                str2 = null;
            }
            C39248i iVar4 = this.f93137a;
            if (iVar4 != null) {
                list = iVar4.getPolicyLinkList();
            }
            tuxTextView2.setText(C39456a.m80150a(context, str2, list, new C39471a(this), new C39472b(this)));
            tuxTextView2.setHighlightColor(C0643b.m2378c(tuxTextView2.getContext(), R.color.c9));
            tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
            C39248i iVar5 = this.f93137a;
            if (iVar5 == null) {
                C89219l.m154715b();
            }
            String business = iVar5.getBusiness();
            C39248i iVar6 = this.f93137a;
            if (iVar6 == null) {
                C89219l.m154715b();
            }
            C39456a.m80157a(business, iVar6.getStyle());
            TuxTextView tuxTextView3 = (TuxTextView) _$_findCachedViewById(R.id.zz);
            tuxTextView3.setTuxFont(43);
            C39248i iVar7 = this.f93137a;
            if (iVar7 == null) {
                C89219l.m154715b();
            }
            m80164a(tuxTextView3, iVar7.getActions().get(0));
            C39248i iVar8 = this.f93137a;
            if (iVar8 == null) {
                C89219l.m154715b();
            }
            if (iVar8.getActions().size() > 1) {
                TuxTextView tuxTextView4 = (TuxTextView) _$_findCachedViewById(R.id.a00);
                tuxTextView4.setVisibility(0);
                C39248i iVar9 = this.f93137a;
                if (iVar9 == null) {
                    C89219l.m154715b();
                }
                m80164a(tuxTextView4, iVar9.getActions().get(1));
            } else {
                TuxTextView tuxTextView5 = (TuxTextView) _$_findCachedViewById(R.id.a00);
                C89219l.m154716b(tuxTextView5, "");
                tuxTextView5.setVisibility(8);
            }
            EventBus.m156966a(EventBus.m156962a(), this);
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.policynotice.ui.PolicyNoticeFullscreenActivity", "onCreate", false);
            return;
        }
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.compliance.business.policynotice.ui.PolicyNoticeFullscreenActivity", "onCreate", false);
    }

    /* renamed from: a */
    private final void m80164a(TuxTextView tuxTextView, C39249j jVar) {
        if (tuxTextView != null) {
            tuxTextView.setText(jVar.f92716a);
            tuxTextView.setOnClickListener(new View$OnClickListenerC39477e(this, jVar));
        }
    }
}
