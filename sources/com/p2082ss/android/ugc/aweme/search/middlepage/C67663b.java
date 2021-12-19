package com.p2082ss.android.ugc.aweme.search.middlepage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.discover.api.SuggestWordsApi;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.VisitedAccount;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42641ag;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.middlepage.b */
public final class C67663b extends RecyclerView.ViewHolder implements AbstractC42641ag {

    /* renamed from: c */
    public static final C67664a f151589c = new C67664a((byte) 0);

    /* renamed from: a */
    public final ArrayList<AbstractC17641a> f151590a = new ArrayList<>();

    /* renamed from: b */
    public final AbstractC42664al.AbstractC42667c f151591b;

    /* renamed from: d */
    private PowerList f151592d;

    static {
        Covode.recordClassIndex(79306);
    }

    /* renamed from: com.ss.android.ugc.aweme.search.middlepage.b$a */
    public static final class C67664a {
        static {
            Covode.recordClassIndex(79307);
        }

        private C67664a() {
        }

        public /* synthetic */ C67664a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67663b(View view, AbstractC42664al.AbstractC42667c cVar) {
        super(view);
        C89219l.m154721d(view, "");
        this.f151591b = cVar;
        View findViewById = view.findViewById(R.id.d54);
        C89219l.m154716b(findViewById, "");
        this.f151592d = (PowerList) findViewById;
        this.f151592d.setItemAnimator(null);
        this.f151592d.mo28083a(VisitedAccountCell.class, VisitedAccountTitleCell.class);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42641ag
    /* renamed from: a */
    public final void mo72848a(VisitedAccount visitedAccount, int i) {
        String str;
        if (i < this.f151592d.getState().mo28134b()) {
            AbstractC42664al.AbstractC42667c cVar = this.f151591b;
            if (cVar != null) {
                cVar.mo72866a(visitedAccount, i);
            }
            this.f151592d.getState().mo28129a(i);
            SuggestWordsApi.C41852a aVar = new SuggestWordsApi.C41852a();
            if (visitedAccount != null) {
                str = visitedAccount.getUid();
            } else {
                str = null;
            }
            aVar.f97645h = str;
            SuggestWordsApi.m83834b(aVar);
            if (this.f151592d.getState().mo28134b() == 1) {
                this.f151592d.getState().mo28128a();
            }
        }
    }

    /* renamed from: a */
    public final void mo106645a(List<VisitedAccount> list, String str) {
        if (list != null) {
            this.f151590a.clear();
            this.f151590a.add(new C67667e());
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                this.f151590a.add(new C67666d(it.next(), str, this));
            }
            this.f151592d.getState().mo28128a();
            this.f151592d.getState().mo28133a(this.f151590a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42641ag
    /* renamed from: a */
    public final void mo72849a(VisitedAccount visitedAccount, String str, int i) {
        AbstractC42664al.AbstractC42667c cVar = this.f151591b;
        if (cVar != null) {
            cVar.mo72867a(visitedAccount, str, i);
        }
    }
}
