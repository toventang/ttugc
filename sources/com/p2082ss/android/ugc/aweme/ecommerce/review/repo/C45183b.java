package com.p2082ss.android.ugc.aweme.ecommerce.review.repo;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.ext.list.C20465o;
import com.bytedance.jedi.p1445a.p1447b.C20155b;
import com.bytedance.jedi.p1445a.p1447b.C20157c;
import com.bytedance.jedi.p1445a.p1460j.AbstractC20287b;
import com.bytedance.jedi.p1445a.p1460j.AbstractC20288c;
import com.p2082ss.android.ugc.aweme.ecommerce.review.p2854a.AbstractC45150a;
import com.p2082ss.android.ugc.aweme.ecommerce.review.repo.ReviewApi;
import com.p2082ss.android.ugc.aweme.ecommerce.review.repo.dto.ListReviewData;
import com.p2082ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.b */
public final class C45183b extends AbstractC20287b {

    /* renamed from: e */
    public static final Map<String, C45183b> f105321e = new LinkedHashMap();

    /* renamed from: f */
    public static final C45184a f105322f = new C45184a((byte) 0);

    /* renamed from: b */
    public final C45187c f105323b;

    /* renamed from: c */
    public boolean f105324c = true;

    /* renamed from: d */
    public AbstractC89172b<? super AbstractC45150a.C45152b, C89391z> f105325d;

    /* renamed from: g */
    private final C45180a f105326g;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.b$a */
    public static final class C45184a {
        static {
            Covode.recordClassIndex(53619);
        }

        private C45184a() {
        }

        public /* synthetic */ C45184a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(53618);
    }

    public C45183b() {
        C45180a aVar = new C45180a();
        this.f105326g = aVar;
        C45187c cVar = new C45187c();
        this.f105323b = cVar;
        AbstractC20288c.m38482a(this, aVar, cVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.b$c */
    static final class C45186c extends AbstractC89220m implements AbstractC89172b<ReviewItemStruct, ReviewItemStruct> {

        /* renamed from: a */
        final /* synthetic */ boolean f105328a;

        static {
            Covode.recordClassIndex(53621);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45186c(boolean z) {
            super(1);
            this.f105328a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ ReviewItemStruct invoke(ReviewItemStruct reviewItemStruct) {
            int i;
            ReviewItemStruct reviewItemStruct2 = reviewItemStruct;
            C89219l.m154721d(reviewItemStruct2, "");
            Boolean valueOf = Boolean.valueOf(this.f105328a);
            int i2 = 0;
            if (this.f105328a) {
                Integer num = reviewItemStruct2.f105343d;
                if (num != null) {
                    i2 = num.intValue();
                }
                i = i2 + 1;
            } else {
                Integer num2 = reviewItemStruct2.f105343d;
                if (num2 != null) {
                    i2 = num2.intValue();
                }
                i = i2 - 1;
            }
            return ReviewItemStruct.m87799a(reviewItemStruct2.f105340a, reviewItemStruct2.f105341b, reviewItemStruct2.f105342c, Integer.valueOf(i), valueOf, reviewItemStruct2.f105345f, reviewItemStruct2.f105346g, reviewItemStruct2.f105347h, reviewItemStruct2.f105348i);
        }
    }

    /* renamed from: a */
    public final AbstractC88979t<C89378p<List<AbstractC45150a>, C20465o>> mo76242a(ReviewApi.C45179c cVar) {
        C89219l.m154721d(cVar, "");
        AbstractC88979t<C89378p<List<AbstractC45150a>, C20465o>> d = C20155b.m38133a(this.f105326g, this.f105323b, C20155b.C20156a.f47930a).mo33480a(C20157c.C20158a.f47932a).mo33487c(cVar).mo143292d(new C45185b(this));
        C89219l.m154716b(d, "");
        return d;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.b$b */
    static final class C45185b<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C45183b f105327a;

        static {
            Covode.recordClassIndex(53620);
        }

        C45185b(C45183b bVar) {
            this.f105327a = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            ArrayList arrayList;
            AbstractC89172b<? super AbstractC45150a.C45152b, C89391z> bVar;
            ListReviewData listReviewData = (ListReviewData) obj;
            C89219l.m154721d(listReviewData, "");
            ArrayList arrayList2 = new ArrayList();
            if (!(listReviewData.f105333d == null || (bVar = this.f105327a.f105325d) == null)) {
                bVar.invoke(new AbstractC45150a.C45152b(listReviewData.f105333d));
            }
            if (C89219l.m154714a((Object) listReviewData.f105334e, (Object) true)) {
                this.f105327a.f105324c = false;
            }
            List<ReviewItemStruct> list = listReviewData.f105330a;
            if (list != null) {
                ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new AbstractC45150a.C45151a(it.next()));
                }
                arrayList = arrayList3;
            } else {
                arrayList = C89086z.INSTANCE;
            }
            arrayList2.addAll(arrayList);
            if (!listReviewData.f105331b) {
                Object i = C89070n.m154588i((List) arrayList2);
                if (!(i instanceof AbstractC45150a.C45151a)) {
                    i = null;
                }
                AbstractC45150a.C45151a aVar = (AbstractC45150a.C45151a) i;
                if (aVar != null) {
                    aVar.f105252f = false;
                }
            }
            return new C89378p(arrayList2, new C20465o(listReviewData.f105331b, listReviewData.f105332c));
        }
    }

    /* renamed from: a */
    public final void mo76243a(String str, boolean z) {
        C89219l.m154721d(str, "");
        this.f105323b.mo76244a(str, (AbstractC89172b<? super ReviewItemStruct, ReviewItemStruct>) new C45186c(z));
    }
}
