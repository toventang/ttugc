package com.p2082ss.ugc.effectplatform.p4454k;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.k.b */
public final class C86822b {

    /* renamed from: a */
    public static final C86822b f195742a = new C86822b();

    private C86822b() {
    }

    static {
        Covode.recordClassIndex(102521);
    }

    /* renamed from: a */
    public static AbstractC86823c m150392a(String str, Object obj) {
        C89219l.m154719c(str, "");
        if (obj instanceof Context) {
            return new C86821a((Context) obj, str);
        }
        throw new IllegalArgumentException("must parse context arguement in Settings!");
    }
}
