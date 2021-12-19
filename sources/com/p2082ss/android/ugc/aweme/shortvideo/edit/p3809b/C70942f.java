package com.p2082ss.android.ugc.aweme.shortvideo.edit.p3809b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.DownloadableModelSupportResourceFinder;
import com.p2082ss.android.ugc.effectmanager.knadapt.UseKNPlatform;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.ugc.effectplatform.p4453j.C86803a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.b.f */
public final class C70942f {

    /* renamed from: a */
    public static final C70942f f158847a = new C70942f();

    private C70942f() {
    }

    static {
        Covode.recordClassIndex(83436);
    }

    /* renamed from: a */
    public static boolean m125238a() {
        boolean z;
        if (m125239b().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C84911q.m145922a("hdr_lens", "hdr model path empty");
            return false;
        } else if (!C89361p.m154874b(m125239b(), "asset://", false)) {
            return C70943g.m125240a();
        } else {
            C84911q.m145922a("hdr_lens", "hdr model not found");
            return false;
        }
    }

    /* renamed from: b */
    public static String m125239b() {
        String str;
        try {
            if (UseKNPlatform.enableKNPlatform) {
                C86803a a = C86803a.C86804a.m150365a();
                C89219l.m154719c("lens_hdr", "");
                str = a.mo140039a(0, "lens_hdr");
                if (str == null) {
                    str = "";
                }
            } else {
                str = DownloadableModelSupportResourceFinder.findResourceUri(null, "lens_hdr");
            }
            C84911q.m145922a("hdr_lens", "hdr model raw path: ".concat(String.valueOf(str)));
            C89219l.m154716b(str, "");
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
