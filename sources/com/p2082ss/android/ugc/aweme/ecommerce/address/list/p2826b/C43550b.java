package com.p2082ss.android.ugc.aweme.ecommerce.address.list.p2826b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.ecommerce.address.AddressPageStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.p2082ss.android.ugc.aweme.ecommerce.address.list.AddressAdapter;
import com.p2082ss.android.ugc.aweme.ecommerce.address.list.AddressListActivity;
import com.p2082ss.android.ugc.aweme.ecommerce.address.list.AddressListState;
import com.p2082ss.android.ugc.aweme.ecommerce.address.list.AddressListViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.address.list.C43544a;
import com.p2082ss.android.ugc.aweme.ecommerce.address.list.C43548b;
import com.p2082ss.android.ugc.aweme.ecommerce.address.list.C43571c;
import com.p2082ss.android.ugc.aweme.ecommerce.address.list.p2825a.C43547c;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.C44457d;
import com.p2082ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C44998a;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45264j;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45575o;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.b.b */
public final class C43550b extends AbstractC43570i implements AbstractC20527q {

    /* renamed from: a */
    public final AddressListActivity f101553a;

    /* renamed from: b */
    public final AddressListViewModel f101554b;

    /* renamed from: d */
    private final AbstractC89244h f101555d = C89250i.m154773a((AbstractC89171a) new C43551a(this));

    static {
        Covode.recordClassIndex(51790);
    }

