package com.p2082ss.android.ugc.aweme.search.ecom.video;

import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.ecom.video.b */
public final class C67428b {

    /* renamed from: a */
    public static final C67428b f151067a = new C67428b();

    /* renamed from: b */
    private static final AbstractC89244h f151068b = C89250i.m154773a((AbstractC89171a) C67429a.f151069a);

    /* renamed from: a */
    private static Map<Integer, Map<C89378p<String, String>, Boolean>> m119461a() {
        return (Map) f151068b.getValue();
    }

    private C67428b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.search.ecom.video.b$a */
    static final class C67429a extends AbstractC89220m implements AbstractC89171a<Map<Integer, Map<C89378p<? extends String, ? extends String>, Boolean>>> {

        /* renamed from: a */
        public static final C67429a f151069a = new C67429a();

        static {
            Covode.recordClassIndex(79064);
        }

        C67429a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<Integer, Map<C89378p<? extends String, ? extends String>, Boolean>> invoke() {
            return new LinkedHashMap();
        }
    }

    static {
        Covode.recordClassIndex(79063);
    }

    /* renamed from: a */
    public static void m119462a(int i) {
        m119461a().put(Integer.valueOf(i), null);
    }

    /* renamed from: a */
    public static boolean m119463a(Integer num, String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (num != null) {
            int intValue = num.intValue();
            C89378p<String, String> pVar = new C89378p<>(str, str2);
            Map<C89378p<String, String>, Boolean> map = m119461a().get(Integer.valueOf(intValue));
            if (map == null) {
                m119461a().put(Integer.valueOf(intValue), C89041ag.m154427b(C89387v.m154943a(pVar, true)));
                return false;
            }
            boolean z = map.get(pVar);
            if (z == null) {
                map.put(pVar, true);
                z = false;
            }
            return z.booleanValue();
        }
        throw new NullPointerException("Must provide fragment hash when tracking video anchor");
    }
}
