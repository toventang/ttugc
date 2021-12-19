package com.p2082ss.android.ugc.aweme.discover.adapter;

import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.adapter.viewholder.C41776g;
import com.p2082ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p2082ss.android.ugc.aweme.discover.model.TrendingData;
import com.p2082ss.android.ugc.aweme.discover.model.suggest.TypeWords;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41501ai;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41502aj;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41504al;
import com.p2082ss.android.ugc.aweme.discover.p2760a.p2761a.C41488a;
import com.p2082ss.android.ugc.aweme.discover.p2767c.C41897c;
import com.p2082ss.android.ugc.aweme.discover.p2768d.p2769a.C41910a;
import com.p2082ss.android.ugc.aweme.discover.p2768d.p2769a.C41913b;
import com.p2082ss.android.ugc.aweme.discover.p2768d.p2769a.C41915c;
import com.p2082ss.android.ugc.aweme.discover.p2768d.p2769a.C41916d;
import com.p2082ss.android.ugc.aweme.discover.p2768d.p2769a.C41918e;
import com.p2082ss.android.ugc.aweme.discover.p2768d.p2769a.C41919f;
import com.p2082ss.android.ugc.aweme.discover.p2768d.p2769a.C41920g;
import com.p2082ss.android.ugc.aweme.utils.C80372ec;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.al */
public final class C41636al<SuggestType> extends C41897c<Object> {

    /* renamed from: i */
    public static final C41637a f97112i = new C41637a((byte) 0);

    /* renamed from: a */
    public final C41915c f97113a;

    /* renamed from: b */
    public final C41910a f97114b;

    /* renamed from: c */
    public final C41916d f97115c;

    /* renamed from: d */
    public final C41913b f97116d;

    /* renamed from: e */
    public final C41918e f97117e;

    /* renamed from: f */
    public final C41920g f97118f;

    /* renamed from: g */
    public final C41919f f97119g;

    /* renamed from: h */
    public final Fragment f97120h;

    /* renamed from: k */
    private final AbstractC89244h f97121k = C80372ec.m139350a(new C41642c(this));

    static {
        Covode.recordClassIndex(49549);
    }

