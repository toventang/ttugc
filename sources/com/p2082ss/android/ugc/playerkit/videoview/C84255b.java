package com.p2082ss.android.ugc.playerkit.videoview;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.playerkit.C84180b;
import com.p2082ss.android.ugc.playerkit.model.C84209m;

/* renamed from: com.ss.android.ugc.playerkit.videoview.b */
public final class C84255b {

    /* renamed from: a */
    public static boolean f188437a = true;

    static {
        Covode.recordClassIndex(98170);
    }

    /* renamed from: a */
    public static boolean m144892a(Video video, C84209m.EnumC84214e eVar) {
        if (!f188437a || !C84180b.m144763a(C84288e.m144956a(video.getPlayAddrBytevc1())) || !C84180b.m144762a(eVar)) {
            return false;
        }
        return true;
    }
}
