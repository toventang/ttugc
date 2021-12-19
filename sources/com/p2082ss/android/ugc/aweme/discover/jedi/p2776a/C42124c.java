package com.p2082ss.android.ugc.aweme.discover.jedi.p2776a;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p036g.AbstractC0688a;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.jedi.arch.ext.list.AbstractC20427a;
import com.bytedance.jedi.arch.ext.list.p1464a.C20431b;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.autoplay.p2346b.C34098g;
import com.p2082ss.android.ugc.aweme.autoplay.p2348d.p2349a.C34137i;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39059e;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.discover.helper.C42050t;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.AbstractC42218b;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42219c;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42226e;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42230f;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42235g;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42237h;
import com.p2082ss.android.ugc.aweme.discover.lynx.delegate.C42242i;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2779a.C42186b;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2783e.AbstractC42263c;
import com.p2082ss.android.ugc.aweme.discover.lynx.p2783e.View$OnAttachStateChangeListenerC42258a;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.C42411h;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2788a.C42309b;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2791cs.C42333a;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2791cs.ClickSearchViewModel;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2792d.C42350d;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2792d.C42356f;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2793e.AbstractC42367a;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2793e.C42368b;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2793e.C42370c;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2793e.C42390d;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2793e.C42392e;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2793e.C42398f;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2793e.C42400g;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2793e.C42407h;
import com.p2082ss.android.ugc.aweme.discover.mob.C42460j;
import com.p2082ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.p2082ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p2082ss.android.ugc.aweme.discover.model.SearchUser;
import com.p2082ss.android.ugc.aweme.discover.p2766b.View$OnAttachStateChangeListenerC41864g;
import com.p2082ss.android.ugc.aweme.discover.p2795n.View$OnClickListenerC42476c;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.C42706aw;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51044b;
import com.p2082ss.android.ugc.aweme.newfollow.p3505b.AbstractC61496a;
import com.p2082ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3686d.AbstractC67363b;
import com.p2082ss.android.ugc.aweme.search.p3686d.AbstractC67364c;
import com.p2082ss.android.ugc.aweme.search.p3686d.C67365d;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67617g;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67623i;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67631j;
import com.p2082ss.android.ugc.aweme.search.p3696l.C67641m;
import com.p2082ss.android.ugc.aweme.search.theme.dark.C67797b;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.a.c */
public final class C42124c extends AbstractC39060f<C42411h> implements AbstractC20427a<C42411h>, AbstractC51044b, C67623i.AbstractC67630a {

    /* renamed from: h */
    public static final C42126a f98195h = new C42126a((byte) 0);

    /* renamed from: a */
    public C67678d f98196a;

    /* renamed from: b */
    public View$OnAttachStateChangeListenerC41864g f98197b;

    /* renamed from: c */
    public List<String> f98198c;

    /* renamed from: d */
    public ClickSearchViewModel f98199d;

    /* renamed from: e */
    public final C67623i f98200e;

    /* renamed from: f */
    public final RecyclerView f98201f;

    /* renamed from: g */
    public final AbstractC51043a f98202g;

    /* renamed from: i */
    private final C67365d f98203i;

    /* renamed from: j */
    private C42050t<C42411h> f98204j = new C42050t<>(this);

    /* renamed from: k */
    private GlobalDoodleConfig f98205k;

    /* renamed from: w */
    private final C20431b<C42411h> f98206w;

    /* renamed from: x */
    private AbstractC67364c f98207x;

