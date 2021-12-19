package com.p2082ss.android.ugc.aweme.inbox;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33941a;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.common.C39109f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.friends.AbstractC51499g;
import com.p2082ss.android.ugc.aweme.friends.model.RecommendList;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.inbox.C56590x;
import com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63857u;
import com.p2082ss.android.ugc.aweme.profile.presenter.C63823ab;
import com.p2082ss.android.ugc.aweme.recommend.EnumC66622f;
import com.p2082ss.android.ugc.aweme.recommend.users.C66652b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.RecommendUserVM */
public final class RecommendUserVM extends AbstractC1174ac implements AbstractC51499g, AbstractC63857u {

    /* renamed from: k */
    public static final C56289a f128404k = new C56289a((byte) 0);

    /* renamed from: a */
    public final C33943c<Boolean> f128405a;

    /* renamed from: b */
    public final LiveData<Boolean> f128406b;

    /* renamed from: c */
    public final LiveData<InboxAdapterWidget.EnumC56518b> f128407c;

    /* renamed from: d */
    public final C33943c<List<AbstractC56310ad>> f128408d;

    /* renamed from: e */
    public final LiveData<List<AbstractC56310ad>> f128409e;

    /* renamed from: f */
    public final C33941a<Boolean> f128410f;

    /* renamed from: g */
    public boolean f128411g;

    /* renamed from: h */
    public final Set<String> f128412h;

    /* renamed from: i */
    public boolean f128413i;

    /* renamed from: j */
    public final boolean f128414j;

    /* renamed from: l */
    private final C33943c<InboxAdapterWidget.EnumC56518b> f128415l;

    /* renamed from: m */
    private List<C56593z> f128416m;

    /* renamed from: n */
    private List<? extends AbstractC56312af> f128417n;

    /* renamed from: o */
    private final AbstractC89244h f128418o;

    /* renamed from: p */
    private C56340d f128419p;

    /* renamed from: q */
    private C56516w f128420q;

    /* renamed from: r */
    private final AbstractC89244h f128421r;

    /* renamed from: s */
    private final AbstractC89244h f128422s;

    static {
        Covode.recordClassIndex(66106);
    }

    public RecommendUserVM() {
        this(false, 1, null);
    }

    /* renamed from: i */
    private final C56305aa m102279i() {
        return (C56305aa) this.f128421r.getValue();
    }

    /* renamed from: a */
    public final C63823ab mo93320a() {
        return (C63823ab) this.f128418o.getValue();
    }