    /* renamed from: d */
    public final AddressAdapter mo74037d() {
        return (AddressAdapter) this.f101555d.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
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

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.address.list.p2826b.AbstractC43570i
    /* renamed from: c */
    public final void mo74036c() {
        C43544a.f101548a = new LinkedHashMap();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.b.b$a */
    static final class C43551a extends AbstractC89220m implements AbstractC89171a<AddressAdapter> {

        /* renamed from: a */
        final /* synthetic */ C43550b f101556a;

        static {
            Covode.recordClassIndex(51791);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43551a(C43550b bVar) {
            super(0);
            this.f101556a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AddressAdapter invoke() {
            AddressAdapter addressAdapter = new AddressAdapter(this.f101556a.f101553a);
            addressAdapter.mo67829d(false);
            return addressAdapter;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.b.b$d */
    static final class C43554d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43550b f101565a;

        static {
            Covode.recordClassIndex(51794);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43554d(C43550b bVar) {
            super(0);
            this.f101565a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f101565a.f101554b.mo74029a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.b.b$e */
    static final class C43555e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43550b f101566a;

        static {
            Covode.recordClassIndex(51795);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43555e(C43550b bVar) {
            super(0);
            this.f101566a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f101566a.f101554b.mo74033b();
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.address.list.p2826b.AbstractC43570i
    /* renamed from: b */
    public final void mo74035b() {
        if (!ActivityStack.isAppBackGround()) {
            new C43547c().mo76747d();
        }
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public final AbstractC1196i getLifecycle() {
        AbstractC1196i lifecycle = this.f101553a.getLifecycle();
        C89219l.m154716b(lifecycle, "");
        return lifecycle;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.address.list.p2826b.AbstractC43570i
    /* renamed from: a */
    public final void mo74034a() {
        boolean z;
        String str;
        Object obj;
        MethodCollector.m26663i(9859);
        this.f101553a.setContentView(R.layout.o0);
        AddressListViewModel addressListViewModel = this.f101554b;
        AddressPageStarter.AddressListEnterParams a = AddressPageStarter.AddressListEnterParams.C43336a.m86453a(this.f101553a.getIntent());
        if (a != null) {
            z = a.f101143a;
        } else {
            z = false;
        }
        addressListViewModel.f101538b.mo143655a(AddressListViewModel.f101537a[0], Boolean.valueOf(z));
        if (!(a == null || (str = a.f101144b) == null)) {
            try {
                obj = C45264j.m87844a().mo46670a(str, HashMap.class);
            } catch (Exception unused) {
                obj = null;
            }
            addressListViewModel.f101539c = (HashMap) obj;
        }
        EventCenter.m87158a().mo75480a("ec_address_change", addressListViewModel);
        AddressListViewModel addressListViewModel2 = this.f101554b;
        C89219l.m154721d(addressListViewModel2, "");
        Map<String, Object> map = C43544a.f101548a;
        map.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        map.put("page_name", "shipping_info");
        HashMap<String, Object> hashMap = addressListViewModel2.f101539c;
        if (hashMap != null) {
            map.putAll(hashMap);
        }
        C45575o.m88124a(this.f101553a.getWindow());
        RecyclerView recyclerView = (RecyclerView) this.f101553a._$_findCachedViewById(R.id.dgn);
        C89219l.m154716b(recyclerView, "");
        recyclerView.setAdapter(mo74037d());
        RecyclerView recyclerView2 = (RecyclerView) this.f101553a._$_findCachedViewById(R.id.dgn);
        C89219l.m154716b(recyclerView2, "");
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        ((RecyclerView) this.f101553a._$_findCachedViewById(R.id.dgn)).mo4402a(new C44998a(C0643b.m2378c(this.f101553a, R.color.b6), 0, C13628n.m24520b(this.f101553a, 16.0f), 2));
        ((NormalTitleBar) this.f101553a._$_findCachedViewById(R.id.eim)).setOnTitleBarClickListener(new C43563l(this));
        ((DmtStatusView) this.f101553a._$_findCachedViewById(R.id.e77)).setBuilder(new DmtStatusView.C17269a(this.f101553a).mo27403a(this.f101553a.getLayoutInflater().inflate(R.layout.o1, (ViewGroup) null)).mo27400a(2131232924, R.string.bfu, R.string.bft, R.string.bfs, new View$OnClickListenerC43553c(this)).mo27409d(m86600a(this.f101553a, R.string.bfr, R.string.bfq, R.drawable.zb, R.string.bfs, new C43554d(this))).mo27410e(m86600a(this.f101553a, R.string.ftu, R.string.fts, R.drawable.yq, R.string.ftg, new C43555e(this))));
        AbstractC88412b unused2 = selectSubscribe(this.f101554b, C43564c.f101576a, new C20370ah(), new C43558h(this));
        AbstractC88412b unused3 = selectSubscribe(this.f101554b, C43566e.f101578a, new C20370ah(), new C43559i(this));
        AbstractC88412b unused4 = selectSubscribe(this.f101554b, C43567f.f101579a, new C20370ah(), new C43560j(this));
        AbstractC88412b unused5 = selectSubscribe(this.f101554b, C43568g.f101580a, new C20370ah(), new C43562k(this));
        AbstractC88412b unused6 = selectSubscribe(this.f101554b, C43569h.f101581a, new C20370ah(), new C43556f(this));
        AbstractC88412b unused7 = selectSubscribe(this.f101554b, C43565d.f101577a, new C20370ah(), new C43557g(this));
        this.f101554b.mo74029a();
        MethodCollector.m26664o(9859);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.b.b$b */
    public static final class C43552b extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f101557a = 700;

        /* renamed from: b */
        final /* synthetic */ int f101558b;

        /* renamed from: c */
        final /* synthetic */ Context f101559c;

        /* renamed from: d */
        final /* synthetic */ int f101560d;

        /* renamed from: e */
        final /* synthetic */ int f101561e;

        /* renamed from: f */
        final /* synthetic */ int f101562f;

        /* renamed from: g */
        final /* synthetic */ AbstractC89171a f101563g;

        static {
            Covode.recordClassIndex(51792);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                this.f101563g.invoke();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43552b(int i, Context context, int i2, int i3, int i4, AbstractC89171a aVar) {
            super(700);
            this.f101558b = i;
            this.f101559c = context;
            this.f101560d = i2;
            this.f101561e = i3;
            this.f101562f = i4;
            this.f101563g = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.b.b$l */
    public static final class C43563l implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ C43550b f101575a;

        static {
            Covode.recordClassIndex(51803);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C43563l(C43550b bVar) {
            this.f101575a = bVar;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            this.f101575a.f101553a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.b.b$c */
    static final class View$OnClickListenerC43553c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C43550b f101564a;

        static {
            Covode.recordClassIndex(51793);
        }

        View$OnClickListenerC43553c(C43550b bVar) {
            this.f101564a = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f101564a.f101554b.mo74029a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.b.b$j */
    static final class C43560j extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C43548b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43550b f101571a;

        static {
            Covode.recordClassIndex(51800);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43560j(C43550b bVar) {
            super(2);
            this.f101571a = bVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.b.b$j$a */
        static final class C43561a extends AbstractC89220m implements AbstractC89172b<AddressListState, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C43560j f101572a;

            /* renamed from: b */
            final /* synthetic */ AbstractC20477i f101573b;

            static {
                Covode.recordClassIndex(51801);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43561a(C43560j jVar, AbstractC20477i iVar) {
                super(1);
                this.f101572a = jVar;
                this.f101573b = iVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(AddressListState addressListState) {
                AddressListState addressListState2 = addressListState;
                C89219l.m154721d(addressListState2, "");
                if (addressListState2.getAddressList().size() >= 20) {
                    new C79459a(this.f101572a.f101571a.f101553a).mo123052a(this.f101572a.f101571a.f101553a.getString(R.string.ftf)).mo123053a();
                } else {
                    AddressPageStarter.m86450a(this.f101572a.f101571a.f101553a, null, null, "shipping_info", true, C80342dg.m139300a().mo46674b(this.f101572a.f101571a.f101554b.f101539c), null, 4038);
                }
                return C89391z.f203057a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C43548b bVar) {
            AbstractC20477i iVar2 = iVar;
            C89219l.m154721d(iVar2, "");
            if (bVar != null) {
                C43544a.m86594a("add_address");
                iVar2.withState(this.f101571a.f101554b, new C43561a(this, iVar2));
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.b.b$h */
    static final class C43558h extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43550b f101569a;

        static {
            Covode.recordClassIndex(51798);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43558h(C43550b bVar) {
            super(2);
            this.f101569a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Integer num) {
            int intValue = num.intValue();
            C89219l.m154721d(iVar, "");
            ((DmtStatusView) this.f101569a.f101553a._$_findCachedViewById(R.id.e77)).setStatus(intValue);
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43550b(AddressListActivity addressListActivity, AddressListViewModel addressListViewModel) {
        super(addressListActivity);
        C89219l.m154721d(addressListActivity, "");
        C89219l.m154721d(addressListViewModel, "");
        this.f101553a = addressListActivity;
        this.f101554b = addressListViewModel;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.b.b$f */
    static final class C43556f extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C43548b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43550b f101567a;

        static {
            Covode.recordClassIndex(51796);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43556f(C43550b bVar) {
            super(2);
            this.f101567a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C43548b bVar) {
            Address address;
            C43548b bVar2 = bVar;
            C89219l.m154721d(iVar, "");
            if (!(bVar2 == null || (address = bVar2.f101551a) == null)) {
                EventCenter.m87158a().mo75479a("ec_address_select", new AddressPageStarter.C43338a(address.f101187a, 3).mo73855a());
                this.f101567a.f101553a.finish();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.b.b$g */
    static final class C43557g extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C43571c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43550b f101568a;

        static {
            Covode.recordClassIndex(51797);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43557g(C43550b bVar) {
            super(2);
            this.f101568a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C43571c cVar) {
            C89219l.m154721d(iVar, "");
            if (cVar != null) {
                new C79459a(this.f101568a.f101553a).mo123052a(this.f101568a.f101553a.getString(R.string.ftb)).mo123053a();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.b.b$i */
    static final class C43559i extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends C44457d>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43550b f101570a;

        static {
            Covode.recordClassIndex(51799);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43559i(C43550b bVar) {
            super(2);
            this.f101570a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends C44457d> list) {
            List<? extends C44457d> list2 = list;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(list2, "");
            AddressAdapter d = this.f101570a.mo74037d();
            List c = C89070n.m154524c(new AddressAdapter.C43521a());
            c.addAll(list2);
            d.mo60931a(c);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.list.b.b$k */
    static final class C43562k extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, C43548b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43550b f101574a;

        static {
            Covode.recordClassIndex(51802);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43562k(C43550b bVar) {
            super(2);
            this.f101574a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, C43548b bVar) {
            Address address;
            C43548b bVar2 = bVar;
            C89219l.m154721d(iVar, "");
            if (!(bVar2 == null || (address = bVar2.f101551a) == null)) {
                C43544a.m86594a("edit");
                AddressPageStarter.m86450a(this.f101574a.f101553a, address, null, "shipping_info", true, C80342dg.m139300a().mo46674b(this.f101574a.f101554b.f101539c), null, 4036);
            }
            return C89391z.f203057a;
        }
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

    /* renamed from: a */
    private final View m86600a(Context context, int i, int i2, int i3, int i4, AbstractC89171a<C89391z> aVar) {
        View a = C1764a.m5927a(LayoutInflater.from(context), R.layout.pj, (ViewGroup) this.f101553a._$_findCachedViewById(R.id.acf), false);
        ((AppCompatImageView) a.findViewById(R.id.bky)).setImageResource(i3);
        TuxTextView tuxTextView = (TuxTextView) a.findViewById(R.id.text);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(context.getText(i));
        TuxTextView tuxTextView2 = (TuxTextView) a.findViewById(R.id.efr);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(context.getText(i2));
        TuxButton tuxButton = (TuxButton) a.findViewById(R.id.djd);
        C89219l.m154716b(tuxButton, "");
        tuxButton.setText(context.getText(i4));
        TuxButton tuxButton2 = (TuxButton) a.findViewById(R.id.djd);
        C89219l.m154716b(tuxButton2, "");
        tuxButton2.setOnClickListener(new C43552b(i3, context, i, i2, i4, aVar));
        C89219l.m154716b(a, "");
        return a;
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
