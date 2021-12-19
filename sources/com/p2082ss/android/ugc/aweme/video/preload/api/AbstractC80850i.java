package com.p2082ss.android.ugc.aweme.video.preload.api;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.video.preload.api.i */
public interface AbstractC80850i {
    static {
        Covode.recordClassIndex(94148);
    }

    /* renamed from: a */
    File mo124204a(Context context, EnumC80851a aVar);

    /* renamed from: a */
    boolean mo124205a();

    /* renamed from: com.ss.android.ugc.aweme.video.preload.api.i$a */
    public enum EnumC80851a {
        PREFER_SD_CARD,
        PREFER_EXTERNAL,
        PREFER_PRIVATE;

        static {
            Covode.recordClassIndex(94149);
        }
    }
}
