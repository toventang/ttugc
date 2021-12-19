package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.app.Application;
import com.bytedance.common.utility.p909d.C13609b;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.p2690cr.p2705h.AbstractC40389c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68107n;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import java.io.File;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.a */
public final class C73352a {

    /* renamed from: a */
    static boolean f164844a = C68107n.m120398a();

    /* renamed from: b */
    static final Keva f164845b;

    /* renamed from: c */
    public static final C73352a f164846c = new C73352a();

    private C73352a() {
    }

    static {
        Covode.recordClassIndex(86089);
        Keva repo = Keva.getRepo("av_effect_storage");
        C89219l.m154716b(repo, "");
        f164845b = repo;
    }

    /* renamed from: a */
    static void m129490a() {
        long j;
        long j2;
        AbstractC40389c c = C63244g.m114602a().mo73279g().mo69470c();
        Application application = C63247i.f143610a;
        C89219l.m154716b(application, "");
        File filesDir = application.getFilesDir();
        C89219l.m154716b(filesDir, "");
        File a = c.mo69474a(filesDir, "effect");
        AbstractC40389c c2 = C63244g.m114602a().mo73279g().mo69470c();
        String str = C70638dj.f158113p;
        C89219l.m154716b(str, "");
        File g = c2.mo69481g(str);
        File g2 = C63244g.m114602a().mo73279g().mo69470c().mo69481g(C63253l.f143623a.mo73308d().mo101651a().mo101658b());
        long j3 = 0;
        if (a.exists()) {
            j = C13609b.m24455c(a.getAbsolutePath());
        } else {
            j = 0;
        }
        if (g.exists()) {
            j2 = C13609b.m24455c(g.getAbsolutePath());
        } else {
            j2 = 0;
        }
        if (g2.exists()) {
            j3 = C13609b.m24455c(g2.getAbsolutePath());
        }
        C80322d.m139251a("tool_performance_effect_storage_space", new C84425b().mo129404a("effect_size", j).mo129404a("filter_size", j2).mo129404a("mv_size", j3).mo129404a("storage_size", j + j2 + j3).f188764a);
    }
}
