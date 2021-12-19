package com.p2082ss.android.ugc.aweme.common;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.model.AbstractC60142d;
import com.p2082ss.android.ugc.aweme.model.C60152l;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.common.x */
public final class C39219x {

    /* renamed from: a */
    public HashMap<String, Integer> f92638a = new HashMap<>();

    /* renamed from: b */
    public final AbstractC60142d f92639b;

    static {
        Covode.recordClassIndex(46852);
    }

    /* renamed from: a */
    public final void mo68102a() {
        for (String str : this.f92638a.keySet()) {
            if (this.f92639b.mo97820f().containsKey(str)) {
                C60152l lVar = this.f92639b.mo97820f().get(str);
                if (lVar == null) {
                    C89219l.m154715b();
                }
                C60152l lVar2 = lVar;
                Integer num = this.f92638a.get(str);
                if (num == null) {
                    C89219l.m154715b();
                }
                lVar2.f137115a = num.intValue();
            }
        }
    }

    public C39219x(AbstractC60142d dVar) {
        C89219l.m154721d(dVar, "");
        this.f92639b = dVar;
    }
}
