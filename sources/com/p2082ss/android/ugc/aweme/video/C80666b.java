package com.p2082ss.android.ugc.aweme.video;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.video.b */
public final class C80666b {

    /* renamed from: a */
    private static String f180354a;

    /* renamed from: b */
    private static WeakReference<C81079v> f180355b;

    static {
        Covode.recordClassIndex(93947);
    }

    /* renamed from: a */
    public static void m139901a(C81079v vVar) {
        f180355b = new WeakReference<>(vVar);
    }

    /* renamed from: a */
    public static void m139900a(Video video) {
        if (video != null && video.getPlayAddr() != null) {
            f180354a = video.getPlayAddr().getSourceId();
        }
    }
}
