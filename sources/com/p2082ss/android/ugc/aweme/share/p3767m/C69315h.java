package com.p2082ss.android.ugc.aweme.share.p3767m;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.m.h */
public final class C69315h {

    /* renamed from: a */
    public static final C69315h f154879a = new C69315h();

    /* renamed from: b */
    private static final AbstractC89244h f154880b = C89250i.m154773a((AbstractC89171a) C69316a.f154881a);

    /* renamed from: a */
    private static Map<String, Integer> m122512a() {
        return (Map) f154880b.getValue();
    }

    private C69315h() {
    }

    static {
        Covode.recordClassIndex(81645);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.m.h$a */
    static final class C69316a extends AbstractC89220m implements AbstractC89171a<Map<String, ? extends Integer>> {

        /* renamed from: a */
        public static final C69316a f154881a = new C69316a();

        static {
            Covode.recordClassIndex(81646);
        }

        C69316a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Map<String, ? extends Integer> invoke() {
            return C89041ag.m154421a(C89387v.m154943a("user", 1), C89387v.m154943a("aweme", 2), C89387v.m154943a("challenge", 3), C89387v.m154943a("music", 4), C89387v.m154943a("sticker", 5), C89387v.m154943a("invite_friends", 6), C89387v.m154943a("live", 7), C89387v.m154943a("search", 8), C89387v.m154943a("qna", 9), C89387v.m154943a("group", 10));
        }
    }

    /* renamed from: a */
    public final String mo109599a(AbstractC69581b bVar, String str, String str2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(str2, "");
        if (!m122513a(bVar, str, 0)) {
            return "";
        }
        String a = bVar.mo109548a();
        if (a.hashCode() != -916346253 || !a.equals("twitter")) {
            return str2;
        }
        String a2 = C69303b.m122501a(str2);
        C89219l.m154716b(a2, "");
        return a2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0070, code lost:
        if (r3 != null) goto L_0x0078;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m122513a(com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b r9, java.lang.String r10, int r11) {
        /*
        // Method dump skipped, instructions count: 148
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.share.p3767m.C69315h.m122513a(com.ss.android.ugc.aweme.sharer.b, java.lang.String, int):boolean");
    }
}
