package com.p2082ss.android.ugc.aweme.tools.draft.p4109g;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.g.b */
public final class C78377b extends AbstractC78376a<C69905c> {
    static {
        Covode.recordClassIndex(91503);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.p4109g.AbstractC78376a
    /* renamed from: b */
    public final boolean mo122319b(C43223c cVar) {
        C43223c cVar2;
        C69905c cVar3;
        C69905c cVar4;
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(cVar, "");
        ArrayList<C43223c> arrayList = this.f176109b;
        if (!(arrayList == null || (cVar2 = (C43223c) C89070n.m154583g((List) arrayList)) == null || (cVar3 = cVar2.f100906f) == null || (cVar4 = cVar.f100906f) == null || cVar3.musicType != cVar4.musicType)) {
            if (cVar3.isLocalMusic()) {
                if (cVar3.getLocalMusicId() == cVar4.getLocalMusicId()) {
                    return true;
                }
                return false;
            } else if (cVar3.getId() == cVar4.getId()) {
                return true;
            }
        }
        return false;
    }
}
