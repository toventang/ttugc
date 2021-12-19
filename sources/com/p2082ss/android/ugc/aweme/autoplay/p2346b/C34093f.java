package com.p2082ss.android.ugc.aweme.autoplay.p2346b;

import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.depend.model.live.RoomInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.autoplay.p2346b.View$OnAttachStateChangeListenerC34066d;
import com.p2082ss.android.ugc.aweme.autoplay.player.C34183a;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42410g;
import com.p2082ss.android.ugc.aweme.discover.model.SearchLiveList;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c.C42815b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51060g;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.ecom.live.C67425b;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;
import p4600h.p4621l.C89309k;

/* renamed from: com.ss.android.ugc.aweme.autoplay.b.f */
public final class C34093f extends AbstractC34057a implements C42815b.AbstractC42817b {

    /* renamed from: f */
    public static final C34094a f80607f = new C34094a((byte) 0);

    /* renamed from: e */
    public final RecyclerView f80608e;

    /* renamed from: g */
    private final AbstractC89244h f80609g = C89250i.m154773a((AbstractC89171a) C34096c.f80617a);

    /* renamed from: h */
    private final AbstractC89244h f80610h = C89250i.m154773a((AbstractC89171a) C34095b.f80616a);

    /* renamed from: j */
    private int f80611j;

    /* renamed from: k */
    private int f80612k;

    /* renamed from: l */
    private List<? extends Aweme> f80613l = new ArrayList();

    /* renamed from: m */
    private final AbstractC51043a f80614m;

    /* renamed from: n */
    private final C51060g f80615n;

    static {
        Covode.recordClassIndex(41027);
    }

    /* renamed from: f */
    private final LinkedHashMap<String, C89378p<Aweme, Integer>> m69663f() {
        return (LinkedHashMap) this.f80609g.getValue();
    }

