package com.bytedance.helios.sdk.p1099f;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.config.RuleInfo;
import com.bytedance.helios.sdk.p1099f.p1104e.C15472a;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.helios.sdk.f.b */
public final class C15442b {

    /* renamed from: a */
    public static final List<AbstractC15436a> f37690a = C89070n.m154524c(C15472a.f37710d);

    /* renamed from: b */
    public static final C15442b f37691b = new C15442b();

    private C15442b() {
    }

    static {
        Covode.recordClassIndex(17694);
    }

    /* renamed from: a */
    public static final void m28401a(RuleInfo ruleInfo) {
        C89219l.m154719c(ruleInfo, "");
        Iterator<T> it = f37690a.iterator();
        while (it.hasNext()) {
            it.next().mo25180a(ruleInfo);
        }
    }
}
