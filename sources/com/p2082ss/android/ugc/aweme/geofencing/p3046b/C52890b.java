package com.p2082ss.android.ugc.aweme.geofencing.p3046b;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.geofencing.p3047c.C52891a;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.geofencing.b.b */
public final class C52890b {

    /* renamed from: a */
    public static final C52890b f121658a = new C52890b();

    private C52890b() {
    }

    static {
        Covode.recordClassIndex(62295);
    }

    /* renamed from: b */
    private static Keva m97737b() {
        Keva repo = Keva.getRepo("geofencing_region_list");
        C89219l.m154716b(repo, "");
        return repo;
    }

    /* renamed from: a */
    public static List<C52891a> m97735a() {
        String string = m97737b().getString("regions", "");
        if (string == null || string.length() == 0) {
            return C89086z.INSTANCE;
        }
        List<C52891a> b = C80342dg.m139302b(string, C52891a[].class);
        C89219l.m154716b(b, "");
        return b;
    }

    /* renamed from: a */
    public static void m97736a(List<C52891a> list) {
        C89219l.m154721d(list, "");
        m97737b().storeString("regions", C80342dg.m139300a().mo46674b(list));
    }
}
