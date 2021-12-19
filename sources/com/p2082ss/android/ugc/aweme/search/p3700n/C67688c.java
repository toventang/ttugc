package com.p2082ss.android.ugc.aweme.search.p3700n;

import com.bytedance.covode.number.Covode;
import com.bytedance.track.AbstractC22883b;
import com.bytedance.track.C22886c;
import java.util.UUID;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.n.c */
public final class C67688c implements AbstractC22883b<C67688c> {

    /* renamed from: c */
    public static final C67689a f151712c = new C67689a((byte) 0);

    /* renamed from: a */
    public final C67693e f151713a;

    /* renamed from: b */
    public final C67694f f151714b;

    /* renamed from: d */
    private final String f151715d;

    static {
        Covode.recordClassIndex(79333);
    }

    /* renamed from: a */
    public static C67688c m119837a(C67693e eVar, C67694f fVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(fVar, "");
        return new C67688c(eVar, fVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C67688c)) {
            return false;
        }
        C67688c cVar = (C67688c) obj;
        return C89219l.m154714a(this.f151713a, cVar.f151713a) && C89219l.m154714a(this.f151714b, cVar.f151714b);
    }

    public final int hashCode() {
        C67693e eVar = this.f151713a;
        int i = 0;
        int hashCode = (eVar != null ? eVar.hashCode() : 0) * 31;
        C67694f fVar = this.f151714b;
        if (fVar != null) {
            i = fVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "SearchContextSource(immutableData=" + this.f151713a + ", mutableData=" + this.f151714b + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.search.n.c$a */
    public static final class C67689a {
        static {
            Covode.recordClassIndex(79334);
        }

        private C67689a() {
        }

        /* renamed from: a */
        public static C67688c m119840a() {
            return (C67688c) C22886c.m43140a("tracker_key", C67688c.class);
        }

        /* renamed from: b */
        public static C67694f m119841b() {
            C67688c a = m119840a();
            if (a != null) {
                return a.f151714b;
            }
            return null;
        }

        public /* synthetic */ C67689a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.provider.AbstractC21747h
    /* renamed from: a */
    public final String mo35386a() {
        return this.f151715d;
    }

    /* Return type fixed from 'com.bytedance.provider.h' to match base method */
    @Override // com.bytedance.track.AbstractC22883b
    /* renamed from: b */
    public final /* synthetic */ C67688c mo37219b() {
        return m119837a(this.f151713a, this.f151714b);
    }

    public C67688c(C67693e eVar, C67694f fVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(fVar, "");
        this.f151713a = eVar;
        this.f151714b = fVar;
        String uuid = UUID.randomUUID().toString();
        C89219l.m154716b(uuid, "");
        this.f151715d = uuid;
    }
}
