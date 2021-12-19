package com.p2082ss.android.ugc.aweme.kids.homepage.p3360ui;

import android.content.BroadcastReceiver;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1213t;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.foundation.base.AbstractC17362a;
import com.bytedance.ies.foundation.base.C17365b;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.bytedance.tux.p1721g.C23144b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.ftc.p3028c.C51916b;
import com.p2082ss.android.ugc.aweme.kids.common.p3329b.C57348c;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57352d;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57354e;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.C57355f;
import com.p2082ss.android.ugc.aweme.kids.common.p3330c.EnumC57349a;
import com.p2082ss.android.ugc.aweme.kids.common.response.KidsComplianceSettings;
import com.p2082ss.android.ugc.aweme.kids.common.response.KidsWellbeingSetting;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3335c.AbstractC57402b;
import com.p2082ss.android.ugc.aweme.kids.discovery.DiscoveryServiceImpl;
import com.p2082ss.android.ugc.aweme.kids.homepage.bottomview.AbstractC57633g;
import com.p2082ss.android.ugc.aweme.kids.homepage.bottomview.HomeBottomTabView;
import com.p2082ss.android.ugc.aweme.kids.homepage.compliance.C57635a;
import com.p2082ss.android.ugc.aweme.kids.homepage.compliance.C57637b;
import com.p2082ss.android.ugc.aweme.kids.homepage.p3353a.C57622a;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.p3357c.C57657b;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.p3357c.C57658c;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.p3358d.C57659a;
import com.p2082ss.android.ugc.aweme.kids.homepage.policynotice.p3359ui.PolicyNoticeToast;
import com.p2082ss.android.ugc.aweme.kids.liked.FavoriteServiceImpl;
import com.p2082ss.android.ugc.aweme.kids.profile.ProfileServiceImpl;
import com.p2082ss.android.ugc.aweme.kids.profile.api.p3364a.C57748a;
import com.p2082ss.android.ugc.aweme.kids.recommendfeed.RecommendFeedServiceImpl;
import com.p2082ss.android.ugc.aweme.kids.setting.api.IKidsWellbeingService;
import com.p2082ss.android.ugc.aweme.kids.setting.wellbeing.KidsWellbeingServiceImpl;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.RecordConfig;
import com.p2082ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p2082ss.android.ugc.aweme.utils.AppWidgetServiceImpl;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity */
public final class KidsMainActivity extends ActivityC17312a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: b */
    public static final C57700a f131670b = new C57700a((byte) 0);

    /* renamed from: a */
    String f131671a;

    /* renamed from: c */
    private final AbstractC89244h f131672c = C89250i.m154773a((AbstractC89171a) C57711i.f131694a);

    /* renamed from: d */
    private final AbstractC89244h f131673d = C89250i.m154773a((AbstractC89171a) new C57704e(this));

    /* renamed from: e */
    private long f131674e;

    /* renamed from: f */
    private final AbstractC89244h f131675f = C89250i.m154773a((AbstractC89171a) new C57716m(this));

    /* renamed from: g */
    private final AtomicBoolean f131676g = new AtomicBoolean(false);

    /* renamed from: h */
    private int f131677h;

    /* renamed from: i */
    private final AbstractC89244h f131678i = C89250i.m154773a((AbstractC89171a) C57703d.f131685a);

    /* renamed from: j */
    private final AbstractC89244h f131679j = C89250i.m154773a((AbstractC89171a) C57702c.f131684a);

    /* renamed from: k */
    private final AbstractC89244h f131680k = C89250i.m154773a((AbstractC89171a) C57710h.f131693a);

    /* renamed from: l */
    private final AbstractC89244h f131681l = C89250i.m154773a((AbstractC89171a) C57717n.f131701a);

    /* renamed from: m */
    private HashMap f131682m;

    static {
        Covode.recordClassIndex(67669);
    }

    /* renamed from: c */
    private final C57622a m104400c() {
        return (C57622a) this.f131672c.getValue();
    }

    /* renamed from: d */
    private final Fragment m104401d() {
        return (Fragment) this.f131678i.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f131682m;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f131682m == null) {
            this.f131682m = new HashMap();
        }
        View view = (View) this.f131682m.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f131682m.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final AbstractC0952i mo95032a() {
        return (AbstractC0952i) this.f131673d.getValue();
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(160, new RunnableC90250g(KidsMainActivity.class, "onSettingsDoneEvent", C57657b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(161, new RunnableC90250g(KidsMainActivity.class, "onDestroyDraftEvent", C51916b.class, ThreadMode.MAIN, 0, false));
        hashMap.put(162, new RunnableC90250g(KidsMainActivity.class, "onShowPolicyNoticeToastEvent", C57658c.class, ThreadMode.MAIN, 0, false));
        hashMap.put(163, new RunnableC90250g(KidsMainActivity.class, "onClickDraftEvent", C57748a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity$a */
    public static final class C57700a {
        static {
            Covode.recordClassIndex(67670);
        }

        private C57700a() {
        }

        public /* synthetic */ C57700a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity$e */
    static final class C57704e extends AbstractC89220m implements AbstractC89171a<AbstractC0952i> {

        /* renamed from: a */
        final /* synthetic */ KidsMainActivity f131686a;

        static {
            Covode.recordClassIndex(67674);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57704e(KidsMainActivity kidsMainActivity) {
            super(0);
            this.f131686a = kidsMainActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC0952i invoke() {
            return this.f131686a.getSupportFragmentManager();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity$i */
    static final class C57711i extends AbstractC89220m implements AbstractC89171a<C57622a> {

        /* renamed from: a */
        public static final C57711i f131694a = new C57711i();

        static {
            Covode.recordClassIndex(67681);
        }

        C57711i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C57622a invoke() {
            return new C57622a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity$c */
    static final class C57702c extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        public static final C57702c f131684a = new C57702c();

        static {
            Covode.recordClassIndex(67672);
        }

        C57702c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Fragment invoke() {
            return DiscoveryServiceImpl.m104243b().mo94887a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity$d */
    static final class C57703d extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        public static final C57703d f131685a = new C57703d();

        static {
            Covode.recordClassIndex(67673);
        }

        C57703d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Fragment invoke() {
            return RecommendFeedServiceImpl.m104492c().mo95100a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity$h */
    static final class C57710h extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        public static final C57710h f131693a = new C57710h();

        static {
            Covode.recordClassIndex(67680);
        }

        C57710h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Fragment invoke() {
            return FavoriteServiceImpl.m104432b().mo95042a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity$m */
    static final class C57716m extends AbstractC89220m implements AbstractC89171a<PolicyNoticeToast> {

        /* renamed from: a */
        final /* synthetic */ KidsMainActivity f131700a;

        static {
            Covode.recordClassIndex(67686);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57716m(KidsMainActivity kidsMainActivity) {
            super(0);
            this.f131700a = kidsMainActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ PolicyNoticeToast invoke() {
            return this.f131700a._$_findCachedViewById(R.id.d3l);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity$n */
    static final class C57717n extends AbstractC89220m implements AbstractC89171a<Fragment> {

        /* renamed from: a */
        public static final C57717n f131701a = new C57717n();

        static {
            Covode.recordClassIndex(67687);
        }

        C57717n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Fragment invoke() {
            return ProfileServiceImpl.m104468b().mo95061a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity$f */
    static final class CallableC57705f<V> implements Callable {

        /* renamed from: a */
        public static final CallableC57705f f131687a = new CallableC57705f();

        static {
            Covode.recordClassIndex(67675);
        }

        CallableC57705f() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            KidsWellbeingSetting kidsWellbeingSetting;
            IKidsWellbeingService c = KidsWellbeingServiceImpl.m104800c();
            KidsComplianceSettings a = C57635a.f131548a.mo94945a();
            if (a != null) {
                kidsWellbeingSetting = a.getWellbeingSetting();
            } else {
                kidsWellbeingSetting = null;
            }
            c.mo95132a(kidsWellbeingSetting);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        EventBus.m156962a().mo145395b(this);
        unregisterReceiver(m104400c());
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
        if (C89219l.m154714a((Object) this.f131671a, (Object) "homepage_hot")) {
            Fragment d = m104401d();
            if (!(d instanceof AbstractC57402b)) {
                d = null;
            }
            AbstractC57402b bVar = (AbstractC57402b) d;
            if (bVar != null) {
                bVar.mo94666b();
            }
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

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
        if (mo95032a().mo3564e() > 0) {
            mo95032a().mo3562c();
            this.f131671a = "personal_homepage";
            ((HomeBottomTabView) _$_findCachedViewById(R.id.bfc)).mo94920a(this.f131671a);
        } else if (System.currentTimeMillis() - this.f131674e <= InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
            finish();
            this.f131674e = 0;
        } else {
            this.f131674e = System.currentTimeMillis();
            new C23144b(this).mo37640e(R.string.a22).mo37637b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo95033b() {
        boolean z;
        int i;
        T t;
        Map<Class<?>, C1213t<? extends AbstractC17362a>> map = provideBaseViewModel().getSubscribeStore().f41688a;
        if (!map.containsKey(C33103x.class)) {
            map.put(C33103x.class, new C1213t<>());
        }
        if (map.containsKey(C33103x.class)) {
            C1213t<? extends AbstractC17362a> tVar = map.get(C33103x.class);
            if (tVar == null) {
                tVar = new C1213t<>();
                map.put(C33103x.class, tVar);
            }
            C17365b configuration = provideBaseViewModel().getConfiguration();
            T t2 = (T) ((AbstractC17362a) tVar.getValue());
            if (t2 == null) {
                Iterator<T> it = configuration.mo27699b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (t instanceof C33103x) {
                        break;
                    }
                }
                if (!(t instanceof C33103x)) {
                    t = null;
                }
                t2 = t;
                if (t2 == null) {
                    t2 = (T) ((AbstractC17362a) C33103x.class.newInstance());
                }
            }
            Objects.requireNonNull(t2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.activity.processor.ImmersiveConfig");
            T t3 = t2;
            if (C89219l.m154714a((Object) this.f131671a, (Object) "homepage_hot") || C89219l.m154714a((Object) this.f131671a, (Object) "tab_draft")) {
                z = true;
                i = R.color.a2;
            } else {
                z = false;
                i = R.color.l;
            }
            C33103x a = C33103x.m67806a(t3, i);
            a.f78667a = !z;
            a.f78670d = i;
            configuration.mo27698a(a);
            if (t2.equals(a)) {
                return;
            }
            if (C89219l.m154714a(Looper.getMainLooper(), Looper.myLooper())) {
                tVar.setValue(a);
            } else if (tVar instanceof C1213t) {
                tVar.postValue(a);
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        long j;
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity", "onResume", true);
        super.onResume();
        String str = "homepage_hot";
        if (this.f131677h == 0 && C89219l.m154714a((Object) this.f131671a, (Object) str)) {
            Fragment d = m104401d();
            if (!(d instanceof AbstractC57402b)) {
                d = null;
            }
            AbstractC57402b bVar = (AbstractC57402b) d;
            if (bVar != null) {
                bVar.mo94665a();
            }
        }
        if (this.f131677h != 0) {
            HomeBottomTabView homeBottomTabView = (HomeBottomTabView) _$_findCachedViewById(R.id.bfc);
            int i = this.f131677h;
            if (i != 0) {
                if (i == 1) {
                    str = "discovery";
                } else if (i == 3) {
                    str = "liked";
                } else if (i == 4) {
                    str = "personal_homepage";
                } else {
                    throw new IllegalArgumentException("page index [" + i + "] is not support");
                }
            }
            homeBottomTabView.setCurrentTab(str);
        }
        if (C57352d.f130729a != null) {
            Long l = C57352d.f130730b;
            if (l != null) {
                j = System.currentTimeMillis() - l.longValue();
            } else {
                j = 0;
            }
            C33743c cVar = new C33743c();
            String valueOf = String.valueOf(C57352d.f130729a);
            Objects.requireNonNull(valueOf, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = valueOf.toLowerCase(Locale.ROOT);
            C89219l.m154716b(lowerCase, "");
            C57354e.m103958a("kids_app_launch", cVar.mo59976a(StringSet.type, lowerCase).mo59976a("duration", String.valueOf(j)).mo59977a());
            C57352d.f130729a = null;
            C57352d.f130730b = null;
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity", "onResume", false);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity$j */
    static final class C57712j extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C57712j f131695a = new C57712j();

        static {
            Covode.recordClassIndex(67682);
        }

        C57712j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C577131.f131696a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity$b */
    static final class C57701b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ KidsMainActivity f131683a;

        static {
            Covode.recordClassIndex(67671);
        }

        C57701b(KidsMainActivity kidsMainActivity) {
            this.f131683a = kidsMainActivity;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            KidsMainActivity kidsMainActivity = this.f131683a;
            AVExternalServiceImpl.m113114a().publishService().tryRestorePublish(kidsMainActivity, new C57706g(kidsMainActivity));
            return null;
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onClickDraftEvent(C57748a aVar) {
        C89219l.m154721d(aVar, "");
        this.f131671a = "tab_draft";
        mo95033b();
        ((HomeBottomTabView) _$_findCachedViewById(R.id.bfc)).mo94920a(this.f131671a);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onShowPolicyNoticeToastEvent(C57658c cVar) {
        C89219l.m154721d(cVar, "");
        ((PolicyNoticeToast) this.f131675f.getValue()).setValues(cVar.f131591a);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity$g */
    static final class C57706g extends AbstractC89220m implements AbstractC89172b<Boolean, Void> {

        /* renamed from: a */
        final /* synthetic */ KidsMainActivity f131688a;

        static {
            Covode.recordClassIndex(67676);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57706g(KidsMainActivity kidsMainActivity) {
            super(1);
            this.f131688a = kidsMainActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Void invoke(Boolean bool) {
            if (!bool.booleanValue()) {
                return null;
            }
            C17197a.C17200a b = new C17197a.C17200a(this.f131688a).mo27194b(R.string.h7k).mo27190a(R.string.as0, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC57707a(this), false).mo27195b(R.string.a8y, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC57709b(this), false);
            C89219l.m154716b(b, "");
            b.f41067M = false;
            b.mo27193a().mo27184b();
            return null;
        }

        /* renamed from: com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity$g$b */
        static final class DialogInterface$OnClickListenerC57709b implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C57706g f131692a;

            static {
                Covode.recordClassIndex(67679);
            }

            DialogInterface$OnClickListenerC57709b(C57706g gVar) {
                this.f131692a = gVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                IAVPublishService publishService;
                C89219l.m154716b(dialogInterface, "");
                IExternalService a = AVExternalServiceImpl.m113114a();
                if (!(a == null || (publishService = a.publishService()) == null)) {
                    publishService.cancelRestoreOnMain();
                }
                dialogInterface.dismiss();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity$g$a */
        static final class DialogInterface$OnClickListenerC57707a implements DialogInterface.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C57706g f131689a;

            static {
                Covode.recordClassIndex(67677);
            }

            DialogInterface$OnClickListenerC57707a(C57706g gVar) {
                this.f131689a = gVar;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                final RecordConfig.Builder creationId = new RecordConfig.Builder().shootWay("restore_crash").restoreType(2).creationId(UUID.randomUUID().toString());
                AVExternalServiceImpl.m113114a().asyncService(this.f131689a.f131688a, "restore_crash", new SimpleServiceLoadCallback(this) {
                    /* class com.p2082ss.android.ugc.aweme.kids.homepage.p3360ui.KidsMainActivity.C57706g.DialogInterface$OnClickListenerC57707a.C577081 */

                    /* renamed from: a */
                    final /* synthetic */ DialogInterface$OnClickListenerC57707a f131690a;

                    static {
                        Covode.recordClassIndex(67678);
                    }

                    {
                        this.f131690a = r1;
                    }

                    @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                    public final void onLoad(AsyncAVService asyncAVService, long j) {
                        C89219l.m154721d(asyncAVService, "");
                        asyncAVService.uiService().recordService().startRecord(this.f131690a.f131689a.f131688a, creationId.build());
                    }
                });
                dialogInterface.dismiss();
            }
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onDestroyDraftEvent(C51916b bVar) {
        C89219l.m154721d(bVar, "");
        if (C89219l.m154714a((Object) this.f131671a, (Object) "tab_draft")) {
            this.f131671a = "personal_homepage";
        }
        mo95033b();
        ((HomeBottomTabView) _$_findCachedViewById(R.id.bfc)).mo94920a(this.f131671a);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onSettingsDoneEvent(C57657b bVar) {
        Boolean policyNoticeEnable;
        KidsComplianceSettings a = C57635a.f131548a.mo94945a();
        if (a != null && (policyNoticeEnable = a.getPolicyNoticeEnable()) != null && policyNoticeEnable.booleanValue()) {
            C57659a aVar = new C57659a();
            C89219l.m154721d(this, "");
            aVar.mo94959a().getPolicyNotice().mo5532a(new C57659a.C57660a(System.currentTimeMillis(), this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Fragment mo95031a(String str) {
        switch (str.hashCode()) {
            case -562830579:
                if (str.equals("personal_homepage")) {
                    return (Fragment) this.f131681l.getValue();
                }
                break;
            case -121207376:
                if (str.equals("discovery")) {
                    return (Fragment) this.f131679j.getValue();
                }
                break;
            case 102974381:
                if (str.equals("liked")) {
                    return (Fragment) this.f131680k.getValue();
                }
                break;
            case 1691937916:
                if (str.equals("homepage_hot")) {
                    return m104401d();
                }
                break;
        }
        throw new IllegalArgumentException("[" + str + "] is not support");
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity", "onCreate", true);
        activityConfiguration(C57712j.f131695a);
        super.onCreate(bundle);
        if (C57352d.f130729a == null) {
            C57352d.f130729a = EnumC57349a.WARM;
            C57352d.f130730b = Long.valueOf(System.currentTimeMillis());
        }
        getWindow().clearFlags(1024);
        setContentView(R.layout.ad3);
        this.f131677h = getIntent().getIntExtra("key_init_page_index", 0);
        EventBus.m156966a(EventBus.m156962a(), this);
        mo95032a().mo3552a().mo3454a(R.id.acf, m104401d(), "homepage_hot").mo3467b();
        this.f131671a = "homepage_hot";
        mo95033b();
        AppWidgetServiceImpl.m138932a().mo57207a(this);
        ((HomeBottomTabView) _$_findCachedViewById(R.id.bfc)).setTabSelectListener(new C57714k(this));
        C57635a.f131549b.f131553a.checkIn().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143062b(new C57637b.C57638a(System.currentTimeMillis()));
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        m104399b(this, m104400c(), intentFilter);
        C1731i.m5640b(CallableC57705f.f131687a, C1731i.f5562a);
        if (this.f131676g.compareAndSet(false, true)) {
            C1731i.m5631a(1800).mo5538b(new C57701b(this), C40780g.m82246c());
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity", "onCreate", false);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity$l */
    public static final class C57715l extends SimpleServiceLoadCallback {

        /* renamed from: a */
        final /* synthetic */ KidsMainActivity f131698a;

        /* renamed from: b */
        final /* synthetic */ RecordConfig.Builder f131699b;

        static {
            Covode.recordClassIndex(67685);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.SimpleServiceLoadCallback, com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onOK() {
        }

        C57715l(KidsMainActivity kidsMainActivity, RecordConfig.Builder builder) {
            this.f131698a = kidsMainActivity;
            this.f131699b = builder;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C89219l.m154721d(asyncAVService, "");
            asyncAVService.uiService().recordService().startRecord(this.f131698a, this.f131699b.build());
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        if (i != 25 && i != 24) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i == 24) {
            z = true;
        } else {
            z = false;
        }
        AbstractC81915c.m141874a(new C57348c(z));
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity$k */
    static final class C57714k implements AbstractC57633g {

        /* renamed from: a */
        final /* synthetic */ KidsMainActivity f131697a;

        static {
            Covode.recordClassIndex(67684);
        }

        C57714k(KidsMainActivity kidsMainActivity) {
            this.f131697a = kidsMainActivity;
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.homepage.bottomview.AbstractC57633g
        /* renamed from: a */
        public final void mo94940a(String str, String str2) {
            String str3;
            String str4;
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            if (C89219l.m154714a((Object) str2, (Object) "tab_publish")) {
                KidsMainActivity kidsMainActivity = this.f131697a;
                if (!C58001a.m104815a(((HomeBottomTabView) kidsMainActivity._$_findCachedViewById(R.id.bfc)).f131518d.get("tab_publish"), 1200)) {
                    Aweme b = RecommendFeedServiceImpl.m104492c().mo95101b();
                    C33743c a = new C33743c().mo59976a("shoot_way", "direct_shoot");
                    if (b == null || (str3 = b.getAid()) == null) {
                        str3 = "";
                    }
                    C33743c a2 = a.mo59976a("group_id", str3);
                    if (b == null || (str4 = b.getLogPbString()) == null) {
                        str4 = "";
                    }
                    C57355f.m103962a("shoot", a2.mo59976a("log_pb", str4).mo59977a());
                    String uuid = UUID.randomUUID().toString();
                    C89219l.m154716b(uuid, "");
                    AVExternalServiceImpl.m113114a().asyncServiceForMainRecordService(kidsMainActivity, "direct_shoot", new C57715l(kidsMainActivity, new RecordConfig.Builder().shootWay("direct_shoot").creationId(uuid)));
                    return;
                }
                return;
            }
            KidsMainActivity kidsMainActivity2 = this.f131697a;
            if (!kidsMainActivity2.isFinishing() && !TextUtils.equals(str, str2)) {
                try {
                    Fragment a3 = kidsMainActivity2.mo95031a(str);
                    Fragment a4 = kidsMainActivity2.mo95031a(str2);
                    AbstractC0976n a5 = kidsMainActivity2.mo95032a().mo3552a();
                    C89219l.m154716b(a5, "");
                    if (kidsMainActivity2.mo95032a().mo3564e() > 0) {
                        kidsMainActivity2.mo95032a().mo3562c();
                    }
                    if (!a4.isAdded()) {
                        a5.mo3471b(a3).mo3454a(R.id.acf, a4, str2).mo3473c();
                    } else {
                        a5.mo3471b(a3).mo3474c(a4).mo3473c();
                    }
                    if (TextUtils.equals(str, "liked")) {
                        a5.mo3455a(a3);
                    }
                    if (TextUtils.equals(str, "homepage_hot")) {
                        if (!(a3 instanceof AbstractC57402b)) {
                            a3 = null;
                        }
                        AbstractC57402b bVar = (AbstractC57402b) a3;
                        if (bVar != null) {
                            bVar.mo94666b();
                        }
                    }
                    if (TextUtils.equals(str2, "homepage_hot")) {
                        if (!(a4 instanceof AbstractC57402b)) {
                            a4 = null;
                        }
                        AbstractC57402b bVar2 = (AbstractC57402b) a4;
                        if (bVar2 != null) {
                            bVar2.mo94665a();
                        }
                    }
                    kidsMainActivity2.f131671a = str2;
                    kidsMainActivity2.mo95033b();
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    private static Intent m104398a(KidsMainActivity kidsMainActivity, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return kidsMainActivity.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Intent m104399b(com.p2082ss.android.ugc.aweme.kids.homepage.p3360ui.KidsMainActivity r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.C17879g.m33104a()
            com.p2082ss.android.ugc.aweme.lancet.receiver.C58039a.m104863a(r0)
            android.content.Intent r0 = m104398a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.p2082ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.p890c.p891a.p892a.p893a.C13468b.m24211a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.kids.homepage.p3360ui.KidsMainActivity.m104399b(com.ss.android.ugc.aweme.kids.homepage.ui.KidsMainActivity, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
