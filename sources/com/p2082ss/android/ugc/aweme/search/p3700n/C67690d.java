package com.p2082ss.android.ugc.aweme.search.p3700n;

import com.bytedance.covode.number.Covode;
import com.bytedance.track.AbstractC22883b;
import com.bytedance.track.C22886c;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89206ad;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.n.d */
public final class C67690d implements AbstractC22883b<C67690d> {

    /* renamed from: b */
    public static final List<String> f151716b = C89070n.m154522b("general_search", "search_result", "goods_search");

    /* renamed from: c */
    public static final C67691a f151717c = new C67691a((byte) 0);

    /* renamed from: a */
    public final Map<String, String> f151718a;

    /* renamed from: d */
    private final String f151719d;

    /* renamed from: a */
    public static C67690d m119842a(Map<String, String> map) {
        C89219l.m154721d(map, "");
        return new C67690d(map);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C67690d) && C89219l.m154714a(this.f151718a, ((C67690d) obj).f151718a);
        }
        return true;
    }

    public final int hashCode() {
        Map<String, String> map = this.f151718a;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "SearchExtraSource(extraParamMap=" + this.f151718a + ")";
    }

    /* renamed from: com.ss.android.ugc.aweme.search.n.d$a */
    public static final class C67691a {
        static {
            Covode.recordClassIndex(79336);
        }

        private C67691a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.search.n.d$a$a */
        static final class C67692a extends AbstractC89220m implements AbstractC89171a<C67690d> {

            /* renamed from: a */
            final /* synthetic */ C67690d f151720a;

            /* renamed from: b */
            final /* synthetic */ Map f151721b;

            static {
                Covode.recordClassIndex(79337);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C67692a(C67690d dVar, Map map) {
                super(0);
                this.f151720a = dVar;
                this.f151721b = map;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C67690d invoke() {
                Map map = this.f151721b;
                Objects.requireNonNull(map, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.String>");
                return C67690d.m119842a(C89206ad.m154686h(map));
            }
        }

        /* renamed from: a */
        private static C67690d m119846a() {
            return (C67690d) C22886c.m43140a("tracker_key", C67690d.class);
        }

        public /* synthetic */ C67691a(byte b) {
            this();
        }

        /* renamed from: b */
        private static boolean m119849b(String str) {
            return C67690d.f151716b.contains(str);
        }

        /* renamed from: a */
        public static void m119848a(Map<String, String> map) {
            C89219l.m154721d(map, "");
            C67690d a = m119846a();
            if (a != null) {
                a.mo106790a(new C67692a(a, map));
            }
        }

        /* renamed from: a */
        public static Map<String, String> m119847a(String str) {
            Map<String, String> map;
            C89219l.m154721d(str, "");
            if (!m119849b(str)) {
                return new LinkedHashMap();
            }
            C67690d dVar = (C67690d) C22886c.m43140a("tracker_key", C67690d.class);
            if (dVar == null || (map = dVar.f151718a) == null) {
                return new LinkedHashMap();
            }
            return map;
        }
    }

    @Override // com.bytedance.provider.AbstractC21747h
    /* renamed from: a */
    public final String mo35386a() {
        return this.f151719d;
    }

    /* Return type fixed from 'com.bytedance.provider.h' to match base method */
    @Override // com.bytedance.track.AbstractC22883b
    /* renamed from: b */
    public final /* synthetic */ C67690d mo37219b() {
        return m119842a(this.f151718a);
    }

    public /* synthetic */ C67690d() {
        this(new LinkedHashMap());
    }

    static {
        Covode.recordClassIndex(79335);
    }

    private C67690d(Map<String, String> map) {
        C89219l.m154721d(map, "");
        this.f151718a = map;
        String uuid = UUID.randomUUID().toString();
        C89219l.m154716b(uuid, "");
        this.f151719d = uuid;
    }

    /* renamed from: a */
    public final void mo106790a(AbstractC89171a<C67690d> aVar) {
        C89219l.m154721d(aVar, "");
        AbstractC22883b.C22884a.m43138a(this, aVar);
    }
}
