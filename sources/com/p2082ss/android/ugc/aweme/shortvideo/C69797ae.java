package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ae */
public final class C69797ae {

    /* renamed from: a */
    public static final String f155980a;

    /* renamed from: b */
    public static final String f155981b;

    /* renamed from: c */
    public static final String f155982c;

    /* renamed from: d */
    public static final C69797ae f155983d = new C69797ae();

    /* renamed from: e */
    private static final AbstractC89244h f155984e = C89250i.m154773a((AbstractC89171a) C69798a.f155985a);

    /* renamed from: a */
    public static String m123322a() {
        return (String) f155984e.getValue();
    }

    private C69797ae() {
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ae$a */
    static final class C69798a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C69798a f155985a = new C69798a();

        static {
            Covode.recordClassIndex(82204);
        }

        C69798a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String string;
            if (C70629db.m124816b()) {
                string = C63238c.f143574a.getString(R.string.f7l);
            } else {
                string = C63238c.f143574a.getString(R.string.f7m);
            }
            C89219l.m154716b(string, "");
            return string;
        }
    }

    static {
        Covode.recordClassIndex(82203);
        String string = C63247i.f143610a.getString(R.string.f7k);
        C89219l.m154716b(string, "");
        f155980a = string;
        String string2 = C63247i.f143610a.getString(R.string.f7m);
        C89219l.m154716b(string2, "");
        f155981b = string2;
        String string3 = C63247i.f143610a.getString(R.string.f7l);
        C89219l.m154716b(string3, "");
        f155982c = string3;
    }

    /* renamed from: b */
    public static boolean m123323b(String str) {
        C89219l.m154721d(str, "");
        if (C89219l.m154714a((Object) str, (Object) f155981b) || C89219l.m154714a((Object) str, (Object) f155982c)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static int m123321a(String str) {
        C89219l.m154721d(str, "");
        if (C89219l.m154714a((Object) str, (Object) f155980a)) {
            return 10;
        }
        if (C89219l.m154714a((Object) str, (Object) f155982c)) {
            return 14;
        }
        if (C89219l.m154714a((Object) str, (Object) f155981b)) {
            return 11;
        }
        return 8;
    }
}
