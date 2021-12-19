package com.p2082ss.android.ugc.aweme.journey;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.p1717e.C23073a;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49699z;
import com.p2082ss.android.ugc.aweme.journey.AbstractC56869p;
import com.p2082ss.android.ugc.aweme.journey.C57056y;
import com.p2082ss.android.ugc.aweme.journey.flow.C56857a;
import com.p2082ss.android.ugc.aweme.journey.flow.NewUserJourneyFlowDependencies;
import com.p2082ss.android.ugc.aweme.journey.p3291a.C56837c;
import com.p2082ss.android.ugc.aweme.journey.step.ComponentDependencies;
import com.p2082ss.android.ugc.aweme.journey.step.p3295d.C56917b;
import com.p2082ss.android.ugc.aweme.journey.step.p3298g.C56955b;
import com.p2082ss.android.ugc.aweme.language.AbstractC58069b;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.p2082ss.android.ugc.aweme.p2310al.C33487b;
import com.p2082ss.android.ugc.aweme.p2310al.C33491f;
import com.p2082ss.android.ugc.aweme.setting.services.ISettingService;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
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

/* renamed from: com.ss.android.ugc.aweme.journey.NewUserJourneyActivity */
public final class NewUserJourneyActivity extends AbstractActivityC56855f implements AbstractC90252i, AbstractC90253j {

    /* renamed from: h */
    public static boolean f129388h;

    /* renamed from: i */
    public static final C56817a f129389i = new C56817a((byte) 0);

    /* renamed from: f */
    public boolean f129390f;

    /* renamed from: g */
    public C56857a f129391g;

    /* renamed from: j */
    private final C1213t<C56840aa> f129392j = new C1213t<>();

    /* renamed from: k */
    private final C1213t<Boolean> f129393k = new C1213t<>();

    /* renamed from: l */
    private ComponentDependencies f129394l;

    /* renamed from: m */
    private NewUserJourneyFlowDependencies f129395m;

    /* renamed from: n */
    private SparseArray f129396n;

