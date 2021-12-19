package com.p2082ss.android.ugc.aweme.ecommerce.address.edit;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.ies.dmt.p1194ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20380ar;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.base.arch.C34499i;
import com.p2082ss.android.ugc.aweme.ecommerce.address.AddressPageStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.address.api.AddressApi;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.C43372h;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.InputItemData;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.address.edit.p2822a.C43452b;
import com.p2082ss.android.ugc.aweme.ecommerce.address.edit.p2822a.C43458c;
import com.p2082ss.android.ugc.aweme.ecommerce.address.edit.p2823b.C43463d;
import com.p2082ss.android.ugc.aweme.ecommerce.address.edit.p2823b.C43464e;
import com.p2082ss.android.ugc.aweme.ecommerce.address.p2820a.C43340a;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.AbstractC43718a;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.AbstractC43756e;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.view.PageStepper;
import com.p2082ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45573n;
import com.p2082ss.android.ugc.aweme.ecommerce.util.KeyBoardVisibilityUtil;
import com.p2082ss.android.ugc.aweme.ecommerce.util.ScrollTopLinearLayoutManager;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.aweme.views.DialogC81438i;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a */
public final class C43420a extends Fragment implements AbstractC20380ar<C34499i>, AbstractC20527q, AbstractC43718a, AbstractC43756e {

    /* renamed from: f */
    public static final C43425d f101312f = new C43425d((byte) 0);

    /* renamed from: a */
    public final C34499i f101313a = new C34499i();

    /* renamed from: b */
    public String f101314b;

    /* renamed from: c */
    public AddressPageStarter.AddressEditEnterParams f101315c;

    /* renamed from: d */
    public AbstractC89172b<? super C89378p<String, Address>, C89391z> f101316d;

    /* renamed from: e */
    public AbstractC89171a<C89391z> f101317e;

    /* renamed from: g */
    private final lifecycleAwareLazy f101318g;

    /* renamed from: h */
    private final AbstractC89244h f101319h;

    /* renamed from: i */
    private final AbstractC89244h f101320i;

    /* renamed from: j */
    private SparseArray f101321j;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a$b */
    public static final class C43422b extends AbstractC89220m implements AbstractC89183m<AddressEditState, Bundle, AddressEditState> {
        public static final C43422b INSTANCE = new C43422b();

        static {
            Covode.recordClassIndex(51651);
        }

        public C43422b() {
            super(2);
        }

        public final AddressEditState invoke(AddressEditState addressEditState, Bundle bundle) {
            C89219l.m154719c(addressEditState, "");
            return addressEditState;
        }
    }

    static {
        Covode.recordClassIndex(51649);
    }

    /* renamed from: i */
    private final DialogC81438i m86496i() {
        return (DialogC81438i) this.f101320i.getValue();
    }

