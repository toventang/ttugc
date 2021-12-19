package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.property.C65468eu;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.di */
public final class C70637di extends C70638dj {

    /* renamed from: a */
    public static final String f158098a = new File(C63247i.f143610a.getFilesDir(), "sticker_1_0/3d/resources").getPath();

    /* renamed from: b */
    public static final String f158099b = (f158101d + "music-effect/");

    /* renamed from: c */
    public static final String f158100c = (f158101d + "face_track.model");

    /* renamed from: a */
    public static long m124840a() {
        long a = C65468eu.m117194a();
        if (a < 1000 || a >= 15000) {
            return 1000;
        }
        return a;
    }

    static {
        Covode.recordClassIndex(83103);
    }
}
