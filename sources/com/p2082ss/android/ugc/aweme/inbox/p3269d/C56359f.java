package com.p2082ss.android.ugc.aweme.inbox.p3269d;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.d.f */
public final class C56359f {

    /* renamed from: a */
    public static final C56360a f128556a = new C56360a();

    /* renamed from: b */
    public static final C56359f f128557b = new C56359f();

    /* renamed from: c */
    private static final AbstractC89244h f128558c = C89250i.m154773a((AbstractC89171a) C56362c.f128564a);

    /* renamed from: d */
    private static final AbstractC89244h f128559d = C89250i.m154773a((AbstractC89171a) C56363d.f128565a);

    /* renamed from: com.ss.android.ugc.aweme.inbox.d.f$b */
    public static final class C56361b {
        @AbstractC27891c(mo46611a = "key")

        /* renamed from: a */
        public final String f128562a;
        @AbstractC27891c(mo46611a = "value")

        /* renamed from: b */
        public final Float f128563b;

        static {
            Covode.recordClassIndex(66181);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C56361b)) {
                return false;
            }
            C56361b bVar = (C56361b) obj;
            return C89219l.m154714a(this.f128562a, bVar.f128562a) && C89219l.m154714a(this.f128563b, bVar.f128563b);
        }

        public final int hashCode() {
            String str = this.f128562a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Float f = this.f128563b;
            if (f != null) {
                i = f.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            return "RateEntry(key=" + this.f128562a + ", value=" + this.f128563b + ")";
        }
    }

    /* renamed from: a */
    public static C56360a m102343a() {
        return (C56360a) f128558c.getValue();
    }

    /* renamed from: b */
    private static Map<String, Float> m102345b() {
        return (Map) f128559d.getValue();
    }

    private C56359f() {
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.d.f$c */
    static final class C56362c extends AbstractC89220m implements AbstractC89171a<C56360a> {

        /* renamed from: a */
        public static final C56362c f128564a = new C56362c();

        static {
            Covode.recordClassIndex(66182);
        }

        C56362c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C56360a invoke() {
            return m102346a();
        }

        /* renamed from: a */
        private static C56360a m102346a() {
            C56360a aVar;
            try {
                aVar = (C56360a) SettingsManager.m29616a().mo25396a("inbox_event_sample_rate", C56360a.class);
            } catch (Throwable unused) {
                aVar = C56359f.f128556a;
            }
            if (aVar == null) {
                return C56359f.f128556a;
            }
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.d.f$a */
    public static final class C56360a {
        @AbstractC27891c(mo46611a = "enable")

        /* renamed from: a */
        public final boolean f128560a;
        @AbstractC27891c(mo46611a = "rate_map")

        /* renamed from: b */
        public final List<C56361b> f128561b;

        static {
            Covode.recordClassIndex(66180);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C56360a)) {
                return false;
            }
            C56360a aVar = (C56360a) obj;
            return this.f128560a == aVar.f128560a && C89219l.m154714a(this.f128561b, aVar.f128561b);
        }

        public final int hashCode() {
            boolean z = this.f128560a;
            if (z) {
                z = true;
            }
            int i = z ? 1 : 0;
            int i2 = z ? 1 : 0;
            int i3 = z ? 1 : 0;
            int i4 = i * 31;
            List<C56361b> list = this.f128561b;
            return i4 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            return "Config(enable=" + this.f128560a + ", rateMap=" + this.f128561b + ")";
        }

        public /* synthetic */ C56360a() {
            this(new ArrayList());
        }

        private C56360a(List<C56361b> list) {
            this.f128560a = true;
            this.f128561b = list;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.d.f$d */
    static final class C56363d extends AbstractC89220m implements AbstractC89171a<Map<String, Float>> {

        /* renamed from: a */
        public static final C56363d f128565a = new C56363d();

        static {
            Covode.recordClassIndex(66183);
        }

        C56363d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<String, Float> invoke() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            List<C56361b> list = C56359f.m102343a().f128561b;
            if (list != null) {
                for (T t : list) {
                    String str = t.f128562a;
                    if (!(str == null || str.length() == 0 || t.f128563b == null)) {
                        linkedHashMap.put(t.f128562a, t.f128563b);
                    }
                }
            }
            return linkedHashMap;
        }
    }

    static {
        Covode.recordClassIndex(66179);
    }

    /* renamed from: a */
    public static boolean m102344a(String str, float f) {
        if (!m102343a().f128560a || str.length() == 0) {
            return false;
        }
        Float f2 = m102345b().get(str);
        if (f2 == null) {
            f2 = Float.valueOf(f);
        }
        if (((double) f2.floatValue()) >= 1.0d || Math.random() < ((double) f2.floatValue())) {
            return true;
        }
        return false;
    }
}
