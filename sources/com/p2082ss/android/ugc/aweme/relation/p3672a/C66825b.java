package com.p2082ss.android.ugc.aweme.relation.p3672a;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1210r;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.internal.AbstractC23064b;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.friends.model.FriendList;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.relation.p3674c.C66895d;
import com.p2082ss.android.ugc.aweme.relation.p3674c.EnumC66892b;
import com.p2082ss.android.ugc.aweme.relation.viewmodel.C67103e;
import com.p2082ss.android.ugc.aweme.relation.viewmodel.SocialRecFlowModel;
import com.p2082ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestState;
import com.p2082ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.relation.a.b */
public final class C66825b extends AbstractC34488b {

    /* renamed from: d */
    public static final C66830d f150085d = new C66830d((byte) 0);

    /* renamed from: b */
    public AbstractC88412b f150086b;

    /* renamed from: c */
    public C66824a f150087c;

    /* renamed from: e */
    private final lifecycleAwareLazy f150088e;

    /* renamed from: j */
    private boolean f150089j;

    /* renamed from: k */
    private final AbstractC89244h f150090k = C89250i.m154773a((AbstractC89171a) new C66849r(this));

    /* renamed from: l */
    private SparseArray f150091l;

    /* renamed from: com.ss.android.ugc.aweme.relation.a.b$b */
    public static final class C66827b extends AbstractC89220m implements AbstractC89183m<SocialRecRequestState, Bundle, SocialRecRequestState> {
        public static final C66827b INSTANCE = new C66827b();

        static {
            Covode.recordClassIndex(78401);
        }

        public C66827b() {
            super(2);
        }

        public final SocialRecRequestState invoke(SocialRecRequestState socialRecRequestState, Bundle bundle) {
            C89219l.m154719c(socialRecRequestState, "");
            return socialRecRequestState;
        }
    }

