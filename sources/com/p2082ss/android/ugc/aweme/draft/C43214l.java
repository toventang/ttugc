package com.p2082ss.android.ugc.aweme.draft;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43225d;
import com.p2082ss.android.ugc.aweme.draft.model.DraftCheckResult;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.draft.l */
public final class C43214l implements AbstractC43204d {

    /* renamed from: a */
    public final C43223c f100706a;

    static {
        Covode.recordClassIndex(51401);
    }

    @Override // com.p2082ss.android.ugc.aweme.draft.AbstractC43204d
    /* renamed from: a */
    public final DraftCheckResult mo73445a() {
        ArrayList arrayList;
        List<EditVideoSegment> i = C43225d.m86339i(this.f100706a);
        if (i != null) {
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) i, 10));
            Iterator<T> it = i.iterator();
            while (it.hasNext()) {
                arrayList2.add(it.next().getVideoPath());
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return C43205e.m86159a(arrayList);
    }

    public C43214l(C43223c cVar) {
        C89219l.m154721d(cVar, "");
        this.f100706a = cVar;
    }
}
