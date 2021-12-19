package com.p2082ss.android.ugc.aweme.ufr;

import com.bytedance.common.utility.collection.C13606e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.friends.AbstractC51499g;
import com.p2082ss.android.ugc.aweme.recommend.EnumC66622f;
import java.util.LinkedHashSet;
import java.util.Set;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ufr.f */
public final class C79548f {

    /* renamed from: a */
    public static final Set<C13606e<AbstractC51499g>> f178522a = new LinkedHashSet();

    /* renamed from: b */
    public static final C79548f f178523b = new C79548f();

    private C79548f() {
    }

    static {
        Covode.recordClassIndex(92752);
    }

    /* renamed from: a */
    public static void m138255a(EnumC66622f fVar) {
        C89219l.m154721d(fVar, "");
        for (C13606e eVar : C89070n.m154595o(f178522a)) {
            AbstractC51499g gVar = (AbstractC51499g) eVar.get();
            if (gVar != null) {
                gVar.mo86981a(fVar);
            }
        }
    }
}