    /* renamed from: g */
    private final AtomicInteger m69664g() {
        return (AtomicInteger) this.f80610h.getValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemViewType(int i) {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m69661a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.b.f$a */
    public static final class C34094a {
        static {
            Covode.recordClassIndex(41028);
        }

        private C34094a() {
        }

        public /* synthetic */ C34094a(byte b) {
            this();
        }
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme>, java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> */
    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34151g
    /* renamed from: a */
    public final List<Aweme> mo60373a() {
        return this.f80613l;
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.b.f$b */
    static final class C34095b extends AbstractC89220m implements AbstractC89171a<AtomicInteger> {

        /* renamed from: a */
        public static final C34095b f80616a = new C34095b();

        static {
            Covode.recordClassIndex(41029);
        }

        C34095b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AtomicInteger invoke() {
            return new AtomicInteger(0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.b.f$c */
    static final class C34096c extends AbstractC89220m implements AbstractC89171a<LinkedHashMap<String, C89378p<? extends Aweme, ? extends Integer>>> {

        /* renamed from: a */
        public static final C34096c f80617a = new C34096c();

        static {
            Covode.recordClassIndex(41030);
        }

        C34096c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinkedHashMap<String, C89378p<? extends Aweme, ? extends Integer>> invoke() {
            return new LinkedHashMap();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        if (this.f80613l.size() == 1) {
            return 1;
        }
        return this.f80613l.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.b.f$d */
    static final class C34097d extends AbstractC89220m implements AbstractC89172b<C89378p<? extends Aweme, ? extends Integer>, Aweme> {

        /* renamed from: a */
        public static final C34097d f80618a = new C34097d();

        static {
            Covode.recordClassIndex(41031);
        }

        C34097d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Aweme invoke(C89378p<? extends Aweme, ? extends Integer> pVar) {
            C89378p<? extends Aweme, ? extends Integer> pVar2 = pVar;
            C89219l.m154721d(pVar2, "");
            return pVar2.getFirst();
        }
    }

    /* renamed from: b */
    private final void m69662b(List<? extends Aweme> list) {
        Integer num;
        list.size();
        m69664g().get();
        LinkedHashMap<String, C89378p<Aweme, Integer>> f = m69663f();
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        for (T t : list) {
            arrayList.add(C89387v.m154943a(t.getAid(), new C89378p(t, Integer.valueOf(m69664g().getAndIncrement()))));
        }
        C89041ag.m154424a(f, arrayList);
        LinkedHashMap<String, C89378p<Aweme, Integer>> f2 = m69663f();
        if (f2 != null) {
            num = Integer.valueOf(f2.size());
        } else {
            num = null;
        }
        num.intValue();
        m69664g().get();
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34151g
    /* renamed from: a */
    public final void mo60376a(List<? extends Aweme> list) {
        int i;
        Integer second;
        Integer second2;
        C89219l.m154721d(list, "");
        this.f80613l = list;
        if (m69663f().isEmpty()) {
            m69662b(list);
        }
        C89378p<Aweme, Integer> pVar = m69663f().get(((Aweme) list.get(0)).getAid());
        int i2 = -1;
        if (pVar == null || (second2 = pVar.getSecond()) == null) {
            i = -1;
        } else {
            i = second2.intValue();
        }
        this.f80611j = i;
        C89378p<Aweme, Integer> pVar2 = m69663f().get(((Aweme) list.get(list.size() - 1)).getAid());
        if (!(pVar2 == null || (second = pVar2.getSecond()) == null)) {
            i2 = second.intValue();
        }
        this.f80612k = i2;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c.C42815b.AbstractC42817b
    /* renamed from: a */
    public final void mo60375a(String str) {
        C89378p<Aweme, Integer> pVar;
        Integer second;
        int i;
        C89219l.m154721d(str, "");
        if (!(this.f80613l.size() <= 1 || (pVar = m69663f().get(str)) == null || (second = pVar.getSecond()) == null)) {
            int intValue = second.intValue();
            int c = C89271h.m154772c(m69663f().size(), 10) - 1;
            int i2 = this.f80611j;
            int i3 = this.f80612k;
            if (i2 > intValue || i3 < intValue) {
                if (intValue < i2) {
                    i = c + intValue;
                } else {
                    int i4 = intValue - c;
                    i = intValue + 1;
                    intValue = i4;
                }
                Collection<C89378p<Aweme, Integer>> values = m69663f().values();
                C89219l.m154716b(values, "");
                List g = C89309k.m154813g(C89309k.m154810e(C89070n.m154598r(values), C34097d.f80618a));
                if (!g.isEmpty()) {
                    int size = g.size() - 1;
                    if (intValue >= 0 && size >= intValue && i >= 0 && size >= i && intValue <= i) {
                        g = g.subList(intValue, i);
                    }
                }
                AbstractC34057a.m69631a(this, g, null, null, false, 6);
            }
            int i5 = -1;
            int i6 = 0;
            for (T t : this.f80613l) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    C89070n.m154520a();
                }
                if (C89219l.m154714a((Object) t.getAid(), (Object) str)) {
                    i5 = i6;
                }
                i6 = i7;
            }
            RecyclerView.AbstractC1362i layoutManager = this.f80608e.getLayoutManager();
            if (!(layoutManager instanceof LinearLayoutManager)) {
                layoutManager = null;
            }
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            if (linearLayoutManager != null) {
                linearLayoutManager.mo4347a(i5, 0);
                linearLayoutManager.mo4329a(true);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C89219l.m154721d(viewHolder, "");
        if (getItemViewType(i) == 1 && (viewHolder instanceof View$OnAttachStateChangeListenerC34066d)) {
            ((View$OnAttachStateChangeListenerC34066d) viewHolder).mo60355a(((AbstractC34057a) this).f80530a, (Aweme) this.f80613l.get(i), this.f80532c, this, this.f80533d.get(i));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c.C42815b.AbstractC42817b
    /* renamed from: a */
    public final void mo60374a(SearchLiveList searchLiveList, List<? extends Aweme> list, boolean z) {
        C89219l.m154721d(searchLiveList, "");
        C89219l.m154721d(list, "");
        list.size();
        m69662b(list);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34093f(AbstractC51043a aVar, C51060g gVar, RecyclerView recyclerView) {
        super(recyclerView);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(recyclerView, "");
        this.f80614m = aVar;
        this.f80615n = gVar;
        this.f80608e = recyclerView;
        gVar.f117776g = new C34183a(recyclerView, gVar);
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m69661a(C34093f fVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(8659);
        C89219l.m154721d(viewGroup, "");
        View$OnAttachStateChangeListenerC34066d a2 = View$OnAttachStateChangeListenerC34066d.C34080a.m69656a(viewGroup, fVar.f80614m, fVar.f80615n, fVar);
        try {
            if (a2.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(a2.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) a2.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(a2.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = a2.getClass().getName();
        MethodCollector.m26664o(8659);
        return a2;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2346b.AbstractC34057a
    /* renamed from: a */
    public final void mo60345a(List<? extends Aweme> list, C42410g gVar, Long l, boolean z) {
        long j;
        long j2;
        String str;
        long j3;
        long j4;
        String str2;
        C89219l.m154721d(list, "");
        C34105h hVar = null;
        if (z) {
            this.f80532c = null;
            m69663f().clear();
            m69664g().set(0);
        }
        mo60376a(list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.f80533d.clear();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            this.f80533d.add(new C67425b(it.next()));
        }
        if (this.f80532c == null) {
            for (T t : list) {
                User author = t.getAuthor();
                if (author != null) {
                    j3 = author.roomId;
                } else {
                    j3 = 0;
                }
                arrayList.add(Long.valueOf(j3));
                User author2 = t.getAuthor();
                if (author2 != null) {
                    j4 = author2.roomId;
                } else {
                    j4 = 0;
                }
                User author3 = t.getAuthor();
                if (author3 == null || (str2 = author3.getUid()) == null) {
                    str2 = "";
                }
                arrayList2.add(new RoomInfo(j4, str2));
            }
            hVar = new C34105h(gVar, this.f80531b, list, arrayList, arrayList2, l);
        } else {
            Collection<C89378p<Aweme, Integer>> values = m69663f().values();
            C89219l.m154716b(values, "");
            ArrayList arrayList3 = new ArrayList(C89070n.m154526a(values, 10));
            Iterator<T> it2 = values.iterator();
            while (it2.hasNext()) {
                arrayList3.add(it2.next().getFirst());
            }
            ArrayList<Aweme> arrayList4 = arrayList3;
            for (Aweme aweme : arrayList4) {
                User author4 = aweme.getAuthor();
                if (author4 != null) {
                    j = author4.roomId;
                } else {
                    j = 0;
                }
                arrayList.add(Long.valueOf(j));
                User author5 = aweme.getAuthor();
                if (author5 != null) {
                    j2 = author5.roomId;
                } else {
                    j2 = 0;
                }
                User author6 = aweme.getAuthor();
                if (author6 == null || (str = author6.getUid()) == null) {
                    str = "";
                }
                arrayList2.add(new RoomInfo(j2, str));
            }
            C34105h hVar2 = this.f80532c;
            if (hVar2 != null) {
                hVar = new C34105h(hVar2.f80637a, hVar2.f80638b, arrayList4, arrayList, arrayList2, hVar2.f80642f);
            }
        }
        this.f80532c = hVar;
        notifyDataSetChanged();
    }
}
