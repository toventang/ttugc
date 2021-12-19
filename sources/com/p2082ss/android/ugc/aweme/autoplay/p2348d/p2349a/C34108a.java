package com.p2082ss.android.ugc.aweme.autoplay.p2348d.p2349a;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34164k;
import com.p2082ss.android.ugc.aweme.autoplay.player.video.SearchVideoView;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p2082ss.android.ugc.aweme.discover.helper.C41985ae;
import com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42293b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51060g;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.a */
public final class C34108a<T> implements AbstractC42293b.AbstractC42294a<C49672ag> {

    /* renamed from: a */
    final Map<String, C89378p<Integer, Aweme>> f80646a = new LinkedHashMap();

    /* renamed from: b */
    public RecyclerView f80647b;

    /* renamed from: c */
    private final AbstractC89244h f80648c = C89250i.m154773a((AbstractC89171a) C34109a.f80649a);

    static {
        Covode.recordClassIndex(41042);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final IAwemeService mo60407b() {
        return (IAwemeService) this.f80648c.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42293b.AbstractC42294a
    /* renamed from: a */
    public final Class<C49672ag> mo60371a() {
        return C49672ag.class;
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.a$a */
    static final class C34109a extends AbstractC89220m implements AbstractC89171a<IAwemeService> {

        /* renamed from: a */
        public static final C34109a f80649a = new C34109a();

        static {
            Covode.recordClassIndex(41043);
        }

        C34109a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IAwemeService invoke() {
            return AwemeService.m70060b();
        }
    }

    public C34108a(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        this.f80647b = recyclerView;
        C41985ae.f97915a.mo71487a((AbstractC42293b.AbstractC42294a<?>) this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.aweme.discover.p2787m.AbstractC42293b.AbstractC42294a
    /* renamed from: a */
    public final /* synthetic */ void mo60372a(C49672ag agVar) {
        SearchVideoView l;
        C51060g mScrollStateManager;
        Integer valueOf;
        C49672ag agVar2 = agVar;
        C89219l.m154721d(agVar2, "");
        if (agVar2.f114315a == 13) {
            IAwemeService b = mo60407b();
            String str = (String) agVar2.f114316b;
            if (str == null) {
                str = "";
            }
            Aweme b2 = b.mo60684b(str);
            Iterator<T> it = this.f80646a.entrySet().iterator();
            while (it.hasNext()) {
                Aweme aweme = (Aweme) ((C89378p) it.next().getValue()).getSecond();
                if (C89219l.m154714a((Object) aweme.getAid(), agVar2.f114316b)) {
                    Bundle bundle = agVar2.f114317c;
                    if (!(bundle == null || (valueOf = Integer.valueOf(bundle.getInt("user_digged"))) == null)) {
                        aweme.setUserDigg(valueOf.intValue());
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
            C89378p<Integer, Aweme> pVar = this.f80646a.get(agVar2.f114316b);
            if (pVar != null) {
                RecyclerView.ViewHolder f = this.f80647b.mo4451f(pVar.getFirst().intValue());
                if (!(f == null || !(f instanceof View$OnAttachStateChangeListenerC34123f) || (l = ((AbstractC34164k) f).mo60359l()) == null || (mScrollStateManager = l.getMScrollStateManager()) == null)) {
                    mScrollStateManager.mo86397b(l.getMScrollStateObserver());
                }
                RecyclerView.AbstractC1350a adapter = this.f80647b.getAdapter();
                if (adapter != null) {
                    adapter.notifyItemChanged(pVar.getFirst().intValue());
                }
            }
        }
    }
}
