package com.p2082ss.android.ugc.aweme.inbox.widget.multi;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.android.livesdkapi.p700m.C11828a;
import com.bytedance.android.widget.C12249d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.friends.AbstractC51499g;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.inbox.EnumC56501q;
import com.p2082ss.android.ugc.aweme.inbox.EnumC56508r;
import com.p2082ss.android.ugc.aweme.inbox.api.MultiApiManager;
import com.p2082ss.android.ugc.aweme.inbox.p3267b.C56323c;
import com.p2082ss.android.ugc.aweme.inbox.p3271f.C56408a;
import com.p2082ss.android.ugc.aweme.inbox.widget.InboxAdapterWidget;
import com.p2082ss.android.ugc.aweme.notice.api.C61530a;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61632g;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.FollowPageResponse;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineResponse;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import com.p2082ss.android.ugc.aweme.notification.redpoint.C62221f;
import com.p2082ss.android.ugc.aweme.notification.utils.C62259e;
import com.p2082ss.android.ugc.aweme.recommend.EnumC66622f;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88790v;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89376n;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel */
public final class MultiViewModel extends AbstractC1174ac implements AbstractC51499g {

    /* renamed from: q */
    public static final int f128880q = C61530a.C61532b.m111445a();

    /* renamed from: r */
    public static final C56526a f128881r = new C56526a((byte) 0);

    /* renamed from: a */
    final C1213t<List<AbstractC56585k>> f128882a;

    /* renamed from: b */
    public final LiveData<List<AbstractC56585k>> f128883b;

    /* renamed from: c */
    final C1213t<InboxAdapterWidget.EnumC56518b> f128884c;

    /* renamed from: d */
    public final LiveData<InboxAdapterWidget.EnumC56518b> f128885d;

    /* renamed from: e */
    public final C12249d<Boolean> f128886e;

    /* renamed from: f */
    public final LiveData<Boolean> f128887f;

    /* renamed from: g */
    final C56408a f128888g;

    /* renamed from: h */
    C56564d f128889h;

    /* renamed from: i */
    C56562b f128890i;

    /* renamed from: j */
    C56562b f128891j;

    /* renamed from: k */
    public boolean f128892k;

    /* renamed from: l */
    public boolean f128893l;

    /* renamed from: m */
    C89378p<Integer, Boolean> f128894m;

    /* renamed from: n */
    public NoticeCombineResponse f128895n;

    /* renamed from: o */
    public NoticeListsResponse f128896o;

    /* renamed from: p */
    public FollowPageResponse f128897p;

    /* renamed from: s */
    private final C88411a f128898s = new C88411a();

    /* renamed from: t */
    private final AbstractC89244h f128899t = C89250i.m154773a((AbstractC89171a) C56527b.f128904a);

    /* renamed from: u */
    private final C56562b f128900u;

    /* renamed from: v */
    private final C56562b f128901v;

    /* renamed from: w */
    private C56563c f128902w;

    /* renamed from: x */
    private C56582i f128903x;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel$d */
    public static final class C56529d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C56529d f128906a = new C56529d();

        static {
            Covode.recordClassIndex(66352);
        }

