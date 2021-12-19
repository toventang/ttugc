package com.p2082ss.android.ugc.aweme.discover.p2760a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import java.util.Locale;
import java.util.Set;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89047am;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.a.k */
public final class C41535k {

    /* renamed from: a */
    public static final C41534j f96878a = new C41534j((byte) 0);

    /* renamed from: b */
    public static final C41535k f96879b = new C41535k();

    /* renamed from: c */
    private static final Set<String> f96880c = C89047am.m154438a((Object[]) new String[]{"NP", "AE", "MY", "PH", "TR", "KH", "TH", "SA", "CA"});

    /* renamed from: d */
    private static final AbstractC89244h f96881d = C89250i.m154773a((AbstractC89171a) C41536a.f96882a);

    /* renamed from: b */
    public static C41534j m83472b() {
        return (C41534j) f96881d.getValue();
    }

    private C41535k() {
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.a.k$a */
    static final class C41536a extends AbstractC89220m implements AbstractC89171a<C41534j> {

        /* renamed from: a */
        public static final C41536a f96882a = new C41536a();

        static {
            Covode.recordClassIndex(49443);
        }

        C41536a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C41534j invoke() {
            return C16048b.m29633a().mo25416a(true, "search_icon_on_feed", C41534j.class, C41535k.f96878a);
        }
    }

    static {
        Covode.recordClassIndex(49442);
    }

    /* renamed from: a */
    public static boolean m83471a() {
        Integer num;
        String a = C58071d.m104907a();
        if (a != null) {
            Set<String> set = f96880c;
            String upperCase = a.toUpperCase(Locale.ROOT);
            C89219l.m154716b(upperCase, "");
            if (!set.contains(upperCase)) {
                return true;
            }
        }
        C41534j b = m83472b();
        if (b == null || (num = b.f96875a) == null || num.intValue() != 1) {
            return false;
        }
        return true;
    }
}
