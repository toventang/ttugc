package com.p2082ss.android.ugc.playerkit.p4324d;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import java.io.File;

/* renamed from: com.ss.android.ugc.playerkit.d.a */
public final class C84186a {
    static {
        Covode.recordClassIndex(98088);
    }

    /* renamed from: a */
    public static File m144765a(Context context) {
        File b = m144766b(context);
        if (b == null) {
            return m144767c(context);
        }
        return b;
    }

    /* renamed from: b */
    private static File m144766b(Context context) {
        if (C58016d.f132220a != null && C58016d.f132224e) {
            return C58016d.f132220a;
        }
        File externalCacheDir = context.getExternalCacheDir();
        C58016d.f132220a = externalCacheDir;
        return externalCacheDir;
    }

    /* renamed from: c */
    private static File m144767c(Context context) {
        if (C58016d.f132221b != null && C58016d.f132224e) {
            return C58016d.f132221b;
        }
        File cacheDir = context.getCacheDir();
        C58016d.f132221b = cacheDir;
        return cacheDir;
    }
}
