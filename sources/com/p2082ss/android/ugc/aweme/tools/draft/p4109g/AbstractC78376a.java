package com.p2082ss.android.ugc.aweme.tools.draft.p4109g;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.g.a */
public abstract class AbstractC78376a<Element> {

    /* renamed from: a */
    public Element f176108a;

    /* renamed from: b */
    public ArrayList<C43223c> f176109b;

    static {
        Covode.recordClassIndex(91502);
    }

    /* renamed from: b */
    public abstract boolean mo122319b(C43223c cVar);

    /* renamed from: a */
    public final void mo122318a(C43223c cVar) {
        if (cVar != null) {
            ArrayList<C43223c> arrayList = this.f176109b;
            if (arrayList == null) {
                ArrayList<C43223c> arrayList2 = new ArrayList<>();
                this.f176109b = arrayList2;
                arrayList2.add(cVar);
                return;
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                long j = cVar.f100886I;
                ArrayList<C43223c> arrayList3 = this.f176109b;
                if (arrayList3 == null) {
                    C89219l.m154715b();
                }
                C43223c cVar2 = arrayList3.get(i);
                if (cVar2 == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(cVar2, "");
                if (j > cVar2.f100886I) {
                    ArrayList<C43223c> arrayList4 = this.f176109b;
                    if (arrayList4 == null) {
                        C89219l.m154715b();
                    }
                    arrayList4.add(i, cVar);
                    return;
                }
            }
        }
    }
}
