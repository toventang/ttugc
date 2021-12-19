package com.p2082ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import java.util.HashSet;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bq */
public final class C38699bq {

    /* renamed from: a */
    public static final C38699bq f91415a = new C38699bq();

    /* renamed from: b */
    private static final String f91416b = "discard_cid_list_key";

    /* renamed from: c */
    private static final AbstractC89244h f91417c = C89250i.m154773a((AbstractC89171a) C38700a.f91420a);

    /* renamed from: d */
    private static boolean f91418d = true;

    /* renamed from: e */
    private static String f91419e;

    private C38699bq() {
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.utils.bq$a */
    static final class C38700a extends AbstractC89220m implements AbstractC89171a<Keva> {

        /* renamed from: a */
        public static final C38700a f91420a = new C38700a();

        static {
            Covode.recordClassIndex(46241);
        }

        C38700a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Keva invoke() {
            return Keva.getRepo("undisplay_ad_keva_name");
        }
    }

    static {
        Covode.recordClassIndex(46240);
    }

    /* renamed from: a */
    public static String m78509a(Set<Long> set) {
        C89219l.m154721d(set, "");
        HashSet<Long> hashSet = new HashSet(set);
        StringBuilder sb = new StringBuilder();
        for (Long l : hashSet) {
            C89219l.m154716b(l, "");
            sb.append(l.longValue());
            sb.append(",");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(C89361p.m154930f(sb));
        }
        f91419e = sb.toString();
        ((Keva) f91417c.getValue()).storeString(f91416b, f91419e);
        return f91419e;
    }
}
