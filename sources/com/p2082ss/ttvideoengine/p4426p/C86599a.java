package com.p2082ss.ttvideoengine.p4426p;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.p4426p.AbstractC86608b;
import java.util.List;

/* renamed from: com.ss.ttvideoengine.p.a */
public final class C86599a implements AbstractC86608b {

    /* renamed from: a */
    public final List<C86600a> f195123a;

    /* renamed from: b */
    private final String f195124b;

    static {
        Covode.recordClassIndex(101827);
    }

    @Override // com.p2082ss.ttvideoengine.p4426p.AbstractC86608b
    /* renamed from: a */
    public final AbstractC86608b.EnumC86609a mo137865a() {
        return AbstractC86608b.EnumC86609a.DIRECT_URL_SOURCE;
    }

    @Override // com.p2082ss.ttvideoengine.p4426p.AbstractC86608b
    /* renamed from: b */
    public final String mo137866b() {
        return this.f195124b;
    }

    public final String toString() {
        return "DirectUrlSource{vid='" + this.f195124b + '\'' + ", urlItems=" + this.f195123a + '}';
    }

    /* renamed from: com.ss.ttvideoengine.p.a$a */
    public static class C86600a {

        /* renamed from: a */
        public final String f195125a;

        /* renamed from: b */
        public final String f195126b;

        /* renamed from: c */
        public final String f195127c;

        /* renamed from: d */
        public final String f195128d;

        static {
            Covode.recordClassIndex(101828);
        }

        public final String toString() {
            return "UrlItem{url='" + this.f195125a + '\'' + ", cacheKey='" + this.f195126b + '\'' + ", playAuth='" + this.f195127c + '\'' + ", encodeType='" + this.f195128d + '\'' + '}';
        }
    }
}
