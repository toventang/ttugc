package com.google.firebase.components;

import com.bytedance.covode.number.Covode;
import com.google.firebase.p2012d.AbstractC27738a;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.components.k */
public final /* synthetic */ class C27722k implements AbstractC27738a {

    /* renamed from: a */
    private final Set f65150a;

    static {
        Covode.recordClassIndex(33305);
    }

    C27722k(Set set) {
        this.f65150a = set;
    }

    @Override // com.google.firebase.p2012d.AbstractC27738a
    /* renamed from: a */
    public final Object mo46341a() {
        Set<C27732s> set = this.f65150a;
        HashSet hashSet = new HashSet();
        for (C27732s sVar : set) {
            hashSet.add(sVar.mo46341a());
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
