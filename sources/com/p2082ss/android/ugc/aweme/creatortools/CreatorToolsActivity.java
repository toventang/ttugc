package com.p2082ss.android.ugc.aweme.creatortools;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.broadcast.api.AbstractC3054d;
import com.bytedance.android.livesdk.livesetting.broadcast.CreatorToolsAgencyCenterUrl;
import com.bytedance.android.livesdk.livesetting.broadcast.CreatorToolsLiveCenterUrl;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.p699l.AbstractC11827c;
import com.bytedance.android.livesdkapi.p699l.C11825a;
import com.bytedance.android.livesdkapi.p699l.C11826b;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRouter;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.p1710c.C22999a;
import com.google.p1998c.p2006h.p2007a.AbstractC27645k;
import com.google.p1998c.p2006h.p2007a.C27646l;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.C43047dm;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.ExecutorC34605m;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.creatortools.api.AbstractC40453a;
import com.p2082ss.android.ugc.aweme.creatortools.api.C40454b;
import com.p2082ss.android.ugc.aweme.experiment.C47036n;
import com.p2082ss.android.ugc.aweme.feed.model.PromoteEntryCheck;
import com.p2082ss.android.ugc.aweme.framework.p3009d.C51427a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.mix.services.MixFeedService;
import com.p2082ss.android.ugc.aweme.music.p3476k.C60830h;
import com.p2082ss.android.ugc.aweme.p2386be.C34797e;
import com.p2082ss.android.ugc.aweme.p2386be.C34798f;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.p2727db.C40937d;
import com.p2082ss.android.ugc.aweme.p2727db.C40941f;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47959j;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.CommerceUserInfo;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.setting.api.PromoteEntryCheckApi;
import com.p2082ss.android.ugc.aweme.setting.p3716d.C68070e;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.setting.utils.C68687b;
import com.p2082ss.android.ugc.aweme.shoutouts.p3902b.C74387a;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80542hp;
import com.p2082ss.android.ugc.aweme.utils.C80586is;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.p4565b.C88411a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89047am;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity */
public final class CreatorToolsActivity extends ActivityC17312a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: f */
    public static final C40393a f94580f = new C40393a((byte) 0);

    /* renamed from: a */
    public String f94581a = "";

    /* renamed from: b */
    public AbstractC3054d f94582b;

    /* renamed from: c */
    C40941f f94583c;

    /* renamed from: d */
    public C40941f f94584d;

    /* renamed from: e */
    C40937d f94585e;

    /* renamed from: g */
    private ButtonTitleBar f94586g;

    /* renamed from: h */
    private TextView f94587h;

    /* renamed from: i */
    private final C88411a f94588i = new C88411a();

    /* renamed from: j */
    private boolean f94589j;

    /* renamed from: k */
    private boolean f94590k = true;

    /* renamed from: l */
    private final AbstractC89244h f94591l = C89250i.m154773a((AbstractC89171a) new C40419au(this));

    /* renamed from: m */
    private C40941f f94592m;

    /* renamed from: n */
    private C40941f f94593n;

    /* renamed from: o */
    private C40941f f94594o;

    /* renamed from: p */
    private C40941f f94595p;

    /* renamed from: q */
    private C40937d f94596q;

    /* renamed from: r */
    private C40941f f94597r;

    /* renamed from: s */
    private C40941f f94598s;

    /* renamed from: t */
    private C40941f f94599t;

    /* renamed from: u */
    private C40941f f94600u;

    /* renamed from: v */
    private C40941f f94601v;

    /* renamed from: w */
    private SparseArray f94602w;

    static {
        Covode.recordClassIndex(48194);
    }

    /* renamed from: c */
    private final C43047dm m81680c() {
        return (C43047dm) this.f94591l.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f94602w;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f94602w == null) {
            this.f94602w = new SparseArray();
        }
        View view = (View) this.f94602w.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f94602w.put(i, findViewById);
        return findViewById;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(52, new RunnableC90250g(CreatorToolsActivity.class, "onSwitchBusinessAccountSuccessEvent", C68070e.class, ThreadMode.MAIN, 0, false));
        hashMap.put(58, new RunnableC90250g(CreatorToolsActivity.class, "onJsBroadCastEvent", C47959j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$a */
    public static final class C40393a {
        static {
            Covode.recordClassIndex(48195);
        }

        private C40393a() {
        }

        public /* synthetic */ C40393a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public static boolean m81678a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$au */
    static final class C40419au extends AbstractC89220m implements AbstractC89171a<C43047dm> {

        /* renamed from: a */
        final /* synthetic */ CreatorToolsActivity f94628a;

        static {
            Covode.recordClassIndex(48221);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40419au(CreatorToolsActivity creatorToolsActivity) {
            super(0);
            this.f94628a = creatorToolsActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C43047dm invoke() {
            PowerList powerList = (PowerList) this.f94628a._$_findCachedViewById(R.id.d54);
            C89219l.m154716b(powerList, "");
            return new C43047dm(powerList);
        }
    }

    /* renamed from: b */
    public final String mo69520b() {
        String a;
        Intent intent = getIntent();
        if (intent == null || (a = m81677a(intent, "PRO_ENTER_FROM")) == null) {
            return "";
        }
        return a;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        AbstractC3054d dVar = this.f94582b;
        if (dVar != null) {
            dVar.mo8277a();
        }
        this.f94588i.mo142944a();
        if (EventBus.m156962a().mo145393a(this)) {
            EventBus.m156962a().mo145395b(this);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity", "onResume", true);
        super.onResume();
        C40941f fVar = this.f94597r;
        if (fVar != null) {
            fVar.mo70126a(C40416ar.f94625a);
        }
        C40941f fVar2 = this.f94594o;
        if (fVar2 != null) {
            fVar2.mo70126a(C40417as.f94626a);
        }
        C40941f fVar3 = this.f94601v;
        if (fVar3 != null) {
            fVar3.mo70126a(C40418at.f94627a);
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity", "onResume", false);
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

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onSwitchBusinessAccountSuccessEvent(C68070e eVar) {
        finish();
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$ae */
    public static final class C40398ae implements AbstractC40453a {

        /* renamed from: a */
        final /* synthetic */ CreatorToolsActivity f94607a;

        static {
            Covode.recordClassIndex(48200);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40398ae(CreatorToolsActivity creatorToolsActivity) {
            this.f94607a = creatorToolsActivity;
        }

        @Override // com.p2082ss.android.ugc.aweme.creatortools.api.AbstractC40453a
        /* renamed from: a */
        public final void mo69524a(C40454b bVar) {
            this.f94607a.mo69518a(bVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$an */
    public static final class C40409an implements AbstractC11827c {

        /* renamed from: a */
        final /* synthetic */ CreatorToolsActivity f94618a;

        static {
            Covode.recordClassIndex(48211);
        }

        @Override // com.bytedance.android.livesdkapi.p699l.AbstractC11827c
        /* renamed from: a */
        public final void mo14879a(Throwable th) {
            C89219l.m154721d(th, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C40409an(CreatorToolsActivity creatorToolsActivity) {
            this.f94618a = creatorToolsActivity;
        }

        @Override // com.bytedance.android.livesdkapi.p699l.AbstractC11827c
        /* renamed from: a */
        public final void mo14878a(Boolean bool, C11826b bVar, C11825a aVar) {
            if (C11279p.m20012a(bool)) {
                CreatorToolsActivity creatorToolsActivity = this.f94618a;
                C40937d dVar = creatorToolsActivity.f94585e;
                if (dVar != null) {
                    dVar.mo70126a(C40441t.f94657a);
                }
                C40941f fVar = creatorToolsActivity.f94583c;
                if (fVar != null) {
                    fVar.mo70126a(new C40442u(creatorToolsActivity));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$ab */
    static final class C40395ab extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C40395ab f94604a = new C40395ab();

        static {
            Covode.recordClassIndex(48197);
        }

        C40395ab() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.drawable.bg7;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$ad */
    static final class C40397ad extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C40397ad f94606a = new C40397ad();

        static {
            Covode.recordClassIndex(48199);
        }

        C40397ad() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.drawable.bg8;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$ag */
    static final class C40400ag extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C40400ag f94609a = new C40400ag();

        static {
            Covode.recordClassIndex(48202);
        }

        C40400ag() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = 2131233703;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$ai */
    static final class View$OnClickListenerC40404ai implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CreatorToolsActivity f94613a;

        static {
            Covode.recordClassIndex(48206);
        }

        View$OnClickListenerC40404ai(CreatorToolsActivity creatorToolsActivity) {
            this.f94613a = creatorToolsActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f94613a.onBackPressed();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$aj */
    static final class C40405aj extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C40405aj f94614a = new C40405aj();

        static {
            Covode.recordClassIndex(48207);
        }

        C40405aj() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.drawable.bg9;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$al */
    static final class C40407al extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C40407al f94616a = new C40407al();

        static {
            Covode.recordClassIndex(48209);
        }

        C40407al() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.drawable.bg6;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$am */
    static final class C40408am extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C40408am f94617a = new C40408am();

        static {
            Covode.recordClassIndex(48210);
        }

        C40408am() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = 2131233710;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$d */
    public static final class C40423d implements AbstractC27645k<PromoteEntryCheck> {

        /* renamed from: a */
        final /* synthetic */ CreatorToolsActivity f94634a;

        /* renamed from: b */
        final /* synthetic */ String f94635b;

        /* renamed from: c */
        final /* synthetic */ int f94636c;

        /* renamed from: d */
        final /* synthetic */ int f94637d;

        static {
            Covode.recordClassIndex(48225);
        }

        /* renamed from: a */
        private static Context m81687a(CreatorToolsActivity creatorToolsActivity) {
            Context applicationContext = creatorToolsActivity.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                return C58003a.f132199a;
            }
            return applicationContext;
        }

        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
        public final void onFailure(Throwable th) {
            C89219l.m154721d(th, "");
            new C79459a(m81687a(this.f94634a)).mo123050a(R.string.dck).mo123053a();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x007b, code lost:
            if (r9 != null) goto L_0x007d;
         */
        @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onSuccess(com.p2082ss.android.ugc.aweme.feed.model.PromoteEntryCheck r9) {
            /*
            // Method dump skipped, instructions count: 235
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.creatortools.CreatorToolsActivity.C40423d.onSuccess(java.lang.Object):void");
        }

        C40423d(CreatorToolsActivity creatorToolsActivity, String str, int i, int i2) {
            this.f94634a = creatorToolsActivity;
            this.f94635b = str;
            this.f94636c = i;
            this.f94637d = i2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$f */
    static final class C40425f extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C40425f f94639a = new C40425f();

        static {
            Covode.recordClassIndex(48227);
        }

        C40425f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = 2131233704;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$h */
    static final class C40427h extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C40427h f94641a = new C40427h();

        static {
            Covode.recordClassIndex(48229);
        }

        C40427h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.drawable.bfy;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$j */
    static final class C40429j extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C40429j f94643a = new C40429j();

        static {
            Covode.recordClassIndex(48231);
        }

        C40429j() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.drawable.bfz;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$l */
    static final class C40431l extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C40431l f94645a = new C40431l();

        static {
            Covode.recordClassIndex(48233);
        }

        C40431l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.drawable.bg0;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$o */
    static final class C40435o extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C40435o f94650a = new C40435o();

        static {
            Covode.recordClassIndex(48237);
        }

        C40435o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.drawable.bg1;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$r */
    static final class C40439r extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C40439r f94655a = new C40439r();

        static {
            Covode.recordClassIndex(48241);
        }

        C40439r() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.drawable.bg2;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$v */
    static final class C40444v extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C40444v f94660a = new C40444v();

        static {
            Covode.recordClassIndex(48246);
        }

        C40444v() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.drawable.bg4;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$x */
    static final class C40446x extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C40446x f94662a = new C40446x();

        static {
            Covode.recordClassIndex(48248);
        }

        C40446x() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.drawable.bg5;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$aa */
    static final class C40394aa extends AbstractC89220m implements AbstractC89172b<C34798f, C34798f> {

        /* renamed from: a */
        public static final C40394aa f94603a = new C40394aa();

        static {
            Covode.recordClassIndex(48196);
        }

        C40394aa() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34798f invoke(C34798f fVar) {
            C34798f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            return C34798f.m71064a(fVar2, null, false, null, null, null, null, false, false, null, false, false, null, null, 8063);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$af */
    static final class C40399af extends AbstractC89220m implements AbstractC89172b<C34797e, C34797e> {

        /* renamed from: a */
        public static final C40399af f94608a = new C40399af();

        static {
            Covode.recordClassIndex(48201);
        }

        C40399af() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34797e invoke(C34797e eVar) {
            C34797e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            return C34797e.m71059a(eVar2, null, false, true, null, 11);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$ak */
    static final class View$OnClickListenerC40406ak implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CreatorToolsActivity f94615a;

        static {
            Covode.recordClassIndex(48208);
        }

        View$OnClickListenerC40406ak(CreatorToolsActivity creatorToolsActivity) {
            this.f94615a = creatorToolsActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SmartRouter.buildRoute(this.f94615a, "aweme://account_settings_gifts_setting").withParam("bundle_video_gift_previous_page", "creator_tools").open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$ao */
    static final class C40410ao extends AbstractC89220m implements AbstractC89172b<C34797e, C34797e> {

        /* renamed from: a */
        final /* synthetic */ CreatorToolsActivity f94619a;

        static {
            Covode.recordClassIndex(48212);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40410ao(CreatorToolsActivity creatorToolsActivity) {
            super(1);
            this.f94619a = creatorToolsActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34797e invoke(C34797e eVar) {
            C34797e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            String string = this.f94619a.getString(R.string.b27);
            C89219l.m154716b(string, "");
            return C34797e.m71059a(eVar2, string, false, false, null, 14);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$ap */
    static final class C40411ap extends AbstractC89220m implements AbstractC89172b<C34797e, C34797e> {

        /* renamed from: a */
        final /* synthetic */ CreatorToolsActivity f94620a;

        static {
            Covode.recordClassIndex(48213);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40411ap(CreatorToolsActivity creatorToolsActivity) {
            super(1);
            this.f94620a = creatorToolsActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34797e invoke(C34797e eVar) {
            C34797e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            String string = this.f94620a.getString(R.string.b2l);
            C89219l.m154716b(string, "");
            return C34797e.m71059a(eVar2, string, false, false, null, 14);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$aq */
    static final class C40412aq extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C40412aq f94621a = new C40412aq();

        static {
            Covode.recordClassIndex(48214);
        }

        C40412aq() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C404131.f94622a);
            baseActivityViewModel2.config(C404142.f94623a);
            baseActivityViewModel2.config(C404153.f94624a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$ar */
    static final class C40416ar extends AbstractC89220m implements AbstractC89172b<C34798f, C34798f> {

        /* renamed from: a */
        public static final C40416ar f94625a = new C40416ar();

        static {
            Covode.recordClassIndex(48218);
        }

        C40416ar() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34798f invoke(C34798f fVar) {
            C34798f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            return C34798f.m71064a(fVar2, null, C80542hp.C80543a.m139625h(), null, null, null, null, false, false, null, false, false, null, null, 8189);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$as */
    static final class C40417as extends AbstractC89220m implements AbstractC89172b<C34798f, C34798f> {

        /* renamed from: a */
        public static final C40417as f94626a = new C40417as();

        static {
            Covode.recordClassIndex(48219);
        }

        C40417as() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34798f invoke(C34798f fVar) {
            C34798f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            return C34798f.m71064a(fVar2, null, C80542hp.C80543a.m139624g(), null, null, null, null, false, false, null, false, false, null, null, 8189);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$at */
    static final class C40418at extends AbstractC89220m implements AbstractC89172b<C34798f, C34798f> {

        /* renamed from: a */
        public static final C40418at f94627a = new C40418at();

        static {
            Covode.recordClassIndex(48220);
        }

        C40418at() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34798f invoke(C34798f fVar) {
            C34798f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            return C34798f.m71064a(fVar2, null, C80586is.m139724a(), null, null, null, null, false, false, null, false, false, null, null, 8189);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$c */
    public static final class C40422c extends AbstractC89220m implements AbstractC89172b<C34798f, C34798f> {

        /* renamed from: a */
        public static final C40422c f94633a = new C40422c();

        static {
            Covode.recordClassIndex(48224);
        }

        C40422c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34798f invoke(C34798f fVar) {
            C34798f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            return C34798f.m71064a(fVar2, null, false, null, null, null, null, false, false, null, false, false, null, null, 8063);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$e */
    static final class C40424e extends AbstractC89220m implements AbstractC89172b<C34797e, C34797e> {

        /* renamed from: a */
        public static final C40424e f94638a = new C40424e();

        static {
            Covode.recordClassIndex(48226);
        }

        C40424e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34797e invoke(C34797e eVar) {
            C34797e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            return C34797e.m71059a(eVar2, null, false, false, null, 11);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$n */
    static final class C40434n extends AbstractC89220m implements AbstractC89172b<C34798f, C34798f> {

        /* renamed from: a */
        public static final C40434n f94649a = new C40434n();

        static {
            Covode.recordClassIndex(48236);
        }

        C40434n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34798f invoke(C34798f fVar) {
            C34798f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            return C34798f.m71064a(fVar2, null, false, null, null, null, null, false, false, null, false, false, null, null, 8063);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$q */
    static final class C40438q extends AbstractC89220m implements AbstractC89172b<C34798f, C34798f> {

        /* renamed from: a */
        public static final C40438q f94654a = new C40438q();

        static {
            Covode.recordClassIndex(48240);
        }

        C40438q() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34798f invoke(C34798f fVar) {
            C34798f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            return C34798f.m71064a(fVar2, null, false, null, null, null, null, false, false, null, false, false, null, null, 8063);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$t */
    static final class C40441t extends AbstractC89220m implements AbstractC89172b<C34797e, C34797e> {

        /* renamed from: a */
        public static final C40441t f94657a = new C40441t();

        static {
            Covode.recordClassIndex(48243);
        }

        C40441t() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34797e invoke(C34797e eVar) {
            C34797e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            return C34797e.m71059a(eVar2, null, false, true, null, 11);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$w */
    static final class View$OnClickListenerC40445w implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CreatorToolsActivity f94661a;

        static {
            Covode.recordClassIndex(48247);
        }

        View$OnClickListenerC40445w(CreatorToolsActivity creatorToolsActivity) {
            this.f94661a = creatorToolsActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            MixFeedService.m109435k().mo97317a(this.f94661a.mo69520b(), this.f94661a.mo69520b(), this.f94661a);
        }
    }

    /* renamed from: a */
    public final void mo69519a(String str) {
        C39162r.m79460a(str, new C33744d().mo59983a("enter_from", mo69520b()).f79943a);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onJsBroadCastEvent(C47959j jVar) {
        C89219l.m154721d(jVar, "");
        if (C89219l.m154714a((Object) jVar.f111077b.optString("eventName"), (Object) "cla_crowdsourcing_onboarding_complete")) {
            C47036n.f109585a = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$b */
    public static final class C40420b extends AbstractC89220m implements AbstractC89172b<C34798f, C34798f> {

        /* renamed from: a */
        final /* synthetic */ CreatorToolsActivity f94629a;

        /* renamed from: b */
        final /* synthetic */ C40454b f94630b;

        /* renamed from: c */
        final /* synthetic */ String f94631c;

        static {
            Covode.recordClassIndex(48222);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40420b(CreatorToolsActivity creatorToolsActivity, C40454b bVar, String str) {
            super(1);
            this.f94629a = creatorToolsActivity;
            this.f94630b = bVar;
            this.f94631c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34798f invoke(C34798f fVar) {
            C34798f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            return C34798f.m71064a(fVar2, null, false, null, null, null, null, false, true, null, false, false, new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.creatortools.CreatorToolsActivity.C40420b.View$OnClickListenerC404211 */

                /* renamed from: a */
                final /* synthetic */ C40420b f94632a;

                static {
                    Covode.recordClassIndex(48223);
                }

                {
                    this.f94632a = r1;
                }

                public final void onClick(View view) {
                    String str;
                    ClickAgent.onClick(view);
                    this.f94632a.f94629a.mo69519a("click_creator_showcase");
                    SmartRouter.buildRoute(this.f94632a.f94629a, this.f94632a.f94630b.f94675c).open();
                    C33744d a = new C33744d().mo59983a("EVENT_ORIGIN_FEATURE", "TEMAI").mo59983a("page_name", "creator_tools");
                    IAccountUserService g = C31575b.m65865g();
                    C89219l.m154716b(g, "");
                    C33744d a2 = a.mo59983a("author_id", g.getCurUserId()).mo59983a("country", this.f94632a.f94631c).mo59983a("click_for", "tiktok_showcase");
                    String str2 = "yes";
                    if (this.f94632a.f94630b.f94674b) {
                        str = str2;
                    } else {
                        str = "no";
                    }
                    C33744d a3 = a2.mo59983a("is_onboard_ecom", str);
                    if (!C40450a.m81688a()) {
                        str2 = "no";
                    }
                    C39162r.m79460a("tiktokec_creator_tools_module_click", a3.mo59983a("enable_showcase", str2).f79943a);
                }
            }, null, 6015);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$g */
    static final class View$OnClickListenerC40426g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CreatorToolsActivity f94640a;

        static {
            Covode.recordClassIndex(48228);
        }

        View$OnClickListenerC40426g(CreatorToolsActivity creatorToolsActivity) {
            this.f94640a = creatorToolsActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Context applicationContext = this.f94640a.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            SmartRouter.buildRoute(applicationContext, new C29844g(CreatorToolsAgencyCenterUrl.INSTANCE.getValue()).mo52126a()).open();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$m */
    static final class C40432m extends AbstractC89220m implements AbstractC89172b<C34798f, C34798f> {

        /* renamed from: a */
        final /* synthetic */ CreatorToolsActivity f94646a;

        /* renamed from: b */
        final /* synthetic */ C60830h.C60831a f94647b;

        static {
            Covode.recordClassIndex(48234);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40432m(CreatorToolsActivity creatorToolsActivity, C60830h.C60831a aVar) {
            super(1);
            this.f94646a = creatorToolsActivity;
            this.f94647b = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34798f invoke(C34798f fVar) {
            C34798f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            return C34798f.m71064a(fVar2, null, false, null, null, null, null, false, true, null, false, false, new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.creatortools.CreatorToolsActivity.C40432m.View$OnClickListenerC404331 */

                /* renamed from: a */
                final /* synthetic */ C40432m f94648a;

                static {
                    Covode.recordClassIndex(48235);
                }

                {
                    this.f94648a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    this.f94648a.f94647b.mo98236a("process_id", this.f94648a.f94646a.f94581a);
                    SmartRouter.buildRoute(this.f94648a.f94646a, this.f94648a.f94647b.mo98235a().toString()).open();
                    C39162r.m79460a("click_creator_fund", new C33744d().mo59983a("enter_from", this.f94648a.f94646a.mo69520b()).mo59983a("process_id", this.f94648a.f94646a.f94581a).f79943a);
                }
            }, null, 6015);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$p */
    static final class C40436p extends AbstractC89220m implements AbstractC89172b<C34798f, C34798f> {

        /* renamed from: a */
        final /* synthetic */ CreatorToolsActivity f94651a;

        /* renamed from: b */
        final /* synthetic */ C89233z.C89238e f94652b;

        static {
            Covode.recordClassIndex(48238);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40436p(CreatorToolsActivity creatorToolsActivity, C89233z.C89238e eVar) {
            super(1);
            this.f94651a = creatorToolsActivity;
            this.f94652b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34798f invoke(C34798f fVar) {
            C34798f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            return C34798f.m71064a(fVar2, null, false, null, null, null, null, false, true, null, false, false, new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.creatortools.CreatorToolsActivity.C40436p.View$OnClickListenerC404371 */

                /* renamed from: a */
                final /* synthetic */ C40436p f94653a;

                static {
                    Covode.recordClassIndex(48239);
                }

                {
                    this.f94653a = r1;
                }

                public final void onClick(View view) {
                    String str;
                    CommerceUserInfo commerceUserInfo;
                    ClickAgent.onClick(view);
                    C60830h.C60831a a = C60830h.m110432a(this.f94653a.f94652b.element);
                    IAccountUserService g = C31575b.m65865g();
                    C89219l.m154716b(g, "");
                    User curUser = g.getCurUser();
                    if (curUser == null || (commerceUserInfo = curUser.getCommerceUserInfo()) == null || commerceUserInfo.getStarAtlas() != 1) {
                        str = "0";
                    } else {
                        str = "1";
                    }
                    a.mo98236a("isTCMCreator", str);
                    SmartRouter.buildRoute(this.f94653a.f94651a, a.mo98235a().toString()).open();
                    this.f94653a.f94651a.mo69519a("enter_marketplace");
                    C39162r.m79460a("click_creator_marketplace", new C33744d().mo59983a("enter_from", "creator_account").mo59983a("process_id", this.f94653a.f94651a.f94581a).f79943a);
                    IAccountUserService g2 = C31575b.m65865g();
                    C89219l.m154716b(g2, "");
                    User curUser2 = g2.getCurUser();
                    C89219l.m154716b(curUser2, "");
                    SharedPreferences.Editor edit = C34822d.m71158a(C51427a.f118503a, "tcm_pro_account", 0).edit();
                    edit.putBoolean("tcm_first_dot" + curUser2.getUid(), false);
                    edit.apply();
                }
            }, null, 6015);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$u */
    static final class C40442u extends AbstractC89220m implements AbstractC89172b<C34798f, C34798f> {

        /* renamed from: a */
        final /* synthetic */ CreatorToolsActivity f94658a;

        static {
            Covode.recordClassIndex(48244);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40442u(CreatorToolsActivity creatorToolsActivity) {
            super(1);
            this.f94658a = creatorToolsActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34798f invoke(C34798f fVar) {
            C34798f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            return C34798f.m71064a(fVar2, null, false, null, null, null, null, false, true, null, false, false, new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.creatortools.CreatorToolsActivity.C40442u.View$OnClickListenerC404431 */

                /* renamed from: a */
                final /* synthetic */ C40442u f94659a;

                static {
                    Covode.recordClassIndex(48245);
                }

                {
                    this.f94659a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    Context applicationContext = this.f94659a.f94658a.getApplicationContext();
                    if (C58003a.f132201c && applicationContext == null) {
                        applicationContext = C58003a.f132199a;
                    }
                    C29844g gVar = new C29844g("sslocal://webcast_lynxview");
                    gVar.mo52130a("url", CreatorToolsLiveCenterUrl.INSTANCE.getValue());
                    gVar.mo52130a("enter_from", "creator_tools");
                    gVar.mo52128a("should_full_screen", 1);
                    gVar.mo52128a("hide_nav_bar", 1);
                    gVar.mo52128a("hide_loading", 1);
                    C31575b.m65859a();
                    IAccountUserService e = C31575b.f75524a.mo57069e();
                    C89219l.m154716b(e, "");
                    gVar.mo52130a("anchor_id", e.getCurUserId());
                    SmartRouter.buildRoute(applicationContext, gVar.mo52126a()).open();
                }
            }, null, 6015);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$y */
    static final class View$OnClickListenerC40447y implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CreatorToolsActivity f94663a;

        /* renamed from: b */
        final /* synthetic */ int f94664b;

        /* renamed from: c */
        final /* synthetic */ C89233z.C89236c f94665c;

        static {
            Covode.recordClassIndex(48249);
        }

        View$OnClickListenerC40447y(CreatorToolsActivity creatorToolsActivity, int i, C89233z.C89236c cVar) {
            this.f94663a = creatorToolsActivity;
            this.f94664b = i;
            this.f94665c = cVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                C27646l.m55298a(PromoteEntryCheckApi.C67995a.m120304a().getPromoteEntryCheck("", "creator_tools"), new C40423d(this.f94663a, "creator_tools", this.f94664b, this.f94665c.element), ExecutorC34605m.f81660a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$z */
    static final class C40448z extends AbstractC89220m implements AbstractC89172b<C34798f, C34798f> {

        /* renamed from: a */
        final /* synthetic */ CreatorToolsActivity f94666a;

        static {
            Covode.recordClassIndex(48250);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40448z(CreatorToolsActivity creatorToolsActivity) {
            super(1);
            this.f94666a = creatorToolsActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C34798f invoke(C34798f fVar) {
            C34798f fVar2 = fVar;
            C89219l.m154721d(fVar2, "");
            return C34798f.m71064a(fVar2, null, false, null, null, null, null, false, true, null, false, false, new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.creatortools.CreatorToolsActivity.C40448z.View$OnClickListenerC404491 */

                /* renamed from: a */
                final /* synthetic */ C40448z f94667a;

                static {
                    Covode.recordClassIndex(48251);
                }

                {
                    this.f94667a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    IAccountUserService g = C31575b.m65865g();
                    C89219l.m154716b(g, "");
                    User curUser = g.getCurUser();
                    C89219l.m154716b(curUser, "");
                    Keva.getRepo("keva_repo_qa").storeBoolean("keva_key_public_qna_setting" + curUser.getUid(), true);
                    SmartRouter.buildRoute(this.f94667a.f94666a, "aweme://user/qna/profile/" + curUser.getUid()).withParam("enter_from", "creator_tools").withParam("enter_method", "creator_tools").open();
                }
            }, null, 6015);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$ac */
    static final class View$OnClickListenerC40396ac implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CreatorToolsActivity f94605a;

        static {
            Covode.recordClassIndex(48198);
        }

        View$OnClickListenerC40396ac(CreatorToolsActivity creatorToolsActivity) {
            this.f94605a = creatorToolsActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C39162r.m79462a("click_tiktok_shoutouts", C89387v.m154943a(this.f94605a.mo69520b(), "enter_from"), C89387v.m154943a(this.f94605a.f94581a, "process_id"));
            C89219l.m154716b(view, "");
            Context context = view.getContext();
            C89219l.m154716b(context, "");
            String b = this.f94605a.mo69520b();
            String str = this.f94605a.f94581a;
            C89219l.m154721d(context, "");
            C89219l.m154721d(b, "");
            C89219l.m154721d(str, "");
            C74387a.m130855b(context, "https://www.tiktok.com/web-inapp/shoutouts/creator/entry/?enter_from=" + b + "&process_id=" + str + "&hide_nav_bar=1");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$ah */
    static final class View$OnClickListenerC40401ah implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CreatorToolsActivity f94610a;

        static {
            Covode.recordClassIndex(48203);
        }

        View$OnClickListenerC40401ah(CreatorToolsActivity creatorToolsActivity) {
            this.f94610a = creatorToolsActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC3054d dVar = this.f94610a.f94582b;
            if (dVar != null) {
                C89219l.m154716b(view, "");
                Context context = view.getContext();
                C89219l.m154716b(context, "");
                dVar.mo8278a(context, false, new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.creatortools.CreatorToolsActivity.View$OnClickListenerC40401ah.C404021 */

                    /* renamed from: a */
                    final /* synthetic */ View$OnClickListenerC40401ah f94611a;

                    static {
                        Covode.recordClassIndex(48204);
                    }

                    {
                        this.f94611a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        SmartRouter.buildRoute(this.f94611a.f94610a, "//live/container").withParam("fragment_type", "subscribe").open();
                        return C89391z.f203057a;
                    }
                });
            }
            C40941f fVar = this.f94610a.f94584d;
            if (fVar != null) {
                fVar.mo70126a(C404032.f94612a);
            }
            Keva repo = Keva.getRepo("keva_repo_subs");
            StringBuilder sb = new StringBuilder("keva_key_red_dot");
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            repo.storeBoolean(sb.append(g.getCurUserId()).toString(), false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$k */
    static final class View$OnClickListenerC40430k implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CreatorToolsActivity f94644a;

        static {
            Covode.recordClassIndex(48232);
        }

        View$OnClickListenerC40430k(CreatorToolsActivity creatorToolsActivity) {
            this.f94644a = creatorToolsActivity;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Context applicationContext = this.f94644a.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            C29844g gVar = new C29844g("aweme://webview");
            StringBuilder sb = new StringBuilder("https://www.tiktok.com/web-inapp/cla/crowdsourcing/translation-center?enter_from=settings&translator_id=");
            C31575b.m65859a();
            IAccountUserService e = C31575b.f75524a.mo57069e();
            C89219l.m154716b(e, "");
            gVar.mo52130a("url", sb.append(e.getCurUserId()).toString());
            gVar.mo52128a("should_full_screen", 1);
            gVar.mo52128a("hide_nav_bar", 1);
            SmartRouter.buildRoute(applicationContext, gVar.mo52126a()).open();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (r3 == null) goto L_0x001d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m81679b(java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 105
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.creatortools.CreatorToolsActivity.m81679b(java.lang.String):void");
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$i */
    static final class View$OnClickListenerC40428i implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CreatorToolsActivity f94642a;

        static {
            Covode.recordClassIndex(48230);
        }

        View$OnClickListenerC40428i(CreatorToolsActivity creatorToolsActivity) {
            this.f94642a = creatorToolsActivity;
        }

        public final void onClick(View view) {
            int i;
            int dimensionPixelSize;
            ClickAgent.onClick(view);
            CreatorToolsActivity creatorToolsActivity = this.f94642a;
            int identifier = creatorToolsActivity.getResources().getIdentifier("status_bar_height", "dimen", "android");
            if (identifier <= 0 || (dimensionPixelSize = creatorToolsActivity.getResources().getDimensionPixelSize(identifier)) <= 0) {
                i = 44;
            } else {
                i = C13628n.m24522c(this.f94642a, (float) dimensionPixelSize);
            }
            C68687b.m121121a(this.f94642a, "https://www.tiktok.com/insight?hide_nav_bar=1&full_screen=1&status_bar_height=".concat(String.valueOf(i)), new HashMap());
            C39162r.m79462a("click_creator_analytics", C89387v.m154943a("creator_account", "enter_from"), C89387v.m154943a(this.f94642a.f94581a, "process_id"));
            C39162r.m79460a("click_insight", new C33744d().mo59983a("enter_from", this.f94642a.mo69520b()).mo59983a("previous_page", "settings_page").mo59983a("enter_method", "click_button").f79943a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.creatortools.CreatorToolsActivity$s */
    static final class View$OnClickListenerC40440s implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CreatorToolsActivity f94656a;

        static {
            Covode.recordClassIndex(48242);
        }

        View$OnClickListenerC40440s(CreatorToolsActivity creatorToolsActivity) {
            this.f94656a = creatorToolsActivity;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            this.f94656a.mo69519a("click_creator_portal");
            CreatorToolsActivity creatorToolsActivity = this.f94656a;
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = CreatorToolsActivity.m81678a();
            }
            if (!C58029j.f132256h) {
                new C79459a(creatorToolsActivity).mo123050a(R.string.dcq).mo123053a();
                return;
            }
            String h = SettingServiceImpl.m120782v().mo108872h();
            Objects.requireNonNull(h, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = h.toLowerCase();
            C89219l.m154716b(lowerCase, "");
            String g = C58071d.m104913g();
            if (g != null) {
                Objects.requireNonNull(g, "null cannot be cast to non-null type java.lang.String");
                str = g.toLowerCase();
                C89219l.m154716b(str, "");
            } else {
                str = null;
            }
            String str2 = "/en-us/";
            Set a = C89047am.m154438a((Object[]) new String[]{str2, "/en-gb/", "/pt-br/", "/ja-jp/"});
            if (!TextUtils.isEmpty(lowerCase) && !TextUtils.isEmpty(str)) {
                String str3 = "/" + lowerCase + '-' + str + '/';
                if (a.contains(str3)) {
                    str2 = str3;
                }
            }
            SmartRouter.buildRoute(creatorToolsActivity, "aweme://webview").withParam("url", new C29844g("https://www.tiktok.com/creators/creator-portal".concat(String.valueOf(str2))).mo52126a()).withParam("title", creatorToolsActivity.getString(R.string.b3d)).open();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002a, code lost:
        if (r4 == null) goto L_0x002c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo69518a(com.p2082ss.android.ugc.aweme.creatortools.api.C40454b r9) {
        /*
        // Method dump skipped, instructions count: 172
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.creatortools.CreatorToolsActivity.mo69518a(com.ss.android.ugc.aweme.creatortools.api.b):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0628, code lost:
        if (r2.f94777a == true) goto L_0x062a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x06ce  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x042d  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0439  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0470  */
    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r23) {
        /*
        // Method dump skipped, instructions count: 1835
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.creatortools.CreatorToolsActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    private static String m81677a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }
}
