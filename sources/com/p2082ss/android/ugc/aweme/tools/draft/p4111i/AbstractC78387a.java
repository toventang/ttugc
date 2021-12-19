package com.p2082ss.android.ugc.aweme.tools.draft.p4111i;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.tools.draft.p4109g.AbstractC78376a;
import com.p2082ss.android.ugc.aweme.tools.draft.p4109g.C78377b;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.i.a */
public abstract class AbstractC78387a {

    /* renamed from: a */
    private final List<AbstractC78376a<Object>> f176130a = new ArrayList();

    static {
        Covode.recordClassIndex(91513);
    }

    /* renamed from: a */
    public abstract int mo122324a();

    /* renamed from: b */
    public abstract boolean mo122327b(C43223c cVar);

    /* renamed from: b */
    public final List<AbstractC78376a<Object>> mo122326b() {
        m136899c();
        return this.f176130a;
    }

    /* renamed from: c */
    private final void m136899c() {
        List<AbstractC78376a<Object>> list = this.f176130a;
        int size = list.size();
        int i = size - 1;
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 1;
            for (int i4 = i3; i4 < size; i4++) {
                AbstractC78376a<Object> aVar = list.get(i4);
                AbstractC78376a<Object> aVar2 = list.get(i2);
                if (aVar.f176109b != null) {
                    ArrayList<C43223c> arrayList = aVar.f176109b;
                    if (arrayList == null) {
                        C89219l.m154715b();
                    }
                    if (!arrayList.isEmpty()) {
                        ArrayList<C43223c> arrayList2 = aVar.f176109b;
                        if (arrayList2 == null) {
                            C89219l.m154715b();
                        }
                        if (arrayList2.get(0) != null) {
                            ArrayList<C43223c> arrayList3 = aVar.f176109b;
                            if (arrayList3 == null) {
                                C89219l.m154715b();
                            }
                            C43223c cVar = arrayList3.get(0);
                            if (cVar == null) {
                                C89219l.m154715b();
                            }
                            C89219l.m154716b(cVar, "");
                            if (cVar.f100886I != 0) {
                                if (!(aVar2 == null || aVar2.f176109b == null)) {
                                    ArrayList<C43223c> arrayList4 = aVar2.f176109b;
                                    if (arrayList4 == null) {
                                        C89219l.m154715b();
                                    }
                                    if (!arrayList4.isEmpty()) {
                                        ArrayList<C43223c> arrayList5 = aVar2.f176109b;
                                        if (arrayList5 == null) {
                                            C89219l.m154715b();
                                        }
                                        if (arrayList5.get(0) != null) {
                                            ArrayList<C43223c> arrayList6 = aVar2.f176109b;
                                            if (arrayList6 == null) {
                                                C89219l.m154715b();
                                            }
                                            C43223c cVar2 = arrayList6.get(0);
                                            if (cVar2 == null) {
                                                C89219l.m154715b();
                                            }
                                            C89219l.m154716b(cVar2, "");
                                            if (cVar2.f100886I != 0) {
                                                ArrayList<C43223c> arrayList7 = aVar.f176109b;
                                                if (arrayList7 == null) {
                                                    C89219l.m154715b();
                                                }
                                                C43223c cVar3 = arrayList7.get(0);
                                                if (cVar3 == null) {
                                                    C89219l.m154715b();
                                                }
                                                C89219l.m154716b(cVar3, "");
                                                long j = cVar3.f100886I;
                                                ArrayList<C43223c> arrayList8 = aVar2.f176109b;
                                                if (arrayList8 == null) {
                                                    C89219l.m154715b();
                                                }
                                                C43223c cVar4 = arrayList8.get(0);
                                                if (cVar4 == null) {
                                                    C89219l.m154715b();
                                                }
                                                C89219l.m154716b(cVar4, "");
                                                if (j <= cVar4.f100886I) {
                                                }
                                            }
                                        }
                                    }
                                }
                                AbstractC78376a<Object> aVar3 = list.get(i2);
                                list.set(i2, list.get(i4));
                                list.set(i4, aVar3);
                            }
                        }
                    }
                }
            }
            i2 = i3;
        }
    }

    /* renamed from: a */
    public final void mo122325a(C43223c cVar) {
        C89219l.m154721d(cVar, "");
        AbstractC78376a aVar = (AbstractC78376a) C89070n.m154588i((List) this.f176130a);
        if (aVar == null || !aVar.mo122319b(cVar)) {
            C78377b bVar = new C78377b();
            bVar.f176108a = (Element) cVar.f100906f;
            bVar.mo122318a(cVar);
            this.f176130a.add(bVar);
            return;
        }
        aVar.mo122318a(cVar);
    }
}
