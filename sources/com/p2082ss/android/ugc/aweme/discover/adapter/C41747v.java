package com.p2082ss.android.ugc.aweme.discover.adapter;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.mob.AbstractC42448c;
import com.p2082ss.android.ugc.aweme.discover.model.SearchChallenge;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.keyword.AbstractC57066a;
import com.p2082ss.android.ugc.aweme.search.model.C67678d;
import com.p2082ss.android.ugc.aweme.search.p3686d.AbstractC67363b;
import com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67486am;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67568r;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.v */
public final class C41747v extends AbstractC41742q<SearchChallenge> {

    /* renamed from: g */
    public C67568r f97384g;

    static {
        Covode.recordClassIndex(49660);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f
    /* renamed from: b_ */
    public final void mo62377b_(List<SearchChallenge> list) {
        this.f97370f.f150937a = Integer.MIN_VALUE;
        super.mo62377b_(list);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: b */
    public final RecyclerView.ViewHolder mo61482b(ViewGroup viewGroup, int i) {
        C41790w a = C41790w.m83742a(viewGroup, "chanllenge_tab");
        a.f97483h = "search_result";
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.widget.AbstractC34766g
    /* renamed from: b */
    public final void mo61483b(RecyclerView.ViewHolder viewHolder, int i) {
        String str;
        String str2;
        int i2;
        C41790w wVar = (C41790w) viewHolder;
        SearchChallenge searchChallenge = (SearchChallenge) this.f92236l.get(i);
        C67568r rVar = this.f97384g;
        if (rVar == null) {
            AbstractC67567q a = C67486am.m119564a();
            if (a != null) {
                str = a.mo106431c().f151151a;
                str2 = a.mo106431c().f151152b;
                i2 = a.mo106426a();
            } else {
                str = "";
                str2 = str;
                i2 = 0;
            }
            LogPbBean logPbBean = searchChallenge.logPbBean;
            if (logPbBean == null) {
                logPbBean = new LogPbBean();
                logPbBean.setImprId("");
            }
            String imprId = logPbBean.getImprId();
            String b = C48027ac.C48028a.f111257a.mo80057b(imprId);
            this.f97368d.getEnterMethod();
            String a2 = AbstractC42448c.AbstractC42450b.C42451a.m84856a(2);
            String a3 = AbstractC42448c.C42449a.m84855a(2);
            C67568r g = C67568r.C67569a.m119673a().mo106518g("search_result");
            g.f151306a = false;
            C67568r a4 = g.mo106519h(str).mo106520i(imprId).mo106521j(b).mo106507a(logPbBean);
            a4.f151307b = i2;
            a4.f151318m = i;
            C67568r f = a4.mo106517f(str2);
            f.f151308c = 2;
            rVar = f.mo106515d(a2).mo106516e(a3);
        }
        wVar.mo70880a(rVar);
        wVar.mo70947a((SearchChallenge) this.f92236l.get(i), mo70924l());
        this.f97370f.mo106288a(i, mo60933c());
    }

    public C41747v(C67678d dVar, AbstractC57066a.AbstractC57068b bVar, AbstractC67363b bVar2) {
        super(dVar, bVar, bVar2);
    }
}
