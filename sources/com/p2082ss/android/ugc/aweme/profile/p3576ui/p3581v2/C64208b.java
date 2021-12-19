package com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.analytics.page.AbstractC2599d;
import com.bytedance.assem.arch.core.Assembler;
import com.bytedance.assem.arch.core.C12759i;
import com.bytedance.assem.arch.core.C12767q;
import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.extensions.C12780d;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hox.p1106a.AbstractC15497d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.widget.C23669c;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.account.login.C32816w;
import com.p2082ss.android.ugc.aweme.analysis.Analysis;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34569a;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34572c;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34573d;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.consent.AbstractC39273a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50104bc;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59254s;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3568b.C63498e;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63980al;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64149b;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.views.DonationLinkView;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.views.ProfileLiveEventView;
import com.p2082ss.android.ugc.aweme.profile.viewmodel.ProfileViewModel;
import com.p2082ss.android.ugc.aweme.profile.widgets.MyProfileGuideWidgetV2;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.C64574b;
import com.p2082ss.android.ugc.aweme.profile.widgets.navbar.C64935a;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3582a.C64487c;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.AbstractC64533h;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3583b.C64523d;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3584c.p3585a.C64555a;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3586d.C64649a;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3586d.C64657d;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3587e.C64668a;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3588f.C64685a;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3590g.C64770a;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3590g.p3591a.C64776a;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3590g.p3593c.C64866a;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64870a;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3596i.C64873a;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3597j.C64884a;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3598k.C64900a;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3599l.C64914a;
import com.p2082ss.android.ugc.aweme.profile.widgets.translations.TranslationsAssem;
import com.p2082ss.android.ugc.aweme.profile.widgets.userId.C65198b;
import com.p2082ss.android.ugc.aweme.profile.widgets.userId.C65201d;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.permission.C80611a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88430c;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4589j.C88934a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89386u;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.b */
public final class C64208b extends AbstractC63980al implements AbstractC2599d, AbstractC15497d, AbstractC59254s, AbstractC64149b, AbstractC64313x, AbstractC90252i, AbstractC90253j {

    /* renamed from: A */
    private final C88411a f145640A = new C88411a();

    /* renamed from: B */
    private AbstractC50104bc f145641B;

    /* renamed from: C */
    private SparseArray f145642C;

    /* renamed from: u */
    public boolean f145643u;

    /* renamed from: v */
    private boolean f145644v = true;

    /* renamed from: w */
    private String f145645w;

    /* renamed from: y */
    private boolean f145646y;

    /* renamed from: z */
    private int f145647z;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.b$e */
    static final class C64213e<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C64213e f145654a = new C64213e();

        static {
            Covode.recordClassIndex(75658);
        }

