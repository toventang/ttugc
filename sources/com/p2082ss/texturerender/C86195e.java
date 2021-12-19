package com.p2082ss.texturerender;

import com.bytedance.covode.number.Covode;
import com.p2082ss.texturerender.p4404a.C86174d;
import com.p2082ss.texturerender.p4405b.C86191c;

/* renamed from: com.ss.texturerender.e */
public final class C86195e {
    static {
        Covode.recordClassIndex(101338);
    }

    /* renamed from: a */
    public static AbstractC86206n m148100a(C86174d dVar, int i) {
        if ((i & 4) > 0) {
            return new C86191c(dVar, i);
        }
        return new C86213q(dVar, i);
    }
}
