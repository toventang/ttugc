package com.p2082ss.android.ugc.aweme.discover.helper;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p2082ss.android.ugc.aweme.discover.model.ContinuousLoadingAwemeList;
import com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42293b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.t */
public final class C42050t<T> implements AbstractC42293b.AbstractC42294a<C49672ag> {

    /* renamed from: a */
    public RecyclerView.AbstractC1350a<?> f98031a;

    /* renamed from: b */
    private final Map<String, C89378p<Integer, Aweme>> f98032b = new LinkedHashMap();

    /* renamed from: c */
    private final AbstractC89244h f98033c = C89250i.m154773a((AbstractC89171a) C42051a.f98034a);

    static {
        Covode.recordClassIndex(49980);
    }

    /* renamed from: b */
    private final IAwemeService m84151b() {
        return (IAwemeService) this.f98033c.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42293b.AbstractC42294a
    /* renamed from: a */
    public final Class<C49672ag> mo60371a() {
        return C49672ag.class;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.helper.t$a */
    static final class C42051a extends AbstractC89220m implements AbstractC89171a<IAwemeService> {

        /* renamed from: a */
        public static final C42051a f98034a = new C42051a();

        static {
            Covode.recordClassIndex(49981);
        }

        C42051a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IAwemeService invoke() {
            return AwemeService.m70060b();
        }
    }

    public C42050t(RecyclerView.AbstractC1350a<?> aVar) {
        C89219l.m154721d(aVar, "");
        this.f98031a = aVar;
        C41985ae.f97915a.mo71487a((AbstractC42293b.AbstractC42294a<?>) this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42293b.AbstractC42294a
    /* renamed from: a */
    public final /* synthetic */ void mo60372a(C49672ag agVar) {
        Integer valueOf;
        Integer valueOf2;
        C49672ag agVar2 = agVar;
        C89219l.m154721d(agVar2, "");
        if (agVar2.f114315a == 13) {
            IAwemeService b = m84151b();
            String str = (String) agVar2.f114316b;
            if (str == null) {
                str = "";
            }
            Aweme b2 = b.mo60684b(str);
            Iterator<T> it = this.f98032b.entrySet().iterator();
            while (it.hasNext()) {
                Aweme aweme = (Aweme) ((C89378p) it.next().getValue()).getSecond();
                if (C89219l.m154714a((Object) aweme.getAid(), agVar2.f114316b)) {
                    Bundle bundle = agVar2.f114317c;
                    if (!(bundle == null || (valueOf2 = Integer.valueOf(bundle.getInt("user_digged"))) == null)) {
                        aweme.setUserDigg(valueOf2.intValue());
                    }
                    if (b2 != null) {
                        aweme.setUserDigg(b2.getUserDigg());
                        AwemeStatistics statistics = b2.getStatistics();
                        if (statistics != null) {
                            long diggCount = statistics.getDiggCount();
                            AwemeStatistics statistics2 = aweme.getStatistics();
                            C89219l.m154716b(statistics2, "");
                            statistics2.setDiggCount(diggCount);
                        }
                    }
                }
            }
            Iterator<T> it2 = C42058x.f98054b.entrySet().iterator();
            while (it2.hasNext()) {
                List<Aweme> list = ((ContinuousLoadingAwemeList) it2.next().getValue()).awemeList;
                if (list != null) {
                    for (T t : list) {
                        if (C89219l.m154714a((Object) t.getAid(), agVar2.f114316b)) {
                            Bundle bundle2 = agVar2.f114317c;
                            if (!(bundle2 == null || (valueOf = Integer.valueOf(bundle2.getInt("user_digged"))) == null)) {
                                t.setUserDigg(valueOf.intValue());
                            }
                            if (b2 != null) {
                                t.setUserDigg(b2.getUserDigg());
                                AwemeStatistics statistics3 = b2.getStatistics();
                                if (statistics3 != null) {
                                    long diggCount2 = statistics3.getDiggCount();
                                    AwemeStatistics statistics4 = t.getStatistics();
                                    C89219l.m154716b(statistics4, "");
                                    statistics4.setDiggCount(diggCount2);
                                }
                            }
                        }
                    }
                }
            }
            C89378p<Integer, Aweme> pVar = this.f98032b.get(agVar2.f114316b);
            if (pVar != null) {
                this.f98031a.notifyItemChanged(pVar.getFirst().intValue());
            }
        }
    }

    /* renamed from: a */
    public final void mo71221a(List<? extends T> list, AbstractC89172b<? super T, ? extends Aweme> bVar) {
        C89219l.m154721d(bVar, "");
        this.f98032b.clear();
        if (list != null) {
            int i = 0;
            for (T t : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                Aweme aweme = (Aweme) bVar.invoke(t);
                if (aweme != null) {
                    Map<String, C89378p<Integer, Aweme>> map = this.f98032b;
                    String aid = aweme.getAid();
                    C89219l.m154716b(aid, "");
                    map.put(aid, new C89378p<>(Integer.valueOf(i), aweme));
                    m84151b().mo60677a(aweme);
                }
                i = i2;
            }
        }
    }
}