    static {
        Covode.recordClassIndex(50059);
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51044b
    /* renamed from: a */
    public final void mo60482a(Aweme aweme) {
    }

    @Override // com.bytedance.jedi.arch.ext.list.AbstractC20427a
    /* renamed from: a */
    public final void mo33763a(List<? extends C42411h> list, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(list, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.a.c$a */
    public static final class C42126a {
        static {
            Covode.recordClassIndex(50061);
        }

        private C42126a() {
        }

        public /* synthetic */ C42126a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.a.c$e */
    public static final class C42130e implements AbstractC42263c {
        static {
            Covode.recordClassIndex(50065);
        }

        C42130e() {
        }

        @Override // com.p2082ss.android.ugc.aweme.discover.lynx.p2783e.AbstractC42263c
        /* renamed from: a */
        public final List<AbstractC42218b> mo71317a(C42186b bVar) {
            C89219l.m154721d(bVar, "");
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C42237h(bVar));
            arrayList.add(new C42226e(bVar));
            arrayList.add(new C42235g(bVar));
            arrayList.add(new C42230f(bVar));
            arrayList.add(new C42219c(bVar));
            arrayList.add(new C42242i(bVar));
            return arrayList;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.a.c$h */
    public static final class C42133h implements AbstractC89172b<C42411h, Aweme> {
        static {
            Covode.recordClassIndex(50068);
        }

        C42133h() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Aweme invoke(C42411h hVar) {
            C42411h hVar2 = hVar;
            if (hVar2 != null) {
                return hVar2.getAweme();
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.a.c$i */
    public static final class C42134i implements AbstractC89172b<C42411h, Aweme> {
        static {
            Covode.recordClassIndex(50069);
        }

        C42134i() {
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Aweme invoke(C42411h hVar) {
            C42411h hVar2 = hVar;
            if (hVar2 != null) {
                return hVar2.getAweme();
            }
            return null;
        }
    }

    @Override // com.bytedance.jedi.arch.ext.list.AbstractC20427a
    /* renamed from: a */
    public final C20431b<C42411h> mo33761a() {
        return this.f98206w;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l, androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final int getItemCount() {
        return super.getItemCount();
    }

    /* renamed from: l */
    public final void mo71336l() {
        this.f98203i.mo106287a(mo60933c());
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.a.c$g */
    static final class RunnableC42132g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.ViewHolder f98221a;

        static {
            Covode.recordClassIndex(50067);
        }

        RunnableC42132g(RecyclerView.ViewHolder viewHolder) {
            this.f98221a = viewHolder;
        }

        public final void run() {
            RecyclerView.ViewHolder viewHolder = this.f98221a;
            if (viewHolder instanceof AbstractC39059e) {
                ((AbstractC39059e) viewHolder).mo66994b(true);
            }
            RecyclerView.ViewHolder viewHolder2 = this.f98221a;
            if (viewHolder2 instanceof View$OnClickListenerC42476c) {
                ((View$OnClickListenerC42476c) viewHolder2).mo72645a("general_search");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.a.c$b */
    public static final class RunnableC42127b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42124c f98211a;

        /* renamed from: b */
        final /* synthetic */ int f98212b;

        /* renamed from: c */
        final /* synthetic */ int f98213c;

        /* renamed from: d */
        final /* synthetic */ AbstractC0688a f98214d;

        static {
            Covode.recordClassIndex(50062);
        }

        RunnableC42127b(C42124c cVar, int i, int i2, AbstractC0688a aVar) {
            this.f98211a = cVar;
            this.f98212b = i;
            this.f98213c = i2;
            this.f98214d = aVar;
        }

        public final void run() {
            RecyclerView.ViewHolder f = this.f98211a.f98201f.mo4451f(this.f98212b);
            if (f == null) {
                int i = this.f98213c;
                if (i < 10) {
                    this.f98211a.mo71330a(this.f98212b, i + 1, this.f98214d);
                    return;
                }
                return;
            }
            this.f98214d.mo2720a(f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.a.c$c */
    static final class C42128c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C42356f f98215a;

        /* renamed from: b */
        final /* synthetic */ C42124c f98216b;

        /* renamed from: c */
        final /* synthetic */ int f98217c;

        /* renamed from: d */
        final /* synthetic */ C42411h f98218d;

        static {
            Covode.recordClassIndex(50063);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42128c(C42356f fVar, C42124c cVar, int i, C42411h hVar) {
            super(0);
            this.f98215a = fVar;
            this.f98216b = cVar;
            this.f98217c = i;
            this.f98218d = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            Integer num;
            ViewGroup.LayoutParams layoutParams;
            int i;
            View view;
            Fragment g = this.f98216b.f98202g.mo60503g();
            GridLayoutManager.C1336b bVar = null;
            if (g != null) {
                num = Integer.valueOf(g.hashCode());
            } else {
                num = null;
            }
            int i2 = this.f98217c;
            C42356f fVar = this.f98215a;
            if (fVar == null || (view = fVar.itemView) == null) {
                layoutParams = null;
            } else {
                layoutParams = view.getLayoutParams();
            }
            if (layoutParams instanceof GridLayoutManager.C1336b) {
                bVar = layoutParams;
            }
            GridLayoutManager.C1336b bVar2 = bVar;
            if (bVar2 != null) {
                i = bVar2.f4324a;
            } else {
                i = -1;
            }
            if (num != null) {
                num.intValue();
                Map<Integer, Map<Integer, Integer>> a = C42350d.m84714a();
                Map<Integer, Integer> map = a.get(num);
                if (map == null) {
                    map = new LinkedHashMap<>();
                    a.put(num, map);
                }
                map.put(Integer.valueOf(i2), Integer.valueOf(i));
            }
            return C89391z.f203057a;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.jedi.arch.ext.list.AbstractC20427a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C42411h mo33762a(int i) {
        return AbstractC20427a.C20428a.m38638a((AbstractC20427a) this, i, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: b */
    public final void mo62376b(List<C42411h> list) {
        this.f98204j.mo71221a(list, new C42134i());
        super.mo62376b(list);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3696l.C67623i.AbstractC67630a
    /* renamed from: c */
    public final RecyclerView.ViewHolder mo71333c(ViewGroup viewGroup) {
        C42407h hVar = new C42407h(C67641m.m119786a(viewGroup, R.layout.aw0), viewGroup.getContext());
        C89219l.m154716b(hVar, "");
        return hVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        C67631j.m119782a(this.f98201f, new RunnableC42132g(viewHolder));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a, com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        super.onViewDetachedFromWindow(viewHolder);
        if (viewHolder instanceof AbstractC39059e) {
            ((AbstractC39059e) viewHolder).mo66994b(false);
        }
        View view = viewHolder.itemView;
        C89219l.m154716b(view, "");
        C42460j.C42461a.m84866b(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        C89219l.m154721d(viewHolder, "");
        super.onViewRecycled(viewHolder);
        if (viewHolder instanceof AbstractC42367a) {
            ((AbstractC42367a) viewHolder).mo71445C();
        }
    }

    /* renamed from: a */
    public final int mo71329a(String str) {
        String str2;
        C89219l.m154721d(str, "");
        List<C42411h> list = this.f92236l;
        C89219l.m154716b(list, "");
        int i = 0;
        for (C42411h hVar : list) {
            C89219l.m154716b(hVar, "");
            if (hVar.mo71599a()) {
                Aweme aweme = hVar.getAweme();
                if (aweme != null) {
                    str2 = aweme.getAid();
                } else {
                    str2 = null;
                }
                if (TextUtils.equals(str, str2)) {
                    return i;
                }
            }
            i++;
        }
        return -1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<? extends com.ss.android.ugc.aweme.discover.mixfeed.h>] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: b_ */
    public final void mo62377b_(List<C42411h> list) {
        List<T> list2;
        this.f98204j.mo71221a(list, new C42133h());
        if (list != null) {
            list2 = C89070n.m154585g((Collection) list);
        } else {
            list2 = null;
        }
        if (list2 == null) {
            list2 = new ArrayList<>();
            mo67829d(false);
        }
        this.f98203i.f150937a = Integer.MIN_VALUE;
        List<? extends C42411h> list3 = this.f92236l;
        this.f92236l = list2;
        m84355a(list3, this.f92236l);
        C67623i.f151509f.set(0);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3696l.C67623i.AbstractC67630a
    /* renamed from: d */
    public final RecyclerView.ViewHolder mo71334d(ViewGroup viewGroup) {
        if (viewGroup == null) {
            C89219l.m154715b();
        }
        View$OnClickListenerC42476c cVar = new View$OnClickListenerC42476c(C67641m.m119786a(viewGroup, C42706aw.m85304a()), "", this.f98207x, this.f98199d);
        cVar.mo72643a(this.f98202g);
        cVar.mo72640a(this.f98197b);
        View$OnAttachStateChangeListenerC41864g gVar = this.f98197b;
        if (gVar != null) {
            gVar.mo71030a(cVar);
        }
        return cVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: c */
    public final int mo60936c(int i) {
        AbstractC61496a aVar = (AbstractC61496a) this.f92236l.get(i);
        C89219l.m154716b(aVar, "");
        switch (aVar.getFeedType()) {
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return 8;
            case 61:
                return 21;
            case 70:
                return 20;
            case 65280:
                return 16;
            case 65456:
                return 128;
            case 65457:
                return 112;
            case 65458:
                return 96;
            case 65465:
                return 144;
            case 65467:
                return 48;
            case 65514:
                return 18;
            case 65515:
                return 17;
            case 1048336:
                return 19;
            default:
                return -1;
        }
    }

    /* renamed from: e */
    public final void mo71335e(List<? extends C42411h> list) {
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList();
        ArrayList<AbstractC61496a> arrayList2 = new ArrayList();
        for (T t : list) {
            if (t.getFeedType() == 65280) {
                arrayList2.add(t);
            }
        }
        for (AbstractC61496a aVar : arrayList2) {
            Aweme aweme = aVar.getAweme();
            if (aweme != null) {
                String aid = aweme.getAid();
                C89219l.m154716b(aid, "");
                arrayList.add(aid);
            }
        }
        this.f98198c = arrayList;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.a.c$f */
    public static final class C42131f<T> implements AbstractC0688a {

        /* renamed from: a */
        final /* synthetic */ C49672ag f98220a;

        static {
            Covode.recordClassIndex(50066);
        }

        public C42131f(C49672ag agVar) {
            this.f98220a = agVar;
        }

        @Override // androidx.core.p036g.AbstractC0688a
        /* renamed from: a */
        public final /* synthetic */ void mo2720a(Object obj) {
            long j;
            Map<Integer, Integer> map;
            Set<Map.Entry<Integer, Integer>> entrySet;
            Fragment g;
            RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) obj;
            Integer num = null;
            if (!(viewHolder instanceof View$OnClickListenerC42476c)) {
                viewHolder = null;
            }
            View$OnClickListenerC42476c cVar = (View$OnClickListenerC42476c) viewHolder;
            if (cVar != null) {
                C49672ag agVar = this.f98220a;
                C89219l.m154721d(agVar, "");
                if (agVar.f114321g > cVar.f99072v) {
                    j = agVar.f114321g;
                } else {
                    j = cVar.f99072v;
                }
                cVar.f99072v = System.currentTimeMillis();
                long currentTimeMillis = System.currentTimeMillis() - j;
                long millis = TimeUnit.SECONDS.toMillis(5);
                if (j > 0 && currentTimeMillis > 0 && currentTimeMillis >= millis) {
                    AbstractC51043a aVar = cVar.f99062f;
                    if (!(aVar == null || (g = aVar.mo60503g()) == null)) {
                        num = Integer.valueOf(g.hashCode());
                    }
                    int adapterPosition = cVar.getAdapterPosition();
                    if (!(adapterPosition < 0 || num == null || (map = C42350d.m84714a().get(num)) == null)) {
                        Map<Integer, Integer> map2 = map;
                        if (!(map2 == null || (entrySet = map2.entrySet()) == null)) {
                            for (T t : entrySet) {
                                int intValue = ((Number) t.getKey()).intValue();
                                int intValue2 = ((Number) t.getValue()).intValue();
                                if (intValue2 == 0) {
                                    int i = intValue + 1;
                                    int i2 = intValue + 2;
                                    if (adapterPosition == intValue - 2 || adapterPosition == i || adapterPosition == i2) {
                                        return;
                                    }
                                } else if (intValue2 == 1) {
                                    int i3 = intValue - 1;
                                    int i4 = intValue + 2;
                                    if (adapterPosition == intValue - 2 || adapterPosition == i3 || adapterPosition == i4) {
                                        return;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        C42333a aVar2 = cVar.f99066j;
                        if (aVar2 != null) {
                            aVar2.f98623a = cVar.f99070t;
                            aVar2.mo71527b();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo71331a(GlobalDoodleConfig globalDoodleConfig) {
        if (globalDoodleConfig != null) {
            this.f98205k = globalDoodleConfig;
        }
    }

    /* renamed from: a */
    public final void mo71332a(FollowStatus followStatus) {
        if (!(this.f92236l == null || this.f92236l.isEmpty() || followStatus == null || TextUtils.isEmpty(followStatus.userId))) {
            for (C42411h hVar : this.f92236l) {
                if (hVar != null) {
                    if (hVar.getAweme() != null) {
                        Aweme aweme = hVar.getAweme();
                        C89219l.m154716b(aweme, "");
                        m84354a(aweme.getAuthor(), followStatus);
                    } else if (hVar.f98792b != null) {
                        List<SearchUser> list = hVar.f98792b;
                        C89219l.m154716b(list, "");
                        for (T t : list) {
                            C89219l.m154716b(t, "");
                            List<Aweme> list2 = t.awemeCards;
                            if (list2 != null) {
                                for (T t2 : list2) {
                                    C89219l.m154716b(t2, "");
                                    m84354a(t2.getAuthor(), followStatus);
                                }
                            }
                        }
                    } else if (hVar.f98794d != null) {
                        List<SearchChallenge> list3 = hVar.f98794d;
                        C89219l.m154716b(list3, "");
                        for (T t3 : list3) {
                            C89219l.m154716b(t3, "");
                            List<Aweme> awemes = t3.getAwemes();
                            if (awemes != null) {
                                for (T t4 : awemes) {
                                    C89219l.m154716b(t4, "");
                                    m84354a(t4.getAuthor(), followStatus);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.jedi.a.c$d */
    public static final class C42129d extends RecyclerView.ViewHolder {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f98219a;

        static {
            Covode.recordClassIndex(50064);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42129d(ViewGroup viewGroup, View view) {
            super(view);
            this.f98219a = viewGroup;
        }
    }

    /* renamed from: a */
    private static void m84354a(User user, FollowStatus followStatus) {
        if (user != null && C89219l.m154714a((Object) followStatus.userId, (Object) user.getUid())) {
            user.setFollowStatus(followStatus.followStatus);
        }
    }

    /* renamed from: a */
    private final void m84355a(List<? extends C42411h> list, List<? extends C42411h> list2) {
        if (list == null || list2 == null) {
            notifyDataSetChanged();
        } else if (list.size() > list2.size()) {
            notifyDataSetChanged();
        } else {
            int i = 0;
            while (i < list.size() && list.get(i) == list2.get(i)) {
                i++;
            }
            if (i == 0) {
                notifyDataSetChanged();
            } else {
                int size = list2.size() - i;
                int size2 = list.size() - i;
                if (size2 > 0) {
                    notifyItemRangeRemoved(i, size2);
                }
                if (size > 0) {
                    notifyItemRangeInserted(i, size);
                }
            }
            this.f98201f.mo4413b(0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    public final RecyclerView.ViewHolder mo60184a(ViewGroup viewGroup, int i) {
        Integer num;
        MethodCollector.m26663i(8376);
        C89219l.m154721d(viewGroup, "");
        if (i == 8) {
            AbstractC51043a aVar = this.f98202g;
            View$OnAttachStateChangeListenerC41864g gVar = this.f98197b;
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(this, "");
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.avu, viewGroup, false);
            C89219l.m154716b(a, "");
            C42370c cVar = new C42370c(a, aVar, this, gVar);
            View$OnAttachStateChangeListenerC41864g gVar2 = this.f98197b;
            if (gVar2 != null) {
                gVar2.mo71030a(cVar);
            }
            MethodCollector.m26664o(8376);
            return cVar;
        } else if (i == 48) {
            C42400g a2 = C42400g.C42402a.m84775a(viewGroup);
            MethodCollector.m26664o(8376);
            return a2;
        } else if (i == 96) {
            C67623i iVar = this.f98200e;
            RecyclerView.ViewHolder b = iVar.f151511b.mo106622b();
            if (b == null) {
                b = iVar.f151511b.mo106620a();
            }
            C89219l.m154716b(b, "");
            MethodCollector.m26664o(8376);
            return b;
        } else if (i == 112) {
            C42398f fVar = new C42398f(C67641m.m119786a(viewGroup, R.layout.avy), viewGroup.getContext());
            C89219l.m154716b(fVar, "");
            MethodCollector.m26664o(8376);
            return fVar;
        } else if (i == 128) {
            C42390d dVar = new C42390d(C67641m.m119786a(viewGroup, R.layout.avy), viewGroup.getContext());
            C89219l.m154716b(dVar, "");
            MethodCollector.m26664o(8376);
            return dVar;
        } else if (i != 144) {
            switch (i) {
                case 16:
                    C67623i iVar2 = this.f98200e;
                    RecyclerView.ViewHolder b2 = iVar2.f151512c.mo106622b();
                    if (b2 == null) {
                        b2 = iVar2.f151512c.mo106620a();
                    }
                    C89219l.m154716b(b2, "");
                    MethodCollector.m26664o(8376);
                    return b2;
                case 17:
                    C89219l.m154721d(viewGroup, "");
                    C42392e eVar = new C42392e(C67641m.m119786a(viewGroup, R.layout.auj), viewGroup);
                    MethodCollector.m26664o(8376);
                    return eVar;
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                    View$OnAttachStateChangeListenerC42258a a3 = View$OnAttachStateChangeListenerC42258a.C42259a.m84600a(viewGroup, new C42130e());
                    Fragment g = this.f98202g.mo60503g();
                    if (g != null) {
                        num = Integer.valueOf(g.hashCode());
                    } else {
                        num = null;
                    }
                    C67797b.m119979a(num, a3);
                    MethodCollector.m26664o(8376);
                    return a3;
                case 19:
                    C89219l.m154721d(viewGroup, "");
                    View a4 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.aur, viewGroup, false);
                    C89219l.m154716b(a4, "");
                    C42356f fVar2 = new C42356f(a4);
                    MethodCollector.m26664o(8376);
                    return fVar2;
                case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                    C67678d dVar2 = this.f98196a;
                    AbstractC51043a aVar2 = this.f98202g;
                    C89219l.m154721d(viewGroup, "");
                    C89219l.m154721d(aVar2, "");
                    C89219l.m154721d(this, "");
                    C34137i iVar3 = new C34137i(dVar2, C67641m.m119786a(viewGroup, R.layout.avl), aVar2, this);
                    View$OnAttachStateChangeListenerC41864g gVar3 = this.f98197b;
                    if (gVar3 != null) {
                        gVar3.mo71030a(iVar3);
                    }
                    MethodCollector.m26664o(8376);
                    return iVar3;
                case 21:
                    AbstractC51043a aVar3 = this.f98202g;
                    View$OnAttachStateChangeListenerC41864g gVar4 = this.f98197b;
                    C89219l.m154721d(viewGroup, "");
                    C89219l.m154721d(aVar3, "");
                    C89219l.m154721d(this, "");
                    C34098g gVar5 = new C34098g(C67641m.m119786a(viewGroup, R.layout.avm), aVar3, this, gVar4);
                    View$OnAttachStateChangeListenerC41864g gVar6 = this.f98197b;
                    if (gVar6 != null) {
                        gVar6.mo71030a(gVar5);
                    }
                    MethodCollector.m26664o(8376);
                    return gVar5;
                default:
                    C42129d dVar3 = new C42129d(viewGroup, new View(viewGroup.getContext()));
                    MethodCollector.m26664o(8376);
                    return dVar3;
            }
        } else {
            C42368b a5 = C42368b.C42369a.m84730a(viewGroup);
            MethodCollector.m26664o(8376);
            return a5;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0445, code lost:
        if (r0 == null) goto L_0x0447;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fc, code lost:
        if (r2 == 144) goto L_0x0114;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x024b A[Catch:{ all -> 0x09fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0255 A[Catch:{ all -> 0x09fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0256 A[Catch:{ all -> 0x09fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x025e A[Catch:{ all -> 0x09fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0260 A[Catch:{ all -> 0x09fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x026c A[Catch:{ all -> 0x09fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x029f A[Catch:{ all -> 0x09fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x0a03  */
    /* JADX WARNING: Removed duplicated region for block: B:443:0x0a25  */
    /* JADX WARNING: Removed duplicated region for block: B:446:0x0a2d  */
    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39073l
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60186a(androidx.recyclerview.widget.RecyclerView.ViewHolder r22, int r23) {
        /*
        // Method dump skipped, instructions count: 2628
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.jedi.p2776a.C42124c.mo60186a(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    /* renamed from: a */
    public final void mo71330a(int i, int i2, AbstractC0688a<RecyclerView.ViewHolder> aVar) {
        this.f98201f.postDelayed(new RunnableC42127b(this, i, i2, aVar), (long) (i2 * 10));
    }

    public C42124c(RecyclerView recyclerView, AbstractC51043a aVar, AbstractC67364c cVar, AbstractC67363b bVar) {
        C89219l.m154721d(recyclerView, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(bVar, "");
        this.f98201f = recyclerView;
        this.f98202g = aVar;
        this.f98207x = cVar;
        this.f98200e = new C67623i(recyclerView, this);
        this.f92247s = new GridLayoutManager.AbstractC1337c(this) {
            /* class com.p2082ss.android.ugc.aweme.discover.jedi.p2776a.C42124c.C421251 */

            /* renamed from: e */
            final /* synthetic */ C42124c f98208e;

            /* renamed from: f */
            private final int f98209f = 1;

            /* renamed from: g */
            private final int f98210g = 2;

            static {
                Covode.recordClassIndex(50060);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f98208e = r2;
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC1337c
            /* renamed from: a */
            public final int mo4342a(int i) {
                if (C42309b.f98547a.contains(Integer.valueOf(this.f98208e.mo60936c(i)))) {
                    return this.f98209f;
                }
                return this.f98210g;
            }
        };
        if (C67617g.m119768a()) {
            C67617g.f151495a.submit(C67617g.RunnableC67619b.f151500a);
        }
        this.f98203i = new C67365d(SettingsManager.m29616a().mo25394a("general_search_load_more_remains", 0), bVar);
        this.f98206w = new C20431b<>(this, new C42122a(), (byte) 0);
    }
}
