package com.p2082ss.android.ugc.aweme.feed.assem.report;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import java.util.Locale;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.report.b */
public final class C48957b {

    /* renamed from: a */
    private static final AbstractC89244h f112860a = C89250i.m154773a((AbstractC89171a) C48958a.f112861a);

    /* renamed from: a */
    public static final boolean m92140a() {
        return ((Boolean) f112860a.getValue()).booleanValue();
    }

    static {
        Covode.recordClassIndex(57746);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.report.b$a */
    static final class C48958a extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C48958a f112861a = new C48958a();

        static {
            Covode.recordClassIndex(57747);
        }

        C48958a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            String str;
            String a = C58071d.m104907a();
            if (a != null) {
                Objects.requireNonNull(a, "null cannot be cast to non-null type java.lang.String");
                str = a.toUpperCase(Locale.ROOT);
                C89219l.m154716b(str, "");
            } else {
                str = null;
            }
            return Boolean.valueOf(C89219l.m154714a((Object) str, (Object) "ID"));
        }
    }
}
