package com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.p3359ui;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
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
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.C57646a;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.p3357c.C57656a;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.response.C57663a;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.response.C57664b;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.response.PolicyBodyLinkList;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.PolicyNoticeActivity */
public final class PolicyNoticeActivity extends ActivityC17312a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public C57663a f131620a;

    /* renamed from: b */
    private HashMap f131621b;

    static {
        Covode.recordClassIndex(67633);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f131621b;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f131621b == null) {
            this.f131621b = new HashMap();
        }
        View view = (View) this.f131621b.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f131621b.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(83, new RunnableC90250g(PolicyNoticeActivity.class, "onJsBroadCastEvent", C57656a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.PolicyNoticeActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.PolicyNoticeActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.PolicyNoticeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.PolicyNoticeActivity$b */
    static final class C57667b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ PolicyNoticeActivity f131623a;

        static {
            Covode.recordClassIndex(67635);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57667b(PolicyNoticeActivity policyNoticeActivity) {
            super(0);
            this.f131623a = policyNoticeActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f131623a.finish();
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
        Boolean bool;
        C57663a aVar = this.f131620a;
        if (aVar != null) {
            bool = aVar.isSubPopUp();
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

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.PolicyNoticeActivity$c */
    public static final class C57668c implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ PolicyNoticeActivity f131624a;

        static {
            Covode.recordClassIndex(67636);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57668c(PolicyNoticeActivity policyNoticeActivity) {
            this.f131624a = policyNoticeActivity;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            this.f131624a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.PolicyNoticeActivity$a */
    static final class C57666a extends AbstractC89220m implements AbstractC89172b<C57664b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ PolicyNoticeActivity f131622a;

        static {
            Covode.recordClassIndex(67634);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57666a(PolicyNoticeActivity policyNoticeActivity) {
            super(1);
            this.f131622a = policyNoticeActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C57664b bVar) {
            C57664b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            this.f131622a.mo95003a(bVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.PolicyNoticeActivity$d */
    static final class C57669d extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C57669d f131625a = new C57669d();

        static {
            Covode.recordClassIndex(67637);
        }

        C57669d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C576701.f131626a);
            baseActivityViewModel2.config(C576712.f131627a);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.PolicyNoticeActivity$e */
    public static final class View$OnClickListenerC57672e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PolicyNoticeActivity f131628a;

        /* renamed from: b */
        final /* synthetic */ C57664b f131629b;

        static {
            Covode.recordClassIndex(67640);
        }

        View$OnClickListenerC57672e(PolicyNoticeActivity policyNoticeActivity, C57664b bVar) {
            this.f131628a = policyNoticeActivity;
            this.f131629b = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C57646a.m104378a(this.f131629b, this.f131628a, new AbstractC89172b<C57664b, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.p3359ui.PolicyNoticeActivity.View$OnClickListenerC57672e.C576731 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC57672e f131630a;

                static {
                    Covode.recordClassIndex(67641);
                }

                {
                    this.f131630a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C57664b bVar) {
                    C57664b bVar2 = bVar;
                    C89219l.m154721d(bVar2, "");
                    this.f131630a.f131628a.mo95003a(bVar2);
                    return C89391z.f203057a;
                }
            }, new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.p3359ui.PolicyNoticeActivity.View$OnClickListenerC57672e.C576742 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC57672e f131631a;

                static {
                    Covode.recordClassIndex(67642);
                }

                {
                    this.f131631a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    this.f131631a.f131628a.finish();
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo95003a(C57664b bVar) {
        C57646a.m104377a(this.f131620a, bVar);
        C57646a.m104375a(this);
        finish();
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C57656a aVar) {
        C89219l.m154721d(aVar, "");
        if (TextUtils.equals(aVar.f131590b.optString("eventName"), "cancel_post_success")) {
            finish();
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.PolicyNoticeActivity", "onCreate", true);
        activityConfiguration(C57669d.f131625a);
        super.onCreate(bundle);
        setContentView(R.layout.abu);
        this.f131620a = C57646a.f131568d;
        List<PolicyBodyLinkList> list = null;
        C57646a.f131568d = null;
        C57663a aVar = this.f131620a;
        if (aVar != null) {
            if (C89219l.m154714a((Object) aVar.isSubPopUp(), (Object) true)) {
                ButtonTitleBar buttonTitleBar = (ButtonTitleBar) _$_findCachedViewById(R.id.eiz);
                C89219l.m154716b(buttonTitleBar, "");
                buttonTitleBar.setVisibility(0);
                ((ButtonTitleBar) _$_findCachedViewById(R.id.eiz)).setOnTitleBarClickListener(new C57668c(this));
            } else {
                ButtonTitleBar buttonTitleBar2 = (ButtonTitleBar) _$_findCachedViewById(R.id.eiz);
                C89219l.m154716b(buttonTitleBar2, "");
                buttonTitleBar2.setVisibility(4);
            }
            TuxTextView tuxTextView = (TuxTextView) _$_findCachedViewById(R.id.d3o);
            C57663a aVar2 = this.f131620a;
            if (aVar2 != null) {
                str = aVar2.getTitle();
            } else {
                str = null;
            }
            tuxTextView.setText(str);
            tuxTextView.setTuxFont(23);
            TuxTextView tuxTextView2 = (TuxTextView) _$_findCachedViewById(R.id.acq);
            Context context = tuxTextView2.getContext();
            C89219l.m154716b(context, "");
            C57663a aVar3 = this.f131620a;
            if (aVar3 != null) {
                str2 = aVar3.getBody();
            } else {
                str2 = null;
            }
            C57663a aVar4 = this.f131620a;
            if (aVar4 != null) {
                list = aVar4.getPolicyLinkList();
            }
            tuxTextView2.setText(C57646a.m104374a(context, str2, list, new C57666a(this), new C57667b(this)));
            tuxTextView2.setHighlightColor(C0643b.m2378c(tuxTextView2.getContext(), R.color.c9));
            tuxTextView2.setMovementMethod(LinkMovementMethod.getInstance());
            TuxTextView tuxTextView3 = (TuxTextView) _$_findCachedViewById(R.id.zz);
            tuxTextView3.setTuxFont(43);
            C57663a aVar5 = this.f131620a;
            if (aVar5 == null) {
                C89219l.m154715b();
            }
            m104381a(tuxTextView3, aVar5.getActions().get(0));
            C57663a aVar6 = this.f131620a;
            if (aVar6 == null) {
                C89219l.m154715b();
            }
            if (aVar6.getActions().size() > 1) {
                TuxTextView tuxTextView4 = (TuxTextView) _$_findCachedViewById(R.id.a00);
                tuxTextView4.setVisibility(0);
                C57663a aVar7 = this.f131620a;
                if (aVar7 == null) {
                    C89219l.m154715b();
                }
                m104381a(tuxTextView4, aVar7.getActions().get(1));
            } else {
                TuxTextView tuxTextView5 = (TuxTextView) _$_findCachedViewById(R.id.a00);
                C89219l.m154716b(tuxTextView5, "");
                tuxTextView5.setVisibility(8);
            }
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.PolicyNoticeActivity", "onCreate", false);
            return;
        }
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.homepage.policynotice.ui.PolicyNoticeActivity", "onCreate", false);
    }

    /* renamed from: a */
    private final void m104381a(TextView textView, C57664b bVar) {
        if (textView != null) {
            textView.setText(bVar.f131608a);
            textView.setOnClickListener(new View$OnClickListenerC57672e(this, bVar));
        }
    }
}
