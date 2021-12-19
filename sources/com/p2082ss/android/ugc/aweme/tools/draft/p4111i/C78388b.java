package com.p2082ss.android.ugc.aweme.tools.draft.p4111i;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Calendar;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.i.b */
public final class C78388b extends AbstractC78387a {
    static {
        Covode.recordClassIndex(91514);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.p4111i.AbstractC78387a
    /* renamed from: a */
    public final int mo122324a() {
        return R.string.fn6;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.draft.p4111i.AbstractC78387a
    /* renamed from: b */
    public final boolean mo122327b(C43223c cVar) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(cVar, "");
        Calendar instance = Calendar.getInstance();
        C89219l.m154716b(instance, "");
        instance.setTimeInMillis(System.currentTimeMillis());
        Calendar instance2 = Calendar.getInstance();
        C89219l.m154716b(instance2, "");
        instance2.setTimeInMillis(cVar.f100886I);
        int i = instance.get(6) - instance2.get(6);
        if ((instance.get(1) != instance2.get(1) || i < 30) && instance2.get(1) >= instance.get(1)) {
            return false;
        }
        return true;
    }
}
