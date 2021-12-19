package com.p2082ss.android.ugc.aweme.search.p3695k;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.k.ae */
public final class C67471ae implements AbstractC67567q {

    /* renamed from: a */
    private final ConcurrentHashMap<Integer, C67469ad> f151155a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private int f151156b;

    /* renamed from: c */
    private final ConcurrentHashMap<String, Object> f151157c = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(79108);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q
    /* renamed from: a */
    public final int mo106426a() {
        return this.f151156b;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q
    /* renamed from: b */
    public final Map<String, Object> mo106430b() {
        return this.f151157c;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q
    /* renamed from: c */
    public final C67469ad mo106431c() {
        return mo106429b(this.f151156b);
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q
    /* renamed from: d */
    public final void mo106432d() {
        this.f151155a.clear();
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q
    /* renamed from: a */
    public final void mo106427a(int i) {
        this.f151156b = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q
    /* renamed from: b */
    public final C67469ad mo106429b(int i) {
        C67469ad adVar = this.f151155a.get(Integer.valueOf(i));
        if (adVar == null) {
            return new C67469ad();
        }
        return adVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3695k.AbstractC67567q
    /* renamed from: a */
    public final void mo106428a(int i, C67469ad adVar) {
        C89219l.m154721d(adVar, "");
        this.f151155a.put(Integer.valueOf(i), adVar);
    }
}