    /* renamed from: a */
    public final C41636al<SuggestType>.C41638b mo70847a() {
        return (C41638b) this.f97121k.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.al$a */
    public static final class C41637a {
        static {
            Covode.recordClassIndex(49550);
        }

        private C41637a() {
        }

        public /* synthetic */ C41637a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.al$b */
    public final class C41638b {

        /* renamed from: a */
        public C41910a.EnumC41912b f97122a = C41910a.EnumC41912b.TYPE_NULL;

        /* renamed from: b */
        public C41916d.C41917a f97123b = C41916d.C41917a.f97783a;

        /* renamed from: c */
        public C41913b.C41914a f97124c = C41913b.C41914a.f97780a;

        /* renamed from: d */
        public boolean f97125d;

        /* renamed from: e */
        public boolean f97126e;

        /* renamed from: f */
        public List<TypeWords> f97127f;

        /* renamed from: g */
        public TrendingData f97128g;

        /* renamed from: i */
        private final AbstractC89244h f97130i = C80372ec.m139350a(C41640b.f97133a);

        /* renamed from: j */
        private final AbstractC89244h f97131j = C80372ec.m139350a(C41641c.f97134a);

        static {
            Covode.recordClassIndex(49551);
        }

        /* renamed from: a */
        public final ArrayList<SearchHistory> mo70851a() {
            return (ArrayList) this.f97131j.getValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.al$b$a */
        public static final class RunnableC41639a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C41638b f97132a;

            static {
                Covode.recordClassIndex(49552);
            }

            RunnableC41639a(C41638b bVar) {
                this.f97132a = bVar;
            }

            public final void run() {
                C41636al.this.notifyDataSetChanged();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.al$b$b */
        static final class C41640b extends AbstractC89220m implements AbstractC89171a<ArrayList<SearchHistory>> {

            /* renamed from: a */
            public static final C41640b f97133a = new C41640b();

            static {
                Covode.recordClassIndex(49553);
            }

            C41640b() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ ArrayList<SearchHistory> invoke() {
                return new ArrayList();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.adapter.al$b$c */
        static final class C41641c extends AbstractC89220m implements AbstractC89171a<ArrayList<SearchHistory>> {

            /* renamed from: a */
            public static final C41641c f97134a = new C41641c();

            static {
                Covode.recordClassIndex(49554);
            }

            C41641c() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ ArrayList<SearchHistory> invoke() {
                return new ArrayList();
            }
        }

        /* renamed from: d */
        private final boolean m83594d() {
            if (!this.f97125d || C41501ai.f96818a == 0 || C41501ai.f96818a == 1) {
                return true;
            }
            if (C41501ai.f96818a == 2 || C41501ai.f96818a == 3) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        private final boolean m83593c() {
            if (C41501ai.f96818a == 0) {
                if (mo70851a().size() > 3) {
                    return true;
                }
                return false;
            } else if (C41501ai.f96818a == 3) {
                if (mo70851a().size() > 4) {
                    return true;
                }
                return false;
            } else if ((C41501ai.f96818a == 2 || C41501ai.f96818a == 1) && mo70851a().size() > 5) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: e */
        private final List<SearchHistory> m83595e() {
            if (C41501ai.f96818a == 0) {
                List<SearchHistory> subList = mo70851a().subList(0, 3);
                C89219l.m154716b(subList, "");
                return subList;
            } else if (C41501ai.f96818a == 3) {
                List<SearchHistory> subList2 = mo70851a().subList(0, 4);
                C89219l.m154716b(subList2, "");
                return subList2;
            } else if (C41501ai.f96818a != 2 && C41501ai.f96818a != 1) {
                return new ArrayList();
            } else {
                List<SearchHistory> subList3 = mo70851a().subList(0, 5);
                C89219l.m154716b(subList3, "");
                return subList3;
            }
        }

        /* renamed from: b */
        public final void mo70852b() {
            ArrayList arrayList = new ArrayList();
            boolean d = m83594d();
            if (!mo70851a().isEmpty() && this.f97122a != C41910a.EnumC41912b.TYPE_NULL && d) {
                arrayList.add(this.f97122a);
            }
            boolean c = m83593c();
            if (!this.f97126e && this.f97125d && c) {
                arrayList.add(m83595e());
            } else if (!mo70851a().isEmpty()) {
                arrayList.add(mo70851a());
            }
            if (!this.f97126e && this.f97125d && c) {
                arrayList.add(this.f97123b);
            }
            if (this.f97126e && this.f97125d && c && !d) {
                arrayList.add(this.f97124c);
            }
            C41636al.this.f97749j.clear();
            C41636al.this.f97749j.addAll(arrayList);
            List<TypeWords> list = this.f97127f;
            if (list != null) {
                for (T t : list) {
                    if (t != null) {
                        C41636al.this.f97749j.add(t);
                    }
                }
            }
            TrendingData trendingData = this.f97128g;
            if (trendingData != null) {
                C41636al.this.f97749j.add(trendingData);
            }
            ActivityC0945e activity = C41636al.this.f97120h.getActivity();
            if (activity != null) {
                activity.runOnUiThread(new RunnableC41639a(this));
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C41638b() {
            boolean z;
            if (C41504al.f96824a || C41502aj.f96820a || C41488a.f96795a) {
                z = true;
            } else {
                z = false;
            }
            this.f97125d = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.al$c */
    static final class C41642c extends AbstractC89220m implements AbstractC89171a<C41636al<SuggestType>.C41638b> {

        /* renamed from: a */
        final /* synthetic */ C41636al f97135a;

        static {
            Covode.recordClassIndex(49555);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41642c(C41636al alVar) {
            super(0);
            this.f97135a = alVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C41636al<SuggestType>.C41638b invoke() {
            return new C41638b();
        }
    }

    /* renamed from: b */
    public final void mo70850b() {
        C41636al<SuggestType>.C41638b a = mo70847a();
        a.f97126e = false;
        a.mo70852b();
    }

    /* renamed from: a */
    public final void mo70848a(List<TypeWords> list) {
        C41636al<SuggestType>.C41638b a = mo70847a();
        a.f97127f = list;
        a.mo70852b();
    }

    public C41636al(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        this.f97120h = fragment;
        C41915c cVar = new C41915c();
        this.f97113a = cVar;
        C41910a aVar = new C41910a();
        this.f97114b = aVar;
        C41916d dVar = new C41916d();
        this.f97115c = dVar;
        C41913b bVar = new C41913b();
        this.f97116d = bVar;
        C41918e eVar = new C41918e();
        this.f97117e = eVar;
        C41920g gVar = new C41920g();
        this.f97118f = gVar;
        C41919f fVar = new C41919f();
        this.f97119g = fVar;
        mo71056a(cVar);
        mo71056a(aVar);
        mo71056a(dVar);
        mo71056a(eVar);
        mo71056a(bVar);
        mo71056a(gVar);
        mo71056a(fVar);
    }

    /* renamed from: a */
    public final void mo70849a(List<? extends SearchHistory> list, boolean z) {
        C41910a.EnumC41912b bVar;
        C41910a.EnumC41912b bVar2;
        ArrayList arrayList = new ArrayList();
        if (z) {
            bVar = C41910a.EnumC41912b.TYPE_NONE;
        } else {
            bVar = mo70847a().f97122a;
        }
        C89219l.m154721d(arrayList, "");
        C89219l.m154721d(bVar, "");
        if (C13603b.m24435a((Collection) list)) {
            bVar2 = C41910a.EnumC41912b.TYPE_NONE;
        } else {
            if (list == null) {
                C89219l.m154715b();
            }
            arrayList.addAll(list);
            if (list.size() <= 0) {
                bVar2 = C41910a.EnumC41912b.TYPE_NONE;
            } else {
                bVar2 = C41910a.EnumC41912b.TYPE_CLEAR_ALL;
            }
        }
        C41636al<SuggestType>.C41638b a = mo70847a();
        C89219l.m154721d(arrayList, "");
        a.mo70851a().clear();
        a.mo70851a().addAll(arrayList);
        C41776g.f97452a = !arrayList.isEmpty();
        a.mo70852b();
        C41636al<SuggestType>.C41638b a2 = mo70847a();
        C89219l.m154721d(bVar2, "");
        a2.f97122a = bVar2;
        a2.mo70852b();
    }
}
