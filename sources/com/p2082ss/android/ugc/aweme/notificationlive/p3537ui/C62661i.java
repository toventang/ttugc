package com.p2082ss.android.ugc.aweme.notificationlive.p3537ui;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.core.content.C0643b;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.ext.list.AbstractC20443c;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a;
import com.p2082ss.android.ugc.aweme.following.repository.C51133f;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.C51749t;
import com.p2082ss.android.ugc.aweme.notificationlive.C62577t;
import com.p2082ss.android.ugc.aweme.notificationlive.p3537ui.adapter.PushSettingFollowListAdapter;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.i */
public final class C62661i extends AbstractC51143a {

    /* renamed from: l */
    public final User f142073l;

    /* renamed from: m */
    public PushSettingFollowListAdapter f142074m;

    /* renamed from: n */
    private final lifecycleAwareLazy f142075n;

    /* renamed from: o */
    private SparseArray f142076o;

    static {
        Covode.recordClassIndex(73464);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public final boolean mo61043H() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a, com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    /* renamed from: a */
    public final View mo60929a(int i) {
        if (this.f142076o == null) {
            this.f142076o = new SparseArray();
        }
        View view = (View) this.f142076o.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f142076o.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a, com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    /* renamed from: a */
    public final void mo60930a() {
        SparseArray sparseArray = this.f142076o;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: b */
    public final PushSettingNotificationChoiceViewModel mo100580b() {
        return (PushSettingNotificationChoiceViewModel) this.f142075n.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a
    /* renamed from: g */
    public final int mo86590g() {
        return R.layout.ane;
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a
    /* renamed from: i */
    public final int mo86592i() {
        return R.string.ew3;
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo60930a();
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a
    /* renamed from: q */
    public final int mo86599q() {
        return R.string.bzj;
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a
    /* renamed from: r */
    public final int mo86600r() {
        return R.string.bzg;
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.i$d */
    public static final class C62667d implements AbstractC20443c<Object, AbstractC20477i> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f142085a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f142086b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f142087c;

        /* renamed from: d */
        private final AbstractC89172b<AbstractC20477i, C89391z> f142088d;

        /* renamed from: e */
        private final AbstractC89183m<AbstractC20477i, Throwable, C89391z> f142089e;

        /* renamed from: f */
        private final AbstractC89183m<AbstractC20477i, List<? extends Object>, C89391z> f142090f;

        static {
            Covode.recordClassIndex(73470);
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: a */
        public final AbstractC89172b<AbstractC20477i, C89391z> mo33773a() {
            return this.f142088d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: b */
        public final AbstractC89183m<AbstractC20477i, Throwable, C89391z> mo33774b() {
            return this.f142089e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: c */
        public final AbstractC89183m<AbstractC20477i, List<? extends Object>, C89391z> mo33775c() {
            return this.f142090f;
        }

        public C62667d(AbstractC89172b bVar, AbstractC89183m mVar, AbstractC89183m mVar2) {
            this.f142085a = bVar;
            this.f142086b = mVar;
            this.f142087c = mVar2;
            this.f142088d = bVar;
            this.f142089e = mVar;
            this.f142090f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.i$e */
    public static final class C62668e implements AbstractC20443c<Object, AbstractC20477i> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f142091a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f142092b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f142093c;

        /* renamed from: d */
        private final AbstractC89172b<AbstractC20477i, C89391z> f142094d;

        /* renamed from: e */
        private final AbstractC89183m<AbstractC20477i, Throwable, C89391z> f142095e;

        /* renamed from: f */
        private final AbstractC89183m<AbstractC20477i, List<? extends Object>, C89391z> f142096f;

        static {
            Covode.recordClassIndex(73471);
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: a */
        public final AbstractC89172b<AbstractC20477i, C89391z> mo33773a() {
            return this.f142094d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: b */
        public final AbstractC89183m<AbstractC20477i, Throwable, C89391z> mo33774b() {
            return this.f142095e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: c */
        public final AbstractC89183m<AbstractC20477i, List<? extends Object>, C89391z> mo33775c() {
            return this.f142096f;
        }

        public C62668e(AbstractC89172b bVar, AbstractC89183m mVar, AbstractC89183m mVar2) {
            this.f142091a = bVar;
            this.f142092b = mVar;
            this.f142093c = mVar2;
            this.f142094d = bVar;
            this.f142095e = mVar;
            this.f142096f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.i$a */
    public static final class C62662a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f142077a;

        static {
            Covode.recordClassIndex(73465);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62662a(AbstractC89277c cVar) {
            super(0);
            this.f142077a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            String name = C89170a.m154665a(this.f142077a).getName();
            C89219l.m154709a((Object) name, "");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.i$c */
    static final class C62665c implements AbstractC39063h.AbstractC39067a {

        /* renamed from: a */
        final /* synthetic */ C62661i f142083a;

        static {
            Covode.recordClassIndex(73468);
        }

        C62665c(C62661i iVar) {
            this.f142083a = iVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
        /* renamed from: l */
        public final void mo62679l() {
            C62661i iVar = this.f142083a;
            iVar.withState(iVar.mo100580b(), new AbstractC89172b<NotificationChoiceState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.notificationlive.p3537ui.C62661i.C62665c.C626661 */

                /* renamed from: a */
                final /* synthetic */ C62665c f142084a;

                static {
                    Covode.recordClassIndex(73469);
                }

                {
                    this.f142084a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(NotificationChoiceState notificationChoiceState) {
                    NotificationChoiceState notificationChoiceState2 = notificationChoiceState;
                    C89219l.m154721d(notificationChoiceState2, "");
                    if (notificationChoiceState2.getListState().getPayload().f117968c != 0) {
                        C62661i iVar = this.f142084a.f142083a;
                        iVar.withState(iVar.mo100580b(), new C62680o(iVar));
                    }
                    return C89391z.f203057a;
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a
    /* renamed from: p */
    public final void mo86598p() {
        mo100580b().f141940f.refresh();
    }

    /* renamed from: c */
    public final boolean mo100581c() {
        return ((Boolean) withState(mo100580b(), C62678m.f142106a)).booleanValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.i$b */
    public static final class C62663b extends AbstractC89220m implements AbstractC89171a<PushSettingNotificationChoiceViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f142078a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f142079b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f142080c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f142081d;

        static {
            Covode.recordClassIndex(73466);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62663b(Fragment fragment, AbstractC89171a aVar, AbstractC89277c cVar, AbstractC89183m mVar) {
            super(0);
            this.f142078a = fragment;
            this.f142079b = aVar;
            this.f142080c = cVar;
            this.f142081d = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.notificationlive.p3537ui.PushSettingNotificationChoiceViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.f142078a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
                h.f.a.a r0 = r3.f142079b
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.f142080c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m113069xade4fa12(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.notificationlive.ui.PushSettingNotificationChoiceViewModel> r0 = com.p2082ss.android.ugc.aweme.notificationlive.p3537ui.PushSettingNotificationChoiceViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.mo33696a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.notificationlive.ui.i$b$1 r0 = new com.ss.android.ugc.aweme.notificationlive.ui.i$b$1
                r0.<init>(r3)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.notificationlive.p3537ui.C62661i.C62663b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_notificationlive_ui_PushSettingNotificationChoiceFragment$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m113069xade4fa12(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    public C62661i() {
        User user;
        IAccountUserService g = C31575b.m65865g();
        if (g != null) {
            user = g.getCurUser();
        } else {
            user = null;
        }
        this.f142073l = user;
        C62679n nVar = new C62679n(this);
        AbstractC89277c a = C89204ab.m154669a(PushSettingNotificationChoiceViewModel.class);
        C62662a aVar = new C62662a(a);
        this.f142075n = new lifecycleAwareLazy(this, aVar, new C62663b(this, aVar, a, nVar));
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        boolean z;
        super.onResume();
        if (!C62577t.m113008c() || !C62577t.m113007b()) {
            z = false;
        } else {
            z = true;
        }
        mo100580b().mo100556b(z);
        if (mo100580b().f141939e) {
            mo100580b().f141940f.mo33732a(C89086z.INSTANCE);
            mo100580b().f141940f.refresh();
            mo100580b().f141939e = false;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ PushSettingFollowListAdapter m113058a(C62661i iVar) {
        PushSettingFollowListAdapter pushSettingFollowListAdapter = iVar.f142074m;
        if (pushSettingFollowListAdapter == null) {
            C89219l.m154710a("mPushSettingFollowListAdapter");
        }
        return pushSettingFollowListAdapter;
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.i$f */
    static final class C62669f extends AbstractC89220m implements AbstractC89172b<AbstractC20477i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C62661i f142097a;

        static {
            Covode.recordClassIndex(73472);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62669f(C62661i iVar) {
            super(1);
            this.f142097a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar) {
            C89219l.m154721d(iVar, "");
            ((DmtStatusView) this.f142097a.mo60929a(R.id.e7i)).mo27384f();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.i$o */
    static final class C62680o extends AbstractC89220m implements AbstractC89172b<NotificationChoiceState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C62661i f142108a;

        static {
            Covode.recordClassIndex(73483);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62680o(C62661i iVar) {
            super(1);
            this.f142108a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(NotificationChoiceState notificationChoiceState) {
            C89219l.m154721d(notificationChoiceState, "");
            C62661i.m113058a(this.f142108a).ao_();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.i$i */
    static final class C62673i extends AbstractC89220m implements AbstractC89172b<AbstractC20477i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C62661i f142101a;

        static {
            Covode.recordClassIndex(73476);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62673i(C62661i iVar) {
            super(1);
            this.f142101a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar) {
            C89219l.m154721d(iVar, "");
            DmtStatusView dmtStatusView = (DmtStatusView) this.f142101a.mo60929a(R.id.e7i);
            C89219l.m154716b(dmtStatusView, "");
            if (!dmtStatusView.mo27389j()) {
                C62661i.m113058a(this.f142101a).ao_();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.i$m */
    public static final class C62678m extends AbstractC89220m implements AbstractC89172b<NotificationChoiceState, Boolean> {

        /* renamed from: a */
        public static final C62678m f142106a = new C62678m();

        static {
            Covode.recordClassIndex(73481);
        }

        C62678m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(NotificationChoiceState notificationChoiceState) {
            List<Object> a;
            NotificationChoiceState notificationChoiceState2 = notificationChoiceState;
            C89219l.m154721d(notificationChoiceState2, "");
            List<Object> a2 = notificationChoiceState2.getListState().getRefresh().mo33695a();
            boolean z = false;
            if ((a2 == null || a2.size() < 2) && ((a = notificationChoiceState2.getListState().getLoadMore().mo33695a()) == null || a.isEmpty())) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.i$j */
    static final class C62674j extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C62661i f142102a;

        static {
            Covode.recordClassIndex(73477);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62674j(C62661i iVar) {
            super(2);
            this.f142102a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(th, "");
            C62661i.m113058a(this.f142102a).mo67824j();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.i$k */
    static final class C62675k extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C62661i f142103a;

        static {
            Covode.recordClassIndex(73478);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62675k(C62661i iVar) {
            super(2);
            this.f142103a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends Object> list) {
            AbstractC20477i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            C89219l.m154721d(list, "");
            iVar2.withState(this.f142103a.mo100580b(), new AbstractC89172b<NotificationChoiceState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.notificationlive.p3537ui.C62661i.C62675k.C626761 */

                /* renamed from: a */
                final /* synthetic */ C62675k f142104a;

                static {
                    Covode.recordClassIndex(73479);
                }

                {
                    this.f142104a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(NotificationChoiceState notificationChoiceState) {
                    NotificationChoiceState notificationChoiceState2 = notificationChoiceState;
                    C89219l.m154721d(notificationChoiceState2, "");
                    PushSettingNotificationChoiceViewModel b = this.f142104a.f142103a.mo100580b();
                    boolean z = notificationChoiceState2.getListState().getPayload().f48406a.f48382a;
                    notificationChoiceState2.getListState().getPayload();
                    notificationChoiceState2.getListState().getPayload();
                    if (!b.mo100555a(z)) {
                        if (this.f142104a.f142103a.mo100581c()) {
                            ((DmtStatusView) this.f142104a.f142103a.mo60929a(R.id.e7i)).mo27385g();
                        } else {
                            ((DmtStatusView) this.f142104a.f142103a.mo60929a(R.id.e7i)).mo27382d();
                        }
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.i$g */
    static final class C62670g extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C62661i f142098a;

        static {
            Covode.recordClassIndex(73473);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62670g(C62661i iVar) {
            super(2);
            this.f142098a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(th2, "");
            C62661i iVar2 = this.f142098a;
            DmtStatusView dmtStatusView = (DmtStatusView) iVar2.mo60929a(R.id.e7i);
            C89219l.m154716b(dmtStatusView, "");
            iVar2.mo86586a(dmtStatusView, (Exception) th2);
            ((DmtStatusView) this.f142098a.mo60929a(R.id.e7i)).mo27387h();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.i$h */
    static final class C62671h extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C62661i f142099a;

        static {
            Covode.recordClassIndex(73474);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62671h(C62661i iVar) {
            super(2);
            this.f142099a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends Object> list) {
            AbstractC20477i iVar2 = iVar;
            List<? extends Object> list2 = list;
            C89219l.m154721d(iVar2, "");
            C89219l.m154721d(list2, "");
            if (!C13603b.m24435a((Collection) list2)) {
                ((DmtStatusView) this.f142099a.mo60929a(R.id.e7i)).mo27382d();
            }
            iVar2.withState(this.f142099a.mo100580b(), new AbstractC89172b<NotificationChoiceState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.notificationlive.p3537ui.C62661i.C62671h.C626721 */

                /* renamed from: a */
                final /* synthetic */ C62671h f142100a;

                static {
                    Covode.recordClassIndex(73475);
                }

                {
                    this.f142100a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(NotificationChoiceState notificationChoiceState) {
                    NotificationChoiceState notificationChoiceState2 = notificationChoiceState;
                    C89219l.m154721d(notificationChoiceState2, "");
                    PushSettingNotificationChoiceViewModel b = this.f142100a.f142099a.mo100580b();
                    boolean z = notificationChoiceState2.getListState().getPayload().f48406a.f48382a;
                    notificationChoiceState2.getListState().getPayload();
                    notificationChoiceState2.getListState().getPayload();
                    if (!b.mo100555a(z) && this.f142100a.f142099a.mo100581c()) {
                        ((DmtStatusView) this.f142100a.f142099a.mo60929a(R.id.e7i)).mo27385g();
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.i$l */
    static final class C62677l extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C62661i f142105a;

        static {
            Covode.recordClassIndex(73480);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62677l(C62661i iVar) {
            super(2);
            this.f142105a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            if (booleanValue) {
                C62661i.m113058a(this.f142105a).aq_();
            } else {
                C62661i.m113058a(this.f142105a).ap_();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notificationlive.ui.i$n */
    static final class C62679n extends AbstractC89220m implements AbstractC89183m<NotificationChoiceState, Bundle, NotificationChoiceState> {

        /* renamed from: a */
        final /* synthetic */ C62661i f142107a;

        static {
            Covode.recordClassIndex(73482);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C62679n(C62661i iVar) {
            super(2);
            this.f142107a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ NotificationChoiceState invoke(NotificationChoiceState notificationChoiceState, Bundle bundle) {
            String str;
            String secUid;
            NotificationChoiceState notificationChoiceState2 = notificationChoiceState;
            String str2 = "";
            C89219l.m154721d(notificationChoiceState2, str2);
            User user = this.f142107a.f142073l;
            if (user == null || (str = user.getUid()) == null) {
                str = str2;
            }
            User user2 = this.f142107a.f142073l;
            if (!(user2 == null || (secUid = user2.getSecUid()) == null)) {
                str2 = secUid;
            }
            return NotificationChoiceState.copy$default(notificationChoiceState2, str, str2, this.f142107a.mo86591h(), null, false, 0, null, false, null, null, 1016, null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo60929a(R.id.e5w);
        C89219l.m154716b(swipeRefreshLayout, "");
        swipeRefreshLayout.setEnabled(false);
        DmtStatusView dmtStatusView = (DmtStatusView) mo60929a(R.id.e7i);
        C89219l.m154716b(dmtStatusView, "");
        mo86585a(dmtStatusView);
        getActivity();
        WrapLinearLayoutManager wrapLinearLayoutManager = new WrapLinearLayoutManager();
        wrapLinearLayoutManager.mo4356b(1);
        RecyclerView recyclerView = (RecyclerView) mo60929a(R.id.dof);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setLayoutManager(wrapLinearLayoutManager);
        RecyclerView recyclerView2 = (RecyclerView) mo60929a(R.id.dof);
        C89219l.m154716b(recyclerView2, "");
        recyclerView2.setItemAnimator(new C51749t());
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("enter_from")) == null) {
            str = "settings_page";
        }
        C89219l.m154716b(str, "");
        PushSettingFollowListAdapter pushSettingFollowListAdapter = new PushSettingFollowListAdapter(this, str);
        String str2 = this.f117992j;
        C89219l.m154721d(str2, "");
        pushSettingFollowListAdapter.f142021d = str2;
        this.f142074m = pushSettingFollowListAdapter;
        RecyclerView recyclerView3 = (RecyclerView) mo60929a(R.id.dof);
        C89219l.m154716b(recyclerView3, "");
        pushSettingFollowListAdapter.mo67820g(C0643b.m2378c(recyclerView3.getContext(), R.color.nc));
        RecyclerView recyclerView4 = (RecyclerView) mo60929a(R.id.dof);
        C89219l.m154716b(recyclerView4, "");
        PushSettingFollowListAdapter pushSettingFollowListAdapter2 = this.f142074m;
        if (pushSettingFollowListAdapter2 == null) {
            C89219l.m154710a("mPushSettingFollowListAdapter");
        }
        recyclerView4.setAdapter(pushSettingFollowListAdapter2);
        PushSettingFollowListAdapter pushSettingFollowListAdapter3 = this.f142074m;
        if (pushSettingFollowListAdapter3 == null) {
            C89219l.m154710a("mPushSettingFollowListAdapter");
        }
        pushSettingFollowListAdapter3.mo67813a(new C62665c(this));
        ListMiddleware<NotificationChoiceState, Object, C51133f> listMiddleware = mo100580b().f141940f;
        PushSettingFollowListAdapter pushSettingFollowListAdapter4 = this.f142074m;
        if (pushSettingFollowListAdapter4 == null) {
            C89219l.m154710a("mPushSettingFollowListAdapter");
        }
        ListMiddleware.m38615a(listMiddleware, this, pushSettingFollowListAdapter4, false, new C62667d(new C62669f(this), new C62670g(this), new C62671h(this)), new C62668e(new C62673i(this), new C62674j(this), new C62675k(this)), new C62677l(this), null, 908);
        if (!this.f117990d) {
            mo100580b().f141940f.refresh();
        }
    }
}
