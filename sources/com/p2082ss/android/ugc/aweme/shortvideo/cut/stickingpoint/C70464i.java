package com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24098m;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.i */
public final class C70464i {

    /* renamed from: a */
    public static final C70464i f157444a = new C70464i();

    private C70464i() {
    }

    static {
        Covode.recordClassIndex(82907);
    }

    /* renamed from: a */
    public static void m124295a(boolean z, Exception exc) {
        String c;
        int i = !z ? 1 : 0;
        C69840ar arVar = new C69840ar();
        if (exc == null) {
            c = "";
        } else {
            c = C24098m.m45633c(exc);
        }
        C40982q.m82520a("stickpoint_musiclist", i, arVar.mo110189a("exception", c).mo110191a());
    }

    /* renamed from: a */
    public static void m124294a(boolean z, C69905c cVar, Exception exc) {
        String path;
        String str;
        int i = !z ? 1 : 0;
        C69840ar arVar = new C69840ar();
        String str2 = "";
        if (cVar == null) {
            path = str2;
        } else {
            path = cVar.getPath();
        }
        C69840ar a = arVar.mo110189a("url", path);
        if (cVar == null || (str = cVar.getMusicId()) == null) {
            str = str2;
        }
        C69840ar a2 = a.mo110189a("music_id", str);
        if (exc != null) {
            str2 = C24098m.m45633c(exc);
        }
        C40982q.m82520a("stickpoint_download_music", i, a2.mo110189a("exception", str2).mo110191a());
    }

    /* renamed from: a */
    public static void m124297a(boolean z, boolean z2, long j) {
        C40982q.m82520a("stickpoint_smart", !z ? 1 : 0, new C69840ar().mo110188a("cast_time", Long.valueOf(j / 1000)).mo110187a("cancel", Integer.valueOf(z2 ? 1 : 0)).mo110191a());
    }

    /* renamed from: a */
    public static void m124296a(boolean z, String str, String str2, Exception exc) {
        String c;
        int i = !z ? 1 : 0;
        C69840ar a = new C69840ar().mo110189a("url", str).mo110189a("alg_type", str2);
        if (exc == null) {
            c = "";
        } else {
            c = C24098m.m45633c(exc);
        }
        C40982q.m82520a("stickpoint_download_alg", i, a.mo110189a("exception", c).mo110191a());
    }
}
