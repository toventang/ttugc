package com.p2082ss.android.ugc.aweme.services.external;

import android.content.Context;
import android.graphics.Typeface;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.external.IAVTypeFaceService */
public interface IAVTypeFaceService {
    static {
        Covode.recordClassIndex(79789);
    }

    Typeface getTypefaceByFontName(String str);

    void prefetch(Context context);
}
