package com.p2082ss.android.ugc.aweme.following.p3003ui;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0643b;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.jedi.arch.AbstractC20468h;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20372aj;
import com.bytedance.jedi.arch.ext.list.AbstractC20443c;
import com.bytedance.jedi.arch.ext.list.C20442b;
import com.bytedance.jedi.arch.ext.list.ListMiddleware;
import com.bytedance.jedi.arch.ext.list.ListState;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34497h;
import com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.SwipeRefreshLayout;
import com.p2082ss.android.ugc.aweme.base.p2372d.C34569a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51107f;
import com.p2082ss.android.ugc.aweme.following.p3002a.C51108g;
import com.p2082ss.android.ugc.aweme.following.p3002a.EnumC51102a;
import com.p2082ss.android.ugc.aweme.following.p3003ui.adapter.FollowListAdapter;
import com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.FollowerRelationState;
import com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.FollowerRelationViewModel;
import com.p2082ss.android.ugc.aweme.following.repository.C51133f;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p2082ss.android.ugc.aweme.friends.p3022ui.C51749t;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.viewmodel.C66760a;
import com.p2082ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState;
import com.p2082ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel;
import com.p2082ss.android.ugc.aweme.utils.C80440fo;
import com.p2082ss.android.ugc.aweme.utils.C80494gh;
import com.p2082ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.following.ui.g */
public final class C51222g extends AbstractC51143a implements AbstractC90252i, AbstractC90253j {

    /* renamed from: l */
    public FollowListAdapter f118154l;

    /* renamed from: m */
    boolean f118155m;

    /* renamed from: n */
    private final lifecycleAwareLazy f118156n;

    /* renamed from: o */
    private final lifecycleAwareLazy f118157o;

    /* renamed from: p */
    private SparseArray f118158p;

