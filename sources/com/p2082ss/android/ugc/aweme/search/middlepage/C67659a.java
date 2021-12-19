package com.p2082ss.android.ugc.aweme.search.middlepage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.discover.model.TrendingData;
import com.p2082ss.android.ugc.aweme.discover.p2797ui.AbstractC42664al;
import com.p2082ss.android.ugc.aweme.search.C67590l;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.middlepage.a */
public final class C67659a extends RecyclerView.ViewHolder {

    /* renamed from: g */
    public static final C67660a f151578g = new C67660a((byte) 0);

    /* renamed from: a */
    public final ArrayList<AbstractC17641a> f151579a = new ArrayList<>();

    /* renamed from: b */
    public final ArrayList<Boolean> f151580b = new ArrayList<>();

    /* renamed from: c */
    public TrendingData f151581c;

    /* renamed from: d */
    public boolean f151582d = true;

    /* renamed from: e */
    public final RecyclerView.AbstractC1371n f151583e = new C67662c(this);

    /* renamed from: f */
    public final AbstractC42664al.AbstractC42669e f151584f;

    /* renamed from: h */
    private PowerList f151585h;

    /* renamed from: i */
    private C88960c<Integer> f151586i;

    static {
        Covode.recordClassIndex(79302);
    }

    /* renamed from: com.ss.android.ugc.aweme.search.middlepage.a$a */
    public static final class C67660a {
        static {
            Covode.recordClassIndex(79303);
        }

        private C67660a() {
        }

        public /* synthetic */ C67660a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo106643a() {
        LinearLayoutManager linearLayoutManager;
        int k;
        int m;
        ArrayList<C67590l> arrayList;
        C67590l lVar;
        AbstractC42664al.AbstractC42669e eVar;
        RecyclerView.AbstractC1362i layoutManager = this.f151585h.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (k = (linearLayoutManager = (LinearLayoutManager) layoutManager).mo4371k()) <= (m = linearLayoutManager.mo4373m())) {
            while (true) {
                View c = layoutManager.mo4358c(k);
                if (c != null) {
                    C89219l.m154716b(c, "");
                    if (c.getGlobalVisibleRect(new Rect()) && !this.f151580b.get(k).booleanValue() && getLayoutPosition() != -1) {
                        this.f151580b.set(k, true);
                        TrendingData trendingData = this.f151581c;
                        if (!(trendingData == null || (arrayList = trendingData.billboardInfo) == null || (lVar = arrayList.get(k)) == null || (eVar = this.f151584f) == null)) {
                            C89219l.m154716b(lVar, "");
                            eVar.mo72870a(lVar, k, this.f151579a.size());
                        }
                    }
                }
                if (k != m) {
                    k++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.search.middlepage.a$c */
    public static final class C67662c extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ C67659a f151588a;

        static {
            Covode.recordClassIndex(79305);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C67662c(C67659a aVar) {
            this.f151588a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
            if (i == 0) {
                this.f151588a.mo106643a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.search.middlepage.a$b */
    public static final class C67661b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C67659a f151587a;

        static {
            Covode.recordClassIndex(79304);
        }

        C67661b(C67659a aVar) {
            this.f151587a = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f151587a.f151580b.clear();
            int size = this.f151587a.f151579a.size();
            for (int i = 0; i < size; i++) {
                this.f151587a.f151580b.add(false);
            }
            AbstractC42664al.AbstractC42669e eVar = this.f151587a.f151584f;
            if (eVar != null) {
                eVar.mo72869a(this.f151587a.f151583e);
            }
            this.f151587a.mo106643a();
            this.f151587a.f151582d = false;
        }
    }

    /* renamed from: a */
    public final void mo106644a(TrendingData trendingData) {
        AbstractC88979t<Integer> a;
        int i;
        C89219l.m154721d(trendingData, "");
        this.f151579a.clear();
        ArrayList<C67590l> arrayList = trendingData.billboardInfo;
        if (arrayList != null) {
            for (T t : arrayList) {
                ArrayList<AbstractC17641a> arrayList2 = this.f151579a;
                AbstractC42664al.AbstractC42669e eVar = this.f151584f;
                ArrayList<C67590l> arrayList3 = trendingData.billboardInfo;
                if (arrayList3 != null) {
                    i = arrayList3.size();
                } else {
                    i = 0;
                }
                arrayList2.add(new C67665c(t, eVar, i));
                this.f151580b.add(false);
            }
        }
        this.f151581c = trendingData;
        this.f151585h.getState().mo28128a();
        this.f151585h.getState().mo28133a(this.f151579a);
        if (this.f151582d) {
            if (this.f151586i == null) {
                C88960c<Integer> cVar = new C88960c<>();
                this.f151586i = cVar;
                AbstractC88979t<Integer> f = cVar.mo143298f(1500, TimeUnit.MILLISECONDS);
                if (!(f == null || (a = f.mo143261a(C88391a.m153580a(C88392a.f200660a))) == null)) {
                    a.mo143289d(new C67661b(this));
                }
            }
            C88960c<Integer> cVar2 = this.f151586i;
            if (cVar2 != null) {
                cVar2.onNext(0);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67659a(View view, AbstractC42664al.AbstractC42669e eVar) {
        super(view);
        C89219l.m154721d(view, "");
        this.f151584f = eVar;
        View findViewById = view.findViewById(R.id.d54);
        C89219l.m154716b(findViewById, "");
        this.f151585h = (PowerList) findViewById;
        this.f151585h.setItemAnimator(null);
        this.f151585h.mo28083a(TrendingItemCell.class);
    }
}
