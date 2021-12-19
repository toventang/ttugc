package com.p2082ss.android.ugc.aweme.setting.page.authmanager;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.ext.list.AbstractC20443c;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.C43047dm;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.setting.model.C68173c;
import com.p2082ss.android.ugc.aweme.setting.viewmodel.AuthInfoState;
import com.p2082ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4166g.C79440a;
import com.p2082ss.android.ugc.aweme.views.AutoRTLImageView;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.setting.page.authmanager.b */
public final class C68222b extends AbstractC34488b {

    /* renamed from: d */
    public static final C68224b f152740d = new C68224b((byte) 0);

    /* renamed from: b */
    final AbstractC89244h f152741b = C89250i.m154773a((AbstractC89171a) new C68234i(this));

    /* renamed from: c */
    public AbstractC68237d f152742c;

    /* renamed from: e */
    private final AbstractC89244h f152743e;

    /* renamed from: j */
    private final AbstractC89244h f152744j = C89250i.m154773a((AbstractC89171a) new C68233h(this));

    /* renamed from: k */
    private SparseArray f152745k;

    static {
        Covode.recordClassIndex(80424);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    /* renamed from: a */
    public final View mo60929a(int i) {
        if (this.f152745k == null) {
            this.f152745k = new SparseArray();
        }
        View view = (View) this.f152745k.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f152745k.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    /* renamed from: a */
    public final void mo60930a() {
        SparseArray sparseArray = this.f152745k;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: b */
    public final AuthListViewModel mo108741b() {
        return (AuthListViewModel) this.f152743e.getValue();
    }

    /* renamed from: c */
    public final TuxStatusView mo108742c() {
        return (TuxStatusView) this.f152744j.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo60930a();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.authmanager.b$b */
    public static final class C68224b {
        static {
            Covode.recordClassIndex(80426);
        }

        private C68224b() {
        }

        public /* synthetic */ C68224b(byte b) {
            this();
        }

        /* renamed from: a */
        public static C68222b m120487a(AbstractC68237d dVar) {
            C89219l.m154721d(dVar, "");
            return new C68222b(dVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.authmanager.b$d */
    public static final class C68226d implements AbstractC20443c<C68173c, AbstractC20477i> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f152750a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f152751b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f152752c;

        /* renamed from: d */
        private final AbstractC89172b<AbstractC20477i, C89391z> f152753d;

        /* renamed from: e */
        private final AbstractC89183m<AbstractC20477i, Throwable, C89391z> f152754e;

        /* renamed from: f */
        private final AbstractC89183m<AbstractC20477i, List<? extends C68173c>, C89391z> f152755f;

        static {
            Covode.recordClassIndex(80428);
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: a */
        public final AbstractC89172b<AbstractC20477i, C89391z> mo33773a() {
            return this.f152753d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: b */
        public final AbstractC89183m<AbstractC20477i, Throwable, C89391z> mo33774b() {
            return this.f152754e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: c */
        public final AbstractC89183m<AbstractC20477i, List<? extends C68173c>, C89391z> mo33775c() {
            return this.f152755f;
        }

        public C68226d(AbstractC89172b bVar, AbstractC89183m mVar, AbstractC89183m mVar2) {
            this.f152750a = bVar;
            this.f152751b = mVar;
            this.f152752c = mVar2;
            this.f152753d = bVar;
            this.f152754e = mVar;
            this.f152755f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.authmanager.b$h */
    static final class C68233h extends AbstractC89220m implements AbstractC89171a<TuxStatusView> {

        /* renamed from: a */
        final /* synthetic */ C68222b f152762a;

        static {
            Covode.recordClassIndex(80435);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68233h(C68222b bVar) {
            super(0);
            this.f152762a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxStatusView invoke() {
            return this.f152762a.mo60929a(R.id.e7i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.authmanager.b$i */
    static final class C68234i extends AbstractC89220m implements AbstractC89171a<C43047dm> {

        /* renamed from: a */
        final /* synthetic */ C68222b f152763a;

        static {
            Covode.recordClassIndex(80436);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68234i(C68222b bVar) {
            super(0);
            this.f152763a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C43047dm invoke() {
            PowerList powerList = (PowerList) this.f152763a.mo60929a(R.id.c_5);
            C89219l.m154716b(powerList, "");
            return new C43047dm(powerList);
        }
    }

    /* renamed from: e */
    public final void mo108743e() {
        PowerList powerList = (PowerList) mo60929a(R.id.c_5);
        C89219l.m154716b(powerList, "");
        powerList.getState().mo28128a();
        mo108741b().f153719d.refresh();
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.authmanager.b$a */
    public static final class C68223a extends AbstractC89220m implements AbstractC89171a<AuthListViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f152746a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f152747b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f152748c;

        static {
            Covode.recordClassIndex(80425);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C68223a(Fragment fragment, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f152746a = fragment;
            this.f152747b = cVar;
            this.f152748c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r0 = r3.f152746a
                androidx.fragment.app.Fragment r1 = r0.getParentFragment()
                if (r1 != 0) goto L_0x000b
                p4600h.p4611f.p4613b.C89219l.m154707a()
            L_0x000b:
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
                h.k.c r0 = r3.f152748c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r1 = r0.getName()
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r1, r0)
                h.k.c r0 = r3.f152747b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m120486x16329bd0(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.setting.page.authmanager.C68222b.C68223a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_setting_page_authmanager_AuthAppInfoListFragment$$special$$inlined$parentFragmentViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m120486x16329bd0(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.authmanager.b$c */
    static final class View$OnClickListenerC68225c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C68222b f152749a;

        static {
            Covode.recordClassIndex(80427);
        }

        View$OnClickListenerC68225c(C68222b bVar) {
            this.f152749a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ActivityC0945e activity = this.f152749a.getActivity();
            if (activity != null) {
                activity.setResult(0);
                activity.onBackPressed();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.authmanager.b$e */
    static final class C68227e extends AbstractC89220m implements AbstractC89172b<AbstractC20477i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C68222b f152756a;

        static {
            Covode.recordClassIndex(80429);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68227e(C68222b bVar) {
            super(1);
            this.f152756a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar) {
            C89219l.m154721d(iVar, "");
            this.f152756a.mo108742c().setVisibility(0);
            this.f152756a.mo108742c().mo37867a();
            return C89391z.f203057a;
        }
    }

    public C68222b(AbstractC68237d dVar) {
        C89219l.m154721d(dVar, "");
        this.f152742c = dVar;
        AbstractC89277c a = C89204ab.m154669a(AuthListViewModel.class);
        this.f152743e = C89250i.m154773a((AbstractC89171a) new C68223a(this, a, a));
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.authmanager.b$f */
    static final class C68228f extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C68222b f152757a;

        static {
            Covode.recordClassIndex(80430);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68228f(C68222b bVar) {
            super(2);
            this.f152757a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(th, "");
            this.f152757a.mo108742c().setVisibility(0);
            this.f152757a.mo108742c().setStatus(C79440a.m138169a(new TuxStatusView.C23263c(), new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.setting.page.authmanager.C68222b.C68228f.C682291 */

                /* renamed from: a */
                final /* synthetic */ C68228f f152758a;

                static {
                    Covode.recordClassIndex(80431);
                }

                {
                    this.f152758a = r2;
                }

                /* renamed from: a */
                private static boolean m120491a() {
                    try {
                        return C34719f.C34720a.f82009a.mo61395c();
                    } catch (Exception unused) {
                        return false;
                    }
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    this.f152758a.f152757a.getContext();
                    if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                        C58029j.f132256h = m120491a();
                    }
                    if (C58029j.f132256h) {
                        this.f152758a.f152757a.mo108743e();
                    }
                    return C89391z.f203057a;
                }
            }));
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) mo60929a(R.id.c_5);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setItemAnimator(null);
        mo108743e();
        ((AutoRTLImageView) mo60929a(R.id.pi)).setOnClickListener(new View$OnClickListenerC68225c(this));
        ListMiddleware.m38615a(mo108741b().f153719d, this, null, false, new C68226d(new C68227e(this), new C68228f(this), new C68230g(this)), null, null, null, 1006);
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.page.authmanager.b$g */
    static final class C68230g extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends C68173c>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C68222b f152759a;

        static {
            Covode.recordClassIndex(80432);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C68230g(C68222b bVar) {
            super(2);
            this.f152759a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends C68173c> list) {
            AbstractC20477i iVar2 = iVar;
            List<? extends C68173c> list2 = list;
            C89219l.m154721d(iVar2, "");
            C89219l.m154721d(list2, "");
            TuxStatusView tuxStatusView = (TuxStatusView) this.f152759a.mo60929a(R.id.e7i);
            C89219l.m154716b(tuxStatusView, "");
            tuxStatusView.setVisibility(8);
            iVar2.withState(this.f152759a.mo108741b(), new AbstractC89172b<AuthInfoState, Object>(this) {
                /* class com.p2082ss.android.ugc.aweme.setting.page.authmanager.C68222b.C68230g.C682311 */

                /* renamed from: a */
                final /* synthetic */ C68230g f152760a;

                static {
                    Covode.recordClassIndex(80433);
                }

                {
                    this.f152760a = r2;
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ Object invoke(AuthInfoState authInfoState) {
                    AuthInfoState authInfoState2 = authInfoState;
                    C89219l.m154721d(authInfoState2, "");
                    if (C13603b.m24435a((Collection) authInfoState2.getListState().getList())) {
                        TuxStatusView tuxStatusView = (TuxStatusView) this.f152760a.f152759a.mo60929a(R.id.e7i);
                        C89219l.m154716b(tuxStatusView, "");
                        tuxStatusView.setVisibility(0);
                        TuxStatusView.C23263c cVar = new TuxStatusView.C23263c();
                        String string = this.f152760a.f152759a.getString(R.string.w_);
                        C89219l.m154716b(string, "");
                        TuxStatusView.C23263c a = cVar.mo37879a(string);
                        String string2 = this.f152760a.f152759a.getString(R.string.w9);
                        C89219l.m154716b(string2, "");
                        ((TuxStatusView) this.f152760a.f152759a.mo60929a(R.id.e7i)).setStatus(a.mo37878a((CharSequence) string2).mo37877a(C23005c.m43393a(C682321.f152761a)));
                        TuxTextView tuxTextView = (TuxTextView) this.f152760a.f152759a.mo60929a(R.id.kq);
                        C89219l.m154716b(tuxTextView, "");
                        tuxTextView.setVisibility(8);
                        return 0;
                    }
                    TuxTextView tuxTextView2 = (TuxTextView) this.f152760a.f152759a.mo60929a(R.id.kq);
                    C89219l.m154716b(tuxTextView2, "");
                    tuxTextView2.setVisibility(0);
                    return C89391z.f203057a;
                }
            });
            PowerList powerList = (PowerList) this.f152759a.mo60929a(R.id.c_5);
            C89219l.m154716b(powerList, "");
            powerList.getState().mo28128a();
            ArrayList<C68235c> arrayList = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(new C68235c(it.next(), this.f152759a.f152742c));
            }
            for (C68235c cVar : arrayList) {
                ((C43047dm) this.f152759a.f152741b.getValue()).mo73247a(cVar);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.axx, viewGroup, false);
    }
}