    static {
        Covode.recordClassIndex(60426);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a
    /* renamed from: H */
    public final boolean mo61043H() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a, com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    /* renamed from: a */
    public final View mo60929a(int i) {
        if (this.f118158p == null) {
            this.f118158p = new SparseArray();
        }
        View view = (View) this.f118158p.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f118158p.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a, com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    /* renamed from: a */
    public final void mo60930a() {
        SparseArray sparseArray = this.f118158p;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: b */
    public final FollowerRelationViewModel mo86631b() {
        return (FollowerRelationViewModel) this.f118156n.getValue();
    }

    /* renamed from: c */
    public final RecommendUserListViewModel mo86632c() {
        return (RecommendUserListViewModel) this.f118157o.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a
    /* renamed from: g */
    public final int mo86590g() {
        return R.layout.an4;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(34, new RunnableC90250g(C51222g.class, "onAntiCrawlerEvent", C34569a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a
    /* renamed from: i */
    public final int mo86592i() {
        return R.string.ew4;
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo60930a();
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$j */
    public static final class C51244j implements AbstractC20443c<Object, AbstractC20477i> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f118189a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f118190b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f118191c;

        /* renamed from: d */
        private final AbstractC89172b<AbstractC20477i, C89391z> f118192d;

        /* renamed from: e */
        private final AbstractC89183m<AbstractC20477i, Throwable, C89391z> f118193e;

        /* renamed from: f */
        private final AbstractC89183m<AbstractC20477i, List<? extends Object>, C89391z> f118194f;

        static {
            Covode.recordClassIndex(60448);
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: a */
        public final AbstractC89172b<AbstractC20477i, C89391z> mo33773a() {
            return this.f118192d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: b */
        public final AbstractC89183m<AbstractC20477i, Throwable, C89391z> mo33774b() {
            return this.f118193e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: c */
        public final AbstractC89183m<AbstractC20477i, List<? extends Object>, C89391z> mo33775c() {
            return this.f118194f;
        }

        public C51244j(AbstractC89172b bVar, AbstractC89183m mVar, AbstractC89183m mVar2) {
            this.f118189a = bVar;
            this.f118190b = mVar;
            this.f118191c = mVar2;
            this.f118192d = bVar;
            this.f118193e = mVar;
            this.f118194f = mVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$k */
    public static final class C51245k implements AbstractC20443c<Object, AbstractC20477i> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f118195a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89183m f118196b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89183m f118197c;

        /* renamed from: d */
        private final AbstractC89172b<AbstractC20477i, C89391z> f118198d;

        /* renamed from: e */
        private final AbstractC89183m<AbstractC20477i, Throwable, C89391z> f118199e;

        /* renamed from: f */
        private final AbstractC89183m<AbstractC20477i, List<? extends Object>, C89391z> f118200f;

        static {
            Covode.recordClassIndex(60449);
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: a */
        public final AbstractC89172b<AbstractC20477i, C89391z> mo33773a() {
            return this.f118198d;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: b */
        public final AbstractC89183m<AbstractC20477i, Throwable, C89391z> mo33774b() {
            return this.f118199e;
        }

        @Override // com.bytedance.jedi.arch.ext.list.AbstractC20443c
        /* renamed from: c */
        public final AbstractC89183m<AbstractC20477i, List<? extends Object>, C89391z> mo33775c() {
            return this.f118200f;
        }

        public C51245k(AbstractC89172b bVar, AbstractC89183m mVar, AbstractC89183m mVar2) {
            this.f118195a = bVar;
            this.f118196b = mVar;
            this.f118197c = mVar2;
            this.f118198d = bVar;
            this.f118199e = mVar;
            this.f118200f = mVar2;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a
    /* renamed from: r */
    public final int mo86600r() {
        mo86591h();
        return R.string.bza;
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$a */
    public static final class C51223a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f118159a;

        static {
            Covode.recordClassIndex(60427);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51223a(AbstractC89277c cVar) {
            super(0);
            this.f118159a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            String name = C89170a.m154665a(this.f118159a).getName();
            C89219l.m154709a((Object) name, "");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$c */
    public static final class C51234c extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f118173a;

        static {
            Covode.recordClassIndex(60438);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51234c(AbstractC89277c cVar) {
            super(0);
            this.f118173a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            String name = C89170a.m154665a(this.f118173a).getName();
            C89219l.m154709a((Object) name, "");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$g */
    static final class C51239g implements AbstractC39063h.AbstractC39067a {

        /* renamed from: a */
        final /* synthetic */ C51222g f118181a;

        static {
            Covode.recordClassIndex(60443);
        }

        C51239g(C51222g gVar) {
            this.f118181a = gVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
        /* renamed from: l */
        public final void mo62679l() {
            C51222g gVar = this.f118181a;
            gVar.withState(gVar.mo86631b(), new AbstractC89172b<FollowerRelationState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.following.p3003ui.C51222g.C51239g.C512401 */

                /* renamed from: a */
                final /* synthetic */ C51239g f118182a;

                static {
                    Covode.recordClassIndex(60444);
                }

                {
                    this.f118182a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(FollowerRelationState followerRelationState) {
                    List<Object> recommendList;
                    FollowerRelationState followerRelationState2 = followerRelationState;
                    C89219l.m154721d(followerRelationState2, "");
                    if (followerRelationState2.getListState().getPayload().f117968c != 0 || ((recommendList = followerRelationState2.getRecommendList()) != null && !recommendList.isEmpty())) {
                        C51222g gVar = this.f118182a.f118181a;
                        gVar.withState(gVar.mo86631b(), new C51229ae(gVar));
                    }
                    return C89391z.f203057a;
                }
            });
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a
    /* renamed from: j */
    public final String mo86593j() {
        if (mo86591h()) {
            return "fans";
        }
        return "other_fans";
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a
    /* renamed from: p */
    public final void mo86598p() {
        mo86631b().f118388c.refresh();
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a
    /* renamed from: q */
    public final int mo86599q() {
        if (mo86591h()) {
            return R.string.bzb;
        }
        return R.string.bzc;
    }

    /* renamed from: t */
    public final String mo86636t() {
        return (String) withState(mo86631b(), C51243i.f118188a);
    }

    @Override // com.p2082ss.android.ugc.aweme.following.p3003ui.AbstractC51143a
    /* renamed from: l */
    public final boolean mo86595l() {
        return ((Boolean) withState(mo86631b(), new C51230af(this))).booleanValue();
    }

    /* renamed from: m */
    public final boolean mo86633m() {
        if (mo86591h()) {
            return ((Boolean) withState(mo86631b(), new C51237e(this))).booleanValue();
        }
        return false;
    }

    /* renamed from: s */
    public final boolean mo86635s() {
        return ((Boolean) withState(mo86631b(), C51238f.f118180a)).booleanValue();
    }

    /* renamed from: v */
    public final boolean mo86638v() {
        return ((Boolean) withState(mo86631b(), C51226ab.f118162a)).booleanValue();
    }

    /* renamed from: w */
    public final void mo86639w() {
        ((DmtStatusView) mo60929a(R.id.e7i)).mo27382d();
        ((DmtStatusView) mo60929a(R.id.e7i)).mo27385g();
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$b */
    public static final class C51232b extends AbstractC89220m implements AbstractC89171a<FollowerRelationViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f118168a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f118169b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f118170c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f118171d;

        static {
            Covode.recordClassIndex(60436);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51232b(Fragment fragment, AbstractC89171a aVar, AbstractC89277c cVar, AbstractC89183m mVar) {
            super(0);
            this.f118168a = fragment;
            this.f118169b = aVar;
            this.f118170c = cVar;
            this.f118171d = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.FollowerRelationViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.f118168a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
                h.f.a.a r0 = r3.f118169b
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.f118170c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m95649x8e34c14a(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.following.ui.viewmodel.FollowerRelationViewModel> r0 = com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.FollowerRelationViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.mo33696a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.following.ui.g$b$1 r0 = new com.ss.android.ugc.aweme.following.ui.g$b$1
                r0.<init>(r3)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.following.p3003ui.C51222g.C51232b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_following_ui_FollowerRelationFragment$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m95649x8e34c14a(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$d */
    public static final class C51235d extends AbstractC89220m implements AbstractC89171a<RecommendUserListViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f118174a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f118175b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f118176c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f118177d;

        static {
            Covode.recordClassIndex(60439);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51235d(Fragment fragment, AbstractC89171a aVar, AbstractC89277c cVar, AbstractC89183m mVar) {
            super(0);
            this.f118174a = fragment;
            this.f118175b = aVar;
            this.f118176c = cVar;
            this.f118177d = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, com.bytedance.jedi.arch.JediViewModel, com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.f118174a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
                h.f.a.a r0 = r3.f118175b
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.f118176c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m95650xb584684c(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel> r0 = com.p2082ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.mo33696a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.following.ui.g$d$1 r0 = new com.ss.android.ugc.aweme.following.ui.g$d$1
                r0.<init>(r3)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.following.p3003ui.C51222g.C51235d.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_following_ui_FollowerRelationFragment$$special$$inlined$viewModel$4_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m95650xb584684c(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    public C51222g() {
        C51227ac acVar = new C51227ac(this);
        AbstractC89277c a = C89204ab.m154669a(FollowerRelationViewModel.class);
        C51223a aVar = new C51223a(a);
        this.f118156n = new lifecycleAwareLazy(this, aVar, new C51232b(this, aVar, a, acVar));
        C51228ad adVar = new C51228ad(this);
        AbstractC89277c a2 = C89204ab.m154669a(RecommendUserListViewModel.class);
        C51234c cVar = new C51234c(a2);
        this.f118157o = new lifecycleAwareLazy(this, cVar, new C51235d(this, cVar, a2, adVar));
    }

    /* renamed from: u */
    public final void mo86637u() {
        FollowListAdapter followListAdapter = this.f118154l;
        if (followListAdapter == null) {
            C89219l.m154710a("mFollowerListAdapter");
        }
        followListAdapter.aq_();
        if (this.f118155m) {
            return;
        }
        if (mo86638v() || !mo86635s()) {
            FollowListAdapter followListAdapter2 = this.f118154l;
            if (followListAdapter2 == null) {
                C89219l.m154710a("mFollowerListAdapter");
            }
            followListAdapter2.ap_();
            return;
        }
        mo86631b().mo86757a(mo86636t());
        this.f118155m = true;
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$h */
    public static final class C51241h implements C80440fo.AbstractC80442a {

        /* renamed from: a */
        final /* synthetic */ C51222g f118183a;

        static {
            Covode.recordClassIndex(60445);
        }

        /* renamed from: com.ss.android.ugc.aweme.following.ui.g$h$a */
        static final class RunnableC51242a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ User f118184a;

            /* renamed from: b */
            final /* synthetic */ C51241h f118185b;

            /* renamed from: c */
            final /* synthetic */ C80440fo f118186c;

            /* renamed from: d */
            final /* synthetic */ int f118187d;

            static {
                Covode.recordClassIndex(60446);
            }

            RunnableC51242a(User user, C51241h hVar, C80440fo foVar, int i) {
                this.f118184a = user;
                this.f118185b = hVar;
                this.f118186c = foVar;
                this.f118187d = i;
            }

            public final void run() {
                String str;
                if (this.f118185b.f118183a.mo86591h()) {
                    str = "fans";
                } else {
                    str = "other_fans";
                }
                C39162r.m79462a("fan_list_user_show", C89387v.m154943a(str, "enter_from"), C89387v.m154943a(this.f118184a.getRequestId(), "req_id"), C89387v.m154943a(this.f118184a.getUid(), "to_user_id"), C89387v.m154943a(Integer.valueOf(this.f118187d), "impr_order"));
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C51241h(C51222g gVar) {
            this.f118183a = gVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.C80440fo.AbstractC80442a
        /* renamed from: a */
        public final void mo86642a(int i, C80440fo foVar) {
            User user;
            C89219l.m154721d(foVar, "");
            Object a = C51222g.m95630a(this.f118183a).mo33762a(i);
            if (a instanceof C51108g) {
                C51108g gVar = (C51108g) a;
                if (gVar.f117933a == 1 && (user = gVar.f117934b) != null) {
                    String uid = user.getUid();
                    C89219l.m154716b(uid, "");
                    foVar.mo123741a(uid, new RunnableC51242a(user, this, foVar, i));
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$z */
    static final class C51264z extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51222g f118221a;

        static {
            Covode.recordClassIndex(60468);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51264z(C51222g gVar) {
            super(2);
            this.f118221a = gVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.following.ui.g$z$a */
        static final class C51265a extends AbstractC89220m implements AbstractC89172b<RecommendUserListState, C66760a> {

            /* renamed from: a */
            public static final C51265a f118222a = new C51265a();

            static {
                Covode.recordClassIndex(60469);
            }

            C51265a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C66760a invoke(RecommendUserListState recommendUserListState) {
                RecommendUserListState recommendUserListState2 = recommendUserListState;
                C89219l.m154721d(recommendUserListState2, "");
                return recommendUserListState2.getRecommendMobParams();
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            AbstractC20477i iVar2 = iVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar2, "");
            if (booleanValue) {
                C51222g.m95630a(this.f118221a).aq_();
            } else if (this.f118221a.mo86633m()) {
                if (!this.f118221a.mo86638v()) {
                    C66760a aVar = (C66760a) iVar2.withState(this.f118221a.mo86632c(), C51265a.f118222a);
                    RecommendUserListViewModel c = this.f118221a.mo86632c();
                    String str = aVar.f149955a;
                    String str2 = aVar.f149956b;
                    C89219l.m154721d(str, "");
                    C89219l.m154721d(str2, "");
                    C89219l.m154721d("nonempty", "");
                    C66760a aVar2 = new C66760a(str, str2, "nonempty");
                    C89219l.m154721d(aVar2, "");
                    c.mo33689c(new RecommendUserListViewModel.C66759i(aVar2));
                }
                C51222g gVar = this.f118221a;
                FollowListAdapter followListAdapter = gVar.f118154l;
                if (followListAdapter == null) {
                    C89219l.m154710a("mFollowerListAdapter");
                }
                followListAdapter.aq_();
                if (!gVar.mo86638v() && !gVar.f118155m && gVar.mo86635s()) {
                    gVar.mo86631b().mo86757a(gVar.mo86636t());
                    gVar.f118155m = true;
                }
                this.f118221a.mo86632c().mo33757k();
            } else if (this.f118221a.mo86595l()) {
                C51222g gVar2 = this.f118221a;
                FollowListAdapter followListAdapter2 = gVar2.f118154l;
                if (followListAdapter2 == null) {
                    C89219l.m154710a("mFollowerListAdapter");
                }
                followListAdapter2.aq_();
                if (gVar2.mo86638v() || gVar2.f118155m || !gVar2.mo86635s()) {
                    FollowerRelationViewModel b = gVar2.mo86631b();
                    b.mo33687b_(new FollowerRelationViewModel.C51367i(b));
                } else {
                    FollowerRelationViewModel b2 = gVar2.mo86631b();
                    String t = gVar2.mo86636t();
                    C89219l.m154721d(t, "");
                    b2.mo33687b_(new FollowerRelationViewModel.C51365g(b2, t));
                    gVar2.f118155m = true;
                }
                C51222g.m95630a(this.f118221a).aq_();
            } else if (!this.f118221a.mo86638v()) {
                this.f118221a.mo86637u();
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$f */
    public static final class C51238f extends AbstractC89220m implements AbstractC89172b<FollowerRelationState, Boolean> {

        /* renamed from: a */
        public static final C51238f f118180a = new C51238f();

        static {
            Covode.recordClassIndex(60442);
        }

        C51238f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(FollowerRelationState followerRelationState) {
            FollowerRelationState followerRelationState2 = followerRelationState;
            C89219l.m154721d(followerRelationState2, "");
            return Boolean.valueOf(followerRelationState2.isHotsoonHasMore());
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ FollowListAdapter m95630a(C51222g gVar) {
        FollowListAdapter followListAdapter = gVar.f118154l;
        if (followListAdapter == null) {
            C89219l.m154710a("mFollowerListAdapter");
        }
        return followListAdapter;
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$af */
    static final class C51230af extends AbstractC89220m implements AbstractC89172b<FollowerRelationState, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C51222g f118166a;

        static {
            Covode.recordClassIndex(60434);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51230af(C51222g gVar) {
            super(1);
            this.f118166a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(FollowerRelationState followerRelationState) {
            FollowerRelationState followerRelationState2 = followerRelationState;
            C89219l.m154721d(followerRelationState2, "");
            return Boolean.valueOf(this.f118166a.mo86588a(followerRelationState2.getListState()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$ag */
    static final class C51231ag extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C51231ag f118167a = new C51231ag();

        static {
            Covode.recordClassIndex(60435);
        }

        C51231ag() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_large_lock;
            aVar2.f54435e = Integer.valueOf((int) R.attr.bd);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$e */
    public static final class C51237e extends AbstractC89220m implements AbstractC89172b<FollowerRelationState, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C51222g f118179a;

        static {
            Covode.recordClassIndex(60441);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51237e(C51222g gVar) {
            super(1);
            this.f118179a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(FollowerRelationState followerRelationState) {
            FollowerRelationState followerRelationState2 = followerRelationState;
            C89219l.m154721d(followerRelationState2, "");
            followerRelationState2.getListState().getList().size();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$i */
    public static final class C51243i extends AbstractC89220m implements AbstractC89172b<FollowerRelationState, String> {

        /* renamed from: a */
        public static final C51243i f118188a = new C51243i();

        static {
            Covode.recordClassIndex(60447);
        }

        C51243i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(FollowerRelationState followerRelationState) {
            FollowerRelationState followerRelationState2 = followerRelationState;
            C89219l.m154721d(followerRelationState2, "");
            if (followerRelationState2.getHotsoonText().length() == 0) {
                return "Unable to view more followers due to this user's privacy setting";
            }
            return followerRelationState2.getHotsoonText();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$l */
    static final class C51246l extends AbstractC89220m implements AbstractC89172b<AbstractC20477i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51222g f118201a;

        static {
            Covode.recordClassIndex(60450);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51246l(C51222g gVar) {
            super(1);
            this.f118201a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar) {
            C89219l.m154721d(iVar, "");
            ((DmtStatusView) this.f118201a.mo60929a(R.id.e7i)).mo27384f();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$q */
    static final class C51252q extends AbstractC89220m implements AbstractC89172b<AbstractC20477i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51222g f118209a;

        static {
            Covode.recordClassIndex(60456);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51252q(C51222g gVar) {
            super(1);
            this.f118209a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar) {
            C89219l.m154721d(iVar, "");
            C51222g.m95630a(this.f118209a).ao_();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$w */
    static final class C51259w extends AbstractC89220m implements AbstractC89172b<AbstractC20477i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51222g f118216a;

        static {
            Covode.recordClassIndex(60463);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51259w(C51222g gVar) {
            super(1);
            this.f118216a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar) {
            AbstractC20477i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            iVar2.withState(this.f118216a.mo86631b(), new AbstractC89172b<FollowerRelationState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.following.p3003ui.C51222g.C51259w.C512601 */

                /* renamed from: a */
                final /* synthetic */ C51259w f118217a;

                static {
                    Covode.recordClassIndex(60464);
                }

                {
                    this.f118217a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(FollowerRelationState followerRelationState) {
                    FollowerRelationState followerRelationState2 = followerRelationState;
                    C89219l.m154721d(followerRelationState2, "");
                    if (followerRelationState2.getListState().isEmpty().f48382a) {
                        ((DmtStatusView) this.f118217a.f118216a.mo60929a(R.id.e7i)).mo27384f();
                    } else {
                        C51222g.m95630a(this.f118217a.f118216a).ao_();
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$ab */
    public static final class C51226ab extends AbstractC89220m implements AbstractC89172b<FollowerRelationState, Boolean> {

        /* renamed from: a */
        public static final C51226ab f118162a = new C51226ab();

        static {
            Covode.recordClassIndex(60430);
        }

        C51226ab() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(FollowerRelationState followerRelationState) {
            List<Object> a;
            FollowerRelationState followerRelationState2 = followerRelationState;
            C89219l.m154721d(followerRelationState2, "");
            List<Object> a2 = followerRelationState2.getListState().getRefresh().mo33695a();
            boolean z = false;
            if ((a2 == null || a2.isEmpty()) && ((a = followerRelationState2.getListState().getLoadMore().mo33695a()) == null || a.isEmpty())) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$ae */
    static final class C51229ae extends AbstractC89220m implements AbstractC89172b<FollowerRelationState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51222g f118165a;

        static {
            Covode.recordClassIndex(60433);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51229ae(C51222g gVar) {
            super(1);
            this.f118165a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(FollowerRelationState followerRelationState) {
            FollowerRelationState followerRelationState2 = followerRelationState;
            C89219l.m154721d(followerRelationState2, "");
            List<Object> recommendList = followerRelationState2.getRecommendList();
            if (recommendList == null || recommendList.isEmpty()) {
                this.f118165a.mo86631b().f118388c.loadMore();
            } else {
                this.f118165a.mo86632c().mo33758l();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$n */
    static final class C51249n extends AbstractC89220m implements AbstractC89172b<AbstractC20477i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51222g f118206a;

        static {
            Covode.recordClassIndex(60453);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51249n(C51222g gVar) {
            super(1);
            this.f118206a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar) {
            C89219l.m154721d(iVar, "");
            if (this.f118206a.mo86638v()) {
                ((DmtStatusView) this.f118206a.mo60929a(R.id.e7i)).mo27384f();
            } else {
                C51222g.m95630a(this.f118206a).ao_();
            }
            return C89391z.f203057a;
        }
    }

    @AbstractC90264r
    public final void onAntiCrawlerEvent(C34569a aVar) {
        C89219l.m154721d(aVar, "");
        String str = aVar.f81610a;
        if (str == null) {
            return;
        }
        if (C89361p.m154908a((CharSequence) str, (CharSequence) "/aweme/v1/user/follower/list/?", false) || C89361p.m154908a((CharSequence) str, (CharSequence) "/aweme/v1/user/following/list/?", false)) {
            EventBus.m156962a().mo145397d(aVar);
            mo86598p();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$o */
    static final class C51250o extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51222g f118207a;

        static {
            Covode.recordClassIndex(60454);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51250o(C51222g gVar) {
            super(2);
            this.f118207a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(th, "");
            if (this.f118207a.mo86638v()) {
                this.f118207a.mo86639w();
            } else {
                this.f118207a.mo86637u();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$r */
    static final class C51253r extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51222g f118210a;

        static {
            Covode.recordClassIndex(60457);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51253r(C51222g gVar) {
            super(2);
            this.f118210a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(th, "");
            C51222g.m95630a(this.f118210a).mo67824j();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$x */
    static final class C51261x extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51222g f118218a;

        static {
            Covode.recordClassIndex(60465);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51261x(C51222g gVar) {
            super(2);
            this.f118218a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(th, "");
            C51222g.m95630a(this.f118218a).mo67824j();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$y */
    static final class C51262y extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51222g f118219a;

        static {
            Covode.recordClassIndex(60466);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51262y(C51222g gVar) {
            super(2);
            this.f118219a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends Object> list) {
            AbstractC20477i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            C89219l.m154721d(list, "");
            iVar2.withState(this.f118219a.mo86631b(), new AbstractC89172b<FollowerRelationState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.following.p3003ui.C51222g.C51262y.C512631 */

                /* renamed from: a */
                final /* synthetic */ C51262y f118220a;

                static {
                    Covode.recordClassIndex(60467);
                }

                {
                    this.f118220a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(FollowerRelationState followerRelationState) {
                    FollowerRelationState followerRelationState2 = followerRelationState;
                    C89219l.m154721d(followerRelationState2, "");
                    if (!this.f118220a.f118219a.mo86631b().mo86758a(followerRelationState2.getListState().getPayload().f48406a.f48382a, followerRelationState2.getListState().getPayload().f117970e, followerRelationState2.getListState().getPayload().f117971f)) {
                        if (!this.f118220a.f118219a.mo86638v() || this.f118220a.f118219a.mo86633m()) {
                            ((DmtStatusView) this.f118220a.f118219a.mo60929a(R.id.e7i)).mo27382d();
                        } else {
                            this.f118220a.f118219a.mo86639w();
                        }
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$aa */
    static final class C51224aa extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51222g f118160a;

        static {
            Covode.recordClassIndex(60428);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51224aa(C51222g gVar) {
            super(2);
            this.f118160a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            AbstractC20477i iVar2 = iVar;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar2, "");
            if (booleanValue && !this.f118160a.mo86633m()) {
                iVar2.withState(this.f118160a.mo86631b(), new AbstractC89172b<FollowerRelationState, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.following.p3003ui.C51222g.C51224aa.C512251 */

                    /* renamed from: a */
                    final /* synthetic */ C51224aa f118161a;

                    static {
                        Covode.recordClassIndex(60429);
                    }

                    {
                        this.f118161a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(FollowerRelationState followerRelationState) {
                        FollowerRelationState followerRelationState2 = followerRelationState;
                        C89219l.m154721d(followerRelationState2, "");
                        if (followerRelationState2.getListState().isEmpty().f48382a && !followerRelationState2.getListState().getPayload().f48406a.f48382a && ((followerRelationState2.getListState().getLoadMore() instanceof C20372aj) || (followerRelationState2.getListState().getRefresh() instanceof C20372aj))) {
                            this.f118161a.f118160a.mo86639w();
                        }
                        return C89391z.f203057a;
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$ac */
    static final class C51227ac extends AbstractC89220m implements AbstractC89183m<FollowerRelationState, Bundle, FollowerRelationState> {

        /* renamed from: a */
        final /* synthetic */ C51222g f118163a;

        static {
            Covode.recordClassIndex(60431);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51227ac(C51222g gVar) {
            super(2);
            this.f118163a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ FollowerRelationState invoke(FollowerRelationState followerRelationState, Bundle bundle) {
            String secUid;
            FollowerRelationState followerRelationState2 = followerRelationState;
            String str = "";
            C89219l.m154721d(followerRelationState2, str);
            String str2 = ((AbstractC51143a) this.f118163a).f117988b;
            if (str2 == null) {
                str2 = str;
            }
            User user = this.f118163a.f117989c;
            if (!(user == null || (secUid = user.getSecUid()) == null)) {
                str = secUid;
            }
            return FollowerRelationState.copy$default(followerRelationState2, str2, str, null, null, false, 0, null, null, null, 508, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$v */
    static final class C51257v extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51222g f118214a;

        static {
            Covode.recordClassIndex(60461);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51257v(C51222g gVar) {
            super(2);
            this.f118214a = gVar;
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
                ((DmtStatusView) this.f118214a.mo60929a(R.id.e7i)).mo27382d();
            }
            iVar2.withState(this.f118214a.mo86631b(), new AbstractC89172b<FollowerRelationState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.following.p3003ui.C51222g.C51257v.C512581 */

                /* renamed from: a */
                final /* synthetic */ C51257v f118215a;

                static {
                    Covode.recordClassIndex(60462);
                }

                {
                    this.f118215a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(FollowerRelationState followerRelationState) {
                    FollowerRelationState followerRelationState2 = followerRelationState;
                    C89219l.m154721d(followerRelationState2, "");
                    if (!this.f118215a.f118214a.mo86631b().mo86758a(followerRelationState2.getListState().getPayload().f48406a.f48382a, followerRelationState2.getListState().getPayload().f117970e, followerRelationState2.getListState().getPayload().f117971f)) {
                        if (!this.f118215a.f118214a.mo86638v() || this.f118215a.f118214a.mo86633m()) {
                            ((DmtStatusView) this.f118215a.f118214a.mo60929a(R.id.e7i)).mo27382d();
                        } else {
                            this.f118215a.f118214a.mo86639w();
                        }
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$ad */
    static final class C51228ad extends AbstractC89220m implements AbstractC89183m<RecommendUserListState, Bundle, RecommendUserListState> {

        /* renamed from: a */
        final /* synthetic */ C51222g f118164a;

        static {
            Covode.recordClassIndex(60432);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51228ad(C51222g gVar) {
            super(2);
            this.f118164a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ RecommendUserListState invoke(RecommendUserListState recommendUserListState, Bundle bundle) {
            String secUid;
            RecommendUserListState recommendUserListState2 = recommendUserListState;
            String str = "";
            C89219l.m154721d(recommendUserListState2, str);
            String str2 = ((AbstractC51143a) this.f118164a).f117988b;
            if (str2 == null) {
                str2 = str;
            }
            User user = this.f118164a.f117989c;
            if (!(user == null || (secUid = user.getSecUid()) == null)) {
                str = secUid;
            }
            return RecommendUserListState.copy$default(recommendUserListState2, str2, str, this.f118164a.mo86591h(), 14, null, new C66760a(this.f118164a.mo86593j(), this.f118164a.mo86594k(), "empty"), null, 80, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$p */
    static final class C51251p extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51222g f118208a;

        static {
            Covode.recordClassIndex(60455);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51251p(C51222g gVar) {
            super(2);
            this.f118208a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends User> list) {
            String str;
            List<? extends User> list2 = list;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(list2, "");
            if (this.f118208a.mo86638v() && list2.isEmpty()) {
                this.f118208a.mo86639w();
            } else if (this.f118208a.mo86638v()) {
                ((DmtStatusView) this.f118208a.mo60929a(R.id.e7i)).mo27382d();
                FollowerRelationViewModel b = this.f118208a.mo86631b();
                if (this.f118208a.mo86635s()) {
                    str = this.f118208a.mo86636t();
                } else {
                    str = "";
                }
                C89219l.m154721d(str, "");
                b.mo33687b_(new FollowerRelationViewModel.C51363f(b, str));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$t */
    static final class C51255t extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends User>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51222g f118212a;

        static {
            Covode.recordClassIndex(60459);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51255t(C51222g gVar) {
            super(2);
            this.f118212a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends User> list) {
            List<? extends User> list2 = list;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(list2, "");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            int i2 = 0;
            for (T t : list2) {
                int i3 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                T t2 = t;
                if (t2 instanceof RecommendContact) {
                    arrayList.add(t2);
                } else {
                    String requestId = t2.getRequestId();
                    C89219l.m154716b(requestId, "");
                    arrayList.add(new C51108g(2, t2, i2, requestId));
                    i2++;
                }
                i = i3;
            }
            if (!list2.isEmpty()) {
                String string = this.f118212a.getResources().getString(R.string.asd);
                C89219l.m154716b(string, "");
                arrayList.add(0, new C51107f(4, string));
            }
            FollowerRelationViewModel b = this.f118212a.mo86631b();
            C89219l.m154721d(arrayList, "");
            b.mo33689c(new FollowerRelationViewModel.C51374n(arrayList));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$s */
    static final class C51254s extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51222g f118211a;

        static {
            Covode.recordClassIndex(60458);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51254s(C51222g gVar) {
            super(2);
            this.f118211a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(th2, "");
            if (!(th2 instanceof C34485a) || ((C34480a) th2).getErrorCode() != 2096) {
                C51222g gVar = this.f118211a;
                DmtStatusView dmtStatusView = (DmtStatusView) gVar.mo60929a(R.id.e7i);
                C89219l.m154716b(dmtStatusView, "");
                gVar.mo86586a(dmtStatusView, (Exception) th2);
                ((DmtStatusView) this.f118211a.mo60929a(R.id.e7i)).mo27387h();
                C51222g.m95630a(this.f118211a).ap_();
            } else {
                ((DmtStatusView) this.f118211a.mo60929a(R.id.e7i)).mo27382d();
                C51222g gVar2 = this.f118211a;
                TuxStatusView.C23263c a = new TuxStatusView.C23263c().mo37877a(C23005c.m43393a(C51231ag.f118167a));
                String string = gVar2.getString(R.string.esw);
                C89219l.m154716b(string, "");
                TuxStatusView.C23263c a2 = a.mo37879a(string);
                String string2 = gVar2.getString(R.string.evg);
                C89219l.m154716b(string2, "");
                ((TuxStatusView) gVar2.mo60929a(R.id.b7a)).setStatus(a2.mo37878a((CharSequence) string2));
                ((TuxStatusView) gVar2.mo60929a(R.id.b7a)).setLayoutVariant(0);
                TuxStatusView tuxStatusView = (TuxStatusView) gVar2.mo60929a(R.id.b7a);
                C89219l.m154716b(tuxStatusView, "");
                tuxStatusView.setVisibility(0);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
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
        C80494gh.m139518a((RecyclerView) mo60929a(R.id.dof), 8);
        FollowListAdapter followListAdapter = new FollowListAdapter(this, "follower_relation", mo86591h());
        followListAdapter.mo86602a(this.f117992j);
        this.f118154l = followListAdapter;
        RecyclerView recyclerView3 = (RecyclerView) mo60929a(R.id.dof);
        C89219l.m154716b(recyclerView3, "");
        followListAdapter.mo67820g(C0643b.m2378c(recyclerView3.getContext(), R.color.nc));
        RecyclerView recyclerView4 = (RecyclerView) mo60929a(R.id.dof);
        C89219l.m154716b(recyclerView4, "");
        FollowListAdapter followListAdapter2 = this.f118154l;
        if (followListAdapter2 == null) {
            C89219l.m154710a("mFollowerListAdapter");
        }
        recyclerView4.setAdapter(followListAdapter2);
        FollowListAdapter followListAdapter3 = this.f118154l;
        if (followListAdapter3 == null) {
            C89219l.m154710a("mFollowerListAdapter");
        }
        followListAdapter3.mo67813a(new C51239g(this));
        RecyclerView recyclerView5 = (RecyclerView) mo60929a(R.id.dof);
        C89219l.m154716b(recyclerView5, "");
        new C80440fo(recyclerView5, new C51241h(this));
        C51221f fVar = new C51221f(C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.ams, (ViewGroup) mo60929a(R.id.dof), false), new C51273o(((AbstractC51143a) this).f117988b, mo86591h(), EnumC51102a.FOLLOWER));
        C89219l.m154716b(fVar, "");
        if (fVar.f118148d && fVar.f118145a != null && !fVar.f118145a.isBlock() && !fVar.f118145a.isBlocked()) {
            FollowListAdapter followListAdapter4 = this.f118154l;
            if (followListAdapter4 == null) {
                C89219l.m154710a("mFollowerListAdapter");
            }
            View view2 = fVar.itemView;
            if (view2 != null) {
                ((AbstractC34497h) followListAdapter4).f81483b = view2;
                followListAdapter4.notifyItemInserted(0);
            }
        }
        ListMiddleware<FollowerRelationState, Object, C51133f> listMiddleware = mo86631b().f118388c;
        FollowListAdapter followListAdapter5 = this.f118154l;
        if (followListAdapter5 == null) {
            C89219l.m154710a("mFollowerListAdapter");
        }
        ListMiddleware.m38615a(listMiddleware, this, followListAdapter5, false, new C51244j(new C51246l(this), new C51254s(this), new C51257v(this)), new C51245k(new C51259w(this), new C51261x(this), new C51262y(this)), new C51264z(this), new C51224aa(this), 780);
        AbstractC88412b unused = selectSubscribe(mo86631b(), C51272n.f118229a, C51266h.f118223a, new C20370ah(), new C51247m(this));
        AbstractC20468h.C20469a.m38667a(this, mo86632c(), C51267i.f118224a, (C20370ah) null, new C51250o(this), new C51249n(this), new C51251p(this), 2);
        AbstractC20468h.C20469a.m38667a(this, mo86632c(), C51268j.f118225a, (C20370ah) null, new C51253r(this), new C51252q(this), (AbstractC89183m) null, 18);
        AbstractC88412b unused2 = selectSubscribe(mo86632c(), C51269k.f118226a, new C20370ah(), new C51255t(this));
        AbstractC88412b unused3 = selectSubscribe(mo86632c(), C51270l.f118227a, C51271m.f118228a, new C20370ah(), new C51256u(this));
        if (!this.f117990d) {
            mo86631b().f118388c.refresh();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$m */
    static final class C51247m extends AbstractC89220m implements AbstractC89187q<AbstractC20477i, ListState<Object, C51133f>, List<? extends Object>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51222g f118202a;

        static {
            Covode.recordClassIndex(60451);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51247m(C51222g gVar) {
            super(3);
            this.f118202a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, ListState<Object, C51133f> listState, List<? extends Object> list) {
            final ListState<Object, C51133f> listState2 = listState;
            final List<? extends Object> list2 = list;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(listState2, "");
            C89219l.m154721d(list2, "");
            RecyclerView recyclerView = (RecyclerView) this.f118202a.mo60929a(R.id.dof);
            C89219l.m154716b(recyclerView, "");
            if (!recyclerView.mo4484l()) {
                ((RecyclerView) this.f118202a.mo60929a(R.id.dof)).post(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.following.p3003ui.C51222g.C51247m.RunnableC512481 */

                    /* renamed from: a */
                    final /* synthetic */ C51247m f118203a;

                    static {
                        Covode.recordClassIndex(60452);
                    }

                    {
                        this.f118203a = r1;
                    }

                    public final void run() {
                        C51222g.m95630a(this.f118203a.f118202a).mo60931a(C89070n.m154572d((Collection) listState2.getList(), (Iterable) list2));
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.g$u */
    static final class C51256u extends AbstractC89220m implements AbstractC89187q<AbstractC20477i, List<? extends User>, C20442b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C51222g f118213a;

        static {
            Covode.recordClassIndex(60460);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51256u(C51222g gVar) {
            super(3);
            this.f118213a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends User> list, C20442b bVar) {
            List<? extends User> list2 = list;
            C20442b bVar2 = bVar;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(list2, "");
            C89219l.m154721d(bVar2, "");
            if (bVar2.f48382a) {
                C51222g.m95630a(this.f118213a).aq_();
            } else if (!this.f118213a.mo86638v() || !list2.isEmpty()) {
                this.f118213a.mo86637u();
            }
            return C89391z.f203057a;
        }
    }
}
