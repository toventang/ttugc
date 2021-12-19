package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.property.C65444e;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.db */
public final class C70629db {

    /* renamed from: a */
    public static final C70629db f158089a = new C70629db();

    private C70629db() {
    }

    static {
        Covode.recordClassIndex(83095);
    }

    /* renamed from: b */
    public static final boolean m124816b() {
        if (m124815a() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final int m124815a() {
        C70005cr a = C70005cr.m123611a();
        C89219l.m154716b(a, "");
        Boolean bool = a.f156494n;
        C89219l.m154716b(bool, "");
        if (bool.booleanValue()) {
            C84911q.m145921a("record 3min disabled, reason: shoutout");
            return 0;
        } else if (!C65444e.m117163a()) {
            C84911q.m145921a("record 3min disabled, reason: long video not allowed");
            return 0;
        } else {
            int a2 = C16048b.m29633a().mo25412a(true, "studio_long_video_record_type", 0);
            if (a2 == 0) {
                C84911q.m145921a("record 3min disabled, reason: ab config");
            } else {
                C84911q.m145921a("record 3min enabled");
            }
            return a2;
        }
    }
}
