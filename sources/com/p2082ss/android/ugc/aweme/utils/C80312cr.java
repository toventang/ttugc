package com.p2082ss.android.ugc.aweme.utils;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import com.bytedance.covode.number.Covode;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.utils.cr */
public final class C80312cr {
    static {
        Covode.recordClassIndex(93580);
    }

    /* renamed from: a */
    public static Uri m139224a(Context context, File file) {
        if (Build.VERSION.SDK_INT >= 24) {
            return FileProvider.getUriForFile(context, context.getPackageName() + ".fileprovider", file);
        }
        return Uri.fromFile(file);
    }
}
