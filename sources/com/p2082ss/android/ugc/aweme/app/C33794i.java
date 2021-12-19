package com.p2082ss.android.ugc.aweme.app;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.newmedia.p2163a.C30122a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.app.i */
public final class C33794i {

    /* renamed from: a */
    public static final C33794i f80037a = new C33794i();

    private C33794i() {
    }

    static {
        Covode.recordClassIndex(40691);
    }

    /* renamed from: a */
    public static final String m69145a() {
        StringBuilder sb = new StringBuilder();
        sb.append("v");
        String f = C17867d.m33085f();
        if (f == null) {
            f = "1.0";
        }
        sb.append(f);
        sb.append(" Build ").append(C17867d.f42595s).append("_");
        sb.append(C30122a.m60926a(C17867d.m33078a()).mo53499a("release_build", ""));
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }
}