    static {
        Covode.recordClassIndex(66700);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f129396n;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f129396n == null) {
            this.f129396n = new SparseArray();
        }
        View view = (View) this.f129396n.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f129396n.put(i, findViewById);
        return findViewById;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(23, new RunnableC90250g(NewUserJourneyActivity.class, "onEvent", C33491f.class, ThreadMode.MAIN, 0, false));
        hashMap.put(24, new RunnableC90250g(NewUserJourneyActivity.class, "onEvent", C56955b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(25, new RunnableC90250g(NewUserJourneyActivity.class, "onAppFlyerEvent", C33487b.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.ActivityC36140cm
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.ActivityC36140cm
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.NewUserJourneyActivity$a */
    public static final class C56817a {
        static {
            Covode.recordClassIndex(66701);
        }

        private C56817a() {
        }

        public /* synthetic */ C56817a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m103084a(Activity activity, boolean z, boolean z2) {
            C89219l.m154721d(activity, "");
            C58945a.C58947b.f134185a.f134176c = false;
            C58945a.C58947b.f134185a.f134180g = false;
            Intent intent = new Intent(activity, NewUserJourneyActivity.class);
            intent.putExtra("from_main", z);
            if (!z) {
                intent.putExtra("deeplink_intent_about_welcome_screen", activity.getIntent());
                if (!z2 || activity.getIntent() != null) {
                    activity.finish();
                }
            }
            activity.overridePendingTransition(0, 0);
            activity.startActivityForResult(intent, 18);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.journey.NewUserJourneyActivity$d */
    public static final class C56823d extends AbstractC89220m implements AbstractC89171a<WeakReference<Context>> {

        /* renamed from: a */
        final /* synthetic */ NewUserJourneyActivity f129403a;

        /* renamed from: b */
        final /* synthetic */ Intent f129404b;

        static {
            Covode.recordClassIndex(66707);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56823d(NewUserJourneyActivity newUserJourneyActivity, Intent intent) {
            super(0);
            this.f129403a = newUserJourneyActivity;
            this.f129404b = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ WeakReference<Context> invoke() {
            return new WeakReference(this.f129403a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.journey.NewUserJourneyActivity$g */
    public static final class C56826g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ NewUserJourneyActivity f129409a;

        /* renamed from: b */
        final /* synthetic */ Intent f129410b;

        static {
            Covode.recordClassIndex(66710);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56826g(NewUserJourneyActivity newUserJourneyActivity, Intent intent) {
            super(0);
            this.f129409a = newUserJourneyActivity;
            this.f129410b = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f129409a.mo93991b();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.journey.NewUserJourneyActivity$h */
    public static final class C56827h extends AbstractC89220m implements AbstractC89171a<WeakReference<ActivityC0945e>> {

        /* renamed from: a */
        final /* synthetic */ NewUserJourneyActivity f129411a;

        /* renamed from: b */
        final /* synthetic */ Intent f129412b;

        static {
            Covode.recordClassIndex(66711);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56827h(NewUserJourneyActivity newUserJourneyActivity, Intent intent) {
            super(0);
            this.f129411a = newUserJourneyActivity;
            this.f129412b = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ WeakReference<ActivityC0945e> invoke() {
            return new WeakReference(this.f129411a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.journey.NewUserJourneyActivity$l */
    public static final class C56831l extends AbstractC89220m implements AbstractC89171a<WeakReference<Context>> {

        /* renamed from: a */
        final /* synthetic */ NewUserJourneyActivity f129419a;

        static {
            Covode.recordClassIndex(66715);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56831l(NewUserJourneyActivity newUserJourneyActivity) {
            super(0);
            this.f129419a = newUserJourneyActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ WeakReference<Context> invoke() {
            return new WeakReference(this.f129419a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.NewUserJourneyActivity$c */
    public static final class View$OnLayoutChangeListenerC56821c implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ NewUserJourneyActivity f129400a;

        /* renamed from: b */
        final /* synthetic */ View f129401b;

        static {
            Covode.recordClassIndex(66705);
        }

        /* renamed from: com.ss.android.ugc.aweme.journey.NewUserJourneyActivity$c$a */
        static final class RunnableC56822a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ View$OnLayoutChangeListenerC56821c f129402a;

            static {
                Covode.recordClassIndex(66706);
            }

            RunnableC56822a(View$OnLayoutChangeListenerC56821c cVar) {
                this.f129402a = cVar;
            }

            public final void run() {
                C56857a aVar = this.f129402a.f129400a.f129391g;
                if (aVar != null) {
                    aVar.mo94031a((Boolean) null);
                }
            }
        }

        View$OnLayoutChangeListenerC56821c(NewUserJourneyActivity newUserJourneyActivity, View view) {
            this.f129400a = newUserJourneyActivity;
            this.f129401b = view;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f129401b.removeOnLayoutChangeListener(this);
            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC56822a(this), 1000);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.journey.NewUserJourneyActivity$j */
    public static final class C56829j extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ NewUserJourneyActivity f129415a;

        /* renamed from: b */
        final /* synthetic */ Intent f129416b;

        static {
            Covode.recordClassIndex(66713);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56829j(NewUserJourneyActivity newUserJourneyActivity, Intent intent) {
            super(0);
            this.f129415a = newUserJourneyActivity;
            this.f129416b = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C56857a aVar = this.f129415a.f129391g;
            if (aVar != null) {
                aVar.mo94031a((Boolean) null);
            }
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        AbstractC56869p.C56870a.m103133a().f129508a = true;
        super.onDestroy();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.journey.NewUserJourneyActivity$i */
    public static final class C56828i extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ NewUserJourneyActivity f129413a;

        /* renamed from: b */
        final /* synthetic */ Intent f129414b;

        static {
            Covode.recordClassIndex(66712);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56828i(NewUserJourneyActivity newUserJourneyActivity, Intent intent) {
            super(0);
            this.f129413a = newUserJourneyActivity;
            this.f129414b = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C56857a aVar = this.f129413a.f129391g;
            if (aVar != null) {
                aVar.f129476b = Integer.MAX_VALUE;
                aVar.f70928a.mo94029d().invoke();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    public final void mo93991b() {
        AbstractC56869p.C56870a.m103133a().f129513f = true;
        Boolean value = this.f129393k.getValue();
        if (value == null) {
            value = false;
        }
        AbstractC81915c.m141874a(new C49699z(true ^ value.booleanValue()));
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.ActivityC36140cm
    public final void finish() {
        boolean z = true;
        AbstractC56869p.C56870a.m103133a().f129508a = true;
        AbstractC81915c.m141874a(new C57055x());
        ComponentDependencies componentDependencies = this.f129394l;
        if (componentDependencies == null) {
            C89219l.m154710a("componentDependencies");
        }
        if (componentDependencies.mo94083i() == null) {
            z = false;
        }
        mo63257a(Boolean.valueOf(z));
        super.finish();
        overridePendingTransition(0, R.anim.c7);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "onResume", true);
        C58945a.C58947b.f134185a.mo96429b("cold_boot_new_user_journey_create_to_resume", false);
        C58945a.C58947b.f134185a.mo96425a("cold_boot_new_user_journey_resume_duration", false);
        super.onResume();
        C58945a.C58947b.f134185a.mo96429b("cold_boot_new_user_journey_resume_duration", false);
        C58945a.C58947b.f134185a.mo96425a("cold_boot_new_user_journey_resume_to_focus_changed", false);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "onResume", false);
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

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.journey.NewUserJourneyActivity$m */
    public static final class C56832m extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ NewUserJourneyFlowDependencies f129420a;

        /* renamed from: b */
        final /* synthetic */ NewUserJourneyActivity f129421b;

        static {
            Covode.recordClassIndex(66716);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56832m(NewUserJourneyFlowDependencies newUserJourneyFlowDependencies, NewUserJourneyActivity newUserJourneyActivity) {
            super(0);
            this.f129420a = newUserJourneyFlowDependencies;
            this.f129421b = newUserJourneyActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AbstractC58069b bVar = this.f129420a.mo94020a().f129541d;
            NewUserJourneyActivity newUserJourneyActivity = this.f129421b;
            if (bVar != null && !TextUtils.equals(bVar.mo90022f(), SettingServiceImpl.m120782v().mo108857a((Context) newUserJourneyActivity).mo90022f()) && !this.f129421b.f129390f) {
                this.f129421b.f129390f = true;
                ISettingService v = SettingServiceImpl.m120782v();
                String a = bVar.mo90017a();
                C89219l.m154716b(a, "");
                String f = bVar.mo90022f();
                C89219l.m154716b(f, "");
                v.mo108863a(a, f, newUserJourneyActivity);
                C31575b.m65865g().updateLanguage(null, SettingServiceImpl.m120782v().mo108872h(), 0);
            } else if (!this.f129421b.isFinishing()) {
                this.f129421b.finish();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: c */
    private final void m103081c() {
        AbstractC1174ac a = C1181ae.m3881a(this, (C1175ad.AbstractC1177b) null).mo3983a(NewUserJourneyFlowDependencies.class);
        C89219l.m154716b(a, "");
        NewUserJourneyFlowDependencies newUserJourneyFlowDependencies = (NewUserJourneyFlowDependencies) a;
        C56837c cVar = C57056y.f129919b;
        if (cVar == null) {
            cVar = new C56837c();
        }
        newUserJourneyFlowDependencies.mo94022a(cVar);
        newUserJourneyFlowDependencies.mo94027b(new C56831l(this));
        newUserJourneyFlowDependencies.mo94021a(this.f129392j);
        newUserJourneyFlowDependencies.mo94026b(this.f129393k);
        ComponentDependencies componentDependencies = this.f129394l;
        if (componentDependencies == null) {
            C89219l.m154710a("componentDependencies");
        }
        newUserJourneyFlowDependencies.mo94023a(componentDependencies);
        newUserJourneyFlowDependencies.mo94024a(new C56832m(newUserJourneyFlowDependencies, this));
        this.f129395m = newUserJourneyFlowDependencies;
        C56857a aVar = this.f129391g;
        if (aVar == null) {
            NewUserJourneyFlowDependencies newUserJourneyFlowDependencies2 = this.f129395m;
            if (newUserJourneyFlowDependencies2 == null) {
                C89219l.m154710a("flowDependencies");
            }
            this.f129391g = new C56857a(newUserJourneyFlowDependencies2);
            return;
        }
        NewUserJourneyFlowDependencies newUserJourneyFlowDependencies3 = this.f129395m;
        if (newUserJourneyFlowDependencies3 == null) {
            C89219l.m154710a("flowDependencies");
        }
        aVar.mo94030a(newUserJourneyFlowDependencies3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.journey.NewUserJourneyActivity$e */
    public static final class C56824e extends AbstractC89220m implements AbstractC89172b<Fragment, C89391z> {

        /* renamed from: a */
        final /* synthetic */ NewUserJourneyActivity f129405a;

        /* renamed from: b */
        final /* synthetic */ Intent f129406b;

        static {
            Covode.recordClassIndex(66708);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56824e(NewUserJourneyActivity newUserJourneyActivity, Intent intent) {
            super(1);
            this.f129405a = newUserJourneyActivity;
            this.f129406b = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Fragment fragment) {
            Fragment fragment2 = fragment;
            C89219l.m154721d(fragment2, "");
            this.f129405a.mo93990a(fragment2, false);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.journey.NewUserJourneyActivity$f */
    public static final class C56825f extends AbstractC89220m implements AbstractC89172b<Fragment, C89391z> {

        /* renamed from: a */
        final /* synthetic */ NewUserJourneyActivity f129407a;

        /* renamed from: b */
        final /* synthetic */ Intent f129408b;

        static {
            Covode.recordClassIndex(66709);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56825f(NewUserJourneyActivity newUserJourneyActivity, Intent intent) {
            super(1);
            this.f129407a = newUserJourneyActivity;
            this.f129408b = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Fragment fragment) {
            Fragment fragment2 = fragment;
            C89219l.m154721d(fragment2, "");
            this.f129407a.mo93990a(fragment2, true);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.journey.NewUserJourneyActivity$k */
    public static final class C56830k extends AbstractC89220m implements AbstractC89172b<Fragment, C89391z> {

        /* renamed from: a */
        final /* synthetic */ NewUserJourneyActivity f129417a;

        /* renamed from: b */
        final /* synthetic */ Intent f129418b;

        static {
            Covode.recordClassIndex(66714);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56830k(NewUserJourneyActivity newUserJourneyActivity, Intent intent) {
            super(1);
            this.f129417a = newUserJourneyActivity;
            this.f129418b = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Fragment fragment) {
            Fragment fragment2 = fragment;
            C89219l.m154721d(fragment2, "");
            this.f129417a.mo93990a(fragment2, false);
            return C89391z.f203057a;
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onEvent(C56955b bVar) {
        C89219l.m154721d(bVar, "");
        C56857a aVar = this.f129391g;
        if (aVar != null) {
            aVar.mo94031a(bVar.f129688a);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.AbstractC17736b, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        m103080a(intent);
        m103081c();
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.NewUserJourneyActivity$b */
    static final class C56818b extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C56818b f129397a = new C56818b();

        static {
            Covode.recordClassIndex(66702);
        }

        C56818b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C568191.f129398a);
            baseActivityViewModel2.config(C568202.f129399a);
            return C89391z.f203057a;
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onAppFlyerEvent(C33487b bVar) {
        C89219l.m154721d(bVar, "");
        Intent intent = new Intent(this, NewUserJourneyActivity.class);
        intent.putExtra("deeplink_intent_about_welcome_screen", bVar.f79557a);
        m103080a(intent);
        m103081c();
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onEvent(C33491f fVar) {
        boolean z;
        C89219l.m154721d(fVar, "");
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (g.isChildrenMode()) {
            finish();
            return;
        }
        IAccountUserService g2 = C31575b.m65865g();
        ComponentDependencies componentDependencies = this.f129394l;
        if (componentDependencies == null) {
            C89219l.m154710a("componentDependencies");
        }
        C89219l.m154716b(g2, "");
        if (!g2.getCurUser().notifyPrivatePolicy || !g2.isNewUser()) {
            z = false;
        } else {
            z = true;
        }
        componentDependencies.f129542e = z;
        NewUserJourneyFlowDependencies newUserJourneyFlowDependencies = this.f129395m;
        if (newUserJourneyFlowDependencies == null) {
            C89219l.m154710a("flowDependencies");
        }
        newUserJourneyFlowDependencies.mo94022a(new C56837c());
    }

    /* renamed from: a */
    private final void m103080a(Intent intent) {
        Intent intent2;
        boolean z;
        Uri data;
        if (intent != null) {
            intent2 = (Intent) intent.getParcelableExtra("deeplink_intent_about_welcome_screen");
        } else {
            intent2 = null;
        }
        boolean z2 = false;
        if (intent2 == null || (data = intent2.getData()) == null || (z = data.getQueryParameter("awedp_require_login")) == null) {
            z = false;
        }
        this.f85370c = C89219l.m154714a((Object) "normal", z);
        AbstractC1174ac a = C1181ae.m3881a(this, (C1175ad.AbstractC1177b) null).mo3983a(ComponentDependencies.class);
        C89219l.m154716b(a, "");
        ComponentDependencies componentDependencies = (ComponentDependencies) a;
        componentDependencies.mo94057a(this.f129392j);
        componentDependencies.f129546i = this.f85368a;
        componentDependencies.f129548k = this.f85370c;
        componentDependencies.f129547j = this.f85369b;
        componentDependencies.mo94064a(new C56823d(this, intent2));
        componentDependencies.mo94070b(new C56824e(this, intent2));
        componentDependencies.mo94065a(new C56825f(this, intent2));
        componentDependencies.mo94061a(AbstractC56869p.C56870a.m103133a());
        componentDependencies.mo94063a(SettingServiceImpl.m120782v().mo108857a((Context) this));
        componentDependencies.mo94069b(new C56826g(this, intent2));
        componentDependencies.f129538a = this.f85372e;
        if (AbstractC56869p.C56870a.m103133a().mo63252c() == 3) {
            z2 = true;
        }
        componentDependencies.f129549l = z2;
        if (intent2 != null) {
            componentDependencies.mo94062a(new C56917b(this.f85370c, intent2));
        }
        componentDependencies.mo94077d(new C56827h(this, intent2));
        componentDependencies.mo94073c(new C56828i(this, intent2));
        componentDependencies.mo94079e(new C56829j(this, intent2));
        componentDependencies.mo94074c(new C56830k(this, intent2));
        this.f129394l = componentDependencies;
        if (!C57056y.f129918a) {
            C57056y.C57057a.m103411a(this);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.journey.AbstractActivityC56855f, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.ActivityC36140cm, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "onCreate", true);
        C58945a.C58947b.f134185a.mo96429b("cold_boot_stubmain_to_new_user_jrouney", false);
        activityConfiguration(C56818b.f129397a);
        super.onCreate(bundle);
        C58945a.C58947b.f134185a.mo96425a("cold_boot_new_user_journey_oncreate_duration", false);
        this.f85372e = getIntent().getBooleanExtra("from_main", true);
        this.f129390f = false;
        if (!this.f85372e) {
            AbstractC56869p.C56870a.m103133a().f129510c = 1;
        }
        AbstractC56869p.C56870a.m103133a().f129508a = false;
        Keva.getRepo("new_user_journey").storeBoolean("new_user_journey_show", true);
        m103080a(getIntent());
        m103081c();
        C58945a.C58947b.f134185a.mo96425a("cold_boot_new_user_journey_setcontentview_duration", false);
        setContentView(R.layout.bg);
        if (!mo63258a() || bundle != null) {
            C56857a aVar = this.f129391g;
            if (aVar != null) {
                aVar.mo94031a((Boolean) null);
            }
        } else {
            Window window = getWindow();
            C89219l.m154716b(window, "");
            View decorView = window.getDecorView();
            C89219l.m154716b(decorView, "");
            decorView.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC56821c(this, decorView));
        }
        C58945a.C58947b.f134185a.mo96429b("cold_boot_new_user_journey_setcontentview_duration", false);
        f129388h = true;
        C23073a.C23074a.m43508a(this).mo37493a().mo37497b().mo37500c().f54627a.mo33415d();
        C58945a.C58947b.f134185a.mo96429b("cold_boot_new_user_journey_oncreate_duration", false);
        C58945a.C58947b.f134185a.mo96425a("cold_boot_new_user_journey_create_to_resume", false);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.journey.NewUserJourneyActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo93990a(Fragment fragment, boolean z) {
        int i;
        C89219l.m154721d(fragment, "");
        AbstractC0976n a = getSupportFragmentManager().mo3552a();
        C89219l.m154716b(a, "");
        if (z) {
            i = 0;
        } else {
            i = R.anim.c9;
        }
        a.mo3451a(i, R.anim.c_);
        a.mo3469b(R.id.b82, fragment);
        a.mo3473c();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onActivityResult(int i, int i2, Intent intent) {
        C56857a aVar;
        super.onActivityResult(i, i2, intent);
        if (i == 1 && (aVar = this.f129391g) != null) {
            aVar.mo94031a((Boolean) null);
        }
    }
}