        C56529d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: e */
    private final String m102494e() {
        return (String) this.f128899t.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel$a */
    public static final class C56526a {
        static {
            Covode.recordClassIndex(66349);
        }

        private C56526a() {
        }

        public /* synthetic */ C56526a(byte b) {
            this();
        }

        /* renamed from: a */
        public static MultiViewModel m102502a(Fragment fragment) {
            C89219l.m154721d(fragment, "");
            AbstractC1174ac a = C1181ae.m3879a(fragment, (C1175ad.AbstractC1177b) null).mo3983a(MultiViewModel.class);
            C89219l.m154716b(a, "");
            return (MultiViewModel) a;
        }
    }

    /* renamed from: g */
    private void m102496g() {
        this.f128884c.postValue(InboxAdapterWidget.EnumC56518b.LOADING);
    }

    /* renamed from: c */
    public final boolean mo93473c() {
        if (this.f128889h != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel$f */
    public static final class RunnableC56531f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89238e f128908a;

        /* renamed from: b */
        final /* synthetic */ Map f128909b;

        static {
            Covode.recordClassIndex(66354);
        }

        RunnableC56531f(C89233z.C89238e eVar, Map map) {
            this.f128908a = eVar;
            this.f128909b = map;
        }

        public final void run() {
            C39162r.m79460a(this.f128908a.element, this.f128909b);
        }
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        this.f128898s.dispose();
        C51648a.f118980a.mo87315b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel$b */
    static final class C56527b extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C56527b f128904a = new C56527b();

        static {
            Covode.recordClassIndex(66350);
        }

        C56527b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            return C80342dg.m139300a().mo46674b(C89070n.m154516a(new C61632g(MultiViewModel.f128880q, 0, 0, 0, 0, 14, null)));
        }
    }

    static {
        Covode.recordClassIndex(66348);
    }

    /* renamed from: d */
    static C89378p<Integer, Boolean> m102493d() {
        boolean z;
        int[] e = C89070n.m154578e((Collection<Integer>) C62221f.m112525b());
        int a = C61542b.m111458a(Arrays.copyOf(e, e.length));
        int[] e2 = C89070n.m154578e((Collection<Integer>) C62221f.m112519a());
        int a2 = C61542b.m111458a(Arrays.copyOf(e2, e2.length));
        Integer valueOf = Integer.valueOf(a);
        if (a2 > 0) {
            z = true;
        } else {
            z = false;
        }
        return C89387v.m154943a(valueOf, Boolean.valueOf(z));
    }

    /* renamed from: f */
    private static C56563c m102495f() {
        int i = 1;
        EnumC56508r decideDisplay$default = EnumC56501q.decideDisplay$default(EnumC56501q.CONTACTS, null, 1, null);
        if (decideDisplay$default != EnumC56508r.TOP || decideDisplay$default == null) {
            return null;
        }
        if (!C56323c.m102316c()) {
            if (C56323c.m102317d()) {
                i = 2;
            } else {
                i = -1;
            }
        }
        return new C56563c(i);
    }

    public MultiViewModel() {
        C1213t<List<AbstractC56585k>> tVar = new C1213t<>();
        this.f128882a = tVar;
        this.f128883b = tVar;
        C1213t<InboxAdapterWidget.EnumC56518b> tVar2 = new C1213t<>();
        this.f128884c = tVar2;
        this.f128885d = tVar2;
        C12249d<Boolean> dVar = new C12249d<>();
        this.f128886e = dVar;
        this.f128887f = dVar;
        C56408a aVar = new C56408a();
        this.f128888g = aVar;
        C56562b b = aVar.mo93395b();
        this.f128900u = b;
        C56562b c = aVar.mo93396c();
        this.f128901v = c;
        this.f128902w = m102495f();
        C56582i iVar = null;
        EnumC56508r decideDisplay$default = EnumC56501q.decideDisplay$default(EnumC56501q.THIRD_PLATFORM, null, 1, null);
        if (decideDisplay$default == EnumC56508r.TOP && decideDisplay$default != null) {
            iVar = new C56582i();
        }
        this.f128903x = iVar;
        this.f128890i = b;
        this.f128891j = c;
        this.f128894m = m102493d();
        tVar.postValue(mo93470a());
        C51648a.f118980a.mo87307a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List<AbstractC56585k> mo93470a() {
        ArrayList arrayList = new ArrayList();
        C56564d dVar = this.f128889h;
        if (dVar != null) {
            arrayList.add(dVar);
        }
        C56563c cVar = this.f128902w;
        if (cVar != null) {
            arrayList.add(cVar);
        }
        C56582i iVar = this.f128903x;
        if (iVar != null) {
            arrayList.add(iVar);
        }
        C56562b bVar = this.f128891j;
        if (bVar != null) {
            arrayList.add(bVar);
        }
        arrayList.add(this.f128890i);
        return arrayList;
    }

    /* renamed from: b */
    public final void mo93472b() {
        m102496g();
        boolean i = C56323c.m102322i();
        AbstractC88979t<NoticeCombineResponse> b = MultiApiManager.m102308a().fetchCombineNotice(5, "tiktok_message", 0, 3, 81, i ? 1 : 0, C11828a.m20830a(C17867d.m33078a())).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143282b(C88925a.m154171a(C88790v.f201616a));
        MultiApiManager.API a = MultiApiManager.m102308a();
        String e = m102494e();
        C89219l.m154716b(e, "");
        AbstractC88979t a2 = AbstractC88979t.m154295a(b, a.fetchGroupNotice(e).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143282b(C88925a.m154171a(C88790v.f201616a)));
        if (C56323c.m102321h()) {
            a2 = a2.mo143269a(MultiApiManager.m102308a().fetchFollowPageData(C56323c.m102322i(), 0, 20, 0, 0, 0).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143282b(C88925a.m154171a(C88790v.f201616a)));
        }
        this.f128895n = null;
        this.f128896o = null;
        this.f128897p = null;
        this.f128898s.mo142945a(a2.mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143255a(new C56528c(this), C56529d.f128906a, new C56530e(this)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel$e */
    public static final class C56530e implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ MultiViewModel f128907a;

        static {
            Covode.recordClassIndex(66353);
        }

        C56530e(MultiViewModel multiViewModel) {
            this.f128907a = multiViewModel;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:48:0x011f, code lost:
            if (r7 != null) goto L_0x00da;
         */
        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo8579a() {
            /*
            // Method dump skipped, instructions count: 296
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel.C56530e.mo8579a():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel$c */
    public static final class C56528c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ MultiViewModel f128905a;

        static {
            Covode.recordClassIndex(66351);
        }

        C56528c(MultiViewModel multiViewModel) {
            this.f128905a = multiViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            BaseResponse baseResponse = (BaseResponse) obj;
            MultiViewModel multiViewModel = this.f128905a;
            if (baseResponse instanceof NoticeCombineResponse) {
                multiViewModel.f128895n = (NoticeCombineResponse) baseResponse;
            } else if (baseResponse instanceof NoticeListsResponse) {
                multiViewModel.f128896o = (NoticeListsResponse) baseResponse;
            } else if (baseResponse instanceof FollowPageResponse) {
                multiViewModel.f128897p = (FollowPageResponse) baseResponse;
            }
        }
    }

    /* renamed from: a */
    private static C89378p<String, String> m102490a(C56588n nVar) {
        String str;
        int i = C56587m.f129019a[nVar.f129020a.ordinal()];
        String str2 = "0";
        if (i == 1) {
            str2 = String.valueOf(nVar.f129021b);
            str = "number_dot";
        } else if (i == 2) {
            str = "yellow_dot";
        } else if (i == 3) {
            str = null;
        } else {
            throw new C89376n();
        }
        return C89387v.m154943a(str2, str);
    }

    /* renamed from: a */
    public final void mo93471a(AbstractC56585k kVar) {
        C89219l.m154721d(kVar, "");
        List<AbstractC56585k> value = this.f128883b.getValue();
        if (value != null) {
            List<AbstractC56585k> g = C89070n.m154585g((Collection) value);
            int indexOf = g.indexOf(kVar);
            g.size();
            AbstractC56585k remove = g.remove(indexOf);
            if (remove instanceof C56582i) {
                this.f128903x = null;
            } else if (remove instanceof C56563c) {
                this.f128902w = null;
                C62259e.m112611a(EnumC56508r.TOP);
            }
            this.f128882a.setValue(g);
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
            if (this.f128902w != null) {
                ArrayList arrayList = null;
                this.f128902w = null;
                List<AbstractC56585k> value = this.f128883b.getValue();
                if (value != null) {
                    arrayList = new ArrayList();
                    for (T t : value) {
                        if (!(t instanceof C56563c)) {
                            arrayList.add(t);
                        }
                    }
                }
                this.f128882a.postValue(arrayList);
            }
        } else if (this.f128902w == null) {
            this.f128902w = m102495f();
            this.f128882a.postValue(mo93470a());
        }
    }

    /* renamed from: a */
    public static void m102491a(C56562b bVar, String str, String str2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        m102492a("show", bVar, str, str2);
    }

    /* renamed from: a */
    public static void m102492a(String str, C56562b bVar, String str2, String str3) {
        C89378p<String, String> a = m102490a(bVar.f128967e);
        String component1 = a.component1();
        String component2 = a.component2();
        Map b = C89041ag.m154427b(C89387v.m154943a("enter_from", "notification_page"), C89387v.m154943a("show_cnt", component1), C89387v.m154943a("action_type", str), C89387v.m154943a("show_message_type", str2), C89387v.m154943a("has_dots", str3));
        if (component2 != null) {
            b.put("notice_type", component2);
        }
        C89233z.C89238e eVar = new C89233z.C89238e();
        eVar.element = "inbox_activity_notice";
        if (bVar.f128963a == EnumC56565e.FOLLOWER) {
            eVar.element = "inbox_follower_notice";
        }
        C39162r.m79452a().execute(new RunnableC56531f(eVar, b));
    }
}
