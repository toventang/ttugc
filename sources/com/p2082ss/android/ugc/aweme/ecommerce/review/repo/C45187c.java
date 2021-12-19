package com.p2082ss.android.ugc.aweme.ecommerce.review.repo;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.p1445a.p1446a.AbstractC20124a;
import com.p2082ss.android.ugc.aweme.ecommerce.review.repo.ReviewApi;
import com.p2082ss.android.ugc.aweme.ecommerce.review.repo.dto.ListReviewData;
import com.p2082ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p4600h.C89378p;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.review.repo.c */
public final class C45187c extends AbstractC20124a<ReviewApi.C45179c, ListReviewData> {

    /* renamed from: c */
    public final HashMap<ReviewApi.C45179c, ListReviewData> f105329c = new HashMap<>();

    static {
        Covode.recordClassIndex(53622);
    }

    @Override // com.bytedance.jedi.p1445a.p1446a.AbstractC20124a
    /* renamed from: d */
    public final List<C89378p<ReviewApi.C45179c, ListReviewData>> mo33462d() {
        return C89041ag.m154432e(this.f105329c);
    }

    @Override // com.bytedance.jedi.p1445a.p1446a.AbstractC20124a
    /* renamed from: e */
    public final void mo33463e() {
        this.f105329c.clear();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.p1445a.p1446a.AbstractC20124a
    /* renamed from: b */
    public final /* synthetic */ ListReviewData mo33459b(ReviewApi.C45179c cVar) {
        C89219l.m154721d(cVar, "");
        return this.f105329c.get(cVar);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.bytedance.jedi.p1445a.p1446a.AbstractC20124a
    /* renamed from: b */
    public final /* synthetic */ void mo33460b(ReviewApi.C45179c cVar, ListReviewData listReviewData) {
        ListReviewData listReviewData2 = listReviewData;
        C89219l.m154721d(cVar, "");
        if (listReviewData2 != null && listReviewData2.f105330a != null) {
            this.f105329c.put(cVar, listReviewData2);
        }
    }

    /* renamed from: a */
    public final void mo76244a(String str, AbstractC89172b<? super ReviewItemStruct, ReviewItemStruct> bVar) {
        List<ReviewItemStruct> list;
        ReviewItemStruct remove;
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        Collection<ListReviewData> values = this.f105329c.values();
        C89219l.m154716b(values, "");
        for (T t : values) {
            List<ReviewItemStruct> list2 = t.f105330a;
            if (list2 != null) {
                int i = 0;
                Iterator<ReviewItemStruct> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (!C89219l.m154714a((Object) it.next().f105340a.f105353a, (Object) str)) {
                        i++;
                    } else if (i != -1 && (list = t.f105330a) != null && (remove = list.remove(i)) != null) {
                        t.f105330a.add(i, bVar.invoke(remove));
                    }
                }
            }
        }
    }
}
