package com.p2082ss.android.ugc.aweme.discover.mixfeed.p2792d;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.d.d */
public final class C42350d {

    /* renamed from: a */
    public static final C42350d f98663a = new C42350d();

    /* renamed from: b */
    private static final AbstractC89244h f98664b = C89250i.m154773a((AbstractC89171a) C42351a.f98665a);

    /* renamed from: a */
    public static Map<Integer, Map<Integer, Integer>> m84714a() {
        return (Map) f98664b.getValue();
    }

    private C42350d() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.d.d$a */
    static final class C42351a extends AbstractC89220m implements AbstractC89171a<Map<Integer, Map<Integer, Integer>>> {

        /* renamed from: a */
        public static final C42351a f98665a = new C42351a();

        static {
            Covode.recordClassIndex(50296);
        }

        C42351a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<Integer, Map<Integer, Integer>> invoke() {
            return new LinkedHashMap();
        }
    }

    static {
        Covode.recordClassIndex(50295);
    }

    /* renamed from: a */
    public static void m84715a(int i) {
        Map<Integer, Integer> map = m84714a().get(Integer.valueOf(i));
        if (map == null) {
            map = null;
        }
        Map<Integer, Integer> map2 = map;
        if (map2 != null) {
            map2.size();
            map2.clear();
        }
    }
}