    /* renamed from: a */
    public final View mo73968a(int i) {
        if (this.f101321j == null) {
            this.f101321j = new SparseArray();
        }
        View view = (View) this.f101321j.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f101321j.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final AddressEditViewModel mo73969a() {
        return (AddressEditViewModel) this.f101318g.getValue();
    }

    /* renamed from: b */
    public final C43481l mo73972b() {
        return (C43481l) this.f101319h.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a$d */
    public static final class C43425d {
        static {
            Covode.recordClassIndex(51654);
        }

        private C43425d() {
        }

        public /* synthetic */ C43425d(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a$i */
    static final class C43430i extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C43430i f101338a = new C43430i();

        static {
            Covode.recordClassIndex(51659);
        }

        C43430i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20380ar
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C34499i mo33721d() {
        return this.f101313a;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.AbstractC43718a
    /* renamed from: f */
    public final boolean mo73975f() {
        mo73974e();
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a$a */
    public static final class C43421a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f101322a;

        static {
            Covode.recordClassIndex(51650);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43421a(AbstractC89277c cVar) {
            super(0);
            this.f101322a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            String name = C89170a.m154665a(this.f101322a).getName();
            C89219l.m154709a((Object) name, "");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a$e */
    static final class C43426e extends AbstractC89220m implements AbstractC89171a<C43481l> {

        /* renamed from: a */
        final /* synthetic */ C43420a f101328a;

        static {
            Covode.recordClassIndex(51655);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43426e(C43420a aVar) {
            super(0);
            this.f101328a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C43481l invoke() {
            C43420a aVar = this.f101328a;
            C43481l lVar = new C43481l(aVar, aVar.getChildFragmentManager());
            lVar.mo67829d(false);
            return lVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a$k */
    static final class C43432k extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43420a f101340a;

        static {
            Covode.recordClassIndex(51661);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43432k(C43420a aVar) {
            super(0);
            this.f101340a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f101340a.mo73969a().mo73961a();
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        SparseArray sparseArray = this.f101321j;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a$v */
    static final class C43449v extends AbstractC89220m implements AbstractC89171a<DialogC81438i> {

        /* renamed from: a */
        final /* synthetic */ C43420a f101363a;

        static {
            Covode.recordClassIndex(51678);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43449v(C43420a aVar) {
            super(0);
            this.f101363a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DialogC81438i invoke() {
            ActivityC0945e activity = this.f101363a.getActivity();
            if (activity == null) {
                C89219l.m154715b();
            }
            return new DialogC81438i(activity);
        }
    }

    /* renamed from: c */
    public final void mo73973c() {
        if (m86496i().isShowing()) {
            m86496i().dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a$l */
    static final class C43433l extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends C43340a>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43420a f101341a;

        static {
            Covode.recordClassIndex(51662);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43433l(C43420a aVar) {
            super(2);
            this.f101341a = aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a$l$a */
        static final class RunnableC43434a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f101342a;

            /* renamed from: b */
            final /* synthetic */ C43433l f101343b;

            /* renamed from: c */
            final /* synthetic */ List f101344c;

            static {
                Covode.recordClassIndex(51663);
            }

            RunnableC43434a(int i, C43433l lVar, List list) {
                this.f101342a = i;
                this.f101343b = lVar;
                this.f101344c = list;
            }

            public final void run() {
                View g;
                RecyclerView recyclerView = (RecyclerView) this.f101343b.f101341a.mo73968a(R.id.dgn);
                C89219l.m154716b(recyclerView, "");
                RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
                if (layoutManager != null && (g = layoutManager.mo4717g(this.f101342a)) != null) {
                    C89219l.m154716b(g, "");
                    ((NestedScrollView) this.f101343b.f101341a.mo73968a(R.id.cre)).mo2945a(0, (int) g.getY(), false);
                }
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends C43340a> list) {
            C43478j jVar;
            int indexOf;
            List<? extends C43340a> list2 = list;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(list2, "");
            int itemCount = this.f101341a.mo73972b().getItemCount();
            this.f101341a.mo73972b().mo60931a(list2);
            if (itemCount == list2.size()) {
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    if (next.f101150c != null) {
                        if (next != null && (indexOf = list2.indexOf(next)) != -1) {
                            ((NestedScrollView) this.f101341a.mo73968a(R.id.cre)).post(new RunnableC43434a(indexOf, this, list2));
                        }
                    }
                }
            }
            if ((!list2.isEmpty()) && (jVar = this.f101341a.mo73969a().f101255l) != null) {
                if (!jVar.f101404c) {
                    C45544c.m88082a("tiktokec_enter_page", jVar.f101402a);
                }
                jVar.f101404c = true;
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a$c */
    public static final class C43423c extends AbstractC89220m implements AbstractC89171a<AddressEditViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f101323a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f101324b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f101325c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f101326d;

        static {
            Covode.recordClassIndex(51652);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43423c(Fragment fragment, AbstractC89171a aVar, AbstractC89277c cVar, AbstractC89183m mVar) {
            super(0);
            this.f101323a = fragment;
            this.f101324b = aVar;
            this.f101325c = cVar;
            this.f101326d = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.f101323a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
                h.f.a.a r0 = r3.f101324b
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.f101325c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m86508xce39b6f5(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.mo33696a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.ecommerce.address.edit.a$c$1 r0 = new com.ss.android.ugc.aweme.ecommerce.address.edit.a$c$1
                r0.<init>(r3)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.address.edit.C43420a.C43423c.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_address_edit_AddressEditFragment$$special$$inlined$viewModel$3_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m86508xce39b6f5(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.AbstractC43756e
    /* renamed from: g */
    public final void mo73976g() {
        C43476i iVar;
        if (!ActivityStack.isAppBackGround() && (iVar = mo73969a().f101254k) != null) {
            new C43464e().mo76746c(iVar.f101398a);
        }
        C43476i iVar2 = mo73969a().f101254k;
        if (iVar2 != null) {
            iVar2.f101400c = SystemClock.elapsedRealtime();
        }
        C43478j jVar = mo73969a().f101255l;
        if (jVar != null) {
            jVar.f101403b = SystemClock.elapsedRealtime();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        C43476i iVar = mo73969a().f101254k;
        if (iVar != null) {
            new C43463d(iVar.f101399b).mo76746c(iVar.f101398a);
        }
        C43476i iVar2 = mo73969a().f101254k;
        if (iVar2 != null) {
            iVar2.f101398a = new LinkedHashMap();
            iVar2.f101399b = 0;
            iVar2.f101400c = 0;
        }
    }

    public C43420a() {
        AbstractC89277c a = C89204ab.m154669a(AddressEditViewModel.class);
        C43421a aVar = new C43421a(a);
        this.f101318g = new lifecycleAwareLazy(this, aVar, new C43423c(this, aVar, a, C43422b.INSTANCE));
        this.f101319h = C89250i.m154773a((AbstractC89171a) new C43426e(this));
        this.f101320i = C89250i.m154773a((AbstractC89171a) new C43449v(this));
        this.f101315c = new AddressPageStarter.AddressEditEnterParams("");
        this.f101316d = C43450w.f101364a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0038 A[Catch:{ all -> 0x004b }] */
    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.AbstractC43756e
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo73977h() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel r0 = r7.mo73969a()
            com.ss.android.ugc.aweme.ecommerce.address.edit.i r6 = r0.f101254k
            if (r6 == 0) goto L_0x0014
            long r4 = r6.f101399b
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r6.f101400c
            long r2 = r2 - r0
            long r4 = r4 + r2
            r6.f101399b = r4
        L_0x0014:
            com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel r0 = r7.mo73969a()     // Catch:{ all -> 0x004b }
            com.ss.android.ugc.aweme.ecommerce.address.edit.j r4 = r0.f101255l     // Catch:{ all -> 0x004b }
            r3 = 0
            if (r4 == 0) goto L_0x0047
            r0 = 2131368528(0x7f0a1a50, float:1.8357009E38)
            android.view.View r0 = r7.mo73968a(r0)     // Catch:{ all -> 0x004b }
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = (com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView) r0     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0031
            int r0 = r0.getVisibility()     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r2 = 0
            goto L_0x0032
        L_0x0031:
            r2 = 1
        L_0x0032:
            java.lang.String r1 = r7.f101314b     // Catch:{ all -> 0x004b }
            r7.f101314b = r3     // Catch:{ all -> 0x004b }
            if (r1 != 0) goto L_0x003a
            java.lang.String r1 = "close"
        L_0x003a:
            com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel r0 = r7.mo73969a()     // Catch:{ all -> 0x004b }
            com.ss.android.ugc.aweme.ecommerce.address.dto.Address r0 = r0.mo73967g()     // Catch:{ all -> 0x004b }
            r4.mo73997a(r2, r1, r0)     // Catch:{ all -> 0x004b }
            h.z r3 = p4600h.C89391z.f203057a     // Catch:{ all -> 0x004b }
        L_0x0047:
            p4600h.C89379q.m157068constructorimpl(r3)     // Catch:{ all -> 0x004b }
            return
        L_0x004b:
            r0 = move-exception
            java.lang.Object r0 = p4600h.C89382r.m154941a(r0)
            p4600h.C89379q.m157068constructorimpl(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.address.edit.C43420a.mo73977h():void");
    }

    /* renamed from: e */
    public final void mo73974e() {
        String string;
        String str;
        C43476i iVar = mo73969a().f101254k;
        if (iVar != null) {
            iVar.mo73992a("back", null, null);
        }
        if (!mo73969a().f101251e) {
            this.f101314b = "return";
            ActivityC0945e activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        C17197a.C17200a a = new C17197a.C17200a(getActivity()).mo27189a(R.string.bi1);
        if (this.f101315c.f101141j != null) {
            string = this.f101315c.f101141j;
        } else {
            string = getString(R.string.bi0);
        }
        a.f41071b = string;
        C17197a.C17200a a2 = a.mo27195b(R.string.ft_, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC43427f(this), false).mo27190a(R.string.ft9, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC43428g(this), false);
        a2.f41067M = true;
        a2.mo27193a().mo27185c();
        if (mo73969a().f101255l != null) {
            if (this.f101315c.f101141j == null) {
                str = "quit_editing_address";
            } else {
                str = "quit_checkout";
            }
            C43478j.m86536d(str);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a$h */
    public static final class C43429h extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f101331a = 700;

        /* renamed from: b */
        final /* synthetic */ int f101332b = R.drawable.zb;

        /* renamed from: c */
        final /* synthetic */ Context f101333c;

        /* renamed from: d */
        final /* synthetic */ int f101334d;

        /* renamed from: e */
        final /* synthetic */ int f101335e;

        /* renamed from: f */
        final /* synthetic */ int f101336f;

        /* renamed from: g */
        final /* synthetic */ AbstractC89171a f101337g;

        static {
            Covode.recordClassIndex(51658);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                this.f101337g.invoke();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43429h(Context context, AbstractC89171a aVar) {
            super(700);
            this.f101333c = context;
            this.f101334d = R.string.bfr;
            this.f101335e = R.string.bfq;
            this.f101336f = R.string.bfs;
            this.f101337g = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a$t */
    public static final class C43444t implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ C43420a f101356a;

        /* renamed from: b */
        final /* synthetic */ AddressPageStarter.AddressEditEnterParams f101357b;

        static {
            Covode.recordClassIndex(51673);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            this.f101356a.mo73974e();
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
            C43476i iVar = this.f101356a.mo73969a().f101254k;
            if (iVar != null) {
                iVar.mo73992a("delete", null, null);
            }
            C17197a.C17200a a = new C17197a.C17200a(this.f101356a.getActivity()).mo27189a(R.string.ftn).mo27194b(R.string.ftl).mo27195b(R.string.fth, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.address.edit.C43420a.C43444t.DialogInterface$OnClickListenerC434451 */

                /* renamed from: a */
                final /* synthetic */ C43444t f101358a;

                static {
                    Covode.recordClassIndex(51674);
                }

                {
                    this.f101358a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (this.f101358a.f101356a.mo73969a().f101255l != null) {
                        C43478j.m86535a("delete_address", "no");
                    }
                    C43476i iVar = this.f101358a.f101356a.mo73969a().f101254k;
                    if (iVar != null) {
                        iVar.mo73993a("delete_address", "keep");
                    }
                }
            }, false).mo27190a(R.string.ftj, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.address.edit.C43420a.C43444t.DialogInterface$OnClickListenerC434462 */

                /* renamed from: a */
                final /* synthetic */ C43444t f101359a;

                static {
                    Covode.recordClassIndex(51675);
                }

                {
                    this.f101359a = r1;
                }

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (this.f101359a.f101356a.mo73969a().f101255l != null) {
                        C43478j.m86535a("delete_address", "yes");
                    }
                    C43476i iVar = this.f101359a.f101356a.mo73969a().f101254k;
                    if (iVar != null) {
                        iVar.mo73993a("delete_address", "delete");
                    }
                    AddressEditViewModel a = this.f101359a.f101356a.mo73969a();
                    a.mo33689c(AddressEditViewModel.C43384a.f101261a);
                    String str = a.f101250d;
                    C89219l.m154721d(str, "");
                    AbstractC88412b a2 = ((AddressApi) AddressApi.C43341a.f101152a.mo28858a(AddressApi.class)).deleteAddress(new C43372h(C89070n.m154516a(str))).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new AddressEditViewModel.C43385b(a), new AddressEditViewModel.C43388c(a));
                    C89219l.m154716b(a2, "");
                    a.mo33680a(a2);
                }
            }, false);
            a.f41067M = true;
            a.mo27193a().mo27185c();
            if (this.f101356a.mo73969a().f101255l != null) {
                C43478j.m86536d("delete_address");
            }
        }

        C43444t(C43420a aVar, AddressPageStarter.AddressEditEnterParams addressEditEnterParams) {
            this.f101356a = aVar;
            this.f101357b = addressEditEnterParams;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a$w */
    static final class C43450w extends AbstractC89220m implements AbstractC89172b<C89378p<? extends String, ? extends Address>, C89391z> {

        /* renamed from: a */
        public static final C43450w f101364a = new C43450w();

        static {
            Covode.recordClassIndex(51679);
        }

        C43450w() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C89378p<? extends String, ? extends Address> pVar) {
            C89219l.m154721d(pVar, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo73970a(AddressPageStarter.AddressEditEnterParams addressEditEnterParams) {
        C89219l.m154721d(addressEditEnterParams, "");
        this.f101315c = addressEditEnterParams;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a$j */
    static final class View$OnClickListenerC43431j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C43420a f101339a;

        static {
            Covode.recordClassIndex(51660);
        }

        View$OnClickListenerC43431j(C43420a aVar) {
            this.f101339a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f101339a.mo73969a().mo73961a();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("enter_params", this.f101315c);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a$s */
    public static final class C43443s extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f101353a = 700;

        /* renamed from: b */
        final /* synthetic */ C43420a f101354b;

        /* renamed from: c */
        final /* synthetic */ AddressPageStarter.AddressEditEnterParams f101355c;

        static {
            Covode.recordClassIndex(51672);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            String str;
            if (view != null) {
                ActivityC0945e activity = this.f101354b.getActivity();
                if (activity != null) {
                    C45573n.m88122a(activity);
                }
                AddressEditViewModel a = this.f101354b.mo73969a();
                a.mo33687b_(new AddressEditViewModel.C43399m(a));
                AddressPageStarter.AddressEditEnterParams addressEditEnterParams = this.f101355c;
                if (addressEditEnterParams == null || addressEditEnterParams.f101140i != 1) {
                    str = "save";
                } else {
                    str = "next";
                }
                C43478j jVar = this.f101354b.mo73969a().f101255l;
                if (jVar != null) {
                    C89219l.m154721d(str, "");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.putAll(jVar.f101402a);
                    linkedHashMap.put("button_name", str);
                    C45544c.m88082a("tiktokec_button_click", linkedHashMap);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43443s(C43420a aVar, AddressPageStarter.AddressEditEnterParams addressEditEnterParams) {
            super(700);
            this.f101354b = aVar;
            this.f101355c = addressEditEnterParams;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        List<Region> list;
        String str;
        String str2;
        AddressPageStarter.AddressEditEnterParams addressEditEnterParams;
        String str3 = "";
        if (!(bundle == null || (addressEditEnterParams = (AddressPageStarter.AddressEditEnterParams) bundle.getParcelable("enter_params")) == null)) {
            C89219l.m154716b(addressEditEnterParams, str3);
            this.f101315c = addressEditEnterParams;
        }
        super.onCreate(bundle);
        AddressEditViewModel a = mo73969a();
        AddressPageStarter.AddressEditEnterParams addressEditEnterParams2 = this.f101315c;
        C43476i iVar = new C43476i(this.f101315c);
        C43478j jVar = new C43478j(this.f101315c);
        a.f101257n = addressEditEnterParams2;
        a.f101254k = iVar;
        a.f101255l = jVar;
        a.f101248b = addressEditEnterParams2 != null ? addressEditEnterParams2.f101133b : null;
        a.f101260q = addressEditEnterParams2 != null ? addressEditEnterParams2.f101133b : null;
        if (!(addressEditEnterParams2 == null || (str2 = addressEditEnterParams2.f101134c) == null)) {
            str3 = str2;
        }
        a.f101252f = str3;
        if (!(addressEditEnterParams2 == null || (str = addressEditEnterParams2.f101135d) == null)) {
            a.f101253g = (HashMap) new C27910f().mo46671a(str, new AddressEditViewModel.C43397k().type);
        }
        Address address = a.f101248b;
        if (address != null) {
            a.f101247a = address.f101189c;
            a.f101250d = address.f101187a;
            return;
        }
        if (!(addressEditEnterParams2 == null || (list = addressEditEnterParams2.f101132a) == null)) {
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (t != null) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (!arrayList2.isEmpty()) {
                a.f101249c = arrayList2;
                a.f101247a = (Region) arrayList2.get(0);
                return;
            }
        }
        a.f101247a = new Region(null, null, C58071d.m104907a(), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        AddressPageStarter.AddressEditEnterParams addressEditEnterParams = this.f101315c;
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            RecyclerView recyclerView = (RecyclerView) mo73968a(R.id.dgn);
            C89219l.m154716b(recyclerView, "");
            recyclerView.setAdapter(mo73972b());
            RecyclerView recyclerView2 = (RecyclerView) mo73968a(R.id.dgn);
            C89219l.m154716b(recyclerView2, "");
            C89219l.m154716b(activity, "");
            recyclerView2.setLayoutManager(new ScrollTopLinearLayoutManager(activity));
            RecyclerView recyclerView3 = (RecyclerView) mo73968a(R.id.dgn);
            C89219l.m154716b(recyclerView3, "");
            recyclerView3.setNestedScrollingEnabled(false);
            ((RecyclerView) mo73968a(R.id.ate)).mo4402a(new C43458c((int) C13628n.m24520b(getActivity(), 12.0f), (int) C13628n.m24520b(getActivity(), 16.0f)));
            if (addressEditEnterParams != null && addressEditEnterParams.f101140i == 1) {
                TuxButton tuxButton = (TuxButton) mo73968a(R.id.dow);
                C89219l.m154716b(tuxButton, "");
                tuxButton.setText(getString(R.string.bi7));
            }
            TuxButton tuxButton2 = (TuxButton) mo73968a(R.id.dow);
            C89219l.m154716b(tuxButton2, "");
            tuxButton2.setOnClickListener(new C43443s(this, addressEditEnterParams));
            if (mo73969a().f101248b != null) {
                ((NormalTitleBar) mo73968a(R.id.eim)).setEndBtnIcon(R.drawable.yt);
            }
            ((NormalTitleBar) mo73968a(R.id.eim)).setOnTitleBarClickListener(new C43444t(this, addressEditEnterParams));
            if (addressEditEnterParams != null) {
                Integer num = addressEditEnterParams.f101136e;
                Integer num2 = addressEditEnterParams.f101137f;
                if (!(num == null || num2 == null)) {
                    ((PageStepper) mo73968a(R.id.e80)).setTotalStep(num2.intValue());
                    ((PageStepper) mo73968a(R.id.e80)).setLightStep(num.intValue());
                    PageStepper pageStepper = (PageStepper) mo73968a(R.id.e80);
                    C89219l.m154716b(pageStepper, "");
                    pageStepper.setVisibility(0);
                }
            }
            new KeyBoardVisibilityUtil(activity, 16, new C43447u(this, addressEditEnterParams));
        }
        Context context = getContext();
        if (context != null) {
            DmtStatusView.C17269a a = DmtStatusView.C17269a.m31905a(getActivity()).mo27400a(2131232924, R.string.bfu, R.string.bft, R.string.bfs, new View$OnClickListenerC43431j(this));
            C89219l.m154716b(context, "");
            C43432k kVar = new C43432k(this);
            View a2 = C1764a.m5927a(LayoutInflater.from(context), R.layout.pj, (ViewGroup) mo73968a(R.id.acf), false);
            ((AppCompatImageView) a2.findViewById(R.id.bky)).setImageResource(R.drawable.zb);
            TuxTextView tuxTextView = (TuxTextView) a2.findViewById(R.id.text);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setText(context.getText(R.string.bfr));
            TuxTextView tuxTextView2 = (TuxTextView) a2.findViewById(R.id.efr);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setText(context.getText(R.string.bfq));
            TuxButton tuxButton3 = (TuxButton) a2.findViewById(R.id.djd);
            C89219l.m154716b(tuxButton3, "");
            tuxButton3.setText(context.getText(R.string.bfs));
            TuxButton tuxButton4 = (TuxButton) a2.findViewById(R.id.djd);
            C89219l.m154716b(tuxButton4, "");
            tuxButton4.setOnClickListener(new C43429h(context, kVar));
            C89219l.m154716b(a2, "");
            ((DmtStatusView) mo73968a(R.id.e77)).setBuilder(a.mo27409d(a2));
        }
        AbstractC88412b unused = selectSubscribe(mo73969a(), C43459b.f101380a, new C20370ah(), new C43437o(this));
        AbstractC88412b unused2 = selectSubscribe(mo73969a(), C43472e.f101394a, new C20370ah(), new C43438p(this));
        AbstractC88412b unused3 = selectSubscribe(mo73969a(), C43473f.f101395a, new C20370ah(), new C43440q(this));
        AbstractC88412b unused4 = selectSubscribe(mo73969a(), C43474g.f101396a, new C20370ah(), new C43442r(this));
        AbstractC88412b unused5 = selectSubscribe(mo73969a(), C43475h.f101397a, new C20370ah(), new C43433l(this));
        AbstractC88412b unused6 = selectSubscribe(mo73969a(), C43466c.f101389a, new C20370ah(), new C43435m(this));
        AbstractC88412b unused7 = selectSubscribe(mo73969a(), C43471d.f101393a, new C20370ah(), new C43436n(this));
        InputItemData inputItemData = this.f101315c.f101138g;
        if (inputItemData != null) {
            AddressEditViewModel a3 = mo73969a();
            C89219l.m154721d(inputItemData, "");
            a3.mo73962a(-1);
            a3.mo73964a(inputItemData);
            return;
        }
        mo73969a().mo73961a();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a$o */
    static final class C43437o extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43420a f101347a;

        static {
            Covode.recordClassIndex(51666);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43437o(C43420a aVar) {
            super(2);
            this.f101347a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(iVar, "");
            ((DmtStatusView) this.f101347a.mo73968a(R.id.e77)).setStatus(intValue);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a$p */
    static final class C43438p extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43420a f101348a;

        static {
            Covode.recordClassIndex(51667);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43438p(C43420a aVar) {
            super(2);
            this.f101348a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num) {
            C89219l.m154721d(iVar, "");
            this.f101348a.mo73971a(num, new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.address.edit.C43420a.C43438p.C434391 */

                /* renamed from: a */
                final /* synthetic */ C43438p f101349a;

                static {
                    Covode.recordClassIndex(51668);
                }

                {
                    this.f101349a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    EventCenter.m87158a().mo75479a("ec_address_change", new AddressPageStarter.C43338a(this.f101349a.f101348a.mo73969a().f101250d, 2).mo73855a());
                    this.f101349a.f101348a.f101314b = "return";
                    ActivityC0945e activity = this.f101349a.f101348a.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a$r */
    static final class C43442r extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43420a f101352a;

        static {
            Covode.recordClassIndex(51671);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43442r(C43420a aVar) {
            super(2);
            this.f101352a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num) {
            C89219l.m154721d(iVar, "");
            this.f101352a.mo73971a(num, C43430i.f101338a);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a$f */
    public static final class DialogInterface$OnClickListenerC43427f implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C43420a f101329a;

        static {
            Covode.recordClassIndex(51656);
        }

        DialogInterface$OnClickListenerC43427f(C43420a aVar) {
            this.f101329a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String str;
            if (this.f101329a.mo73969a().f101255l != null) {
                if (this.f101329a.f101315c.f101141j == null) {
                    str = "quit_editing_address";
                } else {
                    str = "quit_checkout";
                }
                C43478j.m86535a(str, "stay");
            }
            C43476i iVar = this.f101329a.mo73969a().f101254k;
            if (iVar != null) {
                iVar.mo73993a("quit_editing", "stay");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a$q */
    static final class C43440q extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43420a f101350a;

        static {
            Covode.recordClassIndex(51669);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43440q(C43420a aVar) {
            super(2);
            this.f101350a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num) {
            Integer num2 = num;
            C89219l.m154721d(iVar, "");
            if (num2 != null && num2.intValue() == 3) {
                this.f101350a.mo73973c();
            } else {
                this.f101350a.mo73971a(num2, new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.address.edit.C43420a.C43440q.C434411 */

                    /* renamed from: a */
                    final /* synthetic */ C43440q f101351a;

                    static {
                        Covode.recordClassIndex(51670);
                    }

                    {
                        this.f101351a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        String str;
                        ActivityC0945e activity;
                        C43420a aVar = this.f101351a.f101350a;
                        if (this.f101351a.f101350a.f101315c.f101140i == 1) {
                            str = "next";
                        } else {
                            str = "return";
                        }
                        aVar.f101314b = str;
                        C89378p<String, Address> pVar = this.f101351a.f101350a.mo73969a().f101256m;
                        if (pVar != null) {
                            this.f101351a.f101350a.f101316d.invoke(pVar);
                        }
                        if (!this.f101351a.f101350a.f101315c.f101139h && (activity = this.f101351a.f101350a.getActivity()) != null) {
                            activity.finish();
                        }
                        return C89391z.f203057a;
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a$g */
    public static final class DialogInterface$OnClickListenerC43428g implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C43420a f101330a;

        static {
            Covode.recordClassIndex(51657);
        }

        DialogInterface$OnClickListenerC43428g(C43420a aVar) {
            this.f101330a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            String str;
            this.f101330a.f101314b = "return";
            if (this.f101330a.mo73969a().f101255l != null) {
                if (this.f101330a.f101315c.f101141j == null) {
                    str = "quit_editing_address";
                } else {
                    str = "quit_checkout";
                }
                C43478j.m86535a(str, "quit");
            }
            C43476i iVar = this.f101330a.mo73969a().f101254k;
            if (iVar != null) {
                iVar.mo73993a("quit_editing", "quit");
            }
            if (this.f101330a.f101317e == null || this.f101330a.f101315c.f101141j == null) {
                ActivityC0945e activity = this.f101330a.getActivity();
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
            }
            AbstractC89171a<C89391z> aVar = this.f101330a.f101317e;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a$m */
    static final class C43435m extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43420a f101345a;

        static {
            Covode.recordClassIndex(51664);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43435m(C43420a aVar) {
            super(2);
            this.f101345a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(iVar, "");
            int i = 8;
            if (booleanValue) {
                TuxButton tuxButton = (TuxButton) this.f101345a.mo73968a(R.id.dow);
                C89219l.m154716b(tuxButton, "");
                tuxButton.setVisibility(8);
                View a = this.f101345a.mo73968a(R.id.dox);
                C89219l.m154716b(a, "");
                a.setVisibility(8);
                EditText editText = (EditText) ((RecyclerView) this.f101345a.mo73968a(R.id.dgn)).findViewWithTag(5);
                if (editText != null) {
                    RecyclerView recyclerView = (RecyclerView) this.f101345a.mo73968a(R.id.ate);
                    C89219l.m154716b(recyclerView, "");
                    C43452b.C43456c.m86515a(recyclerView, editText);
                }
            }
            RecyclerView recyclerView2 = (RecyclerView) this.f101345a.mo73968a(R.id.ate);
            C89219l.m154716b(recyclerView2, "");
            if (booleanValue) {
                i = 0;
            }
            recyclerView2.setVisibility(i);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a$n */
    static final class C43436n extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43420a f101346a;

        static {
            Covode.recordClassIndex(51665);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43436n(C43420a aVar) {
            super(2);
            this.f101346a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num) {
            View g;
            int intValue = num.intValue();
            C89219l.m154721d(iVar, "");
            if (intValue >= 0) {
                RecyclerView recyclerView = (RecyclerView) this.f101346a.mo73968a(R.id.dgn);
                C89219l.m154716b(recyclerView, "");
                RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
                if (!(layoutManager == null || (g = layoutManager.mo4717g(intValue)) == null)) {
                    C89219l.m154716b(g, "");
                    ((NestedScrollView) this.f101346a.mo73968a(R.id.cre)).mo2945a(0, (int) g.getY(), false);
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.a$u */
    static final class C43447u extends AbstractC89220m implements AbstractC89183m<Boolean, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43420a f101360a;

        /* renamed from: b */
        final /* synthetic */ AddressPageStarter.AddressEditEnterParams f101361b;

        static {
            Covode.recordClassIndex(51676);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43447u(C43420a aVar, AddressPageStarter.AddressEditEnterParams addressEditEnterParams) {
            super(2);
            this.f101360a = aVar;
            this.f101361b = addressEditEnterParams;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Boolean bool, Integer num) {
            boolean booleanValue = bool.booleanValue();
            num.intValue();
            if (!booleanValue) {
                this.f101360a.mo73969a().mo73966a(false);
                TuxButton tuxButton = (TuxButton) this.f101360a.mo73968a(R.id.dow);
                C89219l.m154716b(tuxButton, "");
                tuxButton.setVisibility(0);
                View a = this.f101360a.mo73968a(R.id.dox);
                C89219l.m154716b(a, "");
                a.setVisibility(0);
                ((RecyclerView) this.f101360a.mo73968a(R.id.dgn)).clearFocus();
            } else {
                TuxButton tuxButton2 = (TuxButton) this.f101360a.mo73968a(R.id.dow);
                C89219l.m154716b(tuxButton2, "");
                tuxButton2.setVisibility(8);
                View a2 = this.f101360a.mo73968a(R.id.dox);
                C89219l.m154716b(a2, "");
                a2.setVisibility(8);
                C43420a aVar = this.f101360a;
                aVar.withState(aVar.mo73969a(), new AbstractC89172b<AddressEditState, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.address.edit.C43420a.C43447u.C434481 */

                    /* renamed from: a */
                    final /* synthetic */ C43447u f101362a;

                    static {
                        Covode.recordClassIndex(51677);
                    }

                    {
                        this.f101362a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(AddressEditState addressEditState) {
                        View g;
                        AddressEditState addressEditState2 = addressEditState;
                        C89219l.m154721d(addressEditState2, "");
                        if (addressEditState2.isAddressEditorFocus() && addressEditState2.getAutoScrollIndex() >= 0) {
                            RecyclerView recyclerView = (RecyclerView) this.f101362a.f101360a.mo73968a(R.id.dgn);
                            C89219l.m154716b(recyclerView, "");
                            RecyclerView.AbstractC1362i layoutManager = recyclerView.getLayoutManager();
                            if (!(layoutManager == null || (g = layoutManager.mo4717g(addressEditState2.getAutoScrollIndex())) == null)) {
                                C89219l.m154716b(g, "");
                                ((NestedScrollView) this.f101362a.f101360a.mo73968a(R.id.cre)).mo2945a(0, (int) g.getY(), false);
                            }
                        }
                        return C89391z.f203057a;
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo73971a(Integer num, AbstractC89171a<C89391z> aVar) {
        if (num != null) {
            if (num.intValue() == -1) {
                mo73973c();
                aVar.invoke();
            } else if (num.intValue() == 0) {
                m86496i().show();
            } else if (num.intValue() == 2) {
                mo73973c();
                new C79459a(getActivity()).mo123052a(getString(R.string.ftv)).mo123053a();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.nw, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38709a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20527q.C20528a.m38711a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20527q.C20528a.m38710a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20527q.C20528a.m38712a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20527q.C20528a.m38713a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