        C64213e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(75653);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63980al
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    /* renamed from: a */
    public final View mo103791a(int i) {
        if (this.f145642C == null) {
            this.f145642C = new SparseArray();
        }
        View view = (View) this.f145642C.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f145642C.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.analytics.page.AbstractC2599d
    public final String ah_() {
        return "MainTabPage";
    }

    @Override // com.bytedance.analytics.page.AbstractC2597b
    public final String bv_() {
        return "USER";
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(72, new RunnableC90250g(C64208b.class, "onUpdateUserEvent", C34572c.class, ThreadMode.POSTING, 0, false));
        hashMap.put(34, new RunnableC90250g(C64208b.class, "onAntiCrawlerEvent", C34569a.class, ThreadMode.POSTING, 0, false));
        hashMap.put(73, new RunnableC90250g(C64208b.class, "onUpdateUserSuccessEvent", C34573d.class, ThreadMode.POSTING, 0, false));
        hashMap.put(74, new RunnableC90250g(C64208b.class, "onSaveUserDataEvent", C63498e.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63980al
    /* renamed from: k */
    public final int mo103549k() {
        return R.layout.an9;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63980al
    /* renamed from: l */
    public final boolean mo103550l() {
        return true;
    }

    @Override // com.bytedance.analytics.page.AbstractC2597b
    public final String ag_() {
        return String.valueOf(2614219);
    }

    @Override // com.bytedance.analytics.page.AbstractC2597b
    /* renamed from: c */
    public final Map<String, String> mo7085c() {
        return AbstractC2599d.C2600a.m7545a(this);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.service.a' to match base method */
    @Override // com.bytedance.assem.arch.service.AbstractC12799b
    /* renamed from: e */
    public final /* synthetic */ C64312w mo20658e() {
        return new C64312w();
    }

    /* renamed from: r */
    private static boolean m116117r() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59254s
    /* renamed from: f */
    public final String mo96829f() {
        if (this.f145101j == 0) {
            return "personal_homepage";
        }
        return "personal_collection";
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        EventBus.m156962a().mo145395b(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f145642C;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C31575b.m65865g().updateLeaveTime(System.currentTimeMillis());
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.p2082ss.android.ugc.aweme.analysis.AbstractC33501c
    /* renamed from: F */
    public final Analysis mo59595F() {
        Analysis labelName = new Analysis().setLabelName("personal_homepage");
        C89219l.m154716b(labelName, "");
        return labelName;
    }

    /* renamed from: o */
    public final void mo103794o() {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        this.f145103l = g.getCurUser();
        m116115c(this.f145103l);
        if (C31575b.m65865g().shouldRefresh() || this.f145646y) {
            m116116q();
        }
        this.f145646y = false;
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        AbstractC88412b d = AbstractC88979t.m154296a(AbstractC88979t.m154310b(C39223a.m79604r()), C17873f.m33097e(), C64239j.f145683a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143289d(C64240k.f145684a);
        C89219l.m154716b(d, "");
        C88934a.m154195a(d, this.f145640A);
        if (this.f145643u) {
            mo103552n();
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63980al, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        AbstractC88412b d = AbstractC88979t.m154310b(C39223a.m79604r()).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143289d(C64241l.f145685a);
        C89219l.m154716b(d, "");
        C88934a.m154195a(d, this.f145640A);
        mo103794o();
        this.f145644v = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64313x
    /* renamed from: p */
    public final void mo103799p() {
        AbstractC50104bc bcVar = this.f145641B;
        if (bcVar != null) {
            bcVar.mo85241a();
        } else if (getActivity() != null) {
            ActivityC0945e activity = getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            if (!activity.isFinishing()) {
                ActivityC0945e activity2 = getActivity();
                if (activity2 == null) {
                    C89219l.m154715b();
                }
                activity2.finish();
            }
        }
    }

    /* renamed from: q */
    private final void m116116q() {
        if (this.f43437f && !this.f145644v) {
            getActivity();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m116117r();
            }
            if (!C58029j.f132256h) {
                new C79459a(getActivity()).mo123050a(R.string.dcq).mo123053a();
            } else {
                AbstractC64616j.C64617a.m116533a((AbstractC64616j) C12801d.m23017a(this, C89204ab.m154669a(AbstractC64616j.class)), null, 3);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008e, code lost:
        if (r1.containsKey(r0.getCurUserId()) != false) goto L_0x0090;
     */
    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63980al
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo103547i() {
        /*
        // Method dump skipped, instructions count: 200
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64208b.mo103547i():void");
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64149b
    /* renamed from: a */
    public final void mo103744a(AbstractC50104bc bcVar) {
        this.f145641B = bcVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64313x
    /* renamed from: b */
    public final void mo103793b(User user) {
        this.f145103l = user;
    }

    @AbstractC90264r
    public final void onSaveUserDataEvent(C63498e eVar) {
        this.f145646y = true;
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.b$k */
    static final class C64240k<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C64240k f145684a = new C64240k();

        static {
            Covode.recordClassIndex(75685);
        }

        C64240k() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C64209a aVar = (C64209a) obj;
            if (aVar.f145648a && C17873f.f42636l) {
                aVar.f145649b.mo68645h();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.b$l */
    static final class C64241l<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C64241l f145685a = new C64241l();

        static {
            Covode.recordClassIndex(75686);
        }

        C64241l() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ITpcConsentService iTpcConsentService = (ITpcConsentService) obj;
            C89219l.m154721d(iTpcConsentService, "");
            iTpcConsentService.mo68646i();
        }
    }

    @AbstractC90264r
    public final void onUpdateUserSuccessEvent(C34573d dVar) {
        C89219l.m154721d(dVar, "");
        C31575b.m65865g().queryUser();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.b$b */
    public static final class C64210b extends AbstractC89220m implements AbstractC89172b<C64312w, C64312w> {

        /* renamed from: a */
        public static final C64210b f145651a = new C64210b();

        static {
            Covode.recordClassIndex(75655);
        }

        C64210b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C64312w invoke(C64312w wVar) {
            C64312w wVar2 = wVar;
            if (wVar2 != null) {
                return C64312w.m116170a(wVar2, null, new C12776a(C89391z.f203057a), null, null, false, false, 61);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.b$c */
    static final class C64211c<T> implements AbstractC88983w {

        /* renamed from: a */
        public static final C64211c f145652a = new C64211c();

        static {
            Covode.recordClassIndex(75656);
        }

        C64211c() {
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<String> vVar) {
            C89219l.m154721d(vVar, "");
            vVar.mo143031a(C31575b.m65865g().queryUserPermission().toString());
            vVar.mo143023a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.b$h */
    static final class C64237h extends AbstractC89220m implements AbstractC89172b<C64312w, C64312w> {

        /* renamed from: a */
        public static final C64237h f145681a = new C64237h();

        static {
            Covode.recordClassIndex(75682);
        }

        C64237h() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C64312w invoke(C64312w wVar) {
            C64312w wVar2 = wVar;
            if (wVar2 != null) {
                return C64312w.m116170a(wVar2, null, null, new C12776a(true), null, false, false, 59);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.b$i */
    static final class C64238i extends AbstractC89220m implements AbstractC89172b<C64312w, C64312w> {

        /* renamed from: a */
        public static final C64238i f145682a = new C64238i();

        static {
            Covode.recordClassIndex(75683);
        }

        C64238i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C64312w invoke(C64312w wVar) {
            C64312w wVar2 = wVar;
            if (wVar2 != null) {
                return C64312w.m116170a(wVar2, null, null, new C12776a(false), null, false, false, 59);
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.b$m */
    public static final class C64242m extends AbstractC89220m implements AbstractC89172b<C64312w, C64312w> {

        /* renamed from: a */
        final /* synthetic */ User f145686a;

        static {
            Covode.recordClassIndex(75687);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64242m(User user) {
            super(1);
            this.f145686a = user;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C64312w invoke(C64312w wVar) {
            C64312w wVar2 = wVar;
            if (wVar2 != null) {
                return C64312w.m116170a(wVar2, new C12776a(this.f145686a), null, null, null, false, false, 62);
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.b$n */
    static final class C64243n extends AbstractC89220m implements AbstractC89172b<C64312w, C64312w> {

        /* renamed from: a */
        final /* synthetic */ boolean f145687a;

        static {
            Covode.recordClassIndex(75688);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64243n(boolean z) {
            super(1);
            this.f145687a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C64312w invoke(C64312w wVar) {
            C64312w wVar2 = wVar;
            if (wVar2 != null) {
                return C64312w.m116170a(wVar2, null, null, null, null, this.f145687a, false, 47);
            }
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64313x
    /* renamed from: a */
    public final void mo103792a(User user) {
        if (af_()) {
            ProfileViewModel profileViewModel = this.f145109r;
            if (user == null) {
                C89219l.m154715b();
            }
            profileViewModel.mo104028a(user);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63980al
    /* renamed from: b */
    public final void mo103544b(View view) {
        C89219l.m154721d(view, "");
        super.mo103544b(view);
        C12780d.m23005a(this, new C64214f(this, view));
    }

    @AbstractC90264r
    public final void onAntiCrawlerEvent(C34569a aVar) {
        C89219l.m154721d(aVar, "");
        String str = aVar.f81610a;
        if (str != null && C89361p.m154908a((CharSequence) str, (CharSequence) "/aweme/v1/user/profile/other/?", false)) {
            EventBus.m156962a().mo145397d(aVar);
            m116116q();
        }
    }

    @AbstractC90264r
    public final void onUpdateUserEvent(C34572c cVar) {
        C89219l.m154721d(cVar, "");
        this.f145646y = false;
        this.f145103l = cVar.f81612a;
        m116115c(this.f145103l);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.b$g */
    static final class C64236g extends AbstractC89220m implements AbstractC89172b<C64312w, C64312w> {

        /* renamed from: a */
        final /* synthetic */ int f145678a;

        /* renamed from: b */
        final /* synthetic */ int f145679b;

        /* renamed from: c */
        final /* synthetic */ Intent f145680c;

        static {
            Covode.recordClassIndex(75681);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64236g(int i, int i2, Intent intent) {
            super(1);
            this.f145678a = i;
            this.f145679b = i2;
            this.f145680c = intent;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C64312w invoke(C64312w wVar) {
            C64312w wVar2 = wVar;
            if (wVar2 != null) {
                return C64312w.m116170a(wVar2, null, null, null, new C12776a(new C89386u(Integer.valueOf(this.f145678a), Integer.valueOf(this.f145679b), this.f145680c)), false, false, 55);
            }
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63980al, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        this.f145096a = g.getCurUserId();
        IAccountUserService g2 = C31575b.m65865g();
        C89219l.m154716b(g2, "");
        this.f145097b = g2.getCurSecUserId();
        EventBus.m156966a(EventBus.m156962a(), this);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.b$d */
    static final class C64212d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C64212d f145653a = new C64212d();

        static {
            Covode.recordClassIndex(75657);
        }

        C64212d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str = (String) obj;
            C89219l.m154716b(str, "");
            C89219l.m154721d(str, "");
            if (C89361p.m154908a((CharSequence) str, (CharSequence) "permissions", false) && C89361p.m154908a((CharSequence) str, (CharSequence) "age_gate_region", false)) {
                HashMap hashMap = new HashMap();
                IAccountUserService g = C31575b.m65865g();
                C89219l.m154716b(g, "");
                hashMap.put(g.getCurUserId(), str);
                if (C32816w.f78184a.contains("user_permission_info")) {
                    C32816w.C32817a.m67393a(new JSONObject(C32816w.f78184a.getString("user_permission_info", "")), hashMap);
                }
                C32816w.f78184a.storeString("user_permission_info", new JSONObject(hashMap).toString());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.p3580d.AbstractC64149b
    /* renamed from: a */
    public final void mo103745a(String str) {
        AbstractC64533h hVar = (AbstractC64533h) C12801d.m23027d(this, C89204ab.m154669a(AbstractC64533h.class));
        if (hVar != null) {
            hVar.mo104116a(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.b$f */
    static final class C64214f extends AbstractC89220m implements AbstractC89172b<Assembler, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64208b f145655a;

        /* renamed from: b */
        final /* synthetic */ View f145656b;

        static {
            Covode.recordClassIndex(75659);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64214f(C64208b bVar, View view) {
            super(1);
            this.f145655a = bVar;
            this.f145656b = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Assembler assembler) {
            Assembler assembler2 = assembler;
            C89219l.m154721d(assembler2, "");
            assembler2.mo20576a(this.f145655a, (AbstractC89172b<? super C12759i<AbstractC12779c>, C89391z>) new AbstractC89172b<C12759i<AbstractC12779c>, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64208b.C64214f.C642151 */

                /* renamed from: a */
                final /* synthetic */ C64214f f145657a;

                static {
                    Covode.recordClassIndex(75660);
                }

                {
                    this.f145657a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12759i<AbstractC12779c> iVar) {
                    String str;
                    C12759i<AbstractC12779c> iVar2 = iVar;
                    C89219l.m154721d(iVar2, "");
                    String str2 = this.f145657a.f145655a.f145100e;
                    Bundle arguments = this.f145657a.f145655a.getArguments();
                    if (arguments != null) {
                        str = arguments.getString("enter_from");
                    } else {
                        str = null;
                    }
                    iVar2.mo20617a(new C64870a(str2, str, true, this.f145657a.f145655a.f145096a, this.f145657a.f145655a.f145097b));
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f145655a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64208b.C64214f.C6421812 */

                /* renamed from: a */
                final /* synthetic */ C64214f f145660a;

                static {
                    Covode.recordClassIndex(75663);
                }

                {
                    this.f145660a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C64574b.class));
                    qVar2.f31050b = new C64574b();
                    qVar2.f31053e = (RelativeLayout) this.f145660a.f145655a.mo103791a(R.id.d9f);
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f145655a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64208b.C64214f.C6422115 */

                /* renamed from: a */
                final /* synthetic */ C64214f f145663a;

                static {
                    Covode.recordClassIndex(75666);
                }

                {
                    this.f145663a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C64935a.class));
                    qVar2.f31050b = new C64935a();
                    qVar2.f31053e = (TuxNavBar) this.f145663a.f145655a.mo103791a(R.id.cpv);
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f145655a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64208b.C64214f.C6422216 */

                /* renamed from: a */
                final /* synthetic */ C64214f f145664a;

                static {
                    Covode.recordClassIndex(75667);
                }

                {
                    this.f145664a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C64866a.class));
                    qVar2.f31050b = new C64866a();
                    qVar2.f31053e = (ViewStub) this.f145664a.f145655a.getView().findViewById(R.id.d9p);
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f145655a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64208b.C64214f.C6422317 */

                /* renamed from: a */
                final /* synthetic */ C64214f f145665a;

                static {
                    Covode.recordClassIndex(75668);
                }

                {
                    this.f145665a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C64776a.class));
                    qVar2.f31050b = new C64776a();
                    qVar2.f31053e = this.f145665a.f145656b;
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f145655a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64208b.C64214f.C6422418 */

                /* renamed from: a */
                final /* synthetic */ C64214f f145666a;

                static {
                    Covode.recordClassIndex(75669);
                }

                {
                    this.f145666a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C64770a.class));
                    qVar2.f31050b = new C64770a();
                    qVar2.f31053e = this.f145666a.f145656b;
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f145655a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64208b.C64214f.C6422519 */

                /* renamed from: a */
                final /* synthetic */ C64214f f145667a;

                static {
                    Covode.recordClassIndex(75670);
                }

                {
                    this.f145667a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C64900a.class));
                    qVar2.f31050b = new C64900a();
                    qVar2.f31053e = (TuxTextView) this.f145667a.f145655a.mo103791a(R.id.fa9);
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f145655a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64208b.C64214f.C6422720 */

                /* renamed from: a */
                final /* synthetic */ C64214f f145669a;

                static {
                    Covode.recordClassIndex(75672);
                }

                {
                    this.f145669a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C65201d.class));
                    qVar2.f31050b = new C65201d();
                    qVar2.f31053e = (TuxTextView) this.f145669a.f145655a.mo103791a(R.id.f_q);
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f145655a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64208b.C64214f.C6422821 */

                /* renamed from: a */
                final /* synthetic */ C64214f f145670a;

                static {
                    Covode.recordClassIndex(75673);
                }

                {
                    this.f145670a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C65198b.class));
                    qVar2.f31050b = new C65198b();
                    qVar2.f31053e = (TuxTextView) this.f145670a.f145655a.mo103791a(R.id.f_k);
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f145655a, C642262.f145668a);
            assembler2.mo20582b(this.f145655a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64208b.C64214f.C642293 */

                /* renamed from: a */
                final /* synthetic */ C64214f f145671a;

                static {
                    Covode.recordClassIndex(75674);
                }

                {
                    this.f145671a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C64555a.class));
                    qVar2.f31050b = new C64555a();
                    qVar2.f31053e = (TuxButton) this.f145671a.f145655a.mo103791a(R.id.sj);
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f145655a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64208b.C64214f.C642304 */

                /* renamed from: a */
                final /* synthetic */ C64214f f145672a;

                static {
                    Covode.recordClassIndex(75675);
                }

                {
                    this.f145672a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C64668a.class));
                    qVar2.f31050b = new C64668a();
                    qVar2.f31053e = this.f145672a.f145656b;
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f145655a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64208b.C64214f.C642315 */

                /* renamed from: a */
                final /* synthetic */ C64214f f145673a;

                static {
                    Covode.recordClassIndex(75676);
                }

                {
                    this.f145673a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C64873a.class));
                    qVar2.f31050b = new C64873a();
                    qVar2.f31053e = (TuxTextView) this.f145673a.f145655a.mo103791a(R.id.f1t);
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f145655a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64208b.C64214f.C642326 */

                /* renamed from: a */
                final /* synthetic */ C64214f f145674a;

                static {
                    Covode.recordClassIndex(75677);
                }

                {
                    this.f145674a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(TranslationsAssem.class));
                    qVar2.f31050b = new TranslationsAssem();
                    qVar2.f31053e = (TuxTextView) this.f145674a.f145655a.mo103791a(R.id.f6f);
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f145655a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64208b.C64214f.C642337 */

                /* renamed from: a */
                final /* synthetic */ C64214f f145675a;

                static {
                    Covode.recordClassIndex(75678);
                }

                {
                    this.f145675a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C64487c.class));
                    qVar2.f31050b = new C64487c();
                    qVar2.f31053e = this.f145675a.f145656b;
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f145655a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64208b.C64214f.C642348 */

                /* renamed from: a */
                final /* synthetic */ C64214f f145676a;

                static {
                    Covode.recordClassIndex(75679);
                }

                {
                    this.f145676a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C64914a.class));
                    qVar2.f31050b = new C64914a();
                    qVar2.f31053e = (TuxTextView) this.f145676a.f145655a.mo103791a(R.id.f61);
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f145655a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64208b.C64214f.C642359 */

                /* renamed from: a */
                final /* synthetic */ C64214f f145677a;

                static {
                    Covode.recordClassIndex(75680);
                }

                {
                    this.f145677a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C64884a.class));
                    qVar2.f31050b = new C64884a();
                    qVar2.f31053e = (TuxTextView) this.f145677a.f145655a.mo103791a(R.id.e0h);
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f145655a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64208b.C64214f.C6421610 */

                /* renamed from: a */
                final /* synthetic */ C64214f f145658a;

                static {
                    Covode.recordClassIndex(75661);
                }

                {
                    this.f145658a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C64685a.class));
                    qVar2.f31050b = new C64685a();
                    qVar2.f31053e = (RelativeLayout) this.f145658a.f145655a.mo103791a(R.id.cpc);
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f145655a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64208b.C64214f.C6421711 */

                /* renamed from: a */
                final /* synthetic */ C64214f f145659a;

                static {
                    Covode.recordClassIndex(75662);
                }

                {
                    this.f145659a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C64649a.class));
                    qVar2.f31050b = new C64649a();
                    qVar2.f31053e = (DonationLinkView) this.f145659a.f145655a.mo103791a(R.id.ana);
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f145655a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64208b.C64214f.C6421913 */

                /* renamed from: a */
                final /* synthetic */ C64214f f145661a;

                static {
                    Covode.recordClassIndex(75664);
                }

                {
                    this.f145661a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C64657d.class));
                    qVar2.f31050b = new C64657d();
                    qVar2.f31053e = (ProfileLiveEventView) this.f145661a.f145655a.mo103791a(R.id.cax);
                    return C89391z.f203057a;
                }
            });
            assembler2.mo20582b(this.f145655a, new AbstractC89172b<C12767q, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64208b.C64214f.C6422014 */

                /* renamed from: a */
                final /* synthetic */ C64214f f145662a;

                static {
                    Covode.recordClassIndex(75665);
                }

                {
                    this.f145662a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C12767q qVar) {
                    C12767q qVar2 = qVar;
                    C89219l.m154721d(qVar2, "");
                    qVar2.mo20632a(C89204ab.m154669a(C64523d.class));
                    qVar2.f31050b = new C64523d();
                    qVar2.f31053e = this.f145662a.f145656b;
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0126, code lost:
        if (r11.f31016a.containsKey(new com.bytedance.assem.arch.core.C12765o(r2, null)) == false) goto L_0x0128;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m116115c(com.p2082ss.android.ugc.aweme.profile.model.User r15) {
        /*
        // Method dump skipped, instructions count: 385
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64208b.m116115c(com.ss.android.ugc.aweme.profile.model.User):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0127, code lost:
        if (r10.f31016a.containsKey(new com.bytedance.assem.arch.core.C12765o(r2, null)) == false) goto L_0x0129;
     */
    @Override // com.bytedance.hox.p1106a.AbstractC15497d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25223a(android.os.Bundle r15) {
        /*
        // Method dump skipped, instructions count: 436
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64208b.mo25223a(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0127, code lost:
        if (r11.f31016a.containsKey(new com.bytedance.assem.arch.core.C12765o(r2, null)) == false) goto L_0x0129;
     */
    @Override // com.bytedance.hox.p1106a.AbstractC15497d
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo25224b(android.os.Bundle r15) {
        /*
        // Method dump skipped, instructions count: 437
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64208b.mo25224b(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e5, code lost:
        if (r4.f31016a.containsKey(new com.bytedance.assem.arch.core.C12765o(r2, null)) == false) goto L_0x00e7;
     */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setUserVisibleHint(boolean r16) {
        /*
        // Method dump skipped, instructions count: 370
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64208b.setUserVisibleHint(boolean):void");
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.b$a */
    public static final class C64209a {

        /* renamed from: a */
        public final boolean f145648a;

        /* renamed from: b */
        public final ITpcConsentService f145649b;

        /* renamed from: c */
        public final WeakReference<Activity> f145650c;

        static {
            Covode.recordClassIndex(75654);
        }

        public C64209a(ITpcConsentService iTpcConsentService, WeakReference<Activity> weakReference) {
            C89219l.m154721d(iTpcConsentService, "");
            C89219l.m154721d(weakReference, "");
            this.f145649b = iTpcConsentService;
            this.f145650c = weakReference;
            this.f145648a = iTpcConsentService.mo68637a((AbstractC39273a) null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.v2.b$j */
    static final class C64239j<T1, T2, R> implements AbstractC88430c {

        /* renamed from: a */
        public static final C64239j f145683a = new C64239j();

        static {
            Covode.recordClassIndex(75684);
        }

        C64239j() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88430c
        /* renamed from: a */
        public final /* synthetic */ Object mo9210a(Object obj, Object obj2) {
            ITpcConsentService iTpcConsentService = (ITpcConsentService) obj;
            C89219l.m154721d(iTpcConsentService, "");
            C89219l.m154721d(obj2, "");
            return new C64209a(iTpcConsentService, new WeakReference(obj2));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC63980al, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        ActivityC0945e activity;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        C23669c g = mo103545g();
        if (g != null) {
            if (!(view instanceof ViewGroup)) {
                view = null;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup == null) {
                C89219l.m154715b();
            }
            g.mo39102a(new MyProfileGuideWidgetV2(viewGroup));
        }
        if (C39223a.m79604r().mo68637a((AbstractC39273a) null) && (activity = getActivity()) != null) {
            C89219l.m154716b(activity, "");
            if (!activity.isFinishing()) {
                C39223a.m79604r().mo68636a(activity, "deeplink");
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C89219l.m154721d(strArr, "");
        C89219l.m154721d(iArr, "");
        C80611a.m139766a(getActivity(), i, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010e, code lost:
        if (r4.f31016a.containsKey(new com.bytedance.assem.arch.core.C12765o(r2, null)) == false) goto L_0x0110;
     */
    @Override // androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r15, int r16, android.content.Intent r17) {
        /*
        // Method dump skipped, instructions count: 360
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64208b.onActivityResult(int, int, android.content.Intent):void");
    }
}
