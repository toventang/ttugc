package com.google.firebase.p2014f;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.firebase.f.b */
public final class C27743b implements AbstractC27749h {

    /* renamed from: a */
    private final String f65191a;

    /* renamed from: b */
    private final C27745d f65192b;

    static {
        Covode.recordClassIndex(33327);
    }

    @Override // com.google.firebase.p2014f.AbstractC27749h
    /* renamed from: a */
    public final String mo46381a() {
        if (this.f65192b.mo46382a().isEmpty()) {
            return this.f65191a;
        }
        return this.f65191a + ' ' + m55464a(this.f65192b.mo46382a());
    }

    /* renamed from: a */
    private static String m55464a(Set<AbstractC27747f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<AbstractC27747f> it = set.iterator();
        while (it.hasNext()) {
            AbstractC27747f next = it.next();
            sb.append(next.mo46376a()).append('/').append(next.mo46377b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    C27743b(Set<AbstractC27747f> set, C27745d dVar) {
        this.f65191a = m55464a(set);
        this.f65192b = dVar;
    }
}