    /* renamed from: b */
    public final Set<String> mo93323b() {
        return (Set) this.f128422s.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.RecommendUserVM$a */
    public static final class C56289a {
        static {
            Covode.recordClassIndex(66107);
        }

        private C56289a() {
        }

        public /* synthetic */ C56289a(byte b) {
            this();
        }

        /* renamed from: a */
        public static RecommendUserVM m102295a(Fragment fragment) {
            C89219l.m154721d(fragment, "");
            AbstractC1174ac a = C1181ae.m3879a(fragment, (C1175ad.AbstractC1177b) null).mo3983a(RecommendUserVM.class);
            C89219l.m154716b(a, "");
            return (RecommendUserVM) a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.RecommendUserVM$b */
    static final class C56290b extends AbstractC89220m implements AbstractC89171a<Set<String>> {

        /* renamed from: a */
        public static final C56290b f128423a = new C56290b();

        static {
            Covode.recordClassIndex(66108);
        }

        C56290b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Set<String> invoke() {
            return new LinkedHashSet();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.RecommendUserVM$g */
    static final class C56295g extends AbstractC89220m implements AbstractC89171a<C56305aa> {

        /* renamed from: a */
        public static final C56295g f128430a = new C56295g();

        static {
            Covode.recordClassIndex(66113);
        }

        C56295g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C56305aa invoke() {
            return new C56305aa();
        }
    }

    /* renamed from: k */
    private void m102281k() {
        this.f128415l.postValue(InboxAdapterWidget.EnumC56518b.LOADING);
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.RecommendUserVM$e */
    static final class C56293e extends AbstractC89220m implements AbstractC89171a<C63823ab> {

        /* renamed from: a */
        final /* synthetic */ RecommendUserVM f128426a;

        static {
            Covode.recordClassIndex(66111);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56293e(RecommendUserVM recommendUserVM) {
            super(0);
            this.f128426a = recommendUserVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C63823ab invoke() {
            return new C63823ab(new RecommendCommonUserModel(), this.f128426a);
        }
    }

    /* renamed from: c */
    public static int m102276c() {
        if (C51648a.f118980a.mo87322d().mo86984c()) {
            return 1;
        }
        return 2;
    }

    /* renamed from: f */
    public final void mo93326f() {
        this.f128408d.postValue(m102274a(this));
    }

    /* renamed from: g */
    public final void mo93327g() {
        this.f128408d.postValue(mo93321a(C56590x.EnumC56591a.SHOW));
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.RecommendUserVM$c */
    public static final class CallableC56291c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ RecommendUserVM f128424a;

        static {
            Covode.recordClassIndex(66109);
        }

        public CallableC56291c(RecommendUserVM recommendUserVM) {
            this.f128424a = recommendUserVM;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C63823ab a = this.f128424a.mo93320a();
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            a.mo103284a(g.getCurUserId(), RecommendUserVM.m102276c(), "0");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.RecommendUserVM$d */
    static final class CallableC56292d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ RecommendUserVM f128425a;

        static {
            Covode.recordClassIndex(66110);
        }

        CallableC56292d(RecommendUserVM recommendUserVM) {
            this.f128425a = recommendUserVM;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C63823ab a = this.f128425a.mo93320a();
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            a.mo103285a(g.getCurUserId(), RecommendUserVM.m102276c(), "0", true);
            return C89391z.f203057a;
        }
    }

    /* renamed from: h */
    private final C56340d m102278h() {
        EnumC56508r decideDisplay$default = EnumC56501q.decideDisplay$default(EnumC56501q.CONTACTS, null, 1, null);
        if (decideDisplay$default == null || !(!this.f128414j) || decideDisplay$default != EnumC56508r.BOTTOM) {
            return null;
        }
        return new C56340d();
    }

    /* renamed from: j */
    private final List<AbstractC56310ad> m102280j() {
        ArrayList arrayList = new ArrayList();
        C56340d dVar = this.f128419p;
        if (dVar != null) {
            arrayList.add(dVar);
        }
        C56516w wVar = this.f128420q;
        if (wVar != null) {
            arrayList.add(wVar);
        }
        return arrayList;
    }

    /* renamed from: d */
    public final boolean mo93324d() {
        Boolean value = this.f128410f.getValue();
        if (value != null) {
            return value.booleanValue();
        }
        return false;
    }

    /* renamed from: e */
    public final void mo93325e() {
        m102281k();
        mo93320a().mo103288e();
        C1731i.m5640b(new CallableC56292d(this), C1731i.f5562a);
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        mo93320a().mo62188b();
        C51648a.f118980a.mo87315b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.RecommendUserVM$f */
    public static final class RunnableC56294f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RecommendUserVM f128427a;

        /* renamed from: b */
        final /* synthetic */ User f128428b;

        /* renamed from: c */
        final /* synthetic */ Map f128429c;

        static {
            Covode.recordClassIndex(66112);
        }

        public RunnableC56294f(RecommendUserVM recommendUserVM, User user, Map map) {
            this.f128427a = recommendUserVM;
            this.f128428b = user;
            this.f128429c = map;
        }

        public final void run() {
            String str;
            C33744d a = new C33744d().mo59983a("enter_from", "notification_page").mo59983a("rec_type", this.f128428b.getRecType()).mo59983a("rec_uid", this.f128428b.getUid());
            RecommendUserVM recommendUserVM = this.f128427a;
            String uid = this.f128428b.getUid();
            String str2 = "";
            C89219l.m154716b(uid, str2);
            C39162r.m79460a("show_recommend_user_cell", a.mo59980a("impr_order", recommendUserVM.mo93319a(uid)).mo59983a("req_id", this.f128428b.getRequestId()).mo59983a("button_type", NoticeServiceImpl.m112566f().mo99372a(this.f128428b)).mo59983a("relation_type", this.f128428b.getFriendTypeStr()).f79943a);
            C59256u a2 = new C59256u().mo96834a("notification_page");
            a2.f135350a = C59256u.EnumC59259c.CARD;
            a2.f135352b = C59256u.EnumC59257a.SHOW;
            C59256u s = a2.mo96832a(this.f128428b).mo96841s(this.f128428b.getRequestId());
            Map map = this.f128429c;
            if (!(map == null || (str = (String) map.get("position")) == null)) {
                str2 = str;
            }
            s.mo96838p(str2).mo96792f();
        }
    }

    /* renamed from: a */
    public final int mo93319a(String str) {
        C89219l.m154721d(str, "");
        return mo93320a().mo103279a(str);
    }

    /* renamed from: a */
    private final void m102275a(InboxAdapterWidget.EnumC56518b bVar) {
        List<AbstractC56310ad> value;
        if ((bVar == InboxAdapterWidget.EnumC56518b.FAIL || bVar == InboxAdapterWidget.EnumC56518b.EMPTY) && (value = this.f128409e.getValue()) != null && !value.isEmpty()) {
            this.f128415l.setValue(InboxAdapterWidget.EnumC56518b.SUCCESS);
        } else {
            this.f128415l.setValue(bVar);
        }
    }

    /* renamed from: a */
    private static /* synthetic */ List m102274a(RecommendUserVM recommendUserVM) {
        C56590x.EnumC56591a aVar = C56590x.EnumC56591a.HIDE;
        List<? extends AbstractC56312af> list = recommendUserVM.f128417n;
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f128464a);
        }
        C56309ac acVar = new C56309ac(arrayList, recommendUserVM.f128417n.size());
        List<AbstractC56310ad> j = recommendUserVM.m102280j();
        j.addAll(recommendUserVM.f128416m);
        j.add(acVar);
        if (!(!j.isEmpty())) {
            return new ArrayList();
        }
        j.add(0, recommendUserVM.m102279i());
        j.add(new C56590x(aVar));
        return j;
    }

    /* renamed from: c */
    private static C89378p<List<C56593z>, List<AbstractC56312af>> m102277c(RecommendList recommendList) {
        List list;
        List list2;
        List<User> inviterList = recommendList.getInviterList();
        if (inviterList != null) {
            list = new ArrayList();
            for (T t : inviterList) {
                if (t != null) {
                    String rid = recommendList.getRid();
                    C89219l.m154716b(rid, "");
                    list.add(new C56593z(t, rid));
                }
            }
        } else {
            list = C89086z.INSTANCE;
        }
        List<User> userList = recommendList.getUserList();
        if (userList != null) {
            list2 = new ArrayList();
            for (T t2 : userList) {
                if (t2 != null) {
                    String rid2 = recommendList.getRid();
                    C89219l.m154716b(rid2, "");
                    list2.add(new C56311ae(t2, rid2));
                }
            }
        } else {
            list2 = C89086z.INSTANCE;
        }
        return new C89378p<>(list, list2);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63857u
    /* renamed from: b */
    public final void mo81332b(RecommendList recommendList) {
        if (recommendList != null) {
            this.f128411g = recommendList.hasMore();
            C89378p<List<C56593z>, List<AbstractC56312af>> c = m102277c(recommendList);
            List<C56593z> component1 = c.component1();
            List<AbstractC56312af> component2 = c.component2();
            if (!component1.isEmpty() || !component2.isEmpty()) {
                this.f128416m = component1;
                this.f128417n = component2;
                this.f128408d.setValue(mo93321a(C56590x.EnumC56591a.SHOW));
                return;
            }
            this.f128408d.setValue(mo93321a(C56590x.EnumC56591a.HIDE));
            return;
        }
        this.f128408d.setValue(mo93321a(C56590x.EnumC56591a.HIDE));
    }

    public RecommendUserVM(boolean z) {
        this.f128414j = z;
        C33943c<Boolean> cVar = new C33943c<>();
        this.f128405a = cVar;
        this.f128406b = cVar;
        C33943c<InboxAdapterWidget.EnumC56518b> cVar2 = new C33943c<>();
        this.f128415l = cVar2;
        this.f128407c = cVar2;
        C33943c<List<AbstractC56310ad>> cVar3 = new C33943c<>();
        this.f128408d = cVar3;
        this.f128409e = cVar3;
        this.f128410f = new C33941a<>();
        this.f128416m = C89086z.INSTANCE;
        this.f128417n = C89086z.INSTANCE;
        this.f128418o = C89250i.m154773a((AbstractC89171a) new C56293e(this));
        this.f128412h = new LinkedHashSet();
        this.f128419p = m102278h();
        C56516w wVar = null;
        EnumC56508r decideDisplay$default = EnumC56501q.decideDisplay$default(EnumC56501q.THIRD_PLATFORM, null, 1, null);
        if (decideDisplay$default != null && (!z) && decideDisplay$default == EnumC56508r.BOTTOM) {
            wVar = new C56516w();
        }
        this.f128420q = wVar;
        this.f128421r = C89250i.m154773a((AbstractC89171a) C56295g.f128430a);
        this.f128422s = C89250i.m154773a((AbstractC89171a) C56290b.f128423a);
        List<AbstractC56310ad> j = m102280j();
        if (!j.isEmpty()) {
            j.add(0, m102279i());
        }
        cVar3.postValue(j);
        C51648a.f118980a.mo87307a(this);
    }

    /* renamed from: a */
    public final List<AbstractC56310ad> mo93321a(C56590x.EnumC56591a aVar) {
        List<AbstractC56310ad> j = m102280j();
        j.addAll(this.f128416m);
        j.addAll(this.f128417n);
        if (!(!j.isEmpty())) {
            return new ArrayList();
        }
        j.add(0, m102279i());
        j.add(new C56590x(aVar));
        return j;
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63857u
    /* renamed from: a */
    public final void mo81328a(RecommendList recommendList) {
        if (recommendList != null) {
            this.f128411g = recommendList.hasMore();
            C89378p<List<C56593z>, List<AbstractC56312af>> c = m102277c(recommendList);
            List<C56593z> component1 = c.component1();
            List<AbstractC56312af> component2 = c.component2();
            if (!component1.isEmpty() || !component2.isEmpty()) {
                this.f128416m = component1;
                this.f128417n = component2;
                if (mo93324d()) {
                    mo93327g();
                } else {
                    mo93326f();
                }
                m102275a(InboxAdapterWidget.EnumC56518b.SUCCESS);
            } else {
                m102275a(InboxAdapterWidget.EnumC56518b.EMPTY);
                return;
            }
        } else {
            m102275a(InboxAdapterWidget.EnumC56518b.EMPTY);
        }
        this.f128412h.clear();
    }

    /* renamed from: a */
    public final void mo93322a(AbstractC56310ad adVar) {
        String str;
        C89219l.m154721d(adVar, "");
        List<AbstractC56310ad> value = this.f128409e.getValue();
        if (value != null) {
            List<AbstractC56310ad> g = C89070n.m154585g((Collection) value);
            int indexOf = g.indexOf(adVar);
            int size = g.size();
            if (indexOf >= 0 && size > indexOf) {
                AbstractC56310ad remove = g.remove(indexOf);
                if (remove instanceof C56340d) {
                    this.f128419p = null;
                    EnumC56508r rVar = EnumC56508r.BOTTOM;
                    C89219l.m154721d(rVar, "");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("enter_from", "notification_page");
                    linkedHashMap.put("platform", "contact");
                    linkedHashMap.put("enter_method", "long_press");
                    if (rVar == EnumC56508r.TOP) {
                        str = "top";
                    } else {
                        str = "bottom";
                    }
                    linkedHashMap.put("position", str);
                    C39162r.m79460a("authorize_card_close", linkedHashMap);
                } else if (remove instanceof C56516w) {
                    this.f128420q = null;
                } else if (remove instanceof AbstractC56312af) {
                    User user = ((AbstractC56312af) remove).f128464a;
                    C66652b bVar = C66652b.f149825a;
                    String uid = user.getUid();
                    C89219l.m154716b(uid, "");
                    bVar.mo105655a(uid, user.getSecUid());
                }
                if (g.size() == 1) {
                    g.clear();
                }
                this.f128408d.setValue(g);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.AbstractC51499g
    /* renamed from: a */
    public final void mo86981a(EnumC66622f fVar) {
        C89219l.m154721d(fVar, "");
        if (fVar != EnumC66622f.CONTACT) {
            return;
        }
        if (C51648a.f118980a.mo87322d().mo86984c()) {
            if (this.f128419p != null) {
                ArrayList arrayList = null;
                this.f128419p = null;
                List<AbstractC56310ad> value = this.f128409e.getValue();
                if (value != null) {
                    arrayList = new ArrayList();
                    for (T t : value) {
                        if (!(t instanceof C56340d)) {
                            arrayList.add(t);
                        }
                    }
                }
                this.f128408d.postValue(arrayList);
            }
        } else if (this.f128419p == null) {
            C56340d h = m102278h();
            this.f128419p = h;
            if (h != null) {
                if (mo93324d()) {
                    mo93327g();
                } else {
                    mo93326f();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.presenter.AbstractC63857u
    /* renamed from: a */
    public final void mo81329a(Exception exc) {
        C39109f.m79401a("RecommendUserVM", "request recommend user failed!", exc);
        m102275a(InboxAdapterWidget.EnumC56518b.FAIL);
        if (this.f128411g) {
            this.f128408d.setValue(mo93321a(C56590x.EnumC56591a.ERROR));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecommendUserVM(boolean z, int i, C89214g gVar) {
        this((i & 1) != 0 ? false : z);
    }
}