    static {
        Covode.recordClassIndex(78399);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    /* renamed from: a */
    public final View mo60929a(int i) {
        if (this.f150091l == null) {
            this.f150091l = new SparseArray();
        }
        View view = (View) this.f150091l.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f150091l.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    /* renamed from: a */
    public final void mo60930a() {
        SparseArray sparseArray = this.f150091l;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: b */
    public final SocialRecRequestViewModel mo105796b() {
        return (SocialRecRequestViewModel) this.f150088e.getValue();
    }

    /* renamed from: c */
    public final SocialRecFlowModel mo105798c() {
        return (SocialRecFlowModel) this.f150090k.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo60930a();
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.a.b$d */
    public static final class C66830d {
        static {
            Covode.recordClassIndex(78404);
        }

        private C66830d() {
        }

        public /* synthetic */ C66830d(byte b) {
            this();
        }

        /* renamed from: a */
        public static C66825b m118563a(C66824a aVar) {
            C89219l.m154721d(aVar, "");
            C66825b bVar = new C66825b();
            Bundle bundle = new Bundle();
            bundle.putSerializable("consentConfig", aVar);
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.a.b$a */
    public static final class C66826a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f150092a;

        static {
            Covode.recordClassIndex(78400);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66826a(AbstractC89277c cVar) {
            super(0);
            this.f150092a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            String name = C89170a.m154665a(this.f150092a).getName();
            C89219l.m154709a((Object) name, "");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.a.b$o */
    static final class View$OnClickListenerC66844o implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C66825b f150115a;

        /* renamed from: b */
        final /* synthetic */ long f150116b;

        static {
            Covode.recordClassIndex(78418);
        }

        View$OnClickListenerC66844o(C66825b bVar, long j) {
            this.f150115a = bVar;
            this.f150116b = j;
        }

        /* renamed from: a */
        private static boolean m118564a() {
            try {
                return C34719f.C34720a.f82009a.mo61395c();
            } catch (Exception unused) {
                return false;
            }
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                SocialRecFlowModel c = this.f150115a.mo105798c();
                if (c != null) {
                    c.f150413c = true;
                }
                C89219l.m154716b(view, "");
                view.getContext();
                if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                    C58029j.f132256h = m118564a();
                }
                if (!C58029j.f132256h) {
                    new C23144b(view).mo37640e(R.string.dcq).mo37637b();
                    return;
                }
                TuxButton tuxButton = (TuxButton) this.f150115a.mo60929a(R.id.ac7);
                if (tuxButton == null || !tuxButton.f54417a) {
                    TuxButton tuxButton2 = (TuxButton) this.f150115a.mo60929a(R.id.ac7);
                    if (tuxButton2 != null) {
                        tuxButton2.setLoading(true);
                    }
                    C66895d.m118638a(C66825b.m118553a(this.f150115a).getSocialRecType(), C66825b.m118553a(this.f150115a).getStep(), "sync", System.currentTimeMillis() - this.f150116b);
                    C66825b bVar = this.f150115a;
                    bVar.mo105794a(C66825b.m118553a(bVar).getSocialRecType(), C66825b.m118553a(this.f150115a).getStep());
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.a.b$r */
    static final class C66849r extends AbstractC89220m implements AbstractC89171a<SocialRecFlowModel> {

        /* renamed from: a */
        final /* synthetic */ C66825b f150122a;

        static {
            Covode.recordClassIndex(78423);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66849r(C66825b bVar) {
            super(0);
            this.f150122a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ SocialRecFlowModel invoke() {
            ActivityC0945e activity = this.f150122a.getActivity();
            if (activity != null) {
                return C1181ae.m3881a(activity, (C1175ad.AbstractC1177b) null).mo3983a(SocialRecFlowModel.class);
            }
            return null;
        }
    }

    /* renamed from: e */
    public final void mo105799e() {
        C1210r<Bundle> rVar;
        SocialRecFlowModel c = mo105798c();
        if (c != null && (rVar = c.f150412b) != null) {
            rVar.postValue(new Bundle());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.a.b$c */
    public static final class C66828c extends AbstractC89220m implements AbstractC89171a<SocialRecRequestViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f150093a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f150094b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f150095c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f150096d;

        static {
            Covode.recordClassIndex(78402);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C66828c(Fragment fragment, AbstractC89171a aVar, AbstractC89277c cVar, AbstractC89183m mVar) {
            super(0);
            this.f150093a = fragment;
            this.f150094b = aVar;
            this.f150095c = cVar;
            this.f150096d = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.f150093a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
                h.f.a.a r0 = r3.f150094b
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.f150095c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m118562x89619f07(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel> r0 = com.p2082ss.android.ugc.aweme.relation.viewmodel.SocialRecRequestViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.mo33696a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.relation.a.b$c$1 r0 = new com.ss.android.ugc.aweme.relation.a.b$c$1
                r0.<init>(r3)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.relation.p3672a.C66825b.C66828c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_relation_consent_SocialConsentFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m118562x89619f07(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    public C66825b() {
        AbstractC89277c a = C89204ab.m154669a(SocialRecRequestViewModel.class);
        C66826a aVar = new C66826a(a);
        this.f150088e = new lifecycleAwareLazy(this, aVar, new C66828c(this, aVar, a, C66827b.INSTANCE));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onStop() {
        String str;
        super.onStop();
        C66824a aVar = this.f150087c;
        if (aVar == null) {
            C89219l.m154710a("consentConfig");
        }
        if (aVar.getSocialRecType() == 3) {
            C66824a aVar2 = this.f150087c;
            if (aVar2 == null) {
                C89219l.m154710a("consentConfig");
            }
            if (aVar2.getStep() == EnumC66892b.NEW_VERSION_FACEBOOK.getValue()) {
                str = "facebook";
            } else {
                str = "contact";
            }
            C66895d.m118642a(str, "background");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C66824a m118553a(C66825b bVar) {
        C66824a aVar = bVar.f150087c;
        if (aVar == null) {
            C89219l.m154710a("consentConfig");
        }
        return aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.a.b$n */
    static final class View$OnClickListenerC66843n implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C66825b f150113a;

        /* renamed from: b */
        final /* synthetic */ long f150114b;

        static {
            Covode.recordClassIndex(78417);
        }

        View$OnClickListenerC66843n(C66825b bVar, long j) {
            this.f150113a = bVar;
            this.f150114b = j;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200)) {
                this.f150113a.mo105795a(true);
                C66895d.m118638a(C66825b.m118553a(this.f150113a).getSocialRecType(), C66825b.m118553a(this.f150113a).getStep(), "skip", System.currentTimeMillis() - this.f150114b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.a.b$p */
    static final class View$OnClickListenerC66845p implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C66825b f150117a;

        static {
            Covode.recordClassIndex(78419);
        }

        View$OnClickListenerC66845p(C66825b bVar) {
            this.f150117a = bVar;
        }

        public final void onClick(View view) {
            String str;
            ClickAgent.onClick(view);
            this.f150117a.mo105799e();
            if (C66825b.m118553a(this.f150117a).getStep() == EnumC66892b.NEW_VERSION_FACEBOOK.getValue()) {
                str = "facebook";
            } else {
                str = "contact";
            }
            C66895d.m118642a(str, "click");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.relation.a.b$q */
    public static final class C66846q extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66825b f150118a;

        /* renamed from: b */
        final /* synthetic */ int f150119b;

        static {
            Covode.recordClassIndex(78420);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66846q(C66825b bVar, int i) {
            super(1);
            this.f150118a = bVar;
            this.f150119b = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            int i;
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            if (this.f150119b == EnumC66892b.NEW_VERSION_FACEBOOK.getValue()) {
                i = R.string.fy9;
            } else {
                i = R.string.fy_;
            }
            bVar2.mo37416a(i, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.relation.p3672a.C66825b.C66846q.C668471 */

                /* renamed from: a */
                final /* synthetic */ C66846q f150120a;

                static {
                    Covode.recordClassIndex(78421);
                }

                {
                    this.f150120a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    TuxButton tuxButton;
                    C89219l.m154721d(aVar, "");
                    TuxButton tuxButton2 = (TuxButton) this.f150120a.f150118a.mo60929a(R.id.ac6);
                    if ((tuxButton2 == null || !tuxButton2.f54417a) && (tuxButton = (TuxButton) this.f150120a.f150118a.mo60929a(R.id.ac6)) != null) {
                        tuxButton.setLoading(true);
                    }
                    this.f150120a.f150118a.mo105794a(C66825b.m118553a(this.f150120a.f150118a).getSocialRecType(), C66825b.m118553a(this.f150120a.f150118a).getStep());
                    C66895d.m118639a(this.f150120a.f150119b, "sync");
                    return C89391z.f203057a;
                }
            });
            bVar2.mo37418b(R.string.fya, new AbstractC89172b<C23024a, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.relation.p3672a.C66825b.C66846q.C668482 */

                /* renamed from: a */
                final /* synthetic */ C66846q f150121a;

                static {
                    Covode.recordClassIndex(78422);
                }

                {
                    this.f150121a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C23024a aVar) {
                    C89219l.m154721d(aVar, "");
                    this.f150121a.f150118a.mo105797b(this.f150121a.f150119b);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo105797b(int r6) {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.relation.p3672a.C66825b.mo105797b(int):void");
    }

    /* renamed from: a */
    public final void mo105795a(boolean z) {
        int i;
        int i2;
        String str;
        C66824a aVar = this.f150087c;
        if (aVar == null) {
            C89219l.m154710a("consentConfig");
        }
        if (aVar.getSocialRecType() == 3) {
            if (z) {
                C66824a aVar2 = this.f150087c;
                if (aVar2 == null) {
                    C89219l.m154710a("consentConfig");
                }
                if (aVar2.getStep() == EnumC66892b.NEW_VERSION_FACEBOOK.getValue()) {
                    SocialRecFlowModel c = mo105798c();
                    if (c != null) {
                        c.mo105896b("2");
                    }
                } else {
                    SocialRecFlowModel c2 = mo105798c();
                    if (c2 == null || (str = c2.f150416f) == null) {
                        str = "";
                    }
                    SocialRecFlowModel c3 = mo105798c();
                    if (c3 != null) {
                        if (TextUtils.isEmpty(str)) {
                            str = "1";
                        } else if (TextUtils.equals("2", str)) {
                            str = "1,2";
                        }
                        c3.mo105896b(str);
                    }
                }
            }
            C66824a aVar3 = this.f150087c;
            if (aVar3 == null) {
                C89219l.m154710a("consentConfig");
            }
            int step = aVar3.getStep();
            ActivityC0945e activity = getActivity();
            if (activity != null) {
                SocialRecFlowModel c4 = mo105798c();
                if (c4 == null || c4.f150413c) {
                    mo105797b(step);
                    return;
                }
                SocialRecFlowModel c5 = mo105798c();
                if (c5 != null) {
                    c5.f150413c = true;
                }
                C89219l.m154716b(activity, "");
                C23023b bVar = new C23023b(activity);
                if (step == EnumC66892b.NEW_VERSION_FACEBOOK.getValue()) {
                    i = R.string.bsg;
                } else {
                    i = R.string.at8;
                }
                AbstractC23064b a = bVar.mo37479a(i);
                if (step == EnumC66892b.NEW_VERSION_FACEBOOK.getValue()) {
                    i2 = R.string.bsf;
                } else {
                    i2 = R.string.at7;
                }
                ((C23023b) C23028c.m43435a((C23023b) a.mo37483b(i2), new C66846q(this, step)).mo37482a(false)).mo37405a().mo37396b().show();
                return;
            }
            return;
        }
        mo105799e();
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.a.b$f */
    static final class C66833f extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66825b f150100a;

        /* renamed from: b */
        final /* synthetic */ String f150101b;

        static {
            Covode.recordClassIndex(78407);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66833f(C66825b bVar, String str) {
            super(2);
            this.f150100a = bVar;
            this.f150101b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                new C23144b(this.f150100a).mo37635a(this.f150101b).mo37637b();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.a.b$h */
    static final class C66836h extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66825b f150106a;

        static {
            Covode.recordClassIndex(78410);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66836h(C66825b bVar) {
            super(2);
            this.f150106a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                this.f150106a.mo105795a(false);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.a.b$k */
    static final class C66839k extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66825b f150109a;

        static {
            Covode.recordClassIndex(78413);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66839k(C66825b bVar) {
            super(2);
            this.f150109a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            SocialRecFlowModel c;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue && (c = this.f150109a.mo105798c()) != null) {
                c.f150414d = true;
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.a.b$l */
    static final class C66840l extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66825b f150110a;

        static {
            Covode.recordClassIndex(78414);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66840l(C66825b bVar) {
            super(2);
            this.f150110a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                C34727m.m70945a(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.relation.p3672a.C66825b.C66840l.RunnableC668411 */

                    /* renamed from: a */
                    final /* synthetic */ C66840l f150111a;

                    static {
                        Covode.recordClassIndex(78415);
                    }

                    {
                        this.f150111a = r1;
                    }

                    public final void run() {
                        this.f150111a.f150110a.mo105799e();
                    }
                }, 1000);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.a.b$e */
    static final class C66831e extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66825b f150098a;

        static {
            Covode.recordClassIndex(78405);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66831e(C66825b bVar) {
            super(2);
            this.f150098a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                if (!this.f150098a.mo105796b().f150419b) {
                    new C23144b(this.f150098a).mo37640e(R.string.bfr).mo37637b();
                }
                this.f150098a.mo105796b().f150419b = false;
                C34727m.m70945a(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.relation.p3672a.C66825b.C66831e.RunnableC668321 */

                    /* renamed from: a */
                    final /* synthetic */ C66831e f150099a;

                    static {
                        Covode.recordClassIndex(78406);
                    }

                    {
                        this.f150099a = r1;
                    }

                    public final void run() {
                        this.f150099a.f150098a.mo105795a(false);
                    }
                }, 1000);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.a.b$m */
    static final class C66842m extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, FriendList<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66825b f150112a;

        static {
            Covode.recordClassIndex(78416);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66842m(C66825b bVar) {
            super(2);
            this.f150112a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, FriendList<? extends User> friendList) {
            C1210r<C67103e> rVar;
            FriendList<? extends User> friendList2 = friendList;
            C89219l.m154721d(iVar, "");
            if (friendList2 != null) {
                C66825b bVar = this.f150112a;
                C67103e eVar = new C67103e(EnumC66892b.RECOMMEND.getValue(), friendList2, null, null, 12);
                SocialRecFlowModel c = bVar.mo105798c();
                if (!(c == null || (rVar = c.f150411a) == null)) {
                    rVar.postValue(eVar);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.a.b$g */
    static final class C66834g extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66825b f150102a;

        /* renamed from: b */
        final /* synthetic */ int f150103b;

        /* renamed from: c */
        final /* synthetic */ String f150104c;

        static {
            Covode.recordClassIndex(78408);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66834g(C66825b bVar, int i, String str) {
            super(2);
            this.f150102a = bVar;
            this.f150103b = i;
            this.f150104c = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x0016  */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.bytedance.jedi.arch.AbstractC20477i r8, java.lang.Boolean r9) {
            /*
                r7 = this;
                java.lang.Boolean r9 = (java.lang.Boolean) r9
                boolean r2 = r9.booleanValue()
                java.lang.String r6 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r8, r6)
                int r1 = r7.f150103b
                r0 = 3
                if (r1 != r0) goto L_0x003e
                java.lang.String r5 = "version_update"
            L_0x0012:
                java.lang.String r4 = "auto"
            L_0x0014:
                if (r2 == 0) goto L_0x003b
                com.ss.android.ugc.aweme.relation.a.b r3 = r7.f150102a
                android.content.Context r2 = r3.requireContext()
                p4600h.p4611f.p4613b.C89219l.m154716b(r2, r6)
                java.lang.Class<com.ss.android.ugc.aweme.ufr.contact.ContactUFR> r1 = com.p2082ss.android.ugc.aweme.ufr.contact.ContactUFR.class
                com.ss.android.ugc.aweme.profile.model.User r0 = com.p2082ss.android.ugc.aweme.utils.C80580in.m139683b()
                p4600h.p4611f.p4613b.C89219l.m154716b(r0, r6)
                java.lang.String r0 = r0.getUid()
                f.a.t r1 = com.p2082ss.android.ugc.aweme.ufr.C79515b.m138226a(r2, r1, r0, r5, r4)
                com.ss.android.ugc.aweme.relation.a.b$g$1 r0 = new com.ss.android.ugc.aweme.relation.a.b$g$1
                r0.<init>(r7)
                f.a.b.b r0 = r1.mo143289d(r0)
                r3.f150086b = r0
            L_0x003b:
                h.z r0 = p4600h.C89391z.f203057a
                return r0
            L_0x003e:
                java.lang.String r5 = "login_onboarding"
                if (r1 != r0) goto L_0x0043
                goto L_0x0012
            L_0x0043:
                java.lang.String r4 = "login"
                goto L_0x0014
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.relation.p3672a.C66825b.C66834g.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.a.b$i */
    static final class C66837i extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66825b f150107a;

        static {
            Covode.recordClassIndex(78411);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66837i(C66825b bVar) {
            super(2);
            this.f150107a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num) {
            String str;
            int intValue = num.intValue();
            String str2 = "";
            C89219l.m154721d(iVar, str2);
            if (intValue > 0) {
                SocialRecFlowModel c = this.f150107a.mo105798c();
                if (!(c == null || (str = c.f150415e) == null)) {
                    str2 = str;
                }
                if (intValue == 1) {
                    SocialRecFlowModel c2 = this.f150107a.mo105798c();
                    if (c2 != null) {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = String.valueOf(intValue);
                        } else if (TextUtils.equals("2", str2)) {
                            str2 = "1,2";
                        }
                        c2.mo105895a(str2);
                    }
                } else {
                    SocialRecFlowModel c3 = this.f150107a.mo105798c();
                    if (c3 != null) {
                        c3.mo105895a("2");
                    }
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo105794a(int i, int i2) {
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        String curUserId = g.getCurUserId();
        if (TextUtils.isEmpty(curUserId)) {
            mo105799e();
            return;
        }
        SocialRecRequestViewModel b = mo105796b();
        C89219l.m154716b(curUserId, "");
        b.mo105921a(curUserId, i, i2, "process");
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.a.b$j */
    static final class C66838j extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66825b f150108a;

        static {
            Covode.recordClassIndex(78412);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66838j(C66825b bVar) {
            super(2);
            this.f150108a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
            if (r3 != false) goto L_0x0031;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0063, code lost:
            if (r4 == 1) goto L_0x0065;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0065, code lost:
            if (r2 == false) goto L_0x006e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0067, code lost:
            r4 = com.p2082ss.android.ugc.aweme.relation.p3674c.EnumC66892b.NEW_VERSION_RECOMMEND.getValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x006e, code lost:
            if (r4 != 2) goto L_0x0073;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0070, code lost:
            if (r3 == false) goto L_0x0073;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z invoke(com.bytedance.jedi.arch.AbstractC20477i r7, java.lang.Integer r8) {
            /*
            // Method dump skipped, instructions count: 134
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.relation.p3672a.C66825b.C66838j.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:72:0x02dd, code lost:
        if (r8 == com.p2082ss.android.ugc.aweme.relation.p3674c.EnumC66892b.NEW_VERSION_FACEBOOK.getValue()) goto L_0x02df;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0296  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x02bd  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0301  */
    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r16, android.os.Bundle r17) {
        /*
        // Method dump skipped, instructions count: 779
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.relation.p3672a.C66825b.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a26, viewGroup, false);
    }
}
